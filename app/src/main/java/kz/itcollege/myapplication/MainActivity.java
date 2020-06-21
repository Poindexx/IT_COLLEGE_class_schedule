package kz.itcollege.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.andrognito.flashbar.Flashbar;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.rengwuxian.materialedittext.MaterialEditText;

import java.util.Locale;

import kz.itcollege.myapplication.Modls.User;

public class MainActivity extends AppCompatActivity implements GoogleApiClient.OnConnectionFailedListener {
    
    private FirebaseAuth mAuth;
    static final int GOOGLE_SING = 1;
    Button btn_login_google;
    GoogleSignInClient mGoogleSignInClient;
    TextView btnRegister;
    FirebaseAuth auth;
    FirebaseDatabase db;
    DatabaseReference users;
    RelativeLayout root;
    View view;
    Button yazik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadLocale();
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        btnRegister = findViewById(R.id.btnRegister);
        root = findViewById(R.id.root_element);
        auth = FirebaseAuth.getInstance();
        db = FirebaseDatabase.getInstance();
        users = db.getReference("Users");
        view = findViewById(R.id.btnSingIn);

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);


        yazik = findViewById(R.id.zyaik);
        yazik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showChangeLanguageDialog();
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRegisterWindow();
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final progressButton progressButton = new progressButton(MainActivity.this,view);
                progressButton.buttonActivated();
                showSingInWindow();
            }
        });

    }

    private void updateUI(FirebaseUser user) {
        if (user != null) {

        } else {

        }
    }

    void Logout(){
        FirebaseAuth.getInstance().signOut();
        mGoogleSignInClient.signOut()
                .addOnCompleteListener(this,
                        task -> {
                            updateUI(null);
                            Intent intent = new Intent(this,MainActivity.class);
                            startActivity(intent);
                        });
    }



    public void showChangeLanguageDialog() {
        final String[] listItemss = {"Руский", "Қазақша"};
        AlertDialog.Builder mBulder = new AlertDialog.Builder(this);
        mBulder.setTitle(R.string.izm_yazik);
        mBulder.setSingleChoiceItems(listItemss, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0){
                    setLocale("en");
                    Intent intent = getIntent(); finish(); startActivity(intent);
                }
                else if (i == 1){
                    setLocale("kk");
                    Intent intent = getIntent(); finish(); startActivity(intent);
                }
                dialogInterface.dismiss();
            }
        });
        AlertDialog mDialog = mBulder.create();

        mDialog.show();
    }

    @SuppressLint("ResourceAsColor")
    private void showSingInWindow(){
        AlertDialog.Builder dialig = new AlertDialog.Builder(MainActivity.this,R.style.MyDialog);
        dialig.setTitle(R.string.log);
        dialig.setMessage(R.string.vvedite);

        LayoutInflater inflater = LayoutInflater.from(this);
        final View sign_in_window = inflater.inflate(R.layout.sign_in_window, null);
        dialig.setView(sign_in_window);
        final MaterialEditText email = sign_in_window.findViewById(R.id.emailField1);
        final MaterialEditText pass = sign_in_window.findViewById(R.id.passField);
        final CheckBox remember = sign_in_window.findViewById(R.id.checkField);
        final CheckBox pokazat = sign_in_window.findViewById(R.id.checkBox);
        final User user = new User();
        pokazat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    pass.setTransformationMethod(null);

                }
                else {
                    pass.setTransformationMethod(new PasswordTransformationMethod());
                }

                pass.setSelection(pass.length());
            }
        });

        SharedPreferences preferences = getSharedPreferences("checkbox", MODE_PRIVATE);
        String checkbox = preferences.getString("remember","");
        if (checkbox.equals("true")){
            final progressButton progressButton = new progressButton(MainActivity.this,view);
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    FirebaseUser user1 = auth.getCurrentUser();
                    assert user1 != null;
                    if (user1.isEmailVerified()) {
                        progressButton.buttonFinished();
                        Intent intent = new Intent(MainActivity.this, MapActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        new Flashbar.Builder(MainActivity.this)
                                .gravity(Flashbar.Gravity.TOP)
                                .title(R.string.error)
                                .message(R.string.proverte_po4)
                                .enableSwipeToDismiss()
                                .dismissOnTapOutside()
                                .backgroundDrawable(R.drawable.gradient)
                                .show();
                        progressButton.buttonNoActiv();
                    }
                }
            }, 1);
        }else if (checkbox.equals("false")){

        }


        remember.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()){

                    SharedPreferences preferences = getSharedPreferences("checkbox" , MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("remember" , "true");
                    editor.apply();
                    Toast.makeText(MainActivity.this, R.string.zopomnil, Toast.LENGTH_SHORT).show();
                    final progressButton progressButton = new progressButton(MainActivity.this,view);
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            progressButton.buttonFinished();
                        }
                    }, 1);

                }else if (!compoundButton.isChecked()){
                    final progressButton progressButton = new progressButton(MainActivity.this,view);
                    SharedPreferences preferences = getSharedPreferences("checkbox" , MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("remember" , "false");
                    editor.apply();
                    Toast.makeText(MainActivity.this, R.string.nezopomnil, Toast.LENGTH_SHORT).show();
                    progressButton.buttonFinished();
                }
            }
        });

        dialig.setNegativeButton(R.string.otmen, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                dialogInterface.dismiss();
                final progressButton progressButton = new progressButton(MainActivity.this,view);
                progressButton.buttonNoActiv();
            }
        });
        dialig.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                final progressButton progressButton = new progressButton(MainActivity.this,view);
                progressButton.buttonNoActiv();
            }
        });
        dialig.setNeutralButton(R.string.zabili_par, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                showRestartWindow();
                final progressButton progressButton = new progressButton(MainActivity.this,view);
                progressButton.buttonNoActiv();
            }
        });

        dialig.setPositiveButton(R.string.log, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                if (TextUtils.isEmpty(email.getText().toString())){
                    Snackbar.make(root, R.string.o4_po4ta, Snackbar.LENGTH_LONG).show();
                    final progressButton progressButton = new progressButton(MainActivity.this,view);
                    progressButton.buttonNoActiv();
                    return;
                }

                if (pass.getText().toString().length()<5){
                    Snackbar.make(root, R.string.o4_parol, Snackbar.LENGTH_LONG).show();
                    final progressButton progressButton = new progressButton(MainActivity.this,view);
                    progressButton.buttonNoActiv();
                    return;
                }
                auth.signInWithEmailAndPassword(email.getText().toString(), pass.getText().toString())
                .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        FirebaseUser user1 = auth.getCurrentUser();
                        assert user1 != null;
                        if (user1.isEmailVerified()) {
                            final User user = new User();
                            user.setEmail(email.getText().toString());
                            startActivity(new Intent(MainActivity.this, MapActivity.class));
                            finish();
                            final progressButton progressButton = new progressButton(MainActivity.this,view);
                            progressButton.buttonFinished();
                        }
                        else {
                            new Flashbar.Builder(MainActivity.this)
                                    .gravity(Flashbar.Gravity.TOP)
                                    .title(R.string.error)
                                    .message(R.string.proverte_po4)
                                    .enableSwipeToDismiss()
                                    .dismissOnTapOutside()
                                    .backgroundDrawable(R.drawable.gradient)
                                    .show();
                            final progressButton progressButton = new progressButton(MainActivity.this,view);
                            progressButton.buttonNoActiv();
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Snackbar.make(root,R.string.o4ibka+ e.getMessage(),Snackbar.LENGTH_LONG).show();
                        final progressButton progressButton = new progressButton(MainActivity.this,view);
                        progressButton.buttonNoActiv();
                    }
                });
            }
        });

        dialig.show();


    }
