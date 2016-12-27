package app.shenaiting.shenaiting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/9/26.
 * 这个是申嫒婷的适配器
 * 传递3个数据data1：星期几
 *          data2：日期
 *          data3：输入的内容
 */
public class SATadapter extends BaseAdapter {

    private Context context;
    private String data1[];
    private String data2[];
    private String data3[];
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    public SATadapter(Context context, String data1[], String data2[], String data3[]){
        this.context=context;
        this.data1=data1;
        this.data2=data2;
        this.data3=data3;
    }
    @Override
    public int getCount() {
        return data1.length;
    }

    @Override
    public Object getItem(int i) {
        return data1[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null){
            view= LayoutInflater.from(context).inflate(R.layout.sat_list,null);
        }
        TextView textView1=(TextView)view.findViewById(R.id.textView1);
        TextView textView2=(TextView)view.findViewById(R.id.textView2);
        TextView textView3=(TextView)view.findViewById(R.id.textView3);
        textView1.setText(data1[i%7]);
        textView2.setText(data2[i]);
        textView3.setText(data3[i]);
        return view;
    }
}
