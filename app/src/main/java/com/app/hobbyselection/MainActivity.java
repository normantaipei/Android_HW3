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
        /*
        if(mChkBoxMusic.setOnCheckedChangeListener()) {

        }
        mChkBoxSing.setOnClickListener(btnOkOnClick);
        mChkBoxDance.setOnClickListener(btnOkOnClick);
        mChkBoxTravel.setOnClickListener(btnOkOnClick);
        mChkBoxReading.setOnClickListener(btnOkOnClick);
        mChkBoxWriting.setOnClickListener(btnOkOnClick);
        mChkBoxClimbing.setOnClickListener(btnOkOnClick);
        mChkBoxSwim.setOnClickListener(btnOkOnClick);
        mChkBoxExercise.setOnClickListener(btnOkOnClick);
        mChkBoxFitness = findViewById(R.id.chkBoxFitness);
        mChkBoxPhoto = findViewById(R.id.chkBoxPhoto);
        mChkBoxFood = findViewById(R.id.chkBoxFood);
        mChkBoxPainting = findViewById(R.id.chkBoxPainting);


         */

        mBtnOK = findViewById(R.id.btnOk);
        mTxtHobby = findViewById(R.id.txtHobby);

        // 設定Button的事件listener

       // mBtnOK.setOnClickListener(btnOkOnClick);
        //onCheckboxClicked(mChkBoxSing);
        mChkBoxSing.setOnCheckedChangeListener(checkBoxOnClick);
    }
    private CompoundButton.OnCheckedChangeListener checkBoxOnClick;
    //checkBoxOnClick
    private CompoundButton.OnCheckedChangeListener checkBoxOnClick(){

    }



    private View.OnClickListener btnOkOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
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
}
