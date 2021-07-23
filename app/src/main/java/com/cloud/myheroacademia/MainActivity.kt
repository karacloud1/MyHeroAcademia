package com.cloud.myheroacademia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val heroList = ArrayList<Hero>()
        heroList.add(Hero("Masahirao Ojiro",
            "Tailman","Tail",
            "Ojiro has a very strong tail. That’s it. That’s all you get. It’s an impressive tail, no doubt. Strong and agile; it gives him added endurance, strength, fighting skills, and agility. But that really is it. He also has a criminally boring face and character design... Ojiro is kind of the worst.",
            R.drawable.tailman))
        heroList.add(Hero("Mezo Shoji",
            "Tentacole","Dupli-Arms",
            "Mezo is a big strong man who can duplicate parts of his face – mouth, ears, eyes – at the tips of his tentacles. Uh, great? No, not great. His character design also looks silly and out of place in the MHA universe. But he can also glide, which is cool... if you like gliding.",
            R.drawable.tentacole))
        heroList.add(Hero("Yuga Aoyama",
            "Can’t Stop Twinkling","Navel Laser","Yuga is a delightfully complex character; he actually has a lot of similarities to Bakugo in terms of how his layers are slowly being peeled away as the show progresses. And he has a naval laser. Imagine Cyclops and his optical laser beam, only it looks a lot more weird since it’s shooting right out of his belly. Aside from the fact that his quirk gives him a debilitating stomach-ache, which is also pretty darn weird.",
            R.drawable.cant_stop_twinkling))
        heroList.add(Hero("Rikido Sato",
            "Sugarman","Sugar Rush","Not only does Sato have a very criminally underdeveloped personality as a member of class 1-A, he also has a pretty underwhelming quirk. By eating a lot of sugar, he can exhibit super strength for a few minutes. That’s it! He's basically a 3-year-old hopped up on a bowl of sugary cereal.",
            R.drawable.sugarman))
        heroList.add(Hero("Kyoka Jiro",
        "Earphone Jack","Earphone Jack","Kyoka’s quirk is a bit of an earful. Get it? Because she has earphone jacks that hang from her earlobes which she plugs into objects and channels the sound of her heartbeat into them. Not the coolest quirk, but at least it’d be easy for her to pass the aux cord - she’s got two of ‘em hanging from her ears.",
        R.drawable.earphone_jack))
        heroList.add(
            Hero("Koji Koda",
            "Anima","Anivoice","Koji is the heart of class 1-A in many ways, and having the ability to call on and command any animal is a fantastic quirk! But it’s not higher on this list simply because it can’t stand up against many of the high-level heroes in class 1-A like Todoroki and Bakugo.",
            R.drawable.anima))
        heroList.add(Hero("Hanta Sero",
        "Cellophane","Tape","Tape is the kind of silly and campy superpower that I wish we saw more of - and the fact that Sero has these strange action figure elbows for whatever reason is a weird quirk in and of itself. Just imagine if Spider-Man built web launchers for his forearms … kinda impractical, but highly effective. Just not in comparison with some of the other quirks on this list.",
        R.drawable.cellophane))
        heroList.add(Hero("Mina Ashido",
            "Pinky","Acid","Ashido’s appearance is utterly adorable. Her quirk, however, isn’t the most heroic. There are definitely situations where excreting corrosive acid could be useful, but you’ve got to admit, it’s a limited skill to have.",
        R.drawable.pinky))
        heroList.add(Hero("Momo Yaoyorozu",
        "Creati","Creation","Momo is a decent character, but thanks to her costume and how her powers manifest, she is also a sad excuse for fan service. And her quirk is one that’s generally underused and underwhelming. It could be very cool, but we've never seen it used in a truly clever or experimental way.",
        R.drawable.creati))
        heroList.add(Hero("Minoru Mineta"
        ,"Grape Juice","Pop Off","Despite how generally clever and wholesome My Hero Academia is, the show still insists on a bit of fan service, and it also delights us by presenting a nasty, diaper-wearing perv of a character who’s two feet tall with purple sticky balls for hair. Well played, MHA. While there's some charm to stories with campy silliness, Mineta’s quirk is not just silly, it’s stupid. And he deserves it for being so gross. But it's definitely not the most boring quirk on the list.",
        R.drawable.grape_juice))
        heroList.add(Hero("Denki Kaminari",
        "Chargebolt","Electrification","Electrification is a skill that we’ve seen before in superhero comics. It’s always cool. Denki’s skills aren’t as silly as the lower-ranked quirks on this list, but they’re not particularly cool, exciting, or electrifying either - they're pretty generic, by superhero standards.",
        R.drawable.chargebolt))
        heroList.add(Hero("Eijiro Kirishima",
        "Red Riot","Hardening","Hardening is a staple skill in a lot of superhero fiction. And Pokemon! It’s a useful support skill and one that allows its user some fantastic strength and defensive skills. But it’s not all that interesting. Especially as we’ve seen Eijiro go head-to-head against another hero with an identical quirk during the tournament arc of Season 2. (It was like watching two Metapods go up against each other.)",
        R.drawable.red_riot))
        heroList.add(Hero("Tenya Iida",
        "Ingenium","Engine","Iida is both the father of the group and the comic relief. He’s well-written with some surprising depth of character, and we’re rooting for him to get all the happiness he deserves. But his quirk is certainly not as strong or as useful as the ones ranked higher on this list. Nor are they half as stupid as the ones we've seen so far.",
        R.drawable.ingenium))
        heroList.add(Hero("Tooru Hagakure",
        "Invinsible Girl","İNvisibility","Tooru is an underrated and underutilized character in Class 1-A. Invisibility is always a useful skill to have, especially when it comes to saving people and facing foes in a more strategic fashion. Metal Gear Solid, anyone?",
        R.drawable.invisible_girl))
        heroList.add(
            Hero("Izuku Midoriya",
        "Deku","One For All","Finally, our hero shows up. Deku’s strength-based powers are not the best, nor are they the worst. One For All awards him some very run-of-the-mill abilities that allow him to go toe-to-toe with the strongest foes and come out on top, but they’re not all that exciting or diverse. Still, at least he gets to smash stuff!",
            R.drawable.deku))
        heroList.add(
            Hero("Ochako Uraraka",
        "Uravity","Zero Gravity","Uraraka is just adorable. And her quirk is nothing to be laughed at. At first glance it seems inoffensive but remember, she’s a hero: She will often be placed in situations where she has to disarm a dangerous foe and defend those in peril. Her Zero Gravity powers can do exactly that! They’re defensive and supportive, not your typical explosive or destructive abilities.",
            R.drawable.uravity))
        heroList.add(
            Hero("Fumikage Tokoyami",
        "Tsukuyomi","Dark Shadow","We don’t see enough creative use of shadows in super-powered properties. There’s so much strange potential in them so it’s cool to see My Hero Academia take a character – one who inexplicably looks like a raven – and give him a battle partner with its own consciousness (like the daemons from His Dark Materials) and the ability to fight and defend.",
            R.drawable.tsukuyomi))
        heroList.add(
            Hero("Tsuyu Asui",
            "Froppy","Frog Form","What’s awesome about Tsuyu is how she takes the power of a creepy and villainous X-Men character and shows how adorable and clever it can be. Froppy is less about what she can create, and more what her body is capable of; and when it comes to having powers that can save people from dangerous situations, especially accidents and disasters, her powers are the most versatile.",
            R.drawable.froppy))
        heroList.add(
            Hero("Katsuki Bakugo",
        "Kacchan","Explosion","Bakugo is the Naruto of My Hero Academia: a hot-headed kid with a massive chip on his shoulder. Suitably, his quirk is the power to ignite nitro-glycerine, which he secretes like sweat, causing massive explosions which he can use offensively and for awesome maneuverability. It’s a reckless and potentially dangerous quirk, but a very powerful one to have in a head-to-head fight.",
            R.drawable.kacchan))
        heroList.add(
            Hero("Shoto Todoroki",
        "Shoto Todoroki","Half Cold, Half Hot","Todoroki, the result of a strategic pairing between his #2 ranked hero father and his ice-powered mother, can create and control ice and fire in equal measure. We’ve seen both powers most famously in the X-Men comics for decades, but Todoroki has the best of both worlds. While these powers aren’t all that strange or original, the show has proven time and again how diverse they can be, making Todoroki the strongest member of class 1-A, at least for now.",
            R.drawable.shoto_todoroki))

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager


        val adapter = RecyclerAdapter(heroList)
        recyclerView.adapter = adapter

    }
}