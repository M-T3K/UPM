
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
// File generated at: 2018/10/26 -- 0:51:20
// Seed: {1540,507879,608353}
//
//////////////////////////////////////////////////////////////////////



package aed.recursiveUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.positionlist.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;


@SuppressWarnings("unused")
public class TesterLab3 {

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

  static String tester = "TesterLab3";

  static boolean runTests() {
    ResultsHandler.init();

    if (ResultsHandler.local_results_ok_sofar("recursionCheck"))
      ResultsHandler.add_result("recursionCheck",test_1());

    if (ResultsHandler.local_results_ok_sofar("recursionCheck"))
      ResultsHandler.add_result("recursionCheck",test_2());

    if (ResultsHandler.local_results_ok_sofar("recursionCheck"))
      ResultsHandler.add_result("recursionCheck",test_3());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_4());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_5());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_6());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_7());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_8());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_9());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_10());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_11());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_12());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_13());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_14());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_15());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_16());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_17());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_18());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_19());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_20());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_21());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_22());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_23());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_24());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_25());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_26());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_27());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_28());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_29());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_30());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_31());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_32());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_33());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_34());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_35());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_36());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_37());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_38());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_39());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_40());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_41());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_42());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_43());

    if (ResultsHandler.local_results_ok_sofar("getPosition"))
      ResultsHandler.add_result("getPosition",test_44());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_45());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_46());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_47());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_48());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_49());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_50());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_51());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_52());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_53());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_54());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_55());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_56());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_57());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_58());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_59());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_60());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_61());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_62());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_63());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_64());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_65());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_66());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_67());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_68());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_69());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_70());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_71());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_72());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_73());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_74());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_75());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_76());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_77());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_78());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_79());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_80());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_81());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_82());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_83());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_84());

    if (ResultsHandler.local_results_ok_sofar("decrypt"))
      ResultsHandler.add_result("decrypt",test_85());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_86());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_87());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_88());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_89());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_90());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_91());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_92());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_93());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_94());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_95());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_96());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_97());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_98());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_99());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_100());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_101());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_102());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_103());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_104());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_105());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_106());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_107());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_108());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_109());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_110());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_111());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_112());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_113());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_114());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_115());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_116());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_117());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_118());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_119());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_120());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_121());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_122());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_123());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_124());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_125());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_126());


    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_85());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_86());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_87());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_88());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_89());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_90());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_91());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_92());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_93());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_94());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_95());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_96());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_97());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_98());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_99());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_100());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_101());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_102());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_103());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_104());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_105());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_106());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_107());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_108());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_109());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_110());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_111());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_112());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_113());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_114());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_115());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_116());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_117());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_118());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_119());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_120());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_121());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_122());

    if (ResultsHandler.local_results_ok_sofar("isBalanced"))
      ResultsHandler.add_result("isBalanced",test_new_123());

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
      ok_sofar = new aed.recursiveUtils.RecursionCheck(new String("decrypt"),2).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_2 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_2") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.RecursionCheck(new String("getPosition"),3).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_3 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_3") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.RecursionCheck(new String("isBalanced"),1).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_4 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_4") ;
    boolean ok_sofar = true ;
    
    return ok_sofar ;
  }



  static boolean test_5 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_5") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 182,707,84,544,765,362,536,161,351,518 },5,0).doCall().checkResult(362) ;
    return ok_sofar ;
  }



  static boolean test_6 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_6") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 223,304,197,916,683,107,852 },3,0).doCall().checkResult(916) ;
    return ok_sofar ;
  }



  static boolean test_7 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_7") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 298,802,990,429,114,360,105,42,911,479 },5,0).doCall().checkResult(360) ;
    return ok_sofar ;
  }



  static boolean test_8 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_8") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 336,465,542,747,449,887,829 },3,0).doCall().checkResult(747) ;
    return ok_sofar ;
  }



  static boolean test_9 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_9") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 350,697,761,228,238,685,901,67,973 },4,0).doCall().checkResult(238) ;
    return ok_sofar ;
  }



  static boolean test_10 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_10") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 418,924,810,99,94 },2,0).doCall().checkResult(810) ;
    return ok_sofar ;
  }



  static boolean test_11 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_11") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 555,17,11,184,340,152,452,69 },4,0).doCall().checkResult(340) ;
    return ok_sofar ;
  }



  static boolean test_12 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_12") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 587,528,71,37,625,305,622,731,613 },4,0).doCall().checkResult(625) ;
    return ok_sofar ;
  }



  static boolean test_13 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_13") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 753,27,34 },1,0).doCall().checkResult(27) ;
    return ok_sofar ;
  }



  static boolean test_14 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_14") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 784,611,546,470,569,982,394 },3,0).doCall().checkResult(470) ;
    return ok_sofar ;
  }



  static boolean test_15 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_15") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 873,228,324,172,556,276 },3,0).doCall().checkResult(172) ;
    return ok_sofar ;
  }



  static boolean test_16 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_16") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 954,721,529,108,678,242,769,833,296,428 },5,0).doCall().checkResult(242) ;
    return ok_sofar ;
  }



  static boolean test_17 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_17") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 955,668,244,83 },2,0).doCall().checkResult(244) ;
    return ok_sofar ;
  }



  static boolean test_18 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_18") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 177,669,546,27,572 },2,1).doCall().checkResult(27) ;
    return ok_sofar ;
  }



  static boolean test_19 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_19") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 282,898,229,260,799,740 },3,1).doCall().checkResult(799) ;
    return ok_sofar ;
  }



  static boolean test_20 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_20") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 500,82,623,124,465,382,846 },3,-1).doCall().checkResult(623) ;
    return ok_sofar ;
  }



  static boolean test_21 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_21") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 568,471,176,820,754,585,543,790 },4,-1).doCall().checkResult(820) ;
    return ok_sofar ;
  }



  static boolean test_22 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_22") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 715,671,374,11,356 },2,1).doCall().checkResult(11) ;
    return ok_sofar ;
  }



  static boolean test_23 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_23") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 757,380,647,670,946 },2,-1).doCall().checkResult(380) ;
    return ok_sofar ;
  }



  static boolean test_24 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_24") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 783,697,119,926,379,816,197,275,487,932 },5,-1).doCall().checkResult(379) ;
    return ok_sofar ;
  }



  static boolean test_25 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_25") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 820,362,86,460,251,483,824,183,787 },4,1).doCall().checkResult(483) ;
    return ok_sofar ;
  }



  static boolean test_26 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_26") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 939,104,437,833,194,614,949 },3,-1).doCall().checkResult(437) ;
    return ok_sofar ;
  }



  static boolean test_27 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_27") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 32,990,343,321,774,331 },3,2).doCall().checkResult(331) ;
    return ok_sofar ;
  }



  static boolean test_28 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_28") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 185,606,677,207,607,284,923,941,600,483 },5,2).doCall().checkResult(941) ;
    return ok_sofar ;
  }



  static boolean test_29 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_29") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 323,889,438,701,81,215,433,96,250,92 },5,-2).doCall().checkResult(701) ;
    return ok_sofar ;
  }



  static boolean test_30 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_30") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 395,447,320,655,350,250,625 },3,2).doCall().checkResult(250) ;
    return ok_sofar ;
  }



  static boolean test_31 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_31") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 428,342,450,464,287 },2,2).doCall().checkResult(287) ;
    return ok_sofar ;
  }



  static boolean test_32 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_32") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 570,287,292,962,496,692,772,747,946,774 },5,2).doCall().checkResult(747) ;
    return ok_sofar ;
  }



  static boolean test_33 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_33") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 764,372,258,464,47,861,691,161,307 },4,-2).doCall().checkResult(258) ;
    return ok_sofar ;
  }



  static boolean test_34 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_34") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 812,117,69,893,492,981,213,423,475 },4,2).doCall().checkResult(213) ;
    return ok_sofar ;
  }



  static boolean test_35 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_35") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 945,563,827,532,795,5,171,63,682 },4,-2).doCall().checkResult(827) ;
    return ok_sofar ;
  }



  static boolean test_36 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_36") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 84,431,997,411,325,517,623,939,484,128 },5,3).doCall().checkResult(484) ;
    return ok_sofar ;
  }



  static boolean test_37 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_37") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 241,81,60,680,473,717,370 },3,-3).doCall().checkResult(241) ;
    return ok_sofar ;
  }



  static boolean test_38 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_38") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 679,40,814,93,744,875 },3,-3).doCall().checkResult(679) ;
    return ok_sofar ;
  }



  static boolean test_39 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_39") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 713,79,987,147,78,899,616,266,329 },4,3).doCall().checkResult(266) ;
    return ok_sofar ;
  }



  static boolean test_40 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_40") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 716,388,689,173,199,545,361,501,888,917 },5,3).doCall().checkResult(888) ;
    return ok_sofar ;
  }



  static boolean test_41 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_41") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 910,251,925,340,175,712,759,885 },4,-3).doCall().checkResult(251) ;
    return ok_sofar ;
  }



  static boolean test_42 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_42") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 994,682,829,159,179,675,435 },3,3).doCall().checkResult(435) ;
    return ok_sofar ;
  }



  static boolean test_43 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_43") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 637,103,869,552,391,879,183,461,627,514 },5,4).doCall().checkResult(514) ;
    return ok_sofar ;
  }



  static boolean test_44 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_44") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.GetPosition(new Integer[] { 697,589,868,228,343,102,720,951,662,313 },5,-5).doCall().checkResult(697) ;
    return ok_sofar ;
  }



  static boolean test_45 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_45") ;
    boolean ok_sofar = true ;
    
    return ok_sofar ;
  }



  static boolean test_46 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_46") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 97,105,100,97 },new Character[] { 97,101,109,103,32,114,99,107,122,117,111,121,120,102,118,106,108,98,110,104,100,119,105,113,116,112,115 },new Integer[] { 0,22,-2,-20 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_47 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_47") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 97,105,100,97 },new Character[] { 104,97,102,116,110,108,114,100,120,113,98,105,112,115,121,109,117,103,107,111,118,119,106,122,99,101,32 },new Integer[] { 1,10,-4,-6 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_48 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_48") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 97,105,100,97 },new Character[] { 112,105,117,115,102,104,116,109,118,107,97,106,122,103,120,113,108,101,98,121,99,110,111,32,119,114,100 },new Integer[] { 10,-9,25,-16 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_49 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_49") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 97,105,100,97 },new Character[] { 119,115,104,118,111,120,98,108,117,113,102,103,97,121,101,116,122,112,32,114,99,110,100,107,105,106,109 },new Integer[] { 12,12,-2,-10 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_50 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_50") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 97,105,100,97 },new Character[] { 102,110,119,117,99,121,101,105,108,109,32,115,111,97,120,116,98,100,122,112,106,114,113,118,103,107,104 },new Integer[] { 13,-6,10,-4 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_51 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_51") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 97,105,100,97 },new Character[] { 119,32,120,112,98,101,115,103,121,116,110,114,105,117,97,118,113,109,108,107,106,122,104,100,102,111,99 },new Integer[] { 14,-2,11,-9 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_52 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_52") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 116,111,114,114,101,110,116,101 },new Character[] { 108,105,116,101,102,112,109,120,122,97,107,113,106,103,118,100,111,32,98,99,115,119,114,110,104,121,117 },new Integer[] { 2,14,6,0,-19,20,-21,1 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_53 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_53") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 116,111,114,114,101,110,116,101 },new Character[] { 120,117,114,106,122,105,121,100,115,104,109,101,103,102,119,116,99,111,98,118,108,107,32,112,113,97,110 },new Integer[] { 15,2,-15,0,9,15,-11,-4 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_54 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_54") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 115,116,97,114,32,119,97,114,115 },new Character[] { 101,100,116,113,105,117,115,110,122,98,97,109,112,111,99,121,102,32,118,108,106,104,107,103,119,114,120 },new Integer[] { 6,-4,8,15,-8,7,-14,15,-19 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_55 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_55") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 115,116,97,114,32,119,97,114,115 },new Character[] { 100,113,101,110,111,121,120,122,115,109,114,118,105,112,116,102,104,97,98,117,108,106,119,32,99,103,107 },new Integer[] { 8,6,3,-7,13,-1,-5,-7,-2 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_56 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_56") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 115,116,97,114,32,119,97,114,115 },new Character[] { 110,103,122,107,119,111,108,113,104,109,32,116,118,97,114,106,102,101,105,120,99,100,98,121,112,115,117 },new Integer[] { 25,-14,2,1,-4,-6,9,1,11 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_57 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_57") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 98,117,101,110,97,32,115,117,101,114,116,101 },new Character[] { 98,100,119,107,32,97,104,101,110,114,112,106,102,118,116,105,117,111,113,121,103,115,109,108,120,122,99 },new Integer[] { 0,16,-9,1,-3,-1,17,-5,-9,2,5,-7 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_58 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_58") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 98,117,101,110,97,32,115,117,101,114,116,101 },new Character[] { 109,117,116,110,114,107,119,113,98,108,106,105,32,99,112,111,122,120,102,121,97,101,115,104,100,103,118 },new Integer[] { 8,-7,20,-18,17,-8,10,-21,20,-17,-2,19 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_59 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_59") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 98,117,101,110,97,32,115,117,101,114,116,101 },new Character[] { 104,120,107,97,99,106,103,119,117,98,118,105,112,111,114,113,122,101,108,115,110,121,32,102,100,109,116 },new Integer[] { 9,-1,9,3,-17,19,-3,-11,9,-3,12,-9 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_60 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_60") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 98,117,101,110,97,32,115,117,101,114,116,101 },new Character[] { 109,113,97,32,121,118,122,101,105,114,103,98,104,106,116,110,108,99,112,102,120,111,117,119,100,115,107 },new Integer[] { 11,11,-15,8,-13,1,22,-3,-15,2,5,-7 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_61 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_61") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 98,117,101,110,97,32,115,117,101,114,116,101 },new Character[] { 117,121,113,119,114,101,105,102,107,111,97,108,32,115,122,120,109,98,104,118,110,99,100,112,106,103,116 },new Integer[] { 17,-17,5,15,-10,2,1,-13,5,-1,22,-21 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_62 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_62") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 98,117,101,110,97,32,115,117,101,114,116,101 },new Character[] { 108,106,107,105,32,118,103,99,100,116,101,111,114,97,104,115,119,109,120,117,98,110,112,113,121,102,122 },new Integer[] { 20,-1,-9,11,-8,-9,11,4,-9,2,-3,1 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_63 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_63") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 98,117,101,110,97,32,115,117,101,114,116,101 },new Character[] { 109,102,32,122,117,112,97,110,105,113,118,120,114,115,116,103,104,108,101,111,107,119,98,100,106,121,99 },new Integer[] { 22,-18,14,-11,-1,-4,11,-9,14,-6,2,4 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_64 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_64") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 98,117,101,110,97,32,115,117,101,114,116,101 },new Character[] { 120,97,103,99,32,119,111,104,107,100,108,121,122,117,113,115,105,106,109,116,101,110,118,98,112,102,114 },new Integer[] { 23,-10,7,1,-20,3,11,-2,7,6,-7,1 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_65 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_65") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 98,117,101,110,97,32,115,117,101,114,116,101 },new Character[] { 120,115,32,121,107,97,102,112,113,103,104,108,116,99,105,106,109,101,117,100,111,118,110,98,119,114,122 },new Integer[] { 23,-5,-1,5,-17,-3,-1,17,-1,8,-13,5 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_66 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_66") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 98,117,101,110,97,32,115,117,101,114,116,101 },new Character[] { 121,116,107,122,99,115,114,113,109,104,110,101,97,102,32,103,112,111,100,119,108,106,118,105,120,98,117 },new Integer[] { 25,1,-15,-1,2,2,-9,21,-15,-5,-5,10 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_67 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_67") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 109,117,99,104,111,32,100,105,110,101,114,111 },new Character[] { 108,109,102,106,115,105,98,112,103,110,111,113,99,116,100,122,117,32,121,119,118,97,114,104,101,120,107 },new Integer[] { 1,15,-4,11,-13,7,-3,-9,4,15,-2,-12 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_68 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_68") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 109,117,99,104,111,32,100,105,110,101,114,111 },new Character[] { 121,101,119,116,112,98,110,114,108,109,97,122,115,103,102,100,120,113,106,104,105,117,111,99,32,107,118 },new Integer[] { 9,12,2,-4,3,2,-9,5,-14,-5,6,15 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_69 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_69") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 109,117,99,104,111,32,100,105,110,101,114,111 },new Character[] { 100,101,32,110,97,99,103,111,122,102,118,116,105,109,115,120,108,119,117,114,106,113,107,121,98,112,104 },new Integer[] { 13,5,-13,21,-19,-5,-2,12,-9,-2,18,-12 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_70 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_70") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 109,117,99,104,111,32,100,105,110,101,114,111 },new Character[] { 108,103,120,99,102,110,100,118,115,101,117,119,32,105,109,114,113,107,106,112,122,121,111,104,116,98,97 },new Integer[] { 14,-4,-7,20,-1,-10,-6,7,-8,4,6,7 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_71 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_71") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 109,117,99,104,111,32,100,105,110,101,114,111 },new Character[] { 116,119,112,97,100,120,118,101,115,99,107,32,121,110,113,111,98,106,122,117,103,104,102,109,114,108,105 },new Integer[] { 23,-4,-10,12,-6,-4,-7,22,-13,-6,17,-9 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_72 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_72") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 109,117,99,104,111,32,100,105,110,101,114,111 },new Character[] { 116,119,107,122,120,106,117,104,32,113,108,97,103,115,101,111,118,98,112,110,102,114,105,100,121,99,109 },new Integer[] { 26,-20,19,-18,8,-7,15,-1,-3,-5,7,-6 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_73 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_73") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 109,117,99,104,111,32,100,105,110,101,114,111 },new Character[] { 116,103,101,105,111,98,122,113,107,119,121,100,32,104,112,120,118,115,106,102,99,108,114,117,110,97,109 },new Integer[] { 26,-3,-3,-7,-9,8,-1,-8,21,-22,20,-18 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_74 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_74") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 109,117,99,104,97,32,102,101,108,105,99,105,100,97,100 },new Character[] { 109,99,112,32,115,110,103,114,105,98,106,111,120,107,118,97,121,102,119,113,116,122,100,108,104,117,101 },new Integer[] { 0,25,-24,23,-9,-12,14,9,-3,-15,-7,7,14,-7,7 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_75 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_75") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 109,117,99,104,97,32,102,101,108,105,99,105,100,97,100 },new Character[] { 112,117,114,109,104,105,121,118,119,120,116,98,32,115,97,122,102,106,100,110,111,107,99,108,101,113,103 },new Integer[] { 3,-2,21,-18,10,-2,4,8,-1,-18,17,-17,13,-4,4 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_76 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_76") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 109,117,99,104,97,32,102,101,108,105,99,105,100,97,100 },new Character[] { 114,118,103,109,101,117,119,122,110,97,112,32,105,108,111,116,120,115,106,104,98,102,99,100,107,121,113 },new Integer[] { 3,2,17,-3,-10,2,10,-17,9,-1,10,-10,11,-14,14 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_77 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_77") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 109,117,99,104,97,32,102,101,108,105,99,105,100,97,100 },new Character[] { 113,107,103,121,115,122,105,109,102,97,114,116,99,112,100,108,110,104,120,32,117,101,118,106,98,111,119 },new Integer[] { 7,13,-8,5,-8,10,-11,13,-6,-9,6,-6,8,-5,5 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_78 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_78") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 109,117,99,104,97,32,102,101,108,105,99,105,100,97,100 },new Character[] { 110,122,103,32,101,105,106,108,97,100,114,116,109,118,119,99,115,120,102,107,104,113,117,112,111,121,98 },new Integer[] { 12,10,-7,5,-12,-5,15,-14,3,-2,10,-10,4,-1,1 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_79 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_79") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 109,117,99,104,97,32,102,101,108,105,99,105,100,97,100 },new Character[] { 32,102,103,116,107,108,98,105,101,120,114,97,111,112,109,122,113,106,104,110,99,115,121,119,118,100,117 },new Integer[] { 14,12,-6,-2,-7,-11,1,7,-3,2,13,-13,18,-14,14 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_80 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_80") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 109,117,99,104,97,32,102,101,108,105,99,105,100,97,100 },new Character[] { 113,122,101,104,118,108,110,117,114,105,120,107,119,98,116,115,102,32,112,109,100,97,121,106,99,103,111 },new Integer[] { 19,-12,17,-21,18,-4,-1,-14,3,4,15,-15,11,1,-1 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_81 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_81") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 97,113,117,105,32,104,97,121,32,117,110,32,115,101,99,114,101,116,111 },new Character[] { 119,100,109,102,116,111,120,32,98,112,113,117,99,118,110,104,121,122,115,97,108,103,105,114,107,106,101 },new Integer[] { 19,-9,1,11,-15,8,4,-3,-9,4,3,-7,11,8,-14,11,3,-22,1 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_82 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_82") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 104,97,115,32,97,112,114,111,98,97,100,111,32,108,97,32,97,115,105,103,110,97,116,117,114,97 },new Character[] { 119,104,100,107,109,108,112,106,105,101,111,113,116,114,98,103,118,115,117,121,110,102,122,120,97,99,32 },new Integer[] { 1,23,-7,9,-2,-18,7,-3,4,10,-22,8,16,-21,19,2,-2,-7,-9,7,5,4,-12,6,-5,11 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_83 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_83") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 104,97,115,32,97,112,114,111,98,97,100,111,32,108,97,32,97,115,105,103,110,97,116,117,114,97 },new Character[] { 120,117,121,118,122,114,102,32,113,119,104,107,112,99,105,106,109,116,98,103,111,110,115,100,108,97,101 },new Integer[] { 10,15,-3,-15,18,-13,-7,15,-2,7,-2,-3,-13,17,1,-18,18,-3,-8,5,2,4,-8,-16,4,20 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_84 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_84") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 104,97,115,32,97,112,114,111,98,97,100,111,32,108,97,32,97,115,105,103,110,97,116,117,114,97 },new Character[] { 114,112,120,111,101,32,102,117,97,115,110,107,113,98,99,119,122,121,109,104,118,103,100,105,116,108,106 },new Integer[] { 19,-11,1,-4,3,-7,-1,3,10,-5,14,-19,2,20,-17,-3,3,1,14,-2,-11,-2,16,-17,-7,8 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_85 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_85") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.Decrypt(new Character[] { 114,97,121,111,32,118,97,108,108,101,99,97,110,111,32,103,97,110,97,32,108,97,32,108,105,103,97 },new Character[] { 106,110,97,121,99,107,119,105,117,120,98,118,100,32,109,114,122,102,116,115,103,113,101,108,112,111,104 },new Integer[] { 15,-13,1,22,-12,-2,-9,21,0,-1,-18,-2,-1,24,-12,7,-18,-1,1,11,10,-21,11,10,-16,13,-18 }).doCall().checkResult(null) ;
    return ok_sofar ;
  }



  static boolean test_86 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_86") ;
    boolean ok_sofar = true ;
    
    return ok_sofar ;
  }



  static boolean test_87 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_87") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("H")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_88 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_88") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("Z")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_89 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_89") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("()")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_90 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_90") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("rn")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_91 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_91") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("uZ")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_92 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_92") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{}")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_93 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_93") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{}l")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_94 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_94") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("([])")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_95 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_95") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("B(o)")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_96 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_96") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("[][]")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_97 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_97") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("qwD()")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_98 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_98") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{}()T")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_99 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_99") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("g{[[]}")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_100 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_100") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("lh(){}")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_101 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_101") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{}()[]")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_102 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_102") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("(gp()o)")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_103 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_103") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("[SR]()o")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_104 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_104") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("[]M(())")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_105 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_105") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{}}[{}]")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_106 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_106") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("E{r}[]{}")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_107 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_107") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("g{}{}[]n")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_108 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_108") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{C}J[()]")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_109 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_109") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{D}[][]s")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_110 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_110") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("()((k{}))")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_111 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_111") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("[s][]Q[()]")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_112 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_112") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("()[()]A()()")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_113 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_113") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("[]D[]{[]Uv}")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_114 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_114") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("({{}}{}a)J{}")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_115 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_115") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("]]}[E()][{}]")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_116 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_116") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{()O{()}}{}b")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_117 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_117") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{[]k{({}[]}p")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_118 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_118") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("(p{[]}{[]m})W")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_119 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_119") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("((()(k(G)()))X)u")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_120 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_120") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("({{[]()v}[]}()[])")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_121 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_121") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("()l[(())([]u)hD]W{}")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_122 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_122") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("A{}{}[{{}}{}[]]a(({})){}L")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_123 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_123") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("ywg[]()[[][([](){}J[][])]")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_124 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_124") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("[]Pyos{}{}SP()(p()c){}()()(J)")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_125 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_125") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{[]}[]()[{}]kD[{}][(}})){}{}I[]()b]")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_126 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_126") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("QN(D)O{()}[Q]()([{}e]a[][]{}(){}[](Q)())")).doCall().checkResult(true) ;
    return ok_sofar ;
  }

  static boolean test_new_85 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_85") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("Y")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_new_86 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_86") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("p")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_new_87 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_87") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("()")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_new_88 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_88") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("]n")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_89 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_89") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{}")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_new_90 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_90") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("(t}")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_91 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_91") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{W}")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_new_92 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_92") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("}[t")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_93 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_93") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{[)]")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_94 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_94") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{][}")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_95 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_95") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("}(()")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_96 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_96") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{}n()")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_new_97 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_97") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{}{}W")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_new_98 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_98") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("[({)})")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_99 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_99") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("[][()]")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_new_100 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_100") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("(L(){)}")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_101 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_101") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("({)}()kj")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_102 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_102") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("u{[F]U{}")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_103 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_103") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{()()}{}")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_new_104 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_104") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{[}]([])a")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_105 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_105") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("((](M){})p")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_106 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_106") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("(){C}[{}}k")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_107 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_107") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{p{}{h{F}}}")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_new_108 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_108") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{b{T{}{{}()}}")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_109 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_109") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("()A{r{{m}}]{}B")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_110 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_110") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("}{()}{}()l{}()")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_111 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_111") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("Z)(i)()[[FTT][]")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_112 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_112") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("[][]U{{}}{()}{}e")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_new_113 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_113") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{[](v){](a{})}{}")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_114 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_114") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{}S[]()[]()W[]IB")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_new_115 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_115") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("[z{}]F[]()h[()()]")).doCall().checkResult(true) ;
    return ok_sofar ;
  }



  static boolean test_new_116 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_116") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("[Q]][{}t](){[]H}[]")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_117 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_117") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("()[}()QO]I{GJ}[{{}]")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_118 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_118") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("(O[{()[]}z[K{}]())[]")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_119 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_119") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("{()}}{}f{[][](){}[]{}")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_120 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_120") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("(]){}u[]{Ho[{}{]}[][][]Q")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_121 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_121") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("[]y()k{[]}({)[f]()}Px(GU)(())T")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_122 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_122") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("[]B(){[]}[]{b()(b){}E[[K]]{()B}nY)()")).doCall().checkResult(false) ;
    return ok_sofar ;
  }



  static boolean test_new_123 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_new_123") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new aed.recursiveUtils.IsBalanced(new String("A(){}([]{{}{}())()()()())Iq{[{}]}()b[{}l{R}X()]D")).doCall().checkResult(false) ;
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
      System.out.println("*** Error in "+TestData.testName+": ");

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

 




class IsBalanced extends TestCall<Boolean,Boolean> {
  private String s;
  
  public IsBalanced(String s) {
    this.s = s;
  }

  @Override
  public String toString() {
    return "Recursion.isBalanced("+RecursionLabChecker.printString(s)+")";
  }

  @Override
  public Boolean call() {
    return Recursion.isBalanced(s);
  }

  @Override
  public boolean checkResult(Boolean expected) {
    return valuesMatch(expected);
  }
}

class GetPosition extends TestCall<Position<Integer>,Integer> {
  private PositionList<Integer> l;
  private Position<Integer> pos;
  private int move;

  public GetPosition(Integer[] l, Integer ipos, int move) {
    this.l = TestUtils.toPositionList(l);
    this.move = move;
    this.pos = findPos(ipos);
  }
    
  private Position<Integer> findPos(int ipos) {
    Position<Integer> pos = l.first();
    while (ipos > 0) {
      pos = l.next(pos);
      --ipos;
    }
    return pos;
  }

  @Override
  public String toString() {
    return "Recursion.getPosition("+l+",pos("+pos+"),"+move+")";
  }

  @Override
  public Position<Integer> call() {
    return Recursion.getPosition(l,pos,move);
  }

  @Override
  public boolean checkResult(Integer expectedElement) {
    if (!noException() || !nonNull()) return false;
    if (!expectedElement.equals(result.getValue().element())) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to\n  "+this+
         "\n    where pos(X) is the position of X in the list"
         +"\nshould have returned the position with the integer "
         +expectedElement+
         " but returned the position with the integer "+result.getValue());
      return false;
    }
    return true;
  }
}

class Decrypt extends TestCall<PositionList<Character>,Void> {
  private PositionList<Character> table;
  private PositionList<Integer> key;
  private PositionList<Character> clearText;

  public Decrypt(Character[] clearText, Character[] table, Integer[] key) {
    this.clearText = TestUtils.toPositionList(clearText);
    this.table = TestUtils.toPositionList(table);
    this.key = TestUtils.toPositionList(key);
  }

  @Override
  public String toString() {
    return "Recursion.decrypt("+table+","+key+")";
  }

  @Override
  public PositionList<Character> call() {
    return Recursion.decrypt(table,key);
  }

  @Override
  public boolean checkResult(Void v) {
    if (!noException() || !nonNull()) return false;
    if (!clearText.equals(result.getValue())) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have returned the value "
         +clearText+" but returned "+result.getValue());
      return false;
    }
    return true;
  }
}

class RecursionCheck extends TestCall<Boolean,Boolean> {
  private String methodName;
  private int arity;

  public RecursionCheck(String methodName, int arity) {
    this.methodName = methodName;
    this.arity = arity;
  }
  
  @Override
  public String toString() {
    return "RecursionCheck.isRecursive(\""+methodName+","+arity+"\")";
  }

  @Override
  public Boolean call() {
    return TestUtils.checkRecursive
      (TesterLab3.class, "aed.recursiveUtils","Recursion",methodName,arity);
  }

  @Override
  public boolean checkResult(Boolean expected) {
    if (!noException()) return false;
    if (result.getValue() != true) {
        TestUtils.printWarning
          (TestUtils.ExecutionTime.UNRELATED,
           "\nCould not detect recursion in the implementation of "+methodName);
        return false;
    }
    return true;
  }
}

class RecursionLabChecker {
  public static String printString(String s) {
    if (s == null) return "null";
    else return "\""+s.toString()+"\"";
  }
}




class BaseResultsHandler {

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
      sb.append("  "+trace.get(i)+";");
    }
    return sb.toString();
  }
}

class ResultsHandler extends BaseResultsHandler {
  private static boolean success = true;
  public static boolean completedAnalysis = false;

  public static void add_result(String test_type, boolean result) {
    if (test_type.equals("recursionCheck"))
      success = success && result;
    else
      BaseResultsHandler.add_result(test_type, result);
  }

  static int get_nota() {
    int numCorrect = 0;
    
    for (String key : results_sofar.keySet())
      if (results_sofar.get(key))
        ++numCorrect;

    if (results_ok())
      return numCorrect * 4;
    else
      return 0;
  }

  static boolean results_ok() {
    int numCorrect = 0;
    
    for (String key : results_sofar.keySet())
      if (results_sofar.get(key))
        ++numCorrect;

    return numCorrect >= 2;
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

      if (!completedAnalysis) {
        System.out.println
          ("\nADVERTENCIA: no se podia comprobar que "+
           "los métodos son recursivos\n");
      }

    if (!success) {
      System.out.println
        ("\nADVERTENCIA: no se detecto uso de recursion en "+
         "algunos metodos.\n");
    }
  }
}

