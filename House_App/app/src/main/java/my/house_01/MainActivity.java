package my.house_01;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Dialog;

//shift + F6 눌러서 변수 한번에 바꾸기

public class MainActivity extends AppCompatActivity {

    int value;
    View dialogView;


    Button[] strawbutton = new Button[9];
    Button[] tomatobutton = new Button[9];
    Button[] grapebutton = new Button[9];
    Button[] mangobutton = new Button[9];
    Button[] bananabutton = new Button[9];
    Button[] blueberrybutton = new Button[9];
    Button[] pineapplebutton = new Button[9];
    Button[] peachbutton = new Button[9];


    int[] strawcount = new int[9];
    int[] tomatocount = new int[9];
    int[] grapecount = new int[9];
    int[] mangocount = new int[9];
    int[] bananacount = new int[9];
    int[] blueberrycount = new int[9];
    int[] pineapplecount = new int[9];
    int[] peachcount = new int[9];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("과수원 하우스");

        changeView(1);



        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // 프로그레스 바 구현
        value = 50;
        ProgressBar progress = (ProgressBar) findViewById(R.id.progressBar);
        progress.setProgress(value);

        TextView textprogress = (TextView) findViewById (R.id.textprogress);
        textprogress.setText("섭취한 과일 수 : " + value + "개");


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // 딸기


        final Button straw01 = (Button)findViewById(R.id.strawberry);
        straw01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("딸기");
                dlg.setMessage("향도 달콤, 맛도 달콤한 딸기! 비타민 C가 풍부하니 많이 먹어두자");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                //setIcon(R.drawable.check_dialog_64);

