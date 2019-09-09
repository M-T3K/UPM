/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the "entrega system".
 *
 */

package aed.compress;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import es.upm.aedlib.Position;
import es.upm.aedlib.tree.*;
import es.upm.aedlib.Version;



@SuppressWarnings("unused")
public class TesterLab5 {

  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String testName;
  static String callSeq="";

  static boolean[] results_sofar = {true,true,true};
  static boolean general_results = true;
  static boolean testsRun = false;
  static boolean testResult = false;

  static Huffman huffman;
  static Field treeField;
  static BinaryTree<Character> tree;


  public static void main(String[] args) {

    try {
	String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
	BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
	bw.write(ids[0]);
	bw.close();
    } catch (Exception e) {
	System.out.println("Avisa al profesor de fallo sacando el PID");
    }

    checkAedlibVersion();
    
    // Permit executing individual tests: 
    // the first argument should be the test number
    if (args.length == 1) {
	try {
	    int testNumber = Integer.parseInt(args[0]);
	    String testName = "test_"+testNumber;
	    java.lang.reflect.Method testMethod = null;
	    try {
		testMethod = TesterLab5.class.getDeclaredMethod(testName);
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
		    System.out.println("\n*** Error: test "+testName+" succeeded.");
		else
		    System.out.println("\n*** Error: test "+testName+" failed.");

		System.exit(booleanResult ? 0 : 24);
	    }
	} catch (NumberFormatException exc) {
	    System.out.println("\n*** Error: argument should be an integer but is "+args[0]);
	    System.exit(24);
	}
    } else {
	if (getTestResult()) System.exit(0);
	else System.exit(24);
    }
  }
    
  private static void checkAedlibVersion() {
    // Check version of aedlib -- we want a version >= 1.1.0
    if (Version.major() < 1
	|| (Version.major() == 1 && Version.minor() < 1) 
	|| (Version.major() == 1 && Version.minor() == 1) && Version.patchlevel() < 0) {
      System.out.println
	("\n*** Warning: aedlib.jar is too old; the Tester may not work correctly.\nPlease install a newer version "+
	 "of the library.\nMinimum acceptable version: 1.1.0");
      System.out.println
	("Current aedlib version = "
	 +Version.major()+"."+Version.minor()+"."+Version.patchlevel());
    }
  }
  
  public static boolean getTestResult() {
      if (!testsRun) testResult = runTests();
      return testResult;
  }

  public static int getNota() {
      return getTestResult() ? 10 : 0;
  }

  public static boolean getTestResult(String testName) {
      getTestResult();
      
      int testIndex = test_type_to_index(testName);
      return results_sofar[testIndex];
  }

