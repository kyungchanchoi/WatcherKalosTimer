package com.maplestoryproject.watcherkalostimer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class TimeActivity extends AppCompatActivity{

    // 화면에 보여지는 버튼
    private Button bind; // 바인드했을때 누르는거
    private Button authority; // 권능 썼을때
    private Button next; // 즉사오면 다음 2분 30초 추가

    // 계산하는 시간
    private int currentMinute = 2; // 첫 즉사는 2분
    private int currentSecond = 40; // 30초겠지만 바극딜하면 10초밀리겠지

    // 화면에 보여지는 시간
    private TextView infoText;
    private TextView curTimeMin;
    private TextView curTimeSec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_time);

        // 다음 시간
        infoText = findViewById(R.id.nexttimetext);
        infoText.setText(" ");
        // 분
        curTimeMin = findViewById(R.id.currentMinuteTime);
        curTimeMin.setText(currentMinute + "분"); // 셋팅

        // 초
        curTimeSec = findViewById(R.id.currentSecondTime);
        curTimeSec.setText(currentSecond + "초"); // 셋팅

        next = findViewById(R.id.nextbutton);
        bind = findViewById(R.id.bindbutton);
        authority = findViewById(R.id.authoritybutton);

        // next : 누르면 2분 30초 늘림
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentMinute += 2; // 2분 더함
                currentSecond += 30; // 30초 더함

                // 더했는데 초가 60이상이면
                if (currentSecond >= 60 )
                {
                    currentMinute++; // 분 더하고
                    currentSecond -= 60; // 초에서 60 빼고

                    // 갱신
                    curTimeMin.setText(currentMinute + "분");
                    curTimeSec.setText(currentSecond + "초");
                }
                // 아니라면
                else
                {
                    // 갱신
                    curTimeMin.setText(currentMinute + "분");
                    curTimeSec.setText(currentSecond + "초");
                }
            };
        });

        // bind : 누르면 10초 늘림
        bind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                currentSecond += 10; // 10초 더함

                // 더했는데 초가 60이상이면
                if (currentSecond >= 60 )
                {
                    currentMinute++; // 분 더하고
                    currentSecond -= 60; // 초에서 60 빼고

                    // 갱신
                    curTimeMin.setText(currentMinute + "분");
                    curTimeSec.setText(currentSecond + "초");
                }
                // 아니라면
                else
                {
                    // 갱신
                    curTimeMin.setText(currentMinute + "분");
                    curTimeSec.setText(currentSecond + "초");
                }
            };
        });

        // authority : 누르면 50초 늘림
        authority.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                currentSecond += 50; // 10초 더함

                // 더했는데 초가 60이상이면
                if (currentSecond >= 60 )
                {
                    currentMinute++; // 분 더하고
                    currentSecond -= 60; // 초에서 60 빼고

                    // 갱신
                    curTimeMin.setText(currentMinute + "분");
                    curTimeSec.setText(currentSecond + "초");
                }
                // 아니라면
                else
                {
                    // 갱신
                    curTimeMin.setText(currentMinute + "분");
                    curTimeSec.setText(currentSecond + "초");
                }
            };
        });
    }
}
