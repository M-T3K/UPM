
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
// File generated at: 2018/12/7 -- 15:40:2
// Seed: {1544,193601,312664}
//
//////////////////////////////////////////////////////////////////////



package aed.individual6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;
import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.graph.*;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.tree.*;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;


@SuppressWarnings("unused")
public class TesterInd6 {

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

		System.exit(booleanResult ? 0 : 24);
	    }
	} catch (NumberFormatException exc) {
	    System.out.println("\n*** Error: argument should be an integer but is "+args[0]);
	    System.exit(24);
	}
    } else {
      Tests.runTests();

      // Check if the option --nota-as-exit-code is set --
      // if so exit with the nota as the exit code
      if (args.length == 1) {
	System.exit(ResultsHandler.get_nota());
      } else {
	// Standard exit codes
	if (ResultsHandler.results_ok()) System.exit(0);
	else System.exit(24);
      }
    }
  }
}    
    

class Tests {

  static String tester = "TesterInd6";

  static boolean runTests() {
    ResultsHandler.init();

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_1());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_2());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_3());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_4());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_5());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_6());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_7());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_8());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_9());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_10());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_11());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_12());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_13());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_14());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_15());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_16());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_17());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_18());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_19());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_20());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_21());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_22());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_23());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_24());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_25());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_26());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_27());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_28());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_29());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_30());

    if (ResultsHandler.local_results_ok_sofar("sumar"))
      ResultsHandler.add_result("sumar",test_31());


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
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,1 }, { 1,1 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,1 }, { 1,1 } }) ;
    return ok_sofar ;
  }



  static boolean test_3 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_3") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,1 }, { 1,4 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,1 }, { 1,4 } }) ;
    return ok_sofar ;
  }



  static boolean test_4 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_4") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,5 }, { 1,2 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,5 }, { 1,2 } }) ;
    return ok_sofar ;
  }



  static boolean test_5 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_5") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,7 }, { 1,1 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,7 }, { 1,1 } }) ;
    return ok_sofar ;
  }



  static boolean test_6 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_6") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,5,0 }, { 1,9,1 }, { 2,1,0 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,5 }, { 1,9 }, { 2,6 } }) ;
    return ok_sofar ;
  }



  static boolean test_7 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_7") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,6,1 }, { 1,5,2 }, { 2,4,1 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,15 }, { 1,9 }, { 2,9 } }) ;
    return ok_sofar ;
  }



  static boolean test_8 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_8") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,2,4,4 }, { 1,2,4 }, { 2,2,2 }, { 3,2,1 }, { 4,2,0,2 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,6 }, { 1,8 }, { 2,2 }, { 3,10 }, { 4,6 } }) ;
    return ok_sofar ;
  }



  static boolean test_9 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_9") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,3,0,4 }, { 1,1,1,4 }, { 2,3,2,3 }, { 3,2,1 }, { 4,5,2 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,14 }, { 1,11 }, { 2,11 }, { 3,11 }, { 4,11 } }) ;
    return ok_sofar ;
  }



  static boolean test_10 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_10") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,4,0,5 }, { 1,1,0 }, { 2,4,2 }, { 3,2,0,3,4 }, { 4,1,0 }, { 5,8,2 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,16 }, { 1,17 }, { 2,4 }, { 3,19 }, { 4,17 }, { 5,12 } }) ;
    return ok_sofar ;
  }



  static boolean test_11 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_11") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,4,0 }, { 1,1,4 }, { 2,1,2 }, { 3,1,0,0,1 }, { 4,5,2 }, { 5,4,4 }, { 6,5,2 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,4 }, { 1,7 }, { 2,1 }, { 3,12 }, { 4,6 }, { 5,10 }, { 6,6 } }) ;
    return ok_sofar ;
  }



  static boolean test_12 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_12") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,4,2 }, { 1,5,4 }, { 2,3,3 }, { 3,1,2,3 }, { 4,4,2 }, { 5,1,5,6 }, { 6,2,1 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,8 }, { 1,13 }, { 2,4 }, { 3,4 }, { 4,8 }, { 5,16 }, { 6,15 } }) ;
    return ok_sofar ;
  }



  static boolean test_13 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_13") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,1,2,3,6 }, { 1,5,0,3,5 }, { 2,5,4,6 }, { 3,6,3 }, { 4,5,4,6 }, { 5,1,6 }, { 6,3,0 }, { 7,5,0,4 }, { 8,1,4,5,7 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,20 }, { 1,26 }, { 2,20 }, { 3,6 }, { 4,20 }, { 5,21 }, { 6,20 }, { 7,25 }, { 8,27 } }) ;
    return ok_sofar ;
  }



  static boolean test_14 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_14") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,1,1,4 }, { 1,2,1 }, { 2,3,3,8 }, { 3,1,2,6,8 }, { 4,2,6,8 }, { 5,3,0 }, { 6,4,7,7 }, { 7,3,8 }, { 8,4,2,3,6 }, { 9,2,7 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,20 }, { 1,2 }, { 2,15 }, { 3,15 }, { 4,17 }, { 5,23 }, { 6,15 }, { 7,15 }, { 8,15 }, { 9,17 } }) ;
    return ok_sofar ;
  }



  static boolean test_15 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_15") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,3,10 }, { 1,3,1,3 }, { 2,3,6,9 }, { 3,2,4 }, { 4,3,2,3 }, { 5,3,1 }, { 6,3,10 }, { 7,1,0,9,10 }, { 8,4,1,3 }, { 9,2,0,6 }, { 10,3,5 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,25 }, { 1,25 }, { 2,25 }, { 3,25 }, { 4,25 }, { 5,25 }, { 6,25 }, { 7,26 }, { 8,29 }, { 9,25 }, { 10,25 } }) ;
    return ok_sofar ;
  }



  static boolean test_16 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_16") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,4,0,2,7 }, { 1,4,1 }, { 2,2,1 }, { 3,2,2 }, { 4,5,3,5 }, { 5,4,10 }, { 6,3,2,3 }, { 7,3,2,5,6 }, { 8,3,2,5 }, { 9,4,1 }, { 10,2,0,2 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,24 }, { 1,4 }, { 2,6 }, { 3,8 }, { 4,29 }, { 5,24 }, { 6,11 }, { 7,24 }, { 8,27 }, { 9,8 }, { 10,24 } }) ;
    return ok_sofar ;
  }



  static boolean test_17 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_17") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,1,0,6,7 }, { 1,1,3 }, { 2,1,2,3,8 }, { 3,1,8,10 }, { 4,1,1 }, { 5,1,1,7 }, { 6,1,7 }, { 7,1,1,2,10 }, { 8,1,1,7 }, { 9,1,6 }, { 10,2,3,5,6 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,10 }, { 1,9 }, { 2,9 }, { 3,9 }, { 4,10 }, { 5,9 }, { 6,9 }, { 7,9 }, { 8,9 }, { 9,10 }, { 10,9 } }) ;
    return ok_sofar ;
  }



  static boolean test_18 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_18") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,1,10,11,11 }, { 1,1,4,5 }, { 2,1,3,9 }, { 3,1,10 }, { 4,2,2,4,7 }, { 5,1,1 }, { 6,1,10 }, { 7,1,2,6 }, { 8,2,2 }, { 9,1,10 }, { 10,1,7 }, { 11,1,1,3 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,12 }, { 1,10 }, { 2,6 }, { 3,6 }, { 4,8 }, { 5,10 }, { 6,6 }, { 7,6 }, { 8,8 }, { 9,6 }, { 10,6 }, { 11,11 } }) ;
    return ok_sofar ;
  }



  static boolean test_19 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_19") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,8,9 }, { 1,7,5,12 }, { 2,8,2,4,6 }, { 3,6,7,9 }, { 4,8,3,4,11 }, { 5,4,1 }, { 6,4,4,11,13 }, { 7,1,2,5,11 }, { 8,5,1,7 }, { 9,3,7,9,13 }, { 10,3,8,8 }, { 11,4,10 }, { 12,4,3,7 }, { 13,2,10 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,67 }, { 1,59 }, { 2,59 }, { 3,59 }, { 4,59 }, { 5,59 }, { 6,59 }, { 7,59 }, { 8,59 }, { 9,59 }, { 10,59 }, { 11,59 }, { 12,59 }, { 13,59 } }) ;
    return ok_sofar ;
  }



  static boolean test_20 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_20") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,6,1,1,6 }, { 1,5,2,6 }, { 2,1,9,9 }, { 3,4,3,13 }, { 4,2,4,5,8 }, { 5,3,3,6,10 }, { 6,5,3,7,13 }, { 7,10,6,10 }, { 8,6,7,8,10 }, { 9,9,6,9 }, { 10,9,0,1,7 }, { 11,2,3,10 }, { 12,2,2,7,12 }, { 13,6,9,12 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,57 }, { 1,57 }, { 2,57 }, { 3,57 }, { 4,68 }, { 5,60 }, { 6,57 }, { 7,57 }, { 8,63 }, { 9,57 }, { 10,57 }, { 11,59 }, { 12,57 }, { 13,57 } }) ;
    return ok_sofar ;
  }



  static boolean test_21 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_21") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,1,1 }, { 1,1,0 }, { 2,1,8 }, { 3,1,12 }, { 4,2,10 }, { 5,1,6 }, { 6,1,6,8 }, { 7,1,7,10,13 }, { 8,2,8,8 }, { 9,1,11,12,13 }, { 10,1,1,13 }, { 11,1,5,9 }, { 12,2,8,13 }, { 13,1,1 }, { 14,2,2,7,13 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,2 }, { 1,2 }, { 2,3 }, { 3,8 }, { 4,6 }, { 5,4 }, { 6,3 }, { 7,5 }, { 8,2 }, { 9,11 }, { 10,4 }, { 11,11 }, { 12,7 }, { 13,3 }, { 14,10 } }) ;
    return ok_sofar ;
  }



  static boolean test_22 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_22") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,1,3,4,6 }, { 1,7,8,13 }, { 2,1,4,11,12 }, { 3,9,6,12 }, { 4,8,4,7,14 }, { 5,6,1,8,9 }, { 6,9,4,6 }, { 7,7,9,12 }, { 8,4,4 }, { 9,4,6,11 }, { 10,2,9 }, { 11,5,5,7,14 }, { 12,7,2,8,13 }, { 13,4,1,11,12 }, { 14,6,2,8,12,12 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,78 }, { 1,68 }, { 2,68 }, { 3,77 }, { 4,68 }, { 5,68 }, { 6,68 }, { 7,68 }, { 8,68 }, { 9,68 }, { 10,70 }, { 11,68 }, { 12,68 }, { 13,68 }, { 14,68 } }) ;
    return ok_sofar ;
  }



  static boolean test_23 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_23") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,2,0,4,12 }, { 1,6,14 }, { 2,6,0,10,11 }, { 3,2,13 }, { 4,4,12,14 }, { 5,2,2,13,14 }, { 6,5,9,10,11 }, { 7,5,1,8,8,12 }, { 8,1,4,5,9,9 }, { 9,6,11 }, { 10,4,3,9,14 }, { 11,5,8,12 }, { 12,1,3,7,13 }, { 13,7,0,9 }, { 14,7,2,5,14 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,58 }, { 1,58 }, { 2,58 }, { 3,58 }, { 4,58 }, { 5,58 }, { 6,63 }, { 7,58 }, { 8,58 }, { 9,58 }, { 10,58 }, { 11,58 }, { 12,58 }, { 13,58 }, { 14,58 } }) ;
    return ok_sofar ;
  }



  static boolean test_24 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_24") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,1,2,8,9 }, { 1,1,8,9,9 }, { 2,2,8 }, { 3,1,12 }, { 4,1,11 }, { 5,2,1,11 }, { 6,2,4,15 }, { 7,1,1 }, { 8,2,11 }, { 9,1,0,8,15 }, { 10,1,11 }, { 11,1,2 }, { 12,1,15 }, { 13,1,8 }, { 14,1,1,7 }, { 15,2,8,9 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,9 }, { 1,10 }, { 2,5 }, { 3,11 }, { 4,6 }, { 5,12 }, { 6,12 }, { 7,11 }, { 8,5 }, { 9,9 }, { 10,6 }, { 11,5 }, { 12,10 }, { 13,6 }, { 14,12 }, { 15,9 } }) ;
    return ok_sofar ;
  }



  static boolean test_25 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_25") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,6,0 }, { 1,1,1,14 }, { 2,9,1,4,15 }, { 3,10,0 }, { 4,1,5,6,15 }, { 5,1,3 }, { 6,4,8 }, { 7,1,10 }, { 8,3,1,6 }, { 9,5,5 }, { 10,4,2,8,14 }, { 11,8,13,14 }, { 12,5,2 }, { 13,7,6,10,13 }, { 14,1,6,7,8 }, { 15,4,2,5 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,6 }, { 1,45 }, { 2,45 }, { 3,16 }, { 4,45 }, { 5,17 }, { 6,45 }, { 7,45 }, { 8,45 }, { 9,22 }, { 10,45 }, { 11,60 }, { 12,50 }, { 13,52 }, { 14,45 }, { 15,45 } }) ;
    return ok_sofar ;
  }



  static boolean test_26 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_26") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,2,4,8,13 }, { 1,1,8 }, { 2,2,11,13 }, { 3,1,6,10,12 }, { 4,3,8 }, { 5,2,7 }, { 6,2,8,10 }, { 7,3,1 }, { 8,4,4,12 }, { 9,4,5,16 }, { 10,3,10 }, { 11,4,13 }, { 12,3,0,3,12 }, { 13,1,4,9,12 }, { 14,1,4,14 }, { 15,1,8 }, { 16,2,2 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,37 }, { 1,37 }, { 2,37 }, { 3,37 }, { 4,37 }, { 5,37 }, { 6,37 }, { 7,37 }, { 8,37 }, { 9,37 }, { 10,3 }, { 11,37 }, { 12,37 }, { 13,37 }, { 14,38 }, { 15,38 }, { 16,37 } }) ;
    return ok_sofar ;
  }



  static boolean test_27 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_27") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,2,1,16 }, { 1,1,4 }, { 2,2,12 }, { 3,1,15 }, { 4,3,9,11,11 }, { 5,2,11,13 }, { 6,1,5 }, { 7,2,9,10 }, { 8,2,0,7,10 }, { 9,1,1 }, { 10,2,11 }, { 11,3,7,10,12 }, { 12,2,9 }, { 13,2,3,3,12,15 }, { 14,1,5,8 }, { 15,2,1,3 }, { 16,2,0 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,18 }, { 1,14 }, { 2,16 }, { 3,17 }, { 4,14 }, { 5,21 }, { 6,22 }, { 7,14 }, { 8,20 }, { 9,14 }, { 10,14 }, { 11,14 }, { 12,14 }, { 13,19 }, { 14,28 }, { 15,17 }, { 16,18 } }) ;
    return ok_sofar ;
  }



  static boolean test_28 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_28") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,2,2,2 }, { 1,3,16 }, { 2,2,4,6,11 }, { 3,1,14 }, { 4,2,4 }, { 5,3,14 }, { 6,2,6 }, { 7,3,1 }, { 8,1,5,14 }, { 9,2,1,5 }, { 10,2,3 }, { 11,1,5 }, { 12,1,1,8,11 }, { 13,1,11,14,15,15 }, { 14,3,0,4,15 }, { 15,3,3,14 }, { 16,1,7,8,12 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,19 }, { 1,28 }, { 2,19 }, { 3,19 }, { 4,2 }, { 5,19 }, { 6,2 }, { 7,28 }, { 8,20 }, { 9,30 }, { 10,21 }, { 11,19 }, { 12,28 }, { 13,20 }, { 14,19 }, { 15,19 }, { 16,28 } }) ;
    return ok_sofar ;
  }



  static boolean test_29 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_29") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,1,10 }, { 1,1,2,15 }, { 2,2,10,13,14 }, { 3,2,15 }, { 4,1,8 }, { 5,2,13,16,16 }, { 6,1,7,7 }, { 7,2,15,16,16 }, { 8,2,2,8,12 }, { 9,2,4 }, { 10,2,4,6 }, { 11,4,10,11,13 }, { 12,2,3,3,7 }, { 13,1,4,8 }, { 14,1,14,16 }, { 15,3,4,15 }, { 16,1,2,13 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,21 }, { 1,21 }, { 2,20 }, { 3,20 }, { 4,20 }, { 5,22 }, { 6,20 }, { 7,20 }, { 8,20 }, { 9,22 }, { 10,20 }, { 11,24 }, { 12,20 }, { 13,20 }, { 14,20 }, { 15,20 }, { 16,20 } }) ;
    return ok_sofar ;
  }



  static boolean test_30 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_30") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,2,3,18,18 }, { 1,3,7,8,15 }, { 2,2,7,8 }, { 3,1,6,7 }, { 4,2,19 }, { 5,2,3,16 }, { 6,1,6,16 }, { 7,2,1,8,16 }, { 8,1,13 }, { 9,2,6,15 }, { 10,1,0,2 }, { 11,3,5,13 }, { 12,3,16,18 }, { 13,3,13 }, { 14,2,6 }, { 15,4,1,18 }, { 16,2,2,18 }, { 17,2,2,8 }, { 18,1,7,9,17 }, { 19,3,17 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,26 }, { 1,23 }, { 2,23 }, { 3,24 }, { 4,28 }, { 5,26 }, { 6,23 }, { 7,23 }, { 8,4 }, { 9,23 }, { 10,27 }, { 11,29 }, { 12,26 }, { 13,3 }, { 14,25 }, { 15,23 }, { 16,23 }, { 17,23 }, { 18,23 }, { 19,26 } }) ;
    return ok_sofar ;
  }



  static boolean test_31 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_31") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.individual6.Sumar(new java.lang.Integer[][] { { 0,2,4 }, { 1,1,8,13 }, { 2,1,7,10 }, { 3,1,7,18 }, { 4,1,7 }, { 5,2,0,5,6 }, { 6,1,7,11 }, { 7,2,7 }, { 8,1,0,0,17 }, { 9,1,5,19 }, { 10,2,18,19 }, { 11,2,16 }, { 12,3,3,7 }, { 13,1,1 }, { 14,1,3,8,8,19 }, { 15,1,7 }, { 16,2,5,11 }, { 17,1,17 }, { 18,1,12,13,15 }, { 19,1,0,15,19 } }).doCall().checkResult(new java.lang.Integer[][] { { 0,5 }, { 1,9 }, { 2,19 }, { 3,15 }, { 4,3 }, { 5,12 }, { 6,12 }, { 7,2 }, { 8,7 }, { 9,15 }, { 10,18 }, { 11,12 }, { 12,15 }, { 13,9 }, { 14,17 }, { 15,3 }, { 16,12 }, { 17,1 }, { 18,15 }, { 19,7 } }) ;
    return ok_sofar ;
  }

}













