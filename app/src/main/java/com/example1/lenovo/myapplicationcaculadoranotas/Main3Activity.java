package com.example1.lenovo.myapplicationcaculadoranotas;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    //ATRIBUTOS
    private EditText nota1A, nota2B, nota3C,
            nota1AA, nota2BB, nota3CC,
            nota1AAA, nota2BBB, nota3CCC,
            nota1A1, nota2B1, nota3C1,
            n1, n2, n3,
            n1A, n2B, n3C,
            nA, nB, nC;
    private TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tvpromedio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        tvpromedio = (TextView) findViewById(R.id.tvpromedio);

        //  MATERIA1
        tv1 = (TextView) findViewById(R.id.R1);
        nota1A = (EditText) findViewById(R.id.nota1A);
        nota2B = (EditText) findViewById(R.id.nota2B);
        nota3C = (EditText) findViewById(R.id.nota3C);

        // MATERIA2
        tv2 = (TextView) findViewById(R.id.R2);
        nota1AA = (EditText) findViewById(R.id.nota1AA);
        nota2BB = (EditText) findViewById(R.id.nota2BB);
        nota3CC = (EditText) findViewById(R.id.nota3CC);

        // MATERIA3
        tv3 = (TextView) findViewById(R.id.R3);
        nota1AAA = (EditText) findViewById(R.id.nota1AAA);
        nota2BBB = (EditText) findViewById(R.id.nota2BBB);
        nota3CCC = (EditText) findViewById(R.id.nota3CCC);

        // MATERIA4
        tv4 = (TextView) findViewById(R.id.R4);
        nota1A1 = (EditText) findViewById(R.id.nota1A1);
        nota2B1 = (EditText) findViewById(R.id.nota2B1);
        nota3C1 = (EditText) findViewById(R.id.nota3C1);

        //  MATERIA5
        tv5 = (TextView) findViewById(R.id.R5);
        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        n3 = (EditText) findViewById(R.id.n3);

        //  MATERIA6
        tv6 = (TextView) findViewById(R.id.R6);
        n1A = (EditText) findViewById(R.id.n1A);
        n2B = (EditText) findViewById(R.id.n2B);
        n3C = (EditText) findViewById(R.id.n3C);

        //  MATERIA7
        tv7 = (TextView) findViewById(R.id.R7);
        nA = (EditText) findViewById(R.id.nA);
        nB = (EditText) findViewById(R.id.nB);
        nC = (EditText) findViewById(R.id.nC);

        SharedPreferences preferencias = getSharedPreferences("DATOS",Context.MODE_PRIVATE);

        nota1A.setText(preferencias.getString("nota1A","0"));
        nota2B.setText(preferencias.getString("nota2B","0"));
        nota3C.setText(preferencias.getString("nota3C","0"));

        nota1AA.setText(preferencias.getString("nota1AA","0"));
        nota2BB.setText(preferencias.getString("nota2BBB","0"));
        nota3CC.setText(preferencias.getString("nota3CC","0"));

        nota1AAA.setText(preferencias.getString("nota1AAA","0"));
        nota2BBB.setText(preferencias.getString("nota2BBB","0"));
        nota3CCC.setText(preferencias.getString("nota3CCC","0"));

        nota1A1.setText(preferencias.getString("nota1A1","0"));
        nota2B1.setText(preferencias.getString("nota2B1","0"));
        nota3C1.setText(preferencias.getString("nota3C1","0"));

        n1.setText(preferencias.getString("n1","0"));
        n2.setText(preferencias.getString("n2","0"));
        n3.setText(preferencias.getString("n3","0"));

        n1A.setText(preferencias.getString("n1A","0"));
        n2B.setText(preferencias.getString("n2B","0"));
        nota1A.setText(preferencias.getString("n3C","0"));

        nA.setText(preferencias.getString("nA","0"));
        nB.setText(preferencias.getString("nB","0"));
        nC.setText(preferencias.getString("nC","0"));



        tv1.setText(preferencias.getString("R1","0"));
        tv2.setText(preferencias.getString("R2","0"));
        tv3.setText(preferencias.getString("R3","0"));
        tv4.setText(preferencias.getString("R4","0"));
        tv5.setText(preferencias.getString("R5","0"));
        tv6.setText(preferencias.getString("R6","0"));
        tv7.setText(preferencias.getString("R7","0"));
        tvpromedio.setText(preferencias.getString("tvpromedio","0"));



        // ONCHANGE MATERIA 1
        nota1A.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                try {
                    String nota1 = nota1A.getText().toString();
                    String nota2 = nota2B.getText().toString();
                    String nota3 = nota3C.getText().toString();
                    float nro1 = Float.parseFloat(nota1);
                    float nro2 = Float.parseFloat(nota2);
                    float nro3 = Float.parseFloat(nota3);
                    if(nro1 <= 5 && nro1 >= 0 )
                    {
                        double result = (((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4);
                        String resultado = String.valueOf(result);
                        tv1.setText(resultado);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(Main3Activity.this,"El Numero Debe Ser Entre 1 y 5", Toast.LENGTH_LONG);
                        notificacion.show();

                    }


                } catch (Exception e) {
                    if (nota1A.getText().toString().equals("") || (nota2B.getText().toString().equals("") || (nota3C.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(Main3Activity.this, "Ningun Campo Debe Estar Vacio", Toast.LENGTH_LONG);
                        notification.show();
                    }
                }
            }
        });

        nota2B.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int coun, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int star, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    String nota1 = nota1A.getText().toString();
                    String nota2 = nota2B.getText().toString();
                    String nota3 = nota3C.getText().toString();
                    float nro1 = Float.parseFloat(nota1);
                    float nro2 = Float.parseFloat(nota2);
                    float nro3 = Float.parseFloat(nota3);
                    if(nro2 <= 5 && nro2 >= 0)
                    {
                        double result = (((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4);
                        String resultado = String.valueOf(result);
                        tv1.setText(resultado);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(Main3Activity.this,"El Numero Debe Ser Entre 1 y 5", Toast.LENGTH_LONG);
                        notificacion.show();

                    }

                } catch (Exception e) {
                    if (nota1A.getText().toString().equals("") || (nota2B.getText().toString().equals("") || (nota3C.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(Main3Activity.this, "Se Necesita Llegar Todos Los Campos", Toast.LENGTH_LONG);
                        notification.show();
                    }
                }
            }
        });

        nota3C.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int coun, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int star, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    String nota1 = nota1A.getText().toString();
                    String nota2 = nota2B.getText().toString();
                    String nota3 = nota3C.getText().toString();
                    float nro1 = Float.parseFloat(nota1);
                    float nro2 = Float.parseFloat(nota2);
                    float nro3 = Float.parseFloat(nota3);
                    if(nro3 <= 5 && nro3 >= 0)
                    {
                        double result = (((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4);
                        String resultado = String.valueOf(result);
                        tv1.setText(resultado);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(Main3Activity.this,"El Numero Debe Ser Entre 1 y 5", Toast.LENGTH_LONG);
                        notificacion.show();

                    }

                } catch (Exception e) {
                    if (nota1A.getText().toString().equals("") || (nota2B.getText().toString().equals("") || (nota3C.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(Main3Activity.this, "Se Necesita Llegar Todos Los Campos", Toast.LENGTH_LONG);
                        notification.show();
                    }
                }
            }
        });

        //ONCHANGE MATERIA2
        nota1AA.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                try {
                    String nota1 = nota1AA.getText().toString();
                    String nota2 = nota2BB.getText().toString();
                    String nota3 = nota3CC.getText().toString();
                    float nro1 = Float.parseFloat(nota1);
                    float nro2 = Float.parseFloat(nota2);
                    float nro3 = Float.parseFloat(nota3);
                    if(nro1 <= 5 && nro1 >= 0)
                    {
                        double result = (((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4);
                        String resultado = String.valueOf(result);
                        tv2.setText(resultado);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(Main3Activity.this,"El Numero Debe Ser Entre 1 y 5", Toast.LENGTH_LONG);
                        notificacion.show();

                    }

                } catch (Exception e) {
                    if (nota1AA.getText().toString().equals("") || (nota2BB.getText().toString().equals("") || (nota3CC.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(Main3Activity.this, "Ningun Campo Debe Estar Vacio", Toast.LENGTH_LONG);
                        notification.show();
                    }
                }
            }
        });

        nota2BB.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int coun, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int star, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    String nota1 = nota1AA.getText().toString();
                    String nota2 = nota2BB.getText().toString();
                    String nota3 = nota3CC.getText().toString();
                    float nro1 = Float.parseFloat(nota1);
                    float nro2 = Float.parseFloat(nota2);
                    float nro3 = Float.parseFloat(nota3);
                    if(nro2 <= 5 && nro2 >= 0)
                    {
                        double result = (((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4);
                        String resultado = String.valueOf(result);
                        tv2.setText(resultado);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(Main3Activity.this,"El Numero Debe Ser Entre 1 y 5", Toast.LENGTH_LONG);
                        notificacion.show();

                    }

                } catch (Exception e) {
                    if (nota1AA.getText().toString().equals("") || (nota2BB.getText().toString().equals("") || (nota3CC.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(Main3Activity.this, "Ningun Campo Debe Estar Vacio", Toast.LENGTH_LONG);
                        notification.show();
                    }
                }
            }
        });

        nota3CC.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int coun, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int star, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    String nota1 = nota1AA.getText().toString();
                    String nota2 = nota2BB.getText().toString();
                    String nota3 = nota3CC.getText().toString();
                    float nro1 = Float.parseFloat(nota1);
                    float nro2 = Float.parseFloat(nota2);
                    float nro3 = Float.parseFloat(nota3);
                    if(nro3 <= 5 && nro3 >= 0)
                    {
                        double result = (((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4);
                        String resultado = String.valueOf(result);
                        tv2.setText(resultado);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(Main3Activity.this,"El Numero Debe Ser Entre 1 y 5", Toast.LENGTH_LONG);
                        notificacion.show();

                    }

                } catch (Exception e) {
                    if (nota1AA.getText().toString().equals("") || (nota2BB.getText().toString().equals("") || (nota3CC.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(Main3Activity.this, "Ningun Campo Debe Estar Vacio", Toast.LENGTH_LONG);
                        notification.show();
                    }
                }
            }
        });
        //ONCHANGE MATERIA3

        nota1AAA.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                try {
                    String nota1 = nota1AAA.getText().toString();
                    String nota2 = nota2BBB.getText().toString();
                    String nota3 = nota3CCC.getText().toString();
                    float nro1 = Float.parseFloat(nota1);
                    float nro2 = Float.parseFloat(nota2);
                    float nro3 = Float.parseFloat(nota3);
                    if(nro1 <= 5 && nro1 >= 0)
                    {
                        double result = (((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4);
                        String resultado = String.valueOf(result);
                        tv3.setText(resultado);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(Main3Activity.this,"El Numero Debe Ser Entre 1 y 5", Toast.LENGTH_LONG);
                        notificacion.show();

                    }

                } catch (Exception e) {
                    if (nota1AAA.getText().toString().equals("") || (nota2BBB.getText().toString().equals("") || (nota3CCC.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(Main3Activity.this, "Ningun Campo Debe Estar Vacio", Toast.LENGTH_LONG);
                        notification.show();
                    }
                }
            }
        });

        nota2BBB.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int coun, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int star, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    String nota1 = nota1AAA.getText().toString();
                    String nota2 = nota2BBB.getText().toString();
                    String nota3 = nota3CCC.getText().toString();
                    float nro1 = Float.parseFloat(nota1);
                    float nro2 = Float.parseFloat(nota2);
                    float nro3 = Float.parseFloat(nota3);
                    if(nro2 <= 5 && nro2 >= 0)
                    {
                        double result = (((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4);
                        String resultado = String.valueOf(result);
                        tv3.setText(resultado);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(Main3Activity.this,"El Numero Debe Ser Entre 1 y 5", Toast.LENGTH_LONG);
                        notificacion.show();

                    }

                } catch (Exception e) {
                    if (nota1AAA.getText().toString().equals("") || (nota2BBB.getText().toString().equals("") || (nota3CCC.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(Main3Activity.this, "Ningun Campo Debe Estar Vacio", Toast.LENGTH_LONG);
                        notification.show();
                    }
                }
            }
        });
        nota3CCC.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int coun, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int star, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    String nota1 = nota1AAA.getText().toString();
                    String nota2 = nota2BBB.getText().toString();
                    String nota3 = nota3CCC.getText().toString();
                    float nro1 = Float.parseFloat(nota1);
                    float nro2 = Float.parseFloat(nota2);
                    float nro3 = Float.parseFloat(nota3);
                    if(nro3 <= 5 && nro3 >= 0)
                    {
                        double result = (((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4);
                        String resultado = String.valueOf(result);
                        tv3.setText(resultado);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(Main3Activity.this,"El Numero Debe Ser Entre 1 y 5", Toast.LENGTH_LONG);
                        notificacion.show();

                    }

                } catch (Exception e) {
                    if (nota1AAA.getText().toString().equals("") || (nota2BBB.getText().toString().equals("") || (nota3CCC.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(Main3Activity.this, "Ningun Campo Debe Estar Vacio", Toast.LENGTH_LONG);
                        notification.show();
                    }
                }
            }
        });

        //ONCHANGE MATERIA4

        nota1A1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                try {
                    String nota1 = nota1A1.getText().toString();
                    String nota2 = nota2B1.getText().toString();
                    String nota3 = nota3C1.getText().toString();
                    float nro1 = Float.parseFloat(nota1);
                    float nro2 = Float.parseFloat(nota2);
                    float nro3 = Float.parseFloat(nota3);
                    if(nro1 <= 5 && nro1 >= 0)
                    {
                        double result = (((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4);
                        String resultado = String.valueOf(result);
                        tv4.setText(resultado);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(Main3Activity.this,"El Numero Debe Ser Entre 1 y 5", Toast.LENGTH_LONG);
                        notificacion.show();

                    }

                } catch (Exception e) {
                    if (nota1A1.getText().toString().equals("") || (nota2B1.getText().toString().equals("") || (nota3C1.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(Main3Activity.this, "Ningun Campo Debe Estar Vacio", Toast.LENGTH_LONG);
                        notification.show();
                    }
                }
            }
        });

        nota2B1.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int coun, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int star, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    String nota1 = nota1A1.getText().toString();
                    String nota2 = nota2B1.getText().toString();
                    String nota3 = nota3C1.getText().toString();
                    float nro1 = Float.parseFloat(nota1);
                    float nro2 = Float.parseFloat(nota2);
                    float nro3 = Float.parseFloat(nota3);
                    if(nro2 <= 5 && nro2 >= 0)
                    {
                        double result = (((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4);
                        String resultado = String.valueOf(result);
                        tv4.setText(resultado);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(Main3Activity.this,"El Numero Debe Ser Entre 1 y 5", Toast.LENGTH_LONG);
                        notificacion.show();

                    }

                } catch (Exception e) {
                    if (nota1A1.getText().toString().equals("") || (nota2B1.getText().toString().equals("") || (nota3C1.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(Main3Activity.this, "Ningun Campo Debe Estar Vacio", Toast.LENGTH_LONG);
                        notification.show();
                    }
                }
            }
        });

        nota3C1.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int coun, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int star, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    String nota1 = nota1A1.getText().toString();
                    String nota2 = nota2B1.getText().toString();
                    String nota3 = nota3C1.getText().toString();
                    float nro1 = Float.parseFloat(nota1);
                    float nro2 = Float.parseFloat(nota2);
                    float nro3 = Float.parseFloat(nota3);
                    if(nro3 <= 5 && nro3 >= 0)
                    {
                        double result = (((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4);
                        String resultado = String.valueOf(result);
                        tv4.setText(resultado);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(Main3Activity.this,"El Numero Debe Ser Entre 1 y 5", Toast.LENGTH_LONG);
                        notificacion.show();

                    }

                } catch (Exception e) {
                    if (nota1A1.getText().toString().equals("") || (nota2B1.getText().toString().equals("") || (nota3C1.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(Main3Activity.this, "Ningun Campo Debe Estar Vacio", Toast.LENGTH_LONG);
                        notification.show();
                    }
                }
            }
        });

        // ONCHANGE MATERIA 1
        n1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                try {
                    String nota1 = n1.getText().toString();
                    String nota2 = n2.getText().toString();
                    String nota3 = n3.getText().toString();
                    float nro1 = Float.parseFloat(nota1);
                    float nro2 = Float.parseFloat(nota2);
                    float nro3 = Float.parseFloat(nota3);
                    if(nro1 <= 5 && nro1 >= 0)
                    {
                        double result = (((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4);
                        String resultado = String.valueOf(result);
                        tv5.setText(resultado);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(Main3Activity.this,"El Numero Debe Ser Entre 1 y 5", Toast.LENGTH_LONG);
                        notificacion.show();

                    }

                } catch (Exception e) {
                    if (n1.getText().toString().equals("") || (n2.getText().toString().equals("") || (n3.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(Main3Activity.this, "Se Necesita Llegar Todos Los Campos", Toast.LENGTH_LONG);
                        notification.show();
                    }
                }
            }
        });

        n2.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int coun, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int star, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    String nota1 = n1.getText().toString();
                    String nota2 = n2.getText().toString();
                    String nota3 = n3.getText().toString();
                    float nro1 = Float.parseFloat(nota1);
                    float nro2 = Float.parseFloat(nota2);
                    float nro3 = Float.parseFloat(nota3);
                    if(nro2 <= 5 && nro2 >= 0)
                    {
                        double result = (((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4);
                        String resultado = String.valueOf(result);
                        tv5.setText(resultado);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(Main3Activity.this,"El Numero Debe Ser Entre 1 y 5", Toast.LENGTH_LONG);
                        notificacion.show();

                    }

                } catch (Exception e) {
                    if (n1.getText().toString().equals("") || (n2.getText().toString().equals("") || (n3.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(Main3Activity.this, "Se Necesita Llegar Todos Los Campos", Toast.LENGTH_LONG);
                        notification.show();
                    }
                }
            }
        });

        n3.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int coun, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int star, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    String nota1 = n1.getText().toString();
                    String nota2 = n2.getText().toString();
                    String nota3 = n3.getText().toString();
                    float nro1 = Float.parseFloat(nota1);
                    float nro2 = Float.parseFloat(nota2);
                    float nro3 = Float.parseFloat(nota3);
                    if(nro3 <= 5 && nro3 >= 0)
                    {
                        double result = (((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4);
                        String resultado = String.valueOf(result);
                        tv5.setText(resultado);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(Main3Activity.this,"El Numero Debe Ser Entre 1 y 5", Toast.LENGTH_LONG);
                        notificacion.show();

                    }

                } catch (Exception e) {
                    if (n1.getText().toString().equals("") || (n2.getText().toString().equals("") || (n3.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(Main3Activity.this, "Se Necesita Llegar Todos Los Campos", Toast.LENGTH_LONG);
                        notification.show();
                    }
                }
            }
        });

        // ONCHANGE MATERIA 6
        n1A.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                try {
                    String nota1 = n1A.getText().toString();
                    String nota2 = n2B.getText().toString();
                    String nota3 = n3C.getText().toString();
                    float nro1 = Float.parseFloat(nota1);
                    float nro2 = Float.parseFloat(nota2);
                    float nro3 = Float.parseFloat(nota3);
                    if(nro1 <= 5 && nro1 >= 0)
                    {
                        double result = (((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4);
                        String resultado = String.valueOf(result);
                        tv6.setText(resultado);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(Main3Activity.this,"El Numero Debe Ser Entre 1 y 5", Toast.LENGTH_LONG);
                        notificacion.show();

                    }

                } catch (Exception e) {
                    if (n1A.getText().toString().equals("") || (n2B.getText().toString().equals("") || (n3C.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(Main3Activity.this, "Ningun Campo Debe Estar Vacio", Toast.LENGTH_LONG);
                        notification.show();
                    }
                }
            }
        });

        n2B.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int coun, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int star, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    String nota1 = n1A.getText().toString();
                    String nota2 = n2B.getText().toString();
                    String nota3 = n3C.getText().toString();
                    float nro1 = Float.parseFloat(nota1);
                    float nro2 = Float.parseFloat(nota2);
                    float nro3 = Float.parseFloat(nota3);
                    if(nro2 <= 5 && nro2 >= 0)
                    {
                        double result = (((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4);
                        String resultado = String.valueOf(result);
                        tv6.setText(resultado);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(Main3Activity.this,"El Numero Debe Ser Entre 1 y 5", Toast.LENGTH_LONG);
                        notificacion.show();

                    }

                } catch (Exception e) {
                    if (n1A.getText().toString().equals("") || (n2B.getText().toString().equals("") || (n3C.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(Main3Activity.this, "Ningun Campo Debe Estar Vacio", Toast.LENGTH_LONG);
                        notification.show();
                    }
                }
            }
        });

        n3C.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int coun, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int star, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    String nota1 = n1A.getText().toString();
                    String nota2 = n2B.getText().toString();
                    String nota3 = n3C.getText().toString();
                    float nro1 = Float.parseFloat(nota1);
                    float nro2 = Float.parseFloat(nota2);
                    float nro3 = Float.parseFloat(nota3);
                    if(nro3 <= 5 && nro3 >= 0)
                    {
                        double result = (((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4);
                        String resultado = String.valueOf(result);
                        tv6.setText(resultado);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(Main3Activity.this,"El Numero Debe Ser Entre 1 y 5", Toast.LENGTH_LONG);
                        notificacion.show();

                    }

                } catch (Exception e) {
                    if (n1A.getText().toString().equals("") || (n2B.getText().toString().equals("") || (n3C.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(Main3Activity.this, "Ningun Campo Debe Estar Vacio", Toast.LENGTH_LONG);
                        notification.show();
                    }
                }
            }
        });

        // ONCHANGE MATERIA 7
        nA.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                try {
                    String nota1 = nA.getText().toString();
                    String nota2 = nB.getText().toString();
                    String nota3 = nC.getText().toString();
                    float nro1 = Float.parseFloat(nota1);
                    float nro2 = Float.parseFloat(nota2);
                    float nro3 = Float.parseFloat(nota3);
                    if(nro1 <= 5 && nro1 >= 0)
                    {
                        double result = (((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4);
                        String resultado = String.valueOf(result);
                        tv7.setText(resultado);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(Main3Activity.this,"El Numero Debe Ser Entre 1 y 5", Toast.LENGTH_LONG);
                        notificacion.show();

                    }

                } catch (Exception e) {
                    if (nA.getText().toString().equals("") || (nB.getText().toString().equals("") || (nC.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(Main3Activity.this, "Se Necesita Llegar Todos Los Campos", Toast.LENGTH_LONG);
                        notification.show();
                    }
                }
            }
        });

        nB.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int coun, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int star, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    String nota1 = nA.getText().toString();
                    String nota2 = nB.getText().toString();
                    String nota3 = nC.getText().toString();
                    float nro1 = Float.parseFloat(nota1);
                    float nro2 = Float.parseFloat(nota2);
                    float nro3 = Float.parseFloat(nota3);
                    if(nro2 <= 5 && nro2 >= 0)
                    {
                        double result = (((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4);
                        String resultado = String.valueOf(result);
                        tv7.setText(resultado);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(Main3Activity.this,"El Numero Debe Ser Entre 1 y 5", Toast.LENGTH_LONG);
                        notificacion.show();

                    }

                } catch (Exception e) {
                    if (nA.getText().toString().equals("") || (nB.getText().toString().equals("") || (nC.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(Main3Activity.this, "Se Necesita Llegar Todos Los Campos", Toast.LENGTH_LONG);
                        notification.show();
                    }

                }
            }
        });

        nC.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int coun, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int star, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {


                    String nota1 = nA.getText().toString();
                    String nota2 = nB.getText().toString();
                    String nota3 = nC.getText().toString();
                    float nro1 = Float.parseFloat(nota1);
                    float nro2 = Float.parseFloat(nota2);
                    float nro3 = Float.parseFloat(nota3);

                    if(nro3 <= 5 && nro3 >= 0)
                    {
                        double result = (((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4);
                        String resultado = String.valueOf(result);
                        tv7.setText(resultado);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(Main3Activity.this,"El Numero Debe Ser Entre 1 y 5", Toast.LENGTH_LONG);
                        notificacion.show();

                    }


                } catch (Exception e) {
                    if (nA.getText().toString().equals("") || (nB.getText().toString().equals("") || (nC.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(Main3Activity.this, "Se Necesita Llegar Todos Los Campos", Toast.LENGTH_LONG);
                        notification.show();
                    }
                }
            }
        });
    }



    public void calcularpromedio(View view)
    {

        try {
            float t1, t2, t3, t4, t5, t6, t7, PM;
            t1 = Float.parseFloat(tv1.getText().toString());
            t2 = Float.parseFloat(tv2.getText().toString());
            t3 = Float.parseFloat(tv3.getText().toString());
            t4 = Float.parseFloat(tv4.getText().toString());
            t5 = Float.parseFloat(tv5.getText().toString());
            t6 = Float.parseFloat(tv6.getText().toString());
            t7 = Float.parseFloat(tv7.getText().toString());


            PM = (t1 + t2 + t3 + t4 + t5 + t6 + t7) / 7;

            //REDONDEO DE UN NUMERO Usando String.Format
            tvpromedio.setText(String.format("%.2f", PM));

        } catch (Exception e) {


            Toast notification = Toast.makeText(Main3Activity.this, "Se Necesita Llenar Materia ", Toast.LENGTH_LONG);
            notification.show();

        }
    }


    public void informacion(View view) {
        Intent i = new Intent(this, Main4Activity.class);
        startActivity(i);

    }

    public void recuperar(View view) {
        SharedPreferences preferencias = getSharedPreferences("DATOS",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencias.edit();
        editor.putString("nota1A",nota1A.getText().toString());
        editor.putString("nota2B",nota2B.getText().toString());
        editor.putString("nota3C",nota3C.getText().toString());
        editor.putString("nota1AA",nota1A1.getText().toString());
        editor.putString("nota2BB",nota2B1.getText().toString());
        editor.putString("nota3CC",nota3C1.getText().toString());
        editor.putString("nota1AAA",n1.getText().toString());
        editor.putString("nota2BBB",n2.getText().toString());
        editor.putString("nota3CCC",n3.getText().toString());
        editor.putString("nota1A1",nota1AAA.getText().toString());
        editor.putString("nota2B1",nota2BBB.getText().toString());
        editor.putString("nota3C1",nota3CCC.getText().toString());
        editor.putString("n1",nota1AA.getText().toString());
        editor.putString("n2",nota2BB.getText().toString());
        editor.putString("n3",nota3CC.getText().toString());
        editor.putString("n1A",n1A.getText().toString());
        editor.putString("n2B",n2B.getText().toString());
        editor.putString("n3C",n3C.getText().toString());
        editor.putString("nA",nA.getText().toString());
        editor.putString("nB",nB.getText().toString());
        editor.putString("nC",nC.getText().toString());

        editor.putString("R1",nC.getText().toString());
        editor.putString("R2",nC.getText().toString());
        editor.putString("R3",nC.getText().toString());
        editor.putString("R4",nC.getText().toString());
        editor.putString("R5",nC.getText().toString());
        editor.putString("R6",nC.getText().toString());
        editor.putString("R7",nC.getText().toString());
        editor.putString("tvpromedio",nC.getText().toString());


        editor.commit();
        finish();
    }



}



