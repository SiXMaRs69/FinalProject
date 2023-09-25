package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.gamestu.model.Game;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        List<Game> games = new ArrayList<Game>();
        Game game = new Game();
        game.setGame_name("ELDEN RING");
        game.setGame_image("https://cdn.wccftech.com/wp-content/uploads/2021/06/ER_KEY-ART-scaled-e1623411764381-2048x1052.jpg");
        game.setGame_type("Action,RPG");
        game.setGame_detail("• A Vast World Full of Excitement\n" +
                "    A vast world where open fields with a variety of situations and huge dungeons with complex and three-dimensional designs are seamlessly connected. As you explore, the joy of discovering unknown and overwhelming threats await you, leading to a high sense of accomplishment.\n" +
                "• Create your Own Character\n" +
                "    In addition to customizing the appearance of your character, you can freely combine the weapons, armor, and magic that you equip. You can develop your character according to your play style, such as increasing your muscle strength to become a strong warrior, or mastering magic.\n" +
                "• An Epic Drama Born from a Myth\n" +
                "    A multilayered story told in fragments. An epic drama in which the various thoughts of the characters intersect in the Lands Between.\n" +
                "• Unique Online Play that Loosely Connects You to Others\n" +
                "    In addition to multiplayer, where you can directly connect with other players and travel together, the game supports a unique asynchronous online element that allows you to feel the presence of others.");
        game.setGame_Dev("FromSoftware Inc.");
        game.setGame_price("1790");
        games.add(game);

        Game game2 = new Game();
        game2.setGame_name("ONE PIECE: PIRATE WARRIORS 4");
        game2.setGame_image("https://th.bing.com/th/id/R.42c7a344eb50e97f878c7634dbc0ff3d?rik=bOgSP5B9m2YWig&pid=ImgRaw&r=0");
        game2.setGame_type("Action");
        game2.setGame_detail("The PIRATE WARRIORS series has successfully combined the popular anime ONE PIECE with the thrilling action of the WARRIORS series to create a worldwide phenomenon selling more than four million copies!\n" +
                "\n" +
                "Based on the concept of \"fighting hordes of enemies while adventuring with trusted allies,\" experience awesome ONE PIECE action lifted straight from the anime!\n" +
                "\n" +
                "ONE PIECE: PIRATE WARRIORS 4 is the latest evolution of PIRATE WARRIORS action! Based on the concept of \"experiencing a real ONE PIECE battlefield,\" buildings will come crashing down during the action and attacks will throw up smoke and dust, placing you in the thick of the ONE PIECE world!\n" +
                "\n" +
                "Injecting fresh elements that couldn't be achieved in previous entries has now realized an even more thrilling brand of PIRATE WARRIORS action!");
        game2.setGame_price("1390");
        game2.setGame_Dev("Koei Tecmo");
        games.add(game2);

        Game game3 = new Game();
        game3.setGame_name("RAFT");
        game3.setGame_image("https://www.yasir252.com/wp-content/uploads/2022/12/download-raft-full-version-pc-game.jpg");
        game3.setGame_price("369");
        game3.setGame_type("Adventure,Indie,Simulation");
        game3.setGame_detail("By yourself or with friends, your mission is to survive an epic oceanic adventure across\n" +
                "a perilous sea! Gather debris to survive, expand your raft and set sail towards forgotten and dangerous islands!\n" +
                "\n" +
                "Trapped on a small raft with nothing but a hook made of old plastic, players awake on a vast,\n" +
                "blue ocean totally alone and with no land in sight! With a dry throat and an empty stomach,\n" +
                "survival will not be easy!\n" +
                "\n" +
                "Raft™ throws you and your friends into an epic adventure out on the big open sea, with the\n" +
                "objective to stay alive, gather resources and build yourself a floating home worthy of\n" +
                "survival.\n" +
                "\n" +
                "Resources are tough to come by at sea: Players will have to make sure to catch whatever debris floats by using their trusty hook and when possible, scavenge the reefs beneath the waves and the islands above.\n" +
                "However, thirst and hunger is not the only danger in the ocean… watch out for the man-\n" +
                "eating shark determined to end your voyage!");
        game3.setGame_Dev("Redbeet Interactive");
        games.add(game3);

        Game game4 = new Game();
        game4.setGame_name("Ultimate Chicken Horse");
        game4.setGame_image("https://th.bing.com/th/id/R.567eaefbb697a0e6e47a19ec43077d0d?rik=i2ACCHD%2bU%2fkYkA&riu=http%3a%2f%2fwww.geekyhobbies.com%2fwp-content%2fuploads%2f2016%2f03%2fUltimate-Chicken-Horse-Logo.png&ehk=0ncz5FmetutujDYV2w%2bPghP0oXLGSpZovo%2fOdBPVcW4%3d&risl=&pid=ImgRaw&r=0");
        game4.setGame_price("300");
        game4.setGame_type("Action,Casual,Indie");
        game4.setGame_detail("Ultimate Chicken Horse is a party platformer where you and your friends build the level as you play, placing deadly traps before trying to reach the end of the level. If you can make it but your friends can't, you score points! Play online or locally with " +
                "your animal buddies and experiment with a wide variety of platforms in all sorts of strange locations to find new ways to mess with your friends.\n" +
                "\n" +
                "Key Features\n" +
                "  -Online, cross-platform, and local play for up to 4 players\n" +
                "  -Unique game flow, from strategic block placement to twitch control platforming\n" +
                "  -18 levels with different features\n" +
                "  -Build and share custom levels\n" +
                "  -Compete for global best times on Challenge levels across all platforms\n" +
                "  -Huge library of blocks to create an infinite variety of levels\n" +
                "  -Customizable rule sets and game modes\n" +
                "  -Shared controller mode to play multiplayer with one controller or keyboard\n" +
                "  -Play as a chicken, horse, sheep, raccoon and other wonderful animals\n" +
                "  -Fun, cartoony art style\n" +
                "  -Sweet funky soundtrack");
        game4.setGame_Dev("Clever Endeavour Games");
        games.add(game4);

        Game game5 = new Game();
        game5.setGame_name("Apex Legends™ ");
        game5.setGame_image("https://assets.vg247.com/current/2019/02/apex_legends_main_art_2.jpg");
        game5.setGame_price("0");
        game5.setGame_detail("Conquer with character in Apex Legends, a free-to-play* Hero shooter where legendary characters with powerful abilities team up to battle for fame & fortune on the fringes of the Frontier.\n" +
                "\n" +
                "Master an ever-growing roster of diverse Legends, deep-tactical squad play, and bold, new innovations that go beyond the Battle Royale experience — all within a rugged world where anything goes. Welcome to the next evolution of Hero Shooter.");
        game5.setGame_Dev("Respawn Entertainment");
        game5.setGame_type("Action,Free to Play");
        games.add(game5);

        Game game6 = new Game();
        game6.setGame_name("EA SPORTS FC™ 24");
        game6.setGame_image("https://www.gottabemobile.com/wp-content/uploads/2023/07/ea-fc-standard-edition-cover-shot-1536x873.jpg");
        game6.setGame_price("1899");
        game6.setGame_detail("EA SPORTS FC™ 24 welcomes you to The World’s Game: the most true-to-football experience ever with HyperMotionV, PlayStyles optimised by Opta, and an enhanced Frostbite™ Engine.");
        game6.setGame_Dev("EA Canada & EA Romania");
        game6.setGame_type("Simulation,Sports");
        games.add(game6);


        Game game7 = new Game();
        game7.setGame_name("WWE 2K23");
        game7.setGame_image("https://th.bing.com/th/id/R.cdb92827c07cceba79af4a94883c1a13?rik=qgXhzxBpPsFzzw&pid=ImgRaw&r=0");
        game7.setGame_price("1499");
        game7.setGame_detail("Expanded features, gorgeous graphics, and the ultimate WWE experience. Hit the ring with a deep roster of WWE Superstars and Legends including Roman Reigns, \"American Nightmare\" Cody Rhodes, Ronda Rousey, Brock Lesnar, \"Stone Cold\" Steve Austin and more!\n" +
                "•2K SHOWCASE: INTERACTIVE SPORTS DOCUMENTARY\n" +
                "    Play through the key moments and toughest opponents of John Cena’s storied 20-year WWE career. And in a franchise-first, take on the role of each marquee opponent - some of WWE’s greatest of all time - as you aim to take down Mr. Hustle, Loyalty, and Respect.\n" +
                "•IT’S WARGAMES\n" +
                "    This fan-favorite action-packed WarGames makes its debut in WWE 2K23 and delivers heart-pounding 3v3 and 4v4 multiplayer mayhem inside two side-by-side rings, surrounded by a double-steel cage!\n"+
                "•DEFINE YOUR FUTURE IN MyRISE\n" +
                "    Walk through the curtains for your WWE debut and shape your career as a WWE Superstar with the decisions you make along the way through distinct storylines - The Lock and The Legacy.\n" +
                "•THE UNIVERSE IS ALL YOURS\n" +
                "    WWE Universe Mode is the ultimate sandbox that puts you in charge of WWE, from Superstar rosters, feuds, champions, weekly shows, and more!\n" +
                "\n" +
                "*Local support for up to 4 players / Online support for up to 8 players");
        game7.setGame_Dev("Visual Concepts");
        game7.setGame_type("Simulation, Sports");
        games.add(game7);

        //ส่ง games ไปให้ MyAdapter
        mAdapter = new MyAdapter(games, this);
        recyclerView.setAdapter(mAdapter);

    }
}