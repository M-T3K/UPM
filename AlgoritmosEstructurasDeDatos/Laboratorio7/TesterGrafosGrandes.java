
/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the 'entrega system'.
 *
 */

//////////////////////////////////////////////////////////////////////
//
// File generated at: 2018/12/13 -- 22:47:7
// Seed: {1544,737616,2924}
//
//////////////////////////////////////////////////////////////////////



package aed.caminos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;
import java.util.concurrent.CountDownLatch;
import aed.caminos.Point;
import aed.caminos.Transportistas;
import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.graph.*;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.priorityqueue.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import javax.imageio.*;
import javax.swing.*;



@SuppressWarnings("unused")
public class TesterGrafosGrandes {

  public static void main(String[] args) {
    try {
	String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
	BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
	bw.write(ids[0]);
	bw.close();
    } catch (Exception e) {
	System.out.println("Avisa al profesor de fallo sacando el PID");
    }

    ResultsHandler.init();

    // Permit executing individual tests: 
    // the first argument should be the test number
    if ((args.length == 1) && !args[0].equals("--nota-as-exit-code")) {
	try {
	    int testNumber = Integer.parseInt(args[0]);
	    String testName = "test_"+testNumber;
	    java.lang.reflect.Method testMethod = null;
	    try {
		testMethod = Tests.class.getDeclaredMethod(testName);
		testMethod.setAccessible(true);
	    } catch (SecurityException exc) {
		System.out.println("\n*** Error: test "+testName+" is not accessible");
		System.exit(24);
	    } catch (NoSuchMethodException exc) {
		System.out.println("\n*** Error: test "+testName+" does not exist");
		System.exit(24);
	    }

	    Object result = null;

	    try {
		result = testMethod.invoke(null);
	    } catch (IllegalAccessException exc) {
		System.out.println("\n*** Error: not permitted to access "+testName);
		System.exit(24);
	    } catch (InvocationTargetException exc) {
		System.out.println("\n*** Error: cannot invoke "+testName);
		System.exit(24);
	    }
	    
	    if (result instanceof Boolean) {
		Boolean booleanResult = (Boolean) result;
		if (booleanResult)
		    System.out.println("\n*** Test "+testName+" succeeded.");
		else
		    System.out.println("\n*** Error: test "+testName+" failed.");

                waitForThreads();
		System.exit(booleanResult ? 0 : 24);
	    }
	} catch (NumberFormatException exc) {
	    System.out.println("\n*** Error: argument should be an integer but is "+args[0]);
	    System.exit(24);
	}
    } else {
      Tests.runTests();

      waitForThreads();

      // Check if the option --nota-as-exit-code is set --
      // if so exit with the nota as the exit code
      if (args.length == 1) {
	System.exit(ResultsHandler.get_nota());
      } else {
	// Standard exit codes
	if (ResultsHandler.results_ok()) {
          System.out.println();
          System.out.println("     .      .     II |  \\)  .      .         .              .     /\\     .");
          System.out.println("  .      .      .II  |    merry          .          .    .        \\ \\.");
          System.out.println("    .       .     II |   ,christmas  .        __       .      /\\_,'  /~|  .");
          System.out.println("  .      .     .   ~~~--'                    {::;,~;  __  ,-. \\  /~._)::");
          System.out.println("     .      .     .       .      .      . (\\_/`:_';;._;:: ::|  ; `;;;;; .");
          System.out.println("  .     .     ___..----._      .     .    `-.__  `-._;;;;-'::_.' ,;;;,'   .");
          System.out.println("      .    ,-'           `-._     .      .     `-.__ `:_::::`.__,;:::;-, .");
          System.out.println("    .    ,'           _______`; .     .       .     `--.`._::::::::_:-' . .");
          System.out.println("  .    ,'  ____--#############|   .       .        .    `-.`::::::'  .   .");
          System.out.println("      | ./|###################|      .         .          | ::::::     .");
          System.out.println("  ,###\\/  |######-----~~~~~~~~:   .      .         .    _.--'    :_.--.___");
          System.out.println("  |####|   |   .....     .... :||.    .        .      .'  \\\\\\     _      _>");
          System.out.println("  `####'  |:: ;;;;;;;   ;;;;;;:::|.      .   .        ; 0   \\\\\\_--;`~~--~");
          System.out.println("         ||:;    __       __   :|||.  .    .        _,'  _-~_ \\\\ ~;       .");
          System.out.println(" .  .   ||:;    '  `   _ '  `  ::|||     .      _.-'\\\\\\-~_-~   \\\\.'  .  .");
          System.out.println("  .    ||:;        _,,(_),,_    :||'  .      . (_)   \\\\\\~  __.--';     .");
          System.out.println("      ||::::     ,|||||||||||.   ::||   .  .     `--','\\\\'~     .'  .      .");
          System.out.println(" .   |:::::::_  ,|||||   |||||,   :|'    .      .   `--' `.     ;       .");
          System.out.println("    ||;;;:::::::;|||||___|||||':::::||      .             :     :    .     .");
          System.out.println("    `|;;::::::::::::::::::::::::::::::|  .       .    .   ;     :      .");
          System.out.println("  .    ,|;;|::::::|||||||||::::::||||||       .    .     ,'      :  .      .");
          System.out.println("      |;;;||||::::::|||||::::::::::|||'---.___          ,'       :       .");
          System.out.println("      |;;;;||||||::::::|||::::::::::||__ :::::`---.____,'         :  .     .");
          System.out.println(" .    `|;;;;||||||::::::|||:::::::|||'  `-._\":::::::: ,'           :--._");
System.out.println("   .    _,|;;;|||||||||:::|::::::||''       `.\":::::,'           _::::::`.");
System.out.println(" .    ,' |;;;;;;;;|||||::::::::||;;           `-.::;            |#########|");
System.out.println("   .  |      `|;;;;|||||;;;;:;;;'                ,'            |##########|");
System.out.println(" .   |         `||;;;;||;;;;|||'                _;-'\\          /          |");
System.out.println("     |         ||  `;;;;;;;;;;' ________    _.-'      \\      /'            |");
System.out.println("  . |          |      ````''_,-|::::::::`,-'   ___      \\   (    ,'|       |");
System.out.println("    |          |           /___/' _`---;'  _.-'   \\       \\  `--' ,'       |");
System.out.println("   |          |       ___#####,--'   ,'  ,\\;;;\\   |`\\|:    |     :'       ,'");
System.out.println("   |          :__.---'   |####      ,'  :` `\\::`\\_| ;    _;      `.____.-'");
System.out.println("  :                      |####      ;___:  / `.::;: `.__,'     ____--'  |");
System.out.println("  ;                      |####     /____|  \\. `.;;;|                     \\");
          System.out.println("  `,                _____|####__             ; `~~~~|                     |");
          System.out.println("   `._____,--------'     ~~~~~  `-._________,'       |_____________________\\          ");
          System.out.println();

          System.exit(0);
        } else System.exit(24);
      }
    }
  }

  private static void waitForThreads() {
    try {
      if (ResultsHandler.waitForThreads != null)
        ResultsHandler.waitForThreads.await();
    } catch (InterruptedException exc) { }
  }

  
    

static class Tests {

  static String tester = "TesterGrafosGrandes";

  static boolean runTests() {
    ResultsHandler.init();

    if (ResultsHandler.local_results_ok_sofar("bestPath"))
      ResultsHandler.add_result("bestPath",test_1());

    if (ResultsHandler.local_results_ok_sofar("bestPath"))
      ResultsHandler.add_result("bestPath",test_2());

    if (ResultsHandler.local_results_ok_sofar("bestPath"))
      ResultsHandler.add_result("bestPath",test_3());

    if (ResultsHandler.local_results_ok_sofar("bestPath"))
      ResultsHandler.add_result("bestPath",test_4());

    if (ResultsHandler.local_results_ok_sofar("bestPath"))
      ResultsHandler.add_result("bestPath",test_5());

    if (ResultsHandler.local_results_ok_sofar("bestPath"))
      ResultsHandler.add_result("bestPath",test_6());

    if (ResultsHandler.local_results_ok_sofar("bestPath"))
      ResultsHandler.add_result("bestPath",test_7());

    if (ResultsHandler.local_results_ok_sofar("bestPath"))
      ResultsHandler.add_result("bestPath",test_8());

    if (ResultsHandler.local_results_ok_sofar("bestPath"))
      ResultsHandler.add_result("bestPath",test_9());

    if (ResultsHandler.local_results_ok_sofar("bestPath"))
      ResultsHandler.add_result("bestPath",test_10());

    if (ResultsHandler.local_results_ok_sofar("bestPath"))
      ResultsHandler.add_result("bestPath",test_11());

    if (ResultsHandler.local_results_ok_sofar("bestPath"))
      ResultsHandler.add_result("bestPath",test_12());

    if (ResultsHandler.local_results_ok_sofar("bestPath"))
      ResultsHandler.add_result("bestPath",test_13());

    if (ResultsHandler.local_results_ok_sofar("bestPath"))
      ResultsHandler.add_result("bestPath",test_14());

    if (ResultsHandler.local_results_ok_sofar("bestPath"))
      ResultsHandler.add_result("bestPath",test_15());

    if (ResultsHandler.local_results_ok_sofar("bestPath"))
      ResultsHandler.add_result("bestPath",test_16());

    if (ResultsHandler.local_results_ok_sofar("bestPath"))
      ResultsHandler.add_result("bestPath",test_17());

    if (ResultsHandler.local_results_ok_sofar("bestPath"))
      ResultsHandler.add_result("bestPath",test_18());

    if (ResultsHandler.local_results_ok_sofar("bestPath"))
      ResultsHandler.add_result("bestPath",test_19());

    if (ResultsHandler.local_results_ok_sofar("bestPath"))
      ResultsHandler.add_result("bestPath",test_20());

    if (ResultsHandler.local_results_ok_sofar("bestPathQuick"))
      ResultsHandler.add_result("bestPathQuick",test_21());

    if (ResultsHandler.local_results_ok_sofar("bestPathQuick"))
      ResultsHandler.add_result("bestPathQuick",test_22());

    if (ResultsHandler.local_results_ok_sofar("bestPathQuick"))
      ResultsHandler.add_result("bestPathQuick",test_23());

    if (ResultsHandler.local_results_ok_sofar("bestPathQuick"))
      ResultsHandler.add_result("bestPathQuick",test_24());


    ResultsHandler.report_results();


    if (ResultsHandler.results_ok())
      return true;
    else
      return false;
  }



  static boolean test_1 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_1") ;
    boolean ok_sofar = true ;
    
    return ok_sofar ;
  }