class TestUtils {
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

class Result<E,F> implements TestResult<E,F> {
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

abstract class TestCall<E,F> implements Call<E,F> {
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

 










class Ind_grafosChecker { }

class Sumar extends TestCall<Map<Vertex<Integer>,Integer>,Integer[][]> {
  DirectedGraph<Integer,Void> g;
  Map<Integer,Vertex<Integer>> vertices;
  Map<Vertex<Integer>,String> verticeNames;
  
  public Sumar(Integer[][] graph) {
    g = new DirectedAdjacencyListGraph<Integer,Void>();
    vertices = new HashTableMap<Integer,Vertex<Integer>>();
    verticeNames = new HashTableMap<Vertex<Integer>,String>();

    for (int i=0; i<graph.length; i++) {
      int node = graph[i][0];
      int weight = graph[i][1];
      Vertex<Integer> v = g.insertVertex(weight);
      vertices.put(node,v);
      verticeNames.put(v,"v"+node);
    }

    for (int i=0; i<graph.length; i++) {
      int node = graph[i][0];
      for (int j=2; j<graph[i].length; j++) {
	g.insertDirectedEdge
	  (vertices.get(node),
	   vertices.get(graph[i][j]),
	   null);
      }
    }
  }
  
  @Override
  public String toString() {
    return "new Suma(g)\n\nwhere the graph g is:\n"+g.toString();
  }
  
