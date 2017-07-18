package com.example.smaqu.solarsystemapp.model;

import com.example.smaqu.solarsystemapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SmaQu on 2017-07-11.
 */

public class CreateData {
    private static final String[] planets = {
            "Merkury",
            "Venus",
            "Earth",
            "Mars",
            "Jupiter",
            "Saturn",
            "Uranus",
    };

    //km
    private static final long[] semiMajorAxis = {
            57909050,
            108208000,
            149598023,
            227939200,
            778299000,
            1429000000,
            2875031720L,
    };

    //x10^23 kg
    private static final double[] mass = {
            3.3,
            93.0,
            59.7,
            6.4171,
            18986.0,
            5683.6,
            868.1,
    };

    //days
    private static final double[] orbitalPeriod = {
            87.9,
            224.7,
            365.2,
            686.9,
            4332.5,
            10759.2,
            30685.4,
    };

    //km
    private static final long[] avrDistanceToSun = {
            58000000,
            108208000,
            148346511,
            227950000,
            778295000,
            1429500000,
            2875271045L,
    };

    private static final String[] planetDescription = {
            "Merkury – najmniejsza i najbliższa Słońcu planeta Układu Słonecznego. Jako planeta wewnętrzna znajduje się dla ziemskiego " +
                    "obserwatora zawsze bardzo blisko Słońca, dlatego jest trudna do obserwacji. Mimo to należy do planet widocznych " +
                    "gołym okiem i była znana już w starożytności. Merkurego dojrzeć można jedynie tuż przed wschodem lub tuż po zachodzie Słońca."
                    + "Ukształtowanie powierzchni Merkurego przypomina Księżyc: są na nim liczne kratery uderzeniowe i praktycznie " +
                    "pozbawiony jest atmosfery. Temperatura powierzchni waha się od −183 °C do 427 °C. W przeciwieństwie do Księżyca, " +
                    "planeta ma jednak duże żelazne jądro, generujące pole magnetyczne o natężeniu stukrotnie mniejszym od natężenia " +
                    "ziemskiego pola magnetycznego[4]. Wielkość jądra powoduje, że Merkury ma jedną z największych gęstości spośród " +
                    "planet Układu Słonecznego[5] (nieznacznie większą ma Ziemia). Merkury nie ma naturalnych satelitów."
                    +"Pierwsze udokumentowane obserwacje Merkurego sięgają pierwszego tysiąclecia p.n.e. Do IV wieku p.n.e. " +
                    "greccy astronomowie uważali, że są to dwa ciała niebieskie: pierwsze widzialne tylko przed wschodem Słońca " +
                    "(nazywali je Apollo), drugie widzialne tylko po zachodzie Słońca (nazywali je Hermesem)[6]. Za sprawą " +
                    "szybkiego ruchu planety, powodowanego jej krótką orbitą, Rzymianie nadali planecie nazwę na cześć posłańca " +
                    "bogów i patrona handlarzy – Merkurego. Symbol astronomiczny planety to stylizowana wersja kaduceusza Hermesa[7].",

            "Wenus – druga pod względem odległości od Słońca planeta Układu Słonecznego. Jest trzecim pod względem jasności ciałem " +
                    "niebieskim widocznym na niebie, po Słońcu i Księżycu. Jej obserwowana wielkość gwiazdowa sięga −4,6m i jest " +
                    "wystarczająca, aby światło odbite od Wenus powodowało powstawanie cieni. W związku z tym, że Wenus jest bliżej" +
                    " Słońca niż Ziemia, zawsze jest ona widoczna w niewielkiej odległości od niego; jej maksymalna elongacja to 47,8°. " +
                    "Odległość Wenus od Ziemi waha się od 40 do 259 mln km[2]." +
                    "Nazwa planety wzięła się od rzymskiej bogini miłości, Wenus (Wenery). Z uwagi na fakt, iż na nocnym niebie " +
                    "widoczna jest ona tylko przez około 3 godziny przed wschodem Słońca[3] lub po zachodzie Słońca[3], nazywana jest " +
                    "także Gwiazdą Poranną, Zaranną, Porankową czyli Jutrzenką (łac. Stella Matutina), albo Gwiazdą Wieczorną." +
                    "Wenus jest klasyfikowana jako planeta skalista (inaczej: typu ziemskiego) i jest czasami nazywana „planetą" +
                    " bliźniaczą” albo „siostrą Ziemi” – ze względu na podobną wielkość, masę i skład chemiczny[4]. Jest pokryta" +
                    " nieprzezroczystą warstwą dobrze odbijających światło chmur kwasu siarkowego, które nie pozwalają na obserwację " +
                    "jej powierzchni z kosmosu w świetle widzialnym. Ma najgęstszą atmosferę ze wszystkich planet skalistych w Układzie " +
                    "Słonecznym, składającą się głównie z dwutlenku węgla. Na Wenus nie ma obiegu węgla, który powodowałby wiązanie " +
                    "węgla w skałach. Nie stwierdzono na niej również żadnych śladów organizmów żywych, które by go wiązały w " +
                    "biomasie. Istnieją przypuszczenia, że w przeszłości na Wenus były oceany, tak jak na Ziemi[5], ale odparowały, " +
                    "gdy temperatura powierzchni wzrosła. Obecny krajobraz Wenus jest suchy i pustynny, tworzony przez pokryte pyłem " +
                    "skały. Woda w jej atmosferze najprawdopodobniej dysocjowała, a ze względu na brak pola magnetycznego, wodór został" +
                    " wywiany w przestrzeń międzyplanetarną przez wiatr słoneczny[6]. Ciśnienie atmosferyczne na powierzchni planety jest ok. 92 razy większe niż na Ziemi.",

            "Ziemia (łac. Terra, Tellus; gr.: Γαῖα, trb.: Gaja) – trzecia, licząc od Słońca, oraz piąta pod względem wielkości planeta " +
                    "Układu Słonecznego. Pod względem średnicy, masy i gęstości jest to największa planeta skalista Układu Słonecznego. " +
                    "Ziemia jest zamieszkana przez miliony gatunków, w tym przez człowieka[9]. Jest jedynym znanym miejscem we Wszechświecie, " +
                    "w którym występuje życie[10]. Wg danych zebranych metodą datowania izotopowego, planeta uformowała się ok. 4,54 ± 0,05 mld lat temu[11][8][12][13]." +
                    "W ciągu pierwszego miliarda lat po uformowaniu się Ziemi wewnątrz jej oceanów pojawiło się życie. Z" +
                    " żyjących na Ziemi organizmów żywych składa się biosfera, która wpływa na jej atmosferę, hydrosferę, " +
                    "litosferę i inne czynniki abiotyczne planety, umożliwiając rozwój i wzrost liczby organizmów aerobowych i " +
                    "anaerobowych oraz powstanie ozonosfery. Rozwój życia na lądzie i w wodzie umożliwiła powłoka ozonowa oraz ziemskie " +
                    "pole magnetyczne, zmniejszając natężenie promieniowania ultrafioletowego[14], oraz magnetosfera, odbijająca cząstki " +
                    "wiatru słonecznego i promieniowania kosmicznego. Dystans dzielący Słońce od Ziemi, jej właściwości fizyczne oraz jej " +
                    "historia geologiczna są najważniejszymi czynnikami, które pozwoliły organizmom żyć i ewoluować. Różnorodność biologiczna " +
                    "Ziemi nieustannie powiększa się, chociaż w dziejach życia Ziemi proces ten był kilkukrotnie przerywany, kiedy miało miejsce " +
                    "masowe wymieranie gatunków[15]. Pomimo że naukowcy szacują, że ok. 99% gatunków organizmów żywych (ok. 5 mld)[16] kiedykolwiek " +
                    "zamieszkujących Ziemię uważa się za wymarłe[17][18], wciąż mieszka na niej ok. 10-14 mln gatunków[9][19], z czego 1,2 mln zostało udokumentowanych[20].",

            "Mars – czwarta według oddalenia od Słońca planeta Układu Słonecznego. Nazwa planety pochodzi od imienia " +
                    "rzymskiego boga wojny – Marsa. Zawdzięcza ją swej barwie, która przy obserwacji z Ziemi wydaje się " +
                    "rdzawo-czerwona i kojarzyła się starożytnym z pożogą wojenną. Postrzegany odcień wynika stąd, że powierzchnia " +
                    "planety zawiera tlenki żelaza. Mars jest planetą wewnętrzną z cienką atmosferą, o powierzchni usianej kraterami" +
                    " uderzeniowymi, podobnie jak powierzchnia Księżyca. Występują tu także inne rodzaje terenu, podobne do ziemskich:" +
                    " wulkany, doliny, pustynie i polarne czapy lodowe. Okres obrotu wokół własnej osi jest niewiele dłuższy niż Ziemi i " +
                    "wynosi 24,6229 godziny (24 h 37 min 22s). Na Marsie znajduje się najwyższa góra w Układzie Słonecznym – Olympus Mons " +
                    "i największy kanion – Valles Marineris. Gładki obszar równinny Vastitas Borealis na półkuli północnej obejmuje 40%" +
                    " powierzchni planety i może być pozostałością ogromnego uderzenia[2][3]. W przeciwieństwie do Ziemi, Mars jest " +
                    "geologicznie i tektonicznie nieaktywny.",

            "Jowisz – piąta w kolejności oddalenia od Słońca i największa planeta Układu Słonecznego[b]. Jego masa " +
                    "jest nieco mniejsza niż jedna tysięczna masy Słońca, a zarazem dwa i pół raza większa niż łączna " +
                    "masa wszystkich innych planet w Układzie Słonecznym. Wraz z Saturnem, Uranem i Neptunem tworzy grupę " +
                    "gazowych olbrzymów, nazywaną czasem również planetami jowiszowymi." +
                    "Planetę znali astronomowie w czasach starożytnych, była związana z mitologią i wierzeniami religijnymi " +
                    "wielu kultur. Rzymianie nazwali planetę na cześć najważniejszego bóstwa swojej mitologii – Jowisza[2]. " +
                    "Obserwowany z Ziemi Jowisz może osiągnąć jasność do −2,95m. Jest to trzeci co do jasności naturalny obiekt " +
                    "na nocnym niebie po Księżycu i Wenus (okresowo, w momencie wielkiej opozycji, jasnością może mu dorównywać Mars).",

            "Saturn – gazowy olbrzym, szósta planeta Układu Słonecznego pod względem oddalenia od Słońca, druga po Jowiszu pod " +
                    "względem masy i wielkości. Charakterystyczną jego cechą są pierścienie, składające się głównie z lodu i w " +
                    "mniejszej ilości z odłamków skalnych; inne planety-olbrzymy także mają systemy pierścieni, ale żaden z nich " +
                    "nie jest tak rozległy ani tak jasny. Według danych z marca 2015 roku znane są 62 naturalne satelity Saturna[2]." +
                    "Promień Saturna jest około 9 razy większy od promienia Ziemi[3]. Chociaż jego gęstość to tylko jedna ósma " +
                    "średniej gęstości Ziemi, ze względu na wielokrotnie większą objętość masa Saturna jest dziewięćdziesiąt pięć razy większa niż masa Ziemi[4]." +
                    "We wnętrzu Saturna panują ciśnienie i temperatura, których nie udało się dotąd uzyskać w laboratoriach na " +
                    "Ziemi. Wnętrze gazowego olbrzyma najprawdopodobniej składa się z jądra z żelaza, niklu, krzemu i tlenu, " +
                    "otoczonego warstwą metalicznego wodoru, warstwy pośredniej ciekłego wodoru i ciekłego helu oraz zewnętrznej " +
                    "warstwy gazowej[5]. Prąd elektryczny w warstwie metalicznej wodoru generuje pole magnetyczne Saturna, które " +
                    "jest nieco słabsze niż pole magnetyczne Ziemi i ma około jedną dwudziestą natężenia pola wokół Jowisza[6]. " +
                    "Zewnętrzna warstwa atmosfery wydaje się na ogół spokojna, choć mogą się na niej utrzymywać długotrwałe układy " +
                    "burzowe. Na Saturnie wieją wiatry o prędkości ok. 1800 km/h; są one silniejsze niż na Jowiszu.",

            "Uran − gazowy olbrzym, siódma w kolejności od Słońca planeta Układu Słonecznego. Jest także trzecią pod względem wielkości " +
                    "i czwartą pod względem masy planetą naszego systemu. Nazwa planety pochodzi od Uranosa, który był bogiem i uosobieniem " +
                    "nieba w mitologii greckiej (klasyczna greka: Οὐρανός), ojcem Kronosa (Saturna) i dziadkiem Zeusa (Jowisza). Choć jest " +
                    "widoczny gołym okiem[b] podobnie jak pięć innych planet, umknął uwadze starożytnych obserwatorów ze względu na niską " +
                    "jasność i powolny ruch po sferze niebieskiej[3]. Sir William Herschel ogłosił odkrycie planety w dniu 13 marca 1781, po " +
                    "raz pierwszy w historii nowożytnej rozszerzając znane granice Układu Słonecznego. Uran to również pierwsza planeta odkryta przy pomocy teleskopu." +
                    "Uran budową i składem chemicznym przypomina Neptuna, a obie planety mają odmienną budowę i skład niż większe gazowe" +
                    " olbrzymy: Jowisz i Saturn. Astronomowie czasem umieszczają je w oddzielnej kategorii „lodowych olbrzymów”." +
                    " Atmosfera Urana, chociaż – podobnie jak atmosfery Jowisza i Saturna – składa się głównie z wodoru i helu, zawiera " +
                    "więcej zamrożonych substancji lotnych (tzw. lodów) niż atmosfery większych planet-olbrzymów; są to substancje takie " +
                    "jak woda, amoniak i metan, oraz śladowe ilości węglowodorów[4]. Jego atmosfera jest najzimniejszą atmosferą planetarną " +
                    "w Układzie Słonecznym; minimalna temperatura to 49 K (−224 °C). Ma ona złożoną, warstwową strukturę. Uważa się, że jej " +
                    "najniższe chmury tworzy woda, a najwyższa warstwa chmur jest utworzona z kryształków metanu[4]. Z kolei wnętrze Urana składa się głównie z lodów i skał[5].",
    };

    private static final int[] planetIcons = {
            R.mipmap.mercury_ico_launcher,
            R.mipmap.wenus_ico_launcher,
            R.mipmap.earth_ico_launcher,
            R.mipmap.mars_ico_launcher,
            R.mipmap.jupiter_ico_launcher,
            R.mipmap.saturn_ico_launcher,
            R.mipmap.uranus_ico_launcher,
    };


    private static final int[] planetImage = {
            R.drawable.mercury_detail_image,
            R.drawable.venus_detail_image,
            R.drawable.earth_detail_image,
            R.drawable.mars_detail_image,
            R.drawable.jupiter_detail_image,
            R.drawable.saturn_detail_image,
            R.drawable.uranus_detail_image,

    };

    private static final String[] planetWikipedia = {
            "https://en.wikipedia.org/wiki/Mercury_(planet)",
            "https://en.wikipedia.org/wiki/Venus",
            "https://en.wikipedia.org/wiki/Earth",
            "https://en.wikipedia.org/wiki/Mars",
            "https://en.wikipedia.org/wiki/Jupiter",
            "https://en.wikipedia.org/wiki/Saturn",
            "https://en.wikipedia.org/wiki/Uranus",
    };


    public static List<ListItem> getListData(){
        List<ListItem>  data = new ArrayList<>();
        for(int i=0;i<planets.length;i++){
            ListItem item = new ListItem();
            item.setPlanetName(planets[i]);
            item.setPlanetImageIco(planetIcons[i]);
            item.setBigDetailImage(planetImage[i]);
            item.setDetailText(planetDescription[i]);
            item.setPlanetWiki(planetWikipedia[i]);
            item.setSemiMajorAxis(semiMajorAxis[i]);
            item.setMass(mass[i]);
            item.setOrbitalPeriod(orbitalPeriod[i]);
            item.setAvrDistanceToSun(avrDistanceToSun[i]);
            data.add(item);
        }
        return data;
    }
}
