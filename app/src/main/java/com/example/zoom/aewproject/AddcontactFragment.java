package com.example.zoom.aewproject;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStreamWriter;


//หน้านี้ใช้งานไม่ได้ค่าา อ่านได้แต่เขียนไม่ได้จ๊ะ
public class AddcontactFragment extends Fragment {
    Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_addcontact,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        EditText name = getView().findViewById(R.id.addContact_name);
        EditText lastname = getView().findViewById(R.id.addContact_lastname);
        EditText age = getView().findViewById(R.id.addContact_age);
        Button okBtn = getView().findViewById(R.id.addContact_Btn);
        String _name = name.getText().toString();
        String _lastname = lastname.getText().toString();
        String _age = age.getText().toString();

        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                writeToFile("macca eiei 10",context);

            }
        });
    }

//    private void writeToFile(String data,Context context) {
//        try {
//            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput("config.txt", Context.MODE_PRIVATE));
//            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.getAssets().open("config.txt", Context.MODE_PRIVATE));
//            OutputStreamWriter outputStreamWriter = new OutputStreamWriter() getContext().getAssets().open("contact.txt");
//            outputStreamWriter.write(data);
//            outputStreamWriter.close();
//            Log.e("AddContact","success");
//
//        } catch (FileNotFoundException e) {
//            Log.e("login activity", "File not found: " + e.toString());
//        } catch (IOException e) {
//            Log.e("Exception", "File write failed: " + e.toString());
//            Log.d("AddContact","Failed");
//        }
//    }
}
