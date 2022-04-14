package com.example.democalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button add,sub,div,mul,equal,one,two,three,four,five,six,seven,eight,nine,zero,dot,percent,braco,bracc,clear;

    List<Float> a1= new ArrayList<Float>();
    List<Float> a2= new ArrayList<Float>();
    List<Integer> a=new ArrayList<Integer>();
    List<Integer> b=new ArrayList<Integer>();
    List<String> s2=new ArrayList<String>();
    TextView e1,e2;
    String f="",s="0",s1="";
    int i=0,j=0,t=0,u=0;
    float k=0,k1=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        zero=(Button)findViewById(R.id.zero);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        dot=(Button)findViewById(R.id.dot);
        percent=(Button)findViewById(R.id.perce);
        clear=(Button)findViewById(R.id.clear);
        braco=(Button)findViewById(R.id.braco);
        bracc=(Button)findViewById(R.id.bracc);
        add=(Button)findViewById(R.id.add);
        equal=(Button)findViewById(R.id.equal);
        e1=(TextView)findViewById(R.id.input);
        e2=(TextView)findViewById(R.id.output);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"1");

                if(t==1)
                {
                    s1=s1+"1";
                }
                else
                    s=s+"1";

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText() + "2");

                if (t==1) {
                    s1=s1+"2";

                } else
                    s = s + "2";
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"3");

                if(t==1)
                {
                    s1=s1+"3";
                }
                else
                    s=s+"3";
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"4");

                if(t==1)
                {
                    s1=s1+"4";
                }
                else
                    s=s+"4";

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"5");

                if(t==1)
                {
                    s1=s1+"5";
                }
                else
                    s=s+"5";

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"6");

                if(t==1)
                {
                    s1=s1+"6";
                }
                else
                    s=s+"6";

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"7");

                if(t==1)
                {
                    s1=s1+"7";
                }
                else
                    s=s+"7";

            }

        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"8");

                if(t==1)
                {
                    s1=s1+"8";
                }
                else
                s=s+"8";

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"9");

                if(t==1)
                {
                    s1=s1+"9";
                }
                else
                    s=s+"9";

            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"0");

                if(t==1)
                {
                    s1=s1+"0";
                }
                else
                s=s+"0";

            }
        });
        braco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"(");
                 t=1;


            }
        });
        bracc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText() + ")");
                if (t==1) {
                    a2.add(Float.parseFloat(s1));

                    for (i = 0; i < b.size(); i++) {
                        if (b.get(i) == 1) {
                            k1 = a2.get(i) / a2.get(i+1);
                            a2.set(i + 1, k1);

                            a2.set(i, k1);


                        }
                        if (b.get(i) == 2) {
                            k1 = a2.get(i) * a2.get(i + 1);
                            a2.set(i + 1, k1);

                            a2.set(i, k1);


                        }
                        if (b.get(i) == 5) {
                            k1 = (a2.get(i)/100) * a2.get(i + 1);
                            a2.set(i + 1, k1);

                            a2.set(i, k1);


                        }


                    }


                    for (j = 0; j < b.size(); j++) {
                        if (b.get(j) == 3) {
                            k1 = a2.get(j) + a2.get(j + 1);
                            a2.set(j + 1, k1);

                            a2.set(j, k1);

                        }
                        if (b.get(j) == 4) {
                            k1 = a2.get(j) - a2.get(j + 1);
                            a2.set(j + 1, k1);
                            a2.set(j, k1);

                        }

                    }
                    String f1 = String.valueOf(k1);
                   // a1.add(Float.parseFloat(f1));
                   // e2.setText(a1.toString());

                    //if(t==1)
                        s=f1;
                    t=0;
                    s1="";
                    b.clear();
                    a2.clear();
                }


            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(u==1)
                {
                    e1.setText(f);
                    u=0;}
                if(t==1)
                {
                    if(s1 =="")
                        e1.setText("no operand");
                    else
                    {

                        a2.add(Float.parseFloat(s1));
                        s1="";
                        e1.setText(e1.getText()+"%");
                        b.add(5);



                    }
                }
                else {
                    if (s == "")
                        e1.setText("no operand");
                    else {

                        a1.add(Float.parseFloat(s));
                        s = "";
                        e1.setText(e1.getText() + "%");
                        a.add(5);


                    }
                }

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(u==1)
                {
                    e1.setText(f);
                    u=0;}
                if(t==1)
                {
                    if(s1 =="")
                        e1.setText("no operand");
                    else
                    {

                        a2.add(Float.parseFloat(s1));
                        s1="";
                        e1.setText(e1.getText()+"/");
                        b.add(1);



                    }
                }
               else {
                    if (s == "")
                        e1.setText("no operand");
                    else {

                        a1.add(Float.parseFloat(s));
                        s = "";
                        e1.setText(e1.getText() + "/");
                        a.add(1);


                    }
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(u==1)
                {e1.setText(f);
                u=0;}
                if(t==1)
                {
                    if(s1 =="")
                        e1.setText("no operand");
                    else
                    {

                        a2.add(Float.parseFloat(s1));
                        s1="";
                        e1.setText(e1.getText()+"*");
                        b.add(2);



                    }
                }
               else {
                    if (s == "")
                        e1.setText("no operand");
                    else {

                        a1.add(Float.parseFloat(s));
                        s = "";
                        e1.setText(e1.getText() + "*");
                        a.add(2);

                    }
                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(u==1)
                {e1.setText(f);
                u=0;}
                if (t==1) {
                    if (s1 == "")
                        e1.setText("no operand");
                    else {

                        a2.add(Float.parseFloat(s1));
                        s1="";
                        e1.setText(e1.getText() + "+");
                        b.add(3);


                    }
                }
                else {
                    if (s == "")
                        e1.setText("no operand");
                    else {

                        a1.add(Float.parseFloat(s));
                        s = "";
                        e1.setText(e1.getText() + "+");
                        a.add(3);


                    }
                }
            }



        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(u==1)
                {e1.setText(f);
                u=0;}
                if(t==1)
                {
                    if(s1 =="")
                        e1.setText("no operand");
                    else
                    {

                        a2.add(Float.parseFloat(s1));
                        s1="";
                        e1.setText(e1.getText()+"-");
                        b.add(4);



                    }
                }
else {
                    if (s == "")
                        e1.setText("no operand");
                    else {

                        a1.add(Float.parseFloat(s));
                        s = "";
                        e1.setText(e1.getText() + "-");
                        a.add(4);


                    }
                }
        }

        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+".");
                s=s+".";
                if(t==1)
                    s1=s1+".";


            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a1.add(Float.parseFloat(s));
                k=a1.get(0);
                s=null;
                for(i=0;i<a.size();i++)
                {
                    if(a.get(i)==1)
                    {
                        k=a1.get(i)/a1.get(i+1);
                        a1.set(i+1,k);

                        a1.set(i,k);




                    }
                    if(a.get(i)==2)
                    {
                        k=a1.get(i)*a1.get(i+1);
                        a1.set(i+1,k);

                        a1.set(i,k);


                    }
                    if(a.get(i)==5)
                    {
                        k=(a1.get(i)/100)*a1.get(i+1);
                        a1.set(i+1,k);

                        a1.set(i,k);


                    }



                }




                for(j=0;j<a.size();j++)
                {
                    if(a.get(j)==3)
                    {
                        k=a1.get(j)+a1.get(j+1);
                        a1.set(j+1,k);

                        a1.set(j,k);

                    }
                    if(a.get(j)==4)
                    {
                        k=a1.get(j)-a1.get(j+1);
                        a1.set(j+1,k);
                        a1.set(j,k);

                    }

                }
                f= String.valueOf(k);
                e2.setText(f);
                s=f;
                a1.clear();
                a.clear();
                u=1;
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e2.setText("");
                e1.setText((""));
                s="";
                a.clear();
                a1.clear();
                b.clear();
                a2.clear();
                s1="";
                t=0;
                u=0;
            }
        });


    }
}
