//Name: Dhir Patel
//Date: October, 29, 2018
//Purpose: To entertain people of all ages with a treasure exploring game.

import javax.swing.*;
import java.io.IOException;
import java.util.*;
import java.text.*;

public class Expedition
{
	//start and end variables for timer
	Date now, end;
	int txt  = 0;
	//Start the timer
	int sec1 = 0;
	int min1 = 0;
	public static void main(String args[])
	{
		new Expedition ();
	}
	public Expedition ()
	{
		Date now = new Date ();
		DateFormat df = DateFormat.getDateInstance ();
		String s = df.format (now);
		System.out.println ("Today is " + s);
		sec1 = now.getSeconds ();
		min1 = now.getMinutes ();
		introduction1 ();
	}

	// Beginning of the game (There are 3 parts to the introduction).
	// This is the first part of the intro.
	// All 3 parts of the intro are linked together by calling in the method names.
	public void introduction1 ()
	{
		IO.printSlow ("\nWelcome to the treasure hunting game:");
		System.out.println(" _____  _             _   _  _      _      _                _____                        _  _  _    _               ");
		System.out.println("|_   _|| |           | | | |(_)    | |    | |              |  ___|                      | |(_)| |  (_)              ");
		System.out.println("  | |  | |__    ___  | |_| | _   __| |  __| |  ___  _ __   | |__ __  __ _ __    ___   __| | _ | |_  _   ___   _ __  ");
		System.out.println("  | |  | '_ \\  / _ \\ |  _  || | / _` | / _` | / _ \\| '_ \\  |  __|\\ \\/ /| '_ \\  / _ \\ / _` || || __|| | / _ \\ | '_ \\ ");
		System.out.println("  | |  | | | ||  __/ | | | || || (_| || (_| ||  __/| | | | | |___ >  < | |_) ||  __/| (_| || || |_ | || (_) || | | |");
		System.out.println("  \\_/  |_| |_| \\___| \\_| |_/|_| \\__,_| \\__,_| \\___||_| |_| \\____//_/\\_\\| .__/  \\___| \\__,_||_| \\__||_| \\___/ |_| |_|");
		System.out.println("                                                                       | |                                          ");
		System.out.println("                                                                       |_|                                          ");
		System.out.println("");
		introart();
		System.out.println("");
		IO.printSlow("Game created by Dhir patel\n",txt);
		for (int i = 1 ; i <=170 ; i++) {
			System.out.print("*"); }
		String input = JOptionPane.showInputDialog ("Please enter  your name");
		System.out.println("");
		IO.printSlow("Hello "+input+". My name is Samus and I will be assisting you on completing this adventourous expedition.");
		System.out.println("");
		System.out.println("\n");
		txt = IO.inputInt("Choose your reading speed. (1 being really fast and 100 being really slow).");
		System.out.println("");
		introduction2();
	}

	//Ascii art used in the introduction of the game (picture of a cave in a mountain)
	public void introart () {
		System.out.println(" ********************************************************************************");
		System.out.println("*                    /   \\              /'\\       _                              *");
		System.out.println("*\\_..           /'.,/     \\_         .,'   \\     / \\_                            *");
		System.out.println("*    \\         /            \\      _/       \\_  /    \\     _                     *");
		System.out.println("*     \\__,.   /              \\    /           \\/.,   _|  _/ \\                    *");
		System.out.println("*          \\_/                \\  /',.,''\\      \\_ \\_/  \\/    \\                   *");
		System.out.println("*                           _  \\/   /    ',../',.\\    _/      \\                  *");
		System.out.println("*             /           _/m\\  \\  /    |         \\  /.,/'\\   _\\                 *");
		System.out.println("*           _/           /MMmm\\  \\_     |          \\/      \\_/  \\                *");
		System.out.println("*          /      \\     |MMMMmm|   \\__   \\          \\_       \\   \\_              *");
		System.out.println("*                  \\   /MMMMMMm|      \\   \\           \\       \\    \\             *");
		System.out.println("*                   \\  |MMMMMMmm\\      \\___            \\_      \\_   \\            *");
		System.out.println("*                    \\|MMMMMMMMmm|____.'  /\\_            \\       \\   \\_          *");
		System.out.println("*                    /'.,___________...,,'   \\            \\   \\        \\         *");
		System.out.println("*                   /       \\          |      \\    |__     \\   \\_       \\        *");
		System.out.println("*                 _/        |           \\      \\_     \\     \\    \\       \\_      *");
		System.out.println("*                /                               \\     \\     \\_   \\        \\     *");
		System.out.println("*                                                 \\     \\      \\   \\__      \\    *");
		System.out.println("*                                                  \\     \\_     \\     \\      \\   *");
		System.out.println("*                                                   |      \\     \\     \\      \\  *");
		System.out.println("*                                                    \\ms          |            \\ *");
		System.out.println(" ********************************************************************************");
	}

	// This method is the second part of the introduction.
	// Provides the story line of the game.
	public void introduction2 () {
		IO.printSlow("Your job is to help John obtain a legendary treasure/family heirloom that his grandpa Smith has left for the world to obtain.",txt);
		System.out.println("");
		IO.printSlow("The treasure lies deep inside the Ryuuchi caves which is known to be unexplorable.\n",txt);
		JOptionPane.showMessageDialog (null, createImageIcon ("cave1.png"), "---Entrance---", JOptionPane.INFORMATION_MESSAGE);
		System.out.println("");
		IO.printSlow("\nMany people around the world, including John's family, have tried to acquire the mythical treasure, but people have yet to succeed.",txt);
		IO.printSlow("\nAbout five years ago when John was 15, his grandfather left on a voyage to tour the whole world.",txt);
		System.out.println("");
		IO.printSlow("Before he left, he told fifteen year old John to set out on an expedition five years from then to acquire the greatest treasure.",txt);
		System.out.println("");
		IO.printSlow("Currently John being twenty years old, he has set out on his journey to locate the family heirloom because Mr.Smith believed that only he can get to it.",txt);
		System.out.println();
		IO.printSlow("Travelling to the present......",100);
		System.out.println("");
		IO.printSlow ("John stands right in front of the Ryucchi Cave. He needs your help in getting to the treasure.",txt);
		System.out.println("");
		IO.printSlow("Exploring this cave is not meant for everyone. You need to be both mentally and physically prepared.",txt);
		System.out.println("");
		char continu = IO.inputChar("\nAre you ready for the expedition? (y/n) ");
		while(continu!='y'&& continu!='n') {
			System.out.println("\nPlease enter a valid response");
			continu = IO.inputChar("\nAre you ready for the expedition? (y/n) ");}
		if (continu == 'y') {   
			IO.printSlow("\nExcellent choice. There are four entrances to the cave. North (a), East (b), South (c) and West (d).",txt);
			introEnd();}
		else if (continu == 'n'){      
			IO.printSlow("\nAww, too bad. Now you will never know what the treasure was.",txt);}
	}

