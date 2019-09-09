
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
// File generated at: 2018/12/13 -- 22:46:29
// Seed: {1544,737588,632073}
//
//////////////////////////////////////////////////////////////////////



package aed.caminos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;
import java.util.concurrent.CountDownLatch;
import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.graph.*;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;



@SuppressWarnings("unused")
public class TesterLab7 {

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

  static String tester = "TesterLab7";

  static boolean runTests() {
    ResultsHandler.init();

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_1());

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_2());

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_3());

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_4());

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_5());

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_6());

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_7());

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_8());

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_9());

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_10());

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_11());

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_12());

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_13());

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_14());

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_15());

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_16());

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_17());

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_18());

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_19());

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_20());

    if (ResultsHandler.local_results_ok_sofar("findPath"))
      ResultsHandler.add_result("findPath",test_21());

    if (ResultsHandler.local_results_ok_sofar("findPath"))
      ResultsHandler.add_result("findPath",test_22());

    if (ResultsHandler.local_results_ok_sofar("findPath"))
      ResultsHandler.add_result("findPath",test_23());

    if (ResultsHandler.local_results_ok_sofar("findPath"))
      ResultsHandler.add_result("findPath",test_24());

    if (ResultsHandler.local_results_ok_sofar("findPath"))
      ResultsHandler.add_result("findPath",test_25());

    if (ResultsHandler.local_results_ok_sofar("findPath"))
      ResultsHandler.add_result("findPath",test_26());

    if (ResultsHandler.local_results_ok_sofar("findPath"))
      ResultsHandler.add_result("findPath",test_27());

    if (ResultsHandler.local_results_ok_sofar("findPath"))
      ResultsHandler.add_result("findPath",test_28());

    if (ResultsHandler.local_results_ok_sofar("findPath"))
      ResultsHandler.add_result("findPath",test_29());

    if (ResultsHandler.local_results_ok_sofar("findPath"))
      ResultsHandler.add_result("findPath",test_30());

    if (ResultsHandler.local_results_ok_sofar("findPath"))
      ResultsHandler.add_result("findPath",test_31());

    if (ResultsHandler.local_results_ok_sofar("findPath"))
      ResultsHandler.add_result("findPath",test_32());

    if (ResultsHandler.local_results_ok_sofar("findPath"))
      ResultsHandler.add_result("findPath",test_33());

    if (ResultsHandler.local_results_ok_sofar("findPath"))
      ResultsHandler.add_result("findPath",test_34());

    if (ResultsHandler.local_results_ok_sofar("findPath"))
      ResultsHandler.add_result("findPath",test_35());

    if (ResultsHandler.local_results_ok_sofar("findPath"))
      ResultsHandler.add_result("findPath",test_36());

    if (ResultsHandler.local_results_ok_sofar("findPath"))
      ResultsHandler.add_result("findPath",test_37());

    if (ResultsHandler.local_results_ok_sofar("findPath"))
      ResultsHandler.add_result("findPath",test_38());

    if (ResultsHandler.local_results_ok_sofar("findPath"))
      ResultsHandler.add_result("findPath",test_39());

    if (ResultsHandler.local_results_ok_sofar("findPath"))
      ResultsHandler.add_result("findPath",test_40());


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
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.Constructor(new java.lang.Integer[][] { { null,null,0 }, { 1,1,0 } }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_2 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_2") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.Constructor(new java.lang.Integer[][] { { null,2 }, { 2,1 }, { 2,2 } }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_3 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_3") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.Constructor(new java.lang.Integer[][] { { 3,3,0,null }, { null,3,null,0 }, { 1,1,null,2 } }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_4 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_4") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.Constructor(new java.lang.Integer[][] { { 0,2 }, { null,null }, { 1,1 }, { null,1 }, { 3,1 }, { 0,3 } }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_5 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_5") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.Constructor(new java.lang.Integer[][] { { 0,1,3,3,1,1,3,2 }, { 3,null,3,3,null,3,3,1 } }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_6 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_6") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.Constructor(new java.lang.Integer[][] { { 2,3,null }, { 3,3,0 }, { 3,3,2 }, { null,3,null }, { 0,1,1 }, { 3,3,null } }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_7 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_7") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.Constructor(new java.lang.Integer[][] { { null,null,null,2 }, { 1,null,1,3 }, { 1,2,null,2 }, { null,1,0,3 }, { 3,1,3,1 } }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_8 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_8") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.Constructor(new java.lang.Integer[][] { { null,0,0,2,null,null,1 }, { 2,1,1,2,3,1,1 }, { 2,0,1,0,null,3,3 }, { null,1,1,null,null,2,2 } }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_9 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_9") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.Constructor(new java.lang.Integer[][] { { 3,2,3 }, { 1,0,1 }, { 1,null,2 }, { 1,1,3 }, { 3,1,1 }, { 0,3,0 }, { 0,3,3 }, { 2,3,0 } }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_10 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_10") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.Constructor(new java.lang.Integer[][] { { 3,2,2,1,null,1 }, { 0,null,3,null,1,0 }, { 3,2,2,null,1,0 }, { null,0,2,2,2,null }, { 0,2,2,null,3,0 } }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_11 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_11") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.Constructor(new java.lang.Integer[][] { { 3,0,1,null,2 }, { null,0,1,2,3 }, { 2,null,null,3,3 }, { 1,1,3,3,0 }, { 3,0,null,0,1 }, { 1,null,2,3,0 } }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_12 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_12") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.Constructor(new java.lang.Integer[][] { { 1,null,3,3,2,1,null,1,3,3 }, { 1,0,2,2,3,0,2,3,3,2 }, { 0,null,0,0,null,2,2,3,2,2 } }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_13 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_13") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.Constructor(new java.lang.Integer[][] { { 0,2,1 }, { 0,0,1 }, { 1,2,1 }, { 0,2,1 }, { 1,3,2 }, { 1,1,null }, { 2,3,0 }, { 0,3,0 }, { 2,2,0 }, { 2,2,2 } }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_14 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_14") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.Constructor(new java.lang.Integer[][] { { null,2,null,0,1,2 }, { 3,1,1,1,null,1 }, { 1,0,null,2,2,2 }, { 0,1,0,3,0,2 }, { null,0,null,3,0,null }, { 0,3,0,0,3,1 } }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_15 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_15") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.Constructor(new java.lang.Integer[][] { { 2,null,2,1,1,null }, { 2,0,0,2,null,0 }, { 1,3,0,1,null,0 }, { 0,2,3,3,3,null }, { 0,null,null,2,1,null }, { 2,2,0,3,3,2 }, { 3,1,3,1,null,null }, { 3,null,3,0,3,2 }, { 3,3,3,1,1,2 } }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_16 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_16") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.Constructor(new java.lang.Integer[][] { { 1,0,0,2,2,2 }, { 1,null,0,3,1,null }, { 0,null,3,0,0,0 }, { 0,2,0,1,2,0 }, { 1,1,2,null,null,null }, { null,1,0,3,null,2 }, { null,0,2,3,3,null }, { 3,1,2,3,2,3 }, { 0,1,null,3,2,1 }, { 0,null,null,3,0,1 } }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_17 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_17") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.Constructor(new java.lang.Integer[][] { { 0,2,1,3,0,0 }, { 1,2,null,1,3,2 }, { 1,1,1,3,2,1 }, { 2,1,3,2,2,0 }, { 3,1,1,3,1,2 }, { 3,null,0,3,2,0 }, { 2,0,1,2,2,null }, { 1,2,2,0,2,0 }, { 3,2,0,3,3,1 } }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_18 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_18") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.Constructor(new java.lang.Integer[][] { { 1,2,0,3,1,3,null,0,null }, { 2,0,3,0,null,1,3,1,1 }, { 0,3,3,0,null,0,2,3,2 }, { null,3,2,2,1,1,null,0,1 }, { 3,null,2,3,2,0,3,1,2 }, { null,1,3,3,1,null,3,2,3 }, { 1,3,1,0,0,3,null,3,1 } }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_19 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_19") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.Constructor(new java.lang.Integer[][] { { 3,0,2,1,2,0,null }, { 3,0,2,0,null,1,2 }, { null,0,2,0,1,0,2 }, { null,null,2,1,2,0,1 }, { 2,0,0,null,1,null,2 }, { 3,1,2,1,3,1,1 }, { 3,2,3,1,3,2,0 }, { null,3,3,null,2,1,2 }, { null,3,3,0,3,1,0 } }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_20 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_20") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.Constructor(new java.lang.Integer[][] { { null,2,1,1,3,null,null }, { null,1,null,2,2,0,2 }, { null,3,1,3,2,1,1 }, { 1,1,2,2,3,2,3 }, { 2,2,2,0,null,2,0 }, { 3,2,1,2,0,null,null }, { 1,3,1,1,0,2,null }, { 1,null,0,2,1,1,3 }, { null,null,3,0,2,3,null }, { 0,1,null,3,1,0,1 } }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_21 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_21") ;
    boolean ok_sofar = true ;
    
    return ok_sofar ;
  }



  static boolean test_22 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_22") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.FindPath(new java.lang.Integer[][] { { 2,1 }, { 0,2 } },new aed.caminos.Point(1,1),new aed.caminos.Point(1,0)).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_23 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_23") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.FindPath(new java.lang.Integer[][] { { 0,3 }, { 0,0 }, { null,null } },new aed.caminos.Point(1,1),new aed.caminos.Point(1,1)).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_24 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_24") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.FindPath(new java.lang.Integer[][] { { 3,3,2 }, { 1,null,null } },new aed.caminos.Point(1,0),new aed.caminos.Point(1,0)).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_25 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_25") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.FindPath(new java.lang.Integer[][] { { 0,0 }, { 0,null }, { 2,2 } },new aed.caminos.Point(2,1),new aed.caminos.Point(2,1)).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_26 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_26") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.FindPath(new java.lang.Integer[][] { { 0,2 }, { 3,null }, { 0,2 } },new aed.caminos.Point(1,0),new aed.caminos.Point(2,0)).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_27 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_27") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.FindPath(new java.lang.Integer[][] { { 3,0 }, { 1,null }, { 1,1 } },new aed.caminos.Point(2,1),new aed.caminos.Point(2,0)).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_28 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_28") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.FindPath(new java.lang.Integer[][] { { null,1,1,null,2 }, { null,3,2,null,null } },new aed.caminos.Point(1,2),new aed.caminos.Point(1,2)).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_29 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_29") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.FindPath(new java.lang.Integer[][] { { 0,1,0,3 }, { 3,null,3,0 } },new aed.caminos.Point(1,3),new aed.caminos.Point(1,3)).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_30 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_30") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.FindPath(new java.lang.Integer[][] { { 1,3 }, { 0,1 }, { 3,1 }, { null,0 } },new aed.caminos.Point(2,1),new aed.caminos.Point(3,1)).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_31 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_31") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.FindPath(new java.lang.Integer[][] { { 1,null }, { 1,0 }, { 2,3 }, { null,0 }, { 3,null } },new aed.caminos.Point(2,1),new aed.caminos.Point(2,1)).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_32 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_32") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.FindPath(new java.lang.Integer[][] { { 1,0 }, { 3,2 }, { 1,1 }, { 1,0 } },new aed.caminos.Point(1,0),new aed.caminos.Point(2,1)).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_33 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_33") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.FindPath(new java.lang.Integer[][] { { 2,3 }, { 2,1 }, { 1,2 }, { 0,2 } },new aed.caminos.Point(3,1),new aed.caminos.Point(3,1)).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_34 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_34") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.FindPath(new java.lang.Integer[][] { { 3,1,3,0 }, { 0,1,2,1 } },new aed.caminos.Point(1,2),new aed.caminos.Point(1,2)).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_35 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_35") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.FindPath(new java.lang.Integer[][] { { 2,0,null }, { 0,2,1 }, { 3,0,0 } },new aed.caminos.Point(1,2),new aed.caminos.Point(2,0)).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_36 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_36") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.FindPath(new java.lang.Integer[][] { { null,3 }, { 1,2 }, { 2,2 }, { 1,1 }, { 1,null } },new aed.caminos.Point(3,1),new aed.caminos.Point(3,0)).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_37 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_37") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.FindPath(new java.lang.Integer[][] { { 0,null,3,3,1 }, { 2,3,3,0,2 } },new aed.caminos.Point(1,2),new aed.caminos.Point(1,1)).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_38 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_38") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.FindPath(new java.lang.Integer[][] { { null,3 }, { 2,3 }, { 0,2 }, { 0,2 }, { 2,1 } },new aed.caminos.Point(2,1),new aed.caminos.Point(3,1)).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_39 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_39") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.FindPath(new java.lang.Integer[][] { { 1,3,3,1,1 }, { 3,1,3,1,2 } },new aed.caminos.Point(1,0),new aed.caminos.Point(1,1)).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_40 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_40") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.caminos.TesterLab7.FindPath(new java.lang.Integer[][] { { 2,2,0,3,1 }, { 1,1,0,2,3 } },new aed.caminos.Point(1,2),new aed.caminos.Point(1,4)).doCall().checkResult(null) ;
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

 











