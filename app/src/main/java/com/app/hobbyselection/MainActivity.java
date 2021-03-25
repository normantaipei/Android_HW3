package com.app.hobbyselection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox mChkBoxMusic, mChkBoxSing, mChkBoxDance,
            mChkBoxTravel, mChkBoxReading, mChkBoxWriting,
            mChkBoxClimbing, mChkBoxSwim, mChkBoxExercise,
            mChkBoxFitness, mChkBoxPhoto, mChkBoxFood,
            mChkBoxPainting;
    private Button mBtnOK;
    private TextView mTxtHobby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 從介面佈局檔取得介面元件


        mChkBoxSing=findViewById(R.id.chkBoxSing);
        mChkBoxDance=findViewById(R.id.chkBoxDance);
        mChkBoxTravel=findViewById(R.id.chkBoxTravel);
        mChkBoxReading=findViewById(R.id.chkBoxReading);
        mChkBoxWriting=findViewById(R.id.chkBoxWriting);
        mChkBoxClimbing=findViewById(R.id.chkBoxClimbing);
        mChkBoxSwim=findViewById(R.id.chkBoxSwim);
        mChkBoxExercise=findViewById(R.id.chkBoxExercise);
        mChkBoxFitness = findViewById(R.id.chkBoxFitness);
        mChkBoxPhoto = findViewById(R.id.chkBoxPhoto);
        mChkBoxFood = findViewById(R.id.chkBoxFood);
        mChkBoxPainting = findViewById(R.id.chkBoxPainting);




        //mChkBoxPhoto = findViewById(R.id.chkBoxPhoto);
        //mBtnOK = findViewById(R.id.btnOk);
        mTxtHobby = findViewById(R.id.txtHobby);

        // 設定Button的事件listener

       // mBtnOK.setOnClickListener(btnOkOnClick);
        //onCheckboxClicked(mChkBoxSing);
       // mChkBoxSing.setOnCheckedChangeListener(checkBoxOnClick);
        mChkBoxSing.setOnCheckedChangeListener(checkBoxOnClick);
        mChkBoxDance.setOnCheckedChangeListener(checkBoxOnClick);
        mChkBoxTravel.setOnCheckedChangeListener(checkBoxOnClick);
        mChkBoxReading.setOnCheckedChangeListener(checkBoxOnClick);
        mChkBoxWriting.setOnCheckedChangeListener(checkBoxOnClick);
        mChkBoxClimbing.setOnCheckedChangeListener(checkBoxOnClick);
        mChkBoxSwim.setOnCheckedChangeListener(checkBoxOnClick);
        mChkBoxExercise.setOnCheckedChangeListener(checkBoxOnClick);
        mChkBoxFitness.setOnCheckedChangeListener(checkBoxOnClick);
        mChkBoxPhoto.setOnCheckedChangeListener(checkBoxOnClick);
        mChkBoxFood.setOnCheckedChangeListener(checkBoxOnClick);
        mChkBoxPainting.setOnCheckedChangeListener(checkBoxOnClick);
       // mChkBoxSing.
    }
    private CompoundButton.OnCheckedChangeListener checkBoxOnClick = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            String s = getString(R.string.your_hobby);
            CheckBox chk;

            int[] ids={R.id.chkBoxMusic ,R.id.chkBoxSing ,R.id.chkBoxDance ,R.id.chkBoxTravel ,R.id.chkBoxReading ,R.id.chkBoxWriting ,R.id.chkBoxClimbing ,
                    R.id.chkBoxSwim ,R.id.chkBoxExercise ,R.id.chkBoxFitness ,R.id.chkBoxPhoto ,R.id.chkBoxFood ,R.id.chkBoxPainting };
            for(int i:ids){
                chk= findViewById(i);

                if(chk.isChecked()){
                    s+="\n"+chk.getText().toString();
                }


            }

            // 顯示勾選的興趣項目
            mTxtHobby.setText(s);

        }
    };
    //checkBoxOnClick

}