	// This is the introduction end.
	// After this the player proceeds to the first task.
	public void introEnd() {
		String entrance = "";

		//Do-while loop used here to output the users's choice of entrance
		do { 
			IO.printSlow("\nChoose the entrance you would like to enter through.",txt);
			entrance = IO.inputString ("\n(a,b,c,d) ");
			if (entrance.equals ("a"))
				IO.printSlow("\nYou are entering through the north entrance.",90);
			else if (entrance.equals("b"))
				IO.printSlow("\nYou are entering through the east entrance",90);
			else if (entrance.equals("c"))
				IO.printSlow("\nYou are entering through the south entrance",90);
			else if (entrance.equals("d"))
				IO.printSlow("\nYou are entering through the west entrance",90);
			else
				entrance = "n";
		} while (entrance == "n");
		System.out.println("\n");               
		IO.printSlow ("Few minutes later............", 150);
		IO.printSlow ("\n");
		for (int i = 1 ; i <= 75 ; i++){
			System.out.print("-");}
		task1 ();
	}

	// Introduction to task one.
	// It is connected to the storyline from the previous game intro.
	// Task 1 includes solving two riddles to continue.
	public void task1 ()
	{
		IO.printSlow("                                                       (                                ",4);
		IO.printSlow("                        (                 )  (         )\\ )      (     (    (           ",4);
		IO.printSlow("    (                   )\\  )       )  ( /(  )\\   (   (()/( (    )\\ )  )\\ ) )\\   (      ",4);
		IO.printSlow("    )\\   (     (    (  ((_)/((   ( /(  )\\())((_) ))\\   /(_)))\\  (()/( (()/(((_) ))\\ (   ",4);
		IO.printSlow(" _ ((_)  )\\ )  )\\   )\\  _ (_))\\  )(_))((_)\\  _  /((_) (_)) ((_)  ((_)) ((_))_  /((_))\\  ",4);
		IO.printSlow("| | | | _(_/( ((_) ((_)| |_)((_)((_)_ | |(_)| |(_))   | _ \\ (_)  _| |  _| || |(_)) ((_) ",4);
		IO.printSlow("| |_| || ' \\))(_-</ _ \\| |\\ V / / _` || '_ \\| |/ -_)  |   / | |/ _` |/ _` || |/ -_)(_-< ",4);
		IO.printSlow(" \\___/ |_||_| /__/\\___/|_| \\_/  \\__,_||_.__/|_|\\___|  |_|_\\ |_|\\__,_|\\__,_||_|\\___|/__/ ",4);
		IO.printSlow("         ",5);
		System.out.println();

		IO.printSlow ("\nYou have explored deep into the cave, and before you, stands a large boulder.",txt);
		System.out.println("");
		IO.printSlow("In order to continue onwards, you must move the boulder blocking your path.",txt);
		System.out.println("");
		IO.printSlow("The boulder will only move if you correctly answer the two riddles written on the wall.",txt);
		System.out.println("");
		IO.printSlow("You will only get three chances to answer each riddle or else the cave will collapse on you and you will die!",txt);
		System.out.println("");
		for (int i = 1 ; i <= 30 ; i++){
			System.out.print("-");}
		System.out.println("");
		riddle1();
	}

	// First task's challenge number one (riddle #1)
	public void riddle1 () {
		IO.printSlow("\nThe first riddle is: \"I'm tall when I'm young and short when I'm old. What am I?\"",txt);
		IO.printSlow("\n*Hint - \"It is something that you use in the dark\"",txt);
		String ans = IO.inputString("\nChance 1: ");
		int tries = 2;
		while (!ans.equalsIgnoreCase ("candle") && tries <= 3) {
			//Tell them they are wrong.
			System.out.println ("Nope try again");
			//Ask again
			ans = IO.inputString ("\nChance "+tries+": ");
			tries++; }

		//If and else decision statements used to see if the player's answer is right or wrong.
		if (ans.equalsIgnoreCase ("candle") || ans.equalsIgnoreCase ("candles")) {
			System.out.println ("\"You got it\"");
			IO.printSlow("\nOh look! All the candles in the cave have been lit up. It is no longer dark. ",txt);
			System.out.println("");
			candle();
			IO.printSlow ("\nWell done! Answer the next riddle to explore further!",txt);
			System.out.println("");
			riddle2 (); }
		else {
			IO.printSlow ("\nYou took more than three tries and the cave collapsed on you.",txt);
			IO.printSlow ("\nThe answer was \"candles\"",txt);
			IO.printSlow("\nRetry task 1",txt);
			System.out.println("");
			riddle1();
		}
	}

	//Ascii art used in the above method riddle1() (picture of a candle)
	public void candle() {
		IO.printSlow(" ,,;;;;;,,",3);
		IO.printSlow(" ,;;:::::::;;,",3);
		IO.printSlow(",;;::' , ':::;,",3);
		IO.printSlow(";;::  /(   ::;;",3);
		IO.printSlow(";;:: |  \\  ::;;",3);
		IO.printSlow("';;::.\\c/.::;;'",3);
		IO.printSlow(" ';:::'-,:::;'",3);
		IO.printSlow("   '';| |;''",3);
		IO.printSlow("      '-,",3);
		IO.printSlow("      | |",3);
		IO.printSlow("      '-,",3);
		IO.printSlow("      | |",3);
		IO.printSlow("      '-,",3);
		IO.printSlow("      | |",3);
		IO.printSlow("      '-,",3);
		IO.printSlow("      | |",3);
		IO.printSlow("     /`\"`\\",3);
		IO.printSlow("  .-'.  _.'-.",3);
		IO.printSlow(" `._  `    _.'",3);
		IO.printSlow("    `\"---\"`",3);

	}


