package app.shenaiting.shenaiting;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class SAT_app_MainActivity extends AppCompatActivity {

    private ListView listView;
    private SATadapter satadapter;
    //初始化数据
    private String data1[]={"SAT","SUN","MON","TUE","WED","THU","FRI"};
    private String data2[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",
            "16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    private String data3[]={
            "得去超市来着...",
            "今天第一次和智恩吃意大利面",
            "两边的树都吸走了汽车尾气。7：45准备下班",
            "现在每天都能吃到猪扒饭了。好开心！",
            "",
            "",
            "你。黑咖啡。芝士年糕。羽毛球。成功",
            "zzy最爱你",
            "7:25am起床。中午吃了披萨。那家披萨的积分好像又变多了...",
            "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
            "", "", "", "", "", "", ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sat_app__main);

        ListViewonclicklistener listener1=new ListViewonclicklistener();
        listView=(ListView)findViewById(R.id.listView);
        satadapter=new SATadapter(this,data1,data2,data3);
        listView.setAdapter(satadapter);
        listView.setOnItemClickListener(listener1);


    }
    class ListViewonclicklistener implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            Intent intent1=new Intent();
            intent1.setClass(SAT_app_MainActivity.this,SATEdit.class);
            startActivity(intent1);
        }
    }

}
