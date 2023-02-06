public class PhraseOMatic {
    public static void main(String[] args){
	    String[] wordListOne = { "24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "frontend", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic" };
        String[] wordListTwo = { "empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded","outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated" };
        String[] wordListThree = { "process", "tippingpoint", "solution", "architecture", "core competency","strategy", "mindshare", "portal", "space", "vision","paradigm", "mission" };

        int firstWord = (int) (Math.random() * wordListOne.length);
        int secondWord = (int) (Math.random() * wordListTwo.length);
        int thirdWord = (int) (Math.random() * wordListThree.length);

        System.out.println(wordListOne[firstWord] + " " + wordListTwo[secondWord] + " " + wordListThree[thirdWord]);
    }
}