package com.example.dailyquotes.Fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.dailyquotes.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class FavouriteFragment extends Fragment {

    EditText emailET, passwordET;
    Button Submit;
    private FirebaseAuth mAuth;
    private static final String TAG = "testttttttt";
    
    public FavouriteFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favourite, container, false);
        initUI(view);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signin(emailET.getText().toString().trim(),passwordET.getText().toString().trim());
            }
        });

        return view;
    }

    private void initUI(View view) {
        emailET = view.findViewById(R.id.emailTV);
        passwordET = view.findViewById(R.id.passTV);
        Submit = view.findViewById(R.id.signBT);
        mAuth = FirebaseAuth.getInstance();
    }

    public void signin(String email, String password) {
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    FirebaseUser user = mAuth.getCurrentUser();
                    Log.i(TAG, "onComplete: "+user.getEmail());
                }
                else{
                    Log.i(TAG, "onComplete: Failure");
                }
            }
        });
    }
}
