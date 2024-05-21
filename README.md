val EnterButton = findViewById&lt;Button&gt;(R.id._EnterButton_)  
EnterButton.setOnClickListener **{  
**val intent = Intent(this,SecondPage::class._java_)  
startActivity(intent)

val SleepImage = findViewById&lt;ImageView&gt;(R.id._SleepImage_)  
val FeedButton = findViewById&lt;Button&gt;(R.id._FeedButton_)  
val BathButton = findViewById&lt;Button&gt;(R.id._BathButton_)  
val PlayButton = findViewById&lt;Button&gt;(R.id._PlayButton_)  
val SleepButton = findViewById&lt;Button&gt;(R.id._PlayButton_)  
<br/>val SleepingText = findViewById&lt;TextView&gt;(R.id._SleepingText_)  
<br/>// Retrieve the message passed from the first screen  
val feedTextView = findViewById&lt;TextView&gt;(R.id._FeedTextView_)  
// Set the text of the feed TextView to the feed message  
feedTextView._text_ \= "FeedMessage"  
<br/>//Logic for the Feed Button  
FeedButton.setOnClickListener **{  
**// Change the pet's image to match the feeding action icon  
SleepImage.setImageResource(R.drawable._giphy_)  
//Update the feedTextview  
feedTextView._text_ \= "Thank You.. can we play?"  
SleepingText._text_ \= "Eating.."  
<br/>// Logic for the PlayButton  
PlayButton.setOnClickListener **{  
**// change the pet's image to match the play action icon  
SleepImage.setImageResource(R.drawable._\_5a5c44d26f0cb79074e18e6dff8c2d2_)  
// Update the feedTextView  
feedTextView._text_\="Thank you!,Im dirty"  
SleepingText._text_ \= "Playing.."  
<br/>// Logic for the BathButton  
BathButton.setOnClickListener **{  
**// change the pet's image to match the batch action icon  
SleepImage.setImageResource(R.drawable._depositphotos_42285267_stock_illustration_cat_having_a_bath_)  
// Update the feedTextView  
feedTextView._text_\= "Thank You,Im clean,i want to rest"  
SleepingText._text_ \= "Bathing..."  
<br/><br/><br/>class activity_second_page : AppCompatActivity() {  
private lateinit var feedProgressBar: ProgressBar  
private lateinit var playProgressBar: ProgressBar  
private lateinit var cleanProgressBar: ProgressBar  
<br/>private var feedProgressStatus:Int = 0  
private var playProgressStatus:Int = 0  
private var cleanProgressStatus:Int = 0  
<br/>override fun onCreate( savedInstanceState:Bundle?) {  
super.onCreate(savedInstanceState)  
setContentView(R.layout._activity_second_page_)  
<br/>feedProgressBar =findViewById(R.id._FeedProgressbar_)  
playProgressBar = findViewById(R.id._PlayProgressBar_)  
cleanProgressBar = findViewById(R.id._BathProgressBar_)  
<br/>val FeedButton = findViewById&lt;Button&gt;(R.id._FeedButton_)  
val BathButton = findViewById&lt;Button&gt;(R.id._BathButton_)  
val PlayButton = findViewById&lt;Button&gt;(R.id._PlayButton_)  
<br/>FeedButton.setOnClickListener**{  
**feedProgressStatus= 0  
feedProgressBar._progress_ \= feedProgressStatus  
Thread(_Runnable_ **{  
**while (feedProgressStatus < 100) {  
feedProgressStatus += 5  
Thread.sleep(1000)  
runOnUiThread **{  
**feedProgressBar._progress_ \= feedProgressStatus  
**}  
**}  
runOnUiThread **{  
}  
}**).start()  
**}  
**BathButton.setOnClickListener **{  
**cleanProgressStatus = 0  
cleanProgressBar._progress_ \= cleanProgressStatus  
Thread(_Runnable_ **{  
**while (cleanProgressStatus < 100) {  
cleanProgressStatus += 5  
Thread.sleep(1000)  
runOnUiThread **{  
**cleanProgressBar._progress_ \=  
cleanProgressStatus  
**}  
**}  
runOnUiThread **{  
}  
}**).start()  
**}  
**PlayButton.setOnClickListener **{  
**playProgressStatus = 0  
playProgressBar._progress_ \= playProgressStatus  
Thread(kotlinx.coroutines._Runnable_ **{  
**while (playProgressStatus<100) {  
playProgressStatus += 5  
Thread.sleep(1000)  
runOnUiThread **{  
**playProgressBar._progress_ \= playProgressStatus  
**}  
**}  
runOnUiThread **{  
}  
}**).start()  
<br/>**}  
**}  
<br/>}  
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>**}  
<br/><br/><br/><br/>}  
<br/>}**
