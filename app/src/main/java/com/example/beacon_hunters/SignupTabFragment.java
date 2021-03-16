package com.example.beacon_hunters;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SignupTabFragment extends Fragment {
//    EditText email,pass,mobile,address;
//    Button signup;
//    float v =0;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tag_fragment,container,false);

//        email = root.findViewById(R.id.email);
//        mobile = root.findViewById(R.id.mobile);
//        address = root.findViewById(R.id.add);
//        pass = root.findViewById(R.id.pass);
//        signup = root.findViewById(R.id.button);
//
//        email.setTranslationX(800);
//        mobile.setTranslationX(800);
//        address.setTranslationX(800);
//        pass.setTranslationX(800);
//        signup.setTranslationX(800);


//        email.setAlpha(v);
//        mobile.setAlpha(v);
//        address.setAlpha(v);
//        pass.setAlpha(v);
//        signup.setAlpha(v);

//        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
//        mobile.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
//        address.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
//        pass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
//        signup.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
//

        return root;
    }
}