public static class GraphAnalysis {
  public Transportistas t;
  public DirectedGraph<Point,Integer> g;
  public Integer[][] map;
  public int rows;
  public int cols;
  public Map<Point,Vertex<Point>> points2vertices;
  public Map<Vertex<Point>,Point> vertices2points;

  public GraphAnalysis(Transportistas t,
                       DirectedGraph<Point,Integer> g,
                       Integer[][] map,
                       int rows,
                       int cols,
                       Map<Point,Vertex<Point>> points2vertices,
                       Map<Vertex<Point>,Point> vertices2points) {
    this.t = t;
    this.g = g;
    this.map = map;
    this.rows = rows;
    this.cols = cols;
    this.points2vertices = points2vertices;
    this.vertices2points = vertices2points;
  }

  public static GraphAnalysis checkGraph(Transportistas t,
                                         Integer[][] map,
                                         DirectedGraph<Point,Integer> g,
                                         int rows, int cols) {

    Map<Vertex<Point>,Point> vertices2points =
      new HashTableMap<Vertex<Point>,Point>();
    Map<Point,Vertex<Point>> points2vertices =
      new HashTableMap<Point,Vertex<Point>>();

    boolean allVertices[][] =
      new boolean[cols][rows];

    int numVertices = 0;
    

    for (int col=0; col<cols; col++) {
      for (int row=0; row<rows; row++) {
        if (map[col][row] != null)
          ++numVertices;
      }
    }

    if (numVertices != g.size()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\n The map has "+numVertices+" vertices, but the graph has "+
         g.size()+" vertices.\n"+
         "The graph is\n"+TransportistasChecker.printGraph(t,g,cols,rows,points2vertices,vertices2points));
      return null;
    }