                dlg.show();
            }
        });

        /*
        final Button straw01 = (Button)findViewById(R.id.strawberry);
        straw01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                dialogView = (View) View.inflate(MainActivity.this, R.layout.custom, null);

                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("딸기");
                dlg.setView(dialogView);
                dlg.setPositiveButton("닫기", null);
            }
        });
*/






        final Button straw02 = (Button)findViewById(R.id.strawberrycake);
        straw02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("딸기케이크");
                dlg.setMessage("케이크계의 진리중의 진리인 딸기케이크! ");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        final Button straw03 = (Button)findViewById(R.id.strawberrydonut);
        straw03.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("딸기맛도넛");
                dlg.setMessage("상큼한 딸기와 도넛의 만남! 맛없을 수가 없는 믿고먹는 도넛이다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        final Button straw04 = (Button)findViewById(R.id.strawberryicecream);
        straw04.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("딸기아이스크림");
                dlg.setMessage("무더운 여름을 함께할 딸기 아이스크림! 딸기아이스크림 하나면 더위를 시원하게 날릴 수 있다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        final Button straw05 = (Button)findViewById(R.id.strawberryjam);
        straw05.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("딸기잼");
                dlg.setMessage("달콤한 딸기잼은 빵과 함께하면 매우 꿀맛이다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        final Button straw06 = (Button)findViewById(R.id.strawberryjelly);
        straw06.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("딸기맛젤리");
                dlg.setMessage("쫄깃한 딸기맛 젤리! 입이심심할때 먹으면 순식간에 다 먹어 치우는 자신을 볼 수 있다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        final Button straw07 = (Button)findViewById(R.id.strawberryjuice);
        straw07.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("딸기주스");
                dlg.setMessage("갈증을 한방에 없애주는 딸기주스! 상큼하면서도 달달한 주스이다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        final Button straw08 = (Button)findViewById(R.id.strawberrysnack);
        straw08.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("딸기과자");
                dlg.setMessage("바삭바삭한 딸기맛 과자! 군것질로 하나씩 집어먹으면 순식간에 다 먹어 치울 수 있다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        final Button straw09 = (Button)findViewById(R.id.strawberrytarte);
        straw09.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("딸기타르트");
                dlg.setMessage("반죽을 타르트틀에 깔고 과일이나 채소로 채우고 위를 덮지 않아 재료가 그대로 보이게 하는 프랑스식 파이이다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //토마토
        final Button tomato01 = (Button)findViewById(R.id.tomato);
        tomato01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("토마토");
                dlg.setMessage("토마토는 우리말로 '일년감'이라 한다! " +
                        "또한 토마토는 파란 것보다 빨간 것이 건강에 더 유익하므로 완전히 빨갛게 익혀 먹는 것이 좋다 ");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        final Button tomato02 = (Button)findViewById(R.id.tomatocan);
        tomato02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("토마토통조림");
                dlg.setMessage("토마토 통조림은 토마토를 껍질을 벗겨 가열ㆍ살균한 뒤 양철통에 넣고 밀봉 한 것이다." +
                        "토마토 소스 등을 만들 때 쓴다.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        final Button tomato03 = (Button)findViewById(R.id.tomatohamburger);
        tomato03.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("햄버거");
                dlg.setMessage("남녀노소 누구나 좋아하는 햄버거이다. 먹기에 간편할 뿐만 아니라 맛 또한 기가막히다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        final Button tomato04 = (Button)findViewById(R.id.tomatoketchup);
        tomato04.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("토마토케찹");
                dlg.setMessage("잘 익은 토마토를 으깨어 껍질과 씨 등을 없앤 다음 과육과 액즙을 졸여 농축한 것이다. " +
                        "감자튀김이나 계란 후라이 등을 케찹에 찍어먹으면 꿀맛이다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        final Button tomato05 = (Button)findViewById(R.id.tomatosalad);
        tomato05.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("샐러드");
                dlg.setMessage("샐러드는 비타민과 미네랄이 풍부해 컨디션을 조절해 피로를 풀어준다." +
                        " 아침을 샐러드로 간단하게 먹으면 매우 좋다.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button tomato06 = (Button)findViewById(R.id.tomatosalsa);
        tomato06.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("토마토살사");
                dlg.setMessage("토마토의 새콤함과 고추의 매콤함이 조화를 이루는 토마토 살사!" +
                        "고기를 먹거나 빵을 곁들여서 먹기 좋다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button tomato07 = (Button)findViewById(R.id.tomatosandwich);
        tomato07.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("샌드위치");
                dlg.setMessage("얇게 썬 두개의 빵 사이에 육류나 달걀 채동들을 끼워서 먹는 간편한 음식이다.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button tomato08 = (Button)findViewById(R.id.tomatosoupk);
        tomato08.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("토마토수프");
                dlg.setMessage("토마토수프는 토마토와 신선한 야채를 함께 갈아 만드는 것이다" +
                        " 아침에 살짝 구운 바게트에 토마토 수프 한 그릇이면 상쾌한 하루를 시작할 수 있을 것이다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button tomato09 = (Button)findViewById(R.id.tomatospaghetti);
        tomato09.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("토마토 스파게티");
                dlg.setMessage("스파게티 소스 중에서 가장 최고봉은 토마토가 아닐까 싶다. 토마토스파게티는 진리이다.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //포도
        final Button grape01 = (Button)findViewById(R.id.grape);
        grape01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("포도");
                dlg.setMessage("맛있는 과일이지만 씨를 발라먹기가 힘들다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button grape02 = (Button)findViewById(R.id.grapecandy);
        grape02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("포도맛사탕");
                dlg.setMessage("200원이 주는 사소한 행복이다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        final Button grape03 = (Button)findViewById(R.id.grapeicecream);
        grape03.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("포도아이스크림");
                dlg.setMessage("어린시절 누구나 먹어본 포도 아이스크림 시원함이 최고다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button grape04 = (Button)findViewById(R.id.grapewine);
        grape04.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("포도주");
                dlg.setMessage("스테이크와 잘어울린다. 먹는 것만으로도 기품이난다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });final Button grape05 = (Button)findViewById(R.id.grapejam);
        grape05.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("포도잼");
                dlg.setMessage("구운 식빵에 발라먹으면 맛이 일품이다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button grape06 = (Button)findViewById(R.id.grapejelly);
        grape06.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("미리구미");
                dlg.setMessage("탱글하고 상큼한 포도젤리이다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });final Button grape07 = (Button)findViewById(R.id.grapejuice);
        grape07.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("포도피크");
                dlg.setMessage("남녀노소 좋아하는 포도주스이다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button grape08 = (Button)findViewById(R.id.grapemuffin);
        grape08.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("포도향머핀");
                dlg.setMessage("상큼한 포도맛으로 후식으로 먹으면 기분이 좋다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button grape09 = (Button)findViewById(R.id.grapeyorfile);
        grape09.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("그릭요거트포도");
                dlg.setMessage("상큼한 포도맛으로 후식으로 먹으면 기분이 좋다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //망고
        final Button mango01 = (Button)findViewById(R.id.mango);
        mango01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("망고");
                dlg.setMessage("알맹이를 먹을때마다 달콤함이 몰려온다. 하지만 덜익으면 맛이없다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button mango02 = (Button)findViewById(R.id.mangobingsu);
        mango02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("망고빙수");
                dlg.setMessage("얼음에 사르르 녹아내린 망고맛이 일품이다. 더운날 먹기 좋다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button mango03 = (Button)findViewById(R.id.mangocake);
        mango03.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("망고케이크");
                dlg.setMessage("폭신한 케이크 속 망고시럽의 달콤함을 즐길 수 있다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button mango04 = (Button)findViewById(R.id.mangocandy);
        mango04.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("망고사탕");
                dlg.setMessage("200원이 주는 사소한 행복이다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button mango05 = (Button)findViewById(R.id.mangojuice);
        mango05.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("망고피크");
                dlg.setMessage("남녀노소 좋아하는 망고주스이다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button mango06 = (Button)findViewById(R.id.mangoicecream);
        mango06.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("망고아이스크림");
                dlg.setMessage("망고의 진하고 달콤한 맛을 시원한 아이스크림으로 즐길 수 있다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button mango07 = (Button)findViewById(R.id.mangojam);
        mango07.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("망고잼");
                dlg.setMessage("구운 식빵에 발라먹으면 맛이 일품이다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button mango08 = (Button)findViewById(R.id.mangojelly);
        mango08.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("망고맛젤리");
                dlg.setMessage("탱글하고 달콤한 망고젤리이다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button mango09 = (Button)findViewById(R.id.mangoyogurtsmoothie);
        mango09.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("망고요거트스무디");
                dlg.setMessage("요거트 속 망고 알갱이를 먹는 재미가 있다. 학교 카페혜화에서 팔고 있다는 소문이있다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //바나나
        final Button banana01 = (Button)findViewById(R.id.banana);
        banana01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("바나나");
                dlg.setMessage("(맛있으면 바나나~) 원숭이가 밥으로 먹을 수 있을 정도로 포만감이 넘친다. 사람들도 달고 포만감이 넘쳐 좋아하는 과일이다.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button banana02 = (Button)findViewById(R.id.bananabread);
        banana02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("바나나빵");
                dlg.setMessage(" 일본에서 인기가 많았던 빵으로 안에는 바나나맛 크림이 있어서 부드러우면서도 촉촉함! 모양도 바나나모양이어서 귀엽기도 한답니다.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button banana03 = (Button)findViewById(R.id.bananachip);
        banana03.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("바나나칩");
                dlg.setMessage("바나나를 바짝 말린것으로 바삭바삭하면서 부드러워서 텔레비전을 보거나 입이 심심할때 과자 대신으로 먹기에 최고예요.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button banana04 = (Button)findViewById(R.id.bananacrepe);
        banana04.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("바나나크라페");
                dlg.setMessage("얇고 쫀득한 크레페 반죽위에 생크림과 초콜렛 소스를 얹고 그 위에 " +
                        "달콤한 바나나를 올려서 부드러우면서 달콤하고 쫀득하기 까지 하다.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button banana05 = (Button)findViewById(R.id.bananaflanbe);
        banana05.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("바나나플랑베");
                dlg.setMessage("플랑베는 술이나 블랜디를 넣고 살짝 태우는 요리법이다!"+
                        " 바나나를 탕과 술 혹은 블랜디를 넣고 활활 태워주고 마지막으로" +
                        " 바닐라맛 아이스크림을 살~짝 곁들여 먹으면 시원하면서도 달달하니 최고의 요리가 탄생한다. ");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button banana06 = (Button)findViewById(R.id.bananafried);
        banana06.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("바나나튀김");
                dlg.setMessage("중국의 간식으로 바나나를 튀겨 만들었어요~ " +
                        "우리나라의 맛탕같은 존재로 겉은 달콤하고 바삭하며 속은 부드러워 아이들이 좋아한답니다!");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button banana07 = (Button)findViewById(R.id.bananamilk);
        banana07.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("바나나우유");
                dlg.setMessage("어렸을 때 목욕탕에 갔다오면 누구나 한번쯤 먹어봤던 달콤한 바나나맛이 나는 우유예요 ");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button banana08 = (Button)findViewById(R.id.bananapancake);
        banana08.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("바나나팬케이크");
                dlg.setMessage("부드러운 팬케익 비타민이 풍부한 바나나도 올라가 달콤하고 건강도 챙기는 일석이조인 건강한 간식이다.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button banana09 = (Button)findViewById(R.id.bananayogurt);
        banana09.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("바나나요거트");
                dlg.setMessage(" 단맛과 신맛의 만남! 우리 어린이들이 좋아해요~");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //블루베리
        final Button blueberry01 = (Button)findViewById(R.id.blueberry);
        blueberry01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("블루베리");
                dlg.setMessage("포도처럼 생겼으나 눈에도 좋고 식이섬유도 풍부하고 새콤하면서 맛도 좋은 과일");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button blueberry02 = (Button)findViewById(R.id.blueberrybread);
        blueberry02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("블루베리식빵");
                dlg.setMessage("풍부한 버터향과 빵을 씹을수록 톡톡 터지는 과육까지 느낄수 있는 식빵이에요~ ");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button blueberry03 = (Button)findViewById(R.id.blueberrycereal);
        blueberry03.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("블루베리시리얼");
                dlg.setMessage("그냥 먹으면 바삭하고 달콤하며 우유와 같이 먹으면 말캉해져 부드러워 지는 인기만점 간식이예요~");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button blueberry04 = (Button)findViewById(R.id.blueberrycerealbar);
        blueberry04.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("블루베리시리얼바");
                dlg.setMessage("여러 종류의 견과류와 새콤달콤한 블루베리의 조화! 바삭하면서 쫄깃한 식감에 식사 대용으로 먹을 수 있을정도로 포만감도 넘쳐요!");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button blueberry05 = (Button)findViewById(R.id.blueberrycheong);
        blueberry05.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("블루베리청");
                dlg.setMessage("블루베리와 설탕을 넣고 숙성시킨것으로 탄산수와 섞어마시면 블루베리에이드, 물과 마시면 블루베리 차. 여러음료로 변신할 수 있어요!");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button blueberry06 = (Button)findViewById(R.id.blueberryjam);
        blueberry06.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("블루베리잼");
                dlg.setMessage("새콤 달콤하면서 중간에 블루베리가 씹혀서 식빵에 발라먹으면 달콤함이 up!");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button blueberry07 = (Button)findViewById(R.id.blueberrypie);
        blueberry07.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("블루베리파이");
                dlg.setMessage("쫀득한 파이반죽에 블루베리 잼이 만나 쫀득 달콤해요.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button blueberry08 = (Button)findViewById(R.id.blueberrytarte);
        blueberry08.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("블루베리타르트");
                dlg.setMessage("바삭하고 위에 올려진 블루베리가 씹히면 톡톡! 과육이 터져 달콤하기도 해요~ 하나만 먹어도 배가 불러 식사 대용으로도 가능해요~");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button blueberry09 = (Button)findViewById(R.id.blueberryyogurt);
        blueberry09.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("블루베리요거트");
                dlg.setMessage("단맛과 신맛에 블루베리 알맹이의 씹히는 맛까지! 어린이들이 좋아해요~");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //파인애플
        final Button pineapple01 = (Button)findViewById(R.id.pineapple);
        pineapple01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("파인애플");
                dlg.setMessage("상큼한 여름 과일의 대명사. 맛있다고 많이 먹으면 혓바닥이 녹아내릴 수 있으니 주의하자.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button pineapple02 = (Button)findViewById(R.id.pineapplefried);
        pineapple02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("파인애플튀김");
                dlg.setMessage("비주얼이 낯설어서 그렇지 한 번도 안 먹어본 사람은 있어도 한 번만 먹은 사람은 없다고 한다." +
                        " 달콤한 파인애플과 짭짤한 튀김반죽이 한데 어우러져 입맛을 단번에 사로잡는다.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button pineapple03 = (Button)findViewById(R.id.pineapplefriedrice);
        pineapple03.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("파인애플볶음밥");
                dlg.setMessage(" 파인애플의 속을 비워내고 새우를 넣은 볶음밥을 담았다. " +
                        "들리는 소문에 의하면 단짠의 정석과도 같다고 하니 기회가 온다면 꼭 도전해볼 것!");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button pineapple04 = (Button)findViewById(R.id.pineapplehawaiianpizza);
        pineapple04.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("하와이안피자");
                dlg.setMessage("토핑으로 파인애플이 올라갔다. 군데 군데 박힌 파인애플 조각들이 피자의 느끼함을 덜어준다.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button pineapple05 = (Button)findViewById(R.id.pineapplemakgeolli);
        pineapple05.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("파인애플막걸리");
                dlg.setMessage("달콤한 파인애플 맛이 나는 막걸리. 맛있다고 쉬지 않고 마시면 골로 갈 수 있으니 주의하자.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button pineapple06 = (Button)findViewById(R.id.pineapplemilk);
        pineapple06.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("파인애플우유");
                dlg.setMessage("상큼한 파인애플 향이 가득한 우유. 매운 맛을 빠르게 중화시켜주니 매운 음식에 약한 사람들에겐 항상 필수적인 존재라 할 수 있겠다.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button pineapple07 = (Button)findViewById(R.id.pineappleskewered);
        pineapple07.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("파인애플꼬치");
                dlg.setMessage("새콤달콤한 파인애플에 불 맛이 더해져 맛이 한 층 더 깊고 풍부해졌다! 이제 불판에는 귤대신 파인애플을 올리도록 하자.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button pineapple08 = (Button)findViewById(R.id.pineappleslicecan);
        pineapple08.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("파인애플통조림");
                dlg.setMessage("살짝 신 맛이 포인트인 파인애플 통조림. 한 조각 먹고나면 방금 먹은 저녁이 소화되는 것 같은 느낌이 든다.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button pineapple09 = (Button)findViewById(R.id.pineapplesteak);
        pineapple09.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("파인애플스테이크");
                dlg.setMessage("오늘의 리빙포인트. 스테이크 한 조각에 구운 파인애플을 곁들여 먹으면 잠시나마 천국을 경험할 수 있다.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //복숭아
        final Button peach01 = (Button)findViewById(R.id.peach);
        peach01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("복숭아");
                dlg.setMessage("당신의 취향은? 물렁물렁한 복숭아 vs 단단한 복숭아. 참고로 저는 둘 다 좋아한답니다 ^^7");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button peach02 = (Button)findViewById(R.id.peachbread);
        peach02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("복숭아식빵");
                dlg.setMessage("복숭아 식빵에 복숭아 잼을 발라먹으면 을매나 맛있게요? 참고로 식빵에 박혀있는 것은 곰팡이가 아니라 복숭아 알갱이다. . .");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button peach03 = (Button)findViewById(R.id.peachcan);
        peach03.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("복숭이통조림");
                dlg.setMessage("자고로 이 통조림을 먹을 때, 국물까지 남기지 않고 다 마시는 사람이 일류라고 하였다.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button peach04 = (Button)findViewById(R.id.peachicecream);
        peach04.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("복숭아아이스크림");
                dlg.setMessage("어린 시절부터 우리 곁을 지키고 있는 국민 복숭아 아이스크림. 딱 요맘 때 먹고 싶어진다.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button peach05 = (Button)findViewById(R.id.peachicetea);
        peach05.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("복숭아아이스티");
                dlg.setMessage("아이스티는 역시 레몬보단 복숭아");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button peach06 = (Button)findViewById(R.id.peachmuffin);
        peach06.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("복숭아머핀");
                dlg.setMessage("촉촉한 케이크와 달콤한 크림, 향긋한 복숭아가 만났다! 디저트로 아주 훌륭하다.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button peach07 = (Button)findViewById(R.id.peachpie);
        peach07.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("복숭아파이");
                dlg.setMessage("복숭아가 잔뜩 올려져 있는 파이다. 한 입 베어물면 복숭아 향이 입 안에 가득 퍼진다.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button peach08 = (Button)findViewById(R.id.peachpudding);
        peach08.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("복숭아푸딩");
                dlg.setMessage("탱글탱글한 복숭아 푸딩. 복숭아 알갱이가 입 안에서 톡톡 터진다.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
        final Button peach09 = (Button)findViewById(R.id.peachsmoothie);
        peach09.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("복숭아스무디");
                dlg.setMessage("달달한 복숭아와 상큼한 요거트의 완벽한 조화! 날이 더울수록 더 땡긴다. 카페혜X에서 팔고있다는 소문이 있다.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //물음표로 나타내기

        strawbutton = new Button[]{straw01,straw02,straw03,straw04,straw05,straw06,straw07,straw08,straw09};
        tomatobutton = new Button[]{tomato01,tomato02,tomato03,tomato04,tomato05,tomato06,tomato07,tomato08,tomato09};
        grapebutton = new Button[]{grape01,grape02,grape03,grape04,grape05,grape06,grape07,grape08,grape09};
        mangobutton = new Button[]{mango01,mango02,mango03,mango04,mango05,mango06,mango07,mango08,mango09};
        bananabutton = new Button[]{banana01,banana02,banana03,banana04,banana05,banana06,banana07,banana08,banana09};
        blueberrybutton = new Button[]{blueberry01,blueberry02,blueberry03,blueberry04,blueberry05,blueberry06,blueberry07,blueberry08,blueberry09};
        pineapplebutton = new Button[]{pineapple01,pineapple02,pineapple03,pineapple04,pineapple05,pineapple06,pineapple07,pineapple08,pineapple09};
        peachbutton = new Button[]{peach01,peach02,peach03,peach04,peach05,peach06,peach07,peach08,peach09};

        strawcount = new int[]{0,1,0,0,3,0,4,0,0};
        tomatocount = new int[]{0,0,0,0,0,0,0,0,0};
        grapecount = new int[]{0,0,0,0,0,0,0,0,0};
        mangocount = new int[]{0,0,0,0,0,0,0,0,0};
        bananacount = new int[]{0,0,0,0,0,0,0,0,0};
        blueberrycount = new int[]{0,0,0,0,0,0,0,0,0};
        pineapplecount = new int[]{0,0,0,0,0,0,0,0,0};
        peachcount = new int[]{0,0,0,0,0,0,0,0,0};


        for( int i = 0; i>10; i++) {
            if (strawcount[i] == 0) {
                strawbutton[i].setBackgroundResource(R.drawable.hidemark);
            }
            if(tomatocount[i] == 0){
               tomatobutton[i].setBackgroundResource(R.drawable.hidemark);
            }
            if(grapecount[i]==0){
                grapebutton[i].setBackgroundResource(R.drawable.hidemark);
            }
            if(mangocount[i] ==0 ){
                mangobutton[i].setBackgroundResource(R.drawable.hidemark);
            }
            if(bananacount[i] == 0){
                bananabutton[i].setBackgroundResource(R.drawable.hidemark);
            }
            if(blueberrycount[i]==0){
                blueberrybutton[i].setBackgroundResource(R.drawable.hidemark);
            }
            if(pineapplecount[i]==0){
                pineapplebutton[i].setBackgroundResource(R.drawable.hidemark);
            }
            if(peachcount[i]==0){
                peachbutton[i].setBackgroundResource(R.drawable.hidemark);
            }
        }

        for(int i = 0; i>10; i++){
            if(strawcount[i] >= 1 ){
                strawbutton[0].setBackgroundResource(R.drawable.strawberry);
                strawbutton[1].setBackgroundResource(R.drawable.strawberrycake);
                strawbutton[2].setBackgroundResource(R.drawable.strawberrydonut);
                strawbutton[3].setBackgroundResource(R.drawable.strawberryicecream);
                strawbutton[4].setBackgroundResource(R.drawable.strawberryjam);
                strawbutton[5].setBackgroundResource(R.drawable.strawberryjelly);
                strawbutton[6].setBackgroundResource(R.drawable.strawberryjuice);
                strawbutton[7].setBackgroundResource(R.drawable.strawberrysnacks);
                strawbutton[8].setBackgroundResource(R.drawable.strawberrytart);
            }
            if(tomatocount[i]>=1){
                tomatobutton[0].setBackgroundResource(R.drawable.tomato);
                tomatobutton[1].setBackgroundResource(R.drawable.tomatocan);
                tomatobutton[2].setBackgroundResource(R.drawable.tomatohamburger);
                tomatobutton[3].setBackgroundResource(R.drawable.tomatoketchup);
                tomatobutton[4].setBackgroundResource(R.drawable.tomatosalad);
                tomatobutton[5].setBackgroundResource(R.drawable.tomatosalsa);
                tomatobutton[6].setBackgroundResource(R.drawable.tomatosandwich);
                tomatobutton[7].setBackgroundResource(R.drawable.tomatosoup);
                tomatobutton[8].setBackgroundResource(R.drawable.tomatospaghetti);
            }
            if(grapecount[i]>=1){
                grapebutton[0].setBackgroundResource(R.drawable.grape);
                grapebutton[1].setBackgroundResource(R.drawable.grapecandy);
                grapebutton[2].setBackgroundResource(R.drawable.grapeicecream);
                grapebutton[3].setBackgroundResource(R.drawable.grapejam);
                grapebutton[4].setBackgroundResource(R.drawable.grapejelly);
                grapebutton[5].setBackgroundResource(R.drawable.grapejuice);
                grapebutton[6].setBackgroundResource(R.drawable.grapemuffin);
                grapebutton[7].setBackgroundResource(R.drawable.grapewine);
                grapebutton[8].setBackgroundResource(R.drawable.grapeyorfle);
            }
            if(mangocount[i]>=1){
                mangobutton[0].setBackgroundResource(R.drawable.mango);
                mangobutton[1].setBackgroundResource(R.drawable.mangobingsu);
                mangobutton[2].setBackgroundResource(R.drawable.mangocake);
                mangobutton[3].setBackgroundResource(R.drawable.mangocandy);
                mangobutton[4].setBackgroundResource(R.drawable.mangoicecream);
                mangobutton[5].setBackgroundResource(R.drawable.mangojam);
                mangobutton[6].setBackgroundResource(R.drawable.mangojelly);
                mangobutton[7].setBackgroundResource(R.drawable.mangojuice);
                mangobutton[8].setBackgroundResource(R.drawable.mangoyogurtsmoothie);
            }
            if(bananacount[i]>=1){
                bananabutton[0].setBackgroundResource(R.drawable.banana);
                bananabutton[1].setBackgroundResource(R.drawable.bananabread);
                bananabutton[2].setBackgroundResource(R.drawable.bananachip);
                bananabutton[3].setBackgroundResource(R.drawable.bananacrepe);
                bananabutton[4].setBackgroundResource(R.drawable.bananaflanbe);
                bananabutton[5].setBackgroundResource(R.drawable.bananafried);
                bananabutton[6].setBackgroundResource(R.drawable.bananamilk);
                bananabutton[7].setBackgroundResource(R.drawable.bananapancake);
                bananabutton[8].setBackgroundResource(R.drawable.bananayogurt);
            }
            if(pineapplecount[i]>=1){
                pineapplebutton[0].setBackgroundResource(R.drawable.pineapple);
                pineapplebutton[1].setBackgroundResource(R.drawable.pineapplefried);
                pineapplebutton[2].setBackgroundResource(R.drawable.pineapplefriedrice);
                pineapplebutton[3].setBackgroundResource(R.drawable.pineapplehawaiianpizza);
                pineapplebutton[4].setBackgroundResource(R.drawable.pineapplemakgeolli);
                pineapplebutton[5].setBackgroundResource(R.drawable.pineapplemilk);
                pineapplebutton[6].setBackgroundResource(R.drawable.pineappleskewered);
                pineapplebutton[7].setBackgroundResource(R.drawable.pineappleslicecan);
                pineapplebutton[8].setBackgroundResource(R.drawable.pineapplesteak);
            }
            if(peachcount[i]>=1){
                peachbutton[0].setBackgroundResource(R.drawable.peach);
                peachbutton[1].setBackgroundResource(R.drawable.peachbread);
                peachbutton[2].setBackgroundResource(R.drawable.peachcan);
                peachbutton[3].setBackgroundResource(R.drawable.peachicecream);
                peachbutton[4].setBackgroundResource(R.drawable.peachicetea);
                peachbutton[5].setBackgroundResource(R.drawable.peachmuffin);
                peachbutton[6].setBackgroundResource(R.drawable.peachpie);
                peachbutton[7].setBackgroundResource(R.drawable.peachpudding);
                peachbutton[8].setBackgroundResource(R.drawable.peachsmoothie);
            }
        }



        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        Button button1 = (Button)findViewById(R.id.onePage);
        button1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                changeView(1);
            }
        });
        Button button2 = (Button)findViewById(R.id.twoPage);
        button2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                changeView(2);
            }
        });
        Button button3 = (Button)findViewById(R.id.threePage);
        button3.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                changeView(3);
            }
        });
        Button button4 = (Button)findViewById(R.id.fourPage);
        button4.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                changeView(4);
            }
        });
        Button button5 = (Button)findViewById(R.id.fivePage);
        button5.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                changeView(5);
            }
        });
        Button button6 = (Button)findViewById(R.id.sixPage);
        button6.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                changeView(6);
            }
        });
        Button button7 = (Button)findViewById(R.id.sevenPage);
        button7.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                changeView(7);
            }
        });
        Button button8 = (Button)findViewById(R.id.eightPage);
        button8.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                changeView(8);
            }
        });


    }

    private void changeView(int index){

        TableLayout tableLayout1 = (TableLayout)findViewById(R.id.strawberryTable);
        TableLayout tableLayout2 = (TableLayout)findViewById(R.id.tomatoTable);
        TableLayout tableLayout3 = (TableLayout)findViewById(R.id.grapeTable);
        TableLayout tableLayout4 = (TableLayout)findViewById(R.id.mangoTable);
        TableLayout tableLayout5 = (TableLayout)findViewById(R.id.bananaTable);
        TableLayout tableLayout6 = (TableLayout)findViewById(R.id.blueberryTable);
        TableLayout tableLayout7 = (TableLayout)findViewById(R.id.pineappleTable);
        TableLayout tableLayout8 = (TableLayout)findViewById(R.id.peachTable);


        switch(index){
            case 1:
                tableLayout1.setVisibility(View.VISIBLE);
                tableLayout2.setVisibility(View.INVISIBLE);
                tableLayout3.setVisibility(View.INVISIBLE);
                tableLayout4.setVisibility(View.INVISIBLE);
                tableLayout5.setVisibility(View.INVISIBLE);
                tableLayout6.setVisibility(View.INVISIBLE);
                tableLayout7.setVisibility(View.INVISIBLE);
                tableLayout8.setVisibility(View.INVISIBLE);
                break;
            case 2:
                tableLayout1.setVisibility(View.INVISIBLE);
                tableLayout2.setVisibility(View.VISIBLE);
                tableLayout3.setVisibility(View.INVISIBLE);
                tableLayout4.setVisibility(View.INVISIBLE);
                tableLayout5.setVisibility(View.INVISIBLE);
                tableLayout6.setVisibility(View.INVISIBLE);
                tableLayout7.setVisibility(View.INVISIBLE);
                tableLayout8.setVisibility(View.INVISIBLE);
                break;
            case 3:
                tableLayout1.setVisibility(View.INVISIBLE);
                tableLayout2.setVisibility(View.INVISIBLE);
                tableLayout3.setVisibility(View.VISIBLE);
                tableLayout4.setVisibility(View.INVISIBLE);
                tableLayout5.setVisibility(View.INVISIBLE);
                tableLayout6.setVisibility(View.INVISIBLE);
                tableLayout7.setVisibility(View.INVISIBLE);
                tableLayout8.setVisibility(View.INVISIBLE);
                break;
            case 4:
                tableLayout1.setVisibility(View.INVISIBLE);
                tableLayout2.setVisibility(View.INVISIBLE);
                tableLayout3.setVisibility(View.INVISIBLE);
                tableLayout4.setVisibility(View.VISIBLE);
                tableLayout5.setVisibility(View.INVISIBLE);
                tableLayout6.setVisibility(View.INVISIBLE);
                tableLayout7.setVisibility(View.INVISIBLE);
                tableLayout8.setVisibility(View.INVISIBLE);
                break;
            case 5:
                tableLayout1.setVisibility(View.INVISIBLE);
                tableLayout2.setVisibility(View.INVISIBLE);
                tableLayout3.setVisibility(View.INVISIBLE);
                tableLayout4.setVisibility(View.INVISIBLE);
                tableLayout5.setVisibility(View.VISIBLE);
                tableLayout6.setVisibility(View.INVISIBLE);
                tableLayout7.setVisibility(View.INVISIBLE);
                tableLayout8.setVisibility(View.INVISIBLE);
                break;
            case 6:
                tableLayout1.setVisibility(View.INVISIBLE);
                tableLayout2.setVisibility(View.INVISIBLE);
                tableLayout3.setVisibility(View.INVISIBLE);
                tableLayout4.setVisibility(View.INVISIBLE);
                tableLayout5.setVisibility(View.INVISIBLE);
                tableLayout6.setVisibility(View.VISIBLE);
                tableLayout7.setVisibility(View.INVISIBLE);
                tableLayout8.setVisibility(View.INVISIBLE);
                break;
            case 7:
                tableLayout1.setVisibility(View.INVISIBLE);
                tableLayout2.setVisibility(View.INVISIBLE);
                tableLayout3.setVisibility(View.INVISIBLE);
                tableLayout4.setVisibility(View.INVISIBLE);
                tableLayout5.setVisibility(View.INVISIBLE);
                tableLayout6.setVisibility(View.INVISIBLE);
                tableLayout7.setVisibility(View.VISIBLE);
                tableLayout8.setVisibility(View.INVISIBLE);
                break;
            case 8:
                tableLayout1.setVisibility(View.INVISIBLE);
                tableLayout2.setVisibility(View.INVISIBLE);
                tableLayout3.setVisibility(View.INVISIBLE);
                tableLayout4.setVisibility(View.INVISIBLE);
                tableLayout5.setVisibility(View.INVISIBLE);
                tableLayout6.setVisibility(View.INVISIBLE);
                tableLayout7.setVisibility(View.INVISIBLE);
                tableLayout8.setVisibility(View.VISIBLE);
                break;
        }
    }

}
