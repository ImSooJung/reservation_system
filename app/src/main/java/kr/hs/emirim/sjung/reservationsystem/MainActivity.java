package kr.hs.emirim.sjung.reservationsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    Chronometer chrono;
    Button butStart, butDone;
    RadioButton radioDate, radioTime;
    CalendarView calView;
    TimePicker timePick;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//임플레이션 : xml에 있는 클래스 이름과 같은 요소들을 찾아서 주기억장치에 올려줌

        chrono=(Chronometer)findViewById(R.id.chrono);//파인드 뷰가 반환하는 건 뷰 /크로노미터라고 강제 형 변환한다 뷰의 상위클래스는 위젯
        butStart = (Button)findViewById(R.id.but_start);
        butDone=(Button)findViewById(R.id.but_done);
        radioDate=(RadioButton)findViewById(R.id.radio_date);
        radioTime=(RadioButton)findViewById(R.id.radio_time);
        calView=(CalendarView)findViewById(R.id.calendar);
        timePick=(TimePicker)findViewById(R.id.time_pick);
        textResult=(TextView)findViewById(R.id.text_result);
        timePick.setVisibility(View.INVISIBLE);
        calView.setVisibility(View.INVISIBLE);

        radioDate.setOnClickListener(new View.OnClickListener() {//익명클래스로 객체 생성할때 : new 클래스 이름

            public void onClick(View v) {
                calView.setVisibility(View.VISIBLE);
                timePick.setVisibility(View.INVISIBLE);
            }
        });
        radioTime.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                calView.setVisibility(View.INVISIBLE);
                timePick.setVisibility(View.VISIBLE);
        }
    });

    }
}