  public static boolean runTests() {
    boolean ok_sofar = true;
    testsRun = true;

    


    //////////////////////////////////////////////////////////////////////
    //
    // File generated at: 2018/11/22 -- 23:3:24
    // Seed: {1542,924202,788003}
    //
    //////////////////////////////////////////////////////////////////////



    try {
      if (results_ok_sofar(results_sofar,"countChars") && local_results_ok_sofar(results_sofar,"countChars"))
        results_sofar =
          combine_results(test_1(), results_sofar, "test_1", "countChars");

      if (results_ok_sofar(results_sofar,"countChars") && local_results_ok_sofar(results_sofar,"countChars"))
        results_sofar =
          combine_results(test_2(), results_sofar, "test_2", "countChars");

      if (results_ok_sofar(results_sofar,"countChars") && local_results_ok_sofar(results_sofar,"countChars"))
        results_sofar =
          combine_results(test_3(), results_sofar, "test_3", "countChars");

      if (results_ok_sofar(results_sofar,"countChars") && local_results_ok_sofar(results_sofar,"countChars"))
        results_sofar =
          combine_results(test_4(), results_sofar, "test_4", "countChars");

      if (results_ok_sofar(results_sofar,"countChars") && local_results_ok_sofar(results_sofar,"countChars"))
        results_sofar =
          combine_results(test_5(), results_sofar, "test_5", "countChars");

      if (results_ok_sofar(results_sofar,"countChars") && local_results_ok_sofar(results_sofar,"countChars"))
        results_sofar =
          combine_results(test_6(), results_sofar, "test_6", "countChars");

      if (results_ok_sofar(results_sofar,"countChars") && local_results_ok_sofar(results_sofar,"countChars"))
        results_sofar =
          combine_results(test_7(), results_sofar, "test_7", "countChars");

      if (results_ok_sofar(results_sofar,"countChars") && local_results_ok_sofar(results_sofar,"countChars"))
        results_sofar =
          combine_results(test_8(), results_sofar, "test_8", "countChars");

      if (results_ok_sofar(results_sofar,"countChars") && local_results_ok_sofar(results_sofar,"countChars"))
        results_sofar =
          combine_results(test_9(), results_sofar, "test_9", "countChars");

      if (results_ok_sofar(results_sofar,"countChars") && local_results_ok_sofar(results_sofar,"countChars"))
        results_sofar =
          combine_results(test_10(), results_sofar, "test_10", "countChars");

      if (results_ok_sofar(results_sofar,"countChars") && local_results_ok_sofar(results_sofar,"countChars"))
        results_sofar =
          combine_results(test_11(), results_sofar, "test_11", "countChars");

      if (results_ok_sofar(results_sofar,"countChars") && local_results_ok_sofar(results_sofar,"countChars"))
        results_sofar =
          combine_results(test_12(), results_sofar, "test_12", "countChars");

      if (results_ok_sofar(results_sofar,"countChars") && local_results_ok_sofar(results_sofar,"countChars"))
        results_sofar =
          combine_results(test_13(), results_sofar, "test_13", "countChars");

      if (results_ok_sofar(results_sofar,"countChars") && local_results_ok_sofar(results_sofar,"countChars"))
        results_sofar =
          combine_results(test_14(), results_sofar, "test_14", "countChars");

      if (results_ok_sofar(results_sofar,"countChars") && local_results_ok_sofar(results_sofar,"countChars"))
        results_sofar =
          combine_results(test_15(), results_sofar, "test_15", "countChars");

      if (results_ok_sofar(results_sofar,"countChars") && local_results_ok_sofar(results_sofar,"countChars"))
        results_sofar =
          combine_results(test_16(), results_sofar, "test_16", "countChars");

      if (results_ok_sofar(results_sofar,"countChars") && local_results_ok_sofar(results_sofar,"countChars"))
        results_sofar =
          combine_results(test_17(), results_sofar, "test_17", "countChars");

      if (results_ok_sofar(results_sofar,"countChars") && local_results_ok_sofar(results_sofar,"countChars"))
        results_sofar =
          combine_results(test_18(), results_sofar, "test_18", "countChars");

      if (results_ok_sofar(results_sofar,"countChars") && local_results_ok_sofar(results_sofar,"countChars"))
        results_sofar =
          combine_results(test_19(), results_sofar, "test_19", "countChars");

      if (results_ok_sofar(results_sofar,"countChars") && local_results_ok_sofar(results_sofar,"countChars"))
        results_sofar =
          combine_results(test_20(), results_sofar, "test_20", "countChars");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_21(), results_sofar, "test_21", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_22(), results_sofar, "test_22", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_23(), results_sofar, "test_23", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_24(), results_sofar, "test_24", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_25(), results_sofar, "test_25", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_26(), results_sofar, "test_26", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_27(), results_sofar, "test_27", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_28(), results_sofar, "test_28", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_29(), results_sofar, "test_29", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_30(), results_sofar, "test_30", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_31(), results_sofar, "test_31", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_32(), results_sofar, "test_32", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_33(), results_sofar, "test_33", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_34(), results_sofar, "test_34", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_35(), results_sofar, "test_35", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_36(), results_sofar, "test_36", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_37(), results_sofar, "test_37", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_38(), results_sofar, "test_38", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_39(), results_sofar, "test_39", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_40(), results_sofar, "test_40", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_41(), results_sofar, "test_41", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_42(), results_sofar, "test_42", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_43(), results_sofar, "test_43", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_44(), results_sofar, "test_44", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_45(), results_sofar, "test_45", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_46(), results_sofar, "test_46", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_47(), results_sofar, "test_47", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_48(), results_sofar, "test_48", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_49(), results_sofar, "test_49", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_50(), results_sofar, "test_50", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_51(), results_sofar, "test_51", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_52(), results_sofar, "test_52", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_53(), results_sofar, "test_53", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_54(), results_sofar, "test_54", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_55(), results_sofar, "test_55", "attach");

      if (results_ok_sofar(results_sofar,"attach") && local_results_ok_sofar(results_sofar,"attach"))
        results_sofar =
          combine_results(test_56(), results_sofar, "test_56", "attach");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_57(), results_sofar, "test_57", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_58(), results_sofar, "test_58", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_59(), results_sofar, "test_59", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_60(), results_sofar, "test_60", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_61(), results_sofar, "test_61", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_62(), results_sofar, "test_62", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_63(), results_sofar, "test_63", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_64(), results_sofar, "test_64", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_65(), results_sofar, "test_65", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_66(), results_sofar, "test_66", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_67(), results_sofar, "test_67", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_68(), results_sofar, "test_68", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_69(), results_sofar, "test_69", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_70(), results_sofar, "test_70", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_71(), results_sofar, "test_71", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_72(), results_sofar, "test_72", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_73(), results_sofar, "test_73", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_74(), results_sofar, "test_74", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_75(), results_sofar, "test_75", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_76(), results_sofar, "test_76", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_77(), results_sofar, "test_77", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_78(), results_sofar, "test_78", "constructor");

    } catch ( Throwable exc ) {
          printCallException(ExecutionTime.DURING,"",exc);
          return false;
      }


    report_results("TesterLab5",results_sofar,general_results);


    if (results_ok(results_sofar,general_results))
      return true;
    else
      return false;
  }



  static boolean test_1 ()
  {
      
      testName = "test_1" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab5.checkCharCounts("a",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1 }) ;
      return ok_sofar ;
  }


  static boolean test_2 ()
  {
      
      testName = "test_2" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab5.checkCharCounts("aa",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2 }) ;
      return ok_sofar ;
  }


  static boolean test_3 ()
  {
      
      testName = "test_3" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab5.checkCharCounts("aba",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,1 }) ;
      return ok_sofar ;
  }


  static boolean test_4 ()
  {
      
      testName = "test_4" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab5.checkCharCounts("abba",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2 }) ;
      return ok_sofar ;
  }


  static boolean test_5 ()
  {
      
      testName = "test_5" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab5.checkCharCounts("abc",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1 }) ;
      return ok_sofar ;
  }


  static boolean test_6 ()
  {
      
      testName = "test_6" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab5.checkCharCounts("addee",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,2,2 }) ;
      return ok_sofar ;
  }


  static boolean test_7 ()
  {
      
      testName = "test_7" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab5.checkCharCounts("abcabcabc",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3 }) ;
      return ok_sofar ;
  }


  static boolean test_8 ()
  {
      
      testName = "test_8" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab5.checkCharCounts("jjjjjjjjjjjaddeefffggggggghhhhhhhhhhhiiiiiiiiiiiiii",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,2,2,3,7,11,14,11 }) ;
      return ok_sofar ;
  }


  static boolean test_9 ()
  {
      
      testName = "test_9" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab5.checkCharCounts("abbcdeffffghiiii",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,1,1,1,4,1,1,4 }) ;
      return ok_sofar ;
  }


  static boolean test_10 ()
  {
      
      testName = "test_10" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab5.checkCharCounts("aabbccddeeffiiijjjkkklllmmm",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,3,3,3,3,3 }) ;
      return ok_sofar ;
  }


  static boolean test_11 ()
  {
      
      testName = "test_11" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab5.checkCharCounts("The Worst of our faults is our interest in other people's faults",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,11,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,2,0,0,0,6,3,0,2,3,0,0,3,0,2,6,2,0,5,6,6,4 }) ;
      return ok_sofar ;
  }


  static boolean test_12 ()
  {
      
      testName = "test_12" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab5.checkCharCounts("Wisdom comes to us when it's already too late.",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,3,0,1,2,4,0,0,1,2,0,0,2,2,1,5,0,0,1,4,4,1,0,1,0,1 }) ;
      return ok_sofar ;
  }


  static boolean test_13 ()
  {
      
      testName = "test_13" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab5.checkCharCounts("I will make those who stay the envy of those who return.",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,11,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,6,1,0,5,1,0,1,2,1,2,5,0,0,2,3,5,1,1,3,0,2 }) ;
      return ok_sofar ;
  }


  static boolean test_14 ()
  {
      
      testName = "test_14" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab5.checkCharCounts("We choose to go to the moon. We choose to go to the moon in this decade and do the other things, not because they are easy, but because they are hard,",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,31,0,0,0,0,0,0,0,0,0,0,0,3,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,8,3,5,5,19,0,3,11,3,0,0,0,2,6,17,0,0,4,7,14,3,0,0,0,3 }) ;
      return ok_sofar ;
  }


  static boolean test_15 ()
  {
      
      testName = "test_15" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab5.checkCharCounts("Blessed are the merciful: for they shall obtain mercy.",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,1,2,1,7,2,0,3,2,0,0,4,2,1,2,0,0,4,3,3,1,0,0,0,2 }) ;
      return ok_sofar ;
  }


  static boolean test_16 ()
  {
      
      testName = "test_16" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab5.checkCharCounts("An eye for an eye only ends up making the whole world blind.",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,12,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,1,0,3,7,1,1,2,2,0,1,4,1,6,4,1,0,2,1,1,1,0,2,0,3 }) ;
      return ok_sofar ;
  }


  static boolean test_17 ()
  {
      
      testName = "test_17" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab5.checkCharCounts("Choose a job you love, and you will never have to work a day in your life.",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,16,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,1,0,2,6,1,0,2,3,1,1,4,0,3,9,0,0,3,1,1,3,3,2,0,4 }) ;
      return ok_sofar ;
  }


  static boolean test_18 ()
  {
      
      testName = "test_18" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab5.checkCharCounts("No man can be a good citizen who is not a good husband and a good father, who is not honest in his dealings with other men and women, faithful to his friends and fearless in the presence of his foes, who has not got a sound heart, a sound mind, and a sound body",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,54,0,0,0,0,0,0,0,0,0,0,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,19,3,3,15,17,7,5,15,14,0,0,3,4,23,24,1,0,6,17,13,5,0,5,0,1,1 }) ;
      return ok_sofar ;
  }


  static boolean test_19 ()
  {
      
      testName = "test_19" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab5.checkCharCounts("For if I tell you that to do as you say would be a disobedience to the God, and therefore that I cannot hold my tongue, you will not believe that I am serious",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,33,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,9,3,2,7,14,2,1,6,6,0,0,7,2,6,16,0,0,4,5,14,6,1,2,0,5 }) ;
      return ok_sofar ;
  }


  static boolean test_20 ()
  {
      
      testName = "test_20" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab5.checkCharCounts("I have a dream that my four little children will one day live in a nation where they will not be judged by the color of their skin but by the content of their character.",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,34,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,9,4,5,5,17,3,1,10,10,1,1,9,2,9,9,0,0,9,1,15,3,2,3,0,5 }) ;
      return ok_sofar ;
  }


  static boolean test_21 ()
  {
      
      testName = "test_21" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertRight(var0,((char)99)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var3 = tree1.addRoot(((char)97)) ;
      Position<Character> var4 = tree1.insertLeft(var3,((char)98)) ;
      Position<Character> var5 = tree1.insertRight(var3,((char)99)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var6 = tree2.addRoot(((char)97)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var7 = tree3.addRoot(((char)97)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var8 = resultTree.addRoot(((char)97)) ;
      Position<Character> var9 = resultTree.insertLeft(var8,((char)98)) ;
      Position<Character> var10 = resultTree.insertLeft(var9,((char)97)) ;
      Position<Character> var11 = resultTree.insertRight(var9,((char)97)) ;
      Position<Character> var12 = resultTree.insertRight(var8,((char)99)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  static boolean test_22 ()
  {
      
      testName = "test_22" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertRight(var0,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var2 = tree1.addRoot(((char)97)) ;
      Position<Character> var3 = tree1.insertRight(var2,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var4 = tree2.addRoot(((char)97)) ;
      Position<Character> var5 = tree2.insertLeft(var4,((char)98)) ;
      Position<Character> var6 = tree2.insertRight(var4,((char)99)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var7 = tree3.addRoot(((char)97)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var8 = resultTree.addRoot(((char)97)) ;
      Position<Character> var9 = resultTree.insertRight(var8,((char)98)) ;
      Position<Character> var10 = resultTree.insertLeft(var9,((char)97)) ;
      Position<Character> var11 = resultTree.insertLeft(var10,((char)98)) ;
      Position<Character> var12 = resultTree.insertRight(var10,((char)99)) ;
      Position<Character> var13 = resultTree.insertRight(var9,((char)97)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { false },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_23 ()
  {
      
      testName = "test_23" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertRight(var0,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var2 = tree1.addRoot(((char)97)) ;
      Position<Character> var3 = tree1.insertRight(var2,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var4 = tree2.addRoot(((char)97)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var5 = tree3.addRoot(((char)97)) ;
      Position<Character> var6 = tree3.insertLeft(var5,((char)98)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var7 = resultTree.addRoot(((char)97)) ;
      Position<Character> var8 = resultTree.insertRight(var7,((char)98)) ;
      Position<Character> var9 = resultTree.insertLeft(var8,((char)97)) ;
      Position<Character> var10 = resultTree.insertRight(var8,((char)97)) ;
      Position<Character> var11 = resultTree.insertLeft(var10,((char)98)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { false },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_24 ()
  {
      
      testName = "test_24" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertRight(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertRight(var1,((char)99)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var3 = tree1.addRoot(((char)97)) ;
      Position<Character> var4 = tree1.insertRight(var3,((char)98)) ;
      Position<Character> var5 = tree1.insertRight(var4,((char)99)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var6 = tree2.addRoot(((char)97)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var7 = tree3.addRoot(((char)97)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var8 = resultTree.addRoot(((char)97)) ;
      Position<Character> var9 = resultTree.insertRight(var8,((char)98)) ;
      Position<Character> var10 = resultTree.insertRight(var9,((char)99)) ;
      Position<Character> var11 = resultTree.insertLeft(var10,((char)97)) ;
      Position<Character> var12 = resultTree.insertRight(var10,((char)97)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { false,false },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_25 ()
  {
      
      testName = "test_25" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var2 = tree1.addRoot(((char)97)) ;
      Position<Character> var3 = tree1.insertLeft(var2,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var4 = tree2.addRoot(((char)97)) ;
      Position<Character> var5 = tree2.insertRight(var4,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var6 = tree3.addRoot(((char)97)) ;
      Position<Character> var7 = tree3.insertLeft(var6,((char)98)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var8 = resultTree.addRoot(((char)97)) ;
      Position<Character> var9 = resultTree.insertLeft(var8,((char)98)) ;
      Position<Character> var10 = resultTree.insertLeft(var9,((char)97)) ;
      Position<Character> var11 = resultTree.insertRight(var10,((char)98)) ;
      Position<Character> var12 = resultTree.insertRight(var9,((char)97)) ;
      Position<Character> var13 = resultTree.insertLeft(var12,((char)98)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_26 ()
  {
      
      testName = "test_26" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertRight(var0,((char)99)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var3 = tree1.addRoot(((char)97)) ;
      Position<Character> var4 = tree1.insertLeft(var3,((char)98)) ;
      Position<Character> var5 = tree1.insertRight(var3,((char)99)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var6 = tree2.addRoot(((char)97)) ;
      Position<Character> var7 = tree2.insertRight(var6,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var8 = tree3.addRoot(((char)97)) ;
      Position<Character> var9 = tree3.insertLeft(var8,((char)98)) ;
      Position<Character> var10 = tree3.insertRight(var8,((char)99)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var11 = resultTree.addRoot(((char)97)) ;
      Position<Character> var12 = resultTree.insertLeft(var11,((char)98)) ;
      Position<Character> var13 = resultTree.insertLeft(var12,((char)97)) ;
      Position<Character> var14 = resultTree.insertRight(var13,((char)98)) ;
      Position<Character> var15 = resultTree.insertRight(var12,((char)97)) ;
      Position<Character> var16 = resultTree.insertLeft(var15,((char)98)) ;
      Position<Character> var17 = resultTree.insertRight(var15,((char)99)) ;
      Position<Character> var18 = resultTree.insertRight(var11,((char)99)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_27 ()
  {
      
      testName = "test_27" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertRight(var0,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var2 = tree1.addRoot(((char)97)) ;
      Position<Character> var3 = tree1.insertRight(var2,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var4 = tree2.addRoot(((char)97)) ;
      Position<Character> var5 = tree2.insertRight(var4,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var6 = tree3.addRoot(((char)97)) ;
      Position<Character> var7 = tree3.insertLeft(var6,((char)98)) ;
      Position<Character> var8 = tree3.insertLeft(var7,((char)99)) ;
      Position<Character> var9 = tree3.insertRight(var6,((char)100)) ;
      Position<Character> var10 = tree3.insertLeft(var9,((char)101)) ;
      Position<Character> var11 = tree3.insertRight(var9,((char)102)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var12 = resultTree.addRoot(((char)97)) ;
      Position<Character> var13 = resultTree.insertRight(var12,((char)98)) ;
      Position<Character> var14 = resultTree.insertLeft(var13,((char)97)) ;
      Position<Character> var15 = resultTree.insertRight(var14,((char)98)) ;
      Position<Character> var16 = resultTree.insertRight(var13,((char)97)) ;
      Position<Character> var17 = resultTree.insertLeft(var16,((char)98)) ;
      Position<Character> var18 = resultTree.insertLeft(var17,((char)99)) ;
      Position<Character> var19 = resultTree.insertRight(var16,((char)100)) ;
      Position<Character> var20 = resultTree.insertLeft(var19,((char)101)) ;
      Position<Character> var21 = resultTree.insertRight(var19,((char)102)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { false },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_28 ()
  {
      
      testName = "test_28" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertLeft(var1,((char)99)) ;
      Position<Character> var3 = origtree1.insertRight(var1,((char)100)) ;
      Position<Character> var4 = origtree1.insertRight(var0,((char)101)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var5 = tree1.addRoot(((char)97)) ;
      Position<Character> var6 = tree1.insertLeft(var5,((char)98)) ;
      Position<Character> var7 = tree1.insertLeft(var6,((char)99)) ;
      Position<Character> var8 = tree1.insertRight(var6,((char)100)) ;
      Position<Character> var9 = tree1.insertRight(var5,((char)101)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var10 = tree2.addRoot(((char)97)) ;
      Position<Character> var11 = tree2.insertRight(var10,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var12 = tree3.addRoot(((char)97)) ;
      Position<Character> var13 = tree3.insertLeft(var12,((char)98)) ;
      Position<Character> var14 = tree3.insertRight(var12,((char)99)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var15 = resultTree.addRoot(((char)97)) ;
      Position<Character> var16 = resultTree.insertLeft(var15,((char)98)) ;
      Position<Character> var17 = resultTree.insertLeft(var16,((char)99)) ;
      Position<Character> var18 = resultTree.insertLeft(var17,((char)97)) ;
      Position<Character> var19 = resultTree.insertRight(var18,((char)98)) ;
      Position<Character> var20 = resultTree.insertRight(var17,((char)97)) ;
      Position<Character> var21 = resultTree.insertLeft(var20,((char)98)) ;
      Position<Character> var22 = resultTree.insertRight(var20,((char)99)) ;
      Position<Character> var23 = resultTree.insertRight(var16,((char)100)) ;
      Position<Character> var24 = resultTree.insertRight(var15,((char)101)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { true,true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_29 ()
  {
      
      testName = "test_29" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var2 = tree1.addRoot(((char)97)) ;
      Position<Character> var3 = tree1.insertLeft(var2,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var4 = tree2.addRoot(((char)97)) ;
      Position<Character> var5 = tree2.insertLeft(var4,((char)98)) ;
      Position<Character> var6 = tree2.insertRight(var5,((char)99)) ;
      Position<Character> var7 = tree2.insertRight(var4,((char)100)) ;
      Position<Character> var8 = tree2.insertLeft(var7,((char)101)) ;
      Position<Character> var9 = tree2.insertRight(var7,((char)102)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var10 = tree3.addRoot(((char)97)) ;
      Position<Character> var11 = tree3.insertLeft(var10,((char)98)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var12 = resultTree.addRoot(((char)97)) ;
      Position<Character> var13 = resultTree.insertLeft(var12,((char)98)) ;
      Position<Character> var14 = resultTree.insertLeft(var13,((char)97)) ;
      Position<Character> var15 = resultTree.insertLeft(var14,((char)98)) ;
      Position<Character> var16 = resultTree.insertRight(var15,((char)99)) ;
      Position<Character> var17 = resultTree.insertRight(var14,((char)100)) ;
      Position<Character> var18 = resultTree.insertLeft(var17,((char)101)) ;
      Position<Character> var19 = resultTree.insertRight(var17,((char)102)) ;
      Position<Character> var20 = resultTree.insertRight(var13,((char)97)) ;
      Position<Character> var21 = resultTree.insertLeft(var20,((char)98)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_30 ()
  {
      
      testName = "test_30" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertRight(var0,((char)99)) ;
      Position<Character> var3 = origtree1.insertRight(var2,((char)100)) ;
      Position<Character> var4 = origtree1.insertLeft(var3,((char)101)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var5 = tree1.addRoot(((char)97)) ;
      Position<Character> var6 = tree1.insertLeft(var5,((char)98)) ;
      Position<Character> var7 = tree1.insertRight(var5,((char)99)) ;
      Position<Character> var8 = tree1.insertRight(var7,((char)100)) ;
      Position<Character> var9 = tree1.insertLeft(var8,((char)101)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var10 = tree2.addRoot(((char)97)) ;
      Position<Character> var11 = tree2.insertLeft(var10,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var12 = tree3.addRoot(((char)97)) ;
      Position<Character> var13 = tree3.insertLeft(var12,((char)98)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var14 = resultTree.addRoot(((char)97)) ;
      Position<Character> var15 = resultTree.insertLeft(var14,((char)98)) ;
      Position<Character> var16 = resultTree.insertRight(var14,((char)99)) ;
      Position<Character> var17 = resultTree.insertRight(var16,((char)100)) ;
      Position<Character> var18 = resultTree.insertLeft(var17,((char)101)) ;
      Position<Character> var19 = resultTree.insertLeft(var18,((char)97)) ;
      Position<Character> var20 = resultTree.insertLeft(var19,((char)98)) ;
      Position<Character> var21 = resultTree.insertRight(var18,((char)97)) ;
      Position<Character> var22 = resultTree.insertLeft(var21,((char)98)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { false,false,true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_31 ()
  {
      
      testName = "test_31" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var2 = tree1.addRoot(((char)97)) ;
      Position<Character> var3 = tree1.insertLeft(var2,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var4 = tree2.addRoot(((char)97)) ;
      Position<Character> var5 = tree2.insertLeft(var4,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var6 = tree3.addRoot(((char)97)) ;
      Position<Character> var7 = tree3.insertLeft(var6,((char)98)) ;
      Position<Character> var8 = tree3.insertLeft(var7,((char)99)) ;
      Position<Character> var9 = tree3.insertRight(var8,((char)100)) ;
      Position<Character> var10 = tree3.insertRight(var6,((char)101)) ;
      Position<Character> var11 = tree3.insertRight(var10,((char)102)) ;
      Position<Character> var12 = tree3.insertLeft(var11,((char)103)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var13 = resultTree.addRoot(((char)97)) ;
      Position<Character> var14 = resultTree.insertLeft(var13,((char)98)) ;
      Position<Character> var15 = resultTree.insertLeft(var14,((char)97)) ;
      Position<Character> var16 = resultTree.insertLeft(var15,((char)98)) ;
      Position<Character> var17 = resultTree.insertRight(var14,((char)97)) ;
      Position<Character> var18 = resultTree.insertLeft(var17,((char)98)) ;
      Position<Character> var19 = resultTree.insertLeft(var18,((char)99)) ;
      Position<Character> var20 = resultTree.insertRight(var19,((char)100)) ;
      Position<Character> var21 = resultTree.insertRight(var17,((char)101)) ;
      Position<Character> var22 = resultTree.insertRight(var21,((char)102)) ;
      Position<Character> var23 = resultTree.insertLeft(var22,((char)103)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_32 ()
  {
      
      testName = "test_32" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertRight(var0,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var2 = tree1.addRoot(((char)97)) ;
      Position<Character> var3 = tree1.insertRight(var2,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var4 = tree2.addRoot(((char)97)) ;
      Position<Character> var5 = tree2.insertLeft(var4,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var6 = tree3.addRoot(((char)97)) ;
      Position<Character> var7 = tree3.insertLeft(var6,((char)98)) ;
      Position<Character> var8 = tree3.insertRight(var7,((char)99)) ;
      Position<Character> var9 = tree3.insertLeft(var8,((char)100)) ;
      Position<Character> var10 = tree3.insertRight(var6,((char)101)) ;
      Position<Character> var11 = tree3.insertRight(var10,((char)102)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var12 = resultTree.addRoot(((char)97)) ;
      Position<Character> var13 = resultTree.insertRight(var12,((char)98)) ;
      Position<Character> var14 = resultTree.insertLeft(var13,((char)97)) ;
      Position<Character> var15 = resultTree.insertLeft(var14,((char)98)) ;
      Position<Character> var16 = resultTree.insertRight(var13,((char)97)) ;
      Position<Character> var17 = resultTree.insertLeft(var16,((char)98)) ;
      Position<Character> var18 = resultTree.insertRight(var17,((char)99)) ;
      Position<Character> var19 = resultTree.insertLeft(var18,((char)100)) ;
      Position<Character> var20 = resultTree.insertRight(var16,((char)101)) ;
      Position<Character> var21 = resultTree.insertRight(var20,((char)102)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { false },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_33 ()
  {
      
      testName = "test_33" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var2 = tree1.addRoot(((char)97)) ;
      Position<Character> var3 = tree1.insertLeft(var2,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var4 = tree2.addRoot(((char)97)) ;
      Position<Character> var5 = tree2.insertLeft(var4,((char)98)) ;
      Position<Character> var6 = tree2.insertRight(var4,((char)99)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var7 = tree3.addRoot(((char)97)) ;
      Position<Character> var8 = tree3.insertLeft(var7,((char)98)) ;
      Position<Character> var9 = tree3.insertLeft(var8,((char)99)) ;
      Position<Character> var10 = tree3.insertRight(var9,((char)100)) ;
      Position<Character> var11 = tree3.insertRight(var8,((char)101)) ;
      Position<Character> var12 = tree3.insertRight(var11,((char)102)) ;
      Position<Character> var13 = tree3.insertLeft(var12,((char)103)) ;
      Position<Character> var14 = tree3.insertRight(var12,((char)104)) ;
      Position<Character> var15 = tree3.insertRight(var7,((char)105)) ;
      Position<Character> var16 = tree3.insertLeft(var15,((char)106)) ;
      Position<Character> var17 = tree3.insertRight(var16,((char)107)) ;
      Position<Character> var18 = tree3.insertLeft(var17,((char)108)) ;
      Position<Character> var19 = tree3.insertRight(var17,((char)109)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var20 = resultTree.addRoot(((char)97)) ;
      Position<Character> var21 = resultTree.insertLeft(var20,((char)98)) ;
      Position<Character> var22 = resultTree.insertLeft(var21,((char)97)) ;
      Position<Character> var23 = resultTree.insertLeft(var22,((char)98)) ;
      Position<Character> var24 = resultTree.insertRight(var22,((char)99)) ;
      Position<Character> var25 = resultTree.insertRight(var21,((char)97)) ;
      Position<Character> var26 = resultTree.insertLeft(var25,((char)98)) ;
      Position<Character> var27 = resultTree.insertLeft(var26,((char)99)) ;
      Position<Character> var28 = resultTree.insertRight(var27,((char)100)) ;
      Position<Character> var29 = resultTree.insertRight(var26,((char)101)) ;
      Position<Character> var30 = resultTree.insertRight(var29,((char)102)) ;
      Position<Character> var31 = resultTree.insertLeft(var30,((char)103)) ;
      Position<Character> var32 = resultTree.insertRight(var30,((char)104)) ;
      Position<Character> var33 = resultTree.insertRight(var25,((char)105)) ;
      Position<Character> var34 = resultTree.insertLeft(var33,((char)106)) ;
      Position<Character> var35 = resultTree.insertRight(var34,((char)107)) ;
      Position<Character> var36 = resultTree.insertLeft(var35,((char)108)) ;
      Position<Character> var37 = resultTree.insertRight(var35,((char)109)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_34 ()
  {
      
      testName = "test_34" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertLeft(var1,((char)99)) ;
      Position<Character> var3 = origtree1.insertRight(var1,((char)100)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var4 = tree1.addRoot(((char)97)) ;
      Position<Character> var5 = tree1.insertLeft(var4,((char)98)) ;
      Position<Character> var6 = tree1.insertLeft(var5,((char)99)) ;
      Position<Character> var7 = tree1.insertRight(var5,((char)100)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var8 = tree2.addRoot(((char)97)) ;
      Position<Character> var9 = tree2.insertLeft(var8,((char)98)) ;
      Position<Character> var10 = tree2.insertRight(var9,((char)99)) ;
      Position<Character> var11 = tree2.insertRight(var10,((char)100)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var12 = tree3.addRoot(((char)97)) ;
      Position<Character> var13 = tree3.insertLeft(var12,((char)98)) ;
      Position<Character> var14 = tree3.insertRight(var13,((char)99)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var15 = resultTree.addRoot(((char)97)) ;
      Position<Character> var16 = resultTree.insertLeft(var15,((char)98)) ;
      Position<Character> var17 = resultTree.insertLeft(var16,((char)99)) ;
      Position<Character> var18 = resultTree.insertRight(var16,((char)100)) ;
      Position<Character> var19 = resultTree.insertLeft(var18,((char)97)) ;
      Position<Character> var20 = resultTree.insertLeft(var19,((char)98)) ;
      Position<Character> var21 = resultTree.insertRight(var20,((char)99)) ;
      Position<Character> var22 = resultTree.insertRight(var21,((char)100)) ;
      Position<Character> var23 = resultTree.insertRight(var18,((char)97)) ;
      Position<Character> var24 = resultTree.insertLeft(var23,((char)98)) ;
      Position<Character> var25 = resultTree.insertRight(var24,((char)99)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { true,false },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_35 ()
  {
      
      testName = "test_35" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertRight(var1,((char)99)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var3 = tree1.addRoot(((char)97)) ;
      Position<Character> var4 = tree1.insertLeft(var3,((char)98)) ;
      Position<Character> var5 = tree1.insertRight(var4,((char)99)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var6 = tree2.addRoot(((char)97)) ;
      Position<Character> var7 = tree2.insertRight(var6,((char)98)) ;
      Position<Character> var8 = tree2.insertLeft(var7,((char)99)) ;
      Position<Character> var9 = tree2.insertLeft(var8,((char)100)) ;
      Position<Character> var10 = tree2.insertLeft(var9,((char)101)) ;
      Position<Character> var11 = tree2.insertRight(var9,((char)102)) ;
      Position<Character> var12 = tree2.insertRight(var8,((char)103)) ;
      Position<Character> var13 = tree2.insertLeft(var12,((char)104)) ;
      Position<Character> var14 = tree2.insertRight(var12,((char)105)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var15 = tree3.addRoot(((char)97)) ;
      Position<Character> var16 = tree3.insertRight(var15,((char)98)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var17 = resultTree.addRoot(((char)97)) ;
      Position<Character> var18 = resultTree.insertLeft(var17,((char)98)) ;
      Position<Character> var19 = resultTree.insertRight(var18,((char)99)) ;
      Position<Character> var20 = resultTree.insertLeft(var19,((char)97)) ;
      Position<Character> var21 = resultTree.insertRight(var20,((char)98)) ;
      Position<Character> var22 = resultTree.insertLeft(var21,((char)99)) ;
      Position<Character> var23 = resultTree.insertLeft(var22,((char)100)) ;
      Position<Character> var24 = resultTree.insertLeft(var23,((char)101)) ;
      Position<Character> var25 = resultTree.insertRight(var23,((char)102)) ;
      Position<Character> var26 = resultTree.insertRight(var22,((char)103)) ;
      Position<Character> var27 = resultTree.insertLeft(var26,((char)104)) ;
      Position<Character> var28 = resultTree.insertRight(var26,((char)105)) ;
      Position<Character> var29 = resultTree.insertRight(var19,((char)97)) ;
      Position<Character> var30 = resultTree.insertRight(var29,((char)98)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { true,false },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_36 ()
  {
      
      testName = "test_36" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertRight(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertLeft(var1,((char)99)) ;
      Position<Character> var3 = origtree1.insertRight(var2,((char)100)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var4 = tree1.addRoot(((char)97)) ;
      Position<Character> var5 = tree1.insertRight(var4,((char)98)) ;
      Position<Character> var6 = tree1.insertLeft(var5,((char)99)) ;
      Position<Character> var7 = tree1.insertRight(var6,((char)100)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var8 = tree2.addRoot(((char)97)) ;
      Position<Character> var9 = tree2.insertLeft(var8,((char)98)) ;
      Position<Character> var10 = tree2.insertRight(var9,((char)99)) ;
      Position<Character> var11 = tree2.insertLeft(var10,((char)100)) ;
      Position<Character> var12 = tree2.insertRight(var10,((char)101)) ;
      Position<Character> var13 = tree2.insertRight(var8,((char)102)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var14 = tree3.addRoot(((char)97)) ;
      Position<Character> var15 = tree3.insertRight(var14,((char)98)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var16 = resultTree.addRoot(((char)97)) ;
      Position<Character> var17 = resultTree.insertRight(var16,((char)98)) ;
      Position<Character> var18 = resultTree.insertLeft(var17,((char)99)) ;
      Position<Character> var19 = resultTree.insertRight(var18,((char)100)) ;
      Position<Character> var20 = resultTree.insertLeft(var19,((char)97)) ;
      Position<Character> var21 = resultTree.insertLeft(var20,((char)98)) ;
      Position<Character> var22 = resultTree.insertRight(var21,((char)99)) ;
      Position<Character> var23 = resultTree.insertLeft(var22,((char)100)) ;
      Position<Character> var24 = resultTree.insertRight(var22,((char)101)) ;
      Position<Character> var25 = resultTree.insertRight(var20,((char)102)) ;
      Position<Character> var26 = resultTree.insertRight(var19,((char)97)) ;
      Position<Character> var27 = resultTree.insertRight(var26,((char)98)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { false,true,false },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_37 ()
  {
      
      testName = "test_37" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertLeft(var1,((char)99)) ;
      Position<Character> var3 = origtree1.insertLeft(var2,((char)100)) ;
      Position<Character> var4 = origtree1.insertLeft(var3,((char)101)) ;
      Position<Character> var5 = origtree1.insertRight(var2,((char)102)) ;
      Position<Character> var6 = origtree1.insertLeft(var5,((char)103)) ;
      Position<Character> var7 = origtree1.insertLeft(var6,((char)104)) ;
      Position<Character> var8 = origtree1.insertRight(var0,((char)105)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var9 = tree1.addRoot(((char)97)) ;
      Position<Character> var10 = tree1.insertLeft(var9,((char)98)) ;
      Position<Character> var11 = tree1.insertLeft(var10,((char)99)) ;
      Position<Character> var12 = tree1.insertLeft(var11,((char)100)) ;
      Position<Character> var13 = tree1.insertLeft(var12,((char)101)) ;
      Position<Character> var14 = tree1.insertRight(var11,((char)102)) ;
      Position<Character> var15 = tree1.insertLeft(var14,((char)103)) ;
      Position<Character> var16 = tree1.insertLeft(var15,((char)104)) ;
      Position<Character> var17 = tree1.insertRight(var9,((char)105)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var18 = tree2.addRoot(((char)97)) ;
      Position<Character> var19 = tree2.insertLeft(var18,((char)98)) ;
      Position<Character> var20 = tree2.insertRight(var19,((char)99)) ;
      Position<Character> var21 = tree2.insertRight(var20,((char)100)) ;
      Position<Character> var22 = tree2.insertLeft(var21,((char)101)) ;
      Position<Character> var23 = tree2.insertLeft(var22,((char)102)) ;
      Position<Character> var24 = tree2.insertRight(var22,((char)103)) ;
      Position<Character> var25 = tree2.insertRight(var21,((char)104)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var26 = tree3.addRoot(((char)97)) ;
      Position<Character> var27 = tree3.insertLeft(var26,((char)98)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var28 = resultTree.addRoot(((char)97)) ;
      Position<Character> var29 = resultTree.insertLeft(var28,((char)98)) ;
      Position<Character> var30 = resultTree.insertLeft(var29,((char)99)) ;
      Position<Character> var31 = resultTree.insertLeft(var30,((char)100)) ;
      Position<Character> var32 = resultTree.insertLeft(var31,((char)101)) ;
      Position<Character> var33 = resultTree.insertRight(var30,((char)102)) ;
      Position<Character> var34 = resultTree.insertLeft(var33,((char)103)) ;
      Position<Character> var35 = resultTree.insertLeft(var34,((char)104)) ;
      Position<Character> var36 = resultTree.insertRight(var28,((char)105)) ;
      Position<Character> var37 = resultTree.insertLeft(var36,((char)97)) ;
      Position<Character> var38 = resultTree.insertLeft(var37,((char)98)) ;
      Position<Character> var39 = resultTree.insertRight(var38,((char)99)) ;
      Position<Character> var40 = resultTree.insertRight(var39,((char)100)) ;
      Position<Character> var41 = resultTree.insertLeft(var40,((char)101)) ;
      Position<Character> var42 = resultTree.insertLeft(var41,((char)102)) ;
      Position<Character> var43 = resultTree.insertRight(var41,((char)103)) ;
      Position<Character> var44 = resultTree.insertRight(var40,((char)104)) ;
      Position<Character> var45 = resultTree.insertRight(var36,((char)97)) ;
      Position<Character> var46 = resultTree.insertLeft(var45,((char)98)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { false },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_38 ()
  {
      
      testName = "test_38" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertRight(var0,((char)99)) ;
      Position<Character> var3 = origtree1.insertLeft(var2,((char)100)) ;
      Position<Character> var4 = origtree1.insertLeft(var3,((char)101)) ;
      Position<Character> var5 = origtree1.insertRight(var2,((char)102)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var6 = tree1.addRoot(((char)97)) ;
      Position<Character> var7 = tree1.insertLeft(var6,((char)98)) ;
      Position<Character> var8 = tree1.insertRight(var6,((char)99)) ;
      Position<Character> var9 = tree1.insertLeft(var8,((char)100)) ;
      Position<Character> var10 = tree1.insertLeft(var9,((char)101)) ;
      Position<Character> var11 = tree1.insertRight(var8,((char)102)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var12 = tree2.addRoot(((char)97)) ;
      Position<Character> var13 = tree2.insertLeft(var12,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var14 = tree3.addRoot(((char)97)) ;
      Position<Character> var15 = tree3.insertRight(var14,((char)98)) ;
      Position<Character> var16 = tree3.insertLeft(var15,((char)99)) ;
      Position<Character> var17 = tree3.insertLeft(var16,((char)100)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var18 = resultTree.addRoot(((char)97)) ;
      Position<Character> var19 = resultTree.insertLeft(var18,((char)98)) ;
      Position<Character> var20 = resultTree.insertRight(var18,((char)99)) ;
      Position<Character> var21 = resultTree.insertLeft(var20,((char)100)) ;
      Position<Character> var22 = resultTree.insertLeft(var21,((char)101)) ;
      Position<Character> var23 = resultTree.insertLeft(var22,((char)97)) ;
      Position<Character> var24 = resultTree.insertLeft(var23,((char)98)) ;
      Position<Character> var25 = resultTree.insertRight(var22,((char)97)) ;
      Position<Character> var26 = resultTree.insertRight(var25,((char)98)) ;
      Position<Character> var27 = resultTree.insertLeft(var26,((char)99)) ;
      Position<Character> var28 = resultTree.insertLeft(var27,((char)100)) ;
      Position<Character> var29 = resultTree.insertRight(var20,((char)102)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { false,true,true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_39 ()
  {
      
      testName = "test_39" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertRight(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertRight(var1,((char)99)) ;
      Position<Character> var3 = origtree1.insertRight(var2,((char)100)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var4 = tree1.addRoot(((char)97)) ;
      Position<Character> var5 = tree1.insertRight(var4,((char)98)) ;
      Position<Character> var6 = tree1.insertRight(var5,((char)99)) ;
      Position<Character> var7 = tree1.insertRight(var6,((char)100)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var8 = tree2.addRoot(((char)97)) ;
      Position<Character> var9 = tree2.insertLeft(var8,((char)98)) ;
      Position<Character> var10 = tree2.insertRight(var8,((char)99)) ;
      Position<Character> var11 = tree2.insertRight(var10,((char)100)) ;
      Position<Character> var12 = tree2.insertRight(var11,((char)101)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var13 = tree3.addRoot(((char)97)) ;
      Position<Character> var14 = tree3.insertLeft(var13,((char)98)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var15 = resultTree.addRoot(((char)97)) ;
      Position<Character> var16 = resultTree.insertRight(var15,((char)98)) ;
      Position<Character> var17 = resultTree.insertRight(var16,((char)99)) ;
      Position<Character> var18 = resultTree.insertRight(var17,((char)100)) ;
      Position<Character> var19 = resultTree.insertLeft(var18,((char)97)) ;
      Position<Character> var20 = resultTree.insertLeft(var19,((char)98)) ;
      Position<Character> var21 = resultTree.insertRight(var19,((char)99)) ;
      Position<Character> var22 = resultTree.insertRight(var21,((char)100)) ;
      Position<Character> var23 = resultTree.insertRight(var22,((char)101)) ;
      Position<Character> var24 = resultTree.insertRight(var18,((char)97)) ;
      Position<Character> var25 = resultTree.insertLeft(var24,((char)98)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { false,false,false },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_40 ()
  {
      
      testName = "test_40" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var2 = tree1.addRoot(((char)97)) ;
      Position<Character> var3 = tree1.insertLeft(var2,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var4 = tree2.addRoot(((char)97)) ;
      Position<Character> var5 = tree2.insertRight(var4,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var6 = tree3.addRoot(((char)97)) ;
      Position<Character> var7 = tree3.insertRight(var6,((char)98)) ;
      Position<Character> var8 = tree3.insertLeft(var7,((char)99)) ;
      Position<Character> var9 = tree3.insertLeft(var8,((char)100)) ;
      Position<Character> var10 = tree3.insertLeft(var9,((char)101)) ;
      Position<Character> var11 = tree3.insertLeft(var10,((char)102)) ;
      Position<Character> var12 = tree3.insertRight(var9,((char)103)) ;
      Position<Character> var13 = tree3.insertRight(var12,((char)104)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var14 = resultTree.addRoot(((char)97)) ;
      Position<Character> var15 = resultTree.insertLeft(var14,((char)98)) ;
      Position<Character> var16 = resultTree.insertLeft(var15,((char)97)) ;
      Position<Character> var17 = resultTree.insertRight(var16,((char)98)) ;
      Position<Character> var18 = resultTree.insertRight(var15,((char)97)) ;
      Position<Character> var19 = resultTree.insertRight(var18,((char)98)) ;
      Position<Character> var20 = resultTree.insertLeft(var19,((char)99)) ;
      Position<Character> var21 = resultTree.insertLeft(var20,((char)100)) ;
      Position<Character> var22 = resultTree.insertLeft(var21,((char)101)) ;
      Position<Character> var23 = resultTree.insertLeft(var22,((char)102)) ;
      Position<Character> var24 = resultTree.insertRight(var21,((char)103)) ;
      Position<Character> var25 = resultTree.insertRight(var24,((char)104)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_41 ()
  {
      
      testName = "test_41" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertLeft(var1,((char)99)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var3 = tree1.addRoot(((char)97)) ;
      Position<Character> var4 = tree1.insertLeft(var3,((char)98)) ;
      Position<Character> var5 = tree1.insertLeft(var4,((char)99)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var6 = tree2.addRoot(((char)97)) ;
      Position<Character> var7 = tree2.insertLeft(var6,((char)98)) ;
      Position<Character> var8 = tree2.insertRight(var7,((char)99)) ;
      Position<Character> var9 = tree2.insertLeft(var8,((char)100)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var10 = tree3.addRoot(((char)97)) ;
      Position<Character> var11 = tree3.insertRight(var10,((char)98)) ;
      Position<Character> var12 = tree3.insertRight(var11,((char)99)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var13 = resultTree.addRoot(((char)97)) ;
      Position<Character> var14 = resultTree.insertLeft(var13,((char)98)) ;
      Position<Character> var15 = resultTree.insertLeft(var14,((char)99)) ;
      Position<Character> var16 = resultTree.insertLeft(var15,((char)97)) ;
      Position<Character> var17 = resultTree.insertLeft(var16,((char)98)) ;
      Position<Character> var18 = resultTree.insertRight(var17,((char)99)) ;
      Position<Character> var19 = resultTree.insertLeft(var18,((char)100)) ;
      Position<Character> var20 = resultTree.insertRight(var15,((char)97)) ;
      Position<Character> var21 = resultTree.insertRight(var20,((char)98)) ;
      Position<Character> var22 = resultTree.insertRight(var21,((char)99)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { true,true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_42 ()
  {
      
      testName = "test_42" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertLeft(var1,((char)99)) ;
      Position<Character> var3 = origtree1.insertLeft(var2,((char)100)) ;
      Position<Character> var4 = origtree1.insertRight(var3,((char)101)) ;
      Position<Character> var5 = origtree1.insertLeft(var4,((char)102)) ;
      Position<Character> var6 = origtree1.insertRight(var1,((char)103)) ;
      Position<Character> var7 = origtree1.insertLeft(var6,((char)104)) ;
      Position<Character> var8 = origtree1.insertLeft(var7,((char)105)) ;
      Position<Character> var9 = origtree1.insertLeft(var8,((char)106)) ;
      Position<Character> var10 = origtree1.insertRight(var0,((char)107)) ;
      Position<Character> var11 = origtree1.insertLeft(var10,((char)108)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var12 = tree1.addRoot(((char)97)) ;
      Position<Character> var13 = tree1.insertLeft(var12,((char)98)) ;
      Position<Character> var14 = tree1.insertLeft(var13,((char)99)) ;
      Position<Character> var15 = tree1.insertLeft(var14,((char)100)) ;
      Position<Character> var16 = tree1.insertRight(var15,((char)101)) ;
      Position<Character> var17 = tree1.insertLeft(var16,((char)102)) ;
      Position<Character> var18 = tree1.insertRight(var13,((char)103)) ;
      Position<Character> var19 = tree1.insertLeft(var18,((char)104)) ;
      Position<Character> var20 = tree1.insertLeft(var19,((char)105)) ;
      Position<Character> var21 = tree1.insertLeft(var20,((char)106)) ;
      Position<Character> var22 = tree1.insertRight(var12,((char)107)) ;
      Position<Character> var23 = tree1.insertLeft(var22,((char)108)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var24 = tree2.addRoot(((char)97)) ;
      Position<Character> var25 = tree2.insertRight(var24,((char)98)) ;
      Position<Character> var26 = tree2.insertLeft(var25,((char)99)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var27 = tree3.addRoot(((char)97)) ;
      Position<Character> var28 = tree3.insertRight(var27,((char)98)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var29 = resultTree.addRoot(((char)97)) ;
      Position<Character> var30 = resultTree.insertLeft(var29,((char)98)) ;
      Position<Character> var31 = resultTree.insertLeft(var30,((char)99)) ;
      Position<Character> var32 = resultTree.insertLeft(var31,((char)100)) ;
      Position<Character> var33 = resultTree.insertRight(var32,((char)101)) ;
      Position<Character> var34 = resultTree.insertLeft(var33,((char)102)) ;
      Position<Character> var35 = resultTree.insertLeft(var34,((char)97)) ;
      Position<Character> var36 = resultTree.insertRight(var35,((char)98)) ;
      Position<Character> var37 = resultTree.insertLeft(var36,((char)99)) ;
      Position<Character> var38 = resultTree.insertRight(var34,((char)97)) ;
      Position<Character> var39 = resultTree.insertRight(var38,((char)98)) ;
      Position<Character> var40 = resultTree.insertRight(var30,((char)103)) ;
      Position<Character> var41 = resultTree.insertLeft(var40,((char)104)) ;
      Position<Character> var42 = resultTree.insertLeft(var41,((char)105)) ;
      Position<Character> var43 = resultTree.insertLeft(var42,((char)106)) ;
      Position<Character> var44 = resultTree.insertRight(var29,((char)107)) ;
      Position<Character> var45 = resultTree.insertLeft(var44,((char)108)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { true,true,true,false,true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_43 ()
  {
      
      testName = "test_43" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertRight(var0,((char)99)) ;
      Position<Character> var3 = origtree1.insertLeft(var2,((char)100)) ;
      Position<Character> var4 = origtree1.insertLeft(var3,((char)101)) ;
      Position<Character> var5 = origtree1.insertRight(var3,((char)102)) ;
      Position<Character> var6 = origtree1.insertRight(var2,((char)103)) ;
      Position<Character> var7 = origtree1.insertLeft(var6,((char)104)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var8 = tree1.addRoot(((char)97)) ;
      Position<Character> var9 = tree1.insertLeft(var8,((char)98)) ;
      Position<Character> var10 = tree1.insertRight(var8,((char)99)) ;
      Position<Character> var11 = tree1.insertLeft(var10,((char)100)) ;
      Position<Character> var12 = tree1.insertLeft(var11,((char)101)) ;
      Position<Character> var13 = tree1.insertRight(var11,((char)102)) ;
      Position<Character> var14 = tree1.insertRight(var10,((char)103)) ;
      Position<Character> var15 = tree1.insertLeft(var14,((char)104)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var16 = tree2.addRoot(((char)97)) ;
      Position<Character> var17 = tree2.insertRight(var16,((char)98)) ;
      Position<Character> var18 = tree2.insertLeft(var17,((char)99)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var19 = tree3.addRoot(((char)97)) ;
      Position<Character> var20 = tree3.insertRight(var19,((char)98)) ;
      Position<Character> var21 = tree3.insertLeft(var20,((char)99)) ;
      Position<Character> var22 = tree3.insertRight(var21,((char)100)) ;
      Position<Character> var23 = tree3.insertRight(var20,((char)101)) ;
      Position<Character> var24 = tree3.insertLeft(var23,((char)102)) ;
      Position<Character> var25 = tree3.insertLeft(var24,((char)103)) ;
      Position<Character> var26 = tree3.insertRight(var24,((char)104)) ;
      Position<Character> var27 = tree3.insertLeft(var26,((char)105)) ;
      Position<Character> var28 = tree3.insertRight(var26,((char)106)) ;
      Position<Character> var29 = tree3.insertRight(var23,((char)107)) ;
      Position<Character> var30 = tree3.insertLeft(var29,((char)108)) ;
      Position<Character> var31 = tree3.insertLeft(var30,((char)109)) ;
      Position<Character> var32 = tree3.insertRight(var30,((char)110)) ;
      Position<Character> var33 = tree3.insertRight(var29,((char)111)) ;
      Position<Character> var34 = tree3.insertLeft(var33,((char)112)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var35 = resultTree.addRoot(((char)97)) ;
      Position<Character> var36 = resultTree.insertLeft(var35,((char)98)) ;
      Position<Character> var37 = resultTree.insertLeft(var36,((char)97)) ;
      Position<Character> var38 = resultTree.insertRight(var37,((char)98)) ;
      Position<Character> var39 = resultTree.insertLeft(var38,((char)99)) ;
      Position<Character> var40 = resultTree.insertRight(var36,((char)97)) ;
      Position<Character> var41 = resultTree.insertRight(var40,((char)98)) ;
      Position<Character> var42 = resultTree.insertLeft(var41,((char)99)) ;
      Position<Character> var43 = resultTree.insertRight(var42,((char)100)) ;
      Position<Character> var44 = resultTree.insertRight(var41,((char)101)) ;
      Position<Character> var45 = resultTree.insertLeft(var44,((char)102)) ;
      Position<Character> var46 = resultTree.insertLeft(var45,((char)103)) ;
      Position<Character> var47 = resultTree.insertRight(var45,((char)104)) ;
      Position<Character> var48 = resultTree.insertLeft(var47,((char)105)) ;
      Position<Character> var49 = resultTree.insertRight(var47,((char)106)) ;
      Position<Character> var50 = resultTree.insertRight(var44,((char)107)) ;
      Position<Character> var51 = resultTree.insertLeft(var50,((char)108)) ;
      Position<Character> var52 = resultTree.insertLeft(var51,((char)109)) ;
      Position<Character> var53 = resultTree.insertRight(var51,((char)110)) ;
      Position<Character> var54 = resultTree.insertRight(var50,((char)111)) ;
      Position<Character> var55 = resultTree.insertLeft(var54,((char)112)) ;
      Position<Character> var56 = resultTree.insertRight(var35,((char)99)) ;
      Position<Character> var57 = resultTree.insertLeft(var56,((char)100)) ;
      Position<Character> var58 = resultTree.insertLeft(var57,((char)101)) ;
      Position<Character> var59 = resultTree.insertRight(var57,((char)102)) ;
      Position<Character> var60 = resultTree.insertRight(var56,((char)103)) ;
      Position<Character> var61 = resultTree.insertLeft(var60,((char)104)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_44 ()
  {
      
      testName = "test_44" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertLeft(var1,((char)99)) ;
      Position<Character> var3 = origtree1.insertLeft(var2,((char)100)) ;
      Position<Character> var4 = origtree1.insertLeft(var3,((char)101)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var5 = tree1.addRoot(((char)97)) ;
      Position<Character> var6 = tree1.insertLeft(var5,((char)98)) ;
      Position<Character> var7 = tree1.insertLeft(var6,((char)99)) ;
      Position<Character> var8 = tree1.insertLeft(var7,((char)100)) ;
      Position<Character> var9 = tree1.insertLeft(var8,((char)101)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var10 = tree2.addRoot(((char)97)) ;
      Position<Character> var11 = tree2.insertLeft(var10,((char)98)) ;
      Position<Character> var12 = tree2.insertLeft(var11,((char)99)) ;
      Position<Character> var13 = tree2.insertRight(var12,((char)100)) ;
      Position<Character> var14 = tree2.insertRight(var11,((char)101)) ;
      Position<Character> var15 = tree2.insertRight(var14,((char)102)) ;
      Position<Character> var16 = tree2.insertRight(var10,((char)103)) ;
      Position<Character> var17 = tree2.insertLeft(var16,((char)104)) ;
      Position<Character> var18 = tree2.insertRight(var16,((char)105)) ;
      Position<Character> var19 = tree2.insertLeft(var18,((char)106)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var20 = tree3.addRoot(((char)97)) ;
      Position<Character> var21 = tree3.insertRight(var20,((char)98)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var22 = resultTree.addRoot(((char)97)) ;
      Position<Character> var23 = resultTree.insertLeft(var22,((char)98)) ;
      Position<Character> var24 = resultTree.insertLeft(var23,((char)99)) ;
      Position<Character> var25 = resultTree.insertLeft(var24,((char)100)) ;
      Position<Character> var26 = resultTree.insertLeft(var25,((char)101)) ;
      Position<Character> var27 = resultTree.insertLeft(var26,((char)97)) ;
      Position<Character> var28 = resultTree.insertLeft(var27,((char)98)) ;
      Position<Character> var29 = resultTree.insertLeft(var28,((char)99)) ;
      Position<Character> var30 = resultTree.insertRight(var29,((char)100)) ;
      Position<Character> var31 = resultTree.insertRight(var28,((char)101)) ;
      Position<Character> var32 = resultTree.insertRight(var31,((char)102)) ;
      Position<Character> var33 = resultTree.insertRight(var27,((char)103)) ;
      Position<Character> var34 = resultTree.insertLeft(var33,((char)104)) ;
      Position<Character> var35 = resultTree.insertRight(var33,((char)105)) ;
      Position<Character> var36 = resultTree.insertLeft(var35,((char)106)) ;
      Position<Character> var37 = resultTree.insertRight(var26,((char)97)) ;
      Position<Character> var38 = resultTree.insertRight(var37,((char)98)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { true,true,true,true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_45 ()
  {
      
      testName = "test_45" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertLeft(var1,((char)99)) ;
      Position<Character> var3 = origtree1.insertLeft(var2,((char)100)) ;
      Position<Character> var4 = origtree1.insertLeft(var3,((char)101)) ;
      Position<Character> var5 = origtree1.insertRight(var4,((char)102)) ;
      Position<Character> var6 = origtree1.insertRight(var2,((char)103)) ;
      Position<Character> var7 = origtree1.insertLeft(var6,((char)104)) ;
      Position<Character> var8 = origtree1.insertLeft(var7,((char)105)) ;
      Position<Character> var9 = origtree1.insertRight(var6,((char)106)) ;
      Position<Character> var10 = origtree1.insertLeft(var9,((char)107)) ;
      Position<Character> var11 = origtree1.insertRight(var1,((char)108)) ;
      Position<Character> var12 = origtree1.insertLeft(var11,((char)109)) ;
      Position<Character> var13 = origtree1.insertLeft(var12,((char)110)) ;
      Position<Character> var14 = origtree1.insertRight(var13,((char)111)) ;
      Position<Character> var15 = origtree1.insertRight(var12,((char)112)) ;
      Position<Character> var16 = origtree1.insertRight(var15,((char)113)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var17 = tree1.addRoot(((char)97)) ;
      Position<Character> var18 = tree1.insertLeft(var17,((char)98)) ;
      Position<Character> var19 = tree1.insertLeft(var18,((char)99)) ;
      Position<Character> var20 = tree1.insertLeft(var19,((char)100)) ;
      Position<Character> var21 = tree1.insertLeft(var20,((char)101)) ;
      Position<Character> var22 = tree1.insertRight(var21,((char)102)) ;
      Position<Character> var23 = tree1.insertRight(var19,((char)103)) ;
      Position<Character> var24 = tree1.insertLeft(var23,((char)104)) ;
      Position<Character> var25 = tree1.insertLeft(var24,((char)105)) ;
      Position<Character> var26 = tree1.insertRight(var23,((char)106)) ;
      Position<Character> var27 = tree1.insertLeft(var26,((char)107)) ;
      Position<Character> var28 = tree1.insertRight(var18,((char)108)) ;
      Position<Character> var29 = tree1.insertLeft(var28,((char)109)) ;
      Position<Character> var30 = tree1.insertLeft(var29,((char)110)) ;
      Position<Character> var31 = tree1.insertRight(var30,((char)111)) ;
      Position<Character> var32 = tree1.insertRight(var29,((char)112)) ;
      Position<Character> var33 = tree1.insertRight(var32,((char)113)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var34 = tree2.addRoot(((char)97)) ;
      Position<Character> var35 = tree2.insertLeft(var34,((char)98)) ;
      Position<Character> var36 = tree2.insertRight(var34,((char)99)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var37 = tree3.addRoot(((char)97)) ;
      Position<Character> var38 = tree3.insertLeft(var37,((char)98)) ;
      Position<Character> var39 = tree3.insertLeft(var38,((char)99)) ;
      Position<Character> var40 = tree3.insertLeft(var39,((char)100)) ;
      Position<Character> var41 = tree3.insertRight(var39,((char)101)) ;
      Position<Character> var42 = tree3.insertRight(var38,((char)102)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var43 = resultTree.addRoot(((char)97)) ;
      Position<Character> var44 = resultTree.insertLeft(var43,((char)98)) ;
      Position<Character> var45 = resultTree.insertLeft(var44,((char)99)) ;
      Position<Character> var46 = resultTree.insertLeft(var45,((char)100)) ;
      Position<Character> var47 = resultTree.insertLeft(var46,((char)101)) ;
      Position<Character> var48 = resultTree.insertRight(var47,((char)102)) ;
      Position<Character> var49 = resultTree.insertRight(var45,((char)103)) ;
      Position<Character> var50 = resultTree.insertLeft(var49,((char)104)) ;
      Position<Character> var51 = resultTree.insertLeft(var50,((char)105)) ;
      Position<Character> var52 = resultTree.insertRight(var49,((char)106)) ;
      Position<Character> var53 = resultTree.insertLeft(var52,((char)107)) ;
      Position<Character> var54 = resultTree.insertLeft(var53,((char)97)) ;
      Position<Character> var55 = resultTree.insertLeft(var54,((char)98)) ;
      Position<Character> var56 = resultTree.insertRight(var54,((char)99)) ;
      Position<Character> var57 = resultTree.insertRight(var53,((char)97)) ;
      Position<Character> var58 = resultTree.insertLeft(var57,((char)98)) ;
      Position<Character> var59 = resultTree.insertLeft(var58,((char)99)) ;
      Position<Character> var60 = resultTree.insertLeft(var59,((char)100)) ;
      Position<Character> var61 = resultTree.insertRight(var59,((char)101)) ;
      Position<Character> var62 = resultTree.insertRight(var58,((char)102)) ;
      Position<Character> var63 = resultTree.insertRight(var44,((char)108)) ;
      Position<Character> var64 = resultTree.insertLeft(var63,((char)109)) ;
      Position<Character> var65 = resultTree.insertLeft(var64,((char)110)) ;
      Position<Character> var66 = resultTree.insertRight(var65,((char)111)) ;
      Position<Character> var67 = resultTree.insertRight(var64,((char)112)) ;
      Position<Character> var68 = resultTree.insertRight(var67,((char)113)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { true,true,false,false,true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_46 ()
  {
      
      testName = "test_46" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertLeft(var1,((char)99)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var3 = tree1.addRoot(((char)97)) ;
      Position<Character> var4 = tree1.insertLeft(var3,((char)98)) ;
      Position<Character> var5 = tree1.insertLeft(var4,((char)99)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var6 = tree2.addRoot(((char)97)) ;
      Position<Character> var7 = tree2.insertLeft(var6,((char)98)) ;
      Position<Character> var8 = tree2.insertRight(var6,((char)99)) ;
      Position<Character> var9 = tree2.insertRight(var8,((char)100)) ;
      Position<Character> var10 = tree2.insertRight(var9,((char)101)) ;
      Position<Character> var11 = tree2.insertRight(var10,((char)102)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var12 = tree3.addRoot(((char)97)) ;
      Position<Character> var13 = tree3.insertLeft(var12,((char)98)) ;
      Position<Character> var14 = tree3.insertRight(var13,((char)99)) ;
      Position<Character> var15 = tree3.insertRight(var14,((char)100)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var16 = resultTree.addRoot(((char)97)) ;
      Position<Character> var17 = resultTree.insertLeft(var16,((char)98)) ;
      Position<Character> var18 = resultTree.insertLeft(var17,((char)99)) ;
      Position<Character> var19 = resultTree.insertLeft(var18,((char)97)) ;
      Position<Character> var20 = resultTree.insertLeft(var19,((char)98)) ;
      Position<Character> var21 = resultTree.insertRight(var19,((char)99)) ;
      Position<Character> var22 = resultTree.insertRight(var21,((char)100)) ;
      Position<Character> var23 = resultTree.insertRight(var22,((char)101)) ;
      Position<Character> var24 = resultTree.insertRight(var23,((char)102)) ;
      Position<Character> var25 = resultTree.insertRight(var18,((char)97)) ;
      Position<Character> var26 = resultTree.insertLeft(var25,((char)98)) ;
      Position<Character> var27 = resultTree.insertRight(var26,((char)99)) ;
      Position<Character> var28 = resultTree.insertRight(var27,((char)100)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { true,true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_47 ()
  {
      
      testName = "test_47" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertRight(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertLeft(var1,((char)99)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var3 = tree1.addRoot(((char)97)) ;
      Position<Character> var4 = tree1.insertRight(var3,((char)98)) ;
      Position<Character> var5 = tree1.insertLeft(var4,((char)99)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var6 = tree2.addRoot(((char)97)) ;
      Position<Character> var7 = tree2.insertLeft(var6,((char)98)) ;
      Position<Character> var8 = tree2.insertLeft(var7,((char)99)) ;
      Position<Character> var9 = tree2.insertRight(var8,((char)100)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var10 = tree3.addRoot(((char)97)) ;
      Position<Character> var11 = tree3.insertLeft(var10,((char)98)) ;
      Position<Character> var12 = tree3.insertRight(var11,((char)99)) ;
      Position<Character> var13 = tree3.insertRight(var10,((char)100)) ;
      Position<Character> var14 = tree3.insertRight(var13,((char)101)) ;
      Position<Character> var15 = tree3.insertLeft(var14,((char)102)) ;
      Position<Character> var16 = tree3.insertLeft(var15,((char)103)) ;
      Position<Character> var17 = tree3.insertRight(var14,((char)104)) ;
      Position<Character> var18 = tree3.insertRight(var17,((char)105)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var19 = resultTree.addRoot(((char)97)) ;
      Position<Character> var20 = resultTree.insertRight(var19,((char)98)) ;
      Position<Character> var21 = resultTree.insertLeft(var20,((char)99)) ;
      Position<Character> var22 = resultTree.insertLeft(var21,((char)97)) ;
      Position<Character> var23 = resultTree.insertLeft(var22,((char)98)) ;
      Position<Character> var24 = resultTree.insertLeft(var23,((char)99)) ;
      Position<Character> var25 = resultTree.insertRight(var24,((char)100)) ;
      Position<Character> var26 = resultTree.insertRight(var21,((char)97)) ;
      Position<Character> var27 = resultTree.insertLeft(var26,((char)98)) ;
      Position<Character> var28 = resultTree.insertRight(var27,((char)99)) ;
      Position<Character> var29 = resultTree.insertRight(var26,((char)100)) ;
      Position<Character> var30 = resultTree.insertRight(var29,((char)101)) ;
      Position<Character> var31 = resultTree.insertLeft(var30,((char)102)) ;
      Position<Character> var32 = resultTree.insertLeft(var31,((char)103)) ;
      Position<Character> var33 = resultTree.insertRight(var30,((char)104)) ;
      Position<Character> var34 = resultTree.insertRight(var33,((char)105)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { false,true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_48 ()
  {
      
      testName = "test_48" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertRight(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertRight(var1,((char)99)) ;
      Position<Character> var3 = origtree1.insertLeft(var2,((char)100)) ;
      Position<Character> var4 = origtree1.insertRight(var2,((char)101)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var5 = tree1.addRoot(((char)97)) ;
      Position<Character> var6 = tree1.insertRight(var5,((char)98)) ;
      Position<Character> var7 = tree1.insertRight(var6,((char)99)) ;
      Position<Character> var8 = tree1.insertLeft(var7,((char)100)) ;
      Position<Character> var9 = tree1.insertRight(var7,((char)101)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var10 = tree2.addRoot(((char)97)) ;
      Position<Character> var11 = tree2.insertLeft(var10,((char)98)) ;
      Position<Character> var12 = tree2.insertRight(var10,((char)99)) ;
      Position<Character> var13 = tree2.insertLeft(var12,((char)100)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var14 = tree3.addRoot(((char)97)) ;
      Position<Character> var15 = tree3.insertLeft(var14,((char)98)) ;
      Position<Character> var16 = tree3.insertLeft(var15,((char)99)) ;
      Position<Character> var17 = tree3.insertLeft(var16,((char)100)) ;
      Position<Character> var18 = tree3.insertRight(var17,((char)101)) ;
      Position<Character> var19 = tree3.insertRight(var16,((char)102)) ;
      Position<Character> var20 = tree3.insertLeft(var19,((char)103)) ;
      Position<Character> var21 = tree3.insertRight(var19,((char)104)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var22 = resultTree.addRoot(((char)97)) ;
      Position<Character> var23 = resultTree.insertRight(var22,((char)98)) ;
      Position<Character> var24 = resultTree.insertRight(var23,((char)99)) ;
      Position<Character> var25 = resultTree.insertLeft(var24,((char)100)) ;
      Position<Character> var26 = resultTree.insertRight(var24,((char)101)) ;
      Position<Character> var27 = resultTree.insertLeft(var26,((char)97)) ;
      Position<Character> var28 = resultTree.insertLeft(var27,((char)98)) ;
      Position<Character> var29 = resultTree.insertRight(var27,((char)99)) ;
      Position<Character> var30 = resultTree.insertLeft(var29,((char)100)) ;
      Position<Character> var31 = resultTree.insertRight(var26,((char)97)) ;
      Position<Character> var32 = resultTree.insertLeft(var31,((char)98)) ;
      Position<Character> var33 = resultTree.insertLeft(var32,((char)99)) ;
      Position<Character> var34 = resultTree.insertLeft(var33,((char)100)) ;
      Position<Character> var35 = resultTree.insertRight(var34,((char)101)) ;
      Position<Character> var36 = resultTree.insertRight(var33,((char)102)) ;
      Position<Character> var37 = resultTree.insertLeft(var36,((char)103)) ;
      Position<Character> var38 = resultTree.insertRight(var36,((char)104)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { false,false,false },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_49 ()
  {
      
      testName = "test_49" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertLeft(var1,((char)99)) ;
      Position<Character> var3 = origtree1.insertRight(var1,((char)100)) ;
      Position<Character> var4 = origtree1.insertLeft(var3,((char)101)) ;
      Position<Character> var5 = origtree1.insertLeft(var4,((char)102)) ;
      Position<Character> var6 = origtree1.insertLeft(var5,((char)103)) ;
      Position<Character> var7 = origtree1.insertRight(var5,((char)104)) ;
      Position<Character> var8 = origtree1.insertRight(var4,((char)105)) ;
      Position<Character> var9 = origtree1.insertLeft(var8,((char)106)) ;
      Position<Character> var10 = origtree1.insertRight(var8,((char)107)) ;
      Position<Character> var11 = origtree1.insertRight(var3,((char)108)) ;
      Position<Character> var12 = origtree1.insertRight(var0,((char)109)) ;
      Position<Character> var13 = origtree1.insertRight(var12,((char)110)) ;
      Position<Character> var14 = origtree1.insertLeft(var13,((char)111)) ;
      Position<Character> var15 = origtree1.insertRight(var14,((char)112)) ;
      Position<Character> var16 = origtree1.insertLeft(var15,((char)113)) ;
      Position<Character> var17 = origtree1.insertRight(var15,((char)114)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var18 = tree1.addRoot(((char)97)) ;
      Position<Character> var19 = tree1.insertLeft(var18,((char)98)) ;
      Position<Character> var20 = tree1.insertLeft(var19,((char)99)) ;
      Position<Character> var21 = tree1.insertRight(var19,((char)100)) ;
      Position<Character> var22 = tree1.insertLeft(var21,((char)101)) ;
      Position<Character> var23 = tree1.insertLeft(var22,((char)102)) ;
      Position<Character> var24 = tree1.insertLeft(var23,((char)103)) ;
      Position<Character> var25 = tree1.insertRight(var23,((char)104)) ;
      Position<Character> var26 = tree1.insertRight(var22,((char)105)) ;
      Position<Character> var27 = tree1.insertLeft(var26,((char)106)) ;
      Position<Character> var28 = tree1.insertRight(var26,((char)107)) ;
      Position<Character> var29 = tree1.insertRight(var21,((char)108)) ;
      Position<Character> var30 = tree1.insertRight(var18,((char)109)) ;
      Position<Character> var31 = tree1.insertRight(var30,((char)110)) ;
      Position<Character> var32 = tree1.insertLeft(var31,((char)111)) ;
      Position<Character> var33 = tree1.insertRight(var32,((char)112)) ;
      Position<Character> var34 = tree1.insertLeft(var33,((char)113)) ;
      Position<Character> var35 = tree1.insertRight(var33,((char)114)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var36 = tree2.addRoot(((char)97)) ;
      Position<Character> var37 = tree2.insertRight(var36,((char)98)) ;
      Position<Character> var38 = tree2.insertLeft(var37,((char)99)) ;
      Position<Character> var39 = tree2.insertRight(var38,((char)100)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var40 = tree3.addRoot(((char)97)) ;
      Position<Character> var41 = tree3.insertLeft(var40,((char)98)) ;
      Position<Character> var42 = tree3.insertLeft(var41,((char)99)) ;
      Position<Character> var43 = tree3.insertRight(var42,((char)100)) ;
      Position<Character> var44 = tree3.insertLeft(var43,((char)101)) ;
      Position<Character> var45 = tree3.insertRight(var41,((char)102)) ;
      Position<Character> var46 = tree3.insertLeft(var45,((char)103)) ;
      Position<Character> var47 = tree3.insertRight(var46,((char)104)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var48 = resultTree.addRoot(((char)97)) ;
      Position<Character> var49 = resultTree.insertLeft(var48,((char)98)) ;
      Position<Character> var50 = resultTree.insertLeft(var49,((char)99)) ;
      Position<Character> var51 = resultTree.insertLeft(var50,((char)97)) ;
      Position<Character> var52 = resultTree.insertRight(var51,((char)98)) ;
      Position<Character> var53 = resultTree.insertLeft(var52,((char)99)) ;
      Position<Character> var54 = resultTree.insertRight(var53,((char)100)) ;
      Position<Character> var55 = resultTree.insertRight(var50,((char)97)) ;
      Position<Character> var56 = resultTree.insertLeft(var55,((char)98)) ;
      Position<Character> var57 = resultTree.insertLeft(var56,((char)99)) ;
      Position<Character> var58 = resultTree.insertRight(var57,((char)100)) ;
      Position<Character> var59 = resultTree.insertLeft(var58,((char)101)) ;
      Position<Character> var60 = resultTree.insertRight(var56,((char)102)) ;
      Position<Character> var61 = resultTree.insertLeft(var60,((char)103)) ;
      Position<Character> var62 = resultTree.insertRight(var61,((char)104)) ;
      Position<Character> var63 = resultTree.insertRight(var49,((char)100)) ;
      Position<Character> var64 = resultTree.insertLeft(var63,((char)101)) ;
      Position<Character> var65 = resultTree.insertLeft(var64,((char)102)) ;
      Position<Character> var66 = resultTree.insertLeft(var65,((char)103)) ;
      Position<Character> var67 = resultTree.insertRight(var65,((char)104)) ;
      Position<Character> var68 = resultTree.insertRight(var64,((char)105)) ;
      Position<Character> var69 = resultTree.insertLeft(var68,((char)106)) ;
      Position<Character> var70 = resultTree.insertRight(var68,((char)107)) ;
      Position<Character> var71 = resultTree.insertRight(var63,((char)108)) ;
      Position<Character> var72 = resultTree.insertRight(var48,((char)109)) ;
      Position<Character> var73 = resultTree.insertRight(var72,((char)110)) ;
      Position<Character> var74 = resultTree.insertLeft(var73,((char)111)) ;
      Position<Character> var75 = resultTree.insertRight(var74,((char)112)) ;
      Position<Character> var76 = resultTree.insertLeft(var75,((char)113)) ;
      Position<Character> var77 = resultTree.insertRight(var75,((char)114)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { true,true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_50 ()
  {
      
      testName = "test_50" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertRight(var0,((char)99)) ;
      Position<Character> var3 = origtree1.insertLeft(var2,((char)100)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var4 = tree1.addRoot(((char)97)) ;
      Position<Character> var5 = tree1.insertLeft(var4,((char)98)) ;
      Position<Character> var6 = tree1.insertRight(var4,((char)99)) ;
      Position<Character> var7 = tree1.insertLeft(var6,((char)100)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var8 = tree2.addRoot(((char)97)) ;
      Position<Character> var9 = tree2.insertLeft(var8,((char)98)) ;
      Position<Character> var10 = tree2.insertRight(var8,((char)99)) ;
      Position<Character> var11 = tree2.insertLeft(var10,((char)100)) ;
      Position<Character> var12 = tree2.insertLeft(var11,((char)101)) ;
      Position<Character> var13 = tree2.insertRight(var11,((char)102)) ;
      Position<Character> var14 = tree2.insertLeft(var13,((char)103)) ;
      Position<Character> var15 = tree2.insertRight(var14,((char)104)) ;
      Position<Character> var16 = tree2.insertRight(var13,((char)105)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var17 = tree3.addRoot(((char)97)) ;
      Position<Character> var18 = tree3.insertRight(var17,((char)98)) ;
      Position<Character> var19 = tree3.insertLeft(var18,((char)99)) ;
      Position<Character> var20 = tree3.insertLeft(var19,((char)100)) ;
      Position<Character> var21 = tree3.insertRight(var19,((char)101)) ;
      Position<Character> var22 = tree3.insertRight(var18,((char)102)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var23 = resultTree.addRoot(((char)97)) ;
      Position<Character> var24 = resultTree.insertLeft(var23,((char)98)) ;
      Position<Character> var25 = resultTree.insertRight(var23,((char)99)) ;
      Position<Character> var26 = resultTree.insertLeft(var25,((char)100)) ;
      Position<Character> var27 = resultTree.insertLeft(var26,((char)97)) ;
      Position<Character> var28 = resultTree.insertLeft(var27,((char)98)) ;
      Position<Character> var29 = resultTree.insertRight(var27,((char)99)) ;
      Position<Character> var30 = resultTree.insertLeft(var29,((char)100)) ;
      Position<Character> var31 = resultTree.insertLeft(var30,((char)101)) ;
      Position<Character> var32 = resultTree.insertRight(var30,((char)102)) ;
      Position<Character> var33 = resultTree.insertLeft(var32,((char)103)) ;
      Position<Character> var34 = resultTree.insertRight(var33,((char)104)) ;
      Position<Character> var35 = resultTree.insertRight(var32,((char)105)) ;
      Position<Character> var36 = resultTree.insertRight(var26,((char)97)) ;
      Position<Character> var37 = resultTree.insertRight(var36,((char)98)) ;
      Position<Character> var38 = resultTree.insertLeft(var37,((char)99)) ;
      Position<Character> var39 = resultTree.insertLeft(var38,((char)100)) ;
      Position<Character> var40 = resultTree.insertRight(var38,((char)101)) ;
      Position<Character> var41 = resultTree.insertRight(var37,((char)102)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { false,true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_51 ()
  {
      
      testName = "test_51" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertLeft(var1,((char)99)) ;
      Position<Character> var3 = origtree1.insertLeft(var2,((char)100)) ;
      Position<Character> var4 = origtree1.insertRight(var0,((char)101)) ;
      Position<Character> var5 = origtree1.insertLeft(var4,((char)102)) ;
      Position<Character> var6 = origtree1.insertRight(var4,((char)103)) ;
      Position<Character> var7 = origtree1.insertLeft(var6,((char)104)) ;
      Position<Character> var8 = origtree1.insertRight(var6,((char)105)) ;
      Position<Character> var9 = origtree1.insertLeft(var8,((char)106)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var10 = tree1.addRoot(((char)97)) ;
      Position<Character> var11 = tree1.insertLeft(var10,((char)98)) ;
      Position<Character> var12 = tree1.insertLeft(var11,((char)99)) ;
      Position<Character> var13 = tree1.insertLeft(var12,((char)100)) ;
      Position<Character> var14 = tree1.insertRight(var10,((char)101)) ;
      Position<Character> var15 = tree1.insertLeft(var14,((char)102)) ;
      Position<Character> var16 = tree1.insertRight(var14,((char)103)) ;
      Position<Character> var17 = tree1.insertLeft(var16,((char)104)) ;
      Position<Character> var18 = tree1.insertRight(var16,((char)105)) ;
      Position<Character> var19 = tree1.insertLeft(var18,((char)106)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var20 = tree2.addRoot(((char)97)) ;
      Position<Character> var21 = tree2.insertLeft(var20,((char)98)) ;
      Position<Character> var22 = tree2.insertLeft(var21,((char)99)) ;
      Position<Character> var23 = tree2.insertRight(var21,((char)100)) ;
      Position<Character> var24 = tree2.insertLeft(var23,((char)101)) ;
      Position<Character> var25 = tree2.insertLeft(var24,((char)102)) ;
      Position<Character> var26 = tree2.insertRight(var25,((char)103)) ;
      Position<Character> var27 = tree2.insertRight(var24,((char)104)) ;
      Position<Character> var28 = tree2.insertRight(var27,((char)105)) ;
      Position<Character> var29 = tree2.insertRight(var20,((char)106)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var30 = tree3.addRoot(((char)97)) ;
      Position<Character> var31 = tree3.insertLeft(var30,((char)98)) ;
      Position<Character> var32 = tree3.insertRight(var31,((char)99)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var33 = resultTree.addRoot(((char)97)) ;
      Position<Character> var34 = resultTree.insertLeft(var33,((char)98)) ;
      Position<Character> var35 = resultTree.insertLeft(var34,((char)99)) ;
      Position<Character> var36 = resultTree.insertLeft(var35,((char)100)) ;
      Position<Character> var37 = resultTree.insertRight(var33,((char)101)) ;
      Position<Character> var38 = resultTree.insertLeft(var37,((char)102)) ;
      Position<Character> var39 = resultTree.insertRight(var37,((char)103)) ;
      Position<Character> var40 = resultTree.insertLeft(var39,((char)104)) ;
      Position<Character> var41 = resultTree.insertLeft(var40,((char)97)) ;
      Position<Character> var42 = resultTree.insertLeft(var41,((char)98)) ;
      Position<Character> var43 = resultTree.insertLeft(var42,((char)99)) ;
      Position<Character> var44 = resultTree.insertRight(var42,((char)100)) ;
      Position<Character> var45 = resultTree.insertLeft(var44,((char)101)) ;
      Position<Character> var46 = resultTree.insertLeft(var45,((char)102)) ;
      Position<Character> var47 = resultTree.insertRight(var46,((char)103)) ;
      Position<Character> var48 = resultTree.insertRight(var45,((char)104)) ;
      Position<Character> var49 = resultTree.insertRight(var48,((char)105)) ;
      Position<Character> var50 = resultTree.insertRight(var41,((char)106)) ;
      Position<Character> var51 = resultTree.insertRight(var40,((char)97)) ;
      Position<Character> var52 = resultTree.insertLeft(var51,((char)98)) ;
      Position<Character> var53 = resultTree.insertRight(var52,((char)99)) ;
      Position<Character> var54 = resultTree.insertRight(var39,((char)105)) ;
      Position<Character> var55 = resultTree.insertLeft(var54,((char)106)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { false,false,true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_52 ()
  {
      
      testName = "test_52" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertLeft(var1,((char)99)) ;
      Position<Character> var3 = origtree1.insertLeft(var2,((char)100)) ;
      Position<Character> var4 = origtree1.insertLeft(var3,((char)101)) ;
      Position<Character> var5 = origtree1.insertRight(var3,((char)102)) ;
      Position<Character> var6 = origtree1.insertRight(var2,((char)103)) ;
      Position<Character> var7 = origtree1.insertLeft(var6,((char)104)) ;
      Position<Character> var8 = origtree1.insertRight(var1,((char)105)) ;
      Position<Character> var9 = origtree1.insertRight(var0,((char)106)) ;
      Position<Character> var10 = origtree1.insertRight(var9,((char)107)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var11 = tree1.addRoot(((char)97)) ;
      Position<Character> var12 = tree1.insertLeft(var11,((char)98)) ;
      Position<Character> var13 = tree1.insertLeft(var12,((char)99)) ;
      Position<Character> var14 = tree1.insertLeft(var13,((char)100)) ;
      Position<Character> var15 = tree1.insertLeft(var14,((char)101)) ;
      Position<Character> var16 = tree1.insertRight(var14,((char)102)) ;
      Position<Character> var17 = tree1.insertRight(var13,((char)103)) ;
      Position<Character> var18 = tree1.insertLeft(var17,((char)104)) ;
      Position<Character> var19 = tree1.insertRight(var12,((char)105)) ;
      Position<Character> var20 = tree1.insertRight(var11,((char)106)) ;
      Position<Character> var21 = tree1.insertRight(var20,((char)107)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var22 = tree2.addRoot(((char)97)) ;
      Position<Character> var23 = tree2.insertRight(var22,((char)98)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var24 = tree3.addRoot(((char)97)) ;
      Position<Character> var25 = tree3.insertLeft(var24,((char)98)) ;
      Position<Character> var26 = tree3.insertRight(var24,((char)99)) ;
      Position<Character> var27 = tree3.insertLeft(var26,((char)100)) ;
      Position<Character> var28 = tree3.insertRight(var27,((char)101)) ;
      Position<Character> var29 = tree3.insertRight(var28,((char)102)) ;
      Position<Character> var30 = tree3.insertRight(var29,((char)103)) ;
      Position<Character> var31 = tree3.insertRight(var26,((char)104)) ;
      Position<Character> var32 = tree3.insertLeft(var31,((char)105)) ;
      Position<Character> var33 = tree3.insertLeft(var32,((char)106)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var34 = resultTree.addRoot(((char)97)) ;
      Position<Character> var35 = resultTree.insertLeft(var34,((char)98)) ;
      Position<Character> var36 = resultTree.insertLeft(var35,((char)99)) ;
      Position<Character> var37 = resultTree.insertLeft(var36,((char)100)) ;
      Position<Character> var38 = resultTree.insertLeft(var37,((char)101)) ;
      Position<Character> var39 = resultTree.insertRight(var37,((char)102)) ;
      Position<Character> var40 = resultTree.insertRight(var36,((char)103)) ;
      Position<Character> var41 = resultTree.insertLeft(var40,((char)104)) ;
      Position<Character> var42 = resultTree.insertLeft(var41,((char)97)) ;
      Position<Character> var43 = resultTree.insertRight(var42,((char)98)) ;
      Position<Character> var44 = resultTree.insertRight(var41,((char)97)) ;
      Position<Character> var45 = resultTree.insertLeft(var44,((char)98)) ;
      Position<Character> var46 = resultTree.insertRight(var44,((char)99)) ;
      Position<Character> var47 = resultTree.insertLeft(var46,((char)100)) ;
      Position<Character> var48 = resultTree.insertRight(var47,((char)101)) ;
      Position<Character> var49 = resultTree.insertRight(var48,((char)102)) ;
      Position<Character> var50 = resultTree.insertRight(var49,((char)103)) ;
      Position<Character> var51 = resultTree.insertRight(var46,((char)104)) ;
      Position<Character> var52 = resultTree.insertLeft(var51,((char)105)) ;
      Position<Character> var53 = resultTree.insertLeft(var52,((char)106)) ;
      Position<Character> var54 = resultTree.insertRight(var35,((char)105)) ;
      Position<Character> var55 = resultTree.insertRight(var34,((char)106)) ;
      Position<Character> var56 = resultTree.insertRight(var55,((char)107)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { true,true,false,true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_53 ()
  {
      
      testName = "test_53" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertLeft(var1,((char)99)) ;
      Position<Character> var3 = origtree1.insertRight(var2,((char)100)) ;
      Position<Character> var4 = origtree1.insertLeft(var3,((char)101)) ;
      Position<Character> var5 = origtree1.insertLeft(var4,((char)102)) ;
      Position<Character> var6 = origtree1.insertRight(var1,((char)103)) ;
      Position<Character> var7 = origtree1.insertRight(var0,((char)104)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var8 = tree1.addRoot(((char)97)) ;
      Position<Character> var9 = tree1.insertLeft(var8,((char)98)) ;
      Position<Character> var10 = tree1.insertLeft(var9,((char)99)) ;
      Position<Character> var11 = tree1.insertRight(var10,((char)100)) ;
      Position<Character> var12 = tree1.insertLeft(var11,((char)101)) ;
      Position<Character> var13 = tree1.insertLeft(var12,((char)102)) ;
      Position<Character> var14 = tree1.insertRight(var9,((char)103)) ;
      Position<Character> var15 = tree1.insertRight(var8,((char)104)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var16 = tree2.addRoot(((char)97)) ;
      Position<Character> var17 = tree2.insertLeft(var16,((char)98)) ;
      Position<Character> var18 = tree2.insertLeft(var17,((char)99)) ;
      Position<Character> var19 = tree2.insertLeft(var18,((char)100)) ;
      Position<Character> var20 = tree2.insertLeft(var19,((char)101)) ;
      Position<Character> var21 = tree2.insertLeft(var20,((char)102)) ;
      Position<Character> var22 = tree2.insertRight(var17,((char)103)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var23 = tree3.addRoot(((char)97)) ;
      Position<Character> var24 = tree3.insertLeft(var23,((char)98)) ;
      Position<Character> var25 = tree3.insertLeft(var24,((char)99)) ;
      Position<Character> var26 = tree3.insertLeft(var25,((char)100)) ;
      Position<Character> var27 = tree3.insertRight(var24,((char)101)) ;
      Position<Character> var28 = tree3.insertRight(var27,((char)102)) ;
      Position<Character> var29 = tree3.insertRight(var23,((char)103)) ;
      Position<Character> var30 = tree3.insertRight(var29,((char)104)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var31 = resultTree.addRoot(((char)97)) ;
      Position<Character> var32 = resultTree.insertLeft(var31,((char)98)) ;
      Position<Character> var33 = resultTree.insertLeft(var32,((char)99)) ;
      Position<Character> var34 = resultTree.insertRight(var33,((char)100)) ;
      Position<Character> var35 = resultTree.insertLeft(var34,((char)101)) ;
      Position<Character> var36 = resultTree.insertLeft(var35,((char)102)) ;
      Position<Character> var37 = resultTree.insertRight(var32,((char)103)) ;
      Position<Character> var38 = resultTree.insertLeft(var37,((char)97)) ;
      Position<Character> var39 = resultTree.insertLeft(var38,((char)98)) ;
      Position<Character> var40 = resultTree.insertLeft(var39,((char)99)) ;
      Position<Character> var41 = resultTree.insertLeft(var40,((char)100)) ;
      Position<Character> var42 = resultTree.insertLeft(var41,((char)101)) ;
      Position<Character> var43 = resultTree.insertLeft(var42,((char)102)) ;
      Position<Character> var44 = resultTree.insertRight(var39,((char)103)) ;
      Position<Character> var45 = resultTree.insertRight(var37,((char)97)) ;
      Position<Character> var46 = resultTree.insertLeft(var45,((char)98)) ;
      Position<Character> var47 = resultTree.insertLeft(var46,((char)99)) ;
      Position<Character> var48 = resultTree.insertLeft(var47,((char)100)) ;
      Position<Character> var49 = resultTree.insertRight(var46,((char)101)) ;
      Position<Character> var50 = resultTree.insertRight(var49,((char)102)) ;
      Position<Character> var51 = resultTree.insertRight(var45,((char)103)) ;
      Position<Character> var52 = resultTree.insertRight(var51,((char)104)) ;
      Position<Character> var53 = resultTree.insertRight(var31,((char)104)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { true,false },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_54 ()
  {
      
      testName = "test_54" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertRight(var1,((char)99)) ;
      Position<Character> var3 = origtree1.insertRight(var2,((char)100)) ;
      Position<Character> var4 = origtree1.insertRight(var3,((char)101)) ;
      Position<Character> var5 = origtree1.insertLeft(var4,((char)102)) ;
      Position<Character> var6 = origtree1.insertRight(var0,((char)103)) ;
      Position<Character> var7 = origtree1.insertLeft(var6,((char)104)) ;
      Position<Character> var8 = origtree1.insertRight(var7,((char)105)) ;
      Position<Character> var9 = origtree1.insertLeft(var8,((char)106)) ;
      Position<Character> var10 = origtree1.insertLeft(var9,((char)107)) ;
      Position<Character> var11 = origtree1.insertRight(var6,((char)108)) ;
      Position<Character> var12 = origtree1.insertLeft(var11,((char)109)) ;
      Position<Character> var13 = origtree1.insertLeft(var12,((char)110)) ;
      Position<Character> var14 = origtree1.insertLeft(var13,((char)111)) ;
      Position<Character> var15 = origtree1.insertRight(var12,((char)112)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var16 = tree1.addRoot(((char)97)) ;
      Position<Character> var17 = tree1.insertLeft(var16,((char)98)) ;
      Position<Character> var18 = tree1.insertRight(var17,((char)99)) ;
      Position<Character> var19 = tree1.insertRight(var18,((char)100)) ;
      Position<Character> var20 = tree1.insertRight(var19,((char)101)) ;
      Position<Character> var21 = tree1.insertLeft(var20,((char)102)) ;
      Position<Character> var22 = tree1.insertRight(var16,((char)103)) ;
      Position<Character> var23 = tree1.insertLeft(var22,((char)104)) ;
      Position<Character> var24 = tree1.insertRight(var23,((char)105)) ;
      Position<Character> var25 = tree1.insertLeft(var24,((char)106)) ;
      Position<Character> var26 = tree1.insertLeft(var25,((char)107)) ;
      Position<Character> var27 = tree1.insertRight(var22,((char)108)) ;
      Position<Character> var28 = tree1.insertLeft(var27,((char)109)) ;
      Position<Character> var29 = tree1.insertLeft(var28,((char)110)) ;
      Position<Character> var30 = tree1.insertLeft(var29,((char)111)) ;
      Position<Character> var31 = tree1.insertRight(var28,((char)112)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var32 = tree2.addRoot(((char)97)) ;
      Position<Character> var33 = tree2.insertLeft(var32,((char)98)) ;
      Position<Character> var34 = tree2.insertLeft(var33,((char)99)) ;
      Position<Character> var35 = tree2.insertRight(var34,((char)100)) ;
      Position<Character> var36 = tree2.insertRight(var35,((char)101)) ;
      Position<Character> var37 = tree2.insertRight(var32,((char)102)) ;
      Position<Character> var38 = tree2.insertLeft(var37,((char)103)) ;
      Position<Character> var39 = tree2.insertRight(var38,((char)104)) ;
      Position<Character> var40 = tree2.insertLeft(var39,((char)105)) ;
      Position<Character> var41 = tree2.insertLeft(var40,((char)106)) ;
      Position<Character> var42 = tree2.insertRight(var40,((char)107)) ;
      Position<Character> var43 = tree2.insertRight(var39,((char)108)) ;
      Position<Character> var44 = tree2.insertLeft(var43,((char)109)) ;
      Position<Character> var45 = tree2.insertRight(var43,((char)110)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var46 = tree3.addRoot(((char)97)) ;
      Position<Character> var47 = tree3.insertLeft(var46,((char)98)) ;
      Position<Character> var48 = tree3.insertLeft(var47,((char)99)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var49 = resultTree.addRoot(((char)97)) ;
      Position<Character> var50 = resultTree.insertLeft(var49,((char)98)) ;
      Position<Character> var51 = resultTree.insertRight(var50,((char)99)) ;
      Position<Character> var52 = resultTree.insertRight(var51,((char)100)) ;
      Position<Character> var53 = resultTree.insertRight(var52,((char)101)) ;
      Position<Character> var54 = resultTree.insertLeft(var53,((char)102)) ;
      Position<Character> var55 = resultTree.insertLeft(var54,((char)97)) ;
      Position<Character> var56 = resultTree.insertLeft(var55,((char)98)) ;
      Position<Character> var57 = resultTree.insertLeft(var56,((char)99)) ;
      Position<Character> var58 = resultTree.insertRight(var57,((char)100)) ;
      Position<Character> var59 = resultTree.insertRight(var58,((char)101)) ;
      Position<Character> var60 = resultTree.insertRight(var55,((char)102)) ;
      Position<Character> var61 = resultTree.insertLeft(var60,((char)103)) ;
      Position<Character> var62 = resultTree.insertRight(var61,((char)104)) ;
      Position<Character> var63 = resultTree.insertLeft(var62,((char)105)) ;
      Position<Character> var64 = resultTree.insertLeft(var63,((char)106)) ;
      Position<Character> var65 = resultTree.insertRight(var63,((char)107)) ;
      Position<Character> var66 = resultTree.insertRight(var62,((char)108)) ;
      Position<Character> var67 = resultTree.insertLeft(var66,((char)109)) ;
      Position<Character> var68 = resultTree.insertRight(var66,((char)110)) ;
      Position<Character> var69 = resultTree.insertRight(var54,((char)97)) ;
      Position<Character> var70 = resultTree.insertLeft(var69,((char)98)) ;
      Position<Character> var71 = resultTree.insertLeft(var70,((char)99)) ;
      Position<Character> var72 = resultTree.insertRight(var49,((char)103)) ;
      Position<Character> var73 = resultTree.insertLeft(var72,((char)104)) ;
      Position<Character> var74 = resultTree.insertRight(var73,((char)105)) ;
      Position<Character> var75 = resultTree.insertLeft(var74,((char)106)) ;
      Position<Character> var76 = resultTree.insertLeft(var75,((char)107)) ;
      Position<Character> var77 = resultTree.insertRight(var72,((char)108)) ;
      Position<Character> var78 = resultTree.insertLeft(var77,((char)109)) ;
      Position<Character> var79 = resultTree.insertLeft(var78,((char)110)) ;
      Position<Character> var80 = resultTree.insertLeft(var79,((char)111)) ;
      Position<Character> var81 = resultTree.insertRight(var78,((char)112)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { true,false,false,false,true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_55 ()
  {
      
      testName = "test_55" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertLeft(var1,((char)99)) ;
      Position<Character> var3 = origtree1.insertRight(var1,((char)100)) ;
      Position<Character> var4 = origtree1.insertLeft(var3,((char)101)) ;
      Position<Character> var5 = origtree1.insertLeft(var4,((char)102)) ;
      Position<Character> var6 = origtree1.insertRight(var3,((char)103)) ;
      Position<Character> var7 = origtree1.insertRight(var6,((char)104)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var8 = tree1.addRoot(((char)97)) ;
      Position<Character> var9 = tree1.insertLeft(var8,((char)98)) ;
      Position<Character> var10 = tree1.insertLeft(var9,((char)99)) ;
      Position<Character> var11 = tree1.insertRight(var9,((char)100)) ;
      Position<Character> var12 = tree1.insertLeft(var11,((char)101)) ;
      Position<Character> var13 = tree1.insertLeft(var12,((char)102)) ;
      Position<Character> var14 = tree1.insertRight(var11,((char)103)) ;
      Position<Character> var15 = tree1.insertRight(var14,((char)104)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var16 = tree2.addRoot(((char)97)) ;
      Position<Character> var17 = tree2.insertLeft(var16,((char)98)) ;
      Position<Character> var18 = tree2.insertLeft(var17,((char)99)) ;
      Position<Character> var19 = tree2.insertLeft(var18,((char)100)) ;
      Position<Character> var20 = tree2.insertRight(var18,((char)101)) ;
      Position<Character> var21 = tree2.insertLeft(var20,((char)102)) ;
      Position<Character> var22 = tree2.insertRight(var21,((char)103)) ;
      Position<Character> var23 = tree2.insertRight(var20,((char)104)) ;
      Position<Character> var24 = tree2.insertLeft(var23,((char)105)) ;
      Position<Character> var25 = tree2.insertRight(var23,((char)106)) ;
      Position<Character> var26 = tree2.insertRight(var17,((char)107)) ;
      Position<Character> var27 = tree2.insertRight(var26,((char)108)) ;
      Position<Character> var28 = tree2.insertLeft(var27,((char)109)) ;
      Position<Character> var29 = tree2.insertRight(var28,((char)110)) ;
      Position<Character> var30 = tree2.insertRight(var16,((char)111)) ;
      Position<Character> var31 = tree2.insertRight(var30,((char)112)) ;
      Position<Character> var32 = tree2.insertRight(var31,((char)113)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var33 = tree3.addRoot(((char)97)) ;
      Position<Character> var34 = tree3.insertLeft(var33,((char)98)) ;
      Position<Character> var35 = tree3.insertRight(var33,((char)99)) ;
      Position<Character> var36 = tree3.insertLeft(var35,((char)100)) ;
      Position<Character> var37 = tree3.insertLeft(var36,((char)101)) ;
      Position<Character> var38 = tree3.insertRight(var36,((char)102)) ;
      Position<Character> var39 = tree3.insertRight(var38,((char)103)) ;
      Position<Character> var40 = tree3.insertRight(var35,((char)104)) ;
      Position<Character> var41 = tree3.insertLeft(var40,((char)105)) ;
      Position<Character> var42 = tree3.insertLeft(var41,((char)106)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var43 = resultTree.addRoot(((char)97)) ;
      Position<Character> var44 = resultTree.insertLeft(var43,((char)98)) ;
      Position<Character> var45 = resultTree.insertLeft(var44,((char)99)) ;
      Position<Character> var46 = resultTree.insertRight(var44,((char)100)) ;
      Position<Character> var47 = resultTree.insertLeft(var46,((char)101)) ;
      Position<Character> var48 = resultTree.insertLeft(var47,((char)102)) ;
      Position<Character> var49 = resultTree.insertRight(var46,((char)103)) ;
      Position<Character> var50 = resultTree.insertRight(var49,((char)104)) ;
      Position<Character> var51 = resultTree.insertLeft(var50,((char)97)) ;
      Position<Character> var52 = resultTree.insertLeft(var51,((char)98)) ;
      Position<Character> var53 = resultTree.insertLeft(var52,((char)99)) ;
      Position<Character> var54 = resultTree.insertLeft(var53,((char)100)) ;
      Position<Character> var55 = resultTree.insertRight(var53,((char)101)) ;
      Position<Character> var56 = resultTree.insertLeft(var55,((char)102)) ;
      Position<Character> var57 = resultTree.insertRight(var56,((char)103)) ;
      Position<Character> var58 = resultTree.insertRight(var55,((char)104)) ;
      Position<Character> var59 = resultTree.insertLeft(var58,((char)105)) ;
      Position<Character> var60 = resultTree.insertRight(var58,((char)106)) ;
      Position<Character> var61 = resultTree.insertRight(var52,((char)107)) ;
      Position<Character> var62 = resultTree.insertRight(var61,((char)108)) ;
      Position<Character> var63 = resultTree.insertLeft(var62,((char)109)) ;
      Position<Character> var64 = resultTree.insertRight(var63,((char)110)) ;
      Position<Character> var65 = resultTree.insertRight(var51,((char)111)) ;
      Position<Character> var66 = resultTree.insertRight(var65,((char)112)) ;
      Position<Character> var67 = resultTree.insertRight(var66,((char)113)) ;
      Position<Character> var68 = resultTree.insertRight(var50,((char)97)) ;
      Position<Character> var69 = resultTree.insertLeft(var68,((char)98)) ;
      Position<Character> var70 = resultTree.insertRight(var68,((char)99)) ;
      Position<Character> var71 = resultTree.insertLeft(var70,((char)100)) ;
      Position<Character> var72 = resultTree.insertLeft(var71,((char)101)) ;
      Position<Character> var73 = resultTree.insertRight(var71,((char)102)) ;
      Position<Character> var74 = resultTree.insertRight(var73,((char)103)) ;
      Position<Character> var75 = resultTree.insertRight(var70,((char)104)) ;
      Position<Character> var76 = resultTree.insertLeft(var75,((char)105)) ;
      Position<Character> var77 = resultTree.insertLeft(var76,((char)106)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { true,false,false,false },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_56 ()
  {
      
      testName = "test_56" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> origtree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = origtree1.addRoot(((char)97)) ;
      Position<Character> var1 = origtree1.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = origtree1.insertRight(var1,((char)99)) ;
      Position<Character> var3 = origtree1.insertLeft(var2,((char)100)) ;
      Position<Character> var4 = origtree1.insertRight(var0,((char)101)) ;
      Position<Character> var5 = origtree1.insertLeft(var4,((char)102)) ;
      Position<Character> var6 = origtree1.insertRight(var5,((char)103)) ;
      Position<Character> var7 = origtree1.insertLeft(var6,((char)104)) ;
      Position<Character> var8 = origtree1.insertLeft(var7,((char)105)) ;
      Position<Character> var9 = origtree1.insertRight(var6,((char)106)) ;
      Position<Character> var10 = origtree1.insertLeft(var9,((char)107)) ;
      Position<Character> var11 = origtree1.insertRight(var9,((char)108)) ;
      Position<Character> var12 = origtree1.insertRight(var4,((char)109)) ;
      AttachableLinkedBinaryTree<Character> tree1 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var13 = tree1.addRoot(((char)97)) ;
      Position<Character> var14 = tree1.insertLeft(var13,((char)98)) ;
      Position<Character> var15 = tree1.insertRight(var14,((char)99)) ;
      Position<Character> var16 = tree1.insertLeft(var15,((char)100)) ;
      Position<Character> var17 = tree1.insertRight(var13,((char)101)) ;
      Position<Character> var18 = tree1.insertLeft(var17,((char)102)) ;
      Position<Character> var19 = tree1.insertRight(var18,((char)103)) ;
      Position<Character> var20 = tree1.insertLeft(var19,((char)104)) ;
      Position<Character> var21 = tree1.insertLeft(var20,((char)105)) ;
      Position<Character> var22 = tree1.insertRight(var19,((char)106)) ;
      Position<Character> var23 = tree1.insertLeft(var22,((char)107)) ;
      Position<Character> var24 = tree1.insertRight(var22,((char)108)) ;
      Position<Character> var25 = tree1.insertRight(var17,((char)109)) ;
      AttachableLinkedBinaryTree<Character> tree2 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var26 = tree2.addRoot(((char)97)) ;
      Position<Character> var27 = tree2.insertRight(var26,((char)98)) ;
      Position<Character> var28 = tree2.insertLeft(var27,((char)99)) ;
      Position<Character> var29 = tree2.insertRight(var28,((char)100)) ;
      Position<Character> var30 = tree2.insertRight(var27,((char)101)) ;
      Position<Character> var31 = tree2.insertLeft(var30,((char)102)) ;
      AttachableLinkedBinaryTree<Character> tree3 = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var32 = tree3.addRoot(((char)97)) ;
      Position<Character> var33 = tree3.insertLeft(var32,((char)98)) ;
      Position<Character> var34 = tree3.insertLeft(var33,((char)99)) ;
      Position<Character> var35 = tree3.insertLeft(var34,((char)100)) ;
      Position<Character> var36 = tree3.insertRight(var35,((char)101)) ;
      Position<Character> var37 = tree3.insertLeft(var36,((char)102)) ;
      Position<Character> var38 = tree3.insertRight(var36,((char)103)) ;
      Position<Character> var39 = tree3.insertRight(var34,((char)104)) ;
      Position<Character> var40 = tree3.insertRight(var39,((char)105)) ;
      Position<Character> var41 = tree3.insertRight(var40,((char)106)) ;
      Position<Character> var42 = tree3.insertRight(var33,((char)107)) ;
      Position<Character> var43 = tree3.insertRight(var42,((char)108)) ;
      Position<Character> var44 = tree3.insertRight(var43,((char)109)) ;
      AttachableLinkedBinaryTree<Character> resultTree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var45 = resultTree.addRoot(((char)97)) ;
      Position<Character> var46 = resultTree.insertLeft(var45,((char)98)) ;
      Position<Character> var47 = resultTree.insertRight(var46,((char)99)) ;
      Position<Character> var48 = resultTree.insertLeft(var47,((char)100)) ;
      Position<Character> var49 = resultTree.insertRight(var45,((char)101)) ;
      Position<Character> var50 = resultTree.insertLeft(var49,((char)102)) ;
      Position<Character> var51 = resultTree.insertRight(var50,((char)103)) ;
      Position<Character> var52 = resultTree.insertLeft(var51,((char)104)) ;
      Position<Character> var53 = resultTree.insertLeft(var52,((char)105)) ;
      Position<Character> var54 = resultTree.insertLeft(var53,((char)97)) ;
      Position<Character> var55 = resultTree.insertRight(var54,((char)98)) ;
      Position<Character> var56 = resultTree.insertLeft(var55,((char)99)) ;
      Position<Character> var57 = resultTree.insertRight(var56,((char)100)) ;
      Position<Character> var58 = resultTree.insertRight(var55,((char)101)) ;
      Position<Character> var59 = resultTree.insertLeft(var58,((char)102)) ;
      Position<Character> var60 = resultTree.insertRight(var53,((char)97)) ;
      Position<Character> var61 = resultTree.insertLeft(var60,((char)98)) ;
      Position<Character> var62 = resultTree.insertLeft(var61,((char)99)) ;
      Position<Character> var63 = resultTree.insertLeft(var62,((char)100)) ;
      Position<Character> var64 = resultTree.insertRight(var63,((char)101)) ;
      Position<Character> var65 = resultTree.insertLeft(var64,((char)102)) ;
      Position<Character> var66 = resultTree.insertRight(var64,((char)103)) ;
      Position<Character> var67 = resultTree.insertRight(var62,((char)104)) ;
      Position<Character> var68 = resultTree.insertRight(var67,((char)105)) ;
      Position<Character> var69 = resultTree.insertRight(var68,((char)106)) ;
      Position<Character> var70 = resultTree.insertRight(var61,((char)107)) ;
      Position<Character> var71 = resultTree.insertRight(var70,((char)108)) ;
      Position<Character> var72 = resultTree.insertRight(var71,((char)109)) ;
      Position<Character> var73 = resultTree.insertRight(var51,((char)106)) ;
      Position<Character> var74 = resultTree.insertLeft(var73,((char)107)) ;
      Position<Character> var75 = resultTree.insertRight(var73,((char)108)) ;
      Position<Character> var76 = resultTree.insertRight(var49,((char)109)) ;
      ok_sofar = TesterLab5.checkAttach(origtree1,tree1,new boolean[] { false,true,false,true,true },tree2,tree3,resultTree) ;
      return ok_sofar ;
  }


  private static boolean test_57 ()
  {
      
      testName = "test_57" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> tree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = tree.addRoot(((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)97)) ;
      ok_sofar = TesterLab5.checkConstructor("ab",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1 },tree) ;
      return ok_sofar ;
  }


  private static boolean test_58 ()
  {
      
      testName = "test_58" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> tree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = tree.addRoot(((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)97)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)99)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)98)) ;
      ok_sofar = TesterLab5.checkConstructor("abc",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1 },tree) ;
      return ok_sofar ;
  }


  private static boolean test_59 ()
  {
      
      testName = "test_59" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> tree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = tree.addRoot(((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)100)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)97)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)101)) ;
      ok_sofar = TesterLab5.checkConstructor("addee",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,2,2 },tree) ;
      return ok_sofar ;
  }


  private static boolean test_60 ()
  {
      
      testName = "test_60" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> tree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = tree.addRoot(((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)97)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)99)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)98)) ;
      ok_sofar = TesterLab5.checkConstructor("abcabcabc",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3 },tree) ;
      return ok_sofar ;
  }


  private static boolean test_61 ()
  {
      
      testName = "test_61" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> tree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = tree.addRoot(((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)98)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)101)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)100)) ;
      Position<Character> var7 = tree.insertRight(var3,((char)99)) ;
      Position<Character> var8 = tree.insertRight(var0,((char)97)) ;
      ok_sofar = TesterLab5.checkConstructor("aaaaaaaaaaaabbbbcccdde",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,12,4,3,2,1 },tree) ;
      return ok_sofar ;
  }


  private static boolean test_62 ()
  {
      
      testName = "test_62" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> tree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = tree.addRoot(((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)97)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)98)) ;
      Position<Character> var5 = tree.insertRight(var1,((char)102)) ;
      Position<Character> var6 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)99)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)101)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)100)) ;
      ok_sofar = TesterLab5.checkConstructor("abbbbcccccdddddeeeeefffff",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,4,5,5,5,5 },tree) ;
      return ok_sofar ;
  }


  private static boolean test_63 ()
  {
      
      testName = "test_63" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> tree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = tree.addRoot(((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)106)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)104)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)105)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)103)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)102)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)100)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)97)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)101)) ;
      ok_sofar = TesterLab5.checkConstructor("jjjjjjjjjjjaddeefffggggggghhhhhhhhhhhiiiiiiiiiiiiii",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,2,2,3,7,11,14,11 },tree) ;
      return ok_sofar ;
  }


  private static boolean test_64 ()
  {
      
      testName = "test_64" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> tree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = tree.addRoot(((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)105)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)102)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)104)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)103)) ;
      Position<Character> var9 = tree.insertRight(var5,((char)98)) ;
      Position<Character> var10 = tree.insertRight(var4,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)99)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)97)) ;
      Position<Character> var14 = tree.insertRight(var10,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)101)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)100)) ;
      ok_sofar = TesterLab5.checkConstructor("abbcdeffffghiiii",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,1,1,1,4,1,1,4 },tree) ;
      return ok_sofar ;
  }


  private static boolean test_65 ()
  {
      
      testName = "test_65" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> tree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = tree.addRoot(((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)101)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)100)) ;
      Position<Character> var5 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)103)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)102)) ;
      Position<Character> var8 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)105)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)104)) ;
      Position<Character> var12 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)99)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)98)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)97)) ;
      Position<Character> var18 = tree.insertRight(var14,((char)106)) ;
      ok_sofar = TesterLab5.checkConstructor("abcccdddeeefffggghhhiiijjj",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,3,3,3,3,3,3,3,3 },tree) ;
      return ok_sofar ;
  }


  private static boolean test_66 ()
  {
      
      testName = "test_66" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> tree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = tree.addRoot(((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)107)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)103)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)99)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)101)) ;
      Position<Character> var8 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)105)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)104)) ;
      Position<Character> var12 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)106)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)102)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)97)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)98)) ;
      Position<Character> var20 = tree.insertRight(var16,((char)100)) ;
      ok_sofar = TesterLab5.checkConstructor("abbcccdddeeeefffffgggggghhhhhhhhiiiiiiiijjjjjjjjjkkkkkkkkkkk",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,3,4,5,6,8,8,9,11 },tree) ;
      return ok_sofar ;
  }


  private static boolean test_67 ()
  {
      
      testName = "test_67" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> tree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = tree.addRoot(((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)107)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)106)) ;
      Position<Character> var5 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)109)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)108)) ;
      Position<Character> var8 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)105)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)98)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)97)) ;
      Position<Character> var14 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)100)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)99)) ;
      Position<Character> var18 = tree.insertRight(var14,((char)32)) ;
      Position<Character> var19 = tree.insertLeft(var18,((char)102)) ;
      Position<Character> var20 = tree.insertRight(var18,((char)101)) ;
      ok_sofar = TesterLab5.checkConstructor("aabbccddeeffiiijjjkkklllmmm",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,3,3,3,3,3 },tree) ;
      return ok_sofar ;
  }


  private static boolean test_68 ()
  {
      
      testName = "test_68" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> tree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = tree.addRoot(((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)116)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)115)) ;
      Position<Character> var5 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)105)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)102)) ;
      Position<Character> var9 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)39)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)87)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)84)) ;
      Position<Character> var15 = tree.insertRight(var9,((char)108)) ;
      Position<Character> var16 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)32)) ;
      Position<Character> var19 = tree.insertLeft(var18,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)104)) ;
      Position<Character> var21 = tree.insertRight(var19,((char)97)) ;
      Position<Character> var22 = tree.insertRight(var18,((char)32)) ;
      Position<Character> var23 = tree.insertLeft(var22,((char)112)) ;
      Position<Character> var24 = tree.insertRight(var22,((char)110)) ;
      Position<Character> var25 = tree.insertRight(var17,((char)32)) ;
      Position<Character> var26 = tree.insertLeft(var25,((char)117)) ;
      Position<Character> var27 = tree.insertRight(var25,((char)114)) ;
      Position<Character> var28 = tree.insertRight(var16,((char)32)) ;
      Position<Character> var29 = tree.insertLeft(var28,((char)32)) ;
      Position<Character> var30 = tree.insertRight(var28,((char)32)) ;
      Position<Character> var31 = tree.insertLeft(var30,((char)111)) ;
      Position<Character> var32 = tree.insertRight(var30,((char)101)) ;
      ok_sofar = TesterLab5.checkConstructor("The Worst of our faults is our interest in other people's faults",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,11,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,2,0,0,0,6,3,0,2,3,0,0,3,0,2,6,2,0,5,6,6,4 },tree) ;
      return ok_sofar ;
  }


  private static boolean test_69 ()
  {
      
      testName = "test_69" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> tree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = tree.addRoot(((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)115)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)97)) ;
      Position<Character> var7 = tree.insertRight(var3,((char)111)) ;
      Position<Character> var8 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)114)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)87)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)46)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)109)) ;
      Position<Character> var18 = tree.insertRight(var10,((char)32)) ;
      Position<Character> var19 = tree.insertLeft(var18,((char)100)) ;
      Position<Character> var20 = tree.insertRight(var18,((char)99)) ;
      Position<Character> var21 = tree.insertRight(var9,((char)101)) ;
      Position<Character> var22 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var23 = tree.insertLeft(var22,((char)32)) ;
      Position<Character> var24 = tree.insertLeft(var23,((char)104)) ;
      Position<Character> var25 = tree.insertRight(var23,((char)32)) ;
      Position<Character> var26 = tree.insertLeft(var25,((char)32)) ;
      Position<Character> var27 = tree.insertLeft(var26,((char)121)) ;
      Position<Character> var28 = tree.insertRight(var26,((char)117)) ;
      Position<Character> var29 = tree.insertRight(var25,((char)110)) ;
      Position<Character> var30 = tree.insertRight(var22,((char)32)) ;
      Position<Character> var31 = tree.insertLeft(var30,((char)32)) ;
      Position<Character> var32 = tree.insertLeft(var31,((char)32)) ;
      Position<Character> var33 = tree.insertLeft(var32,((char)98)) ;
      Position<Character> var34 = tree.insertRight(var32,((char)44)) ;
      Position<Character> var35 = tree.insertRight(var31,((char)32)) ;
      Position<Character> var36 = tree.insertLeft(var35,((char)105)) ;
      Position<Character> var37 = tree.insertRight(var35,((char)103)) ;
      Position<Character> var38 = tree.insertRight(var30,((char)116)) ;
      ok_sofar = TesterLab5.checkConstructor("We choose to go to the moon. We choose to go to the moon in this decade and do the other things, not because they are easy, but because they are hard,",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,31,0,0,0,0,0,0,0,0,0,0,0,3,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,8,3,5,5,19,0,3,11,3,0,0,0,2,6,17,0,0,4,7,14,3,0,0,0,3 },tree) ;
      return ok_sofar ;
  }


  private static boolean test_70 ()
  {
      
      testName = "test_70" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> tree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = tree.addRoot(((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)101)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)100)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)97)) ;
      Position<Character> var8 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)111)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)116)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)115)) ;
      Position<Character> var14 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)110)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)104)) ;
      Position<Character> var20 = tree.insertRight(var16,((char)32)) ;
      Position<Character> var21 = tree.insertLeft(var20,((char)117)) ;
      Position<Character> var22 = tree.insertRight(var20,((char)114)) ;
      Position<Character> var23 = tree.insertRight(var15,((char)32)) ;
      Position<Character> var24 = tree.insertLeft(var23,((char)32)) ;
      Position<Character> var25 = tree.insertLeft(var24,((char)46)) ;
      Position<Character> var26 = tree.insertRight(var24,((char)39)) ;
      Position<Character> var27 = tree.insertRight(var23,((char)32)) ;
      Position<Character> var28 = tree.insertLeft(var27,((char)99)) ;
      Position<Character> var29 = tree.insertRight(var27,((char)87)) ;
      Position<Character> var30 = tree.insertRight(var14,((char)32)) ;
      Position<Character> var31 = tree.insertLeft(var30,((char)32)) ;
      Position<Character> var32 = tree.insertLeft(var31,((char)108)) ;
      Position<Character> var33 = tree.insertRight(var31,((char)105)) ;
      Position<Character> var34 = tree.insertRight(var30,((char)32)) ;
      Position<Character> var35 = tree.insertLeft(var34,((char)32)) ;
      Position<Character> var36 = tree.insertLeft(var35,((char)121)) ;
      Position<Character> var37 = tree.insertRight(var35,((char)119)) ;
      Position<Character> var38 = tree.insertRight(var34,((char)109)) ;
      ok_sofar = TesterLab5.checkConstructor("Wisdom comes to us when it's already too late.",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,3,0,1,2,4,0,0,1,2,0,0,2,2,1,5,0,0,1,4,4,1,0,1,0,1 },tree) ;
      return ok_sofar ;
  }


  private static boolean test_71 ()
  {
      
      testName = "test_71" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> tree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = tree.addRoot(((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)104)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)101)) ;
      Position<Character> var5 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var6 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)115)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)110)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)108)) ;
      Position<Character> var13 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)121)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)114)) ;
      Position<Character> var17 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)32)) ;
      Position<Character> var19 = tree.insertLeft(var18,((char)109)) ;
      Position<Character> var20 = tree.insertRight(var18,((char)107)) ;
      Position<Character> var21 = tree.insertRight(var17,((char)32)) ;
      Position<Character> var22 = tree.insertLeft(var21,((char)118)) ;
      Position<Character> var23 = tree.insertRight(var21,((char)117)) ;
      Position<Character> var24 = tree.insertRight(var6,((char)32)) ;
      Position<Character> var25 = tree.insertLeft(var24,((char)32)) ;
      Position<Character> var26 = tree.insertLeft(var25,((char)32)) ;
      Position<Character> var27 = tree.insertLeft(var26,((char)32)) ;
      Position<Character> var28 = tree.insertLeft(var27,((char)73)) ;
      Position<Character> var29 = tree.insertRight(var27,((char)46)) ;
      Position<Character> var30 = tree.insertRight(var26,((char)32)) ;
      Position<Character> var31 = tree.insertLeft(var30,((char)105)) ;
      Position<Character> var32 = tree.insertRight(var30,((char)102)) ;
      Position<Character> var33 = tree.insertRight(var25,((char)32)) ;
      Position<Character> var34 = tree.insertLeft(var33,((char)97)) ;
      Position<Character> var35 = tree.insertRight(var33,((char)119)) ;
      Position<Character> var36 = tree.insertRight(var24,((char)32)) ;
      Position<Character> var37 = tree.insertLeft(var36,((char)116)) ;
      Position<Character> var38 = tree.insertRight(var36,((char)111)) ;
      ok_sofar = TesterLab5.checkConstructor("I will make those who stay the envy of those who return.",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,11,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,6,1,0,5,1,0,1,2,1,2,5,0,0,2,3,5,1,1,3,0,2 },tree) ;
      return ok_sofar ;
  }


  private static boolean test_72 ()
  {
      
      testName = "test_72" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> tree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = tree.addRoot(((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)108)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)115)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)104)) ;
      Position<Character> var7 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)46)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)66)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)58)) ;
      Position<Character> var14 = tree.insertRight(var8,((char)116)) ;
      Position<Character> var15 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)97)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)102)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)99)) ;
      Position<Character> var20 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var21 = tree.insertLeft(var20,((char)32)) ;
      Position<Character> var22 = tree.insertLeft(var21,((char)101)) ;
      Position<Character> var23 = tree.insertRight(var21,((char)32)) ;
      Position<Character> var24 = tree.insertLeft(var23,((char)32)) ;
      Position<Character> var25 = tree.insertLeft(var24,((char)32)) ;
      Position<Character> var26 = tree.insertLeft(var25,((char)100)) ;
      Position<Character> var27 = tree.insertRight(var25,((char)98)) ;
      Position<Character> var28 = tree.insertRight(var24,((char)32)) ;
      Position<Character> var29 = tree.insertLeft(var28,((char)117)) ;
      Position<Character> var30 = tree.insertRight(var28,((char)110)) ;
      Position<Character> var31 = tree.insertRight(var23,((char)114)) ;
      Position<Character> var32 = tree.insertRight(var20,((char)32)) ;
      Position<Character> var33 = tree.insertLeft(var32,((char)32)) ;
      Position<Character> var34 = tree.insertLeft(var33,((char)32)) ;
      Position<Character> var35 = tree.insertLeft(var34,((char)109)) ;
      Position<Character> var36 = tree.insertRight(var34,((char)105)) ;
      Position<Character> var37 = tree.insertRight(var33,((char)32)) ;
      Position<Character> var38 = tree.insertLeft(var37,((char)121)) ;
      Position<Character> var39 = tree.insertRight(var37,((char)111)) ;
      Position<Character> var40 = tree.insertRight(var32,((char)32)) ;
      ok_sofar = TesterLab5.checkConstructor("Blessed are the merciful: for they shall obtain mercy.",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,1,2,1,7,2,0,3,2,0,0,4,2,1,2,0,0,4,3,3,1,0,0,0,2 },tree) ;
      return ok_sofar ;
  }


  private static boolean test_73 ()
  {
      
      testName = "test_73" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> tree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = tree.addRoot(((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)102)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)98)) ;
      Position<Character> var8 = tree.insertRight(var4,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)107)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)106)) ;
      Position<Character> var11 = tree.insertRight(var3,((char)121)) ;
      Position<Character> var12 = tree.insertRight(var2,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)104)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)100)) ;
      Position<Character> var16 = tree.insertRight(var12,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)116)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)115)) ;
      Position<Character> var20 = tree.insertRight(var16,((char)119)) ;
      Position<Character> var21 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var22 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var23 = tree.insertLeft(var22,((char)32)) ;
      Position<Character> var24 = tree.insertLeft(var23,((char)32)) ;
      Position<Character> var25 = tree.insertLeft(var24,((char)108)) ;
      Position<Character> var26 = tree.insertRight(var24,((char)97)) ;
      Position<Character> var27 = tree.insertRight(var23,((char)111)) ;
      Position<Character> var28 = tree.insertRight(var22,((char)32)) ;
      Position<Character> var29 = tree.insertLeft(var28,((char)32)) ;
      Position<Character> var30 = tree.insertLeft(var29,((char)32)) ;
      Position<Character> var31 = tree.insertLeft(var30,((char)32)) ;
      Position<Character> var32 = tree.insertLeft(var31,((char)44)) ;
      Position<Character> var33 = tree.insertRight(var31,((char)32)) ;
      Position<Character> var34 = tree.insertLeft(var33,((char)67)) ;
      Position<Character> var35 = tree.insertRight(var33,((char)46)) ;
      Position<Character> var36 = tree.insertRight(var30,((char)118)) ;
      Position<Character> var37 = tree.insertRight(var29,((char)101)) ;
      Position<Character> var38 = tree.insertRight(var28,((char)32)) ;
      Position<Character> var39 = tree.insertLeft(var38,((char)32)) ;
      Position<Character> var40 = tree.insertLeft(var39,((char)110)) ;
      Position<Character> var41 = tree.insertRight(var39,((char)105)) ;
      Position<Character> var42 = tree.insertRight(var38,((char)32)) ;
      Position<Character> var43 = tree.insertLeft(var42,((char)117)) ;
      Position<Character> var44 = tree.insertRight(var42,((char)114)) ;
      ok_sofar = TesterLab5.checkConstructor("Choose a job you love, and you will never have to work a day in your life.",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,16,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,1,0,2,6,1,0,2,3,1,1,4,0,3,9,0,0,3,1,1,3,3,2,0,4 },tree) ;
      return ok_sofar ;
  }


  private static boolean test_74 ()
  {
      
      testName = "test_74" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> tree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = tree.addRoot(((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)116)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)44)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)73)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)46)) ;
      Position<Character> var11 = tree.insertRight(var5,((char)117)) ;
      Position<Character> var12 = tree.insertRight(var4,((char)110)) ;
      Position<Character> var13 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)102)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)100)) ;
      Position<Character> var18 = tree.insertRight(var14,((char)32)) ;
      Position<Character> var19 = tree.insertLeft(var18,((char)109)) ;
      Position<Character> var20 = tree.insertRight(var18,((char)103)) ;
      Position<Character> var21 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var22 = tree.insertLeft(var21,((char)104)) ;
      Position<Character> var23 = tree.insertRight(var21,((char)32)) ;
      Position<Character> var24 = tree.insertLeft(var23,((char)115)) ;
      Position<Character> var25 = tree.insertRight(var23,((char)108)) ;
      Position<Character> var26 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var27 = tree.insertLeft(var26,((char)32)) ;
      Position<Character> var28 = tree.insertLeft(var27,((char)101)) ;
      Position<Character> var29 = tree.insertRight(var27,((char)32)) ;
      Position<Character> var30 = tree.insertLeft(var29,((char)32)) ;
      Position<Character> var31 = tree.insertLeft(var30,((char)32)) ;
      Position<Character> var32 = tree.insertLeft(var31,((char)99)) ;
      Position<Character> var33 = tree.insertRight(var31,((char)98)) ;
      Position<Character> var34 = tree.insertRight(var30,((char)32)) ;
      Position<Character> var35 = tree.insertLeft(var34,((char)32)) ;
      Position<Character> var36 = tree.insertLeft(var35,((char)119)) ;
      Position<Character> var37 = tree.insertRight(var35,((char)118)) ;
      Position<Character> var38 = tree.insertRight(var34,((char)121)) ;
      Position<Character> var39 = tree.insertRight(var29,((char)114)) ;
      Position<Character> var40 = tree.insertRight(var26,((char)32)) ;
      Position<Character> var41 = tree.insertLeft(var40,((char)32)) ;
      Position<Character> var42 = tree.insertLeft(var41,((char)111)) ;
      Position<Character> var43 = tree.insertRight(var41,((char)32)) ;
      Position<Character> var44 = tree.insertLeft(var43,((char)105)) ;
      Position<Character> var45 = tree.insertRight(var43,((char)97)) ;
      Position<Character> var46 = tree.insertRight(var40,((char)32)) ;
      ok_sofar = TesterLab5.checkConstructor("I believe that in the history of the world, there has not been a more genuinely democratic struggle for freedom than ours.",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,21,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,2,2,3,16,3,3,7,5,0,0,4,3,6,9,0,0,9,4,10,3,1,1,0,2 },tree) ;
      return ok_sofar ;
  }


  private static boolean test_75 ()
  {
      
      testName = "test_75" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> tree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = tree.addRoot(((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)114)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)98)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)112)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)78)) ;
      Position<Character> var13 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)122)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)121)) ;
      Position<Character> var16 = tree.insertRight(var4,((char)116)) ;
      Position<Character> var17 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)105)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)104)) ;
      Position<Character> var20 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var21 = tree.insertLeft(var20,((char)32)) ;
      Position<Character> var22 = tree.insertLeft(var21,((char)32)) ;
      Position<Character> var23 = tree.insertLeft(var22,((char)100)) ;
      Position<Character> var24 = tree.insertRight(var22,((char)32)) ;
      Position<Character> var25 = tree.insertLeft(var24,((char)102)) ;
      Position<Character> var26 = tree.insertRight(var24,((char)32)) ;
      Position<Character> var27 = tree.insertLeft(var26,((char)109)) ;
      Position<Character> var28 = tree.insertRight(var26,((char)119)) ;
      Position<Character> var29 = tree.insertRight(var21,((char)32)) ;
      Position<Character> var30 = tree.insertLeft(var29,((char)115)) ;
      Position<Character> var31 = tree.insertRight(var29,((char)101)) ;
      Position<Character> var32 = tree.insertRight(var20,((char)32)) ;
      Position<Character> var33 = tree.insertLeft(var32,((char)32)) ;
      Position<Character> var34 = tree.insertLeft(var33,((char)97)) ;
      Position<Character> var35 = tree.insertRight(var33,((char)32)) ;
      Position<Character> var36 = tree.insertLeft(var35,((char)32)) ;
      Position<Character> var37 = tree.insertLeft(var36,((char)117)) ;
      Position<Character> var38 = tree.insertRight(var36,((char)103)) ;
      Position<Character> var39 = tree.insertRight(var35,((char)32)) ;
      Position<Character> var40 = tree.insertLeft(var39,((char)44)) ;
      Position<Character> var41 = tree.insertRight(var39,((char)32)) ;
      Position<Character> var42 = tree.insertLeft(var41,((char)108)) ;
      Position<Character> var43 = tree.insertRight(var41,((char)99)) ;
      Position<Character> var44 = tree.insertRight(var32,((char)32)) ;
      Position<Character> var45 = tree.insertLeft(var44,((char)110)) ;
      Position<Character> var46 = tree.insertRight(var44,((char)111)) ;
      ok_sofar = TesterLab5.checkConstructor("No man can be a good citizen who is not a good husband and a good father, who is not honest in his dealings with other men and women, faithful to his friends and fearless in the presence of his foes, who has not got a sound heart, a sound mind, and a sound body",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,54,0,0,0,0,0,0,0,0,0,0,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,19,3,3,15,17,7,5,15,14,0,0,3,4,23,24,1,0,6,17,13,5,0,5,0,1,1 },tree) ;
      return ok_sofar ;
  }


  private static boolean test_76 ()
  {
      
      testName = "test_76" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> tree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = tree.addRoot(((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)110)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)108)) ;
      Position<Character> var7 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)114)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)111)) ;
      Position<Character> var10 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)97)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)121)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)100)) ;
      Position<Character> var17 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)105)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)104)) ;
      Position<Character> var20 = tree.insertRight(var10,((char)32)) ;
      Position<Character> var21 = tree.insertLeft(var20,((char)32)) ;
      Position<Character> var22 = tree.insertLeft(var21,((char)32)) ;
      Position<Character> var23 = tree.insertLeft(var22,((char)99)) ;
      Position<Character> var24 = tree.insertRight(var22,((char)32)) ;
      Position<Character> var25 = tree.insertLeft(var24,((char)117)) ;
      Position<Character> var26 = tree.insertRight(var24,((char)102)) ;
      Position<Character> var27 = tree.insertRight(var21,((char)116)) ;
      Position<Character> var28 = tree.insertRight(var20,((char)32)) ;
      Position<Character> var29 = tree.insertLeft(var28,((char)32)) ;
      Position<Character> var30 = tree.insertLeft(var29,((char)32)) ;
      Position<Character> var31 = tree.insertLeft(var30,((char)32)) ;
      Position<Character> var32 = tree.insertLeft(var31,((char)32)) ;
      Position<Character> var33 = tree.insertLeft(var32,((char)115)) ;
      Position<Character> var34 = tree.insertRight(var32,((char)107)) ;
      Position<Character> var35 = tree.insertRight(var31,((char)118)) ;
      Position<Character> var36 = tree.insertRight(var30,((char)32)) ;
      Position<Character> var37 = tree.insertLeft(var36,((char)32)) ;
      Position<Character> var38 = tree.insertLeft(var37,((char)73)) ;
      Position<Character> var39 = tree.insertRight(var37,((char)46)) ;
      Position<Character> var40 = tree.insertRight(var36,((char)32)) ;
      Position<Character> var41 = tree.insertLeft(var40,((char)106)) ;
      Position<Character> var42 = tree.insertRight(var40,((char)103)) ;
      Position<Character> var43 = tree.insertRight(var29,((char)32)) ;
      Position<Character> var44 = tree.insertLeft(var43,((char)98)) ;
      Position<Character> var45 = tree.insertRight(var43,((char)32)) ;
      Position<Character> var46 = tree.insertLeft(var45,((char)109)) ;
      Position<Character> var47 = tree.insertRight(var45,((char)119)) ;
      Position<Character> var48 = tree.insertRight(var28,((char)101)) ;
      ok_sofar = TesterLab5.checkConstructor("I have a dream that my four little children will one day live in a nation where they will not be judged by the color of their skin but by the content of their character.",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,34,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,9,4,5,5,17,3,1,10,10,1,1,9,2,9,9,0,0,9,1,15,3,2,3,0,5 },tree) ;
      return ok_sofar ;
  }


  private static boolean test_77 ()
  {
      
      testName = "test_77" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> tree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = tree.addRoot(((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)108)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)84)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)78)) ;
      Position<Character> var10 = tree.insertRight(var6,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)103)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)98)) ;
      Position<Character> var13 = tree.insertRight(var5,((char)117)) ;
      Position<Character> var14 = tree.insertRight(var2,((char)116)) ;
      Position<Character> var15 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)32)) ;
      Position<Character> var19 = tree.insertLeft(var18,((char)46)) ;
      Position<Character> var20 = tree.insertRight(var18,((char)44)) ;
      Position<Character> var21 = tree.insertRight(var17,((char)32)) ;
      Position<Character> var22 = tree.insertLeft(var21,((char)119)) ;
      Position<Character> var23 = tree.insertRight(var21,((char)112)) ;
      Position<Character> var24 = tree.insertRight(var16,((char)114)) ;
      Position<Character> var25 = tree.insertRight(var15,((char)32)) ;
      Position<Character> var26 = tree.insertLeft(var25,((char)105)) ;
      Position<Character> var27 = tree.insertRight(var25,((char)104)) ;
      Position<Character> var28 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var29 = tree.insertLeft(var28,((char)32)) ;
      Position<Character> var30 = tree.insertLeft(var29,((char)32)) ;
      Position<Character> var31 = tree.insertLeft(var30,((char)32)) ;
      Position<Character> var32 = tree.insertLeft(var31,((char)100)) ;
      Position<Character> var33 = tree.insertRight(var31,((char)97)) ;
      Position<Character> var34 = tree.insertRight(var30,((char)111)) ;
      Position<Character> var35 = tree.insertRight(var29,((char)32)) ;
      Position<Character> var36 = tree.insertLeft(var35,((char)32)) ;
      Position<Character> var37 = tree.insertLeft(var36,((char)121)) ;
      Position<Character> var38 = tree.insertRight(var36,((char)115)) ;
      Position<Character> var39 = tree.insertRight(var35,((char)32)) ;
      Position<Character> var40 = tree.insertLeft(var39,((char)32)) ;
      Position<Character> var41 = tree.insertLeft(var40,((char)102)) ;
      Position<Character> var42 = tree.insertRight(var40,((char)99)) ;
      Position<Character> var43 = tree.insertRight(var39,((char)32)) ;
      Position<Character> var44 = tree.insertLeft(var43,((char)109)) ;
      Position<Character> var45 = tree.insertRight(var43,((char)107)) ;
      Position<Character> var46 = tree.insertRight(var28,((char)32)) ;
      Position<Character> var47 = tree.insertLeft(var46,((char)32)) ;
      Position<Character> var48 = tree.insertLeft(var47,((char)110)) ;
      Position<Character> var49 = tree.insertRight(var47,((char)101)) ;
      Position<Character> var50 = tree.insertRight(var46,((char)32)) ;
      ok_sofar = TesterLab5.checkConstructor("This is preeminently the time to speak the truth, the whole truth, frankly and boldly. Nor need we shrink from honestly facing conditions in our country today.",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,26,0,0,0,0,0,0,0,0,0,0,0,2,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,5,1,3,5,13,3,1,9,9,0,3,6,3,12,11,2,0,9,6,14,4,0,2,0,6 },tree) ;
      return ok_sofar ;
  }


  private static boolean test_78 ()
  {
      
      testName = "test_78" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      AttachableLinkedBinaryTree<Character> tree = new AttachableLinkedBinaryTree<Character>() ;
      Position<Character> var0 = tree.addRoot(((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)98)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)97)) ;
      Position<Character> var6 = tree.insertRight(var2,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)100)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)99)) ;
      Position<Character> var9 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)122)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)121)) ;
      Position<Character> var13 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)118)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)117)) ;
      Position<Character> var17 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)120)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)119)) ;
      Position<Character> var20 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var21 = tree.insertLeft(var20,((char)32)) ;
      Position<Character> var22 = tree.insertLeft(var21,((char)32)) ;
      Position<Character> var23 = tree.insertLeft(var22,((char)32)) ;
      Position<Character> var24 = tree.insertLeft(var23,((char)106)) ;
      Position<Character> var25 = tree.insertRight(var23,((char)105)) ;
      Position<Character> var26 = tree.insertRight(var22,((char)32)) ;
      Position<Character> var27 = tree.insertLeft(var26,((char)108)) ;
      Position<Character> var28 = tree.insertRight(var26,((char)107)) ;
      Position<Character> var29 = tree.insertRight(var21,((char)32)) ;
      Position<Character> var30 = tree.insertLeft(var29,((char)32)) ;
      Position<Character> var31 = tree.insertLeft(var30,((char)102)) ;
      Position<Character> var32 = tree.insertRight(var30,((char)101)) ;
      Position<Character> var33 = tree.insertRight(var29,((char)32)) ;
      Position<Character> var34 = tree.insertLeft(var33,((char)104)) ;
      Position<Character> var35 = tree.insertRight(var33,((char)103)) ;
      Position<Character> var36 = tree.insertRight(var20,((char)32)) ;
      Position<Character> var37 = tree.insertLeft(var36,((char)32)) ;
      Position<Character> var38 = tree.insertLeft(var37,((char)32)) ;
      Position<Character> var39 = tree.insertLeft(var38,((char)114)) ;
      Position<Character> var40 = tree.insertRight(var38,((char)113)) ;
      Position<Character> var41 = tree.insertRight(var37,((char)32)) ;
      Position<Character> var42 = tree.insertLeft(var41,((char)116)) ;
      Position<Character> var43 = tree.insertRight(var41,((char)115)) ;
      Position<Character> var44 = tree.insertRight(var36,((char)32)) ;
      Position<Character> var45 = tree.insertLeft(var44,((char)32)) ;
      Position<Character> var46 = tree.insertLeft(var45,((char)110)) ;
      Position<Character> var47 = tree.insertRight(var45,((char)109)) ;
      Position<Character> var48 = tree.insertRight(var44,((char)32)) ;
      Position<Character> var49 = tree.insertLeft(var48,((char)112)) ;
      Position<Character> var50 = tree.insertRight(var48,((char)111)) ;
      ok_sofar = TesterLab5.checkConstructor("abcdefghijklmnopqrstuvwxyz",new int[] { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1 },tree) ;
      return ok_sofar ;
  }



  static int test_type_to_index(String test_type) {
      if (test_type.equals("countChars")) return 0;
      if (test_type.equals("attach")) return 1;
      if (test_type.equals("constructor")) return 2;
      System.out.println("\n*** Error: test "+test_type+" not known.");
      throw new RuntimeException();
  }

  static boolean results_ok_sofar(boolean[] ok_sofar, String test_type) {
      return true;
  }

  static boolean local_results_ok_sofar(boolean[] results_sofar, String test_type) {
      int index = test_type_to_index(test_type);
      return results_sofar[index];
  }

  static boolean[] combine_results(boolean result, boolean results_sofar[], String id, String test_type) {
      int index = test_type_to_index(test_type);
      results_sofar[index] = results_sofar[index] && result;
      return results_sofar;
  }

  static boolean results_ok(boolean results_sofar[], boolean general_results) {
      int successes = 0;
      for (int i=0; i<3; i++) {
	  if (results_sofar[i])
	      ++successes;
      }
      return successes >= 3;
  }

