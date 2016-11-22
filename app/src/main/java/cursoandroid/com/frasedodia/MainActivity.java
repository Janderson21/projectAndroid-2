package cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView phase;
    private Button generate;
    private String[]  array_phase = {
            "Aonde quer que você vá, nunca esqueça que um simples sorriso pode abrir mais portas do que uma chave mestra.",
            "Você é meu primeiro pensamento do dia, o último e todos os do meio. Bom dia, meu amor!",
            "Prometo amar e cuidar de você em todos os momentos de hoje. Bom dia, meu bem!",
            "Porque todos os problemas têm solução, nenhuma dificuldade na vida será impossível de resolver.",
            "Enquanto tiver você na minha vida sei que meus sonhos serão sempre doces e perfeitos. Boa noite, meu amor!",
            "Algumas pessoas eu preferia não ter conhecido.",
            "Encontrar um amor verdadeiro é o melhor remédio contra o desânimo.",
            "Parece que o sol está brilhando mais que nunca. Bom fim de semana!",
            "O amor, a paz e a perseverança devem ser cultivados diariamente. É uma tarefa árdua, mas sempre faz a diferença.",
            "Hoje acordei com a sensação que o mundo está do meu lado. Vou aproveitar!",
            "Admiro mulheres fortes, daquelas que se valem sozinhas e não precisam de alguém para validar sua existência.",
            "Porque Deus sempre ajuda na hora da aflição, eu Lhe devoto gratidão eterna. Bom dia!",
            "Reconhecer os próprios erros é importante, mas não adianta nada se você não fizer alguma coisa para corrigi-los. Bom dia!",
            "Jesus nos oferece mais um dia para fazermos o bem. Bom dia!",
            "Que hoje o meu dia entardeça ao lado da pessoa que nunca tarda em me amar. Boa tarde, querida namorada!",
            "Feliz é a pessoa que aprende a colocar a felicidade dos outros em primeiro lugar. Boa tarde!",
            "A cada passo em frente que você dá, uma novo estrada se abre para caminhar. Boa tarde!",
            "Desejo uma noite de paz, daquelas em que não acorda com vontade de ir no banheiro. Boa noite!",
            "Que a escuridão da noite substitua o medo de errar pela coragem de tentar coisas novas e triunfar! Tenha uma boa noite!",
            "Esvazie a mente dos problemas do passado e tenha esperança nas soluções do futuro! Boa noite."
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phase = (TextView) findViewById(R.id.text_selected);
        generate = (Button) findViewById(R.id.generate_phase);
        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int size_array = array_phase.length;
                Random random = new Random();
                int num_random = random.nextInt(size_array);
                phase.setText(array_phase[num_random]);
            }
        });
    }
}