  @Override
  public Map<Vertex<Integer>,Integer> call() {
    return Suma.sumVertices(g);
  }
  
  @Override
  @SuppressWarnings({"unchecked","rawtypes"})
  public boolean checkResult(Integer[][] expected) {
    if (!noException())
      return false;

    Map<Vertex<Integer>,Integer> m = result.getValue();

    if (m == null) {
      TestUtils.printError
	(TestUtils.ExecutionTime.LAST,
	 "the method sumVertices returned a null map");
      return false;
    }

    for (int i=0; i<expected.length; i++) {
      int node = expected[i][0];
      int expectedSum = expected[i][1];
      Vertex<Integer> v = vertices.get(node);
      Integer sum = m.get(v);

      if (sum == null) {
	TestUtils.printError
	  (TestUtils.ExecutionTime.LAST,
	   "\nthe method sumVertices does not contain a mapping for the vertice "+verticeNames.get(v)+
	   "\n\nReturned map: "+returnedMap(m));
	return false;
      }

      if (!sum.equals(expectedSum)) {
	TestUtils.printError
	  (TestUtils.ExecutionTime.LAST,
	   "\nthe method sumVertices returns a sum "+sum+
	   " for the vertice "+verticeNames.get(v)+
	   " which is not equal to the expected sum "+expectedSum+
	   "\n\nReturned map: "+returnedMap(m));
	return false;
      }
    }
    return true;
  }

  private String returnedMap(Map<Vertex<Integer>,Integer> m) {
    StringBuffer sb = new StringBuffer();
    Iterator<Entry<Vertex<Integer>,Integer>> it = m.entries();
    while (it.hasNext()) {
      Entry<Vertex<Integer>,Integer> entry = it.next();
      Vertex<Integer> v = entry.getKey();
      Integer sum = entry.getValue();

      String vString = "null";
      if (v != null) {
	String name = verticeNames.get(v);
	if (name == null)
	  vString = v+" (nonexistent name!)";
	else
	  vString = name;
      }

      String sumString = "null";
      if (sum != null)
	sumString = sum.toString();

      if (sb.length() > 0)
	sb.append(",");
      sb.append("("+vString+","+sumString+")");
    }
    sb.insert(0,"[");
    sb.append("]");
    return sb.toString();
  }
}




class TestData {
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
}



class ResultsHandler {

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


