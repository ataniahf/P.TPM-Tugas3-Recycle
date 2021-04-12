package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycle;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("10 Top Songs Library");
        recycle = (RecyclerView) findViewById(R.id.recycleview);
        adapter = new MyAdapter(dataqueue(),getApplicationContext());
        recycle.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,1);
        recycle.setLayoutManager(gridLayoutManager);
    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setHeader("1. Ed-Sheeran - I Don't Care (With Justin Bieber)");
        ob1.setDesc("I'm at a party I don't wanna be at\n" +
                "And I don't ever wear a suit and tie, yeah\n" +
                "Wondering if I could sneak out the back\n" +
                "Nobody's even looking me in my eyes\n" +
                "Then you take my hand\n" +
                "Finish my drink, say, \"Shall we dance?\" (Hell, yeah)\n" +
                "You know I love ya, did I ever tell ya?\n" +
                "You make it better like that\n" +
                "Don't think I fit in at this party\n" +
                "Everyone's got so much to say (Yeah)\n" +
                "I always feel like I'm nobody, mm\n" +
                "Who wants to fit in anyway?\n" +
                "'Cause I don't care when I'm with my baby, yeah\n" +
                "All the bad things disappear\n" +
                "And you're making me feel like maybe I am somebody\n" +
                "I can deal with the bad nights\n" +
                "When I'm with my baby, yeah\n" +
                "Ooh, ooh, ooh, ooh, ooh, ooh\n" +
                "'Cause I don't care as long as you just hold me near\n" +
                "You can take me anywhere\n" +
                "And you're making me feel like I'm loved by somebody\n" +
                "I can deal with the bad nights\n" +
                "When I'm with my baby, yeah\n" +
                "Ooh, ooh, ooh, ooh, ooh, ooh\n" +
                "We at a party we don't wanna be at\n" +
                "Tryna talk, but we can't hear ourselves\n" +
                "Read your lips, I'd rather kiss 'em right back\n" +
                "With all these people all around\n" +
                "I'm crippled with anxiety\n" +
                "But I'm told it's where we're s'posed to be\n" +
                "You know what? It's kinda crazy 'cause I really don't mind\n" +
                "When you make it better like that\n" +
                "Don't think we fit in at this party\n" +
                "Everyone's got so much to say, oh yeah, yeah\n" +
                "When we walked in, I said I'm sorry, mm\n" +
                "But now I think that we should stay\n" +
                "'Cause I don't care when I'm with my baby, yeah\n" +
                "All the bad things disappear\n" +
                "Yeah, you're making me feel like maybe I am somebody\n" +
                "I can deal with the bad nights\n" +
                "When I'm with my baby, yeah\n" +
                "Ooh, ooh, ooh, ooh, ooh, ooh\n" +
                "Oh, yeah, yeah, yeah\n" +
                "'Cause I don't care as long as you just hold me near\n" +
                "You can take me anywhere\n" +
                "Yeah, you're making me feel like I'm loved by somebody\n" +
                "I can deal with the bad nights\n" +
                "When I'm with my baby, yeah\n" +
                "Ooh, ooh, ooh, ooh, ooh, ooh, no\n" +
                "I don't like nobody but you, it's like you're the only one here\n" +
                "I don't like nobody but you, baby, I don't care\n" +
                "I don't like nobody but you, I hate everyone here\n" +
                "I don't like nobody but you, baby, yeah\n" +
                "'Cause I don't care (Don't care)\n" +
                "When I'm with my baby, yeah (Oh yeah)\n" +
                "All the bad things disappear (Disappear)\n" +
                "And you're making me feel like maybe I am somebody (Maybe I'm somebody)\n" +
                "I can deal with the bad nights (With the bad nights)\n" +
                "When I'm with my baby, yeah\n" +
                "Ooh, ooh, ooh, ooh, ooh, ooh (Ooh, yeah, yeah)\n" +
                "'Cause I don't care as long as you just hold me near (Me near)\n" +
                "You can take me anywhere (Anywhere, anywhere)\n" +
                "And you're making me feel like I'm loved by somebody\n" +
                "(I'm loved by somebody, yeah, yeah, yeah)\n" +
                "I can deal with the bad nights\n" +
                "When I'm with my baby, yeah (Oh)\n" +
                "Ooh, ooh, ooh, ooh, ooh, ooh");
        ob1.setImgname(R.drawable.justin);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setHeader("2. Ed-Sheeran - Perfect");
        ob2.setDesc("I found a love for me\n" +
                "Oh darling, just dive right in and follow my lead\n" +
                "Well, I found a girl, beautiful and sweet\n" +
                "Oh, I never knew you were the someone waiting for me\n" +
                "'Cause we were just kids when we fell in love\n" +
                "Not knowing what it was\n" +
                "I will not give you up this time\n" +
                "But darling, just kiss me slow, your heart is all I own\n" +
                "And in your eyes, you're holding mine\n" +
                "Baby, I'm dancing in the dark with you between my arms\n" +
                "Barefoot on the grass, listening to our favourite song\n" +
                "When you said you looked a mess, I whispered underneath my breath\n" +
                "But you heard it, darling, you look perfect tonight\n" +
                "Well I found a woman, stronger than anyone I know\n" +
                "She shares my dreams, I hope that someday I'll share her home\n" +
                "I found a love, to carry more than just my secrets\n" +
                "To carry love, to carry children of our own\n" +
                "We are still kids, but we're so in love\n" +
                "Fighting against all odds\n" +
                "I know we'll be alright this time\n" +
                "Darling, just hold my hand\n" +
                "Be my girl, I'll be your man\n" +
                "I see my future in your eyes\n" +
                "Baby, I'm dancing in the dark, with you between my arms\n" +
                "Barefoot on the grass, listening to our favorite song\n" +
                "When I saw you in that dress, looking so beautiful\n" +
                "I don't deserve this, darling, you look perfect tonight\n" +
                "Baby, I'm dancing in the dark, with you between my arms\n" +
                "Barefoot on the grass, listening to our favorite song\n" +
                "I have faith in what I see\n" +
                "Now I know I have met an angel in person\n" +
                "And she looks perfect\n" +
                "I don't deserve this\n" +
                "You look perfect tonight\n");
        ob2.setImgname(R.drawable.ed);
        holder.add(ob2);

        Model ob3=new Model();
        ob3.setHeader("3. Lukas Graham - Love Someone");
        ob3.setDesc("There are days\n" +
                "I wake up and I pinch myself\n" +
                "You're with me, not someone else\n" +
                "And I'm scared, yeah, I'm still scared\n" +
                "That it's all a dream\n" +
                "'Cause you still look perfect as days go by\n" +
                "Even the worst ones, you make me smile\n" +
                "I'd stop the world if it gave us time\n" +
                "'Cause when you love someone\n" +
                "You open up your heart\n" +
                "When you love someone\n" +
                "You make room\n" +
                "If you love someone\n" +
                "And you're not afraid to lose 'em\n" +
                "You probably never loved someone like I do\n" +
                "You probably never loved someone like I do\n" +
                "When you say\n" +
                "You love the way I make you feel\n" +
                "Everything becomes so real\n" +
                "Don't be scared, no, don't be scared\n" +
                "'Cause you're all I need\n" +
                "And you still look perfect as days go by\n" +
                "Even the worst ones, you make me smile\n" +
                "I'd stop the world if it gave us time\n" +
                "'Cause when you love someone\n" +
                "You open up your heart\n" +
                "When you love someone\n" +
                "You make room\n" +
                "If you love someone\n" +
                "And you're not afraid to lose 'em\n" +
                "You probably never loved someone like I do\n" +
                "You probably never loved someone like I do\n" +
                "All my life\n" +
                "I thought it'd be hard to find\n" +
                "The one 'til I found you\n" +
                "And I find it bittersweet\n" +
                "'Cause you gave me something to lose\n" +
                "But when you love someone\n" +
                "You open up your heart\n" +
                "When you love someone\n" +
                "You make room\n" +
                "If you love someone\n" +
                "And you're not afraid to lose 'em\n" +
                "You probably never loved someone like I do\n" +
                "You probably never loved someone like I do\n" +
                "You probably never loved someone like I do");
        ob3.setImgname(R.drawable.lukas);
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setHeader("4. One Direction - History");
        ob4.setDesc("You gotta help me, I'm losin' my mind\n" +
                "Keep gettin' the feeling you wanna leave this all behind\n" +
                "Thought we were goin' strong, I thought we were holdin' on\n" +
                "Aren't we?\n" +
                "No, they don't teach you this in school\n" +
                "Now my heart's breakin' and I don't know what to do\n" +
                "Thought we were goin' strong, thought we were holdin' on\n" +
                "Aren't we?\n" +
                "You and me got a whole lot of history (oh)\n" +
                "We could be the greatest team that the world has ever seen\n" +
                "You and me got a whole lot of history (oh)\n" +
                "So don't let it go, we can make some more\n" +
                "We can live forever\n" +
                "All of the rumors, all of the fights\n" +
                "But we always find a way to make it out alive\n" +
                "Thought we were goin' strong, thought we were holdin' on\n" +
                "Aren't we?\n" +
                "You and me got a whole lot of history (oh)\n" +
                "We could be the greatest team that the world has ever seen\n" +
                "You and me got a whole lot of history (oh)\n" +
                "So don't let it go, we can make some more\n" +
                "We can live forever\n" +
                "Minibars, expensive cars\n" +
                "Hotel rooms and new tattoos\n" +
                "The good champagne, and private planes\n" +
                "But they don't mean anything\n" +
                "'Cause the truth is out, I realize\n" +
                "That without you here, life is just a lie\n" +
                "This is not the end, this is not the end\n" +
                "We can make it, you know it, you know\n" +
                "You and me got a whole lot of history (oh)\n" +
                "We could be the greatest team that the world has ever seen\n" +
                "You and me got a whole lot of history (oh)\n" +
                "So don't let it go, we can make some more\n" +
                "We can live forever\n" +
                "You and me got a whole lot of history (oh)\n" +
                "We could be the greatest team that the world has ever seen\n" +
                "You and me got a whole lot of history (oh)\n" +
                "So don't let it go, we can make some more\n" +
                "We can live forever\n" +
                "So don't let me go, so don't let me go\n" +
                "We can live forever\n" +
                "Baby, don't you know, baby, don't you know\n" +
                "We can live forever");
        ob4.setImgname(R.drawable.history);
        holder.add(ob4);

        Model ob5=new Model();
        ob5.setHeader("5. Zayn Malik - Dusk Till Dawn (With Sia)");
        ob5.setDesc("Not tryna be indie\n" +
                "Not tryna be cool\n" +
                "Just tryna be in this\n" +
                "Tell me, are you too?\n" +
                "Can you feel where the wind is?\n" +
                "Can you feel it through\n" +
                "All of the windows\n" +
                "Inside this room?\n" +
                "'Cause i wanna touch you baby\n" +
                "And i wanna feel you too\n" +
                "I wanna see the sunrise\n" +
                "On your sins just me and you\n" +
                "Light it up, on the run\n" +
                "Let's make love tonight\n" +
                "Make it up, fall in love, try\n" +
                "But you'll never be alone\n" +
                "I'll be with you from dusk till dawn\n" +
                "I'll be with you from dusk till dawn\n" +
                "Baby, i am right here\n" +
                "I'll hold you when things go wrong\n" +
                "I'll be with you from dusk till dawn\n" +
                "I'll be with you from dusk till dawn\n" +
                "Baby, i am right here\n" +
                "I'll be with you from dusk till dawn\n" +
                "Baby, i am right here\n" +
                "We were shut like a jacket\n" +
                "So do your zip\n" +
                "We would roll down the rapids\n" +
                "To find a wave that fits\n" +
                "Can you feel where the wind is?\n");
        ob5.setImgname(R.drawable.dusk);
        holder.add(ob5);

        Model ob6=new Model();
        ob6.setHeader("6. Shawn Mendes - Monster (With Justin Bieber)");
        ob6.setDesc("You put me on a pedestal and tell me I'm the best\n" +
                "Raise me up into the sky until I'm short of breath (yeah)\n" +
                "Fill me up with confidence, I say what's in my chest\n" +
                "Spill my words and tear me down until there's nothing left\n" +
                "Rearrange the pieces just to fit me with the rest, yeah\n" +
                "But what if I, what if I trip?\n" +
                "What if I, what if I fall?\n" +
                "Then am I the monster?\n" +
                "Just let me know\n" +
                "And what if I, what if I sin?\n" +
                "And what if I, what if I break? Yeah\n" +
                "Then am I the monster? Yeah\n" +
                "Just let me know, yeah, yeah, yeah, yeah\n" +
                "I was 15 when the world put me on a pedestal\n" +
                "I had big dreams of doin' shows and making memories (yeah)\n" +
                "Made some bad moves trying to act cool, upset by their jealousy (uh-uh)\n" +
                "Lifting me up (lifting me up), lifting me up (yeah)\n" +
                "And tearing me down (down), tearing me down (down, down), yeah\n" +
                "I'll take responsibility (ooh) for everything I've done (yeah)\n" +
                "Holding it against me (yeah) like you're the holy one, yeah\n" +
                "I had a chip on my shoulder, had to let it go\n" +
                "'Cause unforgiveness keeps them in control\n" +
                "I came in with good intentions then I let it go\n" +
                "And now I really wanna know\n" +
                "What if I, what if I trip? Oh (oh)\n" +
                "What if I, what if I fall? (I fall)\n" +
                "Then am I the monster? (Am I the monster?)\n" +
                "Just let me know (let me know)\n" +
                "And what if I, what if I sin? (oh)\n" +
                "And what if I, what if I break? Yeah (ooh)\n" +
                "Then am I the monster? (Am I the monster?)\n" +
                "Just let me know\n" +
                "Oh, please just let me know, yeah\n" +
                "Baby, what if I fall down?\n" +
                "Please don't let me fall\n" +
                "Oh, please don't let me fall");
        ob6.setImgname(R.drawable.monster);
        holder.add(ob6);

        Model ob7=new Model();
        ob7.setHeader("7. Camila Cabello - Havana\n");
        ob7.setDesc("Havana, ooh na-na (ayy)\n" +
                "Half of my heart is in Havana, ooh na-na (ayy, ayy)\n" +
                "He took me back to East Atlanta, na-na-na, ah\n" +
                "Oh, but my heart is in Havana (ayy)\n" +
                "There's somethin' 'bout his manners (uh-huh)\n" +
                "Havana, ooh-na-na (uh)\n" +
                "He didn't walk up with that \"how you doin'?\" (uh)\n" +
                "When he came in the room\n" +
                "He said there's a lot of girls I can do with (uh)\n" +
                "But I can't without you\n" +
                "I knew him forever in a minute (hey)\n" +
                "That summer night in June\n" +
                "And papa says he got malo in him (uh)\n" +
                "He got me feelin' like...\n" +
                "Ooh, ooh-ooh-ooh-ooh-ooh-ooh-ooh (ayy)\n" +
                "I knew it when I met him (ayy), I loved him when I left him\n" +
                "Got me feelin' like, ooh, ooh-ooh-ooh-ooh-ooh-ooh-ooh\n" +
                "And then I had to tell him, I had to go\n" +
                "Oh-na-na-na-na-na (woo)\n" +
                "Havana, ooh na-na (ayy, ayy)\n" +
                "Half of my heart is in Havana, ooh na-na (ayy, ayy)\n" +
                "He took me back to East Atlanta, na-na-na (uh huh)\n" +
                "Oh, but my heart is in Havana (ayy)\n" +
                "My heart is in Havana (ayy)\n" +
                "Havana, ooh-na-na\n" +
                "Jeffery, just graduated, fresh on campus, mmm\n" +
                "Fresh out East Atlanta with no manners, damn (fresh out East Atlanta)\n" +
                "Bump on her bumper like a traffic jam\n" +
                "Hey, I was quick to pay that girl like Uncle Sam (here you go, ayy)\n" +
                "Back it on me (back it up)\n" +
                "Shawty cravin' on me, get to eatin' on me (on me)\n" +
                "She waited on me (then what?)\n" +
                "Shawty cakin' on me, got the bacon on me (wait up)\n" +
                "This is history in the makin', on me (on me)\n" +
                "Point blank, close range, that B\n" +
                "If it cost a million, that's me (that's me)\n" +
                "I was gettin' mula, baby\n" +
                "Havana, ooh na-na (ayy, ayy)\n" +
                "Half of my heart is in Havana, ooh na-na (oh, ayy, ayy)\n" +
                "He took me back (uh huh) to East Atlanta, na-na-na (oh, no)\n" +
                "Oh, but my heart is in Havana (ayy)\n" +
                "My heart is in Havana (ayy)\n" +
                "Havana, ooh-na-na");
        ob7.setImgname(R.drawable.havana);
        holder.add(ob7);

        Model ob8=new Model();
        ob8.setHeader("8. Alessia Cara - Scars to Your Beautiful");
        ob8.setDesc("She just wants to be, beautiful\n" +
                "She goes, unnoticed she knows, no limits\n" +
                "She craves, attention she praises, an image\n" +
                "She prays to be, sculpted by the sculptor\n" +
                "Oh, she don't see, the light that's shining\n" +
                "Deeper than the eyes can find it\n" +
                "Maybe we have made her blind\n" +
                "So she tries to cover up her pain\n" +
                "And cut her woes away\n" +
                "'Cause covergirls don't cry\n" +
                "After their face is made\n" +
                "But there's a hope that's waiting for you in the dark\n" +
                "You should know you're beautiful just the way you are\n" +
                "And you don't have to change a thing\n" +
                "The world could change its heart\n" +
                "No scars to your beautiful\n" +
                "We're stars and we're beautiful\n" +
                "Oh-oh-oh-oh\n" +
                "Oh-oh-oh-oh\n" +
                "And you don't have to change a thing\n" +
                "The world could change its heart\n" +
                "No scars to your beautiful\n" +
                "We're stars and we're beautiful\n" +
                "She has dreams to be an envy, so she's starving\n" +
                "You know, covergirls eat nothing\n" +
                "She says, beauty is pain and there's beauty in everything\n" +
                "What's a little bit of hunger?\n" +
                "I could go a little while longer, she fades away\n" +
                "She don't see her perfect\n" +
                "She don't understand she's worth it\n" +
                "Or that beauty goes deeper than the surface\n" +
                "Oh-oh, oh-oh\n" +
                "So to all the girls that's hurting\n" +
                "Let me be your mirror\n" +
                "Help you see a little bit clearer\n" +
                "The light that shines within\n" +
                "There's a hope that's waiting for you in the dark\n" +
                "You should know you're beautiful just the way you are\n" +
                "And you don't have to change a thing\n" +
                "The world could change its heart\n" +
                "No scars to your beautiful\n" +
                "We're stars and we're beautiful\n" +
                "Oh-oh-oh-oh, oh-oh\n" +
                "Oh-oh-oh-oh-oh\n" +
                "And you don't have to change a thing\n" +
                "The world could change its heart\n" +
                "No scars to your beautiful\n" +
                "We're stars and we're beautiful\n" +
                "No better you than the you that you are\n" +
                "(No better you than the you that you are)\n" +
                "No better life than the life we're living\n" +
                "(No better life than the life we're living)\n" +
                "No better time for your shine, you're a star\n" +
                "(No better time for your shine, you're a star)\n" +
                "Oh, you're beautiful, oh, you're beautiful\n" +
                "There's a hope that's waiting for you in the dark\n" +
                "You should know you're beautiful just the way you are\n" +
                "And you don't have to change a thing\n" +
                "The world could change its heart\n" +
                "No scars to your beautiful\n" +
                "We're stars and we're beautiful\n" +
                "Oh-oh-oh-oh\n" +
                "Oh-oh-oh-oh-oh\n" +
                "And you don't have to change a thing\n" +
                "The world could change its heart\n" +
                "No scars to your beautiful\n" +
                "We're stars and we're beautiful");
        ob8.setImgname(R.drawable.scars);
        holder.add(ob8);

        Model ob9=new Model();
        ob9.setHeader("9. Maroon 5 - Payphone");
        ob9.setDesc("I'm at a payphone trying to call home\n" +
                "All of my change I spent on you\n" +
                "Where have the times gone?\n" +
                "Baby, it's all wrong\n" +
                "Where are the plans we made for two?\n" +
                "Yeah, I, I know it's hard to remember\n" +
                "The people we used to be\n" +
                "It's even harder to picture\n" +
                "That you're not here next to me\n" +
                "You say it's too late to make it\n" +
                "But is it too late to try?\n" +
                "And in our time that you wasted\n" +
                "All of our bridges burned down\n" +
                "I've wasted my nights\n" +
                "You turned out the lights\n" +
                "Now I'm paralyzed\n" +
                "Still stuck in that time, when we called it love\n" +
                "But even the sun sets in paradise\n" +
                "I'm at a payphone, trying to call home\n" +
                "All of my change I spent on you\n" +
                "Where have the times gone?\n" +
                "Baby, it's all wrong\n" +
                "Where are the plans we made for two?\n" +
                "If \"Happy Ever After\" did exist\n" +
                "I would still be holding you like this\n" +
                "All those fairy tales are full of shit\n" +
                "One more fucking love song, I'll be sick\n" +
                "Oh, you turned your back on tomorrow\n" +
                "'Cause you forgot yesterday\n" +
                "I gave you my love to borrow\n" +
                "But you just gave it away\n" +
                "You can't expect me to be fine\n" +
                "I don't expect you to care\n" +
                "I know I've said it before\n" +
                "But all of our bridges burned down\n" +
                "I've wasted my nights\n" +
                "You turned out the lights\n" +
                "Now I'm paralyzed\n" +
                "Still stuck in that time\n" +
                "When we called it love\n" +
                "But even the sun sets in paradise\n" +
                "I'm at a payphone trying to call home\n" +
                "All of my change I spent on you\n" +
                "Where have the times gone?\n" +
                "Baby, it's all wrong\n" +
                "Where are the plans we made for two?\n" +
                "If \"Happy Ever After\" did exist\n" +
                "I would still be holding you like this\n" +
                "And all those fairy tales are full of shit\n" +
                "One more fucking love song, I'll be sick\n" +
                "Now I'm at a payphone\n" +
                "Man, fuck that shit\n" +
                "I'll be out spending all this money\n" +
                "While you sitting 'round wondering\n" +
                "Why it wasn't you who came up from nothing\n" +
                "Made it from the bottom\n" +
                "Now, when you see me I'm stunning\n" +
                "And all of my cars start with a push of a button\n" +
                "Telling me had chances I blew up\n" +
                "Or whatever you call it\n" +
                "Switch the number to my phone\n" +
                "So you never could call it\n" +
                "Don't need my name on my show\n" +
                "You can tell that I'm balling\n" +
                "Swish, what a shame could have got picked\n" +
                "Had a really good game\n" +
                "But you missed your last shot\n" +
                "So you talk about who you see at the top\n" +
                "Or what you could have saw\n" +
                "But sad to say it's over for\n" +
                "Phantom pulled up valet open doors\n" +
                "Wished I'd go away\n" +
                "Got what you was looking for\n" +
                "Now it's me who they want\n" +
                "So you can go and take that\n" +
                "Little piece of shit with you\n" +
                "I'm at a payphone trying to call home\n" +
                "All of my change I spent on you\n" +
                "Where have the times gone?\n" +
                "Baby, it's all wrong\n" +
                "Where are the plans we made for two?\n" +
                "If \"Happy Ever After\" did exist\n" +
                "I would still be holding you like this\n" +
                "All these fairy tales are full of shit\n" +
                "Yeah, one more fucking love song, I'll be sick\n" +
                "Now I'm at a payphone\n");
        ob9.setImgname(R.drawable.payphone);
        holder.add(ob9);

        Model ob10=new Model();
        ob10.setHeader("10. Kodaline - All I Want");
        ob10.setDesc("All I want is nothing more\n" +
                "To hear you knocking at my door\n" +
                "'Cause if I could see your face once more\n" +
                "I could die a happy man I'm sure\n" +
                "But if you loved me\n" +
                "Why'd you leave me?\n" +
                "Take my body\n" +
                "Take my body\n" +
                "All I want is\n" +
                "And all I need is\n" +
                "To find somebody\n" +
                "I'll find somebody\n" +
                "Like you, oh, oh, oh\n" +
                "Oh, oh, oh, oh\n" +
                "You\n" +
                "Like you\n" +
                "But if you loved me\n" +
                "Why'd you leave me?\n" +
                "Take my body\n" +
                "Take my body\n" +
                "All I want is\n" +
                "And all I need is\n" +
                "To find somebody\n" +
                "I'll find somebody\n" +
                "Oh, oh, oh, oh, oh\n" +
                "Oh, oh, oh, oh, oh\n" +
                "Oh, oh, oh, oh, oh, oh, oh\n" +
                "Oh, oh, oh, oh, oh\n" +
                "Oh, oh, oh, oh, oh\n" +
                "Oh, oh, oh, oh, oh, oh, oh\n" +
                "All I want is\n" +
                "And all I need is\n" +
                "To find somebody\n" +
                "I'll find somebody\n" +
                "Like you, oh, oh");
        ob10.setImgname(R.drawable.all);
        holder.add(ob10);

        return holder;
    }


}