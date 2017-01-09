package com.example.nicolassabatier.quizzapplication;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.common.api.GoogleApiClient;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.example.nicolassabatier.quizzapplication.R.id.add;
import static com.example.nicolassabatier.quizzapplication.R.id.player_name_list;

public class RegistrationActivity extends AppCompatActivity
{

    public List<Question> questions = new ArrayList<Question>(); //  ArrayList that will store the database where the qusetions will be derived from,
    // the list is the same everytime the application is opened
    public List<Question> questionsPlay = new ArrayList<Question>(); // ArrayList that will store the list of questions for the quizz,
    // the questions will change everytime the Playing Activity is played

    public void getAllquestions() {

        questions.add(new Question(R.drawable.afghanistan, "afghanistan", "indonezia", "afghanistan", "palestine", "kosovo", "afghanistan"));
        questions.add(new Question(R.drawable.african_union, "african_union", "yemen", "african_union", "trinidad_tobago", "swaziland", "african_union"));
        questions.add(new Question(R.drawable.albania, "albania", "slovenia", "albania", "sri_lanka", "ethiopia", "albania"));
        questions.add(new Question(R.drawable.algeria, "algeria", "solomon_islands", "algeria", "somalia", "ethiopia", "algeria"));
        questions.add(new Question(R.drawable.american_samoa, "american_samoa", "vatican_city", "liberia", "england", "american_samoa", "american_samoa"));
        questions.add(new Question(R.drawable.andorra, "andorra", "scotland", "andorra", "peru", "greece", "andorra"));
        questions.add(new Question(R.drawable.angola, "angola", "papua_new_guinea", "angola", "martinique", "sweden", "angola"));
        questions.add(new Question(R.drawable.anguilla, "anguilla", "northern_cyprus", "slovenia", "sierra_leone", "anguilla", "anguilla"));
        questions.add(new Question(R.drawable.antarctica, "antarctica", "united_nations", "antarctica", "bermuda", "mongolia", "antarctica"));
        questions.add(new Question(R.drawable.antigua_barbuda, "antigua_barbuda", "malta", "antigua_barbuda", "bermuda", "sudan", "antigua_barbuda"));
        questions.add(new Question(R.drawable.arab_league, "arab_league", "netherlands_antilles", "guinea_bissau", "arab_league", "brazil", "arab_league"));
        questions.add(new Question(R.drawable.argentina, "argentina", "jersey", "oman", "argentina", "morocco", "argentina"));
        questions.add(new Question(R.drawable.armenia, "armenia", "oman", "armenia", "northern_cyprus", "cayman_islands", "armenia"));
        questions.add(new Question(R.drawable.aruba, "aruba", "denmark", "aruba", "united_states_of_america", "ethiopia", "aruba"));
        questions.add(new Question(R.drawable.asean, "asean", "venezuela", "swaziland", "asean", "bahamas", "asean"));
        questions.add(new Question(R.drawable.australia, "australia", "australia", "iran", "turkmenistan", "el_salvador", "australia"));
        questions.add(new Question(R.drawable.austria, "austria", "austria", "sierra_leone", "denmark", "england", "austria"));
        questions.add(new Question(R.drawable.azerbaijan, "azerbaijan", "botswana", "denmark", "azerbaijan", "tuvalu", "azerbaijan"));
        questions.add(new Question(R.drawable.bahamas, "bahamas", "bahamas", "asean", "czech_republic", "denmark", "bahamas"));
        questions.add(new Question(R.drawable.bahrain, "bahrain", "thailand", "bahrain", "guinea_bissau", "montserrat", "bahrain"));
        questions.add(new Question(R.drawable.bangladesh, "bangladesh", "armenia", "tanzania", "commonwealth", "bangladesh", "bangladesh"));
        questions.add(new Question(R.drawable.barbados, "barbados", "barbados", "somaliland", "israel", "barbados", "barbados"));
        questions.add(new Question(R.drawable.belarus, "belarus", "uzbekistan", "belarus", "malaysia", "mozambique", "belarus"));
        questions.add(new Question(R.drawable.belgium, "belgium", "central_african_republic", "switzerland", "new_zealand", "belgium", "belgium"));
        questions.add(new Question(R.drawable.belize, "belize", "belize", "guatemala", "cambodja", "philippines", "belize"));
        questions.add(new Question(R.drawable.benin, "benin", "cayman_islands", "denmark", "benin", "puerto_rico", "benin"));
        questions.add(new Question(R.drawable.bermuda, "bermuda", "bermuda", "armenia", "taiwan", "namibia", "bermuda"));
        questions.add(new Question(R.drawable.bhutan, "bhutan", "sierra_leone", "bhutan", "netherlands", "uruguay", "bhutan"));
        questions.add(new Question(R.drawable.bolivia, "bolivia", "sierra_leone", "greece", "bolivia", "kyrgyzstan", "bolivia"));
        questions.add(new Question(R.drawable.bosnia_herzegovina, "bosnia_herzegovina", "bosnia_herzegovina", "bhutan", "guam", "hong_kong", "bosnia_herzegovina"));
        questions.add(new Question(R.drawable.botswana, "botswana", "bermuda", "monaco", "angola", "botswana", "botswana"));
        questions.add(new Question(R.drawable.brazil, "brazil", "united_states_of_america", "new_zealand", "brazil", "tahiti", "brazil"));
        questions.add(new Question(R.drawable.brunei, "brunei", "palestine", "brunei", "virgin_islands_british", "tahiti", "brunei"));
        questions.add(new Question(R.drawable.bulgaria, "bulgaria", "north_korea", "anguilla", "venezuela", "bulgaria", "bulgaria"));
        questions.add(new Question(R.drawable.burkina_faso, "burkina_faso", "burkina_faso", "cambodja", "moldova", "dominican_republic", "burkina_faso"));
        questions.add(new Question(R.drawable.burundi, "burundi", "ghana", "syria", "burundi", "kazakhstan", "burundi"));
        questions.add(new Question(R.drawable.cambodja, "cambodja", "saudi_arabia", "cambodja", "somaliland", "russian_federation", "cambodja"));
        questions.add(new Question(R.drawable.cameroon, "cameroon", "south_africa", "suriname", "cameroon", "reunion", "cameroon"));
        questions.add(new Question(R.drawable.canada, "canada", "st_vincent_the_grenadines", "france", "canada", "burundi", "canada"));
        questions.add(new Question(R.drawable.cape_verde, "cape_verde", "cape_verde", "bulgaria", "armenia", "djibouti", "cape_verde"));
        questions.add(new Question(R.drawable.caricom, "caricom", "qatar", "reunion", "caricom", "libya", "caricom"));
        questions.add(new Question(R.drawable.cayman_islands, "cayman_islands", "new_caledonia", "belgium", "olimpic_movement", "cayman_islands", "cayman_islands"));
        questions.add(new Question(R.drawable.central_african_republic, "central_african_republic", "argentina", "central_african_republic", "uganda", "western_sahara", "central_african_republic"));
        questions.add(new Question(R.drawable.chad, "chad", "indonezia", "bahamas", "chad", "turkmenistan", "chad"));
        questions.add(new Question(R.drawable.chile, "chile", "wales", "chile", "poland", "macao", "chile"));
        questions.add(new Question(R.drawable.china, "china", "tajikistan", "china", "angola", "greece", "china"));
        questions.add(new Question(R.drawable.cis, "cis", "belgium", "laos", "cis", "bhutan", "cis"));
        questions.add(new Question(R.drawable.colombia, "colombia", "lesotho", "fiji", "colombia", "somaliland", "colombia"));
        questions.add(new Question(R.drawable.commonwealth, "commonwealth", "commonwealth", "new_zealand", "colombia", "liechtenshein", "commonwealth"));
        questions.add(new Question(R.drawable.comoros, "comoros", "burkina_faso", "equatorial_guinea", "comoros", "scotland", "comoros"));
        questions.add(new Question(R.drawable.congo_brazzaville, "congo_brazzaville", "marshall_islands", "arab_league", "congo_brazzaville", "faroes", "congo_brazzaville"));
        questions.add(new Question(R.drawable.congo_kinshasa, "congo_kinshasa", "slovenia", "eritrea", "nicaragua", "congo_kinshasa", "congo_kinshasa"));
        questions.add(new Question(R.drawable.cook_islands, "cook_islands", "ethiopia", "mozambique", "cook_islands", "bulgaria", "cook_islands"));
        questions.add(new Question(R.drawable.costa_rica, "costa_rica", "guadeloupe", "sao_tome_principe", "nato", "costa_rica", "costa_rica"));
        questions.add(new Question(R.drawable.cote_d_ivoire, "cote_d_ivoire", "nato", "isle_of_man", "cote_d_ivoire", "iran", "cote_d_ivoire"));
        questions.add(new Question(R.drawable.croatia, "croatia", "spain", "croatia", "canada", "tanzania", "croatia"));
        questions.add(new Question(R.drawable.cuba, "cuba", "belgium", "micronesia", "ethiopia", "cuba", "cuba"));
        questions.add(new Question(R.drawable.cyprus, "cyprus", "guinea_bissau", "cuba", "congo_brazzaville", "cyprus", "cyprus"));
        questions.add(new Question(R.drawable.czech_republic, "czech_republic", "rwanda", "jordan", "czech_republic", "austria", "czech_republic"));
        questions.add(new Question(R.drawable.denmark, "denmark", "algeria", "denmark", "solomon_islands", "burundi", "denmark"));
        questions.add(new Question(R.drawable.djibouti, "djibouti", "fiji", "commonwealth", "mexico", "djibouti", "djibouti"));
        questions.add(new Question(R.drawable.dominica, "dominica", "czech_republic", "spain", "dominica", "montenegro", "dominica"));
        questions.add(new Question(R.drawable.dominican_republic, "dominican_republic", "guinea", "dominican_republic", "germany", "nicaragua", "dominican_republic"));
        questions.add(new Question(R.drawable.ecuador, "ecuador", "northern_cyprus", "jamaica", "kenya", "ecuador", "ecuador"));
        questions.add(new Question(R.drawable.egypt, "egypt", "cameroon", "egypt", "canada", "myanmar", "egypt"));
        questions.add(new Question(R.drawable.el_salvador, "el_salvador", "bermuda", "jordan", "el_salvador", "slovenia", "el_salvador"));
        questions.add(new Question(R.drawable.england, "england", "south_africa", "england", "paraguay", "central_african_republic", "england"));
        questions.add(new Question(R.drawable.equatorial_guinea, "equatorial_guinea", "netherlands_antilles", "benin", "fiji", "equatorial_guinea", "equatorial_guinea"));
        questions.add(new Question(R.drawable.eritrea, "eritrea", "greenland", "uzbekistan", "eritrea", "antarctica", "eritrea"));
        questions.add(new Question(R.drawable.estonia, "estonia", "nicaragua", "opec", "estonia", "red_cross", "estonia"));
        questions.add(new Question(R.drawable.ethiopia, "ethiopia", "samoa", "ethiopia", "cyprus", "morocco", "ethiopia"));
        questions.add(new Question(R.drawable.european_union, "european_union", "yemen", "turkey", "turkmenistan", "european_union", "european_union"));
        questions.add(new Question(R.drawable.faroes, "faroes", "georgia", "faroes", "sudan", "belarus", "faroes"));
        questions.add(new Question(R.drawable.fiji, "fiji", "montenegro", "fiji", "greece", "equatorial_guinea", "fiji"));
        questions.add(new Question(R.drawable.finland, "finland", "turkey", "finland", "virgin_islands_us", "egypt", "finland"));
        questions.add(new Question(R.drawable.france, "france", "finland", "france", "vanutau", "denmark", "france"));
        questions.add(new Question(R.drawable.gabon, "gabon", "malaysia", "cape_verde", "gabon", "burundi", "gabon"));
        questions.add(new Question(R.drawable.gambia, "gambia", "gambia", "cote_d_ivoire", "caricom", "st_vincent_the_grenadines", "gambia"));
        questions.add(new Question(R.drawable.georgia, "georgia", "wales", "jamaica", "georgia", "isle_of_man", "georgia"));
        questions.add(new Question(R.drawable.germany, "germany", "virgin_islands_us", "argentina", "new_zealand", "germany", "germany"));
        questions.add(new Question(R.drawable.ghana, "ghana", "st_kitts_nevis", "trinidad_tobago", "france", "ghana", "ghana"));
        questions.add(new Question(R.drawable.gibraltar, "gibraltar", "st_kitts_nevis", "gibraltar", "iraq", "uzbekistan", "gibraltar"));
        questions.add(new Question(R.drawable.greece, "greece", "albania", "nigeria", "greece", "panama", "greece"));
        questions.add(new Question(R.drawable.greenland, "greenland", "iceland", "poland", "rwanda", "greenland", "greenland"));
        questions.add(new Question(R.drawable.grenada, "grenada", "bahamas", "kazakhstan", "grenada", "benin", "grenada"));
        questions.add(new Question(R.drawable.guadeloupe, "guadeloupe", "honduras", "palau", "guadeloupe", "libya", "guadeloupe"));
        questions.add(new Question(R.drawable.guam, "guam", "india", "samoa", "seychelles", "guam", "guam"));
        questions.add(new Question(R.drawable.guatemala, "guatemala", "guatemala", "namibia", "cape_verde", "mauritania", "guatemala"));
        questions.add(new Question(R.drawable.guernsey, "guernsey", "jordan", "guernsey", "guam", "spain", "guernsey"));
        questions.add(new Question(R.drawable.guinea, "guinea", "guinea", "kenya", "jamaica", "somalia", "guinea"));
        questions.add(new Question(R.drawable.guinea_bissau, "guinea_bissau", "guinea_bissau", "belarus", "seychelles", "ukraine", "guinea_bissau"));
        questions.add(new Question(R.drawable.guyana, "guyana", "guyana", "andorra", "micronesia", "solomon_islands", "guyana"));
        questions.add(new Question(R.drawable.haiti, "haiti", "nigeria", "malaysia", "haiti", "islamic_conference", "haiti"));
        questions.add(new Question(R.drawable.honduras, "honduras", "united_nations", "kazakhstan", "honduras", "botswana", "honduras"));
        questions.add(new Question(R.drawable.hong_kong, "hong_kong", "mexico", "caricom", "fiji", "hong_kong", "hong_kong"));
        questions.add(new Question(R.drawable.hungary, "hungary", "iran", "mauritius", "hungary", "azerbaijan", "hungary"));
        questions.add(new Question(R.drawable.iceland, "iceland", "nigeria", "iceland", "guinea_bissau", "botswana", "iceland"));
        questions.add(new Question(R.drawable.india, "india", "ukraine", "north_korea", "uruguay", "india", "india"));
        questions.add(new Question(R.drawable.indonezia, "indonezia", "iran", "finland", "indonezia", "mali", "indonezia"));
        questions.add(new Question(R.drawable.iran, "iran", "jersey", "iran", "grenada", "china", "iran"));
        questions.add(new Question(R.drawable.iraq, "iraq", "belize", "mongolia", "moldova", "iraq", "iraq"));
        questions.add(new Question(R.drawable.ireland, "ireland", "ireland", "seychelles", "oman", "eritrea", "ireland"));
        questions.add(new Question(R.drawable.islamic_conference, "islamic_conference", "uzbekistan", "qatar", "uganda", "islamic_conference", "islamic_conference"));
        questions.add(new Question(R.drawable.isle_of_man, "isle_of_man", "italy", "isle_of_man", "haiti", "mauritania", "isle_of_man"));
        questions.add(new Question(R.drawable.israel, "israel", "greenland", "benin", "angola", "israel", "israel"));
        questions.add(new Question(R.drawable.italy, "italy", "yemen", "sierra_leone", "western_sahara", "italy", "italy"));
        questions.add(new Question(R.drawable.jamaica, "jamaica", "jamaica", "ireland", "barbados", "namibia", "jamaica"));
        questions.add(new Question(R.drawable.japan, "japan", "japan", "kuwait", "lebanon", "hungary", "japan"));
        questions.add(new Question(R.drawable.jersey, "jersey", "macao", "england", "jersey", "eritrea", "jersey"));
        questions.add(new Question(R.drawable.jordan, "jordan", "st_vincent_the_grenadines", "afghanistan", "jordan", "macao", "jordan"));
        questions.add(new Question(R.drawable.kazakhstan, "kazakhstan", "ireland", "estonia", "kazakhstan", "puerto_rico", "kazakhstan"));
        questions.add(new Question(R.drawable.kenya, "kenya", "lebanon", "kenya", "cayman_islands", "burkina_faso", "kenya"));
        questions.add(new Question(R.drawable.kiribati, "kiribati", "egypt", "kiribati", "scotland", "saudi_arabia", "kiribati"));
        questions.add(new Question(R.drawable.kosovo, "kosovo", "kosovo", "solomon_islands", "dominican_republic", "estonia", "kosovo"));
        questions.add(new Question(R.drawable.kuwait, "kuwait", "norway", "kuwait", "mexico", "antigua_barbuda", "kuwait"));
        questions.add(new Question(R.drawable.kyrgyzstan, "kyrgyzstan", "haiti", "tanzania", "north_korea", "kyrgyzstan", "kyrgyzstan"));
        questions.add(new Question(R.drawable.laos, "laos", "laos", "islamic_conference", "nicaragua", "tunisia", "laos"));
        questions.add(new Question(R.drawable.latvia, "latvia", "iceland", "united_states_of_america", "kyrgyzstan", "latvia", "latvia"));
        questions.add(new Question(R.drawable.lebanon, "lebanon", "samoa", "saudi_arabia", "arab_league", "lebanon", "lebanon"));
        questions.add(new Question(R.drawable.lesotho, "lesotho", "malawi", "lesotho", "guam", "equatorial_guinea", "lesotho"));
        questions.add(new Question(R.drawable.liberia, "liberia", "kosovo", "liberia", "dominica", "red_cross", "liberia"));
        questions.add(new Question(R.drawable.libya, "libya", "libya", "mauritania", "slovenia", "commonwealth", "libya"));
        questions.add(new Question(R.drawable.liechtenshein, "liechtenshein", "european_union", "canada", "liechtenshein", "ghana", "liechtenshein"));
        questions.add(new Question(R.drawable.lithuania, "lithuania", "somaliland", "denmark", "andorra", "lithuania", "lithuania"));
        questions.add(new Question(R.drawable.luxembourg, "luxembourg", "afghanistan", "luxembourg", "nicaragua", "kyrgyzstan", "luxembourg"));
        questions.add(new Question(R.drawable.macao, "macao", "zimbabwe", "guernsey", "macao", "haiti", "macao"));
        questions.add(new Question(R.drawable.macedonia, "macedonia", "latvia", "northern_ireland", "macedonia", "portugal", "macedonia"));
        questions.add(new Question(R.drawable.madagascar, "madagascar", "vanutau", "madagascar", "dominican_republic", "tonga", "madagascar"));
        questions.add(new Question(R.drawable.malawi, "malawi", "luxembourg", "st_kitts_nevis", "opec", "malawi", "malawi"));
        questions.add(new Question(R.drawable.malaysia, "malaysia", "monaco", "malaysia", "central_african_republic", "chad", "malaysia"));
        questions.add(new Question(R.drawable.maldives, "maldives", "italy", "maldives", "guam", "cameroon", "maldives"));
        questions.add(new Question(R.drawable.mali, "mali", "belgium", "liechtenshein", "algeria", "mali", "mali"));
        questions.add(new Question(R.drawable.malta, "malta", "france", "estonia", "malta", "ecuador", "malta"));
        questions.add(new Question(R.drawable.marshall_islands, "marshall_islands", "cook_islands", "kenya", "bhutan", "marshall_islands", "marshall_islands"));
        questions.add(new Question(R.drawable.martinique, "martinique", "san_marino", "romania", "belarus", "martinique", "martinique"));
        questions.add(new Question(R.drawable.mauritania, "mauritania", "comoros", "saint_lucia", "mauritania", "peru", "mauritania"));
        questions.add(new Question(R.drawable.mauritius, "mauritius", "mauritius", "russian_federation", "swaziland", "netherlands", "mauritius"));
        questions.add(new Question(R.drawable.mexico, "mexico", "turkmenistan", "mexico", "croatia", "colombia", "mexico"));
        questions.add(new Question(R.drawable.micronesia, "micronesia", "laos", "micronesia", "namibia", "swaziland", "micronesia"));
        questions.add(new Question(R.drawable.moldova, "moldova", "aruba", "moldova", "san_marino", "sudan", "moldova"));
        questions.add(new Question(R.drawable.monaco, "monaco", "switzerland", "belize", "monaco", "bosnia_herzegovina", "monaco"));
        questions.add(new Question(R.drawable.mongolia, "mongolia", "latvia", "mongolia", "montenegro", "france", "mongolia"));
        questions.add(new Question(R.drawable.montenegro, "montenegro", "ethiopia", "opec", "dominica", "montenegro", "montenegro"));
        questions.add(new Question(R.drawable.montserrat, "montserrat", "montserrat", "monaco", "lithuania", "montserrat", "montserrat"));
        questions.add(new Question(R.drawable.morocco, "morocco", "morocco", "finland", "chili", "taiwan", "morocco"));
        questions.add(new Question(R.drawable.mozambique, "mozambique", "mozambique", "virgin_islands_british", "eritrea", "sierra_leone", "mozambique"));
        questions.add(new Question(R.drawable.myanmar, "myanmar", "cape_verde", "malawi", "myanmar", "mexico", "myanmar"));
        questions.add(new Question(R.drawable.namibia, "namibia", "israel", "namibia", "colombia", "martinique", "namibia"));
        questions.add(new Question(R.drawable.nato, "nato", "virgin_islands_us", "commonwealth", "nato", "kuwait", "nato"));
        questions.add(new Question(R.drawable.nauru, "nauru", "nauru", "lesotho", "northern_ireland", "swaziland", "nauru"));
        questions.add(new Question(R.drawable.nepal, "nepal", "nepal", "trinidad_tobago", "asean", "kiribati", "nepal"));
        questions.add(new Question(R.drawable.netherlands, "netherlands", "caricom", "netherlands", "greece", "brunei", "netherlands"));
        questions.add(new Question(R.drawable.netherlands_antilles, "netherlands_antilles", "niger", "netherlands_antilles", "somalia", "ghana", "netherlands_antilles"));
        questions.add(new Question(R.drawable.new_caledonia, "new_caledonia", "italy", "new_caledonia", "samoa", "algeria", "new_caledonia"));
        questions.add(new Question(R.drawable.new_zealand, "new_zealand", "ireland", "new_zealand", "wales", "denmark", "new_zealand"));
        questions.add(new Question(R.drawable.nicaragua, "nicaragua", "nicaragua", "botswana", "cis", "tonga", "nicaragua"));
        questions.add(new Question(R.drawable.niger, "niger", "madagascar", "niger", "venezuela", "suriname", "niger"));
        questions.add(new Question(R.drawable.nigeria, "nigeria", "bangladesh", "nigeria", "angola", "antigua_barbuda", "nigeria"));
        questions.add(new Question(R.drawable.north_korea, "north_korea", "north_korea", "grenada", "cameroon", "el_salvador", "north_korea"));
        questions.add(new Question(R.drawable.northern_cyprus, "northern_cyprus", "northern_cyprus", "nicaragua", "cyprus", "dominica", "northern_cyprus"));
        questions.add(new Question(R.drawable.northern_ireland, "northern_ireland", "northern_ireland", "scotland", "cambodja", "panama", "northern_ireland"));
        questions.add(new Question(R.drawable.norway, "norway", "united_nations", "norway", "india", "moldova", "norway"));
        questions.add(new Question(R.drawable.olimpic_movement, "olimpic_movement", "estonia", "olimpic_movement", "turkmenistan", "sweden", "olimpic_movement"));
        questions.add(new Question(R.drawable.oman, "oman", "martinique", "oman", "italy", "australia", "oman"));
        questions.add(new Question(R.drawable.opec, "opec", "opec", "ethiopia", "american_samoa", "lituania", "opec"));
        questions.add(new Question(R.drawable.pakistan, "pakistan", "tanzania", "burkina_faso", "pakistan", "cote_d_ivoire", "pakistan"));
        questions.add(new Question(R.drawable.palau, "palau", "palau", "solomon_islands", "cote_d_ivoire", "slovenia", "palau"));
        questions.add(new Question(R.drawable.palestine, "palestine", "jersey", "palestine", "mauritius", "united_nations", "palestine"));
        questions.add(new Question(R.drawable.panama, "panama", "argentina", "panama", "lithuania", "monaco", "panama"));
        questions.add(new Question(R.drawable.papua_new_guinea, "papua_new_guinea", "lesotho", "ukraine", "papua_new_guinea", "jordan", "papua_new_guinea"));
        questions.add(new Question(R.drawable.paraguay, "paraguay", "new_zealand", "netherlands_antilles", "qatar", "paraguay", "paraguay"));
        questions.add(new Question(R.drawable.peru, "peru", "peru", "guernsey", "lesotho", "islamic_conference", "peru"));
        questions.add(new Question(R.drawable.philippines, "philippines", "philippines", "laos", "macedonia", "nigeria", "philippines"));
        questions.add(new Question(R.drawable.poland, "poland", "jersey", "poland", "costa_rica", "mexico", "poland"));
        questions.add(new Question(R.drawable.portugal, "portugal", "spain", "kenya", "djibouti", "portugal", "portugal"));
        questions.add(new Question(R.drawable.puerto_rico, "puerto_rico", "puerto_rico", "faroes", "faroes", "belarus", "puerto_rico"));
        questions.add(new Question(R.drawable.qatar, "qatar", "bermuda", "cape_verde", "bahrain", "qatar", "qatar"));
        questions.add(new Question(R.drawable.red_cross, "red_cross", "chile", "turks_and_caicos_islands", "red_cross", "czech_republic", "red_cross"));
        questions.add(new Question(R.drawable.reunion, "reunion", "bulgaria", "western_sahara", "reunion", "cape_verde", "reunion"));
        questions.add(new Question(R.drawable.romania, "romania", "romania", "el_salvador", "portugal", "czech_republic", "romania"));
        questions.add(new Question(R.drawable.russian_federation, "russian_federation", "united_kingdom", "oman", "russian_federation", "swaziland", "russian_federation"));
        questions.add(new Question(R.drawable.rwanda, "rwanda", "yemen", "singapore", "paraguay", "rwanda", "rwanda"));
        questions.add(new Question(R.drawable.saint_lucia, "saint_lucia", "croatia", "andorra", "uruguay", "saint_lucia", "saint_lucia"));
        questions.add(new Question(R.drawable.samoa, "samoa", "antarctica", "united_arab_emirates", "gambia", "samoa", "samoa"));
        questions.add(new Question(R.drawable.san_marino, "san_marino", "sudan", "sudan", "pakistan", "san_marino", "san_marino"));
        questions.add(new Question(R.drawable.sao_tome_principe, "sao_tome_principe", "algeria", "caricom", "sao_tome_principe", "morocco", "sao_tome_principe"));
        questions.add(new Question(R.drawable.saudi_arabia, "saudi_arabia", "cook_islands", "saudi_arabia", "finland", "madagascar", "saudi_arabia"));
        questions.add(new Question(R.drawable.scotland, "scotland", "scotland", "faroes", "slovakia", "georgia", "scotland"));
        questions.add(new Question(R.drawable.senegal, "senegal", "somalia", "bolivia", "senegal", "tajikistan", "senegal"));
        questions.add(new Question(R.drawable.serbia, "serbia", "serbia", "cayman_islands", "monaco", "madagascar", "serbia"));
        questions.add(new Question(R.drawable.seychelles, "seychelles", "tanzania", "vanutau", "seychelles", "laos", "seychelles"));
        questions.add(new Question(R.drawable.sierra_leone, "sierra_leone", "yemen", "northern_cyprus", "sierra_leone", "bolivia", "sierra_leone"));
        questions.add(new Question(R.drawable.singapore, "singapore", "singapore", "nicaragua", "maldives", "south_africa", "singapore"));
        questions.add(new Question(R.drawable.slovakia, "slovakia", "ukraine", "zambia", "monaco", "slovakia", "slovakia"));
        questions.add(new Question(R.drawable.slovenia, "slovenia", "reunion", "opec", "slovenia", "zambia", "slovenia"));
        questions.add(new Question(R.drawable.solomon_islands, "solomon_islands", "solomon_islands", "cis", "malaysia", "cis", "solomon_islands"));
        questions.add(new Question(R.drawable.somalia, "somalia", "somalia", "denmark", "denmark", "caricom", "somalia"));
        questions.add(new Question(R.drawable.somaliland, "somaliland", "cis", "somaliland", "egypt", "mauritius", "somaliland"));
        questions.add(new Question(R.drawable.south_africa, "south_africa", "tunisia", "south_africa", "romania", "brunei", "south_africa"));
        questions.add(new Question(R.drawable.south_korea, "south_korea", "guinea_bissau", "eritrea", "south_korea", "monaco", "south_korea"));
        questions.add(new Question(R.drawable.spain, "spain", "macao", "spain", "bulgaria", "iraq", "spain"));
        questions.add(new Question(R.drawable.sri_lanka, "sri_lanka", "tahiti", "thailand", "israel", "sri_lanka", "sri_lanka"));
        questions.add(new Question(R.drawable.st_kitts_nevis, "st_kitts_nevis", "timor_leste", "st_kitts_nevis", "france", "portugal", "st_kitts_nevis"));
        questions.add(new Question(R.drawable.st_vincent_the_grenadines, "st_vincent_the_grenadines", "united_kingdom", "estonia", "islamic_conference", "st_vincent_the_grenadines", "st_vincent_the_grenadines"));
        questions.add(new Question(R.drawable.sudan, "sudan", "portugal", "western_sahara", "sudan", "european_union", "sudan"));
        questions.add(new Question(R.drawable.suriname, "suriname", "kosovo", "belarus", "suriname", "lebanon", "suriname"));
        questions.add(new Question(R.drawable.swaziland, "swaziland", "morocco", "swaziland", "guinea", "somalia", "swaziland"));
        questions.add(new Question(R.drawable.sweden, "sweden", "sweden", "ecuador", "ethiopia", "haiti", "sweden"));
        questions.add(new Question(R.drawable.syria, "syria", "syria", "kenya", "solomon_islands", "papua_new_guinea", "syria"));
        questions.add(new Question(R.drawable.tahiti, "tahiti", "brazil", "tahiti", "ukraine", "israel", "tahiti"));
        questions.add(new Question(R.drawable.taiwan, "taiwan", "martinique", "taiwan", "costa_rica", "liberia", "taiwan"));
        questions.add(new Question(R.drawable.tajikistan, "tajikistan", "turkey", "tajikistan", "puerto_rico", "virgin_islands_british", "tajikistan"));
        questions.add(new Question(R.drawable.tanzania, "tanzania", "dominica", "belgium", "bahamas", "tanzania", "tanzania"));
        questions.add(new Question(R.drawable.thailand, "thailand", "liberia", "bermuda", "mozambique", "thailand", "thailand"));
        questions.add(new Question(R.drawable.timor_leste, "timor_leste", "trinidad_tobago", "timor_leste", "turkey", "vatican_city", "timor_leste"));
        questions.add(new Question(R.drawable.togo, "togo", "england", "togo", "uruguay", "bosnia_herzegovina", "togo"));
        questions.add(new Question(R.drawable.tonga, "tonga", "jersey", "costa_rica", "andorra", "tonga", "tonga"));
        questions.add(new Question(R.drawable.trinidad_tobago, "trinidad_tobago", "trinidad_tobago", "ukraine", "sao_tome_principe", "latvia", "trinidad_tobago"));
        questions.add(new Question(R.drawable.tunisia, "tunisia", "bahrain", "comoros", "tunisia", "qatar", "tunisia"));
        questions.add(new Question(R.drawable.turkey, "turkey", "spain", "botswana", "turkey", "nauru", "turkey"));
        questions.add(new Question(R.drawable.turkmenistan, "turkmenistan", "american_samoa", "turkmenistan", "poland", "mauritius", "turkmenistan"));
        questions.add(new Question(R.drawable.turks_and_caicos_islands, "turks_and_caicos_islands", "philippines", "turks_and_caicos_islands", "poland", "palau", "turks_and_caicos_islands"));
        questions.add(new Question(R.drawable.tuvalu, "tuvalu", "cyprus", "tuvalu", "honduras", "belgium", "tuvalu"));
        questions.add(new Question(R.drawable.uganda, "uganda", "uganda", "nato", "austria", "uzbekistan", "uganda"));
        questions.add(new Question(R.drawable.ukraine, "ukraine", "netherlands_antilles", "liechtenshein", "colombia", "ukraine", "ukraine"));
        questions.add(new Question(R.drawable.united_arab_emirates, "united_arab_emirates", "kenya", "papua_new_guinea", "india", "united_arab_emirates", "united_arab_emirates"));
        questions.add(new Question(R.drawable.united_kingdom, "united_kingdom", "united_kingdom", "portugal", "brazil", "philippines", "united_kingdom"));
        questions.add(new Question(R.drawable.united_nations, "united_nations", "ethiopia", "united_nations", "micronesia", "palau", "united_nations"));
        questions.add(new Question(R.drawable.united_states_of_america, "united_states_of_america", "croatia", "united_states_of_america", "saudi_arabia", "samoa", "united_states_of_america"));
        questions.add(new Question(R.drawable.uruguay, "uruguay", "haiti", "uruguay", "guinea_bissau", "congo_brazzaville", "uruguay"));
        questions.add(new Question(R.drawable.uzbekistan, "uzbekistan", "ethiopia", "uzbekistan", "oman", "antarctica", "uzbekistan"));
        questions.add(new Question(R.drawable.vanutau, "vanutau", "vanutau", "cook_islands", "thailand", "st_kitts_nevis", "vanutau"));
        questions.add(new Question(R.drawable.vatican_city, "vatican_city", "vanutau", "opec", "austria", "vatican_city", "vatican_city"));
        questions.add(new Question(R.drawable.venezuela, "venezuela", "gambia", "venezuela", "macao", "trinidad_tobago", "venezuela"));
        questions.add(new Question(R.drawable.viet_nam, "viet_nam", "virgin_islands_british", "viet_nam", "kuwait", "marshall_islands", "viet_nam"));
        questions.add(new Question(R.drawable.virgin_islands_british, "virgin_islands_british", "myanmar", "virgin_islands_british", "venezuela", "spain", "virgin_islands_british"));
        questions.add(new Question(R.drawable.virgin_islands_us, "virgin_islands_us", "reunion", "romania", "virgin_islands_us", "madagascar", "virgin_islands_us"));
        questions.add(new Question(R.drawable.wales, "wales", "european_union", "united_arab_emirates", "wales", "mongolia", "wales"));
        questions.add(new Question(R.drawable.western_sahara, "western_sahara", "puerto_rico", "western_sahara", "cayman_islands", "vanutau", "western_sahara"));
        questions.add(new Question(R.drawable.yemen, "yemen", "mexico", "st_vincent_the_grenadines", "greenland", "yemen", "yemen"));
        questions.add(new Question(R.drawable.zambia, "zambia", "finland", "palestine", "bhutan", "zambia", "zambia"));
        questions.add(new Question(R.drawable.zimbabwe, "zimbabwe", "lithuania", "moldova", "montserrat", "zimbabwe", "zimbabwe"));
    } //Our database, using netbeans


    public void Questionsplay() {
        getAllquestions();
        Collections.shuffle(questions);//change randmoly the index of each questions

        int count = 0;

        while (count < 15) {
            questionsPlay.add(questions.get(count));
            count++;
        }
    } //pick 15 questions on the list, so there is no duplicate.

    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration); // opens the corresponding layout
        Button mStartButton = (Button) findViewById(R.id.Start_Button);
        mStartButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Player aplayer = new Player();
                EditText nameField = (EditText) findViewById(R.id.registration_name);
                String name = nameField.getText().toString(); // get the name of the player from the input
                aplayer.setName(name); // stores the name of the new player
                EditText emailField = (EditText) findViewById(R.id.emailRegistration);
                String email = emailField.getText().toString(); // get the email of the player from the input
                aplayer.setEmail(email); // store the email of the new player

                Questionsplay(); // create the list of 15 questions
                Intent intention = new Intent(RegistrationActivity.this,DisplayQuestionActivity.class);
                intention.putExtra("aplayer",aplayer); // passing data to Playing Activity
                Bundle bundle = new Bundle();
                bundle.putSerializable("questionsPlay", (Serializable) questionsPlay);
                intention.putExtras(bundle); //added
                startActivity(intention);

            }
        });
    }
}

