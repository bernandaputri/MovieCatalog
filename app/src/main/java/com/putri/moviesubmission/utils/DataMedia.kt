package com.putri.moviesubmission.utils

import com.putri.moviesubmission.R
import com.putri.moviesubmission.data.MediaEntity

object DataMedia {

    fun setDataMovie() : List<MediaEntity> {

        val movies = ArrayList<MediaEntity>()

        movies.add(MediaEntity(
                "m1",
                "A Star is Born",
                "Drama, Romance, Music",
                "2h 16m",
                "Bradley Cooper\nLady Gaga\nAndrew Dice Clay\nDave Chappelle\nSam Elliott",
                "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                R.drawable.poster_a_start_is_born
        ))

        movies.add(MediaEntity(
                "m2",
                "Alita",
                "Action, Science-Fiction, Adventure",
                "2h 2m",
                "Rosa Salazar\nChristoph Waltz\nJennifer Connelly\nMahershala Ali\nEd Skrein\nJackie Earle Haley\nKeean Johnson\nLana Condor\nJorge Lendeborg Jr",
                "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                R.drawable.poster_alita
        ))

        movies.add(MediaEntity(
                "m3",
                "Aquaman",
                "Action, Adventure, Fantasy",
                "2h 23m",
                "Jason Momoa\nAmber Heard\nWillem Dafoe\nPatrick Wilson\nNicole Kidman\nDolph Lundgren\nYahya Abdul-Mateen II\nTemuera Morrison\nLudi Lin",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                R.drawable.poster_aquaman
        ))

        movies.add(MediaEntity(
                "m4",
                "Bohemian Rhapsody",
                "Music, Drama, History",
                "2h 15m",
                "Rami Malek\nGwilym Lee\nBen Hardy\nJoseph Mazello\nLucy Boynton\nAidan Gillen\nAllen Leech\nTom Hollander\nMike Myres",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                R.drawable.poster_bohemian
        ))

        movies.add(MediaEntity(
                "m5",
                "Glass",
                "Thriller, Drama, Science-Fiction",
                "2h 9m",
                "James McAvoy\nBruce Willis\nAnya Taylor-Joy\nSarah Paulson\nSamuel L. Jackson\nWilliam Turner\nJohnny Hiram Jamison\nOwen Vitullo\nColin Becker",
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                R.drawable.poster_glass
        ))

        movies.add(MediaEntity(
                "m6",
                "Creed II",
                "Drama",
                "2h 10m",
                "Michael B. Jordan\nSylvester Stallone\nDolph Lundgren\nFlorian Munteanu\nTessa Thompson\nWood Harris\nPhylicia Rashad\nAndre Ward\nBrigitte Nielsen",
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                R.drawable.poster_creed
        ))

        movies.add(MediaEntity(
                "m7",
                "Avengers: Infinity War",
                "Adventure, Action, Science-Fiction",
                "2h 29m",
                "Robert Downey Jr.\nChris Hemsworth\nChris Evans\nScarlett Johansson\nBenedict Cumberbatch\nTom Holland\nChadwick Boseman\nDon Cheadle\nZoe Saldana",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                R.drawable.poster_infinity_war
        ))

        movies.add(MediaEntity(
                "m8",
                "Ralph Breaks the Internet",
                "Family, Animation, Adventure",
                "1h 52m",
                "John C. Reilly\nSarah Silverman\nGal Gadot\nTaraji P. Henson\nJack McBrayer\nJane Lynch\nAlan Tudyk\nAlfred Molina\nEd O'Neill",
                "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet — the netizens — to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
                R.drawable.poster_ralph
        ))

        movies.add(MediaEntity(
                "m9",
                "Robin Hood",
                "Adventure, Action, Thriller",
                "1h 56m",
                "Taron Egerton\nJamie Foxx\nBen Mendelsohn\nEve Hewson\nJamie Dornan\nTim Minchin\nPaul Anderson\nF. Murray Abraham\nIan Peck",
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
                R.drawable.poster_robin_hood
        ))

        movies.add(MediaEntity(
                "m10",
                "Overlord",
                "Horror, War, Science-Fiction",
                "1h 50m",
                "Mathilde Ollivier\nJovan Adepo\nWyatt Russell\nJohn Magaro\nPilou Asbæk\nBokeem Woodbine\nIain De Caestecker\nDominic Applewhite\nJacob Anderson",
                "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
                R.drawable.poster_overlord
        ))

        return movies
    }