//a

    private void showRestartWindow(){
        AlertDialog.Builder dialig = new AlertDialog.Builder(MainActivity.this,R.style.MyDialog1);
        dialig.setTitle(R.string.zabili_par);
        dialig.setMessage(R.string.vvedite_dan);

        LayoutInflater inflater = LayoutInflater.from(this);
        final View sign_in_window = inflater.inflate(R.layout.restart_window, null);
        dialig.setView(sign_in_window);

        final MaterialEditText email = sign_in_window.findViewById(R.id.emailField1);
        final User user = new User();


        dialig.setNegativeButton(R.string.otmen, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                dialogInterface.dismiss();
                final progressButton progressButton = new progressButton(MainActivity.this,view);
                progressButton.buttonNoActiv();
            }
        });

        dialig.setPositiveButton(R.string.vost, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                if (TextUtils.isEmpty(email.getText().toString())){
                    Snackbar.make(root, R.string.o4_po4ta, Snackbar.LENGTH_LONG).show();
                    return;
                }



                auth.sendPasswordResetEmail(email.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()){
                            new Flashbar.Builder(MainActivity.this)
                                    .gravity(Flashbar.Gravity.TOP)
                                    .title(R.string.success)
                                    .message(R.string.pr_re_pass)
                                    .enableSwipeToDismiss()
                                    .dismissOnTapOutside()
                                    .backgroundDrawable(R.drawable.gradient)
                                    .show();
                        }else {
                                    new Flashbar.Builder(MainActivity.this)
                                            .gravity(Flashbar.Gravity.TOP)
                                            .title(R.string.error)
                                            .message(R.string.pr_re_pass)
                                            .enableSwipeToDismiss()
                                            .dismissOnTapOutside()
                                            .backgroundDrawable(R.drawable.gradient)
                                            .show();
                        }
                    }
                });
            }
        });

        dialig.show();


    }
    //a
    private void showRegisterWindow() {
        AlertDialog.Builder dialig = new AlertDialog.Builder(MainActivity.this,R.style.MyDialog2);
        dialig.setTitle(R.string.reg);
        dialig.setMessage(R.string.zateg_d);

        LayoutInflater inflater = LayoutInflater.from(this);
        View register_window = inflater.inflate(R.layout.register_window, null);
        dialig.setView(register_window);

        final MaterialEditText email = register_window.findViewById(R.id.emailField1);
        final MaterialEditText pass = register_window.findViewById(R.id.passField);
        final MaterialEditText name = register_window.findViewById(R.id.nameField);
        final MaterialEditText phone = register_window.findViewById(R.id.phoneField);
        final CheckBox pokazat1 = register_window.findViewById(R.id.checkBox2);

        pokazat1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    pass.setTransformationMethod(null);

                }
                else {
                    pass.setTransformationMethod(new PasswordTransformationMethod());
                }

                pass.setSelection(pass.length());
            }
        });


        dialig.setNegativeButton(R.string.otmen, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                dialogInterface.dismiss();
            }
        });
        dialig.setNeutralButton(R.string.log, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                showSingInWindow();
            }
        });

        dialig.setPositiveButton(R.string.dobavit, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                if (TextUtils.isEmpty(email.getText().toString())){
                    Snackbar.make(root, R.string.o4_po4ta, Snackbar.LENGTH_LONG).show();
                    return;
                }

                if (TextUtils.isEmpty(name.getText().toString())){
                    Snackbar.make(root, R.string.o4_imya, Snackbar.LENGTH_LONG).show();
                    return;
                }

                if (TextUtils.isEmpty(phone.getText().toString())){
                    Snackbar.make(root, R.string.o4_tel, Snackbar.LENGTH_LONG).show();
                    return;
                }

                if (pass.getText().toString().length()<5){
                    Snackbar.make(root, R.string.o4_parol, Snackbar.LENGTH_LONG).show();
                    return;
                }

                //рег поль
                auth.createUserWithEmailAndPassword(email.getText().toString(), pass.getText().toString())
                .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        final User user = new User();
                        user.setEmail(email.getText().toString());
                        user.setName(name.getText().toString());
                        user.setPass(pass.getText().toString());
                        user.setPhone(phone.getText().toString());


                        users.child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                .setValue(user)
                                .addOnSuccessListener(new OnSuccessListener<Void>() {
                                    @Override
                                    public void onSuccess(Void aVoid) {
                                        sendEmailVer();
                                        Snackbar.make(root,R.string.pol_dobavlen, Snackbar.LENGTH_LONG).show();
                                    }
                                });
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Snackbar.make(root,R.string.o4ibka + e.getMessage(),Snackbar.LENGTH_LONG).show();
                    }
                });
            }
        });

        dialig.show();

    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }

    public void setLocale(String lang) {
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        SharedPreferences.Editor editor = getSharedPreferences("Settings", MODE_PRIVATE).edit();
        editor.putString("My_Lang", lang);
        editor.apply();
    }
    public  void loadLocale(){
        SharedPreferences  prefs = getSharedPreferences("Settings", Activity.MODE_PRIVATE);
        String language = prefs.getString("My_Lang", "");
        setLocale(language);
    }

    private void sendEmailVer(){
        FirebaseUser user = auth.getCurrentUser();
        assert user != null;
        user.sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){
                    new Flashbar.Builder(MainActivity.this)
                            .gravity(Flashbar.Gravity.TOP)
                            .title(R.string.success)
                            .message(R.string.proverte_po4)
                            .enableSwipeToDismiss()
                            .dismissOnTapOutside()
                            .backgroundDrawable(R.drawable.gradient)
                            .show();
                }
                else {
                    new Flashbar.Builder(MainActivity.this)
                            .gravity(Flashbar.Gravity.TOP)
                            .title(R.string.error)
                            .message(R.string.proverte_prav)
                            .enableSwipeToDismiss()
                            .dismissOnTapOutside()
                            .backgroundDrawable(R.drawable.gradient)
                            .show();
                }
            }
        });
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        
    }
}
