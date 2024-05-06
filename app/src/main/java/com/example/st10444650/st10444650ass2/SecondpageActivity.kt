package com.example.st10444650.st10444650ass2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondpageActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.secondpage)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Pass message "FEED ME!" as an extra with the intent
        intent.putExtra("feedTextView","FEED ME!")

        val SleepImage = findViewById<ImageView>(R.id.SleepImage)
        val FeedButton = findViewById<Button>(R.id.FeedButton)
        val BathButton = findViewById<Button>(R.id.BathButton)
        val PlayButton = findViewById<Button>(R.id.PlayButton)
        val SleepButton = findViewById<Button>(R.id.PlayButton)

        val SleepingText = findViewById<TextView>(R.id.SleepingText)

        // Retrieve the message passed from the first screen
        val feedTextView = findViewById<TextView>(R.id.feedTextView)
        // Set the text of the feed TextView to the feed message
          feedTextView.text = "FeedMessage"

        //Logic for the Feed Button
          FeedButton.setOnClickListener {
          // Change  the pet's image to match the feeding action icon
              SleepImage.setImageResource(R.drawable.cat_eating_sushi)
              //Update the feedTextview
              feedTextView.text = "Thank You.. can we play?"
              SleepingText.text = "Eating.."

              // Logic for the PlayButton
              PlayButton.setOnClickListener {
                  // change the pet's image to match the play action icon
                  SleepImage.setImageResource(R.drawable.cute_cat_playing_yarn_ball_cartoon_illustration_vector)
                  // Update the feedTextView
                  feedTextView.text="Thank you!,Im dirty"
                  SleepingText.text = "Playing.."

                  // Logic for the BathButton
                  BathButton.setOnClickListener {
                      // change the pet's image to match the batch action icon
                      SleepImage.setImageResource(R.drawable.catbating)
                      // Update the feedTextView
                      feedTextView.text= "Thank You,Im clean,i want to rest"
                      SleepingText.text = "Bathing..."
                      class secondpage : AppCompatActivity() {
                          private lateinit var feedProgressBar: ProgressBar
                          private lateinit var playProgressBar: ProgressBar
                          private lateinit var cleanProgressBar: ProgressBar

                          private var feedProgressStatus:Int = 0
                          private var playProgressStatus:Int = 0
                          private var cleanProgressStatus:Int = 0

                          override fun onCreate( savedInstanceState:Bundle?) {
                              super.onCreate(savedInstanceState)
                              setContentView(R.layout.secondpage)

                              feedProgressBar = findViewById(R.id.feedProgressBar)
                              playProgressBar = findViewById(R.id.playProgressBar)
                              cleanProgressBar = findViewById(R.id.cleanProgressBar)

                              val FeedButton = findViewById<Button>(R.id.FeedButton)
                              val BathButton = findViewById<Button>(R.id.BathButton)
                              val PlayButton = findViewById<Button>(R.id.PlayButton)

                              FeedButton.setOnClickListener{
                                  feedProgressStatus= 0
                                  feedProgressBar.progress = feedProgressStatus
                                  Thread(Runnable {
                                      while (feedProgressStatus < 100) {
                                          feedProgressStatus += 5
                                          Thread.sleep(1000)
                                          runOnUiThread {
                                              feedProgressBar.progress = feedProgressStatus
                                          }
                                      }
                                      runOnUiThread {
                                      }
                                  }).start()
                                      }
                                     BathButton.setOnClickListener {
                                         cleanProgressStatus = 0
                                         cleanProgressBar.progress = cleanProgressStatus
                                         Thread(Runnable {
                                             while (cleanProgressStatus < 100) {
                                                 cleanProgressStatus += 5
                                                 Thread.sleep(1000)
                                                 runOnUiThread {
                                                     cleanProgressBar.progress =
                                                         cleanProgressStatus
                                                 }
                                             }
                                             runOnUiThread {
                                             }
                                         }).start()
                                     }
                                     PlayButton.setOnClickListener {
                                         playProgressStatus = 0
                                         playProgressBar.progress = playProgressStatus
                                         Thread(kotlinx.coroutines.Runnable {
                                             while (playProgressStatus<100) {
                                                 playProgressStatus += 5
                                                 Thread.sleep(1000)
                                                 runOnUiThread {
                                                     playProgressBar.progress = playProgressStatus
                                                 }
                                             }
                                              runOnUiThread {
                                                 }
                                             }).start()

                                  }
                              }

                          }












                  }




    }
}}}