
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
// File generated at: 2018/10/2 -- 21:25:20
// Seed: {1538,508319,583474}
//
//////////////////////////////////////////////////////////////////////



package aed.orderedmap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


@SuppressWarnings("unused")
public class TesterLab2 {

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
    if (args.length == 1) {
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
      if (ResultsHandler.results_ok()) System.exit(0);
      else System.exit(24);
    }
  }
}    
    

class Tests {

  static String tester = "TesterLab2";

  static boolean runTests() {
    ResultsHandler.init();

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_1());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_2());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_3());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_4());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_5());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_6());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_7());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_8());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_9());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_10());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_11());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_12());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_13());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_14());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_15());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_16());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_17());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_18());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_19());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_20());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_21());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_22());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_23());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_24());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_25());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_26());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_27());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_28());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_29());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_30());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_31());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_32());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_33());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_34());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_35());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_36());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_37());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_38());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_39());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_40());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_41());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_42());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_43());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_44());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_45());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_46());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_47());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_48());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_49());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_50());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_51());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_52());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_53());

    if (ResultsHandler.local_results_ok_sofar("orderedmap"))
      ResultsHandler.add_result("orderedmap",test_54());


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
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_2 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_2") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("no")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_3 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_3") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),null).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_4 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_4") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("yolanda")).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_5 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_5") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_6 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_6") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),null,1).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_7 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_7") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(0) ;
    return ok_sofar ;
  }



  static boolean test_8 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_8") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("ricardo")).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_9 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_9") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] {  }) ;
    return ok_sofar ;
  }



  static boolean test_10 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_10") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),0).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_11 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_11") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("francisco")).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_12 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_12") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("yolanda"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("yolanda")).doCall().checkResult(1) ;
    return ok_sofar ;
  }



  static boolean test_13 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_13") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("yolanda"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("yolanda"),2).doCall().checkResult(1) ;
    return ok_sofar ;
  }



  static boolean test_14 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_14") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),5).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("maria")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("maria"),5)) ;
    return ok_sofar ;
  }



  static boolean test_15 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_15") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),0).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),5).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_16 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_16") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("maria")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("ricardo")).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_17 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_17") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("ricardo")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("ricardo")).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_18 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_18") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("yolanda"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("miranda"),2).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("miranda")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_19 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_19") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("yolanda"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("miranda"),2).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("no")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_20 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_20") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("yolanda"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("miranda"),2).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("yolanda")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_21 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_21") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("yolanda"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("yolanda"),2).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_22 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_22") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("yolanda"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("yolanda"),2).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(1) ;
    return ok_sofar ;
  }



  static boolean test_23 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_23") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("maria")).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),0).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),null,3).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_24 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_24") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("yolanda"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("juanjo"),3).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("miriam"),5).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("abraham")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("juanjo"),3)) ;
    return ok_sofar ;
  }



  static boolean test_25 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_25") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("yolanda"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("juanjo"),3).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("miriam"),5).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("juanjo")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("juanjo"),3)) ;
    return ok_sofar ;
  }



  static boolean test_26 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_26") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("yolanda"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("juanjo"),3).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("miriam"),5).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("maria")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("miriam"),5)) ;
    return ok_sofar ;
  }



  static boolean test_27 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_27") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("yolanda"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("juanjo"),3).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("miriam"),5).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("zoe")).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_28 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_28") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("yolanda"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("juanjo"),3).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("miriam"),5).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("abraham")).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_29 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_29") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("yolanda"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("juanjo"),3).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("miriam"),5).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("juanjo")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("juanjo"),3)) ;
    return ok_sofar ;
  }



  static boolean test_30 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_30") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("yolanda"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("juanjo"),3).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("miriam"),5).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("maria")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("juanjo"),3)) ;
    return ok_sofar ;
  }



  static boolean test_31 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_31") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("yolanda"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("juanjo"),3).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("miriam"),5).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("zoe")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("yolanda"),1)) ;
    return ok_sofar ;
  }



  static boolean test_32 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_32") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("yolanda"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("juanjo"),3).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("miriam"),5).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("juanjo"),new String("miriam"),new String("yolanda") }) ;
    return ok_sofar ;
  }



  static boolean test_33 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_33") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),0).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("maria")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),4).doCall().checkResult(1) ;
    return ok_sofar ;
  }



  static boolean test_34 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_34") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),null,2).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),0).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("ricardo")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("francisco")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),2).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_35 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_35") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("francisco")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("maria") }) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(1) ;
    return ok_sofar ;
  }



  static boolean test_36 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_36") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("yolanda"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("yolanda")).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("yolanda")).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("yolanda")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("yolanda"),2).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("yolanda")).doCall().checkResult(2) ;
    return ok_sofar ;
  }



  static boolean test_37 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_37") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("francisco")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),3).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),2).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),0).doCall().checkResult(2) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),2).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_38 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_38") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("maria")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("paloma")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("ricardo")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),2).doCall().checkResult(1) ;
    return ok_sofar ;
  }



  static boolean test_39 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_39") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),null).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("maria")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("ricardo")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(true) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),2).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("francisco")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),4).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_40 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_40") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("ricardo")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),0).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("ricardo")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("maria"),0)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("ricardo")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),6).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("paloma")).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_41 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_41") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),null,1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),0).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("ricardo") }) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("ricardo") }) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("ricardo") }) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("ricardo")).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),4).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),2).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),1).doCall().checkResult(4) ;
    return ok_sofar ;
  }



  static boolean test_42 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_42") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),3).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("maria")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),9).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("paloma")).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(2) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("paloma")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("ricardo"),9)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(2) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("francisco"),new String("ricardo") }) ;
    return ok_sofar ;
  }



  static boolean test_43 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_43") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("ricardo")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("maria")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),null).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("francisco")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(true) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("paloma")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("maria")).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(0) ;
    return ok_sofar ;
  }



  static boolean test_44 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_44") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("maria")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),0).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("francisco")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("francisco")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),0).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("maria")).doCall().checkResult(true) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("ricardo")).doCall().checkResult(true) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),0).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(3) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),0).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("ricardo")).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("maria")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("maria"),0)) ;
    return ok_sofar ;
  }



  static boolean test_45 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_45") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),2).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("maria")).doCall().checkResult(true) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),4).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),2).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("francisco"),new String("maria"),new String("paloma") }) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),2).doCall().checkResult(2) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),2).doCall().checkResult(4) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("maria")).doCall().checkResult(2) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("maria")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("francisco")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("francisco"),2)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),5).doCall().checkResult(2) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("francisco"),new String("paloma") }) ;
    return ok_sofar ;
  }



  static boolean test_46 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_46") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),4).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("ricardo")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("ricardo")).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("maria")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),3).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("francisco"),new String("paloma"),new String("ricardo") }) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),3).doCall().checkResult(3) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("francisco"),new String("paloma"),new String("ricardo") }) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),1).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),2).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),3).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("maria")).doCall().checkResult(2) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("francisco"),new String("paloma"),new String("ricardo") }) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("ricardo")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("ricardo"),3)) ;
    return ok_sofar ;
  }



  static boolean test_47 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_47") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("ricardo")).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),0).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),0).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("maria")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),0).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),0).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("francisco")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("paloma"),0)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("ricardo")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("ricardo"),0)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("paloma"),new String("ricardo") }) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("paloma")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("paloma"),0)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),0).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("francisco")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("paloma"),0)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("paloma")).doCall().checkResult(0) ;
    return ok_sofar ;
  }



  static boolean test_48 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_48") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] {  }) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(true) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(true) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("francisco")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("ricardo")).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),2).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),null).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("paloma")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("francisco")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(2) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("maria"),new String("ricardo") }) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("ricardo")).doCall().checkResult(2) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("paloma")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("paloma")).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_49 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_49") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),7).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("maria") }) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),3).doCall().checkResult(7) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("maria")).doCall().checkResult(3) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),3).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("francisco")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("francisco")).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),6).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),null).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),0).doCall().checkResult(6) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),2).doCall().checkResult(3) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("paloma")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("paloma"),0)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),4).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("paloma")).doCall().checkResult(4) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),null,5).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),null).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),5).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("ricardo")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("ricardo"),3)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("ricardo")).doCall().checkResult(3) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),8).doCall().checkResult(2) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("francisco")).doCall().checkResult(5) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("maria")).doCall().checkResult(8) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),4).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),6).doCall().checkResult(4) ;
    return ok_sofar ;
  }



  static boolean test_50 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_50") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] {  }) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("paloma")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),7).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),6).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("maria")).doCall().checkResult(7) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),null,7).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),8).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("ricardo")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),1).doCall().checkResult(6) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(2) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(2) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("francisco"),new String("maria") }) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),7).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),0).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("ricardo")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("ricardo"),0)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),3).doCall().checkResult(8) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),5).doCall().checkResult(7) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("maria")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("maria"),3)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("maria")).doCall().checkResult(true) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("francisco"),new String("maria"),new String("paloma"),new String("ricardo") }) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("ricardo")).doCall().checkResult(true) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),4).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),6).doCall().checkResult(5) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),4).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("francisco")).doCall().checkResult(4) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(3) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),3).doCall().checkResult(4) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("maria"),new String("paloma"),new String("ricardo") }) ;
    return ok_sofar ;
  }



  static boolean test_51 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_51") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),0).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("francisco")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("francisco")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("ricardo"),0)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("ricardo")).doCall().checkResult(true) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),0).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("ricardo")).doCall().checkResult(true) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(3) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(3) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),0).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),0).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("ricardo")).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),1).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("francisco"),new String("paloma") }) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),0).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),0).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(3) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),0).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("ricardo")).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),1).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),0).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),0).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("francisco")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("francisco"),1)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),1).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("maria")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("maria"),0)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),0).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),1).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("francisco"),new String("maria"),new String("paloma"),new String("ricardo") }) ;
    return ok_sofar ;
  }



  static boolean test_52 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_52") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(true) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),0).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),3).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("maria")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),3).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(2) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("francisco"),new String("paloma") }) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("maria")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),0).doCall().checkResult(3) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("paloma")).doCall().checkResult(true) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("paloma")).doCall().checkResult(3) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),0).doCall().checkResult(3) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("paloma")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("paloma"),0)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),0).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),2).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),3).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),0).doCall().checkResult(3) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),1).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("francisco")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("francisco"),1)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),1).doCall().checkResult(2) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("maria")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("maria"),1)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("francisco")).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),0).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("maria")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("maria"),1)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),0).doCall().checkResult(0) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(4) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("ricardo")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("ricardo"),0)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),1).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(4) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("francisco")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("francisco"),1)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(4) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("francisco")).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("maria")).doCall().checkResult(1) ;
    return ok_sofar ;
  }



  static boolean test_53 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_53") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] {  }) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("francisco")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("francisco"),1)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("ricardo")).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),7).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),null).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),6).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("francisco")).doCall().checkResult(true) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("maria")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("maria"),7)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("francisco")).doCall().checkResult(true) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),0).doCall().checkResult(6) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("francisco")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("francisco"),1)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("francisco")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("francisco"),1)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("maria")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("maria"),7)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),6).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Size(v_0.getValue()).doCall().checkResult(3) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("francisco"),new String("maria"),new String("paloma") }) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),null).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("paloma")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("paloma"),0)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),7).doCall().checkResult(6) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),null).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),1).doCall().checkResult(7) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),6).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("maria")).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),6).doCall().checkResult(7) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),7).doCall().checkResult(6) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("ricardo")).doCall().checkResult(7) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),6).doCall().checkResult(6) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("francisco")).doCall().checkResult(6) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("maria")).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_54 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_54") ;
    boolean ok_sofar = true ;
    TestResult<OrderedMap<java.lang.String,java.lang.Integer>,Boolean> v_0 = null ;
    
    if (ok_sofar)
    {
      v_0 = new aed.orderedmap.Constructor().doCall() ;
      ok_sofar = v_0.checkResult(null) ;
    }
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("francisco")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("francisco")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("francisco"),1)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("francisco") }) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),5).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("ricardo"),1).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("francisco")).doCall().checkResult(true) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("maria")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("paloma")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("paloma"),5)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("francisco"),new String("paloma"),new String("ricardo") }) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("maria")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("francisco")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("francisco"),1)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("francisco")).doCall().checkResult(true) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("maria")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Get(v_0.getValue(),new String("paloma")).doCall().checkResult(5) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("maria")).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("ricardo")).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("maria")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("ricardo")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.CeilingEntry(v_0.getValue(),new String("maria")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("paloma"),5)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("francisco")).doCall().checkResult(1) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),6).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.ContainsKey(v_0.getValue(),new String("ricardo")).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),3).doCall().checkResult(5) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Keys(v_0.getValue()).doCall().checkResult(new java.lang.String[] { new String("francisco"),new String("paloma") }) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("francisco")).doCall().checkResult(6) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),new String("paloma")).doCall().checkResult(new aed.orderedmap.EntryImpl<String,Integer>(new String("paloma"),3)) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("francisco")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.FloorEntry(v_0.getValue(),null).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.IsEmpty(v_0.getValue()).doCall().checkResult(false) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("maria")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("francisco"),6).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("paloma"),6).doCall().checkResult(3) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Remove(v_0.getValue(),new String("ricardo")).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = new aed.orderedmap.Put(v_0.getValue(),new String("maria"),3).doCall().checkResult(null) ;
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

      if (!TestData.getTrace().equals("")) {
	  System.out.print(callSeqString(time)+"\n");
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
    if (TestData.testName != "") {
      System.out.println("\n*** Warning for "+TestData.testName+": ");
    } else
      System.out.println("\n*** Warning:");

    if (TestData.getTrace() != "") {
      System.out.print(callSeqString(time)+"\n");
      System.out.println(TestData.getTrace());
    }
    System.out.println(msg+"\n");
  }

  static void printError(ExecutionTime time, String msg) {
      System.out.println("\n\n***********************************************");
      System.out.println("*** Error in "+TestData.testName+": ");

      if (!TestData.getTrace().equals("")) {
        System.out.print(callSeqString(time)+"\n");
        System.out.println(TestData.getTrace());
      }
      System.out.println(msg+"\n");
  }

  static String callSeqString(ExecutionTime time) {
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

 





class Constructor extends TestCall<OrderedMap<String,Integer>,Boolean> {
  public Constructor() { }

  @Override
  public String toString() {
    return "OrderedMap map = new PositionListOrderedMap()";
  }
  
  @Override
  public OrderedMap<String,Integer> call() {
    return new PositionListOrderedMap<String,Integer>(new StringComparator());
  }

  @Override
  public boolean checkResult(Boolean b) {
    return noException() && nonNull();
  }
}


class Put extends TestCall<Integer,Integer> {
  private OrderedMap<String,Integer> map;
  private String key;
  private Integer value;
  
  public Put(OrderedMap<String,Integer> map, String key, Integer value) {
    this.map = map;
    this.key = key;
    this.value = value;
  }

  @Override
  public String toString() {
    return "map.put("+PosmapsChecker.keyToString(key)+",\""+value+")";
  }
  
  @Override
  public Integer call () throws InvalidKeyException {
    return map.put(key,value);
  }

  @Override
  public boolean checkResult(Integer expectedValue) {
    if (key == null)
      return throwsException("aed.orderedmap.InvalidKeyException");
    else      
      return noException() && valuesMatch(expectedValue);
  }
}


class Remove extends TestCall<Integer,Integer> {
  private OrderedMap<String,Integer> map;
  private String key;
  
  public Remove(OrderedMap<String,Integer> map, String key) {
    this.map = map;
    this.key = key;
  }

  @Override
  public String toString() {
    return "map.remove("+PosmapsChecker.keyToString(key)+")";
  }
  
  @Override
  public Integer call () throws InvalidKeyException {
    return map.remove(key);
  }

  @Override
  public boolean checkResult(Integer expectedValue) {
    if (key == null)
      return throwsException("aed.orderedmap.InvalidKeyException");
    else      
      return noException() && valuesMatch(expectedValue);
  }
}


class Get extends TestCall<Integer,Integer> {
  private OrderedMap<String,Integer> map;
  private String key;
  
  public Get(OrderedMap<String,Integer> map, String key) {
    this.map = map;
    this.key = key;
  }

  @Override
  public String toString() {
    return "map.get("+PosmapsChecker.keyToString(key)+")";
  }
  
  @Override
  public Integer call () throws InvalidKeyException {
    return map.get(key);
  }

  @Override
  public boolean checkResult(Integer expectedValue) {
    if (key == null)
      return throwsException("aed.orderedmap.InvalidKeyException");
    else      
      return noException() && valuesMatch(expectedValue);
  }
}

class ContainsKey extends TestCall<Boolean,Boolean> {
  private OrderedMap<String,Integer> map;
  private String key;
  
  public ContainsKey(OrderedMap<String,Integer> map, String key) {
    this.map = map;
    this.key = key;
  }

  @Override
  public String toString() {
    return "map.containsKey("+PosmapsChecker.keyToString(key)+")";
  }
  
  @Override
  public Boolean call () throws InvalidKeyException {
    return map.containsKey(key);
  }

  @Override
  public boolean checkResult(Boolean expectedValue) {
    if (key == null)
      return throwsException("aed.orderedmap.InvalidKeyException");
    else      
      return noException() && valuesMatch(expectedValue);
  }
}

class IsEmpty extends TestCall<Boolean,Boolean> {
  private OrderedMap<String,Integer> map;
  
  public IsEmpty(OrderedMap<String,Integer> map) {
    this.map = map;
  }

  @Override
  public String toString() {
    return "map.isEmpty()";
  }
  
  @Override
  public Boolean call () throws InvalidKeyException {
    return map.isEmpty();
  }

  @Override
  public boolean checkResult(Boolean expectedValue) {
    return noException() && valuesMatch(expectedValue);
  }
}

class Size extends TestCall<Integer,Integer> {
  private OrderedMap<String,Integer> map;
  
  public Size(OrderedMap<String,Integer> map) {
    this.map = map;
  }

  @Override
  public String toString() {
    return "map.size()";
  }
  
  @Override
  public Integer call () throws InvalidKeyException {
    return map.size();
  }

  @Override
  public boolean checkResult(Integer expectedValue) {
    return noException() && valuesMatch(expectedValue);
  }
}

/**
class FirstEntry extends TestCall<Entry<String,Integer>,Entry<String,Integer>> {
  private OrderedMap<String,Integer> map;
  
  public FirstEntry(OrderedMap<String,Integer> map) {
    this.map = map;
  }

  @Override
  public String toString() {
    return "map.firstEntry()";
  }
  
  @Override
  public Entry<String,Integer> call () throws InvalidKeyException {
    return map.firstEntry();
  }

  @Override
  public boolean checkResult(Entry<String,Integer> expectedValue) {
    return noException() && valuesMatch(expectedValue);
  }
}

class LastEntry extends TestCall<Entry<String,Integer>,Entry<String,Integer>> {
  private OrderedMap<String,Integer> map;
  
  public LastEntry(OrderedMap<String,Integer> map) {
    this.map = map;
  }

  @Override
  public String toString() {
    return "map.lastEntry()";
  }
  
  @Override
  public Entry<String,Integer> call () throws InvalidKeyException {
    return map.lastEntry();
  }

  @Override
  public boolean checkResult(Entry<String,Integer> expectedValue) {
    return noException() && valuesMatch(expectedValue);
  }
}
*/

class CeilingEntry extends TestCall<Entry<String,Integer>,Entry<String,Integer>> {
  private OrderedMap<String,Integer> map;
  private String key;
  
  public CeilingEntry(OrderedMap<String,Integer> map, String key) {
    this.map = map;
    this.key = key;
  }

  @Override
  public String toString() {
    return "map.ceilingEntry("+PosmapsChecker.keyToString(key)+")";
  }
  
  @Override
  public Entry<String,Integer> call () throws InvalidKeyException {
    return map.ceilingEntry(key);
  }

  @Override
  public boolean checkResult(Entry<String,Integer> expectedValue) {
    if (key == null)
      return throwsException("aed.orderedmap.InvalidKeyException");
    else      
      return noException() && valuesMatch(expectedValue);
  }
}

class FloorEntry extends TestCall<Entry<String,Integer>,Entry<String,Integer>> {
  private OrderedMap<String,Integer> map;
  private String key;
  
  public FloorEntry(OrderedMap<String,Integer> map, String key) {
    this.map = map;
    this.key = key;
  }

  @Override
  public String toString() {
    return "map.floorEntry("+PosmapsChecker.keyToString(key)+")";
  }
  
  @Override
  public Entry<String,Integer> call () throws InvalidKeyException {
    return map.floorEntry(key);
  }

  @Override
  public boolean checkResult(Entry<String,Integer> expectedValue) {
    if (key == null)
      return throwsException("aed.orderedmap.InvalidKeyException");
    else      
      return noException() && valuesMatch(expectedValue);
  }
}

/**
class Values extends TestCall<Iterable<Integer>,Integer[]> {
  private OrderedMap<String,Integer> map;
  
  public Values(OrderedMap<String,Integer> map) {
    this.map = map;
  }

  @Override
  public String toString() {
    return "map.values()";
  }
  
  @Override
  public Iterable<Integer> call () throws InvalidKeyException {
    return map.values();
  }

  @Override
  public boolean checkResult(Integer[] expectedValue) {
    return
      noException() &&
      TestUtils.iterableCorrect(toString(),expectedValue,result.getValue());
  }
}
*/

class Keys extends TestCall<Iterable<String>,String[]> {
  private OrderedMap<String,Integer> map;
  
  public Keys(OrderedMap<String,Integer> map) {
    this.map = map;
  }

  @Override
  public String toString() {
    return "map.keys()";
  }
  
  @Override
  public Iterable<String> call () throws InvalidKeyException {
    return map.keys();
  }

  @Override
  public boolean checkResult(String[] expectedValue) {
    return 
      noException() &&
      TestUtils.iterableCorrect(toString(),expectedValue,result.getValue());
  }
}

class StringComparator implements Comparator<String> {
    public StringComparator() { }

    public int compare(String o1, String o2) {
	return o1.compareTo(o2);
    }
}


class PosmapsChecker {
  public static String keyToString(String key) {
    if (key == null) return "null";
    else return "\""+key.toString()+"\"";
  }
}


class TestData {
  static String testName = "";

  static StringBuffer trace;

  public static void initTrace() {
    trace = new StringBuffer();
  }

  public static void addCallToTrace(String callString) {
    if (trace.length() > 0)
      trace.append("\n");
    trace.append("  "+callString+";");
  }

  public static String getTrace() {
    return trace.toString();
  }

  
}



class ResultsHandler {

  static HashMap<String,Boolean> results_sofar;
  static HashMap<String,Boolean> general_results;

  static void init() {
    results_sofar = new HashMap<String,Boolean>();
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