  static boolean test_2 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_2") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPath(new java.lang.Integer[][] { { null,0 }, { 1,2 } },new aed.caminos.Point(1,0),new aed.caminos.Point(1,1)).doCall().checkResult(new es.upm.aedlib.Pair<aed.caminos.Point[],java.lang.Integer>(new aed.caminos.Point[] { new aed.caminos.Point(1,0),new aed.caminos.Point(1,1) },2)) ;
    return ok_sofar ;
  }



  static boolean test_3 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_3") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPath(new java.lang.Integer[][] { { 0,0 }, { 1,2 } },new aed.caminos.Point(1,1),new aed.caminos.Point(1,1)).doCall().checkResult(new es.upm.aedlib.Pair<aed.caminos.Point[],java.lang.Integer>(new aed.caminos.Point[] { new aed.caminos.Point(1,1) },0)) ;
    return ok_sofar ;
  }



  static boolean test_4 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_4") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPath(new java.lang.Integer[][] { { 1,1,3 }, { null,1,2 } },new aed.caminos.Point(1,1),new aed.caminos.Point(1,2)).doCall().checkResult(new es.upm.aedlib.Pair<aed.caminos.Point[],java.lang.Integer>(new aed.caminos.Point[] { new aed.caminos.Point(1,1),new aed.caminos.Point(1,2) },2)) ;
    return ok_sofar ;
  }



  static boolean test_5 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_5") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPath(new java.lang.Integer[][] { { 2,1,2 }, { null,2,0 } },new aed.caminos.Point(1,1),new aed.caminos.Point(1,2)).doCall().checkResult(new es.upm.aedlib.Pair<aed.caminos.Point[],java.lang.Integer>(new aed.caminos.Point[] { new aed.caminos.Point(1,1),new aed.caminos.Point(1,2) },1)) ;
    return ok_sofar ;
  }



  static boolean test_6 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_6") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPath(new java.lang.Integer[][] { { 2,null }, { 0,3 }, { 0,3 } },new aed.caminos.Point(1,1),new aed.caminos.Point(1,1)).doCall().checkResult(new es.upm.aedlib.Pair<aed.caminos.Point[],java.lang.Integer>(new aed.caminos.Point[] { new aed.caminos.Point(1,1) },0)) ;
    return ok_sofar ;
  }



  static boolean test_7 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_7") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPath(new java.lang.Integer[][] { { 3,3,3 }, { null,null,3 }, { 2,null,null } },new aed.caminos.Point(1,2),new aed.caminos.Point(1,2)).doCall().checkResult(new es.upm.aedlib.Pair<aed.caminos.Point[],java.lang.Integer>(new aed.caminos.Point[] { new aed.caminos.Point(1,2) },0)) ;
    return ok_sofar ;
  }



  static boolean test_8 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_8") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPath(new java.lang.Integer[][] { { 0,3 }, { 3,null }, { 1,1 }, { null,1 } },new aed.caminos.Point(2,1),new aed.caminos.Point(2,1)).doCall().checkResult(new es.upm.aedlib.Pair<aed.caminos.Point[],java.lang.Integer>(new aed.caminos.Point[] { new aed.caminos.Point(2,1) },0)) ;
    return ok_sofar ;
  }



  static boolean test_9 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_9") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPath(new java.lang.Integer[][] { { 0,2,2,2 }, { 3,2,2,null } },new aed.caminos.Point(1,2),new aed.caminos.Point(1,2)).doCall().checkResult(new es.upm.aedlib.Pair<aed.caminos.Point[],java.lang.Integer>(new aed.caminos.Point[] { new aed.caminos.Point(1,2) },0)) ;
    return ok_sofar ;
  }



  static boolean test_10 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_10") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPath(new java.lang.Integer[][] { { 3,null,3,1 }, { 3,0,0,0 } },new aed.caminos.Point(1,2),new aed.caminos.Point(1,0)).doCall().checkResult(new es.upm.aedlib.Pair<aed.caminos.Point[],java.lang.Integer>(new aed.caminos.Point[] { new aed.caminos.Point(1,2),new aed.caminos.Point(1,1),new aed.caminos.Point(1,0) },5)) ;
    return ok_sofar ;
  }



  static boolean test_11 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_11") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPath(new java.lang.Integer[][] { { 2,3,2,null,1 }, { 2,null,0,3,null } },new aed.caminos.Point(1,3),new aed.caminos.Point(1,0)).doCall().checkResult(new es.upm.aedlib.Pair<aed.caminos.Point[],java.lang.Integer>(new aed.caminos.Point[] { new aed.caminos.Point(1,3),new aed.caminos.Point(1,2),new aed.caminos.Point(0,2),new aed.caminos.Point(0,1),new aed.caminos.Point(0,0),new aed.caminos.Point(1,0) },8)) ;
    return ok_sofar ;
  }



  static boolean test_12 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_12") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPath(new java.lang.Integer[][] { { 1,1 }, { 3,1 }, { 1,0 }, { 1,3 } },new aed.caminos.Point(3,0),new aed.caminos.Point(3,0)).doCall().checkResult(new es.upm.aedlib.Pair<aed.caminos.Point[],java.lang.Integer>(new aed.caminos.Point[] { new aed.caminos.Point(3,0) },0)) ;
    return ok_sofar ;
  }



  static boolean test_13 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_13") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPath(new java.lang.Integer[][] { { 2,1,3 }, { null,3,0 }, { 2,1,3 } },new aed.caminos.Point(2,1),new aed.caminos.Point(2,1)).doCall().checkResult(new es.upm.aedlib.Pair<aed.caminos.Point[],java.lang.Integer>(new aed.caminos.Point[] { new aed.caminos.Point(2,1) },0)) ;
    return ok_sofar ;
  }



  static boolean test_14 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_14") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPath(new java.lang.Integer[][] { { 3,1 }, { null,2 }, { 0,0 }, { 0,0 }, { 0,null } },new aed.caminos.Point(2,1),new aed.caminos.Point(3,1)).doCall().checkResult(new es.upm.aedlib.Pair<aed.caminos.Point[],java.lang.Integer>(new aed.caminos.Point[] { new aed.caminos.Point(2,1),new aed.caminos.Point(3,1) },1)) ;
    return ok_sofar ;
  }



  static boolean test_15 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_15") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPath(new java.lang.Integer[][] { { 2,1,0 }, { 3,3,0 }, { 0,0,2 } },new aed.caminos.Point(1,1),new aed.caminos.Point(2,2)).doCall().checkResult(new es.upm.aedlib.Pair<aed.caminos.Point[],java.lang.Integer>(new aed.caminos.Point[] { new aed.caminos.Point(1,1),new aed.caminos.Point(1,2),new aed.caminos.Point(2,2) },4)) ;
    return ok_sofar ;
  }



  static boolean test_16 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_16") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPath(new java.lang.Integer[][] { { 2,1 }, { 0,3 }, { 0,0 }, { 2,0 }, { 0,0 } },new aed.caminos.Point(4,0),new aed.caminos.Point(2,0)).doCall().checkResult(new es.upm.aedlib.Pair<aed.caminos.Point[],java.lang.Integer>(new aed.caminos.Point[] { new aed.caminos.Point(4,0),new aed.caminos.Point(4,1),new aed.caminos.Point(3,1),new aed.caminos.Point(2,1),new aed.caminos.Point(2,0) },4)) ;
    return ok_sofar ;
  }



  static boolean test_17 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_17") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPath(new java.lang.Integer[][] { { 2,null,0 }, { 0,2,2 }, { 0,1,1 }, { 1,null,1 } },new aed.caminos.Point(1,0),new aed.caminos.Point(2,0)).doCall().checkResult(new es.upm.aedlib.Pair<aed.caminos.Point[],java.lang.Integer>(new aed.caminos.Point[] { new aed.caminos.Point(1,0),new aed.caminos.Point(2,0) },1)) ;
    return ok_sofar ;
  }



  static boolean test_18 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_18") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPath(new java.lang.Integer[][] { { 1,0,3,3 }, { null,0,3,1 }, { 2,0,3,1 } },new aed.caminos.Point(1,2),new aed.caminos.Point(2,3)).doCall().checkResult(new es.upm.aedlib.Pair<aed.caminos.Point[],java.lang.Integer>(new aed.caminos.Point[] { new aed.caminos.Point(1,2),new aed.caminos.Point(1,3),new aed.caminos.Point(2,3) },2)) ;
    return ok_sofar ;
  }



  static boolean test_19 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_19") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPath(new java.lang.Integer[][] { { 0,3,1 }, { 2,null,2 }, { 3,0,0 }, { 0,0,null }, { 1,0,2 } },new aed.caminos.Point(2,0),new aed.caminos.Point(3,0)).doCall().checkResult(new es.upm.aedlib.Pair<aed.caminos.Point[],java.lang.Integer>(new aed.caminos.Point[] { new aed.caminos.Point(2,0),new aed.caminos.Point(3,0) },1)) ;
    return ok_sofar ;
  }



  static boolean test_20 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_20") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPath(new java.lang.Integer[][] { { null,3,0 }, { 3,3,1 }, { 2,3,1 }, { 2,1,2 }, { 2,0,null } },new aed.caminos.Point(2,0),new aed.caminos.Point(1,1)).doCall().checkResult(new es.upm.aedlib.Pair<aed.caminos.Point[],java.lang.Integer>(new aed.caminos.Point[] { new aed.caminos.Point(2,0),new aed.caminos.Point(2,1),new aed.caminos.Point(1,1) },3)) ;
    return ok_sofar ;
  }



  static boolean test_21 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_21") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPathQuick(new aed.caminos.Point(55,67),new aed.caminos.Point(170,5)).doCall().checkResult(new aed.caminos.Point[] { new aed.caminos.Point(55,67),new aed.caminos.Point(55,68),new aed.caminos.Point(56,68),new aed.caminos.Point(57,68),new aed.caminos.Point(57,69),new aed.caminos.Point(57,70),new aed.caminos.Point(58,70),new aed.caminos.Point(58,71),new aed.caminos.Point(59,71),new aed.caminos.Point(60,71),new aed.caminos.Point(61,71),new aed.caminos.Point(62,71),new aed.caminos.Point(63,71),new aed.caminos.Point(64,71),new aed.caminos.Point(65,71),new aed.caminos.Point(66,71),new aed.caminos.Point(67,71),new aed.caminos.Point(68,71),new aed.caminos.Point(69,71),new aed.caminos.Point(70,71),new aed.caminos.Point(71,71),new aed.caminos.Point(72,71),new aed.caminos.Point(73,71),new aed.caminos.Point(74,71),new aed.caminos.Point(75,71),new aed.caminos.Point(75,70),new aed.caminos.Point(76,70),new aed.caminos.Point(77,70),new aed.caminos.Point(78,70),new aed.caminos.Point(79,70),new aed.caminos.Point(80,70),new aed.caminos.Point(81,70),new aed.caminos.Point(82,70),new aed.caminos.Point(83,70),new aed.caminos.Point(84,70),new aed.caminos.Point(85,70),new aed.caminos.Point(85,69),new aed.caminos.Point(86,69),new aed.caminos.Point(86,68),new aed.caminos.Point(86,67),new aed.caminos.Point(87,67),new aed.caminos.Point(88,67),new aed.caminos.Point(88,66),new aed.caminos.Point(88,65),new aed.caminos.Point(89,65),new aed.caminos.Point(90,65),new aed.caminos.Point(91,65),new aed.caminos.Point(92,65),new aed.caminos.Point(93,65),new aed.caminos.Point(94,65),new aed.caminos.Point(95,65),new aed.caminos.Point(96,65),new aed.caminos.Point(97,65),new aed.caminos.Point(97,64),new aed.caminos.Point(97,63),new aed.caminos.Point(98,63),new aed.caminos.Point(99,63),new aed.caminos.Point(99,62),new aed.caminos.Point(99,61),new aed.caminos.Point(99,60),new aed.caminos.Point(100,60),new aed.caminos.Point(101,60),new aed.caminos.Point(101,59),new aed.caminos.Point(102,59),new aed.caminos.Point(102,58),new aed.caminos.Point(103,58),new aed.caminos.Point(104,58),new aed.caminos.Point(105,58),new aed.caminos.Point(105,57),new aed.caminos.Point(106,57),new aed.caminos.Point(107,57),new aed.caminos.Point(107,56),new aed.caminos.Point(108,56),new aed.caminos.Point(109,56),new aed.caminos.Point(109,55),new aed.caminos.Point(110,55),new aed.caminos.Point(110,54),new aed.caminos.Point(111,54),new aed.caminos.Point(112,54),new aed.caminos.Point(112,53),new aed.caminos.Point(113,53),new aed.caminos.Point(113,52),new aed.caminos.Point(114,52),new aed.caminos.Point(114,51),new aed.caminos.Point(115,51),new aed.caminos.Point(116,51),new aed.caminos.Point(117,51),new aed.caminos.Point(118,51),new aed.caminos.Point(119,51),new aed.caminos.Point(120,51),new aed.caminos.Point(121,51),new aed.caminos.Point(122,51),new aed.caminos.Point(123,51),new aed.caminos.Point(124,51),new aed.caminos.Point(125,51),new aed.caminos.Point(126,51),new aed.caminos.Point(127,51),new aed.caminos.Point(127,50),new aed.caminos.Point(127,49),new aed.caminos.Point(128,49),new aed.caminos.Point(128,48),new aed.caminos.Point(129,48),new aed.caminos.Point(130,48),new aed.caminos.Point(130,47),new aed.caminos.Point(130,46),new aed.caminos.Point(131,46),new aed.caminos.Point(132,46),new aed.caminos.Point(133,46),new aed.caminos.Point(134,46),new aed.caminos.Point(135,46),new aed.caminos.Point(136,46),new aed.caminos.Point(136,45),new aed.caminos.Point(137,45),new aed.caminos.Point(138,45),new aed.caminos.Point(139,45),new aed.caminos.Point(140,45),new aed.caminos.Point(141,45),new aed.caminos.Point(142,45),new aed.caminos.Point(143,45),new aed.caminos.Point(144,45),new aed.caminos.Point(144,44),new aed.caminos.Point(145,44),new aed.caminos.Point(145,43),new aed.caminos.Point(146,43),new aed.caminos.Point(147,43),new aed.caminos.Point(148,43),new aed.caminos.Point(149,43),new aed.caminos.Point(150,43),new aed.caminos.Point(151,43),new aed.caminos.Point(152,43),new aed.caminos.Point(153,43),new aed.caminos.Point(154,43),new aed.caminos.Point(154,44),new aed.caminos.Point(155,44),new aed.caminos.Point(156,44),new aed.caminos.Point(157,44),new aed.caminos.Point(157,43),new aed.caminos.Point(158,43),new aed.caminos.Point(159,43),new aed.caminos.Point(160,43),new aed.caminos.Point(160,42),new aed.caminos.Point(160,41),new aed.caminos.Point(160,40),new aed.caminos.Point(160,39),new aed.caminos.Point(161,39),new aed.caminos.Point(161,38),new aed.caminos.Point(162,38),new aed.caminos.Point(163,38),new aed.caminos.Point(164,38),new aed.caminos.Point(164,37),new aed.caminos.Point(165,37),new aed.caminos.Point(166,37),new aed.caminos.Point(166,36),new aed.caminos.Point(166,35),new aed.caminos.Point(166,34),new aed.caminos.Point(166,33),new aed.caminos.Point(166,32),new aed.caminos.Point(167,32),new aed.caminos.Point(168,32),new aed.caminos.Point(169,32),new aed.caminos.Point(169,31),new aed.caminos.Point(169,30),new aed.caminos.Point(170,30),new aed.caminos.Point(171,30),new aed.caminos.Point(172,30),new aed.caminos.Point(173,30),new aed.caminos.Point(174,30),new aed.caminos.Point(174,29),new aed.caminos.Point(174,28),new aed.caminos.Point(174,27),new aed.caminos.Point(174,26),new aed.caminos.Point(174,25),new aed.caminos.Point(175,25),new aed.caminos.Point(175,24),new aed.caminos.Point(176,24),new aed.caminos.Point(176,23),new aed.caminos.Point(176,22),new aed.caminos.Point(176,21),new aed.caminos.Point(177,21),new aed.caminos.Point(177,20),new aed.caminos.Point(177,19),new aed.caminos.Point(177,18),new aed.caminos.Point(177,17),new aed.caminos.Point(177,16),new aed.caminos.Point(177,15),new aed.caminos.Point(177,14),new aed.caminos.Point(177,13),new aed.caminos.Point(178,13),new aed.caminos.Point(178,12),new aed.caminos.Point(178,11),new aed.caminos.Point(178,10),new aed.caminos.Point(178,9),new aed.caminos.Point(178,8),new aed.caminos.Point(178,7),new aed.caminos.Point(178,6),new aed.caminos.Point(177,6),new aed.caminos.Point(176,6),new aed.caminos.Point(176,5),new aed.caminos.Point(176,4),new aed.caminos.Point(175,4),new aed.caminos.Point(174,4),new aed.caminos.Point(173,4),new aed.caminos.Point(172,4),new aed.caminos.Point(171,4),new aed.caminos.Point(170,4),new aed.caminos.Point(170,5) }) ;
    return ok_sofar ;
  }



  static boolean test_22 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_22") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPathQuick(new aed.caminos.Point(125,113),new aed.caminos.Point(290,25)).doCall().checkResult(new aed.caminos.Point[] { new aed.caminos.Point(125,113),new aed.caminos.Point(125,112),new aed.caminos.Point(125,111),new aed.caminos.Point(126,111),new aed.caminos.Point(127,111),new aed.caminos.Point(128,111),new aed.caminos.Point(129,111),new aed.caminos.Point(130,111),new aed.caminos.Point(130,110),new aed.caminos.Point(131,110),new aed.caminos.Point(131,109),new aed.caminos.Point(131,108),new aed.caminos.Point(131,107),new aed.caminos.Point(131,106),new aed.caminos.Point(131,105),new aed.caminos.Point(131,104),new aed.caminos.Point(131,103),new aed.caminos.Point(131,102),new aed.caminos.Point(130,102),new aed.caminos.Point(130,101),new aed.caminos.Point(130,100),new aed.caminos.Point(130,99),new aed.caminos.Point(130,98),new aed.caminos.Point(130,97),new aed.caminos.Point(130,96),new aed.caminos.Point(130,95),new aed.caminos.Point(130,94),new aed.caminos.Point(130,93),new aed.caminos.Point(130,92),new aed.caminos.Point(130,91),new aed.caminos.Point(130,90),new aed.caminos.Point(130,89),new aed.caminos.Point(130,88),new aed.caminos.Point(130,87),new aed.caminos.Point(130,86),new aed.caminos.Point(130,85),new aed.caminos.Point(131,85),new aed.caminos.Point(132,85),new aed.caminos.Point(133,85),new aed.caminos.Point(134,85),new aed.caminos.Point(135,85),new aed.caminos.Point(135,84),new aed.caminos.Point(136,84),new aed.caminos.Point(137,84),new aed.caminos.Point(138,84),new aed.caminos.Point(139,84),new aed.caminos.Point(140,84),new aed.caminos.Point(141,84),new aed.caminos.Point(142,84),new aed.caminos.Point(143,84),new aed.caminos.Point(144,84),new aed.caminos.Point(145,84),new aed.caminos.Point(146,84),new aed.caminos.Point(146,83),new aed.caminos.Point(146,82),new aed.caminos.Point(147,82),new aed.caminos.Point(148,82),new aed.caminos.Point(149,82),new aed.caminos.Point(150,82),new aed.caminos.Point(151,82),new aed.caminos.Point(152,82),new aed.caminos.Point(152,81),new aed.caminos.Point(153,81),new aed.caminos.Point(154,81),new aed.caminos.Point(154,80),new aed.caminos.Point(155,80),new aed.caminos.Point(156,80),new aed.caminos.Point(157,80),new aed.caminos.Point(157,79),new aed.caminos.Point(158,79),new aed.caminos.Point(158,78),new aed.caminos.Point(158,77),new aed.caminos.Point(159,77),new aed.caminos.Point(160,77),new aed.caminos.Point(161,77),new aed.caminos.Point(162,77),new aed.caminos.Point(163,77),new aed.caminos.Point(164,77),new aed.caminos.Point(164,78),new aed.caminos.Point(164,79),new aed.caminos.Point(165,79),new aed.caminos.Point(166,79),new aed.caminos.Point(167,79),new aed.caminos.Point(167,80),new aed.caminos.Point(168,80),new aed.caminos.Point(169,80),new aed.caminos.Point(170,80),new aed.caminos.Point(171,80),new aed.caminos.Point(172,80),new aed.caminos.Point(173,80),new aed.caminos.Point(174,80),new aed.caminos.Point(175,80),new aed.caminos.Point(176,80),new aed.caminos.Point(177,80),new aed.caminos.Point(178,80),new aed.caminos.Point(179,80),new aed.caminos.Point(179,79),new aed.caminos.Point(180,79),new aed.caminos.Point(181,79),new aed.caminos.Point(182,79),new aed.caminos.Point(183,79),new aed.caminos.Point(183,78),new aed.caminos.Point(183,77),new aed.caminos.Point(184,77),new aed.caminos.Point(185,77),new aed.caminos.Point(185,76),new aed.caminos.Point(186,76),new aed.caminos.Point(186,75),new aed.caminos.Point(187,75),new aed.caminos.Point(188,75),new aed.caminos.Point(189,75),new aed.caminos.Point(189,74),new aed.caminos.Point(189,73),new aed.caminos.Point(190,73),new aed.caminos.Point(191,73),new aed.caminos.Point(192,73),new aed.caminos.Point(193,73),new aed.caminos.Point(193,72),new aed.caminos.Point(194,72),new aed.caminos.Point(194,71),new aed.caminos.Point(195,71),new aed.caminos.Point(195,70),new aed.caminos.Point(196,70),new aed.caminos.Point(197,70),new aed.caminos.Point(198,70),new aed.caminos.Point(199,70),new aed.caminos.Point(199,69),new aed.caminos.Point(200,69),new aed.caminos.Point(201,69),new aed.caminos.Point(202,69),new aed.caminos.Point(202,68),new aed.caminos.Point(202,67),new aed.caminos.Point(203,67),new aed.caminos.Point(204,67),new aed.caminos.Point(204,66),new aed.caminos.Point(205,66),new aed.caminos.Point(206,66),new aed.caminos.Point(207,66),new aed.caminos.Point(207,65),new aed.caminos.Point(207,64),new aed.caminos.Point(208,64),new aed.caminos.Point(208,63),new aed.caminos.Point(209,63),new aed.caminos.Point(210,63),new aed.caminos.Point(210,62),new aed.caminos.Point(210,61),new aed.caminos.Point(211,61),new aed.caminos.Point(211,60),new aed.caminos.Point(212,60),new aed.caminos.Point(213,60),new aed.caminos.Point(214,60),new aed.caminos.Point(214,59),new aed.caminos.Point(215,59),new aed.caminos.Point(215,58),new aed.caminos.Point(216,58),new aed.caminos.Point(217,58),new aed.caminos.Point(217,57),new aed.caminos.Point(217,56),new aed.caminos.Point(218,56),new aed.caminos.Point(219,56),new aed.caminos.Point(220,56),new aed.caminos.Point(221,56),new aed.caminos.Point(222,56),new aed.caminos.Point(223,56),new aed.caminos.Point(224,56),new aed.caminos.Point(225,56),new aed.caminos.Point(226,56),new aed.caminos.Point(227,56),new aed.caminos.Point(228,56),new aed.caminos.Point(229,56),new aed.caminos.Point(230,56),new aed.caminos.Point(231,56),new aed.caminos.Point(232,56),new aed.caminos.Point(233,56),new aed.caminos.Point(234,56),new aed.caminos.Point(235,56),new aed.caminos.Point(236,56),new aed.caminos.Point(237,56),new aed.caminos.Point(238,56),new aed.caminos.Point(239,56),new aed.caminos.Point(240,56),new aed.caminos.Point(241,56),new aed.caminos.Point(242,56),new aed.caminos.Point(243,56),new aed.caminos.Point(244,56),new aed.caminos.Point(245,56),new aed.caminos.Point(246,56),new aed.caminos.Point(247,56),new aed.caminos.Point(248,56),new aed.caminos.Point(249,56),new aed.caminos.Point(250,56),new aed.caminos.Point(251,56),new aed.caminos.Point(252,56),new aed.caminos.Point(253,56),new aed.caminos.Point(253,55),new aed.caminos.Point(254,55),new aed.caminos.Point(255,55),new aed.caminos.Point(256,55),new aed.caminos.Point(256,54),new aed.caminos.Point(257,54),new aed.caminos.Point(258,54),new aed.caminos.Point(259,54),new aed.caminos.Point(260,54),new aed.caminos.Point(260,53),new aed.caminos.Point(261,53),new aed.caminos.Point(262,53),new aed.caminos.Point(262,52),new aed.caminos.Point(263,52),new aed.caminos.Point(263,51),new aed.caminos.Point(264,51),new aed.caminos.Point(264,50),new aed.caminos.Point(265,50),new aed.caminos.Point(266,50),new aed.caminos.Point(266,49),new aed.caminos.Point(267,49),new aed.caminos.Point(268,49),new aed.caminos.Point(268,48),new aed.caminos.Point(269,48),new aed.caminos.Point(269,47),new aed.caminos.Point(269,46),new aed.caminos.Point(270,46),new aed.caminos.Point(270,45),new aed.caminos.Point(270,44),new aed.caminos.Point(271,44),new aed.caminos.Point(271,43),new aed.caminos.Point(272,43),new aed.caminos.Point(273,43),new aed.caminos.Point(274,43),new aed.caminos.Point(274,42),new aed.caminos.Point(274,41),new aed.caminos.Point(275,41),new aed.caminos.Point(275,40),new aed.caminos.Point(276,40),new aed.caminos.Point(277,40),new aed.caminos.Point(278,40),new aed.caminos.Point(278,39),new aed.caminos.Point(278,38),new aed.caminos.Point(278,37),new aed.caminos.Point(279,37),new aed.caminos.Point(280,37),new aed.caminos.Point(281,37),new aed.caminos.Point(282,37),new aed.caminos.Point(282,36),new aed.caminos.Point(282,35),new aed.caminos.Point(283,35),new aed.caminos.Point(284,35),new aed.caminos.Point(285,35),new aed.caminos.Point(285,34),new aed.caminos.Point(285,33),new aed.caminos.Point(285,32),new aed.caminos.Point(286,32),new aed.caminos.Point(286,31),new aed.caminos.Point(286,30),new aed.caminos.Point(286,29),new aed.caminos.Point(287,29),new aed.caminos.Point(287,28),new aed.caminos.Point(288,28),new aed.caminos.Point(288,27),new aed.caminos.Point(288,26),new aed.caminos.Point(288,25),new aed.caminos.Point(289,25),new aed.caminos.Point(290,25) }) ;
    return ok_sofar ;
  }



  static boolean test_23 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_23") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPathQuick(new aed.caminos.Point(150,13),new aed.caminos.Point(274,98)).doCall().checkResult(new aed.caminos.Point[] { new aed.caminos.Point(150,13),new aed.caminos.Point(151,13),new aed.caminos.Point(152,13),new aed.caminos.Point(153,13),new aed.caminos.Point(154,13),new aed.caminos.Point(154,14),new aed.caminos.Point(155,14),new aed.caminos.Point(156,14),new aed.caminos.Point(157,14),new aed.caminos.Point(158,14),new aed.caminos.Point(159,14),new aed.caminos.Point(159,15),new aed.caminos.Point(159,16),new aed.caminos.Point(160,16),new aed.caminos.Point(160,17),new aed.caminos.Point(161,17),new aed.caminos.Point(162,17),new aed.caminos.Point(163,17),new aed.caminos.Point(164,17),new aed.caminos.Point(164,16),new aed.caminos.Point(165,16),new aed.caminos.Point(166,16),new aed.caminos.Point(167,16),new aed.caminos.Point(168,16),new aed.caminos.Point(169,16),new aed.caminos.Point(170,16),new aed.caminos.Point(171,16),new aed.caminos.Point(172,16),new aed.caminos.Point(173,16),new aed.caminos.Point(173,17),new aed.caminos.Point(174,17),new aed.caminos.Point(174,18),new aed.caminos.Point(174,19),new aed.caminos.Point(175,19),new aed.caminos.Point(175,20),new aed.caminos.Point(175,21),new aed.caminos.Point(175,22),new aed.caminos.Point(175,23),new aed.caminos.Point(175,24),new aed.caminos.Point(175,25),new aed.caminos.Point(175,26),new aed.caminos.Point(175,27),new aed.caminos.Point(175,28),new aed.caminos.Point(175,29),new aed.caminos.Point(175,30),new aed.caminos.Point(175,31),new aed.caminos.Point(175,32),new aed.caminos.Point(175,33),new aed.caminos.Point(175,34),new aed.caminos.Point(175,35),new aed.caminos.Point(175,36),new aed.caminos.Point(175,37),new aed.caminos.Point(175,38),new aed.caminos.Point(175,39),new aed.caminos.Point(174,39),new aed.caminos.Point(174,40),new aed.caminos.Point(174,41),new aed.caminos.Point(174,42),new aed.caminos.Point(174,43),new aed.caminos.Point(174,44),new aed.caminos.Point(174,45),new aed.caminos.Point(174,46),new aed.caminos.Point(174,47),new aed.caminos.Point(174,48),new aed.caminos.Point(174,49),new aed.caminos.Point(174,50),new aed.caminos.Point(174,51),new aed.caminos.Point(174,52),new aed.caminos.Point(174,53),new aed.caminos.Point(174,54),new aed.caminos.Point(174,55),new aed.caminos.Point(174,56),new aed.caminos.Point(174,57),new aed.caminos.Point(174,58),new aed.caminos.Point(175,58),new aed.caminos.Point(175,59),new aed.caminos.Point(176,59),new aed.caminos.Point(177,59),new aed.caminos.Point(177,60),new aed.caminos.Point(177,61),new aed.caminos.Point(178,61),new aed.caminos.Point(178,62),new aed.caminos.Point(178,63),new aed.caminos.Point(179,63),new aed.caminos.Point(179,64),new aed.caminos.Point(180,64),new aed.caminos.Point(181,64),new aed.caminos.Point(182,64),new aed.caminos.Point(183,64),new aed.caminos.Point(184,64),new aed.caminos.Point(185,64),new aed.caminos.Point(185,65),new aed.caminos.Point(185,66),new aed.caminos.Point(185,67),new aed.caminos.Point(186,67),new aed.caminos.Point(187,67),new aed.caminos.Point(187,68),new aed.caminos.Point(187,69),new aed.caminos.Point(188,69),new aed.caminos.Point(189,69),new aed.caminos.Point(190,69),new aed.caminos.Point(191,69),new aed.caminos.Point(192,69),new aed.caminos.Point(193,69),new aed.caminos.Point(193,70),new aed.caminos.Point(194,70),new aed.caminos.Point(195,70),new aed.caminos.Point(196,70),new aed.caminos.Point(197,70),new aed.caminos.Point(198,70),new aed.caminos.Point(199,70),new aed.caminos.Point(200,70),new aed.caminos.Point(201,70),new aed.caminos.Point(202,70),new aed.caminos.Point(203,70),new aed.caminos.Point(204,70),new aed.caminos.Point(205,70),new aed.caminos.Point(205,71),new aed.caminos.Point(206,71),new aed.caminos.Point(207,71),new aed.caminos.Point(208,71),new aed.caminos.Point(209,71),new aed.caminos.Point(209,72),new aed.caminos.Point(209,73),new aed.caminos.Point(210,73),new aed.caminos.Point(211,73),new aed.caminos.Point(212,73),new aed.caminos.Point(213,73),new aed.caminos.Point(214,73),new aed.caminos.Point(215,73),new aed.caminos.Point(216,73),new aed.caminos.Point(217,73),new aed.caminos.Point(218,73),new aed.caminos.Point(219,73),new aed.caminos.Point(220,73),new aed.caminos.Point(221,73),new aed.caminos.Point(222,73),new aed.caminos.Point(223,73),new aed.caminos.Point(224,73),new aed.caminos.Point(225,73),new aed.caminos.Point(226,73),new aed.caminos.Point(227,73),new aed.caminos.Point(228,73),new aed.caminos.Point(229,73),new aed.caminos.Point(230,73),new aed.caminos.Point(231,73),new aed.caminos.Point(232,73),new aed.caminos.Point(233,73),new aed.caminos.Point(234,73),new aed.caminos.Point(235,73),new aed.caminos.Point(236,73),new aed.caminos.Point(237,73),new aed.caminos.Point(238,73),new aed.caminos.Point(239,73),new aed.caminos.Point(240,73),new aed.caminos.Point(241,73),new aed.caminos.Point(241,72),new aed.caminos.Point(242,72),new aed.caminos.Point(243,72),new aed.caminos.Point(243,73),new aed.caminos.Point(244,73),new aed.caminos.Point(245,73),new aed.caminos.Point(246,73),new aed.caminos.Point(247,73),new aed.caminos.Point(248,73),new aed.caminos.Point(249,73),new aed.caminos.Point(250,73),new aed.caminos.Point(251,73),new aed.caminos.Point(252,73),new aed.caminos.Point(253,73),new aed.caminos.Point(254,73),new aed.caminos.Point(255,73),new aed.caminos.Point(256,73),new aed.caminos.Point(257,73),new aed.caminos.Point(258,73),new aed.caminos.Point(258,74),new aed.caminos.Point(259,74),new aed.caminos.Point(260,74),new aed.caminos.Point(261,74),new aed.caminos.Point(261,75),new aed.caminos.Point(262,75),new aed.caminos.Point(263,75),new aed.caminos.Point(264,75),new aed.caminos.Point(264,76),new aed.caminos.Point(264,77),new aed.caminos.Point(265,77),new aed.caminos.Point(265,78),new aed.caminos.Point(265,79),new aed.caminos.Point(265,80),new aed.caminos.Point(266,80),new aed.caminos.Point(267,80),new aed.caminos.Point(268,80),new aed.caminos.Point(268,81),new aed.caminos.Point(269,81),new aed.caminos.Point(270,81),new aed.caminos.Point(271,81),new aed.caminos.Point(271,82),new aed.caminos.Point(272,82),new aed.caminos.Point(272,83),new aed.caminos.Point(272,84),new aed.caminos.Point(272,85),new aed.caminos.Point(272,86),new aed.caminos.Point(272,87),new aed.caminos.Point(272,88),new aed.caminos.Point(272,89),new aed.caminos.Point(272,90),new aed.caminos.Point(272,91),new aed.caminos.Point(273,91),new aed.caminos.Point(273,92),new aed.caminos.Point(273,93),new aed.caminos.Point(273,94),new aed.caminos.Point(273,95),new aed.caminos.Point(273,96),new aed.caminos.Point(274,96),new aed.caminos.Point(274,97),new aed.caminos.Point(274,98) }) ;
    return ok_sofar ;
  }



  static boolean test_24 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_24") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterGrafosGrandes.BestPathQuick(new aed.caminos.Point(289,128),new aed.caminos.Point(124,49)).doCall().checkResult(new aed.caminos.Point[] { new aed.caminos.Point(289,128),new aed.caminos.Point(288,128),new aed.caminos.Point(287,128),new aed.caminos.Point(286,128),new aed.caminos.Point(285,128),new aed.caminos.Point(284,128),new aed.caminos.Point(283,128),new aed.caminos.Point(283,127),new aed.caminos.Point(282,127),new aed.caminos.Point(281,127),new aed.caminos.Point(281,126),new aed.caminos.Point(280,126),new aed.caminos.Point(280,125),new aed.caminos.Point(279,125),new aed.caminos.Point(278,125),new aed.caminos.Point(277,125),new aed.caminos.Point(276,125),new aed.caminos.Point(275,125),new aed.caminos.Point(274,125),new aed.caminos.Point(273,125),new aed.caminos.Point(272,125),new aed.caminos.Point(271,125),new aed.caminos.Point(270,125),new aed.caminos.Point(269,125),new aed.caminos.Point(268,125),new aed.caminos.Point(267,125),new aed.caminos.Point(266,125),new aed.caminos.Point(266,124),new aed.caminos.Point(265,124),new aed.caminos.Point(264,124),new aed.caminos.Point(264,123),new aed.caminos.Point(264,122),new aed.caminos.Point(264,121),new aed.caminos.Point(264,120),new aed.caminos.Point(264,119),new aed.caminos.Point(264,118),new aed.caminos.Point(264,117),new aed.caminos.Point(264,116),new aed.caminos.Point(264,115),new aed.caminos.Point(264,114),new aed.caminos.Point(263,114),new aed.caminos.Point(263,113),new aed.caminos.Point(262,113),new aed.caminos.Point(262,112),new aed.caminos.Point(261,112),new aed.caminos.Point(260,112),new aed.caminos.Point(259,112),new aed.caminos.Point(259,111),new aed.caminos.Point(259,110),new aed.caminos.Point(258,110),new aed.caminos.Point(258,109),new aed.caminos.Point(258,108),new aed.caminos.Point(258,107),new aed.caminos.Point(257,107),new aed.caminos.Point(257,106),new aed.caminos.Point(257,105),new aed.caminos.Point(257,104),new aed.caminos.Point(256,104),new aed.caminos.Point(255,104),new aed.caminos.Point(254,104),new aed.caminos.Point(253,104),new aed.caminos.Point(253,103),new aed.caminos.Point(252,103),new aed.caminos.Point(252,102),new aed.caminos.Point(251,102),new aed.caminos.Point(250,102),new aed.caminos.Point(250,101),new aed.caminos.Point(250,100),new aed.caminos.Point(250,99),new aed.caminos.Point(249,99),new aed.caminos.Point(248,99),new aed.caminos.Point(247,99),new aed.caminos.Point(246,99),new aed.caminos.Point(245,99),new aed.caminos.Point(244,99),new aed.caminos.Point(244,98),new aed.caminos.Point(243,98),new aed.caminos.Point(242,98),new aed.caminos.Point(241,98),new aed.caminos.Point(240,98),new aed.caminos.Point(239,98),new aed.caminos.Point(238,98),new aed.caminos.Point(238,97),new aed.caminos.Point(237,97),new aed.caminos.Point(237,96),new aed.caminos.Point(237,95),new aed.caminos.Point(236,95),new aed.caminos.Point(236,94),new aed.caminos.Point(235,94),new aed.caminos.Point(234,94),new aed.caminos.Point(233,94),new aed.caminos.Point(232,94),new aed.caminos.Point(231,94),new aed.caminos.Point(230,94),new aed.caminos.Point(229,94),new aed.caminos.Point(228,94),new aed.caminos.Point(227,94),new aed.caminos.Point(226,94),new aed.caminos.Point(225,94),new aed.caminos.Point(224,94),new aed.caminos.Point(223,94),new aed.caminos.Point(222,94),new aed.caminos.Point(222,93),new aed.caminos.Point(221,93),new aed.caminos.Point(221,92),new aed.caminos.Point(221,91),new aed.caminos.Point(220,91),new aed.caminos.Point(220,90),new aed.caminos.Point(219,90),new aed.caminos.Point(219,89),new aed.caminos.Point(218,89),new aed.caminos.Point(218,88),new aed.caminos.Point(217,88),new aed.caminos.Point(217,87),new aed.caminos.Point(217,86),new aed.caminos.Point(216,86),new aed.caminos.Point(216,85),new aed.caminos.Point(215,85),new aed.caminos.Point(215,84),new aed.caminos.Point(215,83),new aed.caminos.Point(214,83),new aed.caminos.Point(213,83),new aed.caminos.Point(213,82),new aed.caminos.Point(213,81),new aed.caminos.Point(212,81),new aed.caminos.Point(211,81),new aed.caminos.Point(211,80),new aed.caminos.Point(210,80),new aed.caminos.Point(209,80),new aed.caminos.Point(208,80),new aed.caminos.Point(207,80),new aed.caminos.Point(207,79),new aed.caminos.Point(207,78),new aed.caminos.Point(206,78),new aed.caminos.Point(206,77),new aed.caminos.Point(206,76),new aed.caminos.Point(205,76),new aed.caminos.Point(205,75),new aed.caminos.Point(205,74),new aed.caminos.Point(205,73),new aed.caminos.Point(205,72),new aed.caminos.Point(205,71),new aed.caminos.Point(205,70),new aed.caminos.Point(204,70),new aed.caminos.Point(203,70),new aed.caminos.Point(202,70),new aed.caminos.Point(201,70),new aed.caminos.Point(200,70),new aed.caminos.Point(199,70),new aed.caminos.Point(198,70),new aed.caminos.Point(197,70),new aed.caminos.Point(196,70),new aed.caminos.Point(195,70),new aed.caminos.Point(194,70),new aed.caminos.Point(193,70),new aed.caminos.Point(193,69),new aed.caminos.Point(192,69),new aed.caminos.Point(191,69),new aed.caminos.Point(190,69),new aed.caminos.Point(189,69),new aed.caminos.Point(188,69),new aed.caminos.Point(187,69),new aed.caminos.Point(187,68),new aed.caminos.Point(187,67),new aed.caminos.Point(186,67),new aed.caminos.Point(185,67),new aed.caminos.Point(185,66),new aed.caminos.Point(185,65),new aed.caminos.Point(184,65),new aed.caminos.Point(183,65),new aed.caminos.Point(182,65),new aed.caminos.Point(181,65),new aed.caminos.Point(180,65),new aed.caminos.Point(179,65),new aed.caminos.Point(178,65),new aed.caminos.Point(177,65),new aed.caminos.Point(176,65),new aed.caminos.Point(175,65),new aed.caminos.Point(175,66),new aed.caminos.Point(174,66),new aed.caminos.Point(173,66),new aed.caminos.Point(172,66),new aed.caminos.Point(172,67),new aed.caminos.Point(171,67),new aed.caminos.Point(170,67),new aed.caminos.Point(169,67),new aed.caminos.Point(168,67),new aed.caminos.Point(168,66),new aed.caminos.Point(167,66),new aed.caminos.Point(166,66),new aed.caminos.Point(165,66),new aed.caminos.Point(164,66),new aed.caminos.Point(164,67),new aed.caminos.Point(163,67),new aed.caminos.Point(162,67),new aed.caminos.Point(161,67),new aed.caminos.Point(160,67),new aed.caminos.Point(159,67),new aed.caminos.Point(159,66),new aed.caminos.Point(159,65),new aed.caminos.Point(158,65),new aed.caminos.Point(157,65),new aed.caminos.Point(156,65),new aed.caminos.Point(155,65),new aed.caminos.Point(154,65),new aed.caminos.Point(154,64),new aed.caminos.Point(153,64),new aed.caminos.Point(152,64),new aed.caminos.Point(151,64),new aed.caminos.Point(150,64),new aed.caminos.Point(149,64),new aed.caminos.Point(149,63),new aed.caminos.Point(148,63),new aed.caminos.Point(147,63),new aed.caminos.Point(146,63),new aed.caminos.Point(145,63),new aed.caminos.Point(145,62),new aed.caminos.Point(144,62),new aed.caminos.Point(143,62),new aed.caminos.Point(142,62),new aed.caminos.Point(142,61),new aed.caminos.Point(141,61),new aed.caminos.Point(141,60),new aed.caminos.Point(140,60),new aed.caminos.Point(139,60),new aed.caminos.Point(138,60),new aed.caminos.Point(138,59),new aed.caminos.Point(137,59),new aed.caminos.Point(137,58),new aed.caminos.Point(137,57),new aed.caminos.Point(136,57),new aed.caminos.Point(136,56),new aed.caminos.Point(135,56),new aed.caminos.Point(134,56),new aed.caminos.Point(133,56),new aed.caminos.Point(132,56),new aed.caminos.Point(131,56),new aed.caminos.Point(130,56),new aed.caminos.Point(129,56),new aed.caminos.Point(129,55),new aed.caminos.Point(129,54),new aed.caminos.Point(128,54),new aed.caminos.Point(127,54),new aed.caminos.Point(127,53),new aed.caminos.Point(127,52),new aed.caminos.Point(127,51),new aed.caminos.Point(126,51),new aed.caminos.Point(126,50),new aed.caminos.Point(126,49),new aed.caminos.Point(125,49),new aed.caminos.Point(124,49) }) ;
    return ok_sofar ;
  }

}