static void report_results(String tester, boolean results_sofar[], boolean general_results) {
      System.out.println("\n++++++++++++++++++++++++++++++++++++++++++\n");

      for (int i=0; i<=2; i++) {
	  String testName="";
	  if (i==0) testName = "countChars";
	  else if (i==1) testName = "attach";
	  else if (i==2) testName = "constructor";

	  System.out.print("Testing results for "+testName+": ");
	  if (results_sofar[i])
	      System.out.println("succeeded");
	  else
	      System.out.println("failed");

      }

      System.out.println("\n------------------------------------------");
      if (results_ok(results_sofar,general_results))
	  System.out.println("\n"+tester+": Test finalizado correctamente.");
      else
	  System.out.println("\n"+tester+": errores detectados.\n");
  }

  @SuppressWarnings("unchecked")
  static boolean checkConstructor(String text, int[] expectedCharCounts, BinaryTree<Character>bt) {
      String callString = "new Huffman(\""+text+"\")";
      int charCounts[] = null;
      boolean ok_sofar = true;

      if (ok_sofar) {
	  try {
            if (!checkCharCounts(text,expectedCharCounts)) {
              System.out.println
                ("when calling the constructor "+callString);
                return false;
            }

              charCounts = Huffman.countChars(text);
	      huffman = new Huffman(text);
              if (huffman == null) {
                printError
                  (ExecutionTime.UNRELATED,
                   callString+" returned null;\n");
                return false;
              }
	  } catch ( Throwable exc ) {
	      printCallException(callString,exc);
              System.out.println
                ("\nOne possible Huffman tree for the call "+callString+
                 " is the tree\n"+bt);
	      ok_sofar = false;
	      return false;
	  }
      }

      if (ok_sofar) {
	  try {
	      treeField = huffman.getClass().getDeclaredField("huffmanTree");
	      treeField.setAccessible(true);
	      TesterLab5.tree = (BinaryTree<Character>)treeField.get(huffman);
              if (tree == null) {
                printError
                  (ExecutionTime.UNRELATED,
                   "after the call to "+callString+
                   " the attribute huffmanTree has the value null");
                return false;
              }
	  } catch ( Throwable exc ) {
	      printCallException("access the field huffmanTree",exc);
	      ok_sofar = false;
	      return false;
	  }
      }

      ok_sofar = checkAlgorithmResult(tree, charCounts, callString);

      if (!ok_sofar) {
        System.out.println
          ("\nOne possible Huffman tree for the call "+callString+
           " is the tree\n"+bt);
      }
      
      return ok_sofar;
  }

  static boolean checkAlgorithmResult(BinaryTree<Character> tree, int[] charCounts,
                             String callString) {
    boolean ok_sofar = true;
    ArrayList<Node> nodes = new ArrayList<Node>();

    //System.out.println
    //("\ncar: charCounts: "+printCharArray(charCounts)+" tree:\n"+tree+"\n");

    // We have to check that:
    // all the leaves correspond to characters with a count>0,
    // and all characters with a count>0 has a leaf,
    // and the size of the list of leaves and characters with a count>0
    // is equal
    
    visitLeaves(tree, tree.root(), charCounts, callString, nodes);

    ArrayList<Character> nonZeroChars = new ArrayList<Character>();

    for (int i=0; i<charCounts.length; i++) {
      if (charCounts[i] > 0) {
        Character ch = new Character((char) i);
        nonZeroChars.add(ch);
        boolean found = false;
        for (int j=0; j<nodes.size() && !found; j++) {
          if (nodes.get(j).node.element().equals(ch)) found=true;
        }
        if (!found) {
          printError
            (ExecutionTime.UNRELATED,
             callString+" generated an arbol\n");
          System.out.println(tree);
          System.out.print("In the text the character "+ch(i));
          System.out.println(" has count "+charCounts[i]+" but there is no leaf labelled by that character in the tree\n");
          return false;
          }
      }
    }

    if (nodes.size() != nonZeroChars.size()) {
      printError
        (ExecutionTime.UNRELATED,
             callString+" generated an arbol\n");
          System.out.println(tree);
          System.out.println("The number of characters with a count>0: ");
          System.out.println(nonZeroChars);
          System.out.println("does not match the number of characters in the leafs: ");
          System.out.print("[");
          for (int i=0; i<nodes.size(); i++) {
            Node n = nodes.get(i);
            if (i>0)
              System.out.print(", ");
            System.out.print(n.node.element());
          }
          System.out.println("]");
          return false;
    }

    while (nodes.size() > 1) {
      ArrayList<Node> mergeableNodes = new ArrayList<Node>();
      Collections.sort(nodes);
      //System.out.println("\ncar: leaves: "+nodes);
      mergeableNodes(nodes,mergeableNodes);
      //System.out.println("mergeableNodes: "+mergeableNodes);
      ArrayList<NodePair> nodePairs = new ArrayList<NodePair>();
      allMinimalPairs(mergeableNodes,nodePairs);
      //System.out.println("mergeablePairs: "+nodePairs);
      boolean found = false;
      for (int i=0; !found && i<nodePairs.size(); i++) {
        NodePair nodePair = nodePairs.get(i);
        Position<Character> pos = findNodePairInTree(nodePair,tree,tree.root());
        if (pos != null) {
          //System.out.println("merged "+nodePair);
          nodes.remove(nodePair.node1);
          nodes.remove(nodePair.node2);
          nodes.add(new Node(pos, tree, nodePair.count));
          found = true;
        }
      }
      if (!found) {
        System.out.println
          ("*** Error: in the call\n"+callString+
           "\nwith character counts: "+printCharArray(charCounts)+
           "\nnone of the minimal subtree pairs:\n"+nodePairs+
           "\nwere merged in the resulting tree:\n\n"+tree);
        ok_sofar = false;
        return ok_sofar;
      }
    }
    return ok_sofar;
  }

  static Position<Character> findNodePairInTree(NodePair nodePair,
                                                BinaryTree<Character> tree,
                                                Position<Character> cursor) {
    if (cursor==null) return null;
    if (tree.isExternal(cursor)) return null;

    Position<Character> left = tree.left(cursor);
    Position<Character> right = tree.right(cursor);

    if ((left==nodePair.node1.node && right==nodePair.node2.node) ||
        (left==nodePair.node2.node && right==nodePair.node1.node))
      return cursor;

    Position<Character> result = findNodePairInTree(nodePair, tree, left);
    if (result != null)
      return result;
    return findNodePairInTree(nodePair, tree, right);
  }

  static void allMinimalPairs(ArrayList<Node> nodes,
                              ArrayList<NodePair> nodePairs) {
    int min = -1;
    Collections.sort(nodes);

    for (int i=0; i<nodes.size(); i++) {
      for (int j=i+1; j<nodes.size(); j++) {
        int pairCount = nodes.get(i).count+nodes.get(j).count;
        if (min==-1 || pairCount<=min) {
          min = pairCount;
          nodePairs.add(new NodePair(nodes.get(i),nodes.get(j)));
        }
      }
    }
  }

  static void mergeableNodes(ArrayList<Node> allNodes,
                             ArrayList<Node> mergeableNodes) {
    int maxCount = -1;
    int selected = 0;
    for (Node node : allNodes) {
      if (selected == 0) {
        mergeableNodes.add(node);
        selected = 1;
        maxCount = node.count;
      } else if (selected < 2 || node.count==maxCount) {
        ++selected;
        maxCount = node.count;
        mergeableNodes.add(node);
      } else return;
    }
  }

  static boolean visitLeaves(BinaryTree<Character> tree,
                             Position<Character> pos,
                             int[] charCounts,
                             String callString,
                             ArrayList<Node> leaves) {

    boolean ok_sofar = true;
    
    if (pos == null) return true;

    if (tree.isExternal(pos)) {
      Character ch = pos.element();
      try {
        int count = charCounts[ch];

        if (count < 1) {
          System.out.print("\nThe tree generated by "+callString);
          System.out.print("\n");
          System.out.println(tree);
          System.out.println("\n has a leaf labelled by a character "+ch(ch));
          System.out.println(" which has count "+count+" in charCounts\n");
          return false;
        }
        leaves.add(new Node(pos, tree, count));
      } catch (Throwable exc) {
        printCallException(callString,exc);
        System.out.print("\nThe tree generated by  "+callString);
          System.out.print("\n");
        System.out.println(tree);
        System.out.println("\n has a leaf labelled by a character "+ch(ch));
        System.out.println(" which does not occur in charCounts\n");
        ok_sofar = false;
        return false;
      }
    } else {
      ok_sofar =
        visitLeaves(tree, tree.left(pos), charCounts, callString, leaves);
      ok_sofar =
        ok_sofar && 
        visitLeaves(tree, tree.right(pos), charCounts, callString, leaves);
    }
    return ok_sofar;
  }

  static boolean checkCharCounts(String text, int[] expected) {
    boolean ok_sofar = true;

    if (ok_sofar) {

	String callString = "Huffman.countChars(\""+text+"\")";
	
	try {
	  int[] result = Huffman.countChars(text);

          if (result == null) {
            printError
              (ExecutionTime.UNRELATED,
               callString+" returned null");
            return false;
          }

          if (result.length < expected.length) {
            printError
              (ExecutionTime.UNRELATED,
               callString+" returned an array "+
               printCharCounts(result)+" of length "+result.length+
               " which is shorter than the length "+expected.length+
               " of the expected array "+printCharCounts(expected));
               return false;
          }

          for (int i=0; i<expected.length; i++) {
            if (result[i] != expected[i]) {
              printError
                (ExecutionTime.UNRELATED,
                 callString+" returned an array "+
                 printCharCounts(result)+
                 " where character "+ch(i)+
                 " has count "+result[i]+
                 " but the count "+expected[i]+
                 " was expected.\n");
                 return false;
            }
          }
	} catch ( Throwable exc ) {
	  printCallException(callString,exc);
	  return false;
      }

    }
    return ok_sofar;
  }

  static String ch(int i) {
    return "'"+(new Character((char) i))+"'";
  }