    for (Vertex<Point> v : g.vertices()) {

      Point point = v.element();

      if (point == null) {
          TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "a vertex contains a null point in the graph.\n"+
             "The graph is\n"+TransportistasChecker.printGraph(t,g,cols,rows,points2vertices,vertices2points));
          return null;
      } else allVertices[point.getX()][point.getY()] = true;


      for (Edge<Integer> e : g.outgoingEdges(v)) {
        Integer altitude = e.element();
        if (altitude == null) {
          TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "\n the vertex at "+point+" has an outgoing edge labelled by null??.\n"+
             "The graph is\n"+TransportistasChecker.printGraph(t,g,cols,rows,points2vertices,vertices2points));
          return null;
        }
      }

      vertices2points.put(v,point);
      points2vertices.put(point,v);
    }

    
    for (int col=0; col<cols; col++) {
      for (int row=0; row<rows; row++) {
        Point point = new Point(col,row);
        if (allVertices[col][row] == false && map[col][row] != null) {
          TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "the point "+point+" is not null in the map "+
             "but there is no vertex in the graph labelled by the point.\n"+
             "The graph is\n"+TransportistasChecker.printGraph(t,g,cols,rows,points2vertices,vertices2points));
          return null;
        } else if (allVertices[col][row] == true  && map[col][row] == null) {
          TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "There is a vertex in the graph labelled by the point "+point+
             " but the point is null in the map.\n"+
             "The graph is\n"+TransportistasChecker.printGraph(t,g,cols,rows,points2vertices,vertices2points));
          return null;
        }
      }
    }

    GraphAnalysis ga =
      new GraphAnalysis(t,g,map,rows,cols,points2vertices,vertices2points);
      
    boolean edgeResult = ga.addEdges();
    if (!edgeResult) return null;
    else return ga;
  }

  boolean addEdges() {
    for (Vertex<Point> v : g.vertices()) {
      Point point = v.element();
      int col = point.getX();
      int row = point.getY();

      if (map[col][row] != null) {
        Map<Vertex<Point>,Pair<Point,Integer>> edges =
          new HashTableMap<Vertex<Point>,Pair<Point,Integer>>();
        addEdge(edges,v,point,new Point(col,row-1));
        addEdge(edges,v,point,new Point(col,row+1));
        addEdge(edges,v,point,new Point(col-1,row));
        addEdge(edges,v,point,new Point(col+1,row));
        /*
          addEdge(edges,v,point,new Point(col+1,row-1));
          addEdge(edges,v,point,new Point(col+1,row+1));
          addEdge(edges,v,point,new Point(col-1,row-1));
          addEdge(edges,v,point,new Point(col-1,row+1));
        */
        if (!checkEdges(edges,v,point))
          return false;
      }
    }
    return true;
  }

  void addEdge(Map<Vertex<Point>,Pair<Point,Integer>> edges,
               Vertex<Point> fromVertex,
               Point fromPoint,
               Point toPoint) {
    int fromX = fromPoint.getX();
    int fromY = fromPoint.getY();
    int toX = toPoint.getX();
    int toY = toPoint.getY(); 
    if (toX >= 0 && toX < cols && toY >= 0 && toY < rows &&
        map[toX][toY] != null) {
      Vertex<Point> toVertex = points2vertices.get(toPoint);
      int cost = Math.max(0,map[toX][toY]-map[fromX][fromY])+1;
      edges.put(toVertex,new Pair<Point,Integer>(toPoint,cost));
    }
  }

  boolean checkEdges(Map<Vertex<Point>,Pair<Point,Integer>> edges,
                     Vertex<Point> fromVertex,
                     Point fromPoint) {
    if (g.outDegree(fromVertex) != edges.size()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\n There should be "+edges.size()+" edges in the graph "+
         "from vertex "+fromPoint+
         " but there are "+g.outDegree(fromVertex)+" ones;\nEdges: "+
         printEdges(g.outgoingEdges(fromVertex))+
         "\ngraph:\n"+TransportistasChecker.printGraph(t,g,cols,rows,points2vertices,vertices2points)+"\n");
      return false;
    }

    for (Edge<Integer> e : g.outgoingEdges(fromVertex)) {
      Vertex<Point> toVertex = g.endVertex(e);
      Pair<Point,Integer> pairCost = edges.remove(toVertex);
      if (pairCost != null) {
        int pCost = pairCost.getRight();
        int edgeCost = e.element();
        if (pCost != edgeCost) {
          Point point = pairCost.getLeft();
          TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "\n The edge from vertex "+fromPoint+
             " to vertex "+point+
             " should have cost "+pCost+
             " but has cost "+edgeCost+
             " in the graph\n"+TransportistasChecker.printGraph(t,g,cols,rows,points2vertices,vertices2points)); 
          return false;
        }
      }
    }

    if (!edges.isEmpty()) {
      Iterator<Entry<Vertex<Point>,Pair<Point,Integer>>> entries =
        edges.entries();
      Entry<Vertex<Point>,Pair<Point,Integer>> pairCost =
        entries.next();
      Pair<Point,Integer> pair = pairCost.getValue();
      Point point = pair.getLeft();
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\n There is no edge from vertex "+fromPoint+
         " to vertex "+point+
         " in the graph\n"+TransportistasChecker.printGraph(t,g,cols,rows,points2vertices,vertices2points)); 
        return false;
    } else return true;
  }

  String printEdge(Edge<Integer> edge) {
    StringBuffer sb = new StringBuffer();
    Vertex<Point> from = g.startVertex(edge);
    Vertex<Point> to = g.endVertex(edge);
    sb.append(vertices2points.get(from)+" -"+edge.element()+"-> "+vertices2points.get(to));
    return sb.toString();
  }

  String printEdges(Iterable<Edge<Integer>> edges) {
    StringBuffer sb = new StringBuffer();
    for (Edge<Integer> e : edges) {
      sb.append(printEdge(e)+",");
    }
    return sb.toString();
  }

  public boolean checkPath(Point startPoint,
                           Point endPoint,
                           PositionList<Point> path,
                           Integer bestCost,
                           Point[] bestPath) {
    boolean pathCorrect = true;

    if (path == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "the returned path is null");
      return false;
    }
    
    // We permit either an empty path if from==to,
    // or a singleton path
    if (path.isEmpty()) {
      if (startPoint.equals(endPoint))
        return true;
      else
        pathCorrect = false;
    } else {
      Position<Point> cursor = path.first();
      Point cursorPoint = cursor.element();
      if (cursorPoint == null || !cursorPoint.equals(startPoint))
        pathCorrect = false;

      if (pathCorrect && path.size()==1) {
        if (startPoint.equals(endPoint))
          return true;
        else
          pathCorrect = false;
      }

      if (pathCorrect) {
        Vertex<Point> fromV = points2vertices.get(cursorPoint);
        int calculatedCost = 0;
        cursor = path.next(cursor);

        while (cursor != null && pathCorrect) {
          Point nextPoint = cursor.element();
          if (nextPoint == null)
            pathCorrect = false;
          else {
            Vertex<Point> nextV = points2vertices.get(nextPoint);
            if (nextV == null) pathCorrect = false;
            else {
              Integer cost = findTransition(g,fromV,nextV);
              if (cost != null) {
                cursor = path.next(cursor);
                fromV = nextV;
                calculatedCost += cost;
                //System.out.println("calculatedCost = "+calculatedCost);
              } else pathCorrect = false;
            }
          }
        }
        pathCorrect =
          pathCorrect && (fromV==points2vertices.get(endPoint));

        if (pathCorrect && bestCost != null) {
          int bCost = bestCost;
          if (calculatedCost-bCost == 0)
            return true;
          else {
            TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "the returned path "+printPath(path)+
               " has a cost of "+calculatedCost+
               " but there exists a better path with cost "+bestCost+": "+Arrays.toString(bestPath));
            return false;
          }
        }
      }
    }

    if (pathCorrect) return true;
    else {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "the returned path "+printPath(path)+
         " does not lead from "+startPoint+" to "+endPoint+
         " or contains pairs of vertices that are not connected"+
         ".\n");
      return false;
    }
  }

  static Integer findTransition(DirectedGraph<Point,Integer> g, Vertex<Point> from, Vertex<Point> to) {
    for (Edge<Integer> e : g.outgoingEdges(from)) {
      if (g.endVertex(e) == to)
        return e.element();
    }
    return null;
  }

  static String printPath(PositionList<Point> l) {
    StringBuffer sb = new StringBuffer();
    for (Point p : l) {
      sb.append(p+",");
    }
    return sb.toString();
  }
}


static class TransportistasChecker {

  public static String printMap(Integer[][] map, int cols, int rows) {
    StringBuffer sb = new StringBuffer();
    sb.append("\n");
    sb.append("(y) ");
    for (int i=0; i<cols; i++) {
        sb.append("---");
    }
    sb.append("--\n");
    for (int i=rows-1; i>=0; i--) {
      sb.append("  "+i+" ");
      printMapRow(sb,map,i,cols);
      sb.append("\n");
    }
    sb.append("    ");
    for (int i=0; i<cols; i++) {
      sb.append("---");
    }
    sb.append("--\n");
    sb.append("    ");
    for (int i=0; i<cols; i++) {
      sb.append("  "+i);
    }
    sb.append(" (x)\n");
    return sb.toString();
  }

  public static String printMapRaw(Integer[][] map, int cols, int rows) {
    StringBuffer sb = new StringBuffer();
    for (int row=rows-1; row>=0; row--) {
      sb.append(row+": ");
      for (int col=0; col<cols; col++) {
        if (map[col][row]==null)
          sb.append(null+" ");
        else
          sb.append(map[col][row]+"    ");
      }
      sb.append("\n");
    }
    return sb.toString();
  }
  
  static void printMapRow(StringBuffer sb, Integer[][]map, int row, int cols) {
    for (int i=0; i<cols; i++) {
      Integer altitude = map[i][row];
      if (i==0) sb.append("| ");
      else sb.append("  ");
      if (altitude == null) sb.append("-");
      else {
        sb.append(altitude);
      }
      if (i==cols-1) sb.append(" |");
    }
  }

  public static String printGraph(Transportistas t,
                                  DirectedGraph<Point,Integer> g,
                                  int cols,
                                  int rows,
                                  Map<Point,Vertex<Point>> points2vertices,
                                  Map<Vertex<Point>,Point> vertices2points) {
    StringBuffer sb = new StringBuffer();

    for (Vertex<Point> v : g.vertices()) {
      String vName = "";
      Point point = v.element();
      if (point != null) vName = point.toString();
      sb.append(vName+": ");
      boolean added = false;
      for (Edge<Integer> e : g.outgoingEdges(v)) {
	Vertex<Point> otherVertice = g.endVertex(e);
        String otherName = otherVertice.toString();
        Point otherPoint = vertices2points.get(otherVertice);
        if (otherPoint != null) otherName = otherPoint.toString();
	String edgeSymbol="->";
        String edgeLabel = "";
        if (e.element() != null)
          edgeLabel = Long.valueOf(Math.round(e.element())).toString();
	if (added) sb.append(", ");
	sb.append("-" + edgeLabel + edgeSymbol + otherName);
	added = true;
      }
      sb.append("\n");
    }
    return sb.toString();
  }
  
}


static class Constructor extends TestCall<Transportistas,Void> {
  Integer[][] map;
  int rows;
  int cols;
  
