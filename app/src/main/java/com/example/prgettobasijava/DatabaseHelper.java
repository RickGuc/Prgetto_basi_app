package com.example.prgettobasijava;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.prgettobasijava.Modelli.ModelloDescrEsame;
import com.example.prgettobasijava.Modelli.ModelloDescrTerapia;
import com.example.prgettobasijava.Modelli.ModelloEsame;
import com.example.prgettobasijava.Modelli.ModelloEsenzione;
import com.example.prgettobasijava.Modelli.ModelloEsenzionePaziente;
import com.example.prgettobasijava.Modelli.ModelloOspedale;
import com.example.prgettobasijava.Modelli.ModelloPatologia;
import com.example.prgettobasijava.Modelli.ModelloPaziente;
import com.example.prgettobasijava.Modelli.ModelloRicovero;
import com.example.prgettobasijava.Modelli.ModelloSintomo;
import com.example.prgettobasijava.Modelli.ModelloTerapia;
import com.example.prgettobasijava.Modelli.Query1;
import com.example.prgettobasijava.Modelli.Query2;
import com.example.prgettobasijava.Modelli.Query3;
import com.example.prgettobasijava.Modelli.Query4;
import com.example.prgettobasijava.Modelli.Query5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String COLONNA_PAZIENTE = "PAZIENTE";
    public static final String TABELLA_PAZIENTE = "TABELLA_PAZIENTE";
    public static final String COLONNA_NOME = "NOME";
    public static final String COLONNA_COGNOME = "COGNOME";
    public static final String COLONNA_CODICE = "CODICE";
    public static final String COLONNA_CODICEFISCALE = "CODICEFISCALE";
    public static final String COLONNA_CODICESANITARIO = "CODICESANITARIO";
    public static final String COLONNA_DATA = "DATA";
    public static final String COLONNA_CITTA = "CITTA";
    public static final String COLONNA_VIA = "VIA";
    public static final String COLONNA_NUMERO = "NUMERO";
    public static final String COLONNA_GENERE = "GENERE";
    public static final String TABELLA_OSPEDALI = "TABELLA_OSPEDALI";
    public static final String COLONNA_ID = "ID";
    public static final String COLONNA_NUMERODITELEFONO = "NUMERODITELEFONO";
    public static final String TABELLA_PATOLOGIE_CONTRATTE = "TABELLA_PATOLOGIE_CONTRATTE";
    public static final String COLONNA_DATA_RILEVAZIONE = "DATA_RILEVAZIONE";
    public static final String TABELLA_RICOVERI = "TABELLA_RICOVERI";
    public static final String TABELLA_SINTOMI = "TABELLA_SINTOMI";
    public static final String TABELLA_DESCRIZIONE_ESAMI = "TABELLA_DESCRIZIONE_ESAMI";
    public static final String TABELLA_DESCRIZIONE_TERAPIE = "TABELLA_DESCRIZIONE_TERAPIE";
    public static final String TABELLA_ESAMI = "TABELLA_ESAMI";
    public static final String TABELLA_TERAPIE = "TABELLA_TERAPIE";
    public static final String TABELLA_ESENZIONI = "TABELLA_ESENZIONI";
    public static final String TABELLA_ESENZIONI_PAZIENTI = "ESENZIONI_PAZIENTI";
    public static final String COLONNA_OSPEDALE = "OSPEDALE";
    public static final String COLONNA_DATA_RICOVERO = "DATA_RICOVERO";
    public static final String COLONNA_DATA_RILASCIO = "DATA_RILASCIO";
    public static final String COLONNA_DESCRIZIONE_SINTOMO = "DESCRIZIONE_SINTOMO";
    public static final String COLONNA_TIPO = "TIPO";
    public static final String COLONNA_COSTO = "COSTO";
    public static final String COLONNA_SPECIALISTA = "SPECIALISTA";
    public static final String COLONNA_DOSAGGIO = "DOSAGGIO";
    public static final String COLONNA_VOLTE_A_SETTIMANA = "VOLTE_A_SETTIMANA";
    public static final String COLONNA_ESAME = "ESAME";
    public static final String COLONNA_DATA_INIZIO = "DATA_INIZIO";
    public static final String COLONNA_DATA_FINE = "DATA_FINE";
    public static final String COLONNA_ORA = "ORA";
    public static final String COLONNA_PATOLOGIA = "PATOLOGIA";
    public static final String COLONNA_OPERATORE_SANITARIO = "OPERATORE_SANITARIO";
    public static final String COLONNA_TERAPIA = "TERAPIA";
    public static final String COLONNA_ESENZIONE = "ESENZIONE";
    public static final String COLONNA_CAREGIVER = "CAREGIVER";
    public static final String COLONNA_NOTE = "NOTE";
    public static final String TABELLA_REGISTRO_ESENZIONI = "TABELLA_REGISTRO_ESENZIONI";


    public DatabaseHelper(@Nullable Context context) {
        super(context,"SchedarioPazienti.db", null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + TABELLA_PAZIENTE + " (" + COLONNA_NOME + " VARCHAR, " + COLONNA_COGNOME + " VARCHAR, " + COLONNA_CODICEFISCALE + " CHAR(16) PRIMARY KEY, " + COLONNA_CODICESANITARIO + " CHAR(16), " + COLONNA_DATA + " DATE, " + COLONNA_CITTA + " VARCHAR, " + COLONNA_VIA + " VARCHAR, " + COLONNA_NUMERO + " CHAR(4), " + COLONNA_GENERE + " VARCHAR(9))";
        String createTableStatement2 = "CREATE TABLE " + TABELLA_OSPEDALI + " (" + COLONNA_ID + " INTEGER  PRIMARY KEY AUTOINCREMENT, " + COLONNA_NOME + " VARCHAR, " + COLONNA_CITTA + " VARCHAR, " + COLONNA_VIA + " VARCHAR, " + COLONNA_NUMERO + " CHAR(4), " + COLONNA_NUMERODITELEFONO + " VARCHAR)";
        String createTableStatement3 = "CREATE TABLE " + TABELLA_PATOLOGIE_CONTRATTE + " (" + COLONNA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLONNA_NOME + " VARCHAR, " + COLONNA_PAZIENTE + " CHAR(16), " + COLONNA_DATA_RILEVAZIONE + " DATE, FOREIGN KEY (" + COLONNA_PAZIENTE + ") REFERENCES " + TABELLA_PAZIENTE + " (" + COLONNA_CODICEFISCALE + "))";
        String createTableStatement4 = "CREATE TABLE " + TABELLA_RICOVERI + " (" + COLONNA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLONNA_OSPEDALE + " INT, " + COLONNA_PAZIENTE + " CHAR(16), " + COLONNA_DATA_RICOVERO + " DATE, " + COLONNA_DATA_RILASCIO + " DATE, FOREIGN KEY (" + COLONNA_PAZIENTE + ") REFERENCES " + TABELLA_PAZIENTE + " (" + COLONNA_CODICEFISCALE + "), FOREIGN KEY (" + COLONNA_OSPEDALE + ") REFERENCES " + TABELLA_OSPEDALI + " (" + COLONNA_ID + "))";
        String createTableStatement5 = "CREATE TABLE " + TABELLA_SINTOMI + " (" + COLONNA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLONNA_DESCRIZIONE_SINTOMO + " VARCHAR, " + COLONNA_DATA_RILEVAZIONE + " DATE, " + COLONNA_PAZIENTE + " CHAR(16), FOREIGN KEY (" + COLONNA_PAZIENTE + ") REFERENCES " + TABELLA_PAZIENTE + " (" + COLONNA_CODICEFISCALE + "))";
        String createTableStatement6 = "CREATE TABLE " + TABELLA_DESCRIZIONE_ESAMI + " (" + COLONNA_NOME + " VARCHAR PRIMARY KEY, " + COLONNA_TIPO + " VARCHAR, " + COLONNA_COSTO + " SMALLINT, " + COLONNA_SPECIALISTA + " VARCHAR)";
        String createTableStatement7 = "CREATE TABLE " + TABELLA_DESCRIZIONE_TERAPIE + " (" + COLONNA_NOME + " VARCHAR PRIMARY KEY, " + COLONNA_DOSAGGIO + " VARCHAR, " + COLONNA_VOLTE_A_SETTIMANA + " TINYINT)";
        String createTableStatement8 = "CREATE TABLE " + TABELLA_ESAMI + " (" + COLONNA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLONNA_ESAME + " VARCHAR, " + COLONNA_DATA + " DATE, " + COLONNA_ORA + " TIME, " + COLONNA_PAZIENTE + " CHAR(16), " + COLONNA_PATOLOGIA + " INT, " + COLONNA_OPERATORE_SANITARIO + " VARCHAR, " + COLONNA_OSPEDALE + " INT, FOREIGN KEY (" + COLONNA_ESAME + ") REFERENCES " + TABELLA_DESCRIZIONE_ESAMI + " (" + COLONNA_NOME + "), FOREIGN KEY (" + COLONNA_PAZIENTE + ") REFERENCES " + TABELLA_PAZIENTE + " (" + COLONNA_CODICEFISCALE + "), FOREIGN KEY (" + COLONNA_PATOLOGIA + ") REFERENCES " + TABELLA_PATOLOGIE_CONTRATTE + " (" + COLONNA_ID + "), FOREIGN KEY (" + COLONNA_OSPEDALE + ") REFERENCES " + TABELLA_OSPEDALI + " (" + COLONNA_ID + "))";
        String createTableStatement9 = "CREATE TABLE " + TABELLA_TERAPIE + " (" + COLONNA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLONNA_TERAPIA + " VARCHAR, " + COLONNA_PAZIENTE + " CHAR(16), " + COLONNA_PATOLOGIA + " INT, " + COLONNA_OPERATORE_SANITARIO + " VARCHAR, " + COLONNA_CAREGIVER + " VARCHAR,  " + COLONNA_DATA_INIZIO + " DATE, " + COLONNA_DATA_FINE + " DATE, " + COLONNA_NOTE + " VARCHAR, FOREIGN KEY (" + COLONNA_TERAPIA + ") REFERENCES " + TABELLA_DESCRIZIONE_TERAPIE + " (" + COLONNA_NOME + "), FOREIGN KEY (" + COLONNA_PAZIENTE + ") REFERENCES " + TABELLA_PAZIENTE + " (" + COLONNA_CODICEFISCALE + "), FOREIGN KEY (" + COLONNA_PATOLOGIA + ") REFERENCES " + TABELLA_PATOLOGIE_CONTRATTE + " (" + COLONNA_ID + "))";
        String createTableStatement10 = "CREATE TABLE " + TABELLA_REGISTRO_ESENZIONI + " (" + COLONNA_ESENZIONE + " VARCHAR PRIMARY KEY)";
        String createTableStatement11 = "CREATE TABLE " + TABELLA_ESENZIONI_PAZIENTI + " (" + COLONNA_CODICE + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLONNA_PAZIENTE + " CHAR(16), " + COLONNA_ESENZIONE + " VARCHAR, FOREIGN  KEY (" + COLONNA_PAZIENTE + ") REFERENCES " + TABELLA_PAZIENTE + " (" + COLONNA_CODICEFISCALE + "), FOREIGN KEY (" + COLONNA_ESENZIONE + ") REFERENCES " + TABELLA_REGISTRO_ESENZIONI + " (" + COLONNA_ESENZIONE + "))";
        String createTableStatement12 = "CREATE TABLE " + TABELLA_ESENZIONI + " (" + COLONNA_ESENZIONE + " VARCHAR, " + COLONNA_ESAME + " VARCHAR, PRIMARY KEY (" + COLONNA_ESENZIONE + ", " + COLONNA_ESAME + "), FOREIGN KEY (" + COLONNA_ESAME + ") REFERENCES " + TABELLA_DESCRIZIONE_ESAMI + " (" + COLONNA_NOME + "), FOREIGN KEY (" + COLONNA_ESENZIONE + ") REFERENCES " + TABELLA_REGISTRO_ESENZIONI + " (" + COLONNA_ESENZIONE + "))";

        db.execSQL(createTableStatement);
        db.execSQL(createTableStatement2);
        db.execSQL(createTableStatement3);
        db.execSQL(createTableStatement4);
        db.execSQL(createTableStatement5);
        db.execSQL(createTableStatement6);
        db.execSQL(createTableStatement7);
        db.execSQL(createTableStatement8);
        db.execSQL(createTableStatement9);
        db.execSQL(createTableStatement10);
        db.execSQL(createTableStatement11);
        db.execSQL(createTableStatement12);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

    public boolean addOne(ModelloPaziente modelloPaziente) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLONNA_NOME, modelloPaziente.getNome());
        cv.put(COLONNA_COGNOME, modelloPaziente.getCognome());
        cv.put(COLONNA_CODICEFISCALE, modelloPaziente.getCodiceFiscale());
        cv.put(COLONNA_CODICESANITARIO, modelloPaziente.getCodiceSanitario());
        cv.put(COLONNA_DATA, modelloPaziente.getDate().toString());
        cv.put(COLONNA_CITTA, modelloPaziente.getCittà());
        cv.put(COLONNA_VIA, modelloPaziente.getVia());
        cv.put(COLONNA_NUMERO, modelloPaziente.getNumero());
        cv.put(COLONNA_GENERE, modelloPaziente.getGenere());

       long insert = db.insert(TABELLA_PAZIENTE, null, cv);
        if (insert == -1)
            return false;
        else {

            return true;
        }



        }
        public boolean  addOne(ModelloDescrTerapia modelloDescrTerapia) {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();

            cv.put(COLONNA_NOME, modelloDescrTerapia.getNome());
            cv.put(COLONNA_DOSAGGIO, modelloDescrTerapia.getDosaggio());
            cv.put(COLONNA_VOLTE_A_SETTIMANA, ModelloDescrTerapia.getVas());

            long insert = db.insert(TABELLA_DESCRIZIONE_TERAPIE, null, cv);
            if (insert == -1)
                return false;
            else {

                return true;
            }
         }

         public boolean addOne(ModelloOspedale modelloOspedale) {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();

            cv.put(COLONNA_NOME, modelloOspedale.getNome());
            cv.put(COLONNA_CITTA, modelloOspedale.getCittà());
            cv.put(COLONNA_VIA, modelloOspedale.getVia());
            cv.put(COLONNA_NUMERO, modelloOspedale.getNumero());
            cv.put(COLONNA_NUMERODITELEFONO, modelloOspedale.getNt());

             long insert = db.insert(TABELLA_OSPEDALI, null, cv);
             if (insert == -1)
                 return false;
             else {

                 return true;
             }

         }

         public boolean addOne(ModelloPatologia modelloPatologia) {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();

            cv.put(COLONNA_NOME, modelloPatologia.getPatologia());
            cv.put(COLONNA_PAZIENTE, modelloPatologia.getCodicesanitario());
            cv.put(COLONNA_DATA_RILEVAZIONE, modelloPatologia.getDatarilevazione().toString());

             long insert = db.insert(TABELLA_PATOLOGIE_CONTRATTE, null, cv);
             if (insert == -1)
                 return false;
             else {

                 return true;
             }

         }

         public boolean addOne(ModelloRicovero modelloRicovero) {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();

            cv.put(COLONNA_OSPEDALE, modelloRicovero.getIdOspedale());
            cv.put(COLONNA_PAZIENTE, modelloRicovero.getCodicesanitariopaziente());
            cv.put(COLONNA_DATA_RICOVERO, modelloRicovero.getDataricovero().toString());
            cv.put(COLONNA_DATA_RILASCIO, modelloRicovero.getDatarilascio().toString());

             long insert = db.insert(TABELLA_RICOVERI, null, cv);
             if (insert == -1)
                 return false;
             else {

                 return true;
             }
         }

         public boolean addOne(ModelloSintomo modelloSintomo) {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();

            cv.put(COLONNA_DESCRIZIONE_SINTOMO, modelloSintomo.getDescrizionesintomo());
            cv.put(COLONNA_PAZIENTE, modelloSintomo.getCodicesanitariopaziente());
            cv.put(COLONNA_DATA_RILEVAZIONE, modelloSintomo.getDatarilevazione().toString());

             long insert = db.insert(TABELLA_SINTOMI, null, cv);
             if (insert == -1)
                 return false;
             else {

                 return true;
             }
         }

         public boolean addOne(ModelloDescrEsame modelloDescrEsame) {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();

            cv.put(COLONNA_NOME, modelloDescrEsame.getNome());
            cv.put(COLONNA_TIPO, modelloDescrEsame.getTipo());
            cv.put(COLONNA_COSTO, modelloDescrEsame.getCosto());
            cv.put(COLONNA_SPECIALISTA, modelloDescrEsame.getSpecialista());

             long insert = db.insert(TABELLA_DESCRIZIONE_ESAMI, null, cv);
             if (insert == -1)
                 return false;
             else {

                 return true;
             }

         }

         public boolean addOne(ModelloEsame modelloEsame) {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();

            cv.put(COLONNA_ESAME, modelloEsame.getNomeesame());
            cv.put(COLONNA_DATA, modelloEsame.getData().toString());
            cv.put(COLONNA_ORA, modelloEsame.getOra().toString());
            cv.put(COLONNA_PAZIENTE, modelloEsame.getCodicesanitariopaziente());
            cv.put(COLONNA_PATOLOGIA, modelloEsame.getIdpatologia());
            cv.put(COLONNA_OPERATORE_SANITARIO, modelloEsame.getCodicesanitariopaziente());
            cv.put(COLONNA_OSPEDALE, modelloEsame.getIdospedale());

             long insert = db.insert(TABELLA_ESAMI, null, cv);
             if (insert == -1)
                 return false;
             else {

                 return true;
             }
         }

         public boolean addOne(ModelloTerapia modelloTerapia) {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();

            cv.put(COLONNA_TERAPIA, modelloTerapia.getNometerapia());
            cv.put(COLONNA_PAZIENTE, modelloTerapia.getCodicesanitariopaziente());
            cv.put(COLONNA_PATOLOGIA, modelloTerapia.getIdcontrazione());
            cv.put(COLONNA_OPERATORE_SANITARIO, modelloTerapia.getOperatoresanitario());
            cv.put(COLONNA_CAREGIVER, modelloTerapia.getCaregiver());
            cv.put(COLONNA_DATA_INIZIO, modelloTerapia.getDatainizio().toString());
            cv.put(COLONNA_DATA_FINE, modelloTerapia.getDatafine().toString());
            cv.put(COLONNA_NOTE, modelloTerapia.getNote());

             long insert = db.insert(TABELLA_TERAPIE, null, cv);
             if (insert == -1)
                 return false;
             else {

                 return true;
             }
         }

         public boolean addOne(ModelloEsenzionePaziente modelloEsenzionePaziente) {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();

            cv.put(COLONNA_PAZIENTE, modelloEsenzionePaziente.getCodicesanitariopaziente());
            cv.put(COLONNA_ESENZIONE, modelloEsenzionePaziente.getEsenzione());

             long insert = db.insert(TABELLA_ESENZIONI_PAZIENTI, null, cv);
             if (insert == -1)
                 return false;
             else {

                 return true;
             }
         }

         public boolean addOne(ModelloEsenzione modelloEsenzione) {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();

            cv.put(COLONNA_ESENZIONE, modelloEsenzione.getEsenzione());
            cv.put(COLONNA_ESAME, modelloEsenzione.getNomeesame());

             long insert = db.insert(TABELLA_ESENZIONI, null, cv);
             if (insert == -1)
                 return false;
             else {

                 return true;
             }
         }


         public List<Query1> getQuery1() {
             List<Query1> returnList2 = new ArrayList<>();
             String queryString2 = "SELECT p.NOME, p.COGNOME, pc.NOME FROM TABELLA_PAZIENTE p INNER JOIN TABELLA_PATOLOGIE_CONTRATTE pc ON p.CODICEFISCALE = pc.PAZIENTE   AND pc.DATA_RILEVAZIONE >= date('now', '-1 month') ORDER BY pc.NOME";
             SQLiteDatabase db = this.getReadableDatabase();

             Cursor cursor2 = db.rawQuery(queryString2, null);

             if (cursor2.moveToFirst()) {
                 do {
                     String Nome = cursor2.getString(0);
                     String Cognome = cursor2.getString(1);
                     String Patologia = cursor2.getString(2);

                     Query1 query1 = new Query1(Nome, Cognome, Patologia);
                     returnList2.add(query1);
                 } while (cursor2.moveToNext());


             }
             else {

             }
             cursor2.close();
             db.close();
             return returnList2;
         }
    public List<ModelloPaziente> getAll() {
        List<ModelloPaziente> returnList = new ArrayList<>();

        String queryString = "SELECT * FROM TABELLA_PAZIENTE";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(queryString, null);

        if(cursor.moveToFirst()) {
            do {
                String nome = cursor.getString(0);
                String cognome = cursor.getString(1);
                LocalDate Data = LocalDate.parse(cursor.getString(4), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                String Codsanitario = cursor.getString(3);
                String CodFiscale = cursor.getString(2);
                String Città = cursor.getString(5);
                String Via = cursor.getString(6);
                String Numero = cursor.getString(7);
                String Genere = cursor.getString(8);

                ModelloPaziente newPaziente = new ModelloPaziente(nome, cognome, Data, Codsanitario, CodFiscale , Città, Via, Numero, Genere);
                returnList.add(newPaziente);

            } while (cursor.moveToNext());
        }
        else {

        }

        cursor.close();
        db.close();
        return returnList;
    }

    public List<Query2> getQuery2(String anno) {
        String[] arg = {anno};
        List<Query2> returnList3 = new ArrayList<>();
        String queryString3 = "SELECT t.TERAPIA AS Terapia, AVG(julianday(t.DATA_FINE) - julianday(t.DATA_INIZIO)) AS DifferenzaMedia FROM TABELLA_TERAPIE t WHERE strftime('%Y', t.DATA_FINE) = ? GROUP BY t.TERAPIA ORDER BY DifferenzaMedia DESC";
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor3 = db.rawQuery(queryString3, arg);

        if (cursor3.moveToFirst()) {
            do {
                String Nome = cursor3.getString(0);
                int DifferenzaMedia = cursor3.getInt(1);

                Query2 query2 = new Query2(Nome, DifferenzaMedia);
                returnList3.add(query2);
            } while (cursor3.moveToNext());


        }
        else {

        }
        cursor3.close();
        db.close();
        return returnList3;
    }

    public List<Query3> getQuery3() {
        List<Query3> returnList4 = new ArrayList<>();
        String queryString4 = "SELECT o.NOME AS Ospedale, COUNT(e.ID) AS NumeroEsami FROM TABELLA_OSPEDALI o INNER JOIN TABELLA_ESAMI e ON o.ID = e.OSPEDALE WHERE e.DATA > date('now') GROUP BY o.NOME HAVING COUNT(e.ID) > 2";
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor4 = db.rawQuery(queryString4, null);

        if (cursor4.moveToFirst()) {
            do {
                String Nome = cursor4.getString(0);
                int DifferenzaMedia = cursor4.getInt(1);

                Query3 query3 = new Query3(Nome, DifferenzaMedia);
                returnList4.add(query3);
            } while (cursor4.moveToNext());


        }
        else {

        }
        cursor4.close();
        db.close();
        return returnList4;
    }

    public List<Query4> getQuery4() {
        List<Query4> returnList5 = new ArrayList<>();
        String queryString5 = "SELECT p.NOME AS Paziente, t.CAREGIVER AS Caregiver, t.OPERATORE_SANITARIO AS OperatoreSanitario FROM TABELLA_PAZIENTE p INNER JOIN TABELLA_TERAPIE t ON p.CODICEFISCALE = t.PAZIENTE WHERE t.CAREGIVER IS NOT NULL AND t.OPERATORE_SANITARIO IS NOT NULL";
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor5 = db.rawQuery(queryString5, null);

        if (cursor5.moveToFirst()) {
            do {
                String Nome = cursor5.getString(0);
                String Caregiver = cursor5.getString(1);
                String OperatoreSanitario = cursor5.getString(2);


                Query4 query4 = new Query4(Nome, OperatoreSanitario, Caregiver);
                returnList5.add(query4);
            } while (cursor5.moveToNext());


        }
        else {

        }
        cursor5.close();
        db.close();
        return returnList5;
    }

    public List<Query5> getQuery5(String nome, String anno) {
        String[] arg = {nome, anno};
        List<Query5> returnList6 = new ArrayList<>();
        String queryString6 = "SELECT p.NOME, p.COGNOME, t.TERAPIA FROM TABELLA_PAZIENTE p INNER JOIN TABELLA_TERAPIE t ON p.CODICEFISCALE = t.PAZIENTE WHERE t.TERAPIA = ? AND strftime('%Y', t.DATA_FINE) = ?";
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor6 = db.rawQuery(queryString6, arg);

        if (cursor6.moveToFirst()) {
            do {
                String Nome = cursor6.getString(0);
                String Cognome = cursor6.getString(1);
                String Patologia = cursor6.getString(2);


                Query5 query5 = new Query5(Nome, Cognome, Patologia);
                returnList6.add(query5);
            } while (cursor6.moveToNext());


        }
        else {

        }
        cursor6.close();
        db.close();
        return returnList6;
    }
}


