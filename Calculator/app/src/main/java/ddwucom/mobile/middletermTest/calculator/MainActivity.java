/*
과제명: 모바일 소프트웨어 중간과제 - 계산기
분반: 02 분반
학번: 20181009
이름: 전혜인
제출일: 2020년 5월 29일
가산점 항목 모두 구현함 : 1. 버튼 디자인 개선 O
                        2. 오류 처리 O
                        3. 연속 계산 기능 O
*/

package ddwucom.mobile.middletermTest.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnClear, btnPlus, btnSub, btnMul, btnDiv, btnResult, btnPower, btnSin, btnRoot;

    public double num = 0, result = 0;
    public int what = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClear = findViewById(R.id.btnClear);
        btnPlus = findViewById(R.id.btnPlus);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnResult = findViewById(R.id.btnResult);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextClear = (EditText)findViewById(R.id.editText);
                num = 0; result = 0; what = 0;
                editTextClear.getText().clear();
                editTextClear.setHint(btnClear.getHint());
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextPlus = (EditText) findViewById(R.id.editText);
                String textPlus = editTextPlus.getText().toString();
                if(result == 0) {
                    result = Long.parseLong(textPlus);
                }
                else {
                    if (what == 1) {
                        result = result + num;
                    }
                    else if (what == 2 ) {
                        result = result - num;
                    }
                    else if (what == 3 ) {
                        result  = result * num;
                    }
                    else if (what == 4) {
                        if(result == 0) {
                            Toast.makeText(MainActivity.this, "연산 오류", Toast.LENGTH_SHORT).show();

                            EditText editTextClear = (EditText)findViewById(R.id.editText);
                            num = 0; result = 0; what = 0;
                            editTextClear.getText().clear();
                            editTextClear.setHint(btnClear.getHint());
                        }
                        else {
                            result = result / num;
                        }
                    }
                }
                what = 1;
                editTextPlus.getText().clear();
                editTextPlus.setHint(btnPlus.getHint());
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextSub = (EditText) findViewById(R.id.editText);
                String textSub = editTextSub.getText().toString();
                if(result == 0) {
                    result = Long.parseLong(textSub);
                }
                else {
                    if (what == 1) {
                        result = result + num;
                    }
                    else if (what == 2 ) {
                        result = result - num;
                    }
                    else if (what == 3 ) {
                        result  = result * num;
                    }
                    else if (what == 4) {
                        if(result == 0) {
                            Toast.makeText(MainActivity.this, "연산 오류", Toast.LENGTH_SHORT).show();

                            EditText editTextClear = (EditText)findViewById(R.id.editText);
                            num = 0; result = 0; what = 0;
                            editTextClear.getText().clear();
                            editTextClear.setHint(btnClear.getHint());
                        }
                        else {
                            result = result / num;
                        }
                    }
                }
                what = 2;
                editTextSub.getText().clear();
                editTextSub.setHint(btnSub.getHint());
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextMul = (EditText) findViewById(R.id.editText);
                String textMul = editTextMul.getText().toString();
                if(result == 0) {
                    result = Long.parseLong(textMul);
                }
                else {
                    if (what == 1) {
                        result = result + num;
                    }
                    else if (what == 2 ) {
                        result = result - num;
                    }
                    else if (what == 3 ) {
                        result  = result * num;
                    }
                    else if (what == 4) {
                        if(result == 0) {
                            Toast.makeText(MainActivity.this, "연산 오류", Toast.LENGTH_SHORT).show();

                            EditText editTextClear = (EditText)findViewById(R.id.editText);
                            num = 0; result = 0; what = 0;
                            editTextClear.getText().clear();
                            editTextClear.setHint(btnClear.getHint());
                        }
                        else {
                            result = result / num;
                        }
                    }
                }
                what = 3;
                editTextMul.getText().clear();
                editTextMul.setHint(btnMul.getHint());
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextDiv = (EditText) findViewById(R.id.editText);
                String textDiv = editTextDiv.getText().toString();
                if(result == 0) {
                    result = Long.parseLong(textDiv);
                }
                else {
                    if (what == 1) {
                        result = result + num;
                    }
                    else if (what == 2 ) {
                        result = result - num;
                    }
                    else if (what == 3 ) {
                        result  = result * num;
                    }
                    else if (what == 4) {
                        if(result == 0) {
                            Toast.makeText(MainActivity.this, "연산 오류", Toast.LENGTH_SHORT).show();

                            EditText editTextClear = (EditText)findViewById(R.id.editText);
                            num = 0; result = 0; what = 0;
                            editTextClear.getText().clear();
                            editTextClear.setHint(btnClear.getHint());
                        }
                        else {
                            result = result / num;
                        }
                    }
                }
                what = 4;
                editTextDiv.getText().clear();
                editTextDiv.setHint(btnDiv.getHint());
            }
        });

        btnResult.setOnClickListener(myClickListener);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.regular:
                setContentView(R.layout.activity_main);
                item.setChecked(true);
                break;
            case R.id.math:
                setContentView(R.layout.math_calculator);

                btnClear = findViewById(R.id.btnClear);
                btnPlus = findViewById(R.id.btnPlus);
                btnSub = findViewById(R.id.btnSub);
                btnMul = findViewById(R.id.btnMul);
                btnDiv = findViewById(R.id.btnDiv);
                btnResult = findViewById(R.id.btnResult);
                btnPower = findViewById(R.id.btnPower);
                btnRoot = findViewById(R.id.btnRoot);
                btnSin = findViewById(R.id.btnSin);

                btnClear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText editTextClear = (EditText)findViewById(R.id.editText);
                        num = 0; result = 0; what = 0;
                        editTextClear.getText().clear();
                        editTextClear.setHint(btnClear.getHint());
                    }
                });

                btnPlus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText editTextPlus = (EditText) findViewById(R.id.editText);
                        String textPlus = editTextPlus.getText().toString();
                        if(result == 0) {
                            result = Long.parseLong(textPlus);
                        }
                        else {
                            if (what == 1) {
                                result = result + num;
                            }
                            else if (what == 2 ) {
                                result = result - num;
                            }
                            else if (what == 3 ) {
                                result  = result * num;
                            }
                            else if (what == 4) {
                                if(result == 0) {
                                    Toast.makeText(MainActivity.this, "연산 오류", Toast.LENGTH_SHORT).show();

                                    EditText editTextClear = (EditText)findViewById(R.id.editText);
                                    num = 0; result = 0; what = 0;
                                    editTextClear.getText().clear();
                                    editTextClear.setHint(btnClear.getHint());
                                }
                                else {
                                    result = result / num;
                                }
                            }
                        }
                        what = 1;
                        editTextPlus.getText().clear();
                        editTextPlus.setHint(btnPlus.getHint());
                    }
                });

                btnSub.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText editTextSub = (EditText) findViewById(R.id.editText);
                        String textSub = editTextSub.getText().toString();
                        if(result == 0) {
                            result = Long.parseLong(textSub);
                        }
                        else {
                            if (what == 1) {
                                result = result + num;
                            }
                            else if (what == 2 ) {
                                result = result - num;
                            }
                            else if (what == 3 ) {
                                result  = result * num;
                            }
                            else if (what == 4) {
                                if(result == 0) {
                                    Toast.makeText(MainActivity.this, "연산 오류", Toast.LENGTH_SHORT).show();

                                    EditText editTextClear = (EditText)findViewById(R.id.editText);
                                    num = 0; result = 0; what = 0;
                                    editTextClear.getText().clear();
                                    editTextClear.setHint(btnClear.getHint());
                                }
                                else {
                                    result = result / num;
                                }
                            }
                        }
                        what = 2;
                        editTextSub.getText().clear();
                        editTextSub.setHint(btnSub.getHint());
                    }
                });

                btnMul.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText editTextMul = (EditText) findViewById(R.id.editText);
                        String textMul = editTextMul.getText().toString();
                        if(result == 0) {
                            result = Long.parseLong(textMul);
                        }
                        else {
                            if (what == 1) {
                                result = result + num;
                            }
                            else if (what == 2 ) {
                                result = result - num;
                            }
                            else if (what == 3 ) {
                                result  = result * num;
                            }
                            else if (what == 4) {
                                if(result == 0) {
                                    Toast.makeText(MainActivity.this, "연산 오류", Toast.LENGTH_SHORT).show();

                                    EditText editTextClear = (EditText)findViewById(R.id.editText);
                                    num = 0; result = 0; what = 0;
                                    editTextClear.getText().clear();
                                    editTextClear.setHint(btnClear.getHint());
                                }
                                else {
                                    result = result / num;
                                }
                            }
                        }
                        what = 3;
                        editTextMul.getText().clear();
                        editTextMul.setHint(btnMul.getHint());
                    }
                });

                btnDiv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText editTextDiv = (EditText) findViewById(R.id.editText);
                        String textDiv = editTextDiv.getText().toString();
                        if(result == 0) {
                            result = Long.parseLong(textDiv);
                        }
                        else {
                            if (what == 1) {
                                result = result + num;
                            }
                            else if (what == 2 ) {
                                result = result - num;
                            }
                            else if (what == 3 ) {
                                result  = result * num;
                            }
                            else if (what == 4) {
                                if(result == 0) {
                                    Toast.makeText(MainActivity.this, "연산 오류", Toast.LENGTH_SHORT).show();

                                    EditText editTextClear = (EditText)findViewById(R.id.editText);
                                    num = 0; result = 0; what = 0;
                                    editTextClear.getText().clear();
                                    editTextClear.setHint(btnClear.getHint());
                                }
                                else {
                                    result = result / num;
                                }
                            }
                        }
                        what = 4;
                        editTextDiv.getText().clear();
                        editTextDiv.setHint(btnDiv.getHint());
                    }
                });

                btnPower.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText editTextPower = (EditText) findViewById(R.id.editText);
                        String textPower = editTextPower.getText().toString();
                        result = Long.parseLong(textPower);
                        what = 5;
                        editTextPower.getText().clear();
                        editTextPower.setHint(btnPower.getHint());
                    }
                });
                btnRoot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText editTextRoot = (EditText) findViewById(R.id.editText);
                        String textRoot = editTextRoot.getText().toString();
                        result = Long.parseLong(textRoot);
                        what = 6;
                        editTextRoot.getText().clear();
                        editTextRoot.setHint(btnRoot.getHint());
                    }
                });
                btnSin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText editTextSin = (EditText) findViewById(R.id.editText);
                        String textSin = editTextSin.getText().toString();
                        result = Long.parseLong(textSin);
                        what = 7;
                        editTextSin.getText().clear();
                        editTextSin.setHint(btnSin.getHint());
                    }
                });

                btnResult.setOnClickListener(myClickListener);

                item.setChecked(true);
                break;
        }
        return true;
    }


    View.OnClickListener myClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText editTextResult = (EditText) findViewById(R.id.editText);
            String textResult = editTextResult.getText().toString();
            if (what == 1) {
                result = result + num;
                editTextResult.setText(Double.toString( result));
            }
            else if (what == 2 ) {
                result = result - num;
                editTextResult.setText(Double.toString( result));
            }
            else if (what == 3 ) {
                result  = result * num;
                editTextResult.setText(Double.toString( result));
            }
            else if (what == 4) {
                if(result == 0) {
                    Toast.makeText(MainActivity.this, "연산 오류", Toast.LENGTH_SHORT).show();

                    EditText editTextClear = (EditText)findViewById(R.id.editText);
                    num = 0; result = 0; what = 0;
                    editTextClear.getText().clear();
                    editTextClear.setHint(btnClear.getHint());
                }
                else {
                    result = result / num;
                    editTextResult.setText(Double.toString( result));
                }
            }
            else if (what == 5) {
                result =  Math.pow(result, num);
                editTextResult.setText(Double.toString( result));
            }
            else if (what == 6) {
                result = Math.sqrt(result);
                editTextResult.setText(Double.toString( result));
            }
            else if (what == 7) {
                result = Math.sin(Math.toRadians(result));
                editTextResult.setText(Double.toString( result));
            }
            else if (what == 0 ) {
                Toast.makeText(MainActivity.this, "연산 순서 오류", Toast.LENGTH_SHORT).show();

                EditText editTextClear = (EditText)findViewById(R.id.editText);
                num = 0; result = 0; what = 0;
                editTextClear.getText().clear();
                editTextClear.setHint(btnClear.getHint());

            }
        }
    };


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                EditText editText0 = (EditText) findViewById(R.id.editText);
                String text0 = editText0.getText().toString() + "0";
                editText0.setText(text0);
                num = Long.parseLong(text0);
                break;
            case R.id.btn1:
                EditText editText1 = (EditText) findViewById(R.id.editText);
                String text1 = editText1.getText().toString() + "1";
                num = Long.parseLong(text1);
                editText1.setText(text1);
                break;
            case R.id.btn2:
                EditText editText2 = (EditText) findViewById(R.id.editText);
                String text2 = editText2.getText().toString() + "2";
                editText2.setText(text2);
                num = Long.parseLong(text2);
                break;
            case R.id.btn3:
                EditText editText3 = (EditText) findViewById(R.id.editText);
                String text3 = editText3.getText().toString() + "3";
                editText3.setText(text3);
                num = Long.parseLong(text3);
                break;
            case R.id.btn4:
                EditText editText4 = (EditText) findViewById(R.id.editText);
                String text4 = editText4.getText().toString() + "4";
                editText4.setText(text4);
                num = Long.parseLong(text4);
                break;
            case R.id.btn5:
                EditText editText5 = (EditText) findViewById(R.id.editText);
                String text5 = editText5.getText().toString() + "5";
                editText5.setText(text5);
                num = Long.parseLong(text5);
                break;
            case R.id.btn6:
                EditText editText6 = (EditText) findViewById(R.id.editText);
                String text6 = editText6.getText().toString() + "6";
                editText6.setText(text6);
                num = Long.parseLong(text6);
                break;
            case R.id.btn7:
                EditText editText7 = (EditText) findViewById(R.id.editText);
                String text7 = editText7.getText().toString() + "7";
                editText7.setText(text7);
                num = Long.parseLong(text7);
                break;
            case R.id.btn8:
                EditText editText8 = (EditText) findViewById(R.id.editText);
                String text8 = editText8.getText().toString() + "8";
                editText8.setText(text8);
                num = Long.parseLong(text8);
                break;
            case R.id.btn9:
                EditText editText9 = (EditText) findViewById(R.id.editText);
                String text9 = editText9.getText().toString() + "9";
                editText9.setText(text9);
                num = Long.parseLong(text9);
                break;
        }
    }
}