	// First task challenge number two (riddle #2) 
	public void riddle2 () {
		IO.printSlow("The second riddle is: \"I'm often running yet I have no legs. I can be found in most caves including this one. You need me but I don't need you. What am I?\"",txt);
		String ans = IO.inputString("\nChance 1: ");
		int tries = 2;
		while (!ans.equalsIgnoreCase ("water") && tries <= 3)
		{
			//Tell them they are wrong.
			System.out.println ("Nope try again");
			//Ask again
			ans = IO.inputString ("\nChance "+tries+": ");
			tries++;
		}
		//Tell them if right or wrong. Enter a picture of candle.
		if (ans.equalsIgnoreCase ("water")) {
			IO.printSlow("\nYou got it, you are on a roll.",txt);
			JOptionPane.showMessageDialog (null, createImageIcon ("water.png"), "---Entrance---", JOptionPane.INFORMATION_MESSAGE);
			System.out.println("");
			IO.printSlow ("\nGood job. You move on.",txt);
			System.out.println("");
			System.out.println("\n");
			task2 ();
		}
		else {
			IO.printSlow ("\nYou took more than three tries and the cave collapsed on you.",txt);
			IO.printSlow ("\nThe answer was \"water\"",txt);
			IO.printSlow("\nRestart from riddle 1",txt);
			System.out.println("");
			riddle1();
		}
	}
	// This is an introduction to task 2.
	// Task 2 involves answering 5 questions correctly to continue.
	// Each question has a separate method, connected to each other by method call.
	public void task2 ()
	{ 
		IO.printSlow("----------------------------------------------",50);
		IO.printSlow ("\nYou have done well passing the first task, but it will only get harder as you explore further.",txt);
		IO.printSlow("\nPlease wait a moment, John is exploring further into the cave....",200);
		IO.printSlow("\nOh no! It seems you have hit a dead end.",txt);
		IO.printSlow("\nWait. There is something written on the wall. It seems like a trivia quiz on the topic of caves.",txt);
		IO.printSlow("\nEach question contains four options to answer from --- like multiple choice!.",txt);
		IO.printSlow("\nIn the previous task, you proved your ability of quick thinking, however, this task will test your knowledge.",txt);
		IO.printSlow("\nYour job is to answer all the questions correctly in order to proceed further.",txt);
		IO.printSlow("\nThe good thing is that you can not die from answering wrong, but you will have to restart from the first question each time you get it wrong.",txt);
		System.out.println("");
		// Loop used to create horizontal lines.
		for (int i = 1 ; i <= 75 ; i++){
			System.out.print("-");
		}
		question1();
	}

	//Ascii art used as the title for task 2 of the game.
	public void triviaart() {
		IO.printSlow("___________      .__      .__         ___________.__                ",3);
		IO.printSlow("\\__    ___/______|__|__  _|__|____    \\__    ___/|__| _____   ____  ",3);
		IO.printSlow("  |    |  \\_  __ \\  \\  \\/ /  \\__  \\     |    |   |  |/     \\_/ __ \\ ",3);
		IO.printSlow("  |    |   |  | \\/  |\\   /|  |/ __ \\_   |    |   |  |  Y Y  \\  ___/ ",3);
		IO.printSlow("  |____|   |__|  |__| \\_/ |__(____  /   |____|   |__|__|_|  /\\___  >",3);
		IO.printSlow("                                  \\/                      \\/     \\/ ",3);
	}

