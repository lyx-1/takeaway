package com.example.l.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 刘宇轩 on 2016/8/26.
 */

//商家信息界面
public class SaleActivity extends AppCompatActivity implements SalerInfoAdapter.MyCallBack {
    private List<SubmitOrderInfo> list1 = new ArrayList<>();
    private List<SalerInfo> list = new ArrayList<>();
    private List<String> dishnamedata=new ArrayList<>();
    private ListView dishinfo;
    private ListView dishname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sale);

        //左边ListView
        dishnamedata=new ArrayList<>();
        for(int i=0;i<10;i++){
            dishnamedata.add("日常菜"+i);
        }
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(SaleActivity.this,android.R.layout.simple_list_item_1,dishnamedata);
        dishname =(ListView)findViewById(R.id.dish_class);
        dishname.setAdapter(adapter);
        initSalerInfo();
        //右边ListView
        dishinfo= (ListView)findViewById(R.id.dish_info);
        SalerInfoAdapter salerInfoAdapter=new SalerInfoAdapter(SaleActivity.this, R.layout.right_item,list,this);
        dishinfo.setAdapter(salerInfoAdapter);
        dishname.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int i=100*position;
                dishinfo.scrollTo(0,i);

            }
        });







        //点击确认订单按钮后跳转到确认订单界面
        Button sureorder = (Button) findViewById(R.id.sure_order);
        sureorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SaleActivity.this, OrderActivity.class);
                for (int i = 0; i < list1.size(); i++) {
                    intent.putExtra("dishname" + i, list1.get(i).getDishname());
                    intent.putExtra("dishnum" + i, list1.get(i).getDishnum());
                    intent.putExtra("dishprice" + i, list1.get(i).getDishprice());

                }
                TextView allprice = (TextView) findViewById(R.id.all_price);
                intent.putExtra("listlength", list1.size());
                intent.putExtra("allprice", allprice.getText());
                startActivity(intent);
            }
        });

    }


    //初始化SalerInfo（list）数据
    public void initSalerInfo() {
        for(int i=0;i<10;i++) {
            SalerInfo dish1 = new SalerInfo();
            SalerInfo dish2 = new SalerInfo();
            dish1.setDishname("手撕鸡" + i);
            dish2.setDishname("小炒肉" + i);
            dish1.setDishprice("14");
            dish2.setDishprice("12");
            dish2.setDishphotoid(R.mipmap.ic_launcher);
            dish1.setDishphotoid(R.mipmap.ic_launcher);
            dish1.setDishnumber("0");
            dish2.setDishnumber("0");
            list.add(dish1);
            list.add(dish2);
        }
    }


    //add按钮和minus按钮的回调方法
    @Override
    public void onItemWidgetClickListener(View v,int i,String name,View view) {
        switch (v.getId()){
            case R.id.plus_dish:
                int counter=0;
                //点击添加按钮后菜的数量加1
                TextView dishnum=(TextView)view.findViewById(R.id.dish_number);
                int dnum=Integer.parseInt(dishnum.getText().toString());
                for(int m=0;m<list.size();m++){
                    if(list.get(m).getDishname().equals(name)){
                        list.get(m).setDishnumber(Integer.toString(++dnum));
                    }
                }
                dishnum.setText(Integer.toString(dnum));
                //修改总价
                TextView allprice1 =(TextView)findViewById(R.id.all_price);
                int all_price1=Integer.parseInt(allprice1.getText().toString());
                all_price1=all_price1+i;
                allprice1.setText(Integer.toString(all_price1));
                //添加订单信息
                for(int n=0;n<list1.size();n++){
                    if(list1.get(n).getDishname().equals(name)){
                        int num=Integer.parseInt(list1.get(n).getDishnum());
                        num++;
                        list1.get(n).setDishnum(Integer.toString(num));
                        int price=Integer.parseInt(list1.get(n).getDishprice());
                        price=price+i;
                        list1.get(n).setDishprice(Integer.toString(price));
                    }else{
                        counter++;
                    }
                }
                if(counter==list1.size()){
                    SubmitOrderInfo submitOrderInfo=new SubmitOrderInfo();
                    submitOrderInfo.setDishname(name);
                    submitOrderInfo.setDishnum("1");
                    submitOrderInfo.setDishprice(Integer.toString(i));
                    list1.add(submitOrderInfo);
                }
                break;
            case R.id.minus_dish:
                //点击添加按钮后菜的数量减1
                TextView dishnum2=(TextView)view.findViewById(R.id.dish_number);
                int dnum2=Integer.parseInt(dishnum2.getText().toString());
                for(int m=0;m<list.size();m++){
                    if(list.get(m).getDishname().equals(name)){
                        list.get(m).setDishnumber(Integer.toString(--dnum2));
                    }
                }
                dishnum2.setText(Integer.toString(dnum2));
                //修改总价
                TextView allprice2=(TextView)findViewById(R.id.all_price);
                int all_price2=Integer.parseInt(allprice2.getText().toString());
                all_price2=all_price2-i;
                allprice2.setText(Integer.toString(all_price2));
                //减少订单信息
                for(int n=0;n<list1.size();n++)
                {
                    if(list1.get(n).getDishname().equals(name)){
                        int num=Integer.parseInt(list1.get(n).getDishnum());
                        num--;
                        list1.get(n).setDishnum(Integer.toString(num));
                        int price=Integer.parseInt(list1.get(n).getDishprice());
                        price=price-i;
                        list1.get(n).setDishprice(Integer.toString(price));
                    }


                }
                break;
            default:
                break;
            }

    }
}