    fun setDataShow() : List<MediaEntity> {

        val shows = ArrayList<MediaEntity>()

        shows.add(MediaEntity(
                "t1",
                "Arrow",
                "Crime, Mystery, Adventure",
                "42m",
                "Stephem Amell\nDavid Ramsey\nEmily Bett Rickards\nKatie Cassidy\nWilla Holland\nPaul Blackthrone\nRick Gonzalez\nJohn Barrowman\nJuliana Harkavy",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                R.drawable.poster_arrow
        ))

        shows.add(MediaEntity(
                "t2",
                "The Flash",
                "Drama, Science-Fiction, Fantasy",
                "44m",
                "Grant Gustin\nCarlos Valdes\nDanielle Panabaker\nCandice Patton\nTom Cavanagh\nJesse L. Martin\nDanielle Nicolet\nHartley Sawyer\nKeiynan Lonsdale",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                R.drawable.poster_flash
        ))

        shows.add(MediaEntity(
                "t3",
                "Doom Patrol",
                "Fantasy, Comedy, Drama",
                "49m",
                "Diane Guerrero\nApril Bowlby\nJoivan Wade\nMatt Bomer\nBrendan Fraser\nTimothy Dalton\nRiley Shanahan\nMatthew Zuk\nAlan Tudyk",
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                R.drawable.poster_doom_patrol
        ))

        shows.add(MediaEntity(
                "t4",
                "Gotham",
                "Drama, Crime, Fantasy",
                "43m",
                "Ben McKenzie\nDonal Logue\nDavid Mazouz\nSean Pertwee\nRobin Lord Taylor\nErin Richards\nCamren Bicondova\nCory Michael Smith\nDrew Powell",
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                R.drawable.poster_gotham
        ))

        shows.add(MediaEntity(
                "t5",
                "Grey's Anatomy",
                "Drama",
                "43m",
                "Ellen Pompeo\nJames Pickens Jr.\nChandra Wilson\nJustin Chambers\nKevin McKidd\nJesse Williams\nPatrick Dempsey\nSara Ramirez\nJessica Capshaw",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                R.drawable.poster_grey_anatomy
        ))

        shows.add(MediaEntity(
                "t6",
                "Hanna",
                "Action, Adventure, Drama",
                "50m",
                "Esme Creed-Miles\nMireille Enos\nNoah Taylor\nJoel Kinnaman\nCherrelle Skeete\nAnthony Welsh\nAine Rose Daly\nYasmin Monet Prince\nDermot Mulroney",
                "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                R.drawable.poster_hanna
        ))

        shows.add(MediaEntity(
                "t7",
                "Marvel's Iron Fist",
                "Action, Adventure, Fantasy",
                "55m",
                "Finn Jones\nJessica Henwick\nJessica Stroup\nTom Pelphrey\nSacha Dhawan\nRosario Dawson\nDavid Wenham\nAlice Eve\nChing Hoh-Wai",
                "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
                R.drawable.poster_iron_fist
        ))

        shows.add(MediaEntity(
                "t8",
                "Riverdale",
                "Mystery, Drama, Crime",
                "45m",
                "K.J. Apa\nLili Reinhart\nCole Sprouse\nCamila Mendes\nMadelaine Petsch\nCasey Cott\nMädchen Amick\nSkeet Ulrich\nMarisol Nichols",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                R.drawable.poster_riverdale
        ))

        shows.add(MediaEntity(
                "t9",
                "The Umbrella Academy",
                "Action/Adventure",
                "60m",
                "Elliot Page\nTom Hopper\nDavid Castañeda\nEmmy Raver-Lampman\nRobert Sheehan\nAidan Gallagher\nMary J. Blige\nCameron Britton\nJohn Magaro\nAdam Godley\nColm Feore\nJustin H. Min\nRitu Arya\nYusuf Gatewood\nMarin Ireland\nKate Walsh",
                "On the same day in October 1989, forty-three infants are inexplicably born to random, unconnected women who showed no signs of pregnancy the day before. Seven are adopted by Sir Reginald Hargreeves, a billionaire industrialist, who creates The Umbrella Academy and prepares his \"children\" to save the world. But not everything went according to plan. In their teenage years, the family fractured and the team disbanded. Now almost thirty years old, the six surviving members reunite upon the news of Hargreeves' passing. Luther, Diego, Allison, Klaus, Vanya and Number Five work together to solve a mystery surrounding their father's death. But the estranged family once again begins to come apart due to their divergent personalities and abilities, not to mention the imminent threat of a global apocalypse.",
                R.drawable.poster_the_umbrella
        ))

        shows.add(MediaEntity(
                "t10",
                "The Walking Dead",
                "Action, Adventure, Fantasy",
                "42m",
                "Norman Reedus\nMelissa McBride\nLauren Cohan\nDanai Gurira\nAndrew Lincoln\nChandler Riggs\nChristian Serratos\nSteven Yeun\nJosh McDermitt",
                "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
                R.drawable.poster_the_walking_dead
        ))

        return shows
    }
}