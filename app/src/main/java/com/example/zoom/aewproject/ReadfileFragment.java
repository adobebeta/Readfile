package com.example.zoom.aewproject;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class ReadfileFragment extends Fragment {
    TextView textField;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_esud,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button eieiBtn = (Button)getView().findViewById(R.id.readBtn);
        textField = (TextView)getView().findViewById(R.id.text);
        eieiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "";
                try {
                    InputStream is = getContext().getAssets().open("contact.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    text = new String(buffer);
                }catch (IOException ex){
                    ex.printStackTrace();
                }
                initSplitTextToArray(text);
//                textField.setText(text);
            }

        });
    }

    void initSplitTextToArray(String text){
        ArrayList<ArrayList<String>> myArray = new ArrayList<ArrayList<String>>();
        ArrayList<String> stringArray = new ArrayList<String>();
        String[] splitArray = text.split(" ");
        for (int i = 0; i < splitArray.length; i++) {

            stringArray.add(splitArray[i]);
        }
        myArray.add(stringArray);

        // printing all values
        String paragraph = "";
        for (int i = 0; i < myArray.size(); i++) { //รายชื่อ
            for (int j = 0; j < myArray.get(i).size(); j++) { //ข้อมูลของแต่ละคน

//                System.out.println("values of index " + i + " are :"
//                        + myArray.get(i).get(j));
                paragraph = paragraph +" "+ (myArray.get(i).get(j)).toString() ;

            }
        }
        textField.setText(paragraph);
    }
}