static class TestUtils {
  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static void printWarning(String TestName) {
      System.out.println("\n*** Warning in "+TestName+":");
  }

  static void printError(String TestName) {
      System.out.println("\n\n***********************************************");
      System.out.println("*** Error in "+TestName+":");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

  static void printCallException(ExecutionTime time, String msg, Throwable exc) {
      System.out.println("\n\n***********************************************");
      System.out.println("*** Error in "+TestData.testName+": ");

      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        System.out.print(callSeqString(traceLength,time)+"\n");
	  System.out.println(TestData.getTrace());
      }

      switch (time) {
      case AFTER:
	  System.out.println("the call to "+msg+" raised the exception "+exc+
			     " although it should not have\n");
	  break;
      default:
	  System.out.println("the exception "+exc+" was raised although it "+
			     "should not have been\n");
	  break;
      }
      exc.printStackTrace();
    }

  static void printCallException(String msg, Throwable exc) {
    printCallException(ExecutionTime.AFTER,msg,exc);
  }

  static void printCallException(Throwable exc) {
    printCallException(ExecutionTime.LAST,"",exc);
  }

  static void printWarning(ExecutionTime time, String msg) {
    System.out.println("\n\n***********************************************");
    if (TestData.testName != "") {
      System.out.println("\n*** Warning for "+TestData.testName+": ");
    } else
      System.out.println("\n*** Warning:");

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();
    
      if (traceLength > 0) {
        System.out.print(callSeqString(traceLength,time)+"\n");
        System.out.println(TestData.getTrace());
      }
    }
    