  public Constructor(Integer[][] map) {
    this.map = map;
    this.rows = map[0].length;
    this.cols = map.length;
  }
  
  @Override
  public String toString() {
    return
      "new Transportistas(map) where map is\n"
      +TransportistasChecker.printMap(map,cols,rows);      
  }
  
  @Override
  public Transportistas call() {
    return new Transportistas(map);
  }
  
  @Override
  @SuppressWarnings({"unchecked","rawtypes"})
  public boolean checkResult(Void arg) {
    if (!noException() || !nonNull())
      return false;

    DirectedGraph<Point,Integer> graph = null;
    Transportistas t = result.getValue();

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

    return GraphAnalysis.checkGraph(t,map,graph,rows,cols) != null;
  }
}


static class FindPath extends TestCall<PositionList<Point>,Void> {
  Integer[][] map;
  int rows;
  int cols;
  Point fromPoint;
  Point toPoint;
  Transportistas t;
  
  public FindPath(Integer[][] map, Point fromPoint, Point toPoint) {
    this.map = map;
    this.rows = map[0].length;
    this.cols = map.length;
    this.fromPoint = fromPoint;
    this.toPoint = toPoint;
  }
  
  @Override
  public String toString() {
    return
      "g.pathFromTo(new Point"+fromPoint+",new Point"+toPoint+") with the graph g constructed from the map\n"
      +TransportistasChecker.printMap(map,cols,rows);      
  }
  
  @Override
  public PositionList<Point> call() {
    t = new Transportistas(map);
    return t.pathFromTo(fromPoint,toPoint);
  }
  
  @Override
  @SuppressWarnings({"unchecked","rawtypes"})
  public boolean checkResult(Void arg) {
    if (!noException())
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
         "the graph g is null\n");
      return false;
    }

    GraphAnalysis ga = GraphAnalysis.checkGraph(t,map,graph,rows,cols);
    PositionList<Point> path = result.getValue();

    if (ga == null) return false;
    else return ga.checkPath(fromPoint,toPoint,path,null,null);
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
