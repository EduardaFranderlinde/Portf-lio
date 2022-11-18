package com.example.litteltestevocacional2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;


public class TelaTeste extends AppCompatActivity {
    Button enviar;
    CheckBox intro, extrover, introver, socia, ativo, lerdo, lider, gentil, resist, perseve, reser,
            otimi, pessimi, atento, rapido, sincero, educa, encanto, perspi, competi, autocon, ansio, amiga,
            acessi, sensi, frio, silenci, ironia, ciume, confia, fala, impul, organi, tatil, preciso, ouvi, conci, diplo,atenci, cuida, caute, ana, respo;
    RadioGroup grupo1;
    int grupo = 0;
    int d = 0;
    int c = 0;
    int i = 0;
    int e = 0;
    int cIntro = 0;
    int cExtrover = 0;
    int cIntrover = 0;
    int cSocia = 0;
    int cAtivo = 0;
    int cLerdo = 0;
    int clider = 0;
    int cGentil = 0;
    int cResist = 0;
    int cPerseve = 0;
    int cReser = 0;
    int cOtimi = 0;
    int cPessimi = 0;
    int cAtento = 0;
    int cRapido = 0;
    int cSince = 0;
    int cEduca = 0;
    int cEncan = 0;
    int cPerspi = 0;
    int cCompeti = 0;
    int cAutocon = 0;
    int cAnsio = 0;
    int cAmiga = 0;
    int cAcessi = 0;
    int cSensi = 0;
    int cFrio = 0;
    int cSilenci = 0;
    int cIronia = 0;
    int cCiume = 0;
    int cConfia = 0;
    int cFala = 0;
    int cImpul = 0;
    int cOrgani = 0;
    int cTatil = 0;
    int cOuvi = 0;
    int cPreciso = 0;
    int cConci = 0;
    int cDiplo = 0;
    int cAtencio = 0;
    int cCuida = 0;
    int cCaute = 0;
    int cAna = 0;
    int cRespo = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_teste);
        getWindow().setStatusBarColor(Color.BLACK);
        getSupportActionBar().hide();
        enviar = findViewById(R.id.enviar);
        intro = findViewById(R.id.introme);
        extrover = findViewById(R.id.extrove);
        introver = findViewById(R.id.introver);
        socia = findViewById(R.id.socia);
        ativo = findViewById(R.id.ativo);
        lerdo = findViewById(R.id.lerdo);
        lider = findViewById(R.id.lider);
        gentil = findViewById(R.id.gentil);
        resist = findViewById(R.id.resist);
        perseve = findViewById(R.id.perse);
        reser = findViewById(R.id.reser);
        otimi = findViewById(R.id.otim);
        pessimi = findViewById(R.id.pessi);
        atento = findViewById(R.id.atento);
        rapido = findViewById(R.id.rapido);
        sincero = findViewById(R.id.since);
        educa = findViewById(R.id.educd);
        encanto = findViewById(R.id.encan);
        perspi = findViewById(R.id.perspi);
        competi = findViewById(R.id.competi);
        autocon = findViewById(R.id.autoconf);
        ansio = findViewById(R.id.ansio);
        amiga = findViewById(R.id.amiga);
        acessi = findViewById(R.id.acessi);
        sensi = findViewById(R.id.sensi);
        frio = findViewById(R.id.frio);
        silenci = findViewById(R.id.silen);
        ironia = findViewById(R.id.ironico);
        ciume = findViewById(R.id.ciume);
        confia = findViewById(R.id.confi);
        fala = findViewById(R.id.fala);
        impul = findViewById(R.id.impul);
        organi = findViewById(R.id.organiz);
        tatil = findViewById(R.id.tat);
        preciso = findViewById(R.id.preci);
        ouvi = findViewById(R.id.ouvi);
        conci = findViewById(R.id.conci);
        diplo = findViewById(R.id.diplo);
        atenci = findViewById(R.id.atenci);
        cuida = findViewById(R.id.cuida);
        caute = findViewById(R.id.caute);
        ana = findViewById(R.id.anal);
        respo = findViewById(R.id.respo);
        grupo1 = findViewById(R.id.grupo1);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click();
                verificaChecks();
            }
        });
    }
    
    public void verificaChecks(){
        Intent dom = new Intent(this, TelaDominancia.class);
        Intent inf = new Intent(this, TelaInfluencia.class);
        Intent conf = new Intent(this, TelaConformidade.class);
        Intent est = new Intent(this, TelaEstabilidade.class);
        if (grupo == 10) {

            if (d >= e && d > i && d >= c) {
                startActivity(dom);
            }else if (i >= d && i >= e && i >= c) {
                startActivity(inf);
            } else if (c > d && c > i && c >= e) {
                startActivity(conf);
            } else if (e > d && e > i && e > c) {
                startActivity(est);
            }

        } else if (grupo>10) {
            Toast.makeText(this, "Selecione menos "+(grupo-10)+" adjetivos", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Selecione mais "+(10-grupo)+" adjetivos", Toast.LENGTH_SHORT).show();
        }
    }

    public void click() {

        if (intro.isChecked() == true) {
            if(cIntro == 0){
                i++;
                grupo = grupo + 1;
                cIntro = 1;
                System.out.println(cIntro + "test");
            }else if (cIntro ==1) {

            }
        }else if (intro.isChecked() == false && cIntro ==1) {
            cIntro = 0;
            grupo = grupo - 1;
            i--;
            System.out.println(grupo + "else");
        }



        if (extrover.isChecked() == true) {
            if (cExtrover == 0) {
                i++;
                d++;
                grupo = grupo + 1;
                cExtrover = 1;
                System.out.println(cIntro + "test");
            } else if (cExtrover == 1) {

            }
        }else if (extrover.isChecked() == false && cExtrover ==1) {
            cExtrover = 0;
            grupo = grupo - 1;
            i--;
            d--;


        }



        if (introver.isChecked() == true) {
            if(cIntrover ==0){
                e++;
                grupo = grupo + 1;
                cIntrover = 1;
            }else if (cIntrover == 1){

            }
        } else if (introver.isChecked() == false && cIntrover ==1) {
            cIntrover = 0;
            grupo = grupo - 1;
            e--;


        }



        if (socia.isChecked() == true) {
            if(cSocia == 0){
                i++;
                grupo = grupo + 1;
                cSocia = 1;

            }else if (cSocia ==1) {

            }
        }else if (socia.isChecked() == false && cSocia ==1) {
            cSocia = 0;
            grupo = grupo - 1;
            i--;

        }

        if (ativo.isChecked() == true) {
            if(cAtivo == 0){
                i++;
                d++;
                grupo = grupo + 1;
                cAtivo = 1;
            }else if (cAtivo== 1) {

            }
        } else if (ativo.isChecked() == false && cAtivo == 1) {
            cAtivo = 0;
            grupo = grupo - 1;
            i--;
            d--;
        }

        if (lerdo.isChecked() == true) {
            if(cLerdo == 0){
                i++;
                grupo = grupo + 1;
                cLerdo = 1;
            }else if (cLerdo ==1) {
            }
        } else if (ativo.isChecked() == false && cLerdo ==1) {
            cLerdo = 0;
            grupo = grupo - 1;
            i--;
        }



        if (lider.isChecked() == true) {
            if(clider == 0){
                d++;
                grupo = grupo + 1;
                clider = 1;
            }else if (clider ==1) {

            }
        } else if (lider.isChecked() == false && clider == 1) {
            clider = 0;
            grupo = grupo - 1;
            d--;
        }



        if (gentil.isChecked() == true) {
            if(cGentil == 0){
                d++;
                e++;
                i++;
                grupo = grupo + 1;
                cGentil = 1;
            }else if (cGentil ==1) {

            }
        } else if (gentil.isChecked() == false && cGentil == 1) {
            cGentil = 0;
            grupo = grupo - 1;
            d--;
            e--;
            i--;
        }


        if (resist.isChecked() == true) {
            if(cResist == 0){
                i++;
                d++;
                grupo = grupo + 1;
                cResist = 1;
            }else if (cResist ==1) {

            }
        } else if (resist.isChecked() == false && cResist ==1) {
            cResist = 0;
            grupo = grupo - 1;
            d--;
            i--;
        }


        if (perseve.isChecked() == true) { // perseve funciona individualmente, mas não quando mais de um checkbox é marcado
            if(cPerseve == 0){
                d++;
                grupo = grupo + 1;
                cPerseve = 1;
            }else if (cPerseve ==1) {

            }
        } else if (perseve.isChecked() == false && cPerseve ==1) {
            cPerseve = 0;
            grupo = grupo - 1;
            d--;
        }




        if (reser.isChecked() == true) {
            if(cReser == 0){
                d++;
                e++;
                c++;
                grupo = grupo + 1;
                cReser = 1;

            }else if (cSocia ==1) {

            }
        } else if (reser.isChecked() == false && cReser ==1) {
            cReser = 0;
            grupo = grupo - 1;
            d--;
            e--;
            c--;
        }

        if (otimi.isChecked() == true) {
            if(cOtimi == 0){
                i++;
                d++;
                grupo = grupo + 1;
                cOtimi = 1;
            }else if (cOtimi ==1) {

            }
        } else if (otimi.isChecked() == false && cOtimi ==1) {
            cOtimi = 0;
            grupo = grupo - 1;
            i--;
            d--;
        }




        if (pessimi.isChecked() == true) {
            if(cPessimi == 0){
                e++;
                c++;
                grupo = grupo + 1;
                cPessimi = 1;

            }else if (cPessimi ==1) {

            }
        } else if (pessimi.isChecked() == false && cPessimi ==1) {
            cPessimi = 0;
            grupo = grupo - 1;
            e--;
            c--;
        }




        if (atento.isChecked() == true) {
            if(cAtento == 0){
                e++;
                c++;
                grupo = grupo + 1;
                cAtento = 1;

            }else if (cAtento ==1) {

            }
        } else if (atento.isChecked() == false && cAtento ==1) {
            cAtento = 0;
            grupo = grupo - 1;
            c--;
            e--;
        }




        if (rapido.isChecked() == true) {
            if(cRapido == 0){
                d++;
                i++;
                grupo = grupo + 1;
                cRapido = 1;

            }else if (cRapido ==1) {

            }
        } else if (rapido.isChecked() == false && cRapido ==1) {
            cRapido = 0;
            grupo = grupo - 1;
            d--;
            i--;
        }




        if (sincero.isChecked() == true) {
            if(cSince == 0){
                d++;
                c++;
                grupo = grupo + 1;
                cSince = 1;

            }else if (cSince ==1) {

            }
        } else if (sincero.isChecked() == false && cSince == 1) {
            cSince = 0;
            grupo = grupo - 1;
            d--;
            c--;
        }




        if (educa.isChecked() == true) {
            if(cEduca == 0){
                c++;
                e++;
                grupo = grupo + 1;
                cEduca = 1;
                System.out.println(cEduca + "test");
            }else if (cEduca ==1) {

            }
        } else if (educa.isChecked() == false && cEduca ==1) {
            cEduca = 0;
            grupo = grupo - 1;
            c--;
            e--;
        }



        if (encanto.isChecked() == true) {
            if(cEncan == 0){
                i++;
                grupo = grupo + 1;
                cEncan = 1;
                System.out.println(cEncan + "test");
            }else if (cEncan ==1) {

            }
        } else if (encanto.isChecked() == false && cEncan ==1) {
            cEncan = 0;
            grupo = grupo - 1;
            i--;
        }




        if (perspi.isChecked() == true) {
            if(cPerspi == 0){
                e++;
                c++;
                grupo = grupo + 1;
                cPerspi = 1;
                System.out.println(cPerspi + "test");
            }else if (cPerspi ==1) {

            }
        } else if (perspi.isChecked() == false && cPerspi ==1) {
            cPerspi = 0;
            grupo = grupo - 1;
            e--;
            c--;
        }




        if (competi.isChecked() == true) {
            if(cCompeti == 0){
                d++;
                e++;
                grupo = grupo + 1;
                cCompeti = 1;
                System.out.println(cCompeti + "test");
            }else if (cCompeti ==1) {

            }
        } else if (competi.isChecked() == false && cCompeti ==1) {
            cCompeti = 0;
            grupo = grupo - 1;
            d--;
            e--;
        }



        if (autocon.isChecked() == true) {
            if(cAutocon == 0){
                d++;
                i++;
                grupo = grupo + 1;
                cAutocon = 1;
                System.out.println(cAutocon + "test");
            }else if (cAutocon ==1) {

            }
        } else if (autocon.isChecked() == false && cAutocon ==1) {
            cAutocon = 0;
            grupo = grupo - 1;
            d--;
            i--;
        }



        if (ansio.isChecked() == true) {
            if(cAnsio == 0){
                d++;
                e++;
                c++;
                grupo = grupo + 1;
                cAnsio = 1;

            }else if (cAnsio ==1) {

            }
        } else if (ansio.isChecked() == false && cAnsio ==1) {
            cAnsio = 0;
            grupo = grupo - 1;
            d--;
            e--;
            c--;
        }



        if (amiga.isChecked() == true) {
            if(cAmiga == 0){
                d++;
                i++;
                grupo = grupo + 1;
                cAmiga = 1;

            }else if (cAmiga ==1) {

            }
        } else if (amiga.isChecked() == false && cAmiga ==1) {
            cAmiga = 0;
            grupo = grupo - 1;
            d--;
            i--;
        }



        if (acessi.isChecked() == true) {
            if(cAcessi == 0){
                e++;
                i++;
                grupo = grupo + 1;
                cAcessi = 1;

            }else if (cAcessi ==1) {

            }
        } else if (acessi.isChecked() == false && cAcessi ==1) {
            cAcessi = 0;
            grupo = grupo - 1;
            e--;
            i--;
        }



        if (sensi.isChecked() == true) {
            if(cSensi == 0){
                i++;
                grupo = grupo + 1;
                cSensi = 1;

            }else if (cSensi ==1) {

            }
        } else if (sensi.isChecked() == false && cSensi ==1 ) {
            cSensi = 0;
            grupo = grupo - 1;
            i--;
        }



        if (frio.isChecked() == true) {
            if(cFrio == 0){
                d++;
                grupo = grupo + 1;
                cFrio = 1;

            }else if (cFrio ==1) {

            }
        } else if (frio.isChecked() == false && cFrio == 1) {
            cFrio = 0;
            grupo = grupo - 1;
            d--;
        }



        if (silenci.isChecked() == true) {
            if(cSilenci == 0){
                e++;
                c++;
                grupo = grupo + 1;
                cSilenci = 1;

            }else if (cSilenci ==1) {

            }
        } else if (silenci.isChecked() == false && cSilenci ==1) {
            cSilenci = 0;
            grupo = grupo - 1;
            c--;
            e--;
        }



        if (ironia.isChecked() == true) {
            if(cIronia == 0){
                d++;
                i++;
                grupo = grupo + 1;
                cIronia = 1;

            }else if (cIronia ==1) {

            }
        } else if (ironia.isChecked() == false && cIronia == 1) {
            cIronia = 0;
            grupo = grupo - 1;
            d--;
            i--;
        }



        if (ciume.isChecked() == true) {
            if(cCiume == 0){
                e++;
                grupo = grupo + 1;
                cCiume = 1;

            }else if (cCiume ==1) {

            }
        } else if (ciume.isChecked() == false && cCiume ==1) {
            cCiume = 0;
            grupo = grupo - 1;
            e--;
        }



        if (confia.isChecked() == true) {
            if(cConfia == 0){
                e++;
                c++;
                grupo = grupo + 1;
                cConfia = 1;

            }else if (cConfia ==1) {

            }
        } else if (confia.isChecked() == false && cConfia ==1) {
            cConfia = 0;
            grupo = grupo - 1;
            e--;
            c--;
        }



        if (fala.isChecked() == true) {
            if(cFala == 0){
                i++;
                grupo = grupo + 1;
                cFala = 1;

            }else if (cFala ==1) {

            }
        } else if (fala.isChecked() == false && cFala ==1) {
            cFala = 0;
            grupo = grupo - 1;
            i--;
        }



        if (impul.isChecked() == true) {
            if(cImpul == 0){
                i++;
                grupo = grupo + 1;
                cImpul = 1;

            }else if (cImpul ==1) {

            }
        } else if (impul.isChecked() == false && cImpul ==1) {
            cImpul = 0;
            grupo = grupo - 1;
            i--;
        }



        if (organi.isChecked() == true) {
            if(cOrgani == 0){
                c++;
                grupo = grupo + 1;
                cOrgani = 1;

            }else if (cOrgani ==1) {

            }
        } else if (organi.isChecked() == false && cOrgani == 1) {
            cOrgani = 0;
            grupo = grupo - 1;
            c--;
        }



        if (tatil.isChecked() == true) {
            if(cTatil == 0){
                c++;
                grupo = grupo + 1;
                cTatil = 1;

            }else if (cTatil == 1) {

            }
        } else if (tatil.isChecked() == false && cTatil == 1) {
            cTatil = 0;
            grupo = grupo - 1;
            c--;
        }



        if (preciso.isChecked() == true) {
            if(cPreciso == 0){
                c++;
                grupo = grupo + 1;
                cPreciso = 1;

            }else if (cPreciso ==1) {

            }
        } else if (preciso.isChecked() == false && cPreciso ==1) {
            cPreciso = 0;
            grupo = grupo - 1;
            c--;
        }



        if (ouvi.isChecked() == true) {
            if(cOuvi == 0){
                e++;
                grupo = grupo + 1;
                cOuvi = 1;

            }else if (cOuvi ==1) {

            }
        } else if (ouvi.isChecked() == false && cOuvi ==1) {
            cOuvi = 0;
            grupo = grupo - 1;
            e--;
        }

        if (conci.isChecked() == true) {
            if(cConci == 0){
                e++;
                grupo = grupo + 1;
                cConci = 1;

            }else if (cConci ==1) {

            }
        } else if (conci.isChecked() == false && cConci == 1) {
            cConci = 0;
            grupo = grupo - 1;
            e--;
        }

        if (diplo.isChecked() == true) {
            if(cDiplo == 0){
                e++;
                c++;
                grupo = grupo + 1;
                cDiplo = 1;

            }else if (cDiplo ==1) {

            }
        } else if (diplo.isChecked() == false && cDiplo ==1) {
            cDiplo = 0;
            grupo = grupo - 1;
            c--;
            e--;
        }

        if (atenci.isChecked() == true) {
            if(cAtencio == 0){
                e++;
                grupo = grupo + 1;
                cAtencio = 1;

            }else if (cAtencio ==1) {

            }
        } else if (atenci.isChecked() == false && cAtencio ==1) {
            cAtencio = 0;
            grupo = grupo - 1;
            e--;
        }

        if (cuida.isChecked() == true) {
            if(cCuida == 0){
                c++;
                grupo = grupo + 1;
                cCuida = 1;

            }else if (cCuida ==1) {

            }
        } else if (cuida.isChecked() == false && cCuida ==1) {
            cCuida = 0;
            grupo = grupo - 1;
            c--;
        }


        if (caute.isChecked() == true) {
            if(cCaute == 0){
                c++;
                grupo = grupo + 1;
                cCaute = 1;

            }else if (cCaute ==1) {

            }
        } else if (caute.isChecked() == false && cCaute == 1) {
            cCaute = 0;
            grupo = grupo - 1;
            c--;
        }



        if (ana.isChecked() == true) {
            if(cAna == 0){
                c++;
                grupo = grupo + 1;
                cAna = 1;

            }else if (cAna ==1) {

            }
        } else if (ana.isChecked() == false && cAna ==1) {
            cAna = 0;
            grupo = grupo - 1;
            c--;
        }


        if (respo.isChecked() == true) {
            if(cRespo == 0){
                c++;
                grupo = grupo + 1;
                cRespo = 1;

            }else if (cRespo ==1) {

            }
        } else if (respo.isChecked() == false && cRespo ==1 ) {
            cRespo = 0;
            grupo = grupo - 1;
            c--;
        }

        System.out.println(grupo + "grupo");
        System.out.println(i + "i");
        System.out.println(e + "e");
        System.out.println(d + "d");
        System.out.println(c + "c");

    }
}