static boolean checkAttach(BinaryTree<Character>origTree, AttachableBinaryTree<Character>tree, boolean[] path, BinaryTree<Character> leftTree, BinaryTree<Character> rightTree, BinaryTree<Character> resultingTree) {

    boolean ok_sofar = true;
    String callString = null;
    
    if (ok_sofar) {
        Position<Character> pos = tree.root();

        for (boolean isLeft : path) {
          if (isLeft) pos = tree.left(pos);
          else pos = tree.right(pos);
        }

	callString =
          "tree.attach(pos,leftTree,rightTree)"+
          "\nwhere pos = node labelled by "+ch(pos.element())+
          "\ntree:\n"+origTree+
          "\nrightTree:\n"+rightTree+
          "\nleftTree:\n"+leftTree+"\n";

	try {
          tree.attach(pos,leftTree,rightTree);
        } catch ( Throwable exc ) {
	  printCallException(callString,exc);
	  return false;
      }
    }

    if (ok_sofar)
      ok_sofar = checkTree(callString,tree,resultingTree);

    return ok_sofar;
  }


static boolean checkTree(String callString, BinaryTree<Character> tree, BinaryTree<Character>expt) {
	boolean ok_sofar = true;
	
	if (ok_sofar && (expt.isEmpty() != tree.isEmpty()))
	    ok_sofar = false;

	if (ok_sofar)
          ok_sofar =
            checkTreePos(callString, tree, tree.root(), expt, expt.root());

	if (!ok_sofar) {
	    System.out.println("\n*** Error for "+testName+": ");
            System.out.println("after the call "+callString);
            System.out.println("the tree has the shape\n"+tree);
	    System.out.println("\nBut the resulting tree should have the shape\n");
	    System.out.println(expt);
	}

	return ok_sofar;
    }

    static boolean checkTreePos(String callString,
				BinaryTree<Character> tree,
				Position<Character> pos,
				BinaryTree<Character>expt,
                                Position<Character> exppos) {
	boolean ok_sofar = true;

	if (ok_sofar && (expt.isExternal(exppos) != tree.isExternal(pos))) {
	    ok_sofar = false;
	}

	if (ok_sofar && expt.isExternal(exppos)) {
          if (!exppos.element().equals(pos.element())) {
		ok_sofar = false;
	    }
	}

	if (ok_sofar && !expt.isExternal(exppos)) {
	    if (ok_sofar && (expt.hasLeft(exppos) != tree.hasLeft(pos))) {
		ok_sofar = false;
	    }

	    if (ok_sofar && (expt.hasRight(exppos) != tree.hasRight(pos))) {
		ok_sofar = false;
	    }
	}

	if (ok_sofar && !expt.isExternal(exppos)) {
	    if (ok_sofar && expt.hasLeft(exppos))
              ok_sofar = checkTreePos(callString,tree,tree.left(pos),expt,expt.left(exppos));

	    if (ok_sofar && expt.hasRight(exppos))
              ok_sofar = checkTreePos(callString,tree,tree.right(pos),expt,expt.right(exppos));
	}

      return ok_sofar;
    }

    static void printCallException(ExecutionTime time, String msg, Throwable exc) {
      System.out.println("\n*** Error for "+testName+": ");

      if (!callSeq.equals("")) {
	  System.out.print(callSeqString(time));
	  System.out.println(callSeq);
      }

      switch (time) {
      case AFTER:
	  System.out.println("the call to "+msg+" raised the exception -- "+exc+
			     " -- although it should not have\n");
	  break;
      default:
	  System.out.println("the exception -- "+exc+" -- was raised although it "+
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
      System.out.println("\n*** Warning for "+testName+": ");
      System.out.print(callSeqString(time));
      System.out.println(callSeq);
      System.out.println(msg+"\n");
  }

    static void printError(ExecutionTime time, String msg) {
      System.out.println("\n*** Error for "+testName+": ");
      System.out.print(callSeqString(time));
      System.out.println(callSeq);
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

  static String printArray(Object[] arr) {
      StringBuilder arrString = new StringBuilder("[");
      
      for (int i = 0; i < arr.length; i++) {
	  arrString.append(arr[i].toString());
	  if (i < arr.length-1)
	      arrString.append(" ");
      }
      arrString.append("]");
      return arrString.toString();
  }

  static String printArray(int[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(",");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  static String printCharCounts(int charCounts[]) {
    return printArray(charCounts)+" == "+printCharArray(charCounts);
  }

  static String printCharArray(int[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
              if (arrString.charAt(arrString.length()-1) != '[')
                arrString.append(",");
              arrString.append(ch(i)+"="+arr[i]);
            }
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  static String printArray(boolean[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(",");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }
}

class Node implements Comparable<Node> {
  Position<Character> node;
  int count;
  BinaryTree<Character> tree;

  Node(Position<Character> node, BinaryTree<Character> tree, int count) {
    this.node = node;
    this.tree = tree;
    this.count = count;
  }

  public int compareTo(Node otherNode) {
    return count - otherNode.count;
  }

  public String toString() {
    ArrayList<Character> chars = new ArrayList<Character>();
    allCharacters(tree, node, chars);
    return "subtree<with chars "+chars.toString()+",count="+count+">";
  }

  void allCharacters(BinaryTree<Character> tree,
                     Position<Character> node,
                     ArrayList<Character> chars) {
    if (node==null) return;
    if (tree.isExternal(node)) {
      chars.add(node.element());
    } else {
      allCharacters(tree, tree.left(node), chars);
      allCharacters(tree, tree.right(node), chars);
    }
  }
}

class NodePair implements Comparable<NodePair> {
  Node node1, node2;
  int count;

  NodePair(Node node1, Node node2) {
    this.node1 = node1;
    this.node2 = node2;
    this.count = node1.count+node2.count;
  }

  public int compareTo(NodePair otherNodePair) {
    return count - otherNodePair.count;
  }

  public String toString() {
    return "\n{"+node1.toString()+",\n "+node2.toString()+"}\n";
  }
}

class Leaf implements Comparable<Leaf> {
  char ch;
  int depth;
  int count;

  Leaf(char ch, int depth, int count) {
    this.ch = ch;
    this.depth = depth;
    this.count = count;
  }

  public int compareTo(Leaf otherLeaf) {
    return count - otherLeaf.count;
  }
}