	// Method code for question 1. If the player gets it right, then they proceed to question 2.
	public void question1 () {
		IO.printSlow("\n\nHere's your first question:",txt);
		IO.printSlow("\nQ1. The Ryuuchi cave has an unique appearance because the way it was formed. How are most caves usually formed?",txt);
		System.out.println("\n(a) When water runs over soft rock, such as limestone");
		System.out.println("(b) They are createddue to earthquakes");
		System.out.println("(c) Formed through degradation from acid rain.");
		System.out.println("(d) They are carved out by humans");
		String ans1 = IO.inputString ("\na/b/c/d? ");

		//If and else statements used to check if the player inputed the correct answer.
		if (ans1.equalsIgnoreCase ("a") ) {
			IO.printSlow ("\nGood choice",txt);
			IO.printSlow("You may move on to the next question.",txt);
			question2();
		}
		else {
			IO.printSlow("\nThat is not correct. The correct answer was (a)",txt);
			IO.printSlow("\nYou must restart this task.",txt);
			char continu = IO.inputChar("\nPress [Enter] to restart. ");
			try {
				question1();
				System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (int i = 1 ; i <= 75 ; i++){
			System.out.print("-");
		}
	}

	// Method code for question 2. If the player gets it right, then they proceed to question 3.
	public void question2() {
		IO.printSlow("\n\nQ2. What is the sport of exploring caves called?",txt);
		System.out.println("\n(a) Archeology");
		System.out.println("(b) Debunking");
		System.out.println("(c) Spelunking");
		System.out.println("(d) Speleology");
		String ans2 = IO.inputString ("\na/b/c/d? ");

		//If and else statements used to check if the player inputed the correct answer.
		if (ans2.equalsIgnoreCase ("c") ) {
			IO.printSlow ("\nThat's correct.",txt);
			IO.printSlow("Go on to the next question.",txt);
			question3();
		}
		else {
			IO.printSlow("\nThat is not correct. Try again",txt);
			IO.printSlow("The correct answer was (c).",txt);
			char continu = IO.inputChar("\nPress [Enter] to restart the task.");
			try {
				question1();
				System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}    
		}
		for (int i = 1 ; i <= 75 ; i++){
			System.out.print("-");
		}
	}

	// Method code for question 3. If the player gets it right, then they proceed to question 4.
	public void question3() {
		IO.printSlow("\n\nQ3. Which conditions apply to most animals which live inside of a cave?",txt);
		System.out.println("\n(a) Poor sense of smell");
		System.out.println("(b) Poor sense of hearing");
		System.out.println("(c) Poor sense of touch");
		System.out.println("(d) Poor sense of sight");
		String ans3 = IO.inputString("\na/b/c/d? "); 

		//If and else statements used to check if the player inputed the correct answer.
		if (ans3.equalsIgnoreCase ("d") ) {
			IO.printSlow ("\nNice one.",txt);
			IO.printSlow("Move on to the next question.",txt);
			question4();
		}
		else {
			IO.printSlow("\nThat is incorrect. Please try again",txt);
			IO.printSlow("The correct answer was (d)",txt);
			char continu = IO.inputChar("\nPress [Enter] to restart");
			try {
				question1();
				System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		for (int i = 1 ; i <= 75 ; i++){
			System.out.print("-");
		}
	}

	// Method code for question 4. If the player gets it right, then they proceed to question 5.
	public void question4() {
		IO.printSlow("\n\nQ4. Most caves are found and formed in which type of rock?",txt);
		System.out.println("*Hint - Contains the name of a fruit.");
		System.out.println("\n(a) Basalt");
		System.out.println("(b) Limestone");
		System.out.println("(c) Sandstone ");
		System.out.println("(d) Granite ");
		String ans4 = IO.inputString("\na/b/c/d? ");

		//If and else statements used to check if the player inputed the correct answer.
		if (ans4.equalsIgnoreCase ("b") ) {
			IO.printSlow ("\nWow, you're on a roll.",txt);
			IO.printSlow("Proceed to your final question.",txt);
			question5();
		}
		else {
			IO.printSlow("\nOh no, that's incorrect.",txt);
			IO.printSlow("The correct answer was (b).",txt);
			char continu = IO.inputChar("\nPress [Enter] to restart.");
			try {
				question1();
				System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (int i = 1 ; i <= 75 ; i++){
			System.out.print("-");
		}
	}

	// Method code for question 5. If the player gets it right, then they proceed to task 3.
	public void question5() {
		IO.printSlow("\n\nQ5. Most caves are eroded by which of the following elements?",txt);
		System.out.println("\n(a) Ice");
		System.out.println("(b) Heat");
		System.out.println("(c) Water");
		System.out.println("(d) Wind");
		String ans5 = IO.inputString ("\na/b/c/d? ");

		//If and else statements used to check if the player inputed the correct answer.
		if (ans5.equalsIgnoreCase ("c") ) {
			IO.printSlow ("\nYou are very fast at answering the questions!",txt);
			IO.printSlow("\nHey look, a secret door has opened up from the dead end.",txt);
			door();
			IO.printSlow("\nThis can't be a mere coincidence. There is no mistake that this is the path to the treasure.",txt);
			IO.printSlow("\nLet's take it!",txt);
			IO.printSlow ("--------------------------------------------------------------------------------",50);
			task3();
		}
		else {
			IO.printSlow("\nOh no, that's incorrect.",txt);
			IO.printSlow("The correct answer was (c).",txt);
			char continu = IO.inputChar("\nPress [Enter] to restart.");
			try {
				question1();
				System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	//Ascii art used for question 5 in the above method
	public void door() {
		System.out.println("______\r\n" + 
				"   ,-' ;  ! `-.\r\n" + 
				"  / :  !  :  . \\\r\n" + 
				" |_ ;   __:  ;  |\r\n" + 
				" )| .  :)(.  !  |\r\n" + 
				" |\"    (##)  _  |\r\n" + 
				" |  :  ;`'  (_) (\r\n" + 
				" |  :  :  .     |\r\n" + 
				" )_ !  ,  ;  ;  |\r\n" + 
				" || .  .  :  :  |\r\n" + 
				" |\" .  |  :  .  |\r\n" + 
				" |mt-2_;----.___|\r\n" + 
				" ");
	}

	// Introduction to task 3.
	// Involves answering 1 0f the 5, easy to difficulty level math questions
	// Questions are selected randomly by the computer.
	public void task3 ()
	{
		JOptionPane.showMessageDialog (null, "* E X P L O R A T I O N *\n \n"           
				+ "After successfully answering all the questions from \n"
				+ "the previous task, John resumes his expedition and  \n"
				+ "walks further into the cave.\n"
				, "Samus", JOptionPane.INFORMATION_MESSAGE);
		IO.printSlow("\nExploration continues.............",150);
		IO.printSlow("\nUh-oh! You have once again come upon a difficult task to face.",txt);
		IO.printSlow("\nIn front of you stands five other openings you can go into.",txt);
		System.out.println("");
		IO.printSlow("Hmmm. Which one should we take?",txt);
		System.out.println("");
		IO.printSlow("It seems that there is some sort of message written at the entrance of the five diferent openings.",txt);
		System.out.println("");
		IO.printSlow ("--------------------------------------------------------------------------------",50);
		System.out.println("");
		IO.printSlow("Here is the message: \n",txt);
		JOptionPane.showMessageDialog (null, "*** MESSAGE ***\n \n"             
				+ "\"You haven't reached your destination yet. This is the final task which stands \n"
				+ "between you and your treasure. Take any one of the five entrances and they \n" 
				+ "will all lead you to the treasure. However,to get through the tunnel you will need to \n"
				+ "answer a math question correctly. The difficulty of the question is random and will depend on your luck.\" \n\n"
				+ "Ater all, luck does play a little role in everyone's life!  \n\n"
				+ "Good luck!", "Samus", JOptionPane.INFORMATION_MESSAGE);           
		IO.printSlow("\nProve your intellectual skills by conquering this final quest!\"",txt);
		IO.printSlow("\nBefore you go, you must ask the fortune ball lying on the ground on which tunnel you should enter.",txt);
		System.out.println("");
		mathquest();
	}

	//AScii title for task 3. Used in the method below.
	public void mathtitle() {
		System.out.println("");
		IO.printSlow(" ____  ____  ____  _     _____  ___  _ ____  _     ____    _      ____  _____  _       ____  _  __ _  _     _     ____ ",4);
		IO.printSlow("/  __\\/  __\\/  _ \\/ \\ |\\/  __/  \\  \\///  _ \\/ \\ /\\/  __\\  / \\__/|/  _ \\/__ __\\/ \\ /|  / ___\\/ |/ // \\/ \\   / \\   / ___\\",4);
		IO.printSlow("|  \\/||  \\/|| / \\|| | //|  \\     \\  / | / \\|| | |||  \\/|  | |\\/||| / \\|  / \\  | |_||  |    \\|   / | || |   | |   |    \\",4);
		IO.printSlow("|  __/|    /| \\_/|| \\// |  /_    / /  | \\_/|| \\_/||    /  | |  ||| |-||  | |  | | ||  \\___ ||   \\ | || |_/\\| |_/\\\\___ |",4);
		IO.printSlow("\\_/   \\_/\\_\\\\____/\\__/  \\____\\  /_/   \\____/\\____/\\_/\\_\\  \\_/  \\|\\_/ \\|  \\_/  \\_/ \\|  \\____/\\_|\\_\\\\_/\\____/\\____/\\____/",4);
		IO.printSlow("                                                                                                                       ",4);
	}

	//Things the player has to do in task 3. Player begins the third task in this method.
	//Tests the player's intellectual abilities by asking them a easy/difficult math question.
	public void mathquest () {
		mathtitle();
		int num = (int) (Math.random () * 5) +1 ;
		String question = IO.inputString ("\nAsk the fortune the following question (which tunnel to enter?)>> ");
		// If the question asked is not the one shown, then keep repeating the loop.
		while (!question.equalsIgnoreCase ("which tunnel to enter?")) {
			System.out.println("\nInvalid question."); 
			question = IO.inputString ("\nAsk (which tunnel to enter?) "); 
		}

		//If the question entered is correct, the fortune ball selects a tunnel and the player proceeds.
		if (question.equalsIgnoreCase("which tunnel to enter?")) {
			switch (num)
			{
			case 1: 
				cubequestion();
				break;
			case 2:
				linedistance();
				break;
			case 3: 
				slopeline();
				break;
			case 4:
				yintercept();
				break;
			case 5:
				prismarea();
				break;
			}
		}
	}

	// Information on a math question when the fortune ball selects tunnel 1 to enter. 
	// The method is then called in the switch and case above.
	public void cubequestion() {
		int b = 5;
		IO.printSlow("\nThe fortune ball has selected tunnel 1",txt);
		System.out.println("");
		IO.printSlow("Proceed.........",175);
		System.out.println("");
		IO.printSlow("Oh, lucky you! You have come across a simple math question.",txt);
		System.out.println("");
		IO.printSlow("Question: Suppose there is a cube with dimensions of 5m by 5m by 5m.",txt);
		System.out.println("");
		cubeart();
		System.out.println("");
		IO.printSlow("What would be the cube's volume?");
		System.out.println("");
		int ans1 = IO.inputInt ("Answer>> ");

		// Player moves on if the answer is correct (Testing answer condition)
		if (ans1 == cube (b)) {
			IO.printSlow ("\nWow, you are really intelligent!",txt);
			System.out.println("");
			IO.printSlow("\nExit the tunnel to reach to your treasure!",100);
			System.out.println("");
			IO.printSlow(".........",100);
			task4intro(); }
		// If the answer is incorrect, the player restarts from beginning of task 5.
		else {
			IO.printSlow ("\nOops. That's not the correct answer. ",txt);
			IO.printSlow ("\nTry again",txt);
			mathquest();
		}
	}
	// Method to calculate the volume of cube for the question asked in tunnel 1.
	public int cube (int b) {
		int cube = b * b * b;
		return cube;
	}

	//ascii art inserted in the method above for a cube question.
	public void cubeart() {
		IO.printSlow("           +--------------+",3);
		IO.printSlow("          /|             /|",3);
		IO.printSlow("         / |            / |",3);
		IO.printSlow("        *--+-----------*  |",3);
		IO.printSlow("        |  |           |  |",3);
		IO.printSlow("        |  |           |  |",3);
		IO.printSlow("        |  |           |  |",3);
		IO.printSlow("        |  +-----------+--+",3);
		IO.printSlow("        | /            | /",3);
		IO.printSlow("        |/             |/",3);
		IO.printSlow("        *--------------*",3);
	}

	//Information on a math question when the fortune ball selects tunnel 2 to enter. 
	//The method is then called in the switch and case above.
	public void linedistance () {
		int x1 = -1; int x2 = 3; int y1 = 1; int y2 = 4;
		IO.printSlow ("\nThe fortune ball has selected tunnel 2",txt);
		System.out.println("");
		IO.printSlow("Proceed.....",175);
		System.out.println("");
		IO.printSlow ("Oh. It seems like you will be asked a medium level difficulty question.",txt);
		System.out.println("");
		IO.printSlow("Question: Suppose a line is plotted on a grid with the two pairs of points (-1,1) and (3,4).",txt);
		System.out.println("");
		IO.printSlow("What would be the distance of the line?",txt);
		System.out.println("");
		JOptionPane.showMessageDialog (null, createImageIcon ("distance.png"), "*** H I N T ***", JOptionPane.INFORMATION_MESSAGE);
		int ans2 = IO.inputInt ("Answer>> ");

		// Player moves on if the answer is correct (Testing answer condition)
		if (ans2 == distance (x1,x2,y1,y2)) {
			IO.printSlow ("\nWow, you are really intelligent!",txt);
			System.out.println("");
			IO.printSlow("\nExit the tunnel to reach to your treasure!",100);
			System.out.println("");
			IO.printSlow(".........",100);
			task4intro(); }

		// If the answer is incorrect, the player restarts from beginning of task 5.
		else {
			IO.printSlow ("\nOops. That's not the correct answer. ",txt);
			IO.printSlow ("\nTry again",txt);
			mathquest();    
		}
	}

	// Method to calculate the distance of a line for question asked in tunnel 2.
	public double distance (int x1, int x2, int y1, int y2) {
		double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		return distance;
	}

	// Information on a math question when the fortune ball selects tunnel 3 to enter. 
	// The method is then called in the switch and case above.
	public void slopeline () {
		int x3 = 5; int x4 = 10; int y3 = 20; int y4 = 30;
		IO.printSlow ("\nThe fortune ball has selected tunnel 3",txt);
		System.out.println("");
		IO.printSlow("Proceed.....",175);
		System.out.println("");
		IO.printSlow ("Oh. It seems like you will be asked an easy question.",txt);
		System.out.println("");
		IO.printSlow("Question: Infer that a straight line has the two coordinates (5,20) and (10,30)",txt);
		System.out.println("");
		IO.printSlow("What would be the slope of the line?\n",txt);
		JOptionPane.showMessageDialog (null, createImageIcon ("slope.png"), "*** H I N T ***", JOptionPane.INFORMATION_MESSAGE);
		System.out.println("");
		int ans3 = IO.inputInt ("Answer>> ");

		// Player moves on if the answer is correct (Testing answer condition)
		if (ans3 == slope (x3,x4,y3,y4)) {
			IO.printSlow ("\nWow, you are really intelligent!",txt);
			System.out.println("");
			IO.printSlow("\nExit the tunnel to reach to your treasure!",100);
			System.out.println("");
			IO.printSlow(".........",100);
			task4intro(); }

		// If the answer is incorrect, the player restarts from beginning of task 5.
		else {
			IO.printSlow ("\nOops. That's not the correct answer. ",txt);
			IO.printSlow ("\nTry again",txt);
			mathquest();
		}
	}

	// Method to calculate the correct slope of a line. (Question from tunnel 3)
	public int slope (int x3, int x4, int y3, int y4) {
		int slope = (y4-y3) / (x4-x3);
		return slope;
	}

	// Information on a math question when the fortune ball selects tunnel 4 to enter. 
	// The method is then called in the switch and case above.
	public void yintercept() {
		int x5 = 14; int y5 = 28;
		IO.printSlow ("\nThe fortune ball has selected tunnel 4",txt);
		System.out.println("");
		IO.printSlow("Proceed.....",175);
		System.out.println("");
		IO.printSlow ("Oh. It seems like you have come across a medium difficulty level question.",txt);
		System.out.println("");
		IO.printSlow("Question: A linear line with the equation (y=2x+b) passes through the point (14,28) ",txt);
		System.out.println("");
		IO.printSlow("What would be the value of the y-intercept of this linear equation?.",txt);
		JOptionPane.showMessageDialog (null, createImageIcon ("intercept.png"), "---H I N T---", JOptionPane.INFORMATION_MESSAGE);
		int ans4 = IO.inputInt ("\nAnswer>> ");

		// Player moves on if the answer is correct (Testing answer condition)
		if (ans4 == intercept (x5, y5)) {
			IO.printSlow ("\nWow, you are really intelligent!",txt);
			System.out.println("");
			IO.printSlow("\nExit the tunnel to reach to your treasure!",100);
			System.out.println("");
			IO.printSlow("........",100);
			task4intro(); }

		// If the answer is incorrect, the player restarts from beginning of task 5.
		else {
			IO.printSlow ("\nOops. That's not the correct answer. ",txt);
			IO.printSlow ("\nTry again",txt);
			mathquest();
		}
	}

	// Method to calculate the correct y-intercept to the question asked in tunnel 4.
	public int intercept (int x5, int y5) {
		int intercept = y5 - (2 * x5);
		return intercept;
	}

	// Information on a math question when the fortune ball selects tunnel 5 to enter. 
	// The method is then called in the switch and case above.
	public void prismarea() {
		int l = 3; int w = 2; int h = 7;
		IO.printSlow ("\nThe fortune ball has selected tunnel 5",txt);
		System.out.println("");
		IO.printSlow("Proceed........",175);
		System.out.println("");
		IO.printSlow ("Oh. It seems like you have come across a high difficulty level question.",txt);
		System.out.println("");
		IO.printSlow("Question: Assume that a rectangular prism has the dimensions: (length = 3), (width = 2), (height = 7).",txt);
		System.out.println("");
		IO.printSlow("What is the total surface area of the rectangle?",txt);
		IO.printSlow("\nHere's a picture to help you:");
		JOptionPane.showMessageDialog (null, createImageIcon ("surfacearea.png"), "---H I N T---", JOptionPane.INFORMATION_MESSAGE);
		int ans5 = IO.inputInt ("\nAnswer>> ");

		// Player moves on if the answer is correct (Testing answer condition)
		if (ans5 == surfacearea (l,w,h)) {
			IO.printSlow ("\nWow, you are really intelligent!",txt);
			System.out.println("");
			IO.printSlow("\nExit the tunnel to reach to your treasure!",100);
			System.out.println("");
			IO.printSlow("........",100);
			task4intro(); 
		}
		else {
			// If the answer is incorrect, the player restarts from beginning of task 5.
			IO.printSlow ("\nOops. That's not the correct answer. ",txt);
			IO.printSlow ("\nTry again",txt);
			mathquest();
		}

	}

	// Method to calculate the correct surface of the rectangular prism
	public int surfacearea (int l, int w, int h) {
		int surfacearea = (2*l*w) + (2*l*h) + (2*w*h);
		return surfacearea;
	}

	//Introduction to task 4 is given when the player successfully passes task 3.
	// Provides a brie info on what the player must do in order to open the treasure box.
	public void task4intro () {
		for (int i = 1 ; i <= 30 ; i++){
			System.out.print("-"); }
		System.out.println("");
		IO.printSlow ("John approaches the treasure.......", 150);
		System.out.println("");
		IO.printSlow("Congratulations, you have finally made it to the the legendary treasure.",txt);
		System.out.println("");
		IO.printSlow("You have become the first to ever reach this far.",txt);
		System.out.println("");
		IO.printSlow("Here is the treasure box:",txt);
		JOptionPane.showMessageDialog (null, createImageIcon ("treasurebox.png"), "---Treasure---", JOptionPane.INFORMATION_MESSAGE);
		System.out.println("");
		IO.printSlow ("But there is one plot twist. In order to open the box you must enter two correct passwords.",txt);
		System.out.println("");
		IO.printSlow("The first password is to unscramble words which are written on the treasure box and enter them correctly",txt);
		System.out.println("");
		IO.printSlow("The second password is to guess the correct number between 1 - 100 which is set to unlock the treasure box.",txt);
		System.out.println("");
		IO.printSlow("Samus: Be careful, if you get the first password wrong then you will once again spawn in front of the five tunnel entrance.",txt);
		System.out.println("");
		IO.printSlow("Then you must continue your way from there to reach the treasure one more time",txt);
		System.out.println("");
		IO.printSlow("Good luck! You are almost there!",txt);
		firstpassword ();
	}

	//This method comes after the intro of task 4. Here the player actually performs the task in order to continue on.
	public void firstpassword () {
		IO.printSlow("----------------------------------------------------",50);
		unscrambleart();
		IO.printSlow("\nYou will have 4 chances to unscramble the two words.",txt);
		IO.printSlow("\nUnscramble this password:\n",txt);
		System.out.println("|--------------|");
		System.out.println("| lwemoce ohjn |");
		System.out.println("|--------------|");
		JOptionPane.showMessageDialog (null, "Here's a clue about the two scrambled words.\n\n" + "\"w _ l c _ m e    J o _ n\" ","*** H I N T ***",JOptionPane.INFORMATION_MESSAGE);
		int tries = 2;
		String ans = IO.inputString ("\nTry 1: ");

		//If wrong then it will keep looping and count the number of tries.
		while (!ans.equalsIgnoreCase("welcome john") && tries <=4 ) {
			System.out.println ("Nope try again");
			ans = IO.inputString("\nTry "+tries+": ");
			tries++; }

		// If right, then the player moves onwards to the second password.
		if (ans.equalsIgnoreCase ("welcome john")) {
			System.out.println ("\n\"Wow, you're a genius.\"");
			IO.printSlow(" ",txt);
			System.out.println("");
			task5 (); }
		else {
			IO.printSlow ("\nOh no. It seems like you are having some difficulty guessing the password.",txt);
			IO.printSlow ("\nThe password was none other then your name! - \"welcome john\"",txt);
			IO.printSlow("\nYou will have to start again from inside the tunnel, where you must answer the math question in order to proceed.",txt);
			System.out.println("");
			mathquest(); }
	}

	//Ascii art used in the method above as a title.
	public void unscrambleart() {
		System.out.println("      ___          ___          ___          ___          ___          ___          ___          ___         ___  ___     ");
		System.out.println("     /\\__\\        /\\__\\        /\\  \\        /\\  \\        /\\  \\        /\\  \\        /\\__\\        /\\  \\       /\\__\\/\\  \\    ");
		System.out.println("    /:/  /       /::|  |      /::\\  \\      /::\\  \\      /::\\  \\      /::\\  \\      /::|  |      /::\\  \\     /:/  /::\\  \\   ");
		System.out.println("   /:/  /       /:|:|  |     /:/\\ \\  \\    /:/\\:\\  \\    /:/\\:\\  \\    /:/\\:\\  \\    /:|:|  |     /:/\\:\\  \\   /:/  /:/\\:\\  \\  ");
		System.out.println("  /:/  /  ___  /:/|:|  |__  _\\:\\~\\ \\  \\  /:/  \\:\\  \\  /::\\~\\:\\  \\  /::\\~\\:\\  \\  /:/|:|__|__  /::\\~\\:\\__\\ /:/  /::\\~\\:\\  \\ ");
		System.out.println(" /:/__/  /\\__\\/:/ |:| /\\__\\/\\ \\:\\ \\ \\__\\/:/__/ \\:\\__\\/:/\\:\\ \\:\\__\\/:/\\:\\ \\:\\__\\/:/ |::::\\__\\/:/\\:\\ \\:|__/:/__/:/\\:\\ \\:\\__\\");
		System.out.println(" \\:\\  \\ /:/  /\\/__|:|/:/  /\\:\\ \\:\\ \\/__/\\:\\  \\  \\/__/\\/_|::\\/:/  /\\/__\\:\\/:/  /\\/__/~~/:/  /\\:\\~\\:\\/:/  |:\\  \\:\\~\\:\\ \\/__/");
		System.out.println("  \\:\\  /:/  /     |:/:/  /  \\:\\ \\:\\__\\   \\:\\  \\         |:|::/  /      \\::/  /       /:/  /  \\:\\ \\::/  / \\:\\  \\:\\ \\:\\__\\  ");
		System.out.println("   \\:\\/:/  /      |::/  /    \\:\\/:/  /    \\:\\  \\        |:|\\/__/       /:/  /       /:/  /    \\:\\/:/  /   \\:\\  \\:\\ \\/__/  ");
		System.out.println("    \\::/  /       /:/  /      \\::/  /      \\:\\__\\       |:|  |        /:/  /       /:/  /      \\::/__/     \\:\\__\\:\\__\\    ");
		System.out.println("     \\/__/        \\/__/        \\/__/        \\/__/        \\|__|        \\/__/        \\/__/        ~~          \\/__/\\/__/    ");
	}

	//Introduction to task 5. This is the final task the player has to attempt.
	//Provides information on what the player as to do. (Task 5 is a second password to open the treasure box).
	public void task5 () {
		IO.printSlow("You have done extremely well so far.",txt);
		System.out.println("");
		IO.printSlow("You are the only one in history to make it this far into the Ryuuchi Cave",txt);
		System.out.println("");
		IO.printSlow("Samus: I believe you can open the treasure box",txt);
		System.out.println("");
		IO.printSlow("All you have to do now is to guess the correct number between 1 and 100 to completely unlock the treasure box.",txt);
		System.out.println("");
		IO.printSlow("Similar to the first password, the second password is restricted to limited tries.",txt);
		System.out.println("");
		IO.printSlow("You will only be given 7 tries to get the correct number.");
		System.out.println("");
		IO.printSlow("This will entirely depend on your luck and on your fate. We will see if fate is really on your side!",txt);
		JOptionPane.showMessageDialog (null, "If you take more than 7 tries to\n" 
				+ "get the correct number, you will have to\n" 
				+ "restart the game all the way from the 5 questionares\n" 
				+ "-multiple choice!\n\n" 
				+ "Better get it right the first time!", "*** A L E R T ***",JOptionPane.ERROR_MESSAGE);
		secondpassword();
	}

	//Method created to check if the player has guessed the correct password.
	//The method checks if the player continues and finishes the game or restarts from task 2.
	public void secondpassword() {  
		passwordart();
		int guess = 1 ;
		int num = (int) (Math.random () * 100) + 1;
		int input = 0;

		while (input != num && guess <= 7){
			input = IO.inputInt ("\nGuess #"+guess+": "); 
			if (input < num)
				System.out.println ("\nThat is too low.");
			else if (input > num)
				System.out.println ("\nThat is too high.");
			else 
				System.out.println ("\nYou got it!");
			guess++; }

		if (input == num) {
			System.out.println ("\n\"Wow, seems like luck is on your side.\"");
			IO.printSlow("\nThe treasure box is finally open!",txt);
			System.out.println("");
			conclusion(); }
		else {
			IO.printSlow ("\nUh-oh. You took more than seven guesses to get the correct password.",txt);
			System.out.println("");
			IO.printSlow("\nYou will have to start again from questionare from where you must continue your way to here once again.",txt);
			System.out.println("");
			IO.printSlow("\nBetter luck next time!",txt);                  
			question1(); }
	}

	//Ascii art used for task 5 as a title.
	public void passwordart () {
		System.out.println("");
		IO.printSlow("______                                   _   _____                     ",2);
		IO.printSlow("| ___ \\                                 | | |  __ \\                    ",2);
		IO.printSlow("| |_/ /_ _ ___ _____      _____  _ __ __| | | |  \\/_   _  ___  ___ ___ ",2);
		IO.printSlow("|  __/ _` / __/ __\\ \\ /\\ / / _ \\| '__/ _` | | | __| | | |/ _ \\/ __/ __|",2);
		IO.printSlow("| | | (_| \\__ \\__ \\\\ V  V / (_) | | | (_| | | |_\\ \\ |_| |  __/\\__ \\__ \\",2);
		IO.printSlow("\\_|  \\__,_|___/___/ \\_/\\_/ \\___/|_|  \\__,_|  \\____/\\__,_|\\___||___/___/",2);
		IO.printSlow("                                                                       ",2);
	}

	//If the player has gotten pass all 5 tasks, then Samus (narrator) will give a brief conclusion.
	//Congrulates the player on successfully completing the game.
	public void conclusion ()
	{
		IO.printSlow("SAMUS: Let's take a look inside the treasure box.......",txt);
		IO.printSlow("\nHmmm. Oh, the treasure turned out to be a piece of paper! I don't think its worth much.",txt);
		IO.printSlow("\nWell, lets read what it says on the paper..........\n",100);
		paperart();
		IO.printSlow("\nWow!!! Can you believe this. This is not just an ordinary paper, it is the \"Will\" of your grandfater Mr.Smith.",txt);
		IO.printSlow("\nI also haven't mentioned this to you, but Mr.Smith is the richest person in the world! He has a net worth of ONE TRILLION dollars!!!",txt);
		IO.printSlow("\nAs Mr.Smith aged, he lost his desire and interest in his fortune and he announced to the world that he has hid all of his \"treasure\" somewhere.",txt);
		IO.printSlow("\nAnyone who finds this so called \"treasure\" of Mr.Smith will get to keep all of it.",txt);
		IO.printSlow("\nThose were his final words to the world before he left on his grand vacation to tour the world",txt);
		IO.printSlow("\nNow that you have acquired all of your grandfather's fortune, you are now the richest person in the world!!!",txt);
		IO.printSlow("\nCould there be a better treasure than this! A fortune wort a TRILLION dollars!",txt);
		IO.printSlow("\nThe expedition was worth it after all.");
		System.out.println("");
		IO.printSlow("Along with becoming the richest person in the world..........",txt);
		conclart();
		System.out.println("");
		chest();
		IO.printSlow("\nYou have alsosuccessfully completed \"The Hidden Expedition\"",txt);
		//End the timer
		end = new Date ();
		int sec2 = end.getSeconds ();
		int min2 = end.getMinutes ();
		int elapsed_sec = (min2 * 60 + sec2) - (min1 * 60 + sec1);
		IO.printSlow("\nIt took you "+elapsed_sec+" seconds to finish the game.",txt);
		playagain();
	}

	//Ascii art used in the conclusion
	public void paperart() {
		System.out.println(" ______________________________");
		System.out.println(" / \\                             \\.");
		System.out.println("|   |                            |.");
		System.out.println(" \\_ |           will             |.");
		System.out.println("    |             of             |.");
		System.out.println("    |          Mr.Smith          |.");
		System.out.println("    |                            |.");
		System.out.println("    |                            |.");
		System.out.println("    |                            |.");
		System.out.println("    |                            |.");
		System.out.println("    |                            |.");
		System.out.println("    |                            |.");
		System.out.println("    |                            |.");
		System.out.println("    |                            |.");
		System.out.println("    |                            |.");
		System.out.println("    |   _________________________|___");
		System.out.println("    |  /                            /.");
		System.out.println("    \\_/dc__________________________/.");
	}
	//Ascii art used in the conclusion for title.
	public void chest() {
	System.out.println("                        _.--.                ");
	System.out.println("                    _.-'_:-'||               ");
	System.out.println("               _.-'_.-::::'||				 ");
	System.out.println("          _.-:'_.-::::::'  ||				 ");
	System.out.println("        .'`-.-:::::::'     ||				 ");
	System.out.println("       /.'`;|:::::::'      ||_				 ");
	System.out.println("      ||   ||::::::'     _.;._'-._			 ");
	System.out.println("      ||   ||:::::'  _.-!oo @.!-._'-.		 ");
	System.out.println("      \'.  ||:::::.-!()oo @!()@.-'_.|		 ");
	System.out.println("       '.'-;|:.-'.$@.@  -@@ @   @  ||		 ");
	System.out.println("         `>'-.!@%()@'@_%-'_.-o _.|'||		 ");
	System.out.println("          ||-._'-.@.-'_.-' _.-o  |'||		 ");
	System.out.println("          ||=[ '-._.-\\ .-'    o |'||		 ");
	System.out.println("          || '-.]=|| |'|      o  |'||		 ");
	System.out.println("          ||      || |'|        _| ';		 ");
	System.out.println("          ||      || |'|    _.-'_.-'		 ");
	System.out.println("          |'-._   || |'|_.-'_.-'			 ");
	System.out.println("          jgs '-._'-.|| |' `_.-'			 ");
	System.out.println("                  '-.||_/.-'						 ");
}
	
	//Ascii art used in the conclusion for title.
	public void conclart () {
		System.out.println("");
		System.out.println(" ___                                   _           _           _                         ");
		System.out.println("(  _`\\                                ( )_        (_ )        ( )_ _                     ");
		System.out.println("| ( (_)   _     ___     __  _ __  _ _ | ,_) _   _  | |    _ _ | ,_|_)   _     ___    ___ ");
		System.out.println("| |  _  /'_`\\ /' _ `\\ /'_ `( '__)'_` )| |  ( ) ( ) | |  /'_` )| | | | /'_`\\ /' _ `\\/',__)");
		System.out.println("| (_( )( (_) )| ( ) |( (_) | | ( (_| || |_ | (_) | | | ( (_| || |_| |( (_) )| ( ) |\\__, \\");
		System.out.println("(____/'`\\___/'(_) (_)`\\__  (_) `\\__,_)`\\__)`\\___/'(___)`\\__,_)`\\__|_)`\\___/'(_) (_)(____/");
		System.out.println("                     ( )_) |                                                             ");
	}

	//Asks the player if they want to play the game again or if they want to quit.
	public void playagain() {
		System.out.println("");
		IO.printSlow("\nSAMUS: I hope you had fun playing this adventurous game!",txt);
		System.out.println("");
		IO.printSlow("Do you want to play one more time?",txt);
		String continu = IO.inputString("\nType [Yes] to play again and [No] to quit: ");

		//If answer is not one of the two options (Yes or No)
		while(!continu.equalsIgnoreCase ("Yes") && !continu.equalsIgnoreCase ("No")) {
			System.out.println("\nPlease enter one of the two options [Yes] or [No].");
			continu = IO.inputString("\nType [Yes] to play again and [No] to quit: ");}

		//If the answer is (Yes)
		if (continu.equalsIgnoreCase ("Yes")) {   
			IO.printSlow("\nOk! I like that enthusiasm!",txt);
			for (int i = 1 ; i <= 15 ; i++){
				System.out.println("-"); }
			introduction1();
		}
		//If the answer is (No)
		else if (continu.equalsIgnoreCase ("No")) {      
			IO.printSlow("\nIt was fun going on this expedition with you!.",txt);}
		System.out.println("");
		IO.printSlow("\nHave a great day!",txt);
		System.exit(0);
	}

	//Method created to bring in dialog box pictures.
	protected static ImageIcon createImageIcon (String path)
	{ //change the red to your class name
		java.net.URL imgURL = Expedition.class.getResource (path);
		if (imgURL != null)
		{
			return new ImageIcon (imgURL);
		}
		else
		{
			System.err.println ("Couldn't find file: " + path);
			return null;
		}
	}
}