    System.out.println(msg+"\n");
  }

  static void printError(ExecutionTime time, String msg) {
      System.out.println("\n\n***********************************************");
      System.out.println("*** Error in "+TestData.testName+":\n");

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();
      
      if (traceLength > 0) {
        System.out.print(callSeqString(traceLength,time)+"\n");
        System.out.println(TestData.getTrace());
      }
    }
      
    System.out.println(msg+"\n");
  }

  static String callSeqString(int traceLength, ExecutionTime time) {
    if (traceLength < 2)
      return "while executing the call ";
    else {
      switch(time) {
      case AFTER:
	  return "after executing the call sequence ";
      case LAST:
	  return "while executing the last statement of call sequence ";
      case DURING:
	  return "while executing the call sequence ";
      case UNRELATED:
	  return "";
      }
      return "";
    }
  }

  // Try to determine whether the starterName method is recursive.
  // If the bcel library is not available, fail with a message
  // indicating that no analysis was done. 
    @SuppressWarnings({"unchecked","rawtypes"}) 
    static boolean checkRecursive(Class cl, String packageName, String className, String starterName, int arity) {
    try {
      ClassLoader loader = 
	cl.getClassLoader();
      String classLocation = 
	loader.getResource
        (new String(packageName+"."+className).replace('.','/')+".class")
        .getFile();
    
      java.lang.Class classParserClass =
	java.lang.Class.forName("org.apache.bcel.classfile.ClassParser");
      java.lang.reflect.Constructor classParserConstructor =
	classParserClass.getConstructor(classLocation.getClass());
      java.lang.reflect.Method parse =
	classParserClass.getMethod("parse");

      Object cp = null;
      Object jc = null;
    
      cp = classParserConstructor.newInstance(classLocation);
      jc = parse.invoke(cp);

      Hashtable<Pair<String,Integer>,HashSet<Pair<String,Integer>>> calls =
        new Hashtable<Pair<String,Integer>,HashSet<Pair<String,Integer>>>();

      java.lang.Class ccfgClass =
	java.lang.Class.forName(packageName+".ClassCFG");
      java.lang.reflect.Constructor ccfgConstructor =
	ccfgClass.getConstructor(jc.getClass(), calls.getClass());

      Object ccfg = ccfgConstructor.newInstance(jc, calls);
      java.lang.reflect.Method start = ccfgClass.getMethod("start");
      start.invoke(ccfg);

      boolean result = 
        isRecursive
        (new Pair<String,Integer>
         (packageName+"."+className+"."+starterName,arity),
         new HashSet<Pair<String,Integer>>(),
         calls);
      
      if (!result)
	System.out.println
	  ("\nWARNING: La implementacion de "+starterName+
	   " no parece recursivo aunque es OBLIGATORIO "+
	   "-- compruebalo manualmente!\n");

      try {
        java.lang.Class rhClass =
          java.lang.Class.forName(packageName+".ResultsHandler");
        java.lang.reflect.Field completedAnalysis =
          rhClass.getField("completedAnalysis");
        completedAnalysis.setBoolean(null,true);
      } catch (Throwable texc) { };

      return result;
    } catch (Throwable exc) {
        /*
          System.out.println
          ("\nnot checking recursion: cannot read RecursiveMethods classfile");
          exc.printStackTrace();
        */
      return true;
    }
  }

  static boolean isRecursive(Pair<String,Integer> current,
			     HashSet<Pair<String,Integer>> seen,
			     Hashtable<Pair<String,Integer>,HashSet<Pair<String,Integer>>> calls) {
    if (seen.contains(current)) {
      return true;
    }
    
    HashSet<Pair<String,Integer>> nexts = calls.get(current);
    seen.add(current);
    
    if (nexts == null) return false;
    else {
      for (Pair<String,Integer> next : nexts)
	if (isRecursive(next,seen,calls)) return true;
    }
    
    return false;
  }

  static <E> PositionList<E> extractElementsFromIterable(String callString, Iterable<E> i) {
    if (i == null) {
      printError
        (ExecutionTime.UNRELATED,
         "the call "+callString+
         " returned an null iterable");
      return null;
    }

    PositionList<E> l = new NodePositionList<E>();

    try {
      Iterator<E> it = i.iterator();
      while (it.hasNext()) {
        l.addLast(it.next());
      }
    } catch (Throwable exc) {
      printError
        (ExecutionTime.UNRELATED,
         "the call "+callString+
         " returned an iterable which when used raised the exception "+
         exc);
      exc.printStackTrace();
      return null;
    }
    return l;
  }

  static <E> boolean iterableCorrect(String callString, E[] original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    if (l == null) return false;

    boolean correct = (original.length == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      for (int j=0; j<original.length; j++) {
        if (original[j] == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && original[j].equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
      }
    }
   
    if (!correct) {
      printError
        (ExecutionTime.UNRELATED,
         "the call "+callString+
         " returned an iterable with the elements "+l+
         " but should have returned the elements "+printArray(original));
      return false;
    } else return true;
  }

  static <E> boolean unChanged(String callString, E[] original, PositionList<E> l) {
      boolean ok_sofar = true;
      
      if (l.size() != original.length) {
	  ok_sofar = false;
      }

      Position<E> lPos = l.first();
      int i=0;
      while (ok_sofar && lPos != null) {
	  E elem = lPos.element();

	  if (elem == null) ok_sofar = (original[i] == null);
	  else ok_sofar = elem.equals(original[i]);

	  lPos = l.next(lPos);
	  ++i;
      }

      if (!ok_sofar) {
	  printError
	      (ExecutionTime.UNRELATED,
	       "the call "+callString+
	       " has modified the input list "+printArray(original)+
	       "; it has now the elements "+l);
	  return ok_sofar;
      }
      return ok_sofar;
  }

  static <E> boolean unChanged(String callString, E[] original, E[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  if (newer[i] == null) ok_sofar = (original[i] == null);
	  else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
	  printError
	      (ExecutionTime.UNRELATED,
	       "the call "+callString+
	       " has modified the input array "+printArray(original)+
	       "; it has now the elements "+printArray(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  static String printArray(Object[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  static String printArray(int[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  public static <T> PositionList<T> toPositionList(T[] arr) {
    NodePositionList<T> l = new NodePositionList<T>();
    for (int i=0; i<arr.length; i++)
      l.addLast(arr[i]);
    return l;
  }

  public static <T> IndexedList<T> toIndexedList(T[] arr) {
    ArrayIndexedList<T> l = new ArrayIndexedList<T>();
    for (int i=0; i<arr.length; i++)
      l.add(0,arr[i]);
    return l;
  }
  
}

interface TestResult<E,F> {
  boolean isException();
  Throwable getException();
  E getValue();
  boolean checkResult(F expected);
}

static class Result<E,F> implements TestResult<E,F> {
  private boolean isException;
  private Throwable exception;
  private E value;
  Call<E,F> call;

  public static <E,F> Result<E,F> result(E e, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = false;
    result.value = e;
    result.call = call;
    return result;
  }
  
  public static <E,F> Result<E,F> exception(Throwable exception, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = true;
    result.exception = exception;
    result.call = call;
    return result;
  }
  
  public boolean isException() {
    return isException;
  }

  public Throwable getException() {
    if (!isException()) {
      System.out.println("*** Internal model error: calling getException() without exception");
      throw new RuntimeException();
    }
    return exception;
  }

  public E getValue() {
    if (isException())
      throw new RuntimeException();
    return value;
  }
  
  Call<E,F> getCall() {
    return call;
  }

  public boolean checkResult(F expected) {
    try {
      return getCall().checkResult(expected);
    } catch (Throwable exc) {
      System.out.println("\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      exc.printStackTrace();
      System.out.println("\n");
      throw new RuntimeException();
    }
  }

  public String toString() {
    if (isException())
      return getCall() + " -> " + getException();
    else
      return getCall() + " -> " + getValue();      
  }
}

interface Call<E,F> {
  TestResult<E,F> doCall();
  String toString();
  boolean checkResult(F expected);
}

static abstract class TestCall<E,F> implements Call<E,F> {
  TestResult<E,F> result;
  boolean hasCalled;

  public TestResult<E,F> doCall() {
    if (hasCalled())
      throw new RuntimeException();

    hasCalled = true;
    TestData.addCallToTrace(this.toString());
    
    try {
      E e = call();
      result = Result.result(e,this);
    } catch (Throwable exception) {
      result = Result.exception(exception,this);
    }
    return result;
  }

  abstract E call() throws Exception;

  boolean hasCalled() {
    return hasCalled;
  }

  boolean noException() {
    if (result.isException()) {
      TestUtils.printCallException(result.getException());
      return false;
    }

    return true;
  }

  boolean throwsException(String expectedName) {
    if (!result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown an exception, "+
         "but returned the value "+result.getValue());
      return false;
    }

    Throwable exception = result.getException();
    if (!expectedName.equals(exception.getClass().getCanonicalName())) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown the exception "+
         expectedName+
         ", but throwed the exception "+exception);
      exception.printStackTrace();
      return false;
    }

    return true;
  }

  boolean nonNull() {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n");
      return false;
    } else return true;
  }

  boolean fresh(Object obj) {
    return fresh(result.getValue(),obj);
  }

  boolean fresh(Object obj1, Object obj2) {
    if (obj1 == obj2) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned an object\n"+obj1+
         "\nwhich is the same as an argument object; "+
         "a FRESH object should have been returned\n");
      return false;
    } else return true;
  }

  boolean unChanged(Object obj1, Object obj2) {
    if (!(obj1.equals(obj2))) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " changed an object parameter \n"+obj2+
         "\nwhich should not have been changed\n");
      return false;
    } else return true;
  }

  boolean setsMatch(Object expected) {
    if (!noException())
      return false;

    if (!(expected instanceof Iterable<?>)) {
      System.out.println("Cannot iterate over expected value "+expected);
      throw new RuntimeException();
    }
    Iterable<?> ev = (Iterable<?>) expected;

    E value = result.getValue();
    if (!(value instanceof Iterable<?>)) {
      System.out.println("Cannot iterate over result value "+value);
      throw new RuntimeException();
    }
    Iterable<?> iv = (Iterable<?>) value;

    HashSet<Object> ts1 = new HashSet<Object>();
    HashSet<Object> ts2 = new HashSet<Object>();


    for (Object s1 : iv)
      ts1.add(s1);
    for (Object s2 : ev)
      ts2.add(s2);
    
    if (!ts1.equals(ts2)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned a value\n"+value+
         "\nwhich does not contain the same elements as the expected answer"+
         "\n"+expected);
      return false;
    }

    return true;
  }

  boolean valuesMatch(Object expected) {
    if (!noException())
      return false;

    if (result.isException()) {
      TestUtils.printCallException(result.getException());
      return false;
    }

    E value = result.getValue();

    if (value == null) {
      if (expected != null) {
        TestUtils.printError
          (TestUtils.ExecutionTime.LAST,
           "\nthe call to "+this+" returned null, "+
           "but should have returned "+expected);
        return false;
      }
      else return true;
    }

    if (!value.equals(expected)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" returned "+value+
         ", but should have returned "+expected);
      return false;
    }

    return true;
  }

  public boolean checkResult(F expected) {
    if (!hasCalled())
      throw new RuntimeException();

    return valuesMatch(expected);
  }
}

 























static class BestPath extends TestCall<PositionList<Point>,Pair<Point[],Integer>> {
  Integer[][] map;
  int rows;
  int cols;
  Point fromPoint;
  Point toPoint;
  Transportistas t;
  
  public BestPath(Integer[][] map, Point fromPoint, Point toPoint) {
    this.map = map;
    this.rows = map[0].length;
    this.cols = map.length;
    this.fromPoint = fromPoint;
    this.toPoint = toPoint;
  }
  
  @Override
  public String toString() {
    return
      "g.bestPathFromTo(new Point"+fromPoint+",new Point"+toPoint+") with the graph g constructed from the map\n"
      +aed.caminos.TesterLab7.TransportistasChecker.printMap(map,cols,rows);
  }
  
  @Override
  public PositionList<Point> call() {
    t = new Transportistas(map);
    return t.bestPathFromTo(fromPoint,toPoint);
  }
  
  @Override
  @SuppressWarnings({"unchecked","rawtypes"})
  public boolean checkResult(Pair<Point[],Integer> pair) {
    Point[] bestPath = pair.getLeft();
    Integer bestCost = pair.getRight();
    
    if (!noException())
      return false;

    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "the returned path is null\n");
      return false;
    }

    DirectedGraph<Point,Integer> graph = null;

    try {
      Field graphField;
      graphField = t.getClass().getDeclaredField("graph");
      graphField.setAccessible(true);
      graph = (DirectedGraph<Point,Integer>) graphField.get(t);
    } catch ( Throwable exc ) {
      TestUtils.printCallException
	(TestUtils.ExecutionTime.LAST,
	 "cannot access the field graph: ",
	 exc);
      return false;
    }

    if (graph == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "the graph g is null\n");
      return false;
    }

    // Before calling out to TesterLab7 we have to set its context
    aed.caminos.TesterLab7.TestData.setContext
      (TestData.getTestName(),
       TestData.getRawTrace());

    aed.caminos.TesterLab7.GraphAnalysis ga =
      aed.caminos.TesterLab7.GraphAnalysis.checkGraph(t,map,graph,rows,cols);
    PositionList<Point> path = result.getValue();

    if (ga == null) return false;
    else return ga.checkPath(fromPoint,toPoint,path,bestCost,bestPath);
  }
}

static class BestPathQuick extends TestCall<PositionList<Point>,Point[]> {
  int cols;
  int rows;
  Point p0;
  Point p1;
  static AltitudeMap map = null;
  Transportistas t = null;
  
  public BestPathQuick(Point p0, Point p1) {
    this.p0 = p0;
    this.p1 = p1;
    if (map == null) {
      // String currentDir = System.getProperty("user.dir");
      // System.out.println("Current dir using System:" +currentDir);
      map =
        AltitudeMap.readFromDisk
        ("toledo.map","src/toledo.map","src/aed/caminos/toledo.map","../../toledo.map","../toledo.map");
    } else {
      System.out.println("map is "+map);    
    }
    this.cols = map.getCols();
    this.rows = map.getRows();
    System.out.println("Using a map of dimensions "+cols+"x"+rows);
  }

  @Override
  public String toString() {
    return "bestPathFromTo(new Point("+p0+"),new Point("+p1+"))";
  }
  
  @Override
  public PositionList<Point> call() {
    t = new Transportistas(map.getAltitude2DData());
    return t.bestPathFromTo(p0,p1);
  }

  @Override
  public boolean checkResult(Point[] bestPath) {
    if (!noException() || !nonNull())
      return false;

    DirectedGraph<Point,Integer> graph = null;
    try {
      Field graphField;
      graphField = t.getClass().getDeclaredField("graph");
      graphField.setAccessible(true);
      graph = (DirectedGraph<Point,Integer>) graphField.get(t);
    } catch ( Throwable exc ) {
      TestUtils.printCallException
	(TestUtils.ExecutionTime.LAST,
	 "cannot access the field graph: ",
	 exc);
      return false;
    }
    
    if (graph == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "the resulting graph is null\n");
      return false;
    }

    // Before calling out to TesterLab7 we have to set its context
    aed.caminos.TesterLab7.TestData.setContext
      (TestData.getTestName(),
       TestData.getRawTrace());

    aed.caminos.TesterLab7.GraphAnalysis ga =
      aed.caminos.TesterLab7.GraphAnalysis.checkGraph(t,map.getAltitude2DData(),graph,rows,cols);
    PositionList<Point> path = result.getValue();

    if (ga == null) return false;

    int bestCost = 0;
    
    int i = 0;
    if (bestPath.length > 1) {
      Point pFrom = bestPath[i++];
      while (i < bestPath.length) {
        Point pTo = bestPath[i++];
        Vertex<Point> vFrom = ga.points2vertices.get(pFrom);
        Vertex<Point> vTo = ga.points2vertices.get(pTo);
        Integer cost = findTransitionCost(graph,vFrom,vTo);
        bestCost += cost;
        pFrom = pTo;
      }
    }

    boolean pathCheck = ga.checkPath(p0,p1,path,bestCost,bestPath);
    if (!pathCheck) {
      System.out.println("\nShowing the correct and incorrect (the lighter one) paths");
      displayPathsAndMap(bestPath,path,map);
    }
    return pathCheck;
  }

  static void displayPathsAndMap(Point[] bestPath,
                                 PositionList<Point> path,
                                 AltitudeMap map) {
    JFrame fr = new JFrame("Counterexample map");
    fr.addWindowListener
      (new WindowAdapter() {
          @Override
          public void windowClosing(WindowEvent windowEvent) {
            ResultsHandler.waitForThreads.countDown();
          }
        });
    fr.add(new PaintAltitudeMap(map,bestPath,path,3,3));
    fr.setSize(map.getCols()*3,
               map.getRows()*3);
    ResultsHandler.waitForThreads =
      new CountDownLatch(1);
    fr.setVisible(true);
  }

  static Integer findTransitionCost(DirectedGraph<Point,Integer> g, Vertex<Point> from, Vertex<Point> to) {
    for (Edge<Integer> e : g.outgoingEdges(from)) {
      if (g.endVertex(e) == to)
        return e.element();
    }
    return null;
  }
}


static class AltitudeMap {
  private int rows;
  private int cols;
  private int minAltitude;
  private int maxAltitude;
  private Integer[] altitudeData;
  
  public AltitudeMap(Integer[] altitudeData, int rows, int cols) {
    this.rows = rows;
    this.cols = cols;
    minAltitude = 10000000;
    maxAltitude = -1000000;
    this.altitudeData = altitudeData;

    for (int altitude : altitudeData) {
      if (altitude < minAltitude) {
        minAltitude = altitude;
      }
      if (altitude > maxAltitude) {
        maxAltitude = altitude;
      }
    }
  }

  Integer[] getAltitudeData() {
    return altitudeData;
  }

  Integer[][] getAltitude2DData() {
    Integer[][] altitudeData = new Integer[cols][rows];
    int counter=0;
    for (int i=0; i<rows; i++)
      for (int j=0; j<cols; j++)
        altitudeData[j][i] = this.altitudeData[counter++];
    return altitudeData;
  }

  int getMinAltitude() {
    return minAltitude;
  }

  int getMaxAltitude() {
    return maxAltitude;
  }

  Integer getAltitude(Point point) {
    return altitudeData[point.getY()*cols+point.getX()];
  }

  public int getRows() {
    return rows;
  }

  public int getCols() {
    return cols;
  }

  public AltitudeMap reduceAltitudeMap(int yDivisor, int xDivisor) {
    int newNRows = rows / yDivisor;
    int newNCols = cols / xDivisor;
    System.out.println
      ("reducing map: dimensions was "+rows+" rows and "+cols+" columns; "+
       "now is "+newNRows+" rows and "+newNCols+" columns");
    Integer[] newAltitudeMap = new Integer[newNRows*newNCols];
    int counter = 0;
    for (int row=0; row<yDivisor*newNRows; row++) {
      for (int col=0; col<xDivisor*newNCols; col++) {
        if (((row % yDivisor) == 0) && ((col % xDivisor) == 0)) {
          try {
            newAltitudeMap[counter++] = altitudeData[row*cols+col];
          } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("exception at row="+row+" col="+col+
                               " array size="+altitudeData.length+
                               " counter="+counter+
                               " (max size="+newAltitudeMap.length+")");
            throw new RuntimeException();
          }
        }
      }
    }
    return new AltitudeMap(newAltitudeMap, newNRows, newNCols);
  }

  public static AltitudeMap readAltitudeMap(String fileName) {
    Scanner sc = null;
    try {
      sc = new Scanner(new File(fileName));
    } catch (FileNotFoundException exc) {
      System.out.println("*** Error: file "+fileName+" not found");
      System.exit(-1);
    }
    
    sc.next("NCOLS");
    int nCols = sc.nextInt();
    sc.next("NROWS");
    int nRows = sc.nextInt();
    sc.next("XLLCENTER");
    int xCenter = sc.nextInt();
    sc.next("YLLCENTER");
    int yCenter = sc.nextInt();
    sc.next("CELLSIZE");
    int cellSize = sc.nextInt();
    sc.next("NODATA_VALUE");
    int noDataMarker = sc.nextInt();

    Integer[] altitudeData = new Integer[nCols*nRows];
    int counter = 0;
    
    while (sc.hasNext() && counter < nCols*nRows) {
      altitudeData[counter++] = sc.nextInt();
    }
    
    if (counter < nCols*nRows) {
      System.out.println("*** Error: short read: only "+counter+
                         " items read; expected to read "+nCols*nRows);
      System.exit(1);
    }
    
    sc.close();
    AltitudeMap altitudeMap = new AltitudeMap(altitudeData, nRows, nCols);
    System.out.println("y center="+yCenter+" x center="+xCenter+" cellsize="+cellSize);
    System.out.println(altitudeMap);
    return altitudeMap;
  }  

  public void writeToDisk(String fileName) {
    DataOutputStream out = null;
    try {
      out =
        new DataOutputStream
        (new BufferedOutputStream
         (new FileOutputStream(fileName)));
      try {
        out.writeInt(2323231);
        out.writeInt(cols);
        out.writeInt(rows);
        for (int i=0; i<altitudeData.length; i++)
          out.writeInt(altitudeData[i].intValue());
        out.close();
      } catch (IOException exc) {
        System.out.println("\n*** Error: file exception "+exc+" writing to "+fileName);
        throw new RuntimeException();
      }
    } catch (FileNotFoundException exc) {
      System.out.println("file "+fileName+" not found");
    }
  }

  public static AltitudeMap readFromDisk(String... fileNames) {
    DataInputStream in = null;
    Integer dataBuffer[];
    int rows;
    int cols;
    int fileNameCounter = 0;
    String fileName = null;

    for (int i=0; i<fileNames.length; i++) {
      try {
        in =
          new DataInputStream
          (new BufferedInputStream
           (new FileInputStream(fileNames[i])));
        fileName = fileNames[i];
      } catch (FileNotFoundException exc) { }
      if (in != null) break;
    }

    if (in == null) {
      System.out.println
        ("\n *** Error: cannot find file toledo.map; has it been added to the eclipse project?");
      throw new RuntimeException();
    }

    try {
      int magic = in.readInt();
      if (magic != 2323231) {
        System.out.println("\n*** Error: "+fileName+" does not appear to be a map file");
        in.close();
        throw new RuntimeException();
      }
      cols = in.readInt();
      rows = in.readInt();
      dataBuffer = new Integer[rows*cols];
      int counter = 0;
      for (int i=0; i<dataBuffer.length; i++)
        dataBuffer[counter++] = in.readInt();
      in.close();
    } catch (IOException exc) {
      System.out.println("\n*** Error: file exception "+exc+" writing to "+fileName);
      throw new RuntimeException();
    }
    return new AltitudeMap(dataBuffer,rows,cols);
  }

  public String toString() {
    return
      "rows="+rows+
      ",cols="+cols+
      ",number of points="+(rows*cols)+
      ",min altitude="+minAltitude+
      ",max altitude="+maxAltitude;
  }
}

static class PaintAltitudeMap extends JPanel {
  private AltitudeMap altitudeMap;
  BufferedImage image;
  private int nRows;
  private int nCols;
  private int xDivisor;
  private int yDivisor;

  public PaintAltitudeMap(AltitudeMap altitudeMap, Point[] bestPath, PositionList<Point> path, int xDivisor, int yDivisor)
  {
    super();
    byte[] pixels = altitudeDataToPixels(altitudeMap);
    this.nRows = altitudeMap.getRows();
    this.nCols = altitudeMap.getCols();
    this.xDivisor = xDivisor;
    this.yDivisor = yDivisor;
    this.altitudeMap = altitudeMap;
    
    image = new BufferedImage(nCols, nRows, BufferedImage.TYPE_BYTE_GRAY);
    WritableRaster raster = image.getRaster();
    raster.setDataElements(0, 0, image.getWidth(), image.getHeight(), pixels);
    image.setData(raster);
    Graphics2D g = image.createGraphics();
    g.setColor(Color.RED);
    if (path != null) {
      BasicStroke stroke=new BasicStroke(2);
      g.setStroke(stroke);
      for (Point point : path) {
        g.fillRect(point.getX(),point.getY(),1,1);
      }
    }
    // Lighter path is the best one, the darker is the incorrect path
    g.setColor(Color.GREEN);
    if (path != null) {
      BasicStroke stroke=new BasicStroke(2);
      g.setStroke(stroke);
      for (Point point : bestPath) {
        g.fillRect(point.getX(),point.getY(),1,1);
      }
    }
  }
  
  public void paintComponent(Graphics g)
  {
    int nRows = altitudeMap.getRows();
    int nCols = altitudeMap.getCols();
    
    g.drawImage(image, 0, 0, nCols*xDivisor, nRows*xDivisor, null);
    //repaint();
  }
  
  public byte[] altitudeDataToPixels(AltitudeMap altitudeMap) {
    Integer[] altitudeData = altitudeMap.getAltitudeData();
    int minAltitude = altitudeMap.getMinAltitude();
    int maxAltitude = altitudeMap.getMaxAltitude();
    
    byte pixels[] = new byte[altitudeData.length];
    for (int i=0; i<altitudeData.length; i++) {
      int altitude = altitudeData[i];
      int normalizedAltitude =
        (255*(altitude - minAltitude)) / (maxAltitude-minAltitude);
      int displayAltitude =
        255 - normalizedAltitude;
      pixels[i] = (byte) displayAltitude;
    }
    System.out.println();
    return pixels;
  }
}




public static class TestData {
  static String testName = "";
  static ArrayList<String> trace;

  public static void initTrace() {
    trace = new ArrayList<String>();
  }

  public static void addCallToTrace(String callString) {
    trace.add(callString);
  }

  public static int numCommands() {
    return trace.size();
  }

  public static String getTrace() {
    StringBuffer sb = new StringBuffer();

    for (int i=0; i<trace.size(); i++) {
      if (i > 0) sb.append("\n");
      sb.append("  "+trace.get(i));
    }
    return sb.toString();
  }

  public static String getTestName() {
    return testName;
  }

  public static ArrayList<String> getRawTrace() {
    return trace;
  }

  public static void setTrace(ArrayList<String> setTrace) {
    trace = setTrace;
  }

  public static void setTestName(String setTestName) {
    testName = setTestName;
  }

  public static void setContext(String setTestName, ArrayList<String> setTrace) {
    setTestName(setTestName);
    setTrace(setTrace);
  }
}



static class ResultsHandler {
  public static volatile CountDownLatch waitForThreads = null;
  static LinkedHashMap<String,Boolean> results_sofar;

  static void init() {
    results_sofar = new LinkedHashMap<String,Boolean>();
  }

  static boolean results_ok_sofar() {
    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;
    return true;
  }

  static boolean local_results_ok_sofar(String test_type) {
    Boolean result = results_sofar.get(test_type);
    return (result==null) || result;
  }

  static void add_result(String test_type, boolean result) {
    Boolean old_result = results_sofar.get(test_type);
    if ((old_result == null) || old_result)
      results_sofar.put(test_type,result);
  }

  static boolean results_ok() {
    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;
    return true;
  }

  static int get_nota() {
    if (results_ok()) return 10;
    else return 0;
  }

  static void report_results() {
    System.out.println("\n++++++++++++++++++++++++++++++++++++++++++\n");

    for (String testName : results_sofar.keySet()) {
      System.out.print("Testing results for "+testName+": ");
      if (results_sofar.get(testName))
        System.out.println("succeeded");
      else
        System.out.println("failed");
    }

    System.out.println("\n------------------------------------------");
    if (results_ok())
      System.out.println("\n"+Tests.tester+": Test finalizado correctamente.");
    else
      System.out.println("\n"+Tests.tester+": errores detectados.\n");
  }
}



}
