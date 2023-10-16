package com.noelistic.g1app;
import static android.content.ContentValues.TAG;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;


import android.annotation.SuppressLint;

public class ScoreScreen extends AppCompatActivity {

    private Test1 mtest1 = new Test1();
    private Test2 mtest2 = new Test2();
    private Test3 mtest3 = new Test3();
    private Test4 mtest4 = new Test4();
    private Test5 mtest5 = new Test5();
    private Test6 mtest6 = new Test6();

    private int mScoreT1 = 0;
    private int mScoreT2 = 0;
    private int mScoreT3 = 0;
    private int mScoreT4 = 0;
    private int mScoreT5 = 0;
    private int mScoreT6 = 0;

    AlertDialog.Builder builder;
    private InterstitialAd mInterstitialAd;

    @Override
    public void onBackPressed() {

        // this stops the crashes

    }


    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_screen);

        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide(); // to hide the top bar only for this activity

        builder = new AlertDialog.Builder(this);
        AdRequest adRequest = new AdRequest.Builder().build();
        // ad code ca-app-pub-7447623152498928/3466344122

        InterstitialAd.load(this,"ca-app-pub-3940256099942544/1033173712", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                        Log.i(TAG, "onAdLoaded");
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.d(TAG, loadAdError.toString());
                        mInterstitialAd = null;
                    }
                });


                    mScoreT1 =mtest1.mScore;
                    mScoreT2 =mtest2.mScore;
                    mScoreT3 =mtest3.mScore;
                    mScoreT4 =mtest4.mScore;
                    mScoreT5 =mtest5.mScore;
                    mScoreT6 =mtest6.mScore;

                    //final int finalScore = 0;

                    // final TextView ChangingScore = (TextView) findViewById(R.id.scorechange);

                    //  final TextView Info = (TextView) findViewById(R.id.Info);

                    //final int finalScore = ((mScoreT1 + mScoreT2) + (mScoreT3 + mScoreT4) + (mScoreT5 + mScoreT6));

        if(mScoreT1 >0)

                    {


                        builder.setMessage("Score: " + mScoreT1 + "/10")
                                .setCancelable(false)

                                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        Intent intent = new Intent(ScoreScreen.this, MainActivity.class);

                                        startActivity(intent);
                                    }
                                });


                    }

        if(mScoreT2 >0)

                    {
                        builder.setMessage("Score: " + mScoreT2 + "/20")
                                .setCancelable(false)
                                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        Intent intent = new Intent(ScoreScreen.this, MainActivity.class);

                                        startActivity(intent);
                                    }
                                });
                    }

        if(mScoreT3 >0)

                    {
                        builder.setMessage("Score: " + mScoreT3 + "/20")
                                .setCancelable(false)
                                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        Intent intent = new Intent(ScoreScreen.this, MainActivity.class);

                                        startActivity(intent);
                                    }
                                });
                    }

        if(mScoreT4 >0)

                    {
                        builder.setMessage("Score: " + mScoreT4 + "/10")
                                .setCancelable(false)
                                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        Intent intent = new Intent(ScoreScreen.this, MainActivity.class);

                                        startActivity(intent);
                                    }
                                });
                    }

        if(mScoreT5 >0)

                    {
                        builder.setMessage("Score: " + mScoreT5 + "/20")
                                .setCancelable(false)
                                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        Intent intent = new Intent(ScoreScreen.this, MainActivity.class);

                                        startActivity(intent);
                                    }
                                });
                    }

        if(mScoreT6 >0)

                    {
                        builder.setMessage("Score: " + mScoreT6 + "/20")
                                .setCancelable(false)
                                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        Intent intent = new Intent(ScoreScreen.this, MainActivity.class);

                                        if (mInterstitialAd != null) {
                                            mInterstitialAd.show(ScoreScreen.this);
                                            startActivity(intent);
                                        } else {
                                            Log.d("TAG", "The interstitial ad wasn't ready yet.");
                                        }



                                    }
                                });


                    }

                    AlertDialog alert = builder.create();
        alert.setTitle("G1 Test Results");

        alert.show();

    }

    //show ad function

}
