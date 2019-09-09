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

package aed.cache;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;

import java.util.Iterator;
import java.util.Comparator;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collections;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.Version;
import es.upm.aedlib.Entry;
import es.upm.aedlib.EntryImpl;
import es.upm.aedlib.map.Map;

@SuppressWarnings("unused")
public class TesterLab6 {

  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String testName;
  static String callSeq="";

  static boolean[] results_sofar = {true};
  static boolean general_results = true;
  static boolean testsRun = false;
  static boolean testResult = false;

  static Field mapField;
  static Storage<Integer,String> storage = null;
  static Cache<Integer,String> cache = null;
  static PositionList<Integer> lru = null;
  static Map<Integer,CacheCell<Integer,String>> map = null;
  
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
		testMethod = TesterLab6.class.getDeclaredMethod(testName);
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
    // Check version of aedlib -- we want a version >= 2.2.0
    if (Version.major() < 2
	|| (Version.major() == 2 && Version.minor() < 2) 
	|| (Version.major() == 2 && Version.minor() == 2) && Version.patchlevel() < 0) {
      System.out.println
	("\n*** Warning: aedlib.jar is too old; the Tester may not work correctly.\nPlease install a newer version "+
	 "of the library.\nMinimum acceptable version: 2.2.0");
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
    // File generated at: 2018/11/28 -- 16:52:3
    // Seed: {1543,420321,504754}
    //
    //////////////////////////////////////////////////////////////////////



    try {
      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_1(), results_sofar, "test_1", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_2(), results_sofar, "test_2", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_3(), results_sofar, "test_3", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_4(), results_sofar, "test_4", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_5(), results_sofar, "test_5", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_6(), results_sofar, "test_6", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_7(), results_sofar, "test_7", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_8(), results_sofar, "test_8", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_9(), results_sofar, "test_9", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_10(), results_sofar, "test_10", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_11(), results_sofar, "test_11", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_12(), results_sofar, "test_12", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_13(), results_sofar, "test_13", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_14(), results_sofar, "test_14", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_15(), results_sofar, "test_15", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_16(), results_sofar, "test_16", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_17(), results_sofar, "test_17", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_18(), results_sofar, "test_18", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_19(), results_sofar, "test_19", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_20(), results_sofar, "test_20", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_21(), results_sofar, "test_21", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_22(), results_sofar, "test_22", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_23(), results_sofar, "test_23", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_24(), results_sofar, "test_24", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_25(), results_sofar, "test_25", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_26(), results_sofar, "test_26", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_27(), results_sofar, "test_27", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_28(), results_sofar, "test_28", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_29(), results_sofar, "test_29", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_30(), results_sofar, "test_30", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_31(), results_sofar, "test_31", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_32(), results_sofar, "test_32", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_33(), results_sofar, "test_33", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_34(), results_sofar, "test_34", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_35(), results_sofar, "test_35", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_36(), results_sofar, "test_36", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_37(), results_sofar, "test_37", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_38(), results_sofar, "test_38", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_39(), results_sofar, "test_39", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_40(), results_sofar, "test_40", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_41(), results_sofar, "test_41", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_42(), results_sofar, "test_42", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_43(), results_sofar, "test_43", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_44(), results_sofar, "test_44", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_45(), results_sofar, "test_45", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_46(), results_sofar, "test_46", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_47(), results_sofar, "test_47", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_48(), results_sofar, "test_48", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_49(), results_sofar, "test_49", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_50(), results_sofar, "test_50", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_51(), results_sofar, "test_51", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_52(), results_sofar, "test_52", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_53(), results_sofar, "test_53", "cache");

    } catch ( Throwable exc ) {
          printCallException(ExecutionTime.DURING,"",exc);
          return false;
      }


    report_results("TesterLab6",results_sofar,general_results);


    if (results_ok(results_sofar,general_results))
      return true;
    else
      return false;
  }



  static boolean test_1 ()
  {
      
      testName = "test_1" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      return ok_sofar ;
  }


  static boolean test_2 ()
  {
      
      testName = "test_2" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hola","hei","hello","kaixo","hej" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"hei",2,new Integer[] { 3 },new String[] { "hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hola","hei","hello","kaixo","hej" },new Integer[] { 3 }) ;
      return ok_sofar ;
  }


  static boolean test_3 ()
  {
      
      testName = "test_3" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","zdravo","rimaykullayki","kaixo","privet","hi","hola","ola","bon dia","hej","namaste","hello" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"hola",4,new Integer[] { 7 },new String[] { "hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","zdravo","rimaykullayki","kaixo","privet","hi","hola","ola","bon dia","hej","namaste","hello" },new Integer[] { 7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"privet",4,new Integer[] { 5,7 },new String[] { "privet","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","zdravo","rimaykullayki","kaixo","privet","hi","hola","ola","bon dia","hej","namaste","hello" },new Integer[] { 5,7 }) ;
      return ok_sofar ;
  }


  static boolean test_4 ()
  {
      
      testName = "test_4" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(3,new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ola","hola","zdravo","hei","ciao","hej","hello","hallo","hi" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"namaste",3,new Integer[] { 5 },new String[] { "namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ola","hola","zdravo","hei","ciao","hej","hello","hallo","hi" },new Integer[] { 5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"zdravo",3,new Integer[] { 3,5 },new String[] { "zdravo","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ola","hola","zdravo","hei","ciao","hej","hello","hallo","hi" },new Integer[] { 3,5 }) ;
      return ok_sofar ;
  }


  static boolean test_5 ()
  {
      
      testName = "test_5" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","kaixo","hi","hej","salaam","ola","hola","dobry den","zdravo","rimaykullayki","ciao","hallo" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"ola",4,new Integer[] { 6 },new String[] { "ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","kaixo","hi","hej","salaam","ola","hola","dobry den","zdravo","rimaykullayki","ciao","hallo" },new Integer[] { 6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(10,"hallo",4,new Integer[] { 10,6 },new String[] { "hallo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","kaixo","hi","hej","salaam","ola","hola","dobry den","zdravo","rimaykullayki","ciao","hallo" },new Integer[] { 10,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"ola",4,new Integer[] { 3,10,6 },new String[] { "ola","hallo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","kaixo","hi","hej","salaam","ola","hola","dobry den","zdravo","rimaykullayki","ciao","hallo" },new Integer[] { 3,10,6 }) ;
      return ok_sofar ;
  }


  static boolean test_6 ()
  {
      
      testName = "test_6" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","privet","namaste","hello","hola","bon dia","salaam","rimaykullayki","hallo","hei","hi","zdravo" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"privet",4,new Integer[] { 9 },new String[] { "privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","privet","namaste","hello","hola","bon dia","salaam","rimaykullayki","hallo","hei","hi","zdravo" },new Integer[] { 9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(12,"zdravo",4,new Integer[] { 12,9 },new String[] { "zdravo","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","privet","namaste","hello","hola","bon dia","salaam","rimaykullayki","hallo","hei","hi","zdravo" },new Integer[] { 12,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(10,"hallo",4,new Integer[] { 10,12,9 },new String[] { "hallo","zdravo","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","privet","namaste","hello","hola","bon dia","salaam","rimaykullayki","hallo","hei","hi","zdravo" },new Integer[] { 10,12,9 }) ;
      return ok_sofar ;
  }


  static boolean test_7 ()
  {
      
      testName = "test_7" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hej","hello","dobry den","namaste","hei","hola","rimaykullayki","hallo","salaam","kaixo","privet" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"ola",4,new Integer[] { 4 },new String[] { "ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hej","hello","dobry den","namaste","hei","hola","rimaykullayki","hallo","salaam","kaixo","privet" },new Integer[] { 4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"hallo",4,new Integer[] { 9,4 },new String[] { "hallo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hej","hello","dobry den","namaste","hei","hola","rimaykullayki","hallo","salaam","kaixo","privet" },new Integer[] { 9,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(12,"privet",4,new Integer[] { 12,9,4 },new String[] { "privet","hallo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hej","hello","dobry den","namaste","hei","hola","rimaykullayki","hallo","salaam","kaixo","privet" },new Integer[] { 12,9,4 }) ;
      return ok_sofar ;
  }


  static boolean test_8 ()
  {
      
      testName = "test_8" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(3,new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","rimaykullayki","namaste","hi","kaixo","hej","bon dia","salaam","privet" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"hola",3,new Integer[] { 9 },new String[] { "hola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","rimaykullayki","namaste","hi","kaixo","hej","bon dia","salaam","privet" },new Integer[] { 9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"hi",3,new Integer[] { 1,9 },new String[] { "hi","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","rimaykullayki","namaste","hi","kaixo","hej","bon dia","salaam","privet" },new Integer[] { 1,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"bon dia",3,new Integer[] { 7,1,9 },new String[] { "bon dia","hi","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","rimaykullayki","namaste","hi","kaixo","hej","bon dia","salaam","privet" },new Integer[] { 7,1,9 }) ;
      return ok_sofar ;
  }


  static boolean test_9 ()
  {
      
      testName = "test_9" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hello","hej","bon dia","hi","zdravo" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hello",2,new Integer[] { 2 },new String[] { "hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hello","hej","bon dia","hi","zdravo" },new Integer[] { 2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"hallo",2,new Integer[] { 1,2 },new String[] { "hallo","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hello","hej","bon dia","hi","zdravo" },new Integer[] { 1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"hej",2,new Integer[] { 3,1 },new String[] { "hej","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hello","hej","bon dia","hi","zdravo" },new Integer[] { 3,1 }) ;
      return ok_sofar ;
  }


  static boolean test_10 ()
  {
      
      testName = "test_10" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hallo","rimaykullayki","kaixo","ciao","privet","hello","hej","hi","dobry den","ola","zdravo" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"hello",4,new Integer[] { 8 },new String[] { "hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hallo","rimaykullayki","kaixo","ciao","privet","hello","hej","hi","dobry den","ola","zdravo" },new Integer[] { 8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"hola",4,new Integer[] { 4,8 },new String[] { "hola","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hallo","rimaykullayki","kaixo","ciao","privet","hello","hej","hi","dobry den","ola","zdravo" },new Integer[] { 4,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"hallo",4,new Integer[] { 6,4,8 },new String[] { "hallo","hola","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hallo","rimaykullayki","kaixo","ciao","privet","hello","hej","hi","dobry den","ola","zdravo" },new Integer[] { 6,4,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(11,"namaste",4,new Integer[] { 11,6,4,8 },new String[] { "namaste","hallo","hola","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hallo","rimaykullayki","kaixo","ciao","privet","hello","hej","hi","dobry den","ola","zdravo" },new Integer[] { 11,6,4,8 }) ;
      return ok_sofar ;
  }


  static boolean test_11 ()
  {
      
      testName = "test_11" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "rimaykullayki","hei","bon dia","kaixo","hej","zdravo" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"d1",2,new Integer[] { 2 },new String[] { "d1" },new Integer[] { 1,2,3,4,5,6 },new String[] { "rimaykullayki","hei","bon dia","kaixo","hej","zdravo" },new Integer[] { 2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"d2",2,new Integer[] { 1,2 },new String[] { "d2","d1" },new Integer[] { 1,2,3,4,5,6 },new String[] { "rimaykullayki","hei","bon dia","kaixo","hej","zdravo" },new Integer[] { 1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"d3",2,new Integer[] { 3,1 },new String[] { "d3","d2" },new Integer[] { 1,2,3,4,5,6 },new String[] { "rimaykullayki","d1","bon dia","kaixo","hej","zdravo" },new Integer[] { 3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"d1",2,new Integer[] { 2,3 },new String[] { "d1","d3" },new Integer[] { 1,2,3,4,5,6 },new String[] { "d2","d1","bon dia","kaixo","hej","zdravo" },new Integer[] { 2,3 }) ;
      return ok_sofar ;
  }


  static boolean test_12 ()
  {
      
      testName = "test_12" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "privet","bon dia","kaixo","hola","hei","hej","ciao","salaam","ola","hi","hello","namaste" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(12,"ciao",4,new Integer[] { 12 },new String[] { "ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "privet","bon dia","kaixo","hola","hei","hej","ciao","salaam","ola","hi","hello","namaste" },new Integer[] { 12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"hola",4,new Integer[] { 4,12 },new String[] { "hola","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "privet","bon dia","kaixo","hola","hei","hej","ciao","salaam","ola","hi","hello","namaste" },new Integer[] { 4,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"ciao",4,new Integer[] { 7,4,12 },new String[] { "ciao","hola","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "privet","bon dia","kaixo","hola","hei","hej","ciao","salaam","ola","hi","hello","namaste" },new Integer[] { 7,4,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(10,"hi",4,new Integer[] { 10,7,4,12 },new String[] { "hi","ciao","hola","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "privet","bon dia","kaixo","hola","hei","hej","ciao","salaam","ola","hi","hello","namaste" },new Integer[] { 10,7,4,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(11,"hello",4,new Integer[] { 11,10,7,4 },new String[] { "hello","hi","ciao","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "privet","bon dia","kaixo","hola","hei","hej","ciao","salaam","ola","hi","hello","ciao" },new Integer[] { 11,10,7,4 }) ;
      return ok_sofar ;
  }


  static boolean test_13 ()
  {
      
      testName = "test_13" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(5,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "salaam","hei","hello","hallo","rimaykullayki","kaixo","dobry den","ciao","privet","hej","zdravo","ola","namaste","hi","bon dia" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"ciao",5,new Integer[] { 8 },new String[] { "ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "salaam","hei","hello","hallo","rimaykullayki","kaixo","dobry den","ciao","privet","hej","zdravo","ola","namaste","hi","bon dia" },new Integer[] { 8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"privet",5,new Integer[] { 9,8 },new String[] { "privet","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "salaam","hei","hello","hallo","rimaykullayki","kaixo","dobry den","ciao","privet","hej","zdravo","ola","namaste","hi","bon dia" },new Integer[] { 9,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(12,"kaixo",5,new Integer[] { 12,9,8 },new String[] { "kaixo","privet","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "salaam","hei","hello","hallo","rimaykullayki","kaixo","dobry den","ciao","privet","hej","zdravo","ola","namaste","hi","bon dia" },new Integer[] { 12,9,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"hallo",5,new Integer[] { 4,12,9,8 },new String[] { "hallo","kaixo","privet","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "salaam","hei","hello","hallo","rimaykullayki","kaixo","dobry den","ciao","privet","hej","zdravo","ola","namaste","hi","bon dia" },new Integer[] { 4,12,9,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"ola",5,new Integer[] { 4,12,9,8 },new String[] { "hallo","kaixo","privet","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "salaam","hei","hello","hallo","rimaykullayki","kaixo","dobry den","ciao","privet","hej","zdravo","ola","namaste","hi","bon dia" },new Integer[] { 8,4,12,9 }) ;
      return ok_sofar ;
  }


  static boolean test_14 ()
  {
      
      testName = "test_14" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","hi","dobry den","hola","hello","namaste" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"hello",2,new Integer[] { 5 },new String[] { "hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","hi","dobry den","hola","hello","namaste" },new Integer[] { 5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"hello",2,new Integer[] { 5 },new String[] { "hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","hi","dobry den","hola","hello","namaste" },new Integer[] { 5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"hola",2,new Integer[] { 4,5 },new String[] { "hola","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","hi","dobry den","hola","hello","namaste" },new Integer[] { 4,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hi",2,new Integer[] { 2,4 },new String[] { "hi","hola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","hi","dobry den","hola","hello","namaste" },new Integer[] { 2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"ola",2,new Integer[] { 6,2 },new String[] { "ola","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","hi","dobry den","hola","hello","namaste" },new Integer[] { 6,2 }) ;
      return ok_sofar ;
  }


  static boolean test_15 ()
  {
      
      testName = "test_15" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","bon dia","salaam","dobry den","ola","ciao" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"ola",2,new Integer[] { 5 },new String[] { "ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","bon dia","salaam","dobry den","ola","ciao" },new Integer[] { 5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"privet",2,new Integer[] { 2,5 },new String[] { "privet","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","bon dia","salaam","dobry den","ola","ciao" },new Integer[] { 2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"hi",2,new Integer[] { 6,2 },new String[] { "hi","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","bon dia","salaam","dobry den","ola","ciao" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"hi",2,new Integer[] { 6,2 },new String[] { "hi","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","bon dia","salaam","dobry den","ola","ciao" },new Integer[] { 2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"hi",2,new Integer[] { 6,2 },new String[] { "hi","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","bon dia","salaam","dobry den","ola","ciao" },new Integer[] { 6,2 }) ;
      return ok_sofar ;
  }


  static boolean test_16 ()
  {
      
      testName = "test_16" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","zdravo","dobry den","hallo","privet","ola" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"zdravo",2,new Integer[] { 2 },new String[] { "zdravo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","zdravo","dobry den","hallo","privet","ola" },new Integer[] { 2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"new",2,new Integer[] { 2 },new String[] { "new" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","zdravo","dobry den","hallo","privet","ola" },new Integer[] { 2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"dobry den",2,new Integer[] { 3,2 },new String[] { "dobry den","new" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","zdravo","dobry den","hallo","privet","ola" },new Integer[] { 3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"hallo",2,new Integer[] { 4,3 },new String[] { "hallo","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","new","dobry den","hallo","privet","ola" },new Integer[] { 4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"new",2,new Integer[] { 2,4 },new String[] { "new","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","new","dobry den","hallo","privet","ola" },new Integer[] { 2,4 }) ;
      return ok_sofar ;
  }


  static boolean test_17 ()
  {
      
      testName = "test_17" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hej","hei","hallo","kaixo","ola","zdravo","bon dia","rimaykullayki","salaam","hi","ciao","namaste" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"hej",4,new Integer[] { 1 },new String[] { "hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hej","hei","hallo","kaixo","ola","zdravo","bon dia","rimaykullayki","salaam","hi","ciao","namaste" },new Integer[] { 1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"bon dia",4,new Integer[] { 7,1 },new String[] { "bon dia","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hej","hei","hallo","kaixo","ola","zdravo","bon dia","rimaykullayki","salaam","hi","ciao","namaste" },new Integer[] { 7,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(11,"ciao",4,new Integer[] { 11,7,1 },new String[] { "ciao","bon dia","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hej","hei","hallo","kaixo","ola","zdravo","bon dia","rimaykullayki","salaam","hi","ciao","namaste" },new Integer[] { 11,7,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(10,"rimaykullayki",4,new Integer[] { 10,11,7,1 },new String[] { "rimaykullayki","ciao","bon dia","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hej","hei","hallo","kaixo","ola","zdravo","bon dia","rimaykullayki","salaam","hi","ciao","namaste" },new Integer[] { 10,11,7,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(11,"kaixo",4,new Integer[] { 10,11,7,1 },new String[] { "rimaykullayki","kaixo","bon dia","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hej","hei","hallo","kaixo","ola","zdravo","bon dia","rimaykullayki","salaam","hi","ciao","namaste" },new Integer[] { 11,10,7,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"bon dia",4,new Integer[] { 3,10,11,7 },new String[] { "bon dia","rimaykullayki","kaixo","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hej","hei","hallo","kaixo","ola","zdravo","bon dia","rimaykullayki","salaam","hi","ciao","namaste" },new Integer[] { 3,11,10,7 }) ;
      return ok_sofar ;
  }


  static boolean test_18 ()
  {
      
      testName = "test_18" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(3,new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "privet","zdravo","hi","hej","hola","bon dia","kaixo","namaste","hallo" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"namaste",3,new Integer[] { 8 },new String[] { "namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "privet","zdravo","hi","hej","hola","bon dia","kaixo","namaste","hallo" },new Integer[] { 8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"hi",3,new Integer[] { 3,8 },new String[] { "hi","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "privet","zdravo","hi","hej","hola","bon dia","kaixo","namaste","hallo" },new Integer[] { 3,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"namaste",3,new Integer[] { 1,3,8 },new String[] { "namaste","hi","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "privet","zdravo","hi","hej","hola","bon dia","kaixo","namaste","hallo" },new Integer[] { 1,3,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"bon dia",3,new Integer[] { 6,1,3 },new String[] { "bon dia","namaste","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "privet","zdravo","hi","hej","hola","bon dia","kaixo","namaste","hallo" },new Integer[] { 6,1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(7,"hei",3,new Integer[] { 7,6,1 },new String[] { "hei","bon dia","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "privet","zdravo","hi","hej","hola","bon dia","kaixo","namaste","hallo" },new Integer[] { 7,6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"bon dia",3,new Integer[] { 7,6,1 },new String[] { "hei","bon dia","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "privet","zdravo","hi","hej","hola","bon dia","kaixo","namaste","hallo" },new Integer[] { 6,7,1 }) ;
      return ok_sofar ;
  }


  static boolean test_19 ()
  {
      
      testName = "test_19" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","hola","hello","privet","rimaykullayki","bon dia" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"ciao",2,new Integer[] { 1 },new String[] { "ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","hola","hello","privet","rimaykullayki","bon dia" },new Integer[] { 1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"dobry den",2,new Integer[] { 2,1 },new String[] { "dobry den","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","hola","hello","privet","rimaykullayki","bon dia" },new Integer[] { 2,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"salaam",2,new Integer[] { 4,2 },new String[] { "salaam","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","hola","hello","privet","rimaykullayki","bon dia" },new Integer[] { 4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"rimaykullayki",2,new Integer[] { 5,4 },new String[] { "rimaykullayki","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","dobry den","hello","privet","rimaykullayki","bon dia" },new Integer[] { 5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"rimaykullayki",2,new Integer[] { 5,4 },new String[] { "rimaykullayki","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","dobry den","hello","privet","rimaykullayki","bon dia" },new Integer[] { 5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"hola",2,new Integer[] { 5,4 },new String[] { "hola","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","dobry den","hello","privet","rimaykullayki","bon dia" },new Integer[] { 5,4 }) ;
      return ok_sofar ;
  }


  static boolean test_20 ()
  {
      
      testName = "test_20" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","kaixo","dobry den","hej","ola","zdravo","rimaykullayki","ciao","hello","salaam","hola","hallo" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"rimaykullayki",4,new Integer[] { 4 },new String[] { "rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","kaixo","dobry den","hej","ola","zdravo","rimaykullayki","ciao","hello","salaam","hola","hallo" },new Integer[] { 4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"rimaykullayki",4,new Integer[] { 4 },new String[] { "rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","kaixo","dobry den","hej","ola","zdravo","rimaykullayki","ciao","hello","salaam","hola","hallo" },new Integer[] { 4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"namaste",4,new Integer[] { 6,4 },new String[] { "namaste","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","kaixo","dobry den","hej","ola","zdravo","rimaykullayki","ciao","hello","salaam","hola","hallo" },new Integer[] { 6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(11,"hola",4,new Integer[] { 11,6,4 },new String[] { "hola","namaste","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","kaixo","dobry den","hej","ola","zdravo","rimaykullayki","ciao","hello","salaam","hola","hallo" },new Integer[] { 11,6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"ciao",4,new Integer[] { 8,11,6,4 },new String[] { "ciao","hola","namaste","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","kaixo","dobry den","hej","ola","zdravo","rimaykullayki","ciao","hello","salaam","hola","hallo" },new Integer[] { 8,11,6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(12,"hallo",4,new Integer[] { 12,8,11,6 },new String[] { "hallo","ciao","hola","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","kaixo","dobry den","rimaykullayki","ola","zdravo","rimaykullayki","ciao","hello","salaam","hola","hallo" },new Integer[] { 12,8,11,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"bon dia",4,new Integer[] { 1,12,8,11 },new String[] { "bon dia","hallo","ciao","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","kaixo","dobry den","rimaykullayki","ola","namaste","rimaykullayki","ciao","hello","salaam","hola","hallo" },new Integer[] { 1,12,8,11 }) ;
      return ok_sofar ;
  }


  static boolean test_21 ()
  {
      
      testName = "test_21" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(3,new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","hello","zdravo","privet","hej","ciao","bon dia","hi","dobry den" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"hej",3,new Integer[] { 5 },new String[] { "hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","hello","zdravo","privet","hej","ciao","bon dia","hi","dobry den" },new Integer[] { 5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"kaixo",3,new Integer[] { 3,5 },new String[] { "kaixo","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","hello","zdravo","privet","hej","ciao","bon dia","hi","dobry den" },new Integer[] { 3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"ola",3,new Integer[] { 4,3,5 },new String[] { "ola","kaixo","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","hello","zdravo","privet","hej","ciao","bon dia","hi","dobry den" },new Integer[] { 4,3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"salaam",3,new Integer[] { 6,4,3 },new String[] { "salaam","ola","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","hello","zdravo","privet","hej","ciao","bon dia","hi","dobry den" },new Integer[] { 6,4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"hej",3,new Integer[] { 5,6,4 },new String[] { "hej","salaam","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","hello","kaixo","privet","hej","ciao","bon dia","hi","dobry den" },new Integer[] { 5,6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"hallo",3,new Integer[] { 8,5,6 },new String[] { "hallo","hej","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","hello","kaixo","ola","hej","ciao","bon dia","hi","dobry den" },new Integer[] { 8,5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hello",3,new Integer[] { 2,8,5 },new String[] { "hello","hallo","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","hello","kaixo","ola","hej","salaam","bon dia","hi","dobry den" },new Integer[] { 2,8,5 }) ;
      return ok_sofar ;
  }


  static boolean test_22 ()
  {
      
      testName = "test_22" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","namaste","hei","hallo","privet","zdravo" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"hei",2,new Integer[] { 3 },new String[] { "hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","namaste","hei","hallo","privet","zdravo" },new Integer[] { 3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"hei",2,new Integer[] { 3 },new String[] { "hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","namaste","hei","hallo","privet","zdravo" },new Integer[] { 3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"privet",2,new Integer[] { 5,3 },new String[] { "privet","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","namaste","hei","hallo","privet","zdravo" },new Integer[] { 5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"kaixo",2,new Integer[] { 1,5 },new String[] { "kaixo","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","namaste","hei","hallo","privet","zdravo" },new Integer[] { 1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"hei",2,new Integer[] { 3,1 },new String[] { "hei","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","namaste","hei","hallo","privet","zdravo" },new Integer[] { 3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"kaixo",2,new Integer[] { 6,3 },new String[] { "kaixo","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","namaste","hei","hallo","privet","zdravo" },new Integer[] { 6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"hej",2,new Integer[] { 1,6 },new String[] { "hej","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","namaste","hei","hallo","privet","zdravo" },new Integer[] { 1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"kaixo",2,new Integer[] { 5,1 },new String[] { "kaixo","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","namaste","hei","hallo","privet","kaixo" },new Integer[] { 5,1 }) ;
      return ok_sofar ;
  }


  static boolean test_23 ()
  {
      
      testName = "test_23" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(3,new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","hej","ciao","dobry den","kaixo","hello","rimaykullayki","hei","privet" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hej",3,new Integer[] { 2 },new String[] { "hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","hej","ciao","dobry den","kaixo","hello","rimaykullayki","hei","privet" },new Integer[] { 2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"hei",3,new Integer[] { 8,2 },new String[] { "hei","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","hej","ciao","dobry den","kaixo","hello","rimaykullayki","hei","privet" },new Integer[] { 8,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"salaam",3,new Integer[] { 4,8,2 },new String[] { "salaam","hei","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","hej","ciao","dobry den","kaixo","hello","rimaykullayki","hei","privet" },new Integer[] { 4,8,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"salaam",3,new Integer[] { 4,8,2 },new String[] { "salaam","hei","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","hej","ciao","dobry den","kaixo","hello","rimaykullayki","hei","privet" },new Integer[] { 4,8,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"hei",3,new Integer[] { 4,8,2 },new String[] { "salaam","hei","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","hej","ciao","dobry den","kaixo","hello","rimaykullayki","hei","privet" },new Integer[] { 8,4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"hello",3,new Integer[] { 3,4,8 },new String[] { "hello","salaam","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","hej","ciao","dobry den","kaixo","hello","rimaykullayki","hei","privet" },new Integer[] { 3,8,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"privet",3,new Integer[] { 9,3,8 },new String[] { "privet","hello","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","hej","ciao","salaam","kaixo","hello","rimaykullayki","hei","privet" },new Integer[] { 9,3,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"hello",3,new Integer[] { 9,3,8 },new String[] { "privet","hello","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","hej","ciao","salaam","kaixo","hello","rimaykullayki","hei","privet" },new Integer[] { 8,9,3 }) ;
      return ok_sofar ;
  }


  static boolean test_24 ()
  {
      
      testName = "test_24" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","salaam","hallo","rimaykullayki","hej","namaste" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"hej",2,new Integer[] { 5 },new String[] { "hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","salaam","hallo","rimaykullayki","hej","namaste" },new Integer[] { 5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"hei",2,new Integer[] { 5 },new String[] { "hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","salaam","hallo","rimaykullayki","hej","namaste" },new Integer[] { 5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"salaam",2,new Integer[] { 2,5 },new String[] { "salaam","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","salaam","hallo","rimaykullayki","hej","namaste" },new Integer[] { 2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"hei",2,new Integer[] { 2,5 },new String[] { "salaam","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","salaam","hallo","rimaykullayki","hej","namaste" },new Integer[] { 5,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"hello",2,new Integer[] { 1,5 },new String[] { "hello","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","salaam","hallo","rimaykullayki","hej","namaste" },new Integer[] { 1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"hei",2,new Integer[] { 3,1 },new String[] { "hei","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","salaam","hallo","rimaykullayki","hei","namaste" },new Integer[] { 3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"hei",2,new Integer[] { 3,1 },new String[] { "hei","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","salaam","hallo","rimaykullayki","hei","namaste" },new Integer[] { 3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"hallo",2,new Integer[] { 6,3 },new String[] { "hallo","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","salaam","hallo","rimaykullayki","hei","namaste" },new Integer[] { 6,3 }) ;
      return ok_sofar ;
  }


  static boolean test_25 ()
  {
      
      testName = "test_25" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","hej","kaixo","hallo","salaam","namaste" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hej",2,new Integer[] { 2 },new String[] { "hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","hej","kaixo","hallo","salaam","namaste" },new Integer[] { 2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"bon dia",2,new Integer[] { 2 },new String[] { "bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","hej","kaixo","hallo","salaam","namaste" },new Integer[] { 2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"ciao",2,new Integer[] { 2 },new String[] { "ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","hej","kaixo","hallo","salaam","namaste" },new Integer[] { 2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"namaste",2,new Integer[] { 2 },new String[] { "namaste" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","hej","kaixo","hallo","salaam","namaste" },new Integer[] { 2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"kaixo",2,new Integer[] { 3,2 },new String[] { "kaixo","namaste" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","hej","kaixo","hallo","salaam","namaste" },new Integer[] { 3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"namaste",2,new Integer[] { 6,3 },new String[] { "namaste","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","namaste","kaixo","hallo","salaam","namaste" },new Integer[] { 6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"salaam",2,new Integer[] { 5,6 },new String[] { "salaam","namaste" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","namaste","kaixo","hallo","salaam","namaste" },new Integer[] { 5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"salaam",2,new Integer[] { 5,6 },new String[] { "salaam","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","namaste","kaixo","hallo","salaam","namaste" },new Integer[] { 6,5 }) ;
      return ok_sofar ;
  }


  static boolean test_26 ()
  {
      
      testName = "test_26" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(5,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","hello","hej","dobry den","rimaykullayki","salaam","ciao","hi","zdravo","hola","privet","hei","ola","namaste","bon dia" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(10,"hola",5,new Integer[] { 10 },new String[] { "hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","hello","hej","dobry den","rimaykullayki","salaam","ciao","hi","zdravo","hola","privet","hei","ola","namaste","bon dia" },new Integer[] { 10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"ciao",5,new Integer[] { 5,10 },new String[] { "ciao","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","hello","hej","dobry den","rimaykullayki","salaam","ciao","hi","zdravo","hola","privet","hei","ola","namaste","bon dia" },new Integer[] { 5,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(14,"namaste",5,new Integer[] { 14,5,10 },new String[] { "namaste","ciao","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","hello","hej","dobry den","rimaykullayki","salaam","ciao","hi","zdravo","hola","privet","hei","ola","namaste","bon dia" },new Integer[] { 14,5,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"hello",5,new Integer[] { 14,5,10 },new String[] { "namaste","hello","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","hello","hej","dobry den","rimaykullayki","salaam","ciao","hi","zdravo","hola","privet","hei","ola","namaste","bon dia" },new Integer[] { 5,14,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(12,"hei",5,new Integer[] { 12,14,5,10 },new String[] { "hei","namaste","hello","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","hello","hej","dobry den","rimaykullayki","salaam","ciao","hi","zdravo","hola","privet","hei","ola","namaste","bon dia" },new Integer[] { 12,5,14,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(11,"hello",5,new Integer[] { 11,12,14,5,10 },new String[] { "hello","hei","namaste","hello","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","hello","hej","dobry den","rimaykullayki","salaam","ciao","hi","zdravo","hola","privet","hei","ola","namaste","bon dia" },new Integer[] { 11,12,5,14,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"salaam",5,new Integer[] { 6,11,12,14,5 },new String[] { "salaam","hello","hei","namaste","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","hello","hej","dobry den","rimaykullayki","salaam","ciao","hi","zdravo","hola","privet","hei","ola","namaste","bon dia" },new Integer[] { 6,11,12,5,14 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(15,"hi",5,new Integer[] { 15,6,11,12,5 },new String[] { "hi","salaam","hello","hei","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","hello","hej","dobry den","rimaykullayki","salaam","ciao","hi","zdravo","hola","privet","hei","ola","namaste","bon dia" },new Integer[] { 15,6,11,12,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(12,"hi",5,new Integer[] { 15,6,11,12,5 },new String[] { "hi","salaam","hello","hi","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","hello","hej","dobry den","rimaykullayki","salaam","ciao","hi","zdravo","hola","privet","hei","ola","namaste","bon dia" },new Integer[] { 12,15,6,11,5 }) ;
      return ok_sofar ;
  }


  static boolean test_27 ()
  {
      
      testName = "test_27" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(5,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","ciao","salaam","hello","zdravo","hej","hola","hi","bon dia","privet","dobry den","ola","kaixo","namaste","hei" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"hello",5,new Integer[] { 1 },new String[] { "hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","ciao","salaam","hello","zdravo","hej","hola","hi","bon dia","privet","dobry den","ola","kaixo","namaste","hei" },new Integer[] { 1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"hello",5,new Integer[] { 4,1 },new String[] { "hello","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","ciao","salaam","hello","zdravo","hej","hola","hi","bon dia","privet","dobry den","ola","kaixo","namaste","hei" },new Integer[] { 4,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"hei",5,new Integer[] { 8,4,1 },new String[] { "hei","hello","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","ciao","salaam","hello","zdravo","hej","hola","hi","bon dia","privet","dobry den","ola","kaixo","namaste","hei" },new Integer[] { 8,4,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"bon dia",5,new Integer[] { 9,8,4,1 },new String[] { "bon dia","hei","hello","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","ciao","salaam","hello","zdravo","hej","hola","hi","bon dia","privet","dobry den","ola","kaixo","namaste","hei" },new Integer[] { 9,8,4,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"kaixo",5,new Integer[] { 9,8,4,1 },new String[] { "bon dia","hei","hello","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","ciao","salaam","hello","zdravo","hej","hola","hi","bon dia","privet","dobry den","ola","kaixo","namaste","hei" },new Integer[] { 1,9,8,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(15,"hei",5,new Integer[] { 15,9,8,4,1 },new String[] { "hei","bon dia","hei","hello","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","ciao","salaam","hello","zdravo","hej","hola","hi","bon dia","privet","dobry den","ola","kaixo","namaste","hei" },new Integer[] { 15,1,9,8,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(10,"zdravo",5,new Integer[] { 10,15,9,8,1 },new String[] { "zdravo","hei","bon dia","hei","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","ciao","salaam","hello","zdravo","hej","hola","hi","bon dia","privet","dobry den","ola","kaixo","namaste","hei" },new Integer[] { 10,15,1,9,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(12,"namaste",5,new Integer[] { 12,10,15,9,1 },new String[] { "namaste","zdravo","hei","bon dia","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","ciao","salaam","hello","zdravo","hej","hola","hei","bon dia","privet","dobry den","ola","kaixo","namaste","hei" },new Integer[] { 12,10,15,1,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"hei",5,new Integer[] { 8,12,10,15,1 },new String[] { "hei","namaste","zdravo","hei","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","ciao","salaam","hello","zdravo","hej","hola","hei","bon dia","privet","dobry den","ola","kaixo","namaste","hei" },new Integer[] { 8,12,10,15,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(7,"dobry den",5,new Integer[] { 7,8,12,10,15 },new String[] { "dobry den","hei","namaste","zdravo","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "kaixo","ciao","salaam","hello","zdravo","hej","hola","hei","bon dia","privet","dobry den","ola","kaixo","namaste","hei" },new Integer[] { 7,8,12,10,15 }) ;
      return ok_sofar ;
  }


  static boolean test_28 ()
  {
      
      testName = "test_28" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","hej","hei","namaste","hello" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"hej",2,new Integer[] { 3 },new String[] { "hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","hej","hei","namaste","hello" },new Integer[] { 3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"namaste",2,new Integer[] { 5,3 },new String[] { "namaste","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","hej","hei","namaste","hello" },new Integer[] { 5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"salaam",2,new Integer[] { 5,3 },new String[] { "salaam","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","hej","hei","namaste","hello" },new Integer[] { 5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"salaam",2,new Integer[] { 5,3 },new String[] { "salaam","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","hej","hei","namaste","hello" },new Integer[] { 5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"ciao",2,new Integer[] { 2,5 },new String[] { "ciao","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","hej","hei","namaste","hello" },new Integer[] { 2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"salaam",2,new Integer[] { 1,2 },new String[] { "salaam","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","hej","hei","salaam","hello" },new Integer[] { 1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"hello",2,new Integer[] { 6,1 },new String[] { "hello","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","hej","hei","salaam","hello" },new Integer[] { 6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"ciao",2,new Integer[] { 2,6 },new String[] { "ciao","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","hej","hei","salaam","hello" },new Integer[] { 2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"ciao",2,new Integer[] { 2,6 },new String[] { "ciao","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","hej","hei","salaam","hello" },new Integer[] { 2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"salaam",2,new Integer[] { 5,2 },new String[] { "salaam","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","hej","hei","salaam","hello" },new Integer[] { 5,2 }) ;
      return ok_sofar ;
  }


  static boolean test_29 ()
  {
      
      testName = "test_29" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hi","zdravo","dobry den","namaste","hallo","kaixo","hej","bon dia","ola","salaam","hola","ciao" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"bon dia",4,new Integer[] { 6 },new String[] { "bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hi","zdravo","dobry den","namaste","hallo","kaixo","hej","bon dia","ola","salaam","hola","ciao" },new Integer[] { 6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"privet",4,new Integer[] { 9,6 },new String[] { "privet","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hi","zdravo","dobry den","namaste","hallo","kaixo","hej","bon dia","ola","salaam","hola","ciao" },new Integer[] { 9,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"hi",4,new Integer[] { 4,9,6 },new String[] { "hi","privet","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hi","zdravo","dobry den","namaste","hallo","kaixo","hej","bon dia","ola","salaam","hola","ciao" },new Integer[] { 4,9,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"bon dia",4,new Integer[] { 8,4,9,6 },new String[] { "bon dia","hi","privet","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hi","zdravo","dobry den","namaste","hallo","kaixo","hej","bon dia","ola","salaam","hola","ciao" },new Integer[] { 8,4,9,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"dobry den",4,new Integer[] { 3,8,4,9 },new String[] { "dobry den","bon dia","hi","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hi","zdravo","dobry den","namaste","hallo","bon dia","hej","bon dia","ola","salaam","hola","ciao" },new Integer[] { 3,8,4,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"kaixo",4,new Integer[] { 3,8,4,9 },new String[] { "dobry den","bon dia","kaixo","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hi","zdravo","dobry den","namaste","hallo","bon dia","hej","bon dia","ola","salaam","hola","ciao" },new Integer[] { 4,3,8,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"hi",4,new Integer[] { 1,3,8,4 },new String[] { "hi","dobry den","bon dia","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hi","zdravo","dobry den","namaste","hallo","bon dia","hej","bon dia","privet","salaam","hola","ciao" },new Integer[] { 1,4,3,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"privet",4,new Integer[] { 9,1,3,4 },new String[] { "privet","hi","dobry den","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hi","zdravo","dobry den","namaste","hallo","bon dia","hej","bon dia","privet","salaam","hola","ciao" },new Integer[] { 9,1,4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(12,"hej",4,new Integer[] { 12,9,1,4 },new String[] { "hej","privet","hi","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hi","zdravo","dobry den","namaste","hallo","bon dia","hej","bon dia","privet","salaam","hola","ciao" },new Integer[] { 12,9,1,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"bon dia",4,new Integer[] { 3,12,9,1 },new String[] { "bon dia","hej","privet","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hi","zdravo","dobry den","kaixo","hallo","bon dia","hej","bon dia","privet","salaam","hola","ciao" },new Integer[] { 3,12,9,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"hello",4,new Integer[] { 8,3,12,9 },new String[] { "hello","bon dia","hej","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hi","zdravo","dobry den","kaixo","hallo","bon dia","hej","bon dia","privet","salaam","hola","ciao" },new Integer[] { 8,3,12,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(12,"privet",4,new Integer[] { 8,3,12,9 },new String[] { "hello","bon dia","privet","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hi","zdravo","dobry den","kaixo","hallo","bon dia","hej","bon dia","privet","salaam","hola","ciao" },new Integer[] { 12,8,3,9 }) ;
      return ok_sofar ;
  }


  static boolean test_30 ()
  {
      
      testName = "test_30" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "privet","hi","rimaykullayki","hej","namaste","zdravo","kaixo","dobry den","hallo","salaam","hello","bon dia" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"zdravo",4,new Integer[] { 6 },new String[] { "zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "privet","hi","rimaykullayki","hej","namaste","zdravo","kaixo","dobry den","hallo","salaam","hello","bon dia" },new Integer[] { 6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"namaste",4,new Integer[] { 5,6 },new String[] { "namaste","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "privet","hi","rimaykullayki","hej","namaste","zdravo","kaixo","dobry den","hallo","salaam","hello","bon dia" },new Integer[] { 5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"namaste",4,new Integer[] { 1,5,6 },new String[] { "namaste","namaste","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "privet","hi","rimaykullayki","hej","namaste","zdravo","kaixo","dobry den","hallo","salaam","hello","bon dia" },new Integer[] { 1,5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"hello",4,new Integer[] { 3,1,5,6 },new String[] { "hello","namaste","namaste","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "privet","hi","rimaykullayki","hej","namaste","zdravo","kaixo","dobry den","hallo","salaam","hello","bon dia" },new Integer[] { 3,1,5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"hej",4,new Integer[] { 9,3,1,5 },new String[] { "hej","hello","namaste","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "privet","hi","rimaykullayki","hej","namaste","zdravo","kaixo","dobry den","hallo","salaam","hello","bon dia" },new Integer[] { 9,3,1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(10,"hej",4,new Integer[] { 10,9,3,1 },new String[] { "hej","hej","hello","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "privet","hi","rimaykullayki","hej","namaste","zdravo","kaixo","dobry den","hallo","salaam","hello","bon dia" },new Integer[] { 10,9,3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"kaixo",4,new Integer[] { 7,10,9,3 },new String[] { "kaixo","hej","hej","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","hi","rimaykullayki","hej","namaste","zdravo","kaixo","dobry den","hallo","salaam","hello","bon dia" },new Integer[] { 7,10,9,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"hej",4,new Integer[] { 7,10,9,3 },new String[] { "kaixo","hej","hej","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","hi","rimaykullayki","hej","namaste","zdravo","kaixo","dobry den","hallo","salaam","hello","bon dia" },new Integer[] { 9,7,10,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"hello",4,new Integer[] { 7,10,9,3 },new String[] { "kaixo","hej","hello","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","hi","rimaykullayki","hej","namaste","zdravo","kaixo","dobry den","hallo","salaam","hello","bon dia" },new Integer[] { 9,7,10,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"namaste",4,new Integer[] { 5,7,10,9 },new String[] { "namaste","kaixo","hej","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","hi","hello","hej","namaste","zdravo","kaixo","dobry den","hallo","salaam","hello","bon dia" },new Integer[] { 5,9,7,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"ola",4,new Integer[] { 6,5,7,9 },new String[] { "ola","namaste","kaixo","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","hi","hello","hej","namaste","zdravo","kaixo","dobry den","hallo","hej","hello","bon dia" },new Integer[] { 6,5,9,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(10,"namaste",4,new Integer[] { 10,6,5,9 },new String[] { "namaste","ola","namaste","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","hi","hello","hej","namaste","zdravo","kaixo","dobry den","hallo","hej","hello","bon dia" },new Integer[] { 10,6,5,9 }) ;
      return ok_sofar ;
  }


  static boolean test_31 ()
  {
      
      testName = "test_31" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","privet","hola","hej","ola","hallo" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"hi",2,new Integer[] { 1 },new String[] { "hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","privet","hola","hej","ola","hallo" },new Integer[] { 1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"privet",2,new Integer[] { 2,1 },new String[] { "privet","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","privet","hola","hej","ola","hallo" },new Integer[] { 2,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"hej",2,new Integer[] { 4,2 },new String[] { "hej","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","privet","hola","hej","ola","hallo" },new Integer[] { 4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"hi",2,new Integer[] { 1,4 },new String[] { "hi","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","privet","hola","hej","ola","hallo" },new Integer[] { 1,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"hei",2,new Integer[] { 3,1 },new String[] { "hei","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","privet","hola","hej","ola","hallo" },new Integer[] { 3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"hallo",2,new Integer[] { 6,3 },new String[] { "hallo","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","privet","hola","hej","ola","hallo" },new Integer[] { 6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"hej",2,new Integer[] { 4,6 },new String[] { "hej","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","privet","hei","hej","ola","hallo" },new Integer[] { 4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"ola",2,new Integer[] { 5,4 },new String[] { "ola","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","privet","hei","hej","ola","hallo" },new Integer[] { 5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"hi",2,new Integer[] { 5,4 },new String[] { "ola","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","privet","hei","hej","ola","hallo" },new Integer[] { 4,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"bon dia",2,new Integer[] { 6,4 },new String[] { "bon dia","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","privet","hei","hej","ola","hallo" },new Integer[] { 6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"privet",2,new Integer[] { 2,6 },new String[] { "privet","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","privet","hei","hi","ola","hallo" },new Integer[] { 2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"ola",2,new Integer[] { 5,2 },new String[] { "ola","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","privet","hei","hi","ola","bon dia" },new Integer[] { 5,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"privet",2,new Integer[] { 5,2 },new String[] { "ola","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","privet","hei","hi","ola","bon dia" },new Integer[] { 2,5 }) ;
      return ok_sofar ;
  }


  static boolean test_32 ()
  {
      
      testName = "test_32" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hallo","salaam","dobry den","zdravo","namaste","ciao","hi","bon dia","rimaykullayki","kaixo","hej" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hallo",4,new Integer[] { 2 },new String[] { "hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hallo","salaam","dobry den","zdravo","namaste","ciao","hi","bon dia","rimaykullayki","kaixo","hej" },new Integer[] { 2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"kaixo",4,new Integer[] { 1,2 },new String[] { "kaixo","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hallo","salaam","dobry den","zdravo","namaste","ciao","hi","bon dia","rimaykullayki","kaixo","hej" },new Integer[] { 1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"zdravo",4,new Integer[] { 5,1,2 },new String[] { "zdravo","kaixo","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hallo","salaam","dobry den","zdravo","namaste","ciao","hi","bon dia","rimaykullayki","kaixo","hej" },new Integer[] { 5,1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"zdravo",4,new Integer[] { 4,5,1,2 },new String[] { "zdravo","zdravo","kaixo","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hallo","salaam","dobry den","zdravo","namaste","ciao","hi","bon dia","rimaykullayki","kaixo","hej" },new Integer[] { 4,5,1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"hi",4,new Integer[] { 8,4,5,1 },new String[] { "hi","zdravo","zdravo","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hallo","salaam","dobry den","zdravo","namaste","ciao","hi","bon dia","rimaykullayki","kaixo","hej" },new Integer[] { 8,4,5,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(10,"hej",4,new Integer[] { 10,8,4,5 },new String[] { "hej","hi","zdravo","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","hallo","salaam","dobry den","zdravo","namaste","ciao","hi","bon dia","rimaykullayki","kaixo","hej" },new Integer[] { 10,8,4,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"namaste",4,new Integer[] { 6,10,8,4 },new String[] { "namaste","hej","hi","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","hallo","salaam","dobry den","zdravo","namaste","ciao","hi","bon dia","rimaykullayki","kaixo","hej" },new Integer[] { 6,10,8,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"rimaykullayki",4,new Integer[] { 6,10,8,4 },new String[] { "namaste","hej","hi","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","hallo","salaam","dobry den","zdravo","namaste","ciao","hi","bon dia","rimaykullayki","kaixo","hej" },new Integer[] { 4,6,10,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"zdravo",4,new Integer[] { 5,6,10,4 },new String[] { "zdravo","namaste","hej","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","hallo","salaam","dobry den","zdravo","namaste","ciao","hi","bon dia","rimaykullayki","kaixo","hej" },new Integer[] { 5,4,6,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"kaixo",4,new Integer[] { 1,5,6,4 },new String[] { "kaixo","zdravo","namaste","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","hallo","salaam","dobry den","zdravo","namaste","ciao","hi","bon dia","hej","kaixo","hej" },new Integer[] { 1,5,4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"bon dia",4,new Integer[] { 9,1,5,4 },new String[] { "bon dia","kaixo","zdravo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","hallo","salaam","dobry den","zdravo","namaste","ciao","hi","bon dia","hej","kaixo","hej" },new Integer[] { 9,1,5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"ciao",4,new Integer[] { 7,9,1,5 },new String[] { "ciao","bon dia","kaixo","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","hallo","salaam","rimaykullayki","zdravo","namaste","ciao","hi","bon dia","hej","kaixo","hej" },new Integer[] { 7,9,1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"kaixo",4,new Integer[] { 7,9,1,5 },new String[] { "ciao","bon dia","kaixo","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","hallo","salaam","rimaykullayki","zdravo","namaste","ciao","hi","bon dia","hej","kaixo","hej" },new Integer[] { 1,7,9,5 }) ;
      return ok_sofar ;
  }


  static boolean test_33 ()
  {
      
      testName = "test_33" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(3,new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","privet","hola","zdravo","salaam","ciao","hei","namaste","ola" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"zdravo",3,new Integer[] { 4 },new String[] { "zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","privet","hola","zdravo","salaam","ciao","hei","namaste","ola" },new Integer[] { 4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"hi",3,new Integer[] { 8,4 },new String[] { "hi","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","privet","hola","zdravo","salaam","ciao","hei","namaste","ola" },new Integer[] { 8,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"kaixo",3,new Integer[] { 9,8,4 },new String[] { "kaixo","hi","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","privet","hola","zdravo","salaam","ciao","hei","namaste","ola" },new Integer[] { 9,8,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"privet",3,new Integer[] { 3,9,8 },new String[] { "privet","kaixo","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","privet","hola","zdravo","salaam","ciao","hei","namaste","ola" },new Integer[] { 3,9,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(7,"kaixo",3,new Integer[] { 7,3,9 },new String[] { "kaixo","privet","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","privet","hola","zdravo","salaam","ciao","hei","hi","ola" },new Integer[] { 7,3,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"privet",3,new Integer[] { 2,7,3 },new String[] { "privet","kaixo","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","privet","hola","zdravo","salaam","ciao","hei","hi","kaixo" },new Integer[] { 2,7,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"ola",3,new Integer[] { 2,7,3 },new String[] { "privet","kaixo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","privet","hola","zdravo","salaam","ciao","hei","hi","kaixo" },new Integer[] { 3,2,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"hi",3,new Integer[] { 1,2,3 },new String[] { "hi","privet","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","privet","hola","zdravo","salaam","ciao","kaixo","hi","kaixo" },new Integer[] { 1,3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"kaixo",3,new Integer[] { 7,1,3 },new String[] { "kaixo","hi","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","privet","hola","zdravo","salaam","ciao","kaixo","hi","kaixo" },new Integer[] { 7,1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"hei",3,new Integer[] { 7,1,3 },new String[] { "kaixo","hei","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","privet","hola","zdravo","salaam","ciao","kaixo","hi","kaixo" },new Integer[] { 1,7,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"hi",3,new Integer[] { 8,7,1 },new String[] { "hi","kaixo","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","privet","ola","zdravo","salaam","ciao","kaixo","hi","kaixo" },new Integer[] { 8,1,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"ola",3,new Integer[] { 3,8,1 },new String[] { "ola","hi","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","privet","ola","zdravo","salaam","ciao","kaixo","hi","kaixo" },new Integer[] { 3,8,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"zdravo",3,new Integer[] { 4,3,8 },new String[] { "zdravo","ola","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hei","privet","ola","zdravo","salaam","ciao","kaixo","hi","kaixo" },new Integer[] { 4,3,8 }) ;
      return ok_sofar ;
  }


  static boolean test_34 ()
  {
      
      testName = "test_34" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(3,new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "bon dia","kaixo","hallo","zdravo","rimaykullayki","hei","hej","dobry den","ciao" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"hi",3,new Integer[] { 8 },new String[] { "hi" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "bon dia","kaixo","hallo","zdravo","rimaykullayki","hei","hej","dobry den","ciao" },new Integer[] { 8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"ciao",3,new Integer[] { 9,8 },new String[] { "ciao","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "bon dia","kaixo","hallo","zdravo","rimaykullayki","hei","hej","dobry den","ciao" },new Integer[] { 9,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"ola",3,new Integer[] { 4,9,8 },new String[] { "ola","ciao","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "bon dia","kaixo","hallo","zdravo","rimaykullayki","hei","hej","dobry den","ciao" },new Integer[] { 4,9,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"hi",3,new Integer[] { 2,4,9 },new String[] { "hi","ola","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "bon dia","kaixo","hallo","zdravo","rimaykullayki","hei","hej","hi","ciao" },new Integer[] { 2,4,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"ola",3,new Integer[] { 2,4,9 },new String[] { "hi","ola","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "bon dia","kaixo","hallo","zdravo","rimaykullayki","hei","hej","hi","ciao" },new Integer[] { 4,2,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"hallo",3,new Integer[] { 2,4,9 },new String[] { "hi","ola","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "bon dia","kaixo","hallo","zdravo","rimaykullayki","hei","hej","hi","ciao" },new Integer[] { 9,4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"privet",3,new Integer[] { 1,4,9 },new String[] { "privet","ola","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "bon dia","hi","hallo","zdravo","rimaykullayki","hei","hej","hi","ciao" },new Integer[] { 1,9,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"hallo",3,new Integer[] { 1,4,9 },new String[] { "privet","ola","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "bon dia","hi","hallo","zdravo","rimaykullayki","hei","hej","hi","ciao" },new Integer[] { 9,1,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"salaam",3,new Integer[] { 6,1,9 },new String[] { "salaam","privet","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "bon dia","hi","hallo","ola","rimaykullayki","hei","hej","hi","ciao" },new Integer[] { 6,9,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"hallo",3,new Integer[] { 3,6,9 },new String[] { "hallo","salaam","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "privet","hi","hallo","ola","rimaykullayki","hei","hej","hi","ciao" },new Integer[] { 3,6,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"rimaykullayki",3,new Integer[] { 5,3,6 },new String[] { "rimaykullayki","hallo","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "privet","hi","hallo","ola","rimaykullayki","hei","hej","hi","hallo" },new Integer[] { 5,3,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(7,"hola",3,new Integer[] { 7,5,3 },new String[] { "hola","rimaykullayki","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "privet","hi","hallo","ola","rimaykullayki","salaam","hej","hi","hallo" },new Integer[] { 7,5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"rimaykullayki",3,new Integer[] { 7,5,3 },new String[] { "hola","rimaykullayki","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "privet","hi","hallo","ola","rimaykullayki","salaam","hej","hi","hallo" },new Integer[] { 5,7,3 }) ;
      return ok_sofar ;
  }


  static boolean test_35 ()
  {
      
      testName = "test_35" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","ciao","rimaykullayki","hello","kaixo","hola" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"hello",2,new Integer[] { 4 },new String[] { "hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","ciao","rimaykullayki","hello","kaixo","hola" },new Integer[] { 4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"hola",2,new Integer[] { 6,4 },new String[] { "hola","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","ciao","rimaykullayki","hello","kaixo","hola" },new Integer[] { 6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"hi",2,new Integer[] { 2,6 },new String[] { "hi","hola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","ciao","rimaykullayki","hello","kaixo","hola" },new Integer[] { 2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"bon dia",2,new Integer[] { 3,2 },new String[] { "bon dia","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","ciao","rimaykullayki","hello","kaixo","hola" },new Integer[] { 3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"kaixo",2,new Integer[] { 5,3 },new String[] { "kaixo","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hi","rimaykullayki","hello","kaixo","hola" },new Integer[] { 5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"ola",2,new Integer[] { 1,5 },new String[] { "ola","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hi","bon dia","hello","kaixo","hola" },new Integer[] { 1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"bon dia",2,new Integer[] { 3,1 },new String[] { "bon dia","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hi","bon dia","hello","kaixo","hola" },new Integer[] { 3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"kaixo",2,new Integer[] { 5,3 },new String[] { "kaixo","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hi","bon dia","hello","kaixo","hola" },new Integer[] { 5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"hola",2,new Integer[] { 6,5 },new String[] { "hola","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hi","bon dia","hello","kaixo","hola" },new Integer[] { 6,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hi",2,new Integer[] { 2,6 },new String[] { "hi","hola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hi","bon dia","hello","kaixo","hola" },new Integer[] { 2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"rimaykullayki",2,new Integer[] { 5,2 },new String[] { "rimaykullayki","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hi","bon dia","hello","kaixo","hola" },new Integer[] { 5,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"rimaykullayki",2,new Integer[] { 5,2 },new String[] { "rimaykullayki","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hi","bon dia","hello","kaixo","hola" },new Integer[] { 5,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"kaixo",2,new Integer[] { 6,5 },new String[] { "kaixo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hi","bon dia","hello","kaixo","hola" },new Integer[] { 6,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"bon dia",2,new Integer[] { 3,6 },new String[] { "bon dia","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hi","bon dia","hello","rimaykullayki","hola" },new Integer[] { 3,6 }) ;
      return ok_sofar ;
  }


  static boolean test_36 ()
  {
      
      testName = "test_36" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(5,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "dobry den","ola","kaixo","hallo","namaste","hei","ciao","hello","salaam","zdravo","hola","rimaykullayki","privet","bon dia","hi" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"hello",5,new Integer[] { 8 },new String[] { "hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "dobry den","ola","kaixo","hallo","namaste","hei","ciao","hello","salaam","zdravo","hola","rimaykullayki","privet","bon dia","hi" },new Integer[] { 8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"hei",5,new Integer[] { 6,8 },new String[] { "hei","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "dobry den","ola","kaixo","hallo","namaste","hei","ciao","hello","salaam","zdravo","hola","rimaykullayki","privet","bon dia","hi" },new Integer[] { 6,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(12,"rimaykullayki",5,new Integer[] { 12,6,8 },new String[] { "rimaykullayki","hei","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "dobry den","ola","kaixo","hallo","namaste","hei","ciao","hello","salaam","zdravo","hola","rimaykullayki","privet","bon dia","hi" },new Integer[] { 12,6,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"ola",5,new Integer[] { 2,12,6,8 },new String[] { "ola","rimaykullayki","hei","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "dobry den","ola","kaixo","hallo","namaste","hei","ciao","hello","salaam","zdravo","hola","rimaykullayki","privet","bon dia","hi" },new Integer[] { 2,12,6,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(13,"ciao",5,new Integer[] { 13,2,12,6,8 },new String[] { "ciao","ola","rimaykullayki","hei","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "dobry den","ola","kaixo","hallo","namaste","hei","ciao","hello","salaam","zdravo","hola","rimaykullayki","privet","bon dia","hi" },new Integer[] { 13,2,12,6,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(12,"rimaykullayki",5,new Integer[] { 13,2,12,6,8 },new String[] { "ciao","ola","rimaykullayki","hei","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "dobry den","ola","kaixo","hallo","namaste","hei","ciao","hello","salaam","zdravo","hola","rimaykullayki","privet","bon dia","hi" },new Integer[] { 12,13,2,6,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(15,"hi",5,new Integer[] { 15,13,2,12,6 },new String[] { "hi","ciao","ola","rimaykullayki","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "dobry den","ola","kaixo","hallo","namaste","hei","ciao","hello","salaam","zdravo","hola","rimaykullayki","privet","bon dia","hi" },new Integer[] { 15,12,13,2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(12,"privet",5,new Integer[] { 15,13,2,12,6 },new String[] { "hi","ciao","ola","privet","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "dobry den","ola","kaixo","hallo","namaste","hei","ciao","hello","salaam","zdravo","hola","rimaykullayki","privet","bon dia","hi" },new Integer[] { 12,15,13,2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"hei",5,new Integer[] { 5,15,13,2,12 },new String[] { "hei","hi","ciao","ola","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "dobry den","ola","kaixo","hallo","namaste","hei","ciao","hello","salaam","zdravo","hola","rimaykullayki","privet","bon dia","hi" },new Integer[] { 5,12,15,13,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"zdravo",5,new Integer[] { 5,15,13,2,12 },new String[] { "hei","hi","ciao","zdravo","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "dobry den","ola","kaixo","hallo","namaste","hei","ciao","hello","salaam","zdravo","hola","rimaykullayki","privet","bon dia","hi" },new Integer[] { 2,5,12,15,13 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(10,"zdravo",5,new Integer[] { 10,5,15,2,12 },new String[] { "zdravo","hei","hi","zdravo","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "dobry den","ola","kaixo","hallo","namaste","hei","ciao","hello","salaam","zdravo","hola","rimaykullayki","ciao","bon dia","hi" },new Integer[] { 10,2,5,12,15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"hej",5,new Integer[] { 1,10,5,2,12 },new String[] { "hej","zdravo","hei","zdravo","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "dobry den","ola","kaixo","hallo","namaste","hei","ciao","hello","salaam","zdravo","hola","rimaykullayki","ciao","bon dia","hi" },new Integer[] { 1,10,2,5,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"salaam",5,new Integer[] { 9,1,10,5,2 },new String[] { "salaam","hej","zdravo","hei","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "dobry den","ola","kaixo","hallo","namaste","hei","ciao","hello","salaam","zdravo","hola","privet","ciao","bon dia","hi" },new Integer[] { 9,1,10,2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"salaam",5,new Integer[] { 9,1,10,5,2 },new String[] { "salaam","salaam","zdravo","hei","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "dobry den","ola","kaixo","hallo","namaste","hei","ciao","hello","salaam","zdravo","hola","privet","ciao","bon dia","hi" },new Integer[] { 1,9,10,2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(14,"bon dia",5,new Integer[] { 14,9,1,10,2 },new String[] { "bon dia","salaam","salaam","zdravo","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "dobry den","ola","kaixo","hallo","hei","hei","ciao","hello","salaam","zdravo","hola","privet","ciao","bon dia","hi" },new Integer[] { 14,1,9,10,2 }) ;
      return ok_sofar ;
  }


  static boolean test_37 ()
  {
      
      testName = "test_37" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","zdravo","kaixo","hej","dobry den","privet","salaam","rimaykullayki","hola","ciao","hei" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"ola",4,new Integer[] { 8 },new String[] { "ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","zdravo","kaixo","hej","dobry den","privet","salaam","rimaykullayki","hola","ciao","hei" },new Integer[] { 8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"hej",4,new Integer[] { 5,8 },new String[] { "hej","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","zdravo","kaixo","hej","dobry den","privet","salaam","rimaykullayki","hola","ciao","hei" },new Integer[] { 5,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"kaixo",4,new Integer[] { 4,5,8 },new String[] { "kaixo","hej","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","zdravo","kaixo","hej","dobry den","privet","salaam","rimaykullayki","hola","ciao","hei" },new Integer[] { 4,5,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(10,"hola",4,new Integer[] { 10,4,5,8 },new String[] { "hola","kaixo","hej","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","zdravo","kaixo","hej","dobry den","privet","salaam","rimaykullayki","hola","ciao","hei" },new Integer[] { 10,4,5,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(10,"zdravo",4,new Integer[] { 10,4,5,8 },new String[] { "zdravo","kaixo","hej","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","zdravo","kaixo","hej","dobry den","privet","salaam","rimaykullayki","hola","ciao","hei" },new Integer[] { 10,4,5,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(11,"ciao",4,new Integer[] { 11,10,4,5 },new String[] { "ciao","zdravo","kaixo","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","zdravo","kaixo","hej","dobry den","privet","ola","rimaykullayki","hola","ciao","hei" },new Integer[] { 11,10,4,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(7,"bon dia",4,new Integer[] { 7,11,10,4 },new String[] { "bon dia","ciao","zdravo","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","zdravo","kaixo","hej","dobry den","privet","ola","rimaykullayki","hola","ciao","hei" },new Integer[] { 7,11,10,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"kaixo",4,new Integer[] { 7,11,10,4 },new String[] { "bon dia","ciao","zdravo","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","zdravo","kaixo","hej","dobry den","privet","ola","rimaykullayki","hola","ciao","hei" },new Integer[] { 4,7,11,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"namaste",4,new Integer[] { 5,7,11,4 },new String[] { "namaste","bon dia","ciao","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","zdravo","kaixo","hej","dobry den","privet","ola","rimaykullayki","zdravo","ciao","hei" },new Integer[] { 5,4,7,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(7,"ola",4,new Integer[] { 5,7,11,4 },new String[] { "namaste","ola","ciao","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","zdravo","kaixo","hej","dobry den","privet","ola","rimaykullayki","zdravo","ciao","hei" },new Integer[] { 7,5,4,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(10,"hola",4,new Integer[] { 10,5,7,4 },new String[] { "hola","namaste","ola","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","zdravo","kaixo","hej","dobry den","privet","ola","rimaykullayki","zdravo","ciao","hei" },new Integer[] { 10,7,5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"rimaykullayki",4,new Integer[] { 9,10,5,7 },new String[] { "rimaykullayki","hola","namaste","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","zdravo","kaixo","hej","dobry den","privet","ola","rimaykullayki","zdravo","ciao","hei" },new Integer[] { 9,10,7,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"zdravo",4,new Integer[] { 3,9,10,7 },new String[] { "zdravo","rimaykullayki","hola","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","zdravo","kaixo","namaste","dobry den","privet","ola","rimaykullayki","zdravo","ciao","hei" },new Integer[] { 3,9,10,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"zdravo",4,new Integer[] { 3,9,10,7 },new String[] { "zdravo","rimaykullayki","hola","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","zdravo","kaixo","namaste","dobry den","privet","ola","rimaykullayki","zdravo","ciao","hei" },new Integer[] { 3,9,10,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"rimaykullayki",4,new Integer[] { 3,9,10,7 },new String[] { "zdravo","rimaykullayki","hola","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","zdravo","kaixo","namaste","dobry den","privet","ola","rimaykullayki","zdravo","ciao","hei" },new Integer[] { 9,3,10,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"kaixo",4,new Integer[] { 3,9,10,7 },new String[] { "kaixo","rimaykullayki","hola","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","zdravo","kaixo","namaste","dobry den","privet","ola","rimaykullayki","zdravo","ciao","hei" },new Integer[] { 3,9,10,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"hej",4,new Integer[] { 6,3,9,10 },new String[] { "hej","kaixo","rimaykullayki","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","zdravo","kaixo","namaste","dobry den","ola","ola","rimaykullayki","zdravo","ciao","hei" },new Integer[] { 6,3,9,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"hello",4,new Integer[] { 1,6,3,9 },new String[] { "hello","hej","kaixo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","zdravo","kaixo","namaste","dobry den","ola","ola","rimaykullayki","hola","ciao","hei" },new Integer[] { 1,6,3,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"ola",4,new Integer[] { 8,1,6,3 },new String[] { "ola","hello","hej","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","zdravo","kaixo","namaste","dobry den","ola","ola","rimaykullayki","hola","ciao","hei" },new Integer[] { 8,1,6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(10,"hola",4,new Integer[] { 10,8,1,6 },new String[] { "hola","ola","hello","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","kaixo","kaixo","namaste","dobry den","ola","ola","rimaykullayki","hola","ciao","hei" },new Integer[] { 10,8,1,6 }) ;
      return ok_sofar ;
  }


  static boolean test_38 ()
  {
      
      testName = "test_38" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(3,new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","bon dia","hi","hei","dobry den","zdravo","namaste","hola" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"namaste",3,new Integer[] { 8 },new String[] { "namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","bon dia","hi","hei","dobry den","zdravo","namaste","hola" },new Integer[] { 8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"namaste",3,new Integer[] { 8 },new String[] { "namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","bon dia","hi","hei","dobry den","zdravo","namaste","hola" },new Integer[] { 8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"hi",3,new Integer[] { 4,8 },new String[] { "hi","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","bon dia","hi","hei","dobry den","zdravo","namaste","hola" },new Integer[] { 4,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"hej",3,new Integer[] { 4,8 },new String[] { "hi","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","bon dia","hi","hei","dobry den","zdravo","namaste","hola" },new Integer[] { 8,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"bon dia",3,new Integer[] { 6,4,8 },new String[] { "bon dia","hi","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","bon dia","hi","hei","dobry den","zdravo","namaste","hola" },new Integer[] { 6,8,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"bon dia",3,new Integer[] { 3,6,8 },new String[] { "bon dia","bon dia","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","bon dia","hi","hei","dobry den","zdravo","namaste","hola" },new Integer[] { 3,6,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"privet",3,new Integer[] { 4,3,6 },new String[] { "privet","bon dia","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","bon dia","hi","hei","dobry den","zdravo","hej","hola" },new Integer[] { 4,3,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"zdravo",3,new Integer[] { 7,4,3 },new String[] { "zdravo","privet","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","bon dia","hi","hei","bon dia","zdravo","hej","hola" },new Integer[] { 7,4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hallo",3,new Integer[] { 2,7,4 },new String[] { "hallo","zdravo","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","bon dia","hi","hei","bon dia","zdravo","hej","hola" },new Integer[] { 2,7,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"privet",3,new Integer[] { 3,2,7 },new String[] { "privet","hallo","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","bon dia","privet","hei","bon dia","zdravo","hej","hola" },new Integer[] { 3,2,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"dobry den",3,new Integer[] { 1,3,2 },new String[] { "dobry den","privet","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","bon dia","privet","hei","bon dia","zdravo","hej","hola" },new Integer[] { 1,3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"hello",3,new Integer[] { 4,1,3 },new String[] { "hello","dobry den","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","bon dia","privet","hei","bon dia","zdravo","hej","hola" },new Integer[] { 4,1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"hello",3,new Integer[] { 4,1,3 },new String[] { "hello","dobry den","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","bon dia","privet","hei","bon dia","zdravo","hej","hola" },new Integer[] { 4,1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"zdravo",3,new Integer[] { 7,4,1 },new String[] { "zdravo","hello","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","privet","privet","hei","bon dia","zdravo","hej","hola" },new Integer[] { 7,4,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hallo",3,new Integer[] { 2,7,4 },new String[] { "hallo","zdravo","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","hallo","privet","privet","hei","bon dia","zdravo","hej","hola" },new Integer[] { 2,7,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"hej",3,new Integer[] { 8,2,7 },new String[] { "hej","hallo","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","hallo","privet","hello","hei","bon dia","zdravo","hej","hola" },new Integer[] { 8,2,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"bon dia",3,new Integer[] { 6,8,2 },new String[] { "bon dia","hej","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","hallo","privet","hello","hei","bon dia","zdravo","hej","hola" },new Integer[] { 6,8,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"dobry den",3,new Integer[] { 1,6,8 },new String[] { "dobry den","bon dia","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","hallo","privet","hello","hei","bon dia","zdravo","hej","hola" },new Integer[] { 1,6,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hallo",3,new Integer[] { 2,1,6 },new String[] { "hallo","dobry den","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","hallo","privet","hello","hei","bon dia","zdravo","hej","hola" },new Integer[] { 2,1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hallo",3,new Integer[] { 2,1,6 },new String[] { "hallo","dobry den","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","hallo","privet","hello","hei","bon dia","zdravo","hej","hola" },new Integer[] { 2,1,6 }) ;
      return ok_sofar ;
  }


  static boolean test_39 ()
  {
      
      testName = "test_39" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hei","ola","ciao","hallo","hello","namaste","kaixo","zdravo","hej","privet","hi" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"hei",4,new Integer[] { 3 },new String[] { "hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hei","ola","ciao","hallo","hello","namaste","kaixo","zdravo","hej","privet","hi" },new Integer[] { 3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hei",4,new Integer[] { 2,3 },new String[] { "hei","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hei","ola","ciao","hallo","hello","namaste","kaixo","zdravo","hej","privet","hi" },new Integer[] { 2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hei",4,new Integer[] { 2,3 },new String[] { "hei","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hei","ola","ciao","hallo","hello","namaste","kaixo","zdravo","hej","privet","hi" },new Integer[] { 2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(12,"hi",4,new Integer[] { 12,2,3 },new String[] { "hi","hei","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hei","ola","ciao","hallo","hello","namaste","kaixo","zdravo","hej","privet","hi" },new Integer[] { 12,2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"namaste",4,new Integer[] { 1,12,2,3 },new String[] { "namaste","hi","hei","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hei","ola","ciao","hallo","hello","namaste","kaixo","zdravo","hej","privet","hi" },new Integer[] { 1,12,2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"hi",4,new Integer[] { 9,1,12,2 },new String[] { "hi","namaste","hi","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hei","hei","ciao","hallo","hello","namaste","kaixo","zdravo","hej","privet","hi" },new Integer[] { 9,1,12,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"hei",4,new Integer[] { 6,9,1,12 },new String[] { "hei","hi","namaste","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hei","hei","ciao","hallo","hello","namaste","kaixo","zdravo","hej","privet","hi" },new Integer[] { 6,9,1,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"zdravo",4,new Integer[] { 8,6,9,1 },new String[] { "zdravo","hei","hi","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hei","hei","ciao","hallo","hello","namaste","kaixo","zdravo","hej","privet","hi" },new Integer[] { 8,6,9,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"namaste",4,new Integer[] { 7,8,6,9 },new String[] { "namaste","zdravo","hei","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","hei","hei","ciao","hallo","hello","namaste","kaixo","zdravo","hej","privet","hi" },new Integer[] { 7,8,6,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"ciao",4,new Integer[] { 4,7,8,6 },new String[] { "ciao","namaste","zdravo","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","hei","hei","ciao","hallo","hello","namaste","kaixo","hi","hej","privet","hi" },new Integer[] { 4,7,8,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"ciao",4,new Integer[] { 4,7,8,6 },new String[] { "ciao","namaste","zdravo","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","hei","hei","ciao","hallo","hello","namaste","kaixo","hi","hej","privet","hi" },new Integer[] { 6,4,7,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(12,"salaam",4,new Integer[] { 12,4,7,6 },new String[] { "salaam","ciao","namaste","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","hei","hei","ciao","hallo","hello","namaste","zdravo","hi","hej","privet","hi" },new Integer[] { 12,6,4,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"salaam",4,new Integer[] { 1,12,4,6 },new String[] { "salaam","salaam","ciao","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","hei","hei","ciao","hallo","hello","namaste","zdravo","hi","hej","privet","hi" },new Integer[] { 1,12,6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(12,"hi",4,new Integer[] { 1,12,4,6 },new String[] { "salaam","hi","ciao","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","hei","hei","ciao","hallo","hello","namaste","zdravo","hi","hej","privet","hi" },new Integer[] { 12,1,6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"hei",4,new Integer[] { 3,1,12,6 },new String[] { "hei","salaam","hi","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","hei","hei","ciao","hallo","hello","namaste","zdravo","hi","hej","privet","hi" },new Integer[] { 3,12,1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(10,"hei",4,new Integer[] { 10,3,1,12 },new String[] { "hei","hei","salaam","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","hei","hei","ciao","hallo","ciao","namaste","zdravo","hi","hej","privet","hi" },new Integer[] { 10,3,12,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"salaam",4,new Integer[] { 10,3,1,12 },new String[] { "hei","hei","salaam","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","hei","hei","ciao","hallo","ciao","namaste","zdravo","hi","hej","privet","hi" },new Integer[] { 1,10,3,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hei",4,new Integer[] { 2,10,3,1 },new String[] { "hei","hei","hei","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","hei","hei","ciao","hallo","ciao","namaste","zdravo","hi","hej","privet","hi" },new Integer[] { 2,1,10,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"salaam",4,new Integer[] { 2,10,3,1 },new String[] { "hei","hei","hei","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","hei","hei","ciao","hallo","ciao","namaste","zdravo","hi","hej","privet","hi" },new Integer[] { 1,2,10,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"namaste",4,new Integer[] { 2,10,3,1 },new String[] { "hei","hei","namaste","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","hei","hei","ciao","hallo","ciao","namaste","zdravo","hi","hej","privet","hi" },new Integer[] { 3,1,2,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(11,"privet",4,new Integer[] { 11,2,3,1 },new String[] { "privet","hei","namaste","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","hei","hei","ciao","hallo","ciao","namaste","zdravo","hi","hei","privet","hi" },new Integer[] { 11,3,1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"dobry den",4,new Integer[] { 9,11,3,1 },new String[] { "dobry den","privet","namaste","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","hei","hei","ciao","hallo","ciao","namaste","zdravo","hi","hei","privet","hi" },new Integer[] { 9,11,3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"namaste",4,new Integer[] { 9,11,3,1 },new String[] { "dobry den","privet","namaste","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "namaste","hei","hei","ciao","hallo","ciao","namaste","zdravo","hi","hei","privet","hi" },new Integer[] { 3,9,11,1 }) ;
      return ok_sofar ;
  }


  static boolean test_40 ()
  {
      
      testName = "test_40" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","hello","ola","ciao","hei","hej","hallo","bon dia","hola","privet","zdravo","dobry den" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"hola",4,new Integer[] { 9 },new String[] { "hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","hello","ola","ciao","hei","hej","hallo","bon dia","hola","privet","zdravo","dobry den" },new Integer[] { 9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"zdravo",4,new Integer[] { 8,9 },new String[] { "zdravo","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","hello","ola","ciao","hei","hej","hallo","bon dia","hola","privet","zdravo","dobry den" },new Integer[] { 8,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"ciao",4,new Integer[] { 8,9 },new String[] { "ciao","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","hello","ola","ciao","hei","hej","hallo","bon dia","hola","privet","zdravo","dobry den" },new Integer[] { 8,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"bon dia",4,new Integer[] { 1,8,9 },new String[] { "bon dia","ciao","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","hello","ola","ciao","hei","hej","hallo","bon dia","hola","privet","zdravo","dobry den" },new Integer[] { 1,8,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(12,"dobry den",4,new Integer[] { 12,1,8,9 },new String[] { "dobry den","bon dia","ciao","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","hello","ola","ciao","hei","hej","hallo","bon dia","hola","privet","zdravo","dobry den" },new Integer[] { 12,1,8,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(12,"dobry den",4,new Integer[] { 12,1,8,9 },new String[] { "dobry den","bon dia","ciao","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","hello","ola","ciao","hei","hej","hallo","bon dia","hola","privet","zdravo","dobry den" },new Integer[] { 12,1,8,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"bon dia",4,new Integer[] { 6,12,1,8 },new String[] { "bon dia","dobry den","bon dia","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","hello","ola","ciao","hei","hej","hallo","bon dia","hola","privet","zdravo","dobry den" },new Integer[] { 6,12,1,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"ola",4,new Integer[] { 3,6,12,1 },new String[] { "ola","bon dia","dobry den","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","hello","ola","ciao","hei","hej","hallo","ciao","hola","privet","zdravo","dobry den" },new Integer[] { 3,6,12,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"hi",4,new Integer[] { 3,6,12,1 },new String[] { "hi","bon dia","dobry den","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","hello","ola","ciao","hei","hej","hallo","ciao","hola","privet","zdravo","dobry den" },new Integer[] { 3,6,12,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"hola",4,new Integer[] { 9,3,6,12 },new String[] { "hola","hi","bon dia","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hello","ola","ciao","hei","hej","hallo","ciao","hola","privet","zdravo","dobry den" },new Integer[] { 9,3,6,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"kaixo",4,new Integer[] { 4,9,3,6 },new String[] { "kaixo","hola","hi","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hello","ola","ciao","hei","hej","hallo","ciao","hola","privet","zdravo","dobry den" },new Integer[] { 4,9,3,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"hallo",4,new Integer[] { 7,4,9,3 },new String[] { "hallo","kaixo","hola","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hello","ola","ciao","hei","bon dia","hallo","ciao","hola","privet","zdravo","dobry den" },new Integer[] { 7,4,9,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"hallo",4,new Integer[] { 7,4,9,3 },new String[] { "hallo","kaixo","hola","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hello","ola","ciao","hei","bon dia","hallo","ciao","hola","privet","zdravo","dobry den" },new Integer[] { 7,4,9,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"hola",4,new Integer[] { 6,7,4,9 },new String[] { "hola","hallo","kaixo","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hello","hi","ciao","hei","bon dia","hallo","ciao","hola","privet","zdravo","dobry den" },new Integer[] { 6,7,4,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"zdravo",4,new Integer[] { 6,7,4,9 },new String[] { "hola","hallo","kaixo","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hello","hi","ciao","hei","bon dia","hallo","ciao","hola","privet","zdravo","dobry den" },new Integer[] { 9,6,7,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"rimaykullayki",4,new Integer[] { 6,7,4,9 },new String[] { "hola","hallo","kaixo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hello","hi","ciao","hei","bon dia","hallo","ciao","hola","privet","zdravo","dobry den" },new Integer[] { 9,6,7,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(11,"hei",4,new Integer[] { 11,6,7,9 },new String[] { "hei","hola","hallo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hello","hi","kaixo","hei","bon dia","hallo","ciao","hola","privet","zdravo","dobry den" },new Integer[] { 11,9,6,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"kaixo",4,new Integer[] { 4,11,6,9 },new String[] { "kaixo","hei","hola","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hello","hi","kaixo","hei","bon dia","hallo","ciao","hola","privet","zdravo","dobry den" },new Integer[] { 4,11,9,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"rimaykullayki",4,new Integer[] { 5,4,11,9 },new String[] { "rimaykullayki","kaixo","hei","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hello","hi","kaixo","hei","hola","hallo","ciao","hola","privet","zdravo","dobry den" },new Integer[] { 5,4,11,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(10,"privet",4,new Integer[] { 10,5,4,11 },new String[] { "privet","rimaykullayki","kaixo","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hello","hi","kaixo","hei","hola","hallo","ciao","rimaykullayki","privet","zdravo","dobry den" },new Integer[] { 10,5,4,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"rimaykullayki",4,new Integer[] { 10,5,4,11 },new String[] { "privet","rimaykullayki","kaixo","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hello","hi","kaixo","hei","hola","hallo","ciao","rimaykullayki","privet","zdravo","dobry den" },new Integer[] { 5,10,4,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hello",4,new Integer[] { 2,10,5,4 },new String[] { "hello","privet","rimaykullayki","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hello","hi","kaixo","hei","hola","hallo","ciao","rimaykullayki","privet","hei","dobry den" },new Integer[] { 2,5,10,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"bon dia",4,new Integer[] { 1,2,10,5 },new String[] { "bon dia","hello","privet","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hello","hi","kaixo","hei","hola","hallo","ciao","rimaykullayki","privet","hei","dobry den" },new Integer[] { 1,2,5,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(10,"privet",4,new Integer[] { 1,2,10,5 },new String[] { "bon dia","hello","privet","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hello","hi","kaixo","hei","hola","hallo","ciao","rimaykullayki","privet","hei","dobry den" },new Integer[] { 10,1,2,5 }) ;
      return ok_sofar ;
  }


  static boolean test_41 ()
  {
      
      testName = "test_41" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(3,new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","kaixo","ola","hallo","namaste","hei","bon dia","hi","ciao" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"hej",3,new Integer[] { 8 },new String[] { "hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","kaixo","ola","hallo","namaste","hei","bon dia","hi","ciao" },new Integer[] { 8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"zdravo",3,new Integer[] { 1,8 },new String[] { "zdravo","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","kaixo","ola","hallo","namaste","hei","bon dia","hi","ciao" },new Integer[] { 1,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"kaixo",3,new Integer[] { 3,1,8 },new String[] { "kaixo","zdravo","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","kaixo","ola","hallo","namaste","hei","bon dia","hi","ciao" },new Integer[] { 3,1,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"kaixo",3,new Integer[] { 3,1,8 },new String[] { "kaixo","zdravo","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","kaixo","ola","hallo","namaste","hei","bon dia","hi","ciao" },new Integer[] { 3,1,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"hei",3,new Integer[] { 6,3,1 },new String[] { "hei","kaixo","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","kaixo","ola","hallo","namaste","hei","bon dia","hej","ciao" },new Integer[] { 6,3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(7,"kaixo",3,new Integer[] { 7,6,3 },new String[] { "kaixo","hei","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","kaixo","ola","hallo","namaste","hei","bon dia","hej","ciao" },new Integer[] { 7,6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"zdravo",3,new Integer[] { 4,7,6 },new String[] { "zdravo","kaixo","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","kaixo","kaixo","hallo","namaste","hei","bon dia","hej","ciao" },new Integer[] { 4,7,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(7,"ola",3,new Integer[] { 4,7,6 },new String[] { "zdravo","ola","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","kaixo","kaixo","hallo","namaste","hei","bon dia","hej","ciao" },new Integer[] { 7,4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"hi",3,new Integer[] { 4,7,6 },new String[] { "zdravo","ola","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","kaixo","kaixo","hallo","namaste","hei","bon dia","hej","ciao" },new Integer[] { 6,7,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"ola",3,new Integer[] { 4,7,6 },new String[] { "zdravo","ola","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","kaixo","kaixo","hallo","namaste","hei","bon dia","hej","ciao" },new Integer[] { 7,6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"kaixo",3,new Integer[] { 3,7,6 },new String[] { "kaixo","ola","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","kaixo","kaixo","zdravo","namaste","hei","bon dia","hej","ciao" },new Integer[] { 3,7,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"zdravo",3,new Integer[] { 2,3,7 },new String[] { "zdravo","kaixo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","kaixo","kaixo","zdravo","namaste","hi","bon dia","hej","ciao" },new Integer[] { 2,3,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"hej",3,new Integer[] { 8,2,3 },new String[] { "hej","zdravo","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","kaixo","kaixo","zdravo","namaste","hi","ola","hej","ciao" },new Integer[] { 8,2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"privet",3,new Integer[] { 4,8,2 },new String[] { "privet","hej","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","kaixo","kaixo","zdravo","namaste","hi","ola","hej","ciao" },new Integer[] { 4,8,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"namaste",3,new Integer[] { 5,4,8 },new String[] { "namaste","privet","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","zdravo","kaixo","zdravo","namaste","hi","ola","hej","ciao" },new Integer[] { 5,4,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(7,"hallo",3,new Integer[] { 7,5,4 },new String[] { "hallo","namaste","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","zdravo","kaixo","zdravo","namaste","hi","ola","hej","ciao" },new Integer[] { 7,5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"kaixo",3,new Integer[] { 3,7,5 },new String[] { "kaixo","hallo","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","zdravo","kaixo","privet","namaste","hi","ola","hej","ciao" },new Integer[] { 3,7,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"hallo",3,new Integer[] { 3,7,5 },new String[] { "kaixo","hallo","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","zdravo","kaixo","privet","namaste","hi","ola","hej","ciao" },new Integer[] { 7,3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"hallo",3,new Integer[] { 8,3,7 },new String[] { "hallo","kaixo","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","zdravo","kaixo","privet","namaste","hi","ola","hej","ciao" },new Integer[] { 8,7,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"namaste",3,new Integer[] { 2,8,7 },new String[] { "namaste","hallo","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","zdravo","kaixo","privet","namaste","hi","ola","hej","ciao" },new Integer[] { 2,8,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"privet",3,new Integer[] { 4,2,8 },new String[] { "privet","namaste","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","zdravo","kaixo","privet","namaste","hi","hallo","hej","ciao" },new Integer[] { 4,2,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"hallo",3,new Integer[] { 4,2,8 },new String[] { "privet","namaste","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","zdravo","kaixo","privet","namaste","hi","hallo","hej","ciao" },new Integer[] { 8,4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(7,"hi",3,new Integer[] { 7,4,8 },new String[] { "hi","privet","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","namaste","kaixo","privet","namaste","hi","hallo","hej","ciao" },new Integer[] { 7,8,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"privet",3,new Integer[] { 7,4,8 },new String[] { "hi","privet","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","namaste","kaixo","privet","namaste","hi","hallo","hej","ciao" },new Integer[] { 4,7,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"hi",3,new Integer[] { 7,4,8 },new String[] { "hi","privet","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","namaste","kaixo","privet","namaste","hi","hallo","hej","ciao" },new Integer[] { 7,4,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"namaste",3,new Integer[] { 2,7,4 },new String[] { "namaste","hi","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "zdravo","namaste","kaixo","privet","namaste","hi","hallo","hallo","ciao" },new Integer[] { 2,7,4 }) ;
      return ok_sofar ;
  }


  static boolean test_42 ()
  {
      
      testName = "test_42" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hola","bon dia","ciao","zdravo","dobry den","privet","ola","hallo","hei","namaste","hello" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"privet",4,new Integer[] { 6 },new String[] { "privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hola","bon dia","ciao","zdravo","dobry den","privet","ola","hallo","hei","namaste","hello" },new Integer[] { 6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"privet",4,new Integer[] { 7,6 },new String[] { "privet","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hola","bon dia","ciao","zdravo","dobry den","privet","ola","hallo","hei","namaste","hello" },new Integer[] { 7,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"zdravo",4,new Integer[] { 5,7,6 },new String[] { "zdravo","privet","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hola","bon dia","ciao","zdravo","dobry den","privet","ola","hallo","hei","namaste","hello" },new Integer[] { 5,7,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"hej",4,new Integer[] { 2,5,7,6 },new String[] { "hej","zdravo","privet","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hola","bon dia","ciao","zdravo","dobry den","privet","ola","hallo","hei","namaste","hello" },new Integer[] { 2,5,7,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"hola",4,new Integer[] { 3,2,5,7 },new String[] { "hola","hej","zdravo","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hola","bon dia","ciao","zdravo","privet","privet","ola","hallo","hei","namaste","hello" },new Integer[] { 3,2,5,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"hej",4,new Integer[] { 4,3,2,5 },new String[] { "hej","hola","hej","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hola","bon dia","ciao","zdravo","privet","privet","ola","hallo","hei","namaste","hello" },new Integer[] { 4,3,2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"ciao",4,new Integer[] { 4,3,2,5 },new String[] { "hej","hola","ciao","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hola","bon dia","ciao","zdravo","privet","privet","ola","hallo","hei","namaste","hello" },new Integer[] { 2,4,3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"hi",4,new Integer[] { 4,3,2,5 },new String[] { "hej","hola","hi","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hola","bon dia","ciao","zdravo","privet","privet","ola","hallo","hei","namaste","hello" },new Integer[] { 2,4,3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"hola",4,new Integer[] { 4,3,2,5 },new String[] { "hej","hola","hi","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hola","bon dia","ciao","zdravo","privet","privet","ola","hallo","hei","namaste","hello" },new Integer[] { 3,2,4,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"hej",4,new Integer[] { 6,4,3,2 },new String[] { "hej","hej","hola","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hola","bon dia","ciao","zdravo","privet","privet","ola","hallo","hei","namaste","hello" },new Integer[] { 6,3,2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"ola",4,new Integer[] { 8,6,3,2 },new String[] { "ola","hej","hola","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hola","bon dia","hej","zdravo","privet","privet","ola","hallo","hei","namaste","hello" },new Integer[] { 8,6,3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(11,"namaste",4,new Integer[] { 11,8,6,3 },new String[] { "namaste","ola","hej","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hi","bon dia","hej","zdravo","privet","privet","ola","hallo","hei","namaste","hello" },new Integer[] { 11,8,6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"ola",4,new Integer[] { 2,11,8,6 },new String[] { "ola","namaste","ola","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hi","hola","hej","zdravo","privet","privet","ola","hallo","hei","namaste","hello" },new Integer[] { 2,11,8,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"zdravo",4,new Integer[] { 5,2,11,8 },new String[] { "zdravo","ola","namaste","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hi","hola","hej","zdravo","hej","privet","ola","hallo","hei","namaste","hello" },new Integer[] { 5,2,11,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(11,"privet",4,new Integer[] { 5,2,11,8 },new String[] { "zdravo","ola","privet","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hi","hola","hej","zdravo","hej","privet","ola","hallo","hei","namaste","hello" },new Integer[] { 11,5,2,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"zdravo",4,new Integer[] { 5,2,11,8 },new String[] { "zdravo","ola","privet","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hi","hola","hej","zdravo","hej","privet","ola","hallo","hei","namaste","hello" },new Integer[] { 5,11,2,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"hej",4,new Integer[] { 4,5,2,11 },new String[] { "hej","zdravo","ola","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hi","hola","hej","zdravo","hej","privet","ola","hallo","hei","namaste","hello" },new Integer[] { 4,5,11,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"hi",4,new Integer[] { 9,4,5,11 },new String[] { "hi","hej","zdravo","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","ola","hola","hej","zdravo","hej","privet","ola","hallo","hei","namaste","hello" },new Integer[] { 9,4,5,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"hola",4,new Integer[] { 9,4,5,11 },new String[] { "hi","hej","hola","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","ola","hola","hej","zdravo","hej","privet","ola","hallo","hei","namaste","hello" },new Integer[] { 5,9,4,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"hola",4,new Integer[] { 9,4,5,11 },new String[] { "hi","hej","hola","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","ola","hola","hej","zdravo","hej","privet","ola","hallo","hei","namaste","hello" },new Integer[] { 5,9,4,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(10,"ciao",4,new Integer[] { 10,9,4,5 },new String[] { "ciao","hi","hej","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","ola","hola","hej","zdravo","hej","privet","ola","hallo","hei","privet","hello" },new Integer[] { 10,5,9,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(12,"hello",4,new Integer[] { 12,10,9,5 },new String[] { "hello","ciao","hi","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","ola","hola","hej","zdravo","hej","privet","ola","hallo","hei","privet","hello" },new Integer[] { 12,10,5,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"hallo",4,new Integer[] { 12,10,9,5 },new String[] { "hello","ciao","hallo","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","ola","hola","hej","zdravo","hej","privet","ola","hallo","hei","privet","hello" },new Integer[] { 9,12,10,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(12,"hallo",4,new Integer[] { 12,10,9,5 },new String[] { "hallo","ciao","hallo","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","ola","hola","hej","zdravo","hej","privet","ola","hallo","hei","privet","hello" },new Integer[] { 12,9,10,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"zdravo",4,new Integer[] { 3,12,10,9 },new String[] { "zdravo","hallo","ciao","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","ola","hola","hej","hola","hej","privet","ola","hallo","hei","privet","hello" },new Integer[] { 3,12,9,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(10,"ciao",4,new Integer[] { 3,12,10,9 },new String[] { "zdravo","hallo","ciao","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","ola","hola","hej","hola","hej","privet","ola","hallo","hei","privet","hello" },new Integer[] { 10,3,12,9 }) ;
      return ok_sofar ;
  }


  static boolean test_43 ()
  {
      
      testName = "test_43" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","hei","salaam","namaste","rimaykullayki","zdravo","hallo","hej","hello","privet" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"hei",4,new Integer[] { 4 },new String[] { "hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","hei","salaam","namaste","rimaykullayki","zdravo","hallo","hej","hello","privet" },new Integer[] { 4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"dobry den",4,new Integer[] { 4 },new String[] { "dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","hei","salaam","namaste","rimaykullayki","zdravo","hallo","hej","hello","privet" },new Integer[] { 4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(10,"hej",4,new Integer[] { 10,4 },new String[] { "hej","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","hei","salaam","namaste","rimaykullayki","zdravo","hallo","hej","hello","privet" },new Integer[] { 10,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(11,"hi",4,new Integer[] { 11,10,4 },new String[] { "hi","hej","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","hei","salaam","namaste","rimaykullayki","zdravo","hallo","hej","hello","privet" },new Integer[] { 11,10,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"hi",4,new Integer[] { 3,11,10,4 },new String[] { "hi","hi","hej","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","hei","salaam","namaste","rimaykullayki","zdravo","hallo","hej","hello","privet" },new Integer[] { 3,11,10,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"dobry den",4,new Integer[] { 3,11,10,4 },new String[] { "hi","hi","hej","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","hei","salaam","namaste","rimaykullayki","zdravo","hallo","hej","hello","privet" },new Integer[] { 4,3,11,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(12,"hola",4,new Integer[] { 12,3,11,4 },new String[] { "hola","hi","hi","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","hei","salaam","namaste","rimaykullayki","zdravo","hallo","hej","hello","privet" },new Integer[] { 12,4,3,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(10,"hej",4,new Integer[] { 10,12,3,4 },new String[] { "hej","hola","hi","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","hei","salaam","namaste","rimaykullayki","zdravo","hallo","hej","hi","privet" },new Integer[] { 10,12,4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(11,"hej",4,new Integer[] { 11,10,12,4 },new String[] { "hej","hej","hola","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","hei","salaam","namaste","rimaykullayki","zdravo","hallo","hej","hi","privet" },new Integer[] { 11,10,12,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"namaste",4,new Integer[] { 6,11,10,12 },new String[] { "namaste","hej","hej","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","dobry den","salaam","namaste","rimaykullayki","zdravo","hallo","hej","hi","privet" },new Integer[] { 6,11,10,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"dobry den",4,new Integer[] { 4,6,11,10 },new String[] { "dobry den","namaste","hej","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","dobry den","salaam","namaste","rimaykullayki","zdravo","hallo","hej","hi","hola" },new Integer[] { 4,6,11,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(12,"bon dia",4,new Integer[] { 12,4,6,11 },new String[] { "bon dia","dobry den","namaste","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","dobry den","salaam","namaste","rimaykullayki","zdravo","hallo","hej","hi","hola" },new Integer[] { 12,4,6,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"rimaykullayki",4,new Integer[] { 7,12,4,6 },new String[] { "rimaykullayki","bon dia","dobry den","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","dobry den","salaam","namaste","rimaykullayki","zdravo","hallo","hej","hej","hola" },new Integer[] { 7,12,4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"ciao",4,new Integer[] { 1,7,12,4 },new String[] { "ciao","rimaykullayki","bon dia","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","dobry den","salaam","namaste","rimaykullayki","zdravo","hallo","hej","hej","hola" },new Integer[] { 1,7,12,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"zdravo",4,new Integer[] { 8,1,7,12 },new String[] { "zdravo","ciao","rimaykullayki","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","dobry den","salaam","namaste","rimaykullayki","zdravo","hallo","hej","hej","hola" },new Integer[] { 8,1,7,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"dobry den",4,new Integer[] { 4,8,1,7 },new String[] { "dobry den","zdravo","ciao","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","dobry den","salaam","namaste","rimaykullayki","zdravo","hallo","hej","hej","bon dia" },new Integer[] { 4,8,1,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(12,"bon dia",4,new Integer[] { 12,4,8,1 },new String[] { "bon dia","dobry den","zdravo","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","dobry den","salaam","namaste","rimaykullayki","zdravo","hallo","hej","hej","bon dia" },new Integer[] { 12,4,8,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"hallo",4,new Integer[] { 5,12,4,8 },new String[] { "hallo","bon dia","dobry den","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","dobry den","salaam","namaste","rimaykullayki","zdravo","hallo","hej","hej","bon dia" },new Integer[] { 5,12,4,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(10,"hej",4,new Integer[] { 10,5,12,4 },new String[] { "hej","hallo","bon dia","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","dobry den","salaam","namaste","rimaykullayki","zdravo","hallo","hej","hej","bon dia" },new Integer[] { 10,5,12,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(12,"dobry den",4,new Integer[] { 10,5,12,4 },new String[] { "hej","hallo","dobry den","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","dobry den","salaam","namaste","rimaykullayki","zdravo","hallo","hej","hej","bon dia" },new Integer[] { 12,10,5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"namaste",4,new Integer[] { 6,10,5,12 },new String[] { "namaste","hej","hallo","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","dobry den","salaam","namaste","rimaykullayki","zdravo","hallo","hej","hej","bon dia" },new Integer[] { 6,12,10,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(11,"ciao",4,new Integer[] { 11,6,10,12 },new String[] { "ciao","namaste","hej","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","dobry den","hallo","namaste","rimaykullayki","zdravo","hallo","hej","hej","bon dia" },new Integer[] { 11,6,12,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(12,"ciao",4,new Integer[] { 11,6,10,12 },new String[] { "ciao","namaste","hej","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","dobry den","hallo","namaste","rimaykullayki","zdravo","hallo","hej","hej","bon dia" },new Integer[] { 12,11,6,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"salaam",4,new Integer[] { 11,6,10,12 },new String[] { "ciao","salaam","hej","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","dobry den","hallo","namaste","rimaykullayki","zdravo","hallo","hej","hej","bon dia" },new Integer[] { 6,12,11,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(10,"bon dia",4,new Integer[] { 11,6,10,12 },new String[] { "ciao","salaam","bon dia","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","dobry den","hallo","namaste","rimaykullayki","zdravo","hallo","hej","hej","bon dia" },new Integer[] { 10,6,12,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"dobry den",4,new Integer[] { 1,6,10,12 },new String[] { "dobry den","salaam","bon dia","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ciao","hola","hi","dobry den","hallo","namaste","rimaykullayki","zdravo","hallo","hej","ciao","bon dia" },new Integer[] { 1,10,6,12 }) ;
      return ok_sofar ;
  }


  static boolean test_44 ()
  {
      
      testName = "test_44" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(5,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "bon dia","privet","hola","namaste","ciao","zdravo","hi","hello","hei","hallo","rimaykullayki","salaam","hej","ola","kaixo" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"rimaykullayki",5,new Integer[] { 2 },new String[] { "rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "bon dia","privet","hola","namaste","ciao","zdravo","hi","hello","hei","hallo","rimaykullayki","salaam","hej","ola","kaixo" },new Integer[] { 2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"hei",5,new Integer[] { 9,2 },new String[] { "hei","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "bon dia","privet","hola","namaste","ciao","zdravo","hi","hello","hei","hallo","rimaykullayki","salaam","hej","ola","kaixo" },new Integer[] { 9,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(15,"bon dia",5,new Integer[] { 15,9,2 },new String[] { "bon dia","hei","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "bon dia","privet","hola","namaste","ciao","zdravo","hi","hello","hei","hallo","rimaykullayki","salaam","hej","ola","kaixo" },new Integer[] { 15,9,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(15,"bon dia",5,new Integer[] { 15,9,2 },new String[] { "bon dia","hei","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "bon dia","privet","hola","namaste","ciao","zdravo","hi","hello","hei","hallo","rimaykullayki","salaam","hej","ola","kaixo" },new Integer[] { 15,9,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"ciao",5,new Integer[] { 6,15,9,2 },new String[] { "ciao","bon dia","hei","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "bon dia","privet","hola","namaste","ciao","zdravo","hi","hello","hei","hallo","rimaykullayki","salaam","hej","ola","kaixo" },new Integer[] { 6,15,9,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"hello",5,new Integer[] { 8,6,15,9,2 },new String[] { "hello","ciao","bon dia","hei","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "bon dia","privet","hola","namaste","ciao","zdravo","hi","hello","hei","hallo","rimaykullayki","salaam","hej","ola","kaixo" },new Integer[] { 8,6,15,9,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(11,"rimaykullayki",5,new Integer[] { 11,8,6,15,9 },new String[] { "rimaykullayki","hello","ciao","bon dia","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "bon dia","rimaykullayki","hola","namaste","ciao","zdravo","hi","hello","hei","hallo","rimaykullayki","salaam","hej","ola","kaixo" },new Integer[] { 11,8,6,15,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(11,"dobry den",5,new Integer[] { 11,8,6,15,9 },new String[] { "dobry den","hello","ciao","bon dia","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "bon dia","rimaykullayki","hola","namaste","ciao","zdravo","hi","hello","hei","hallo","rimaykullayki","salaam","hej","ola","kaixo" },new Integer[] { 11,8,6,15,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"hola",5,new Integer[] { 3,11,8,6,15 },new String[] { "hola","dobry den","hello","ciao","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "bon dia","rimaykullayki","hola","namaste","ciao","zdravo","hi","hello","hei","hallo","rimaykullayki","salaam","hej","ola","kaixo" },new Integer[] { 3,11,8,6,15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"hei",5,new Integer[] { 1,3,11,8,6 },new String[] { "hei","hola","dobry den","hello","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "bon dia","rimaykullayki","hola","namaste","ciao","zdravo","hi","hello","hei","hallo","rimaykullayki","salaam","hej","ola","bon dia" },new Integer[] { 1,3,11,8,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"ola",5,new Integer[] { 5,1,3,11,8 },new String[] { "ola","hei","hola","dobry den","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "bon dia","rimaykullayki","hola","namaste","ciao","ciao","hi","hello","hei","hallo","rimaykullayki","salaam","hej","ola","bon dia" },new Integer[] { 5,1,3,11,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(15,"bon dia",5,new Integer[] { 15,5,1,3,11 },new String[] { "bon dia","ola","hei","hola","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "bon dia","rimaykullayki","hola","namaste","ciao","ciao","hi","hello","hei","hallo","rimaykullayki","salaam","hej","ola","bon dia" },new Integer[] { 15,5,1,3,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(11,"privet",5,new Integer[] { 15,5,1,3,11 },new String[] { "bon dia","ola","hei","hola","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "bon dia","rimaykullayki","hola","namaste","ciao","ciao","hi","hello","hei","hallo","rimaykullayki","salaam","hej","ola","bon dia" },new Integer[] { 11,15,5,1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(11,"privet",5,new Integer[] { 15,5,1,3,11 },new String[] { "bon dia","ola","hei","hola","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "bon dia","rimaykullayki","hola","namaste","ciao","ciao","hi","hello","hei","hallo","rimaykullayki","salaam","hej","ola","bon dia" },new Integer[] { 11,15,5,1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(11,"privet",5,new Integer[] { 15,5,1,3,11 },new String[] { "bon dia","ola","hei","hola","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "bon dia","rimaykullayki","hola","namaste","ciao","ciao","hi","hello","hei","hallo","rimaykullayki","salaam","hej","ola","bon dia" },new Integer[] { 11,15,5,1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"ola",5,new Integer[] { 9,15,5,1,11 },new String[] { "ola","bon dia","ola","hei","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "bon dia","rimaykullayki","hola","namaste","ciao","ciao","hi","hello","hei","hallo","rimaykullayki","salaam","hej","ola","bon dia" },new Integer[] { 9,11,15,5,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"rimaykullayki",5,new Integer[] { 2,9,15,5,11 },new String[] { "rimaykullayki","ola","bon dia","ola","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","rimaykullayki","hola","namaste","ciao","ciao","hi","hello","hei","hallo","rimaykullayki","salaam","hej","ola","bon dia" },new Integer[] { 2,9,11,15,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(13,"hi",5,new Integer[] { 13,2,9,15,11 },new String[] { "hi","rimaykullayki","ola","bon dia","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","rimaykullayki","hola","namaste","ola","ciao","hi","hello","hei","hallo","rimaykullayki","salaam","hej","ola","bon dia" },new Integer[] { 13,2,9,11,15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(7,"bon dia",5,new Integer[] { 7,13,2,9,11 },new String[] { "bon dia","hi","rimaykullayki","ola","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","rimaykullayki","hola","namaste","ola","ciao","hi","hello","hei","hallo","rimaykullayki","salaam","hej","ola","bon dia" },new Integer[] { 7,13,2,9,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(10,"hallo",5,new Integer[] { 10,7,13,2,9 },new String[] { "hallo","bon dia","hi","rimaykullayki","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","rimaykullayki","hola","namaste","ola","ciao","hi","hello","hei","hallo","privet","salaam","hej","ola","bon dia" },new Integer[] { 10,7,13,2,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(14,"ola",5,new Integer[] { 14,10,7,13,2 },new String[] { "ola","hallo","bon dia","hi","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","rimaykullayki","hola","namaste","ola","ciao","hi","hello","ola","hallo","privet","salaam","hej","ola","bon dia" },new Integer[] { 14,10,7,13,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(7,"kaixo",5,new Integer[] { 14,10,7,13,2 },new String[] { "ola","hallo","kaixo","hi","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","rimaykullayki","hola","namaste","ola","ciao","hi","hello","ola","hallo","privet","salaam","hej","ola","bon dia" },new Integer[] { 7,14,10,13,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"rimaykullayki",5,new Integer[] { 14,10,7,13,2 },new String[] { "ola","hallo","kaixo","hi","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","rimaykullayki","hola","namaste","ola","ciao","hi","hello","ola","hallo","privet","salaam","hej","ola","bon dia" },new Integer[] { 2,7,14,10,13 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"salaam",5,new Integer[] { 6,14,10,7,2 },new String[] { "salaam","ola","hallo","kaixo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","rimaykullayki","hola","namaste","ola","ciao","hi","hello","ola","hallo","privet","salaam","hi","ola","bon dia" },new Integer[] { 6,2,7,14,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"ola",5,new Integer[] { 5,6,14,7,2 },new String[] { "ola","salaam","ola","kaixo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","rimaykullayki","hola","namaste","ola","ciao","hi","hello","ola","hallo","privet","salaam","hi","ola","bon dia" },new Integer[] { 5,6,2,7,14 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"hello",5,new Integer[] { 8,5,6,7,2 },new String[] { "hello","ola","salaam","kaixo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","rimaykullayki","hola","namaste","ola","ciao","hi","hello","ola","hallo","privet","salaam","hi","ola","bon dia" },new Integer[] { 8,5,6,2,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(12,"salaam",5,new Integer[] { 12,8,5,6,2 },new String[] { "salaam","hello","ola","salaam","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","rimaykullayki","hola","namaste","ola","ciao","kaixo","hello","ola","hallo","privet","salaam","hi","ola","bon dia" },new Integer[] { 12,8,5,6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"hei",5,new Integer[] { 1,12,8,5,6 },new String[] { "hei","salaam","hello","ola","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","rimaykullayki","hola","namaste","ola","ciao","kaixo","hello","ola","hallo","privet","salaam","hi","ola","bon dia" },new Integer[] { 1,12,8,5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"ola",5,new Integer[] { 1,12,8,5,6 },new String[] { "hei","salaam","hello","ola","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","rimaykullayki","hola","namaste","ola","ciao","kaixo","hello","ola","hallo","privet","salaam","hi","ola","bon dia" },new Integer[] { 5,1,12,8,6 }) ;
      return ok_sofar ;
  }


  static boolean test_45 ()
  {
      
      testName = "test_45" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(5,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","privet","hei","hello","ola","rimaykullayki","salaam","hej","zdravo","dobry den","kaixo","namaste","ciao" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"ola",5,new Integer[] { 8 },new String[] { "ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","privet","hei","hello","ola","rimaykullayki","salaam","hej","zdravo","dobry den","kaixo","namaste","ciao" },new Integer[] { 8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"kaixo",5,new Integer[] { 4,8 },new String[] { "kaixo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","privet","hei","hello","ola","rimaykullayki","salaam","hej","zdravo","dobry den","kaixo","namaste","ciao" },new Integer[] { 4,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(13,"ola",5,new Integer[] { 13,4,8 },new String[] { "ola","kaixo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","privet","hei","hello","ola","rimaykullayki","salaam","hej","zdravo","dobry den","kaixo","namaste","ciao" },new Integer[] { 13,4,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(11,"zdravo",5,new Integer[] { 11,13,4,8 },new String[] { "zdravo","ola","kaixo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","privet","hei","hello","ola","rimaykullayki","salaam","hej","zdravo","dobry den","kaixo","namaste","ciao" },new Integer[] { 11,13,4,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(13,"ola",5,new Integer[] { 11,13,4,8 },new String[] { "zdravo","ola","kaixo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","privet","hei","hello","ola","rimaykullayki","salaam","hej","zdravo","dobry den","kaixo","namaste","ciao" },new Integer[] { 13,11,4,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(14,"namaste",5,new Integer[] { 14,11,13,4,8 },new String[] { "namaste","zdravo","ola","kaixo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","privet","hei","hello","ola","rimaykullayki","salaam","hej","zdravo","dobry den","kaixo","namaste","ciao" },new Integer[] { 14,13,11,4,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(15,"ciao",5,new Integer[] { 15,14,11,13,4 },new String[] { "ciao","namaste","zdravo","ola","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","privet","hei","hello","ola","ola","salaam","hej","zdravo","dobry den","kaixo","namaste","ciao" },new Integer[] { 15,14,13,11,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"hei",5,new Integer[] { 5,15,14,11,13 },new String[] { "hei","ciao","namaste","zdravo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","kaixo","hei","hello","ola","ola","salaam","hej","zdravo","dobry den","kaixo","namaste","ciao" },new Integer[] { 5,15,14,13,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"hello",5,new Integer[] { 5,15,14,11,13 },new String[] { "hello","ciao","namaste","zdravo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","kaixo","hei","hello","ola","ola","salaam","hej","zdravo","dobry den","kaixo","namaste","ciao" },new Integer[] { 5,15,14,13,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(15,"dobry den",5,new Integer[] { 5,15,14,11,13 },new String[] { "hello","dobry den","namaste","zdravo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","kaixo","hei","hello","ola","ola","salaam","hej","zdravo","dobry den","kaixo","namaste","ciao" },new Integer[] { 15,5,14,13,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"hi",5,new Integer[] { 1,5,15,14,13 },new String[] { "hi","hello","dobry den","namaste","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","kaixo","hei","hello","ola","ola","salaam","hej","zdravo","dobry den","kaixo","namaste","ciao" },new Integer[] { 1,15,5,14,13 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"hallo",5,new Integer[] { 6,1,5,15,14 },new String[] { "hallo","hi","hello","dobry den","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","kaixo","hei","hello","ola","ola","salaam","hej","zdravo","dobry den","ola","namaste","ciao" },new Integer[] { 6,1,15,5,14 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"ola",5,new Integer[] { 7,6,1,5,15 },new String[] { "ola","hallo","hi","hello","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","kaixo","hei","hello","ola","ola","salaam","hej","zdravo","dobry den","ola","namaste","ciao" },new Integer[] { 7,6,1,15,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(10,"hej",5,new Integer[] { 10,7,6,1,15 },new String[] { "hej","ola","hallo","hi","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","kaixo","hello","hello","ola","ola","salaam","hej","zdravo","dobry den","ola","namaste","ciao" },new Integer[] { 10,7,6,1,15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(13,"ola",5,new Integer[] { 13,10,7,6,1 },new String[] { "ola","hej","ola","hallo","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","kaixo","hello","hello","ola","ola","salaam","hej","zdravo","dobry den","ola","namaste","dobry den" },new Integer[] { 13,10,7,6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"hi",5,new Integer[] { 5,13,10,7,6 },new String[] { "hi","ola","hej","ola","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","kaixo","hello","hello","ola","ola","salaam","hej","zdravo","dobry den","ola","namaste","dobry den" },new Integer[] { 5,13,10,7,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(13,"ola",5,new Integer[] { 5,13,10,7,6 },new String[] { "hi","ola","hej","ola","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","kaixo","hello","hello","ola","ola","salaam","hej","zdravo","dobry den","ola","namaste","dobry den" },new Integer[] { 13,5,10,7,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"bon dia",5,new Integer[] { 2,5,13,10,7 },new String[] { "bon dia","hi","ola","hej","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","kaixo","hello","hallo","ola","ola","salaam","hej","zdravo","dobry den","ola","namaste","dobry den" },new Integer[] { 2,13,5,10,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(11,"dobry den",5,new Integer[] { 11,2,5,13,10 },new String[] { "dobry den","bon dia","hi","ola","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","kaixo","hello","hallo","ola","ola","salaam","hej","zdravo","dobry den","ola","namaste","dobry den" },new Integer[] { 11,2,13,5,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(13,"ola",5,new Integer[] { 11,2,5,13,10 },new String[] { "dobry den","bon dia","hi","ola","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","kaixo","hello","hallo","ola","ola","salaam","hej","zdravo","dobry den","ola","namaste","dobry den" },new Integer[] { 13,11,2,5,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(15,"dobry den",5,new Integer[] { 15,11,2,5,13 },new String[] { "dobry den","dobry den","bon dia","hi","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","kaixo","hello","hallo","ola","ola","salaam","hej","zdravo","dobry den","ola","namaste","dobry den" },new Integer[] { 15,13,11,2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(7,"bon dia",5,new Integer[] { 7,15,11,2,13 },new String[] { "bon dia","dobry den","dobry den","bon dia","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","hola","bon dia","kaixo","hi","hallo","ola","ola","salaam","hej","zdravo","dobry den","ola","namaste","dobry den" },new Integer[] { 7,15,13,11,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"hi",5,new Integer[] { 5,7,15,11,13 },new String[] { "hi","bon dia","dobry den","dobry den","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","bon dia","bon dia","kaixo","hi","hallo","ola","ola","salaam","hej","zdravo","dobry den","ola","namaste","dobry den" },new Integer[] { 5,7,15,13,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"rimaykullayki",5,new Integer[] { 9,5,7,15,13 },new String[] { "rimaykullayki","hi","bon dia","dobry den","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","bon dia","bon dia","kaixo","hi","hallo","ola","ola","salaam","hej","dobry den","dobry den","ola","namaste","dobry den" },new Integer[] { 9,5,7,15,13 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(14,"namaste",5,new Integer[] { 14,9,5,7,15 },new String[] { "namaste","rimaykullayki","hi","bon dia","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","bon dia","bon dia","kaixo","hi","hallo","ola","ola","salaam","hej","dobry den","dobry den","ola","namaste","dobry den" },new Integer[] { 14,9,5,7,15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(14,"namaste",5,new Integer[] { 14,9,5,7,15 },new String[] { "namaste","rimaykullayki","hi","bon dia","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","bon dia","bon dia","kaixo","hi","hallo","ola","ola","salaam","hej","dobry den","dobry den","ola","namaste","dobry den" },new Integer[] { 14,9,5,7,15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"hallo",5,new Integer[] { 6,14,9,5,7 },new String[] { "hallo","namaste","rimaykullayki","hi","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","bon dia","bon dia","kaixo","hi","hallo","ola","ola","salaam","hej","dobry den","dobry den","ola","namaste","dobry den" },new Integer[] { 6,14,9,5,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"zdravo",5,new Integer[] { 6,14,9,5,7 },new String[] { "hallo","namaste","zdravo","hi","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","bon dia","bon dia","kaixo","hi","hallo","ola","ola","salaam","hej","dobry den","dobry den","ola","namaste","dobry den" },new Integer[] { 9,6,14,5,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(11,"rimaykullayki",5,new Integer[] { 11,6,14,9,5 },new String[] { "rimaykullayki","hallo","namaste","zdravo","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","bon dia","bon dia","kaixo","hi","hallo","bon dia","ola","salaam","hej","dobry den","dobry den","ola","namaste","dobry den" },new Integer[] { 11,9,6,14,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"bon dia",5,new Integer[] { 3,11,6,14,9 },new String[] { "bon dia","rimaykullayki","hallo","namaste","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hi","bon dia","bon dia","kaixo","hi","hallo","bon dia","ola","salaam","hej","dobry den","dobry den","ola","namaste","dobry den" },new Integer[] { 3,11,9,6,14 }) ;
      return ok_sofar ;
  }


  static boolean test_46 ()
  {
      
      testName = "test_46" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(3,new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","hello","dobry den","zdravo","hallo","hola","privet","hei","bon dia" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"hei",3,new Integer[] { 8 },new String[] { "hei" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","hello","dobry den","zdravo","hallo","hola","privet","hei","bon dia" },new Integer[] { 8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(7,"privet",3,new Integer[] { 7,8 },new String[] { "privet","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","hello","dobry den","zdravo","hallo","hola","privet","hei","bon dia" },new Integer[] { 7,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"hola",3,new Integer[] { 6,7,8 },new String[] { "hola","privet","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","hello","dobry den","zdravo","hallo","hola","privet","hei","bon dia" },new Integer[] { 6,7,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"zdravo",3,new Integer[] { 4,6,7 },new String[] { "zdravo","hola","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","hello","dobry den","zdravo","hallo","hola","privet","hei","bon dia" },new Integer[] { 4,6,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"kaixo",3,new Integer[] { 9,4,6 },new String[] { "kaixo","zdravo","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","hello","dobry den","zdravo","hallo","hola","privet","hei","bon dia" },new Integer[] { 9,4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"dobry den",3,new Integer[] { 1,9,4 },new String[] { "dobry den","kaixo","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","hello","dobry den","zdravo","hallo","hola","privet","hei","bon dia" },new Integer[] { 1,9,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"rimaykullayki",3,new Integer[] { 5,1,9 },new String[] { "rimaykullayki","dobry den","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","hello","dobry den","zdravo","hallo","hola","privet","hei","bon dia" },new Integer[] { 5,1,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"rimaykullayki",3,new Integer[] { 5,1,9 },new String[] { "rimaykullayki","dobry den","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","hello","dobry den","zdravo","hallo","hola","privet","hei","bon dia" },new Integer[] { 9,5,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"dobry den",3,new Integer[] { 5,1,9 },new String[] { "rimaykullayki","dobry den","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","hello","dobry den","zdravo","hallo","hola","privet","hei","bon dia" },new Integer[] { 1,9,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"kaixo",3,new Integer[] { 2,1,9 },new String[] { "kaixo","dobry den","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","hello","dobry den","zdravo","rimaykullayki","hola","privet","hei","bon dia" },new Integer[] { 2,1,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"hola",3,new Integer[] { 6,2,1 },new String[] { "hola","kaixo","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","hello","dobry den","zdravo","rimaykullayki","hola","privet","hei","rimaykullayki" },new Integer[] { 6,2,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"rimaykullayki",3,new Integer[] { 9,6,2 },new String[] { "rimaykullayki","hola","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","hello","dobry den","zdravo","rimaykullayki","hola","privet","hei","rimaykullayki" },new Integer[] { 9,6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"rimaykullayki",3,new Integer[] { 9,6,2 },new String[] { "rimaykullayki","hola","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","hello","dobry den","zdravo","rimaykullayki","hola","privet","hei","rimaykullayki" },new Integer[] { 9,6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"zdravo",3,new Integer[] { 4,9,6 },new String[] { "zdravo","rimaykullayki","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","kaixo","dobry den","zdravo","rimaykullayki","hola","privet","hei","rimaykullayki" },new Integer[] { 4,9,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"rimaykullayki",3,new Integer[] { 4,9,6 },new String[] { "zdravo","rimaykullayki","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","kaixo","dobry den","zdravo","rimaykullayki","hola","privet","hei","rimaykullayki" },new Integer[] { 9,4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"hallo",3,new Integer[] { 2,4,9 },new String[] { "hallo","zdravo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","kaixo","dobry den","zdravo","rimaykullayki","hola","privet","hei","rimaykullayki" },new Integer[] { 2,9,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"privet",3,new Integer[] { 7,2,9 },new String[] { "privet","hallo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","kaixo","dobry den","zdravo","rimaykullayki","hola","privet","hei","rimaykullayki" },new Integer[] { 7,2,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"hei",3,new Integer[] { 1,7,2 },new String[] { "hei","privet","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","kaixo","dobry den","zdravo","rimaykullayki","hola","privet","hei","rimaykullayki" },new Integer[] { 1,7,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(7,"dobry den",3,new Integer[] { 1,7,2 },new String[] { "hei","dobry den","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","kaixo","dobry den","zdravo","rimaykullayki","hola","privet","hei","rimaykullayki" },new Integer[] { 7,1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"hola",3,new Integer[] { 6,1,7 },new String[] { "hola","hei","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","hallo","dobry den","zdravo","rimaykullayki","hola","privet","hei","rimaykullayki" },new Integer[] { 6,7,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"rimaykullayki",3,new Integer[] { 9,6,7 },new String[] { "rimaykullayki","hola","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hei","hallo","dobry den","zdravo","rimaykullayki","hola","privet","hei","rimaykullayki" },new Integer[] { 9,6,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"namaste",3,new Integer[] { 8,9,6 },new String[] { "namaste","rimaykullayki","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hei","hallo","dobry den","zdravo","rimaykullayki","hola","dobry den","hei","rimaykullayki" },new Integer[] { 8,9,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"dobry den",3,new Integer[] { 3,8,9 },new String[] { "dobry den","namaste","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hei","hallo","dobry den","zdravo","rimaykullayki","hola","dobry den","hei","rimaykullayki" },new Integer[] { 3,8,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hallo",3,new Integer[] { 2,3,8 },new String[] { "hallo","dobry den","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hei","hallo","dobry den","zdravo","rimaykullayki","hola","dobry den","hei","rimaykullayki" },new Integer[] { 2,3,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"hei",3,new Integer[] { 1,2,3 },new String[] { "hei","hallo","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hei","hallo","dobry den","zdravo","rimaykullayki","hola","dobry den","namaste","rimaykullayki" },new Integer[] { 1,2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"rimaykullayki",3,new Integer[] { 9,1,2 },new String[] { "rimaykullayki","hei","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hei","hallo","dobry den","zdravo","rimaykullayki","hola","dobry den","namaste","rimaykullayki" },new Integer[] { 9,1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"hallo",3,new Integer[] { 8,9,1 },new String[] { "hallo","rimaykullayki","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hei","hallo","dobry den","zdravo","rimaykullayki","hola","dobry den","namaste","rimaykullayki" },new Integer[] { 8,9,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"hallo",3,new Integer[] { 8,9,1 },new String[] { "hallo","rimaykullayki","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hei","hallo","dobry den","zdravo","rimaykullayki","hola","dobry den","namaste","rimaykullayki" },new Integer[] { 8,9,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"hallo",3,new Integer[] { 8,9,1 },new String[] { "hallo","rimaykullayki","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hei","hallo","dobry den","zdravo","rimaykullayki","hola","dobry den","namaste","rimaykullayki" },new Integer[] { 8,9,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"zdravo",3,new Integer[] { 4,8,9 },new String[] { "zdravo","hallo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hei","hallo","dobry den","zdravo","rimaykullayki","hola","dobry den","namaste","rimaykullayki" },new Integer[] { 4,8,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"zdravo",3,new Integer[] { 4,8,9 },new String[] { "zdravo","hallo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hei","hallo","dobry den","zdravo","rimaykullayki","hola","dobry den","namaste","rimaykullayki" },new Integer[] { 4,8,9 }) ;
      return ok_sofar ;
  }


  static boolean test_47 ()
  {
      
      testName = "test_47" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "hola","hej","hi","rimaykullayki","hello","zdravo" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"hallo",2,new Integer[] { 5 },new String[] { "hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hola","hej","hi","rimaykullayki","hello","zdravo" },new Integer[] { 5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"ola",2,new Integer[] { 1,5 },new String[] { "ola","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hola","hej","hi","rimaykullayki","hello","zdravo" },new Integer[] { 1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"dobry den",2,new Integer[] { 3,1 },new String[] { "dobry den","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hola","hej","hi","rimaykullayki","hallo","zdravo" },new Integer[] { 3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"zdravo",2,new Integer[] { 6,3 },new String[] { "zdravo","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hej","hi","rimaykullayki","hallo","zdravo" },new Integer[] { 6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"zdravo",2,new Integer[] { 6,3 },new String[] { "zdravo","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hej","hi","rimaykullayki","hallo","zdravo" },new Integer[] { 6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"hallo",2,new Integer[] { 5,6 },new String[] { "hallo","zdravo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hej","dobry den","rimaykullayki","hallo","zdravo" },new Integer[] { 5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"ola",2,new Integer[] { 1,5 },new String[] { "ola","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hej","dobry den","rimaykullayki","hallo","zdravo" },new Integer[] { 1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"rimaykullayki",2,new Integer[] { 4,1 },new String[] { "rimaykullayki","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hej","dobry den","rimaykullayki","hallo","zdravo" },new Integer[] { 4,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"ola",2,new Integer[] { 4,1 },new String[] { "rimaykullayki","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hej","dobry den","rimaykullayki","hallo","zdravo" },new Integer[] { 1,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hej",2,new Integer[] { 2,1 },new String[] { "hej","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hej","dobry den","rimaykullayki","hallo","zdravo" },new Integer[] { 2,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"ola",2,new Integer[] { 2,1 },new String[] { "hej","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hej","dobry den","rimaykullayki","hallo","zdravo" },new Integer[] { 1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"ola",2,new Integer[] { 2,1 },new String[] { "hej","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hej","dobry den","rimaykullayki","hallo","zdravo" },new Integer[] { 1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"hallo",2,new Integer[] { 5,1 },new String[] { "hallo","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hej","dobry den","rimaykullayki","hallo","zdravo" },new Integer[] { 5,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hej",2,new Integer[] { 2,5 },new String[] { "hej","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hej","dobry den","rimaykullayki","hallo","zdravo" },new Integer[] { 2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"rimaykullayki",2,new Integer[] { 4,2 },new String[] { "rimaykullayki","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hej","dobry den","rimaykullayki","hallo","zdravo" },new Integer[] { 4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"rimaykullayki",2,new Integer[] { 4,2 },new String[] { "rimaykullayki","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hej","dobry den","rimaykullayki","hallo","zdravo" },new Integer[] { 4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"rimaykullayki",2,new Integer[] { 4,2 },new String[] { "rimaykullayki","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hej","dobry den","rimaykullayki","hallo","zdravo" },new Integer[] { 4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"ola",2,new Integer[] { 5,4 },new String[] { "ola","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hej","dobry den","rimaykullayki","hallo","zdravo" },new Integer[] { 5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"hello",2,new Integer[] { 1,5 },new String[] { "hello","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hej","dobry den","rimaykullayki","hallo","zdravo" },new Integer[] { 1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"dobry den",2,new Integer[] { 3,1 },new String[] { "dobry den","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hej","dobry den","rimaykullayki","ola","zdravo" },new Integer[] { 3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"ola",2,new Integer[] { 4,3 },new String[] { "ola","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","hej","dobry den","rimaykullayki","ola","zdravo" },new Integer[] { 4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"namaste",2,new Integer[] { 1,4 },new String[] { "namaste","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","hej","dobry den","rimaykullayki","ola","zdravo" },new Integer[] { 1,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"hej",2,new Integer[] { 2,1 },new String[] { "hej","namaste" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","hej","dobry den","ola","ola","zdravo" },new Integer[] { 2,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"zdravo",2,new Integer[] { 6,2 },new String[] { "zdravo","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hej","dobry den","ola","ola","zdravo" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"ola",2,new Integer[] { 1,6 },new String[] { "ola","zdravo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hej","dobry den","ola","ola","zdravo" },new Integer[] { 1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"kaixo",2,new Integer[] { 2,1 },new String[] { "kaixo","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hej","dobry den","ola","ola","zdravo" },new Integer[] { 2,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"hej",2,new Integer[] { 2,1 },new String[] { "hej","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hej","dobry den","ola","ola","zdravo" },new Integer[] { 2,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"zdravo",2,new Integer[] { 2,1 },new String[] { "zdravo","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hej","dobry den","ola","ola","zdravo" },new Integer[] { 2,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"namaste",2,new Integer[] { 2,1 },new String[] { "namaste","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hej","dobry den","ola","ola","zdravo" },new Integer[] { 2,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"hallo",2,new Integer[] { 5,2 },new String[] { "hallo","namaste" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","hej","dobry den","ola","ola","zdravo" },new Integer[] { 5,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"hello",2,new Integer[] { 6,5 },new String[] { "hello","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ola","namaste","dobry den","ola","ola","zdravo" },new Integer[] { 6,5 }) ;
      return ok_sofar ;
  }


  static boolean test_48 ()
  {
      
      testName = "test_48" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(3,new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hello","hola","dobry den","hi","bon dia","ola","rimaykullayki","hej","ciao" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"hej",3,new Integer[] { 8 },new String[] { "hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hello","hola","dobry den","hi","bon dia","ola","rimaykullayki","hej","ciao" },new Integer[] { 8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"dobry den",3,new Integer[] { 3,8 },new String[] { "dobry den","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hello","hola","dobry den","hi","bon dia","ola","rimaykullayki","hej","ciao" },new Integer[] { 3,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(7,"hi",3,new Integer[] { 7,3,8 },new String[] { "hi","dobry den","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hello","hola","dobry den","hi","bon dia","ola","rimaykullayki","hej","ciao" },new Integer[] { 7,3,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"dobry den",3,new Integer[] { 7,3,8 },new String[] { "hi","dobry den","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hello","hola","dobry den","hi","bon dia","ola","rimaykullayki","hej","ciao" },new Integer[] { 3,7,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"hallo",3,new Integer[] { 1,7,3 },new String[] { "hallo","hi","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hello","hola","dobry den","hi","bon dia","ola","rimaykullayki","hej","ciao" },new Integer[] { 1,3,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"hei",3,new Integer[] { 1,7,3 },new String[] { "hallo","hi","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hello","hola","dobry den","hi","bon dia","ola","rimaykullayki","hej","ciao" },new Integer[] { 3,1,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"bon dia",3,new Integer[] { 5,1,3 },new String[] { "bon dia","hallo","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hello","hola","dobry den","hi","bon dia","ola","hi","hej","ciao" },new Integer[] { 5,3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hola",3,new Integer[] { 2,5,3 },new String[] { "hola","bon dia","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","hola","dobry den","hi","bon dia","ola","hi","hej","ciao" },new Integer[] { 2,5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"hi",3,new Integer[] { 4,2,5 },new String[] { "hi","hola","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","hola","hei","hi","bon dia","ola","hi","hej","ciao" },new Integer[] { 4,2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"hi",3,new Integer[] { 4,2,5 },new String[] { "hi","hola","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","hola","hei","hi","bon dia","ola","hi","hej","ciao" },new Integer[] { 4,2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"ola",3,new Integer[] { 4,2,5 },new String[] { "hi","hola","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","hola","hei","hi","bon dia","ola","hi","hej","ciao" },new Integer[] { 5,4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"hi",3,new Integer[] { 7,4,5 },new String[] { "hi","hi","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","hola","hei","hi","bon dia","ola","hi","hej","ciao" },new Integer[] { 7,5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"hi",3,new Integer[] { 7,4,5 },new String[] { "hi","hi","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","hola","hei","hi","bon dia","ola","hi","hej","ciao" },new Integer[] { 7,5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"ola",3,new Integer[] { 7,4,5 },new String[] { "hi","hi","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","hola","hei","hi","bon dia","ola","hi","hej","ciao" },new Integer[] { 5,7,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"hi",3,new Integer[] { 7,4,5 },new String[] { "hi","hi","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","hola","hei","hi","bon dia","ola","hi","hej","ciao" },new Integer[] { 7,5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"hei",3,new Integer[] { 3,7,5 },new String[] { "hei","hi","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","hola","hei","hi","bon dia","ola","hi","hej","ciao" },new Integer[] { 3,7,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"ciao",3,new Integer[] { 4,3,7 },new String[] { "ciao","hei","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","hola","hei","hi","ola","ola","hi","hej","ciao" },new Integer[] { 4,3,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"dobry den",3,new Integer[] { 4,3,7 },new String[] { "dobry den","hei","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","hola","hei","hi","ola","ola","hi","hej","ciao" },new Integer[] { 4,3,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"ola",3,new Integer[] { 6,4,3 },new String[] { "ola","dobry den","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","hola","hei","hi","ola","ola","hi","hej","ciao" },new Integer[] { 6,4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"ola",3,new Integer[] { 6,4,3 },new String[] { "ola","dobry den","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","hola","hei","hi","ola","ola","hi","hej","ciao" },new Integer[] { 6,4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hola",3,new Integer[] { 2,6,4 },new String[] { "hola","ola","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","hola","hei","hi","ola","ola","hi","hej","ciao" },new Integer[] { 2,6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"ola",3,new Integer[] { 5,2,6 },new String[] { "ola","hola","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","hola","hei","dobry den","ola","ola","hi","hej","ciao" },new Integer[] { 5,2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"salaam",3,new Integer[] { 3,5,2 },new String[] { "salaam","ola","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","hola","hei","dobry den","ola","ola","hi","hej","ciao" },new Integer[] { 3,5,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"hi",3,new Integer[] { 1,3,5 },new String[] { "hi","salaam","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","hola","hei","dobry den","ola","ola","hi","hej","ciao" },new Integer[] { 1,3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"ola",3,new Integer[] { 1,3,5 },new String[] { "hi","ola","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","hola","hei","dobry den","ola","ola","hi","hej","ciao" },new Integer[] { 3,1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"rimaykullayki",3,new Integer[] { 2,1,3 },new String[] { "rimaykullayki","hi","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","hola","hei","dobry den","ola","ola","hi","hej","ciao" },new Integer[] { 2,3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"namaste",3,new Integer[] { 2,1,3 },new String[] { "rimaykullayki","hi","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","hola","hei","dobry den","ola","ola","hi","hej","ciao" },new Integer[] { 3,2,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"rimaykullayki",3,new Integer[] { 2,1,3 },new String[] { "rimaykullayki","rimaykullayki","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","hola","hei","dobry den","ola","ola","hi","hej","ciao" },new Integer[] { 1,3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"namaste",3,new Integer[] { 2,1,3 },new String[] { "rimaykullayki","rimaykullayki","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","hola","hei","dobry den","ola","ola","hi","hej","ciao" },new Integer[] { 3,1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"ola",3,new Integer[] { 5,1,3 },new String[] { "ola","rimaykullayki","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","rimaykullayki","hei","dobry den","ola","ola","hi","hej","ciao" },new Integer[] { 5,3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"ola",3,new Integer[] { 5,1,3 },new String[] { "ola","rimaykullayki","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","rimaykullayki","hei","dobry den","ola","ola","hi","hej","ciao" },new Integer[] { 5,3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"ola",3,new Integer[] { 2,5,3 },new String[] { "ola","ola","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","rimaykullayki","hei","dobry den","ola","ola","hi","hej","ciao" },new Integer[] { 2,5,3 }) ;
      return ok_sofar ;
  }


  static boolean test_49 ()
  {
      
      testName = "test_49" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hola","hei","kaixo","ciao","hello" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"hei",2,new Integer[] { 3 },new String[] { "hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hola","hei","kaixo","ciao","hello" },new Integer[] { 3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"salaam",2,new Integer[] { 4,3 },new String[] { "salaam","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hola","hei","kaixo","ciao","hello" },new Integer[] { 4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"hello",2,new Integer[] { 2,4 },new String[] { "hello","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hola","hei","kaixo","ciao","hello" },new Integer[] { 2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hello",2,new Integer[] { 2,4 },new String[] { "hello","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hola","hei","kaixo","ciao","hello" },new Integer[] { 2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"bon dia",2,new Integer[] { 3,2 },new String[] { "bon dia","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hola","hei","salaam","ciao","hello" },new Integer[] { 3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hello",2,new Integer[] { 3,2 },new String[] { "bon dia","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hola","hei","salaam","ciao","hello" },new Integer[] { 2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"hej",2,new Integer[] { 1,2 },new String[] { "hej","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hola","bon dia","salaam","ciao","hello" },new Integer[] { 1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"ciao",2,new Integer[] { 5,1 },new String[] { "ciao","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","bon dia","salaam","ciao","hello" },new Integer[] { 5,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"bon dia",2,new Integer[] { 4,5 },new String[] { "bon dia","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","bon dia","salaam","ciao","hello" },new Integer[] { 4,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"ciao",2,new Integer[] { 4,5 },new String[] { "bon dia","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","bon dia","salaam","ciao","hello" },new Integer[] { 5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"hei",2,new Integer[] { 6,5 },new String[] { "hei","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","bon dia","bon dia","ciao","hello" },new Integer[] { 6,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"bon dia",2,new Integer[] { 4,6 },new String[] { "bon dia","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","bon dia","bon dia","ciao","hello" },new Integer[] { 4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"bon dia",2,new Integer[] { 3,4 },new String[] { "bon dia","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","bon dia","bon dia","ciao","hei" },new Integer[] { 3,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hello",2,new Integer[] { 2,3 },new String[] { "hello","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","bon dia","bon dia","ciao","hei" },new Integer[] { 2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"hallo",2,new Integer[] { 5,2 },new String[] { "hallo","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","bon dia","bon dia","ciao","hei" },new Integer[] { 5,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hello",2,new Integer[] { 5,2 },new String[] { "hallo","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","bon dia","bon dia","ciao","hei" },new Integer[] { 2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"salaam",2,new Integer[] { 6,2 },new String[] { "salaam","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","bon dia","bon dia","hallo","hei" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"hej",2,new Integer[] { 1,6 },new String[] { "hej","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","bon dia","bon dia","hallo","hei" },new Integer[] { 1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"bon dia",2,new Integer[] { 4,1 },new String[] { "bon dia","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","bon dia","bon dia","hallo","salaam" },new Integer[] { 4,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"bon dia",2,new Integer[] { 3,4 },new String[] { "bon dia","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","bon dia","bon dia","hallo","salaam" },new Integer[] { 3,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"hallo",2,new Integer[] { 5,3 },new String[] { "hallo","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","bon dia","bon dia","hallo","salaam" },new Integer[] { 5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"salaam",2,new Integer[] { 6,5 },new String[] { "salaam","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","bon dia","bon dia","hallo","salaam" },new Integer[] { 6,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"hej",2,new Integer[] { 1,6 },new String[] { "hej","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","bon dia","bon dia","hallo","salaam" },new Integer[] { 1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"bon dia",2,new Integer[] { 4,1 },new String[] { "bon dia","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","bon dia","bon dia","hallo","salaam" },new Integer[] { 4,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"namaste",2,new Integer[] { 5,4 },new String[] { "namaste","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","bon dia","bon dia","hallo","salaam" },new Integer[] { 5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"hei",2,new Integer[] { 5,4 },new String[] { "hei","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","bon dia","bon dia","hallo","salaam" },new Integer[] { 5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"hei",2,new Integer[] { 3,5 },new String[] { "hei","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","bon dia","bon dia","hallo","salaam" },new Integer[] { 3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"salaam",2,new Integer[] { 6,3 },new String[] { "salaam","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","bon dia","bon dia","hei","salaam" },new Integer[] { 6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"hej",2,new Integer[] { 1,6 },new String[] { "hej","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","hei","bon dia","hei","salaam" },new Integer[] { 1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"hej",2,new Integer[] { 1,6 },new String[] { "hej","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","hei","bon dia","hei","salaam" },new Integer[] { 1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"dobry den",2,new Integer[] { 1,6 },new String[] { "hej","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","hei","bon dia","hei","salaam" },new Integer[] { 6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"dobry den",2,new Integer[] { 1,6 },new String[] { "dobry den","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","hei","bon dia","hei","salaam" },new Integer[] { 1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"ciao",2,new Integer[] { 2,1 },new String[] { "ciao","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","hei","bon dia","hei","dobry den" },new Integer[] { 2,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"dobry den",2,new Integer[] { 2,1 },new String[] { "ciao","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hello","hei","bon dia","hei","dobry den" },new Integer[] { 1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"dobry den",2,new Integer[] { 6,1 },new String[] { "dobry den","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","ciao","hei","bon dia","hei","dobry den" },new Integer[] { 6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"rimaykullayki",2,new Integer[] { 5,6 },new String[] { "rimaykullayki","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","ciao","hei","bon dia","hei","dobry den" },new Integer[] { 5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"bon dia",2,new Integer[] { 4,5 },new String[] { "bon dia","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","ciao","hei","bon dia","hei","dobry den" },new Integer[] { 4,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"dobry den",2,new Integer[] { 6,4 },new String[] { "dobry den","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","ciao","hei","bon dia","rimaykullayki","dobry den" },new Integer[] { 6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"hei",2,new Integer[] { 6,4 },new String[] { "hei","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","ciao","hei","bon dia","rimaykullayki","dobry den" },new Integer[] { 6,4 }) ;
      return ok_sofar ;
  }


  static boolean test_50 ()
  {
      
      testName = "test_50" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","ciao","dobry den","ola","hola","hi" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"zdravo",2,new Integer[] { 3 },new String[] { "zdravo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","ciao","dobry den","ola","hola","hi" },new Integer[] { 3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"hi",2,new Integer[] { 6,3 },new String[] { "hi","zdravo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","ciao","dobry den","ola","hola","hi" },new Integer[] { 6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"ciao",2,new Integer[] { 2,6 },new String[] { "ciao","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","ciao","zdravo","ola","hola","hi" },new Integer[] { 2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"hola",2,new Integer[] { 4,2 },new String[] { "hola","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","ciao","zdravo","ola","hola","hi" },new Integer[] { 4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"hola",2,new Integer[] { 4,2 },new String[] { "hola","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","ciao","zdravo","ola","hola","hi" },new Integer[] { 4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"ciao",2,new Integer[] { 4,2 },new String[] { "hola","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","ciao","zdravo","ola","hola","hi" },new Integer[] { 2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"hallo",2,new Integer[] { 4,2 },new String[] { "hallo","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","ciao","zdravo","ola","hola","hi" },new Integer[] { 4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"hei",2,new Integer[] { 6,4 },new String[] { "hei","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","ciao","zdravo","ola","hola","hi" },new Integer[] { 6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"hallo",2,new Integer[] { 6,4 },new String[] { "hei","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","ciao","zdravo","ola","hola","hi" },new Integer[] { 4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"dobry den",2,new Integer[] { 5,4 },new String[] { "dobry den","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","ciao","zdravo","ola","hola","hei" },new Integer[] { 5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"hallo",2,new Integer[] { 5,4 },new String[] { "dobry den","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","ciao","zdravo","ola","hola","hei" },new Integer[] { 4,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"ciao",2,new Integer[] { 2,4 },new String[] { "ciao","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","ciao","zdravo","ola","dobry den","hei" },new Integer[] { 2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"ciao",2,new Integer[] { 3,2 },new String[] { "ciao","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","ciao","zdravo","hallo","dobry den","hei" },new Integer[] { 3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"namaste",2,new Integer[] { 1,3 },new String[] { "namaste","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","ciao","zdravo","hallo","dobry den","hei" },new Integer[] { 1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"ciao",2,new Integer[] { 1,3 },new String[] { "ciao","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","ciao","zdravo","hallo","dobry den","hei" },new Integer[] { 1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"ciao",2,new Integer[] { 1,3 },new String[] { "ciao","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","ciao","zdravo","hallo","dobry den","hei" },new Integer[] { 1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"ciao",2,new Integer[] { 1,3 },new String[] { "ciao","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","ciao","zdravo","hallo","dobry den","hei" },new Integer[] { 3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"hallo",2,new Integer[] { 4,3 },new String[] { "hallo","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ciao","zdravo","hallo","dobry den","hei" },new Integer[] { 4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"ciao",2,new Integer[] { 2,4 },new String[] { "ciao","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ciao","ciao","hallo","dobry den","hei" },new Integer[] { 2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"hej",2,new Integer[] { 3,2 },new String[] { "hej","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ciao","ciao","hallo","dobry den","hei" },new Integer[] { 3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"ciao",2,new Integer[] { 3,2 },new String[] { "hej","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ciao","ciao","hallo","dobry den","hei" },new Integer[] { 2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"hei",2,new Integer[] { 6,2 },new String[] { "hei","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ciao","hej","hallo","dobry den","hei" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"dobry den",2,new Integer[] { 5,6 },new String[] { "dobry den","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ciao","hej","hallo","dobry den","hei" },new Integer[] { 5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"hi",2,new Integer[] { 3,5 },new String[] { "hi","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ciao","hej","hallo","dobry den","hei" },new Integer[] { 3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"ola",2,new Integer[] { 2,3 },new String[] { "ola","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ciao","hej","hallo","dobry den","hei" },new Integer[] { 2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"rimaykullayki",2,new Integer[] { 6,2 },new String[] { "rimaykullayki","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ciao","hi","hallo","dobry den","hei" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"hei",2,new Integer[] { 4,6 },new String[] { "hei","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ola","hi","hallo","dobry den","hei" },new Integer[] { 4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"ciao",2,new Integer[] { 1,4 },new String[] { "ciao","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ola","hi","hallo","dobry den","rimaykullayki" },new Integer[] { 1,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"ciao",2,new Integer[] { 1,4 },new String[] { "ciao","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ola","hi","hallo","dobry den","rimaykullayki" },new Integer[] { 1,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"ola",2,new Integer[] { 2,1 },new String[] { "ola","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ola","hi","hei","dobry den","rimaykullayki" },new Integer[] { 2,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"rimaykullayki",2,new Integer[] { 6,2 },new String[] { "rimaykullayki","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ola","hi","hei","dobry den","rimaykullayki" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"hei",2,new Integer[] { 4,6 },new String[] { "hei","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ola","hi","hei","dobry den","rimaykullayki" },new Integer[] { 4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"rimaykullayki",2,new Integer[] { 4,6 },new String[] { "hei","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ola","hi","hei","dobry den","rimaykullayki" },new Integer[] { 6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"hei",2,new Integer[] { 4,6 },new String[] { "hei","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ola","hi","hei","dobry den","rimaykullayki" },new Integer[] { 4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"namaste",2,new Integer[] { 3,4 },new String[] { "namaste","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ola","hi","hei","dobry den","rimaykullayki" },new Integer[] { 3,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"hallo",2,new Integer[] { 3,4 },new String[] { "hallo","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ola","hi","hei","dobry den","rimaykullayki" },new Integer[] { 3,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"dobry den",2,new Integer[] { 5,3 },new String[] { "dobry den","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ola","hi","hei","dobry den","rimaykullayki" },new Integer[] { 5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"hallo",2,new Integer[] { 5,3 },new String[] { "dobry den","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ola","hi","hei","dobry den","rimaykullayki" },new Integer[] { 3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"dobry den",2,new Integer[] { 5,3 },new String[] { "dobry den","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ola","hi","hei","dobry den","rimaykullayki" },new Integer[] { 5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"ciao",2,new Integer[] { 1,5 },new String[] { "ciao","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ola","hallo","hei","dobry den","rimaykullayki" },new Integer[] { 1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"hi",2,new Integer[] { 1,5 },new String[] { "ciao","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ola","hallo","hei","dobry den","rimaykullayki" },new Integer[] { 5,1 }) ;
      return ok_sofar ;
  }


  static boolean test_51 ()
  {
      
      testName = "test_51" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","zdravo","namaste","hej","privet","salaam","ola","ciao","hi","dobry den","hola","rimaykullayki" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"kaixo",4,new Integer[] { 5 },new String[] { "kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","zdravo","namaste","hej","privet","salaam","ola","ciao","hi","dobry den","hola","rimaykullayki" },new Integer[] { 5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"zdravo",4,new Integer[] { 2,5 },new String[] { "zdravo","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","zdravo","namaste","hej","privet","salaam","ola","ciao","hi","dobry den","hola","rimaykullayki" },new Integer[] { 2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"rimaykullayki",4,new Integer[] { 6,2,5 },new String[] { "rimaykullayki","zdravo","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","zdravo","namaste","hej","privet","salaam","ola","ciao","hi","dobry den","hola","rimaykullayki" },new Integer[] { 6,2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(11,"hallo",4,new Integer[] { 11,6,2,5 },new String[] { "hallo","rimaykullayki","zdravo","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","zdravo","namaste","hej","privet","salaam","ola","ciao","hi","dobry den","hola","rimaykullayki" },new Integer[] { 11,6,2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"kaixo",4,new Integer[] { 11,6,2,5 },new String[] { "hallo","rimaykullayki","zdravo","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","zdravo","namaste","hej","privet","salaam","ola","ciao","hi","dobry den","hola","rimaykullayki" },new Integer[] { 5,11,6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"zdravo",4,new Integer[] { 11,6,2,5 },new String[] { "hallo","rimaykullayki","zdravo","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","zdravo","namaste","hej","privet","salaam","ola","ciao","hi","dobry den","hola","rimaykullayki" },new Integer[] { 2,5,11,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(12,"rimaykullayki",4,new Integer[] { 12,11,2,5 },new String[] { "rimaykullayki","hallo","zdravo","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","zdravo","namaste","hej","privet","rimaykullayki","ola","ciao","hi","dobry den","hola","rimaykullayki" },new Integer[] { 12,2,5,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(11,"hei",4,new Integer[] { 12,11,2,5 },new String[] { "rimaykullayki","hei","zdravo","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","zdravo","namaste","hej","privet","rimaykullayki","ola","ciao","hi","dobry den","hola","rimaykullayki" },new Integer[] { 11,12,2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"hej",4,new Integer[] { 4,12,11,2 },new String[] { "hej","rimaykullayki","hei","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","zdravo","namaste","hej","kaixo","rimaykullayki","ola","ciao","hi","dobry den","hola","rimaykullayki" },new Integer[] { 4,11,12,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(11,"hei",4,new Integer[] { 4,12,11,2 },new String[] { "hej","rimaykullayki","hei","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","zdravo","namaste","hej","kaixo","rimaykullayki","ola","ciao","hi","dobry den","hola","rimaykullayki" },new Integer[] { 11,4,12,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(10,"dobry den",4,new Integer[] { 10,4,12,11 },new String[] { "dobry den","hej","rimaykullayki","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","zdravo","namaste","hej","kaixo","rimaykullayki","ola","ciao","hi","dobry den","hola","rimaykullayki" },new Integer[] { 10,11,4,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"hei",4,new Integer[] { 9,10,4,11 },new String[] { "hei","dobry den","hej","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","zdravo","namaste","hej","kaixo","rimaykullayki","ola","ciao","hi","dobry den","hola","rimaykullayki" },new Integer[] { 9,10,11,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"hello",4,new Integer[] { 2,9,10,11 },new String[] { "hello","hei","dobry den","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","zdravo","namaste","hej","kaixo","rimaykullayki","ola","ciao","hi","dobry den","hola","rimaykullayki" },new Integer[] { 2,9,10,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(12,"hei",4,new Integer[] { 12,2,9,10 },new String[] { "hei","hello","hei","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","zdravo","namaste","hej","kaixo","rimaykullayki","ola","ciao","hi","dobry den","hei","rimaykullayki" },new Integer[] { 12,2,9,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(12,"rimaykullayki",4,new Integer[] { 12,2,9,10 },new String[] { "rimaykullayki","hello","hei","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","zdravo","namaste","hej","kaixo","rimaykullayki","ola","ciao","hi","dobry den","hei","rimaykullayki" },new Integer[] { 12,2,9,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"hej",4,new Integer[] { 4,12,2,9 },new String[] { "hej","rimaykullayki","hello","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","zdravo","namaste","hej","kaixo","rimaykullayki","ola","ciao","hi","dobry den","hei","rimaykullayki" },new Integer[] { 4,12,2,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(11,"ola",4,new Integer[] { 11,4,12,2 },new String[] { "ola","hej","rimaykullayki","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","zdravo","namaste","hej","kaixo","rimaykullayki","ola","ciao","hei","dobry den","hei","rimaykullayki" },new Integer[] { 11,4,12,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"rimaykullayki",4,new Integer[] { 6,11,4,12 },new String[] { "rimaykullayki","ola","hej","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","hello","namaste","hej","kaixo","rimaykullayki","ola","ciao","hei","dobry den","hei","rimaykullayki" },new Integer[] { 6,11,4,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(7,"salaam",4,new Integer[] { 7,6,11,4 },new String[] { "salaam","rimaykullayki","ola","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","hello","namaste","hej","kaixo","rimaykullayki","ola","ciao","hei","dobry den","hei","rimaykullayki" },new Integer[] { 7,6,11,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"hej",4,new Integer[] { 7,6,11,4 },new String[] { "salaam","rimaykullayki","ola","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","hello","namaste","hej","kaixo","rimaykullayki","ola","ciao","hei","dobry den","hei","rimaykullayki" },new Integer[] { 4,7,6,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"ciao",4,new Integer[] { 7,6,11,4 },new String[] { "salaam","rimaykullayki","ola","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","hello","namaste","hej","kaixo","rimaykullayki","ola","ciao","hei","dobry den","hei","rimaykullayki" },new Integer[] { 4,7,6,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"zdravo",4,new Integer[] { 8,7,6,4 },new String[] { "zdravo","salaam","rimaykullayki","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","hello","namaste","hej","kaixo","rimaykullayki","ola","ciao","hei","dobry den","ola","rimaykullayki" },new Integer[] { 8,4,7,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(10,"dobry den",4,new Integer[] { 10,8,7,4 },new String[] { "dobry den","zdravo","salaam","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","hello","namaste","hej","kaixo","rimaykullayki","ola","ciao","hei","dobry den","ola","rimaykullayki" },new Integer[] { 10,8,4,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(10,"zdravo",4,new Integer[] { 10,8,7,4 },new String[] { "zdravo","zdravo","salaam","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","hello","namaste","hej","kaixo","rimaykullayki","ola","ciao","hei","dobry den","ola","rimaykullayki" },new Integer[] { 10,8,4,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"dobry den",4,new Integer[] { 3,10,8,4 },new String[] { "dobry den","zdravo","zdravo","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","hello","namaste","hej","kaixo","rimaykullayki","salaam","ciao","hei","dobry den","ola","rimaykullayki" },new Integer[] { 3,10,8,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"dobry den",4,new Integer[] { 3,10,8,4 },new String[] { "dobry den","zdravo","dobry den","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","hello","namaste","hej","kaixo","rimaykullayki","salaam","ciao","hei","dobry den","ola","rimaykullayki" },new Integer[] { 8,3,10,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"rimaykullayki",4,new Integer[] { 6,3,10,8 },new String[] { "rimaykullayki","dobry den","zdravo","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","hello","namaste","ciao","kaixo","rimaykullayki","salaam","ciao","hei","dobry den","ola","rimaykullayki" },new Integer[] { 6,8,3,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(10,"hallo",4,new Integer[] { 6,3,10,8 },new String[] { "rimaykullayki","dobry den","hallo","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","hello","namaste","ciao","kaixo","rimaykullayki","salaam","ciao","hei","dobry den","ola","rimaykullayki" },new Integer[] { 10,6,8,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"ola",4,new Integer[] { 9,6,10,8 },new String[] { "ola","rimaykullayki","hallo","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","hello","dobry den","ciao","kaixo","rimaykullayki","salaam","ciao","hei","dobry den","ola","rimaykullayki" },new Integer[] { 9,10,6,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"hola",4,new Integer[] { 9,6,10,8 },new String[] { "ola","hola","hallo","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","hello","dobry den","ciao","kaixo","rimaykullayki","salaam","ciao","hei","dobry den","ola","rimaykullayki" },new Integer[] { 6,9,10,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"ciao",4,new Integer[] { 4,9,6,10 },new String[] { "ciao","ola","hola","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","hello","dobry den","ciao","kaixo","rimaykullayki","salaam","dobry den","hei","dobry den","ola","rimaykullayki" },new Integer[] { 4,6,9,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"bon dia",4,new Integer[] { 2,4,9,6 },new String[] { "bon dia","ciao","ola","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","hello","dobry den","ciao","kaixo","rimaykullayki","salaam","dobry den","hei","hallo","ola","rimaykullayki" },new Integer[] { 2,4,6,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(12,"hola",4,new Integer[] { 12,2,4,6 },new String[] { "hola","bon dia","ciao","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","hello","dobry den","ciao","kaixo","rimaykullayki","salaam","dobry den","ola","hallo","ola","rimaykullayki" },new Integer[] { 12,2,4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"kaixo",4,new Integer[] { 5,12,2,4 },new String[] { "kaixo","hola","bon dia","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","hello","dobry den","ciao","kaixo","hola","salaam","dobry den","ola","hallo","ola","rimaykullayki" },new Integer[] { 5,12,2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(12,"hola",4,new Integer[] { 5,12,2,4 },new String[] { "kaixo","hola","bon dia","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","hello","dobry den","ciao","kaixo","hola","salaam","dobry den","ola","hallo","ola","rimaykullayki" },new Integer[] { 12,5,2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"ciao",4,new Integer[] { 5,12,2,4 },new String[] { "ciao","hola","bon dia","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","hello","dobry den","ciao","kaixo","hola","salaam","dobry den","ola","hallo","ola","rimaykullayki" },new Integer[] { 5,12,2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(11,"ola",4,new Integer[] { 11,5,12,2 },new String[] { "ola","ciao","hola","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","hello","dobry den","ciao","kaixo","hola","salaam","dobry den","ola","hallo","ola","rimaykullayki" },new Integer[] { 11,5,12,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(11,"ola",4,new Integer[] { 11,5,12,2 },new String[] { "ola","ciao","hola","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","hello","dobry den","ciao","kaixo","hola","salaam","dobry den","ola","hallo","ola","rimaykullayki" },new Integer[] { 11,5,12,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"namaste",4,new Integer[] { 6,11,5,12 },new String[] { "namaste","ola","ciao","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","bon dia","dobry den","ciao","kaixo","hola","salaam","dobry den","ola","hallo","ola","rimaykullayki" },new Integer[] { 6,11,5,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"dobry den",4,new Integer[] { 3,6,11,5 },new String[] { "dobry den","namaste","ola","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","bon dia","dobry den","ciao","kaixo","hola","salaam","dobry den","ola","hallo","ola","hola" },new Integer[] { 3,6,11,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"bon dia",4,new Integer[] { 2,3,6,11 },new String[] { "bon dia","dobry den","namaste","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","bon dia","dobry den","ciao","ciao","hola","salaam","dobry den","ola","hallo","ola","hola" },new Integer[] { 2,3,6,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"hallo",4,new Integer[] { 5,2,3,6 },new String[] { "hallo","bon dia","dobry den","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","bon dia","dobry den","ciao","ciao","hola","salaam","dobry den","ola","hallo","ola","hola" },new Integer[] { 5,2,3,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"dobry den",4,new Integer[] { 8,5,2,3 },new String[] { "dobry den","hallo","bon dia","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","bon dia","dobry den","ciao","ciao","namaste","salaam","dobry den","ola","hallo","ola","hola" },new Integer[] { 8,5,2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(12,"hola",4,new Integer[] { 12,8,5,2 },new String[] { "hola","dobry den","hallo","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","bon dia","dobry den","ciao","ciao","namaste","salaam","dobry den","ola","hallo","ola","hola" },new Integer[] { 12,8,5,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(10,"hallo",4,new Integer[] { 10,12,8,5 },new String[] { "hallo","hola","dobry den","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","bon dia","dobry den","ciao","ciao","namaste","salaam","dobry den","ola","hallo","ola","hola" },new Integer[] { 10,12,8,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(11,"ola",4,new Integer[] { 11,10,12,8 },new String[] { "ola","hallo","hola","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","bon dia","dobry den","ciao","hallo","namaste","salaam","dobry den","ola","hallo","ola","hola" },new Integer[] { 11,10,12,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(11,"hi",4,new Integer[] { 11,10,12,8 },new String[] { "hi","hallo","hola","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","bon dia","dobry den","ciao","hallo","namaste","salaam","dobry den","ola","hallo","ola","hola" },new Integer[] { 11,10,12,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(12,"hola",4,new Integer[] { 11,10,12,8 },new String[] { "hi","hallo","hola","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","bon dia","dobry den","ciao","hallo","namaste","salaam","dobry den","ola","hallo","ola","hola" },new Integer[] { 12,11,10,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"bon dia",4,new Integer[] { 1,11,10,12 },new String[] { "bon dia","hi","hallo","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","bon dia","dobry den","ciao","hallo","namaste","salaam","dobry den","ola","hallo","ola","hola" },new Integer[] { 1,12,11,10 }) ;
      return ok_sofar ;
  }


  static boolean test_52 ()
  {
      
      testName = "test_52" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","ola","privet","rimaykullayki","dobry den","hej","salaam","namaste","hello","ciao","hallo","hola" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(10,"rimaykullayki",4,new Integer[] { 10 },new String[] { "rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","ola","privet","rimaykullayki","dobry den","hej","salaam","namaste","hello","ciao","hallo","hola" },new Integer[] { 10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"ola",4,new Integer[] { 2,10 },new String[] { "ola","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","ola","privet","rimaykullayki","dobry den","hej","salaam","namaste","hello","ciao","hallo","hola" },new Integer[] { 2,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"salaam",4,new Integer[] { 7,2,10 },new String[] { "salaam","ola","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","ola","privet","rimaykullayki","dobry den","hej","salaam","namaste","hello","ciao","hallo","hola" },new Integer[] { 7,2,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"salaam",4,new Integer[] { 7,2,10 },new String[] { "salaam","ola","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","ola","privet","rimaykullayki","dobry den","hej","salaam","namaste","hello","ciao","hallo","hola" },new Integer[] { 7,2,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"namaste",4,new Integer[] { 8,7,2,10 },new String[] { "namaste","salaam","ola","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","ola","privet","rimaykullayki","dobry den","hej","salaam","namaste","hello","ciao","hallo","hola" },new Integer[] { 8,7,2,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"ola",4,new Integer[] { 8,7,2,10 },new String[] { "namaste","salaam","ola","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","ola","privet","rimaykullayki","dobry den","hej","salaam","namaste","hello","ciao","hallo","hola" },new Integer[] { 2,8,7,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"hei",4,new Integer[] { 1,8,7,2 },new String[] { "hei","namaste","salaam","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","ola","privet","rimaykullayki","dobry den","hej","salaam","namaste","hello","rimaykullayki","hallo","hola" },new Integer[] { 1,2,8,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(10,"kaixo",4,new Integer[] { 10,1,8,2 },new String[] { "kaixo","hei","namaste","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","ola","privet","rimaykullayki","dobry den","hej","salaam","namaste","hello","rimaykullayki","hallo","hola" },new Integer[] { 10,1,2,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"salaam",4,new Integer[] { 6,10,1,2 },new String[] { "salaam","kaixo","hei","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","ola","privet","rimaykullayki","dobry den","hej","salaam","namaste","hello","rimaykullayki","hallo","hola" },new Integer[] { 6,10,1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"hei",4,new Integer[] { 6,10,1,2 },new String[] { "salaam","kaixo","hei","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","ola","privet","rimaykullayki","dobry den","hej","salaam","namaste","hello","rimaykullayki","hallo","hola" },new Integer[] { 1,6,10,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"hello",4,new Integer[] { 9,6,10,1 },new String[] { "hello","salaam","kaixo","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","ola","privet","rimaykullayki","dobry den","hej","salaam","namaste","hello","rimaykullayki","hallo","hola" },new Integer[] { 9,1,6,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"zdravo",4,new Integer[] { 8,9,6,1 },new String[] { "zdravo","hello","salaam","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","ola","privet","rimaykullayki","dobry den","hej","salaam","namaste","hello","kaixo","hallo","hola" },new Integer[] { 8,9,1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"hei",4,new Integer[] { 8,9,6,1 },new String[] { "zdravo","hello","salaam","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","ola","privet","rimaykullayki","dobry den","hej","salaam","namaste","hello","kaixo","hallo","hola" },new Integer[] { 1,8,9,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"rimaykullayki",4,new Integer[] { 8,9,6,1 },new String[] { "zdravo","hello","salaam","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","ola","privet","rimaykullayki","dobry den","hej","salaam","namaste","hello","kaixo","hallo","hola" },new Integer[] { 1,8,9,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(11,"hei",4,new Integer[] { 11,8,9,1 },new String[] { "hei","zdravo","hello","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","ola","privet","rimaykullayki","dobry den","salaam","salaam","namaste","hello","kaixo","hallo","hola" },new Integer[] { 11,1,8,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"salaam",4,new Integer[] { 7,11,8,1 },new String[] { "salaam","hei","zdravo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","ola","privet","rimaykullayki","dobry den","salaam","salaam","namaste","hello","kaixo","hallo","hola" },new Integer[] { 7,11,1,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"privet",4,new Integer[] { 2,7,11,1 },new String[] { "privet","salaam","hei","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","ola","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","hello","kaixo","hallo","hola" },new Integer[] { 2,7,11,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(11,"rimaykullayki",4,new Integer[] { 2,7,11,1 },new String[] { "privet","salaam","rimaykullayki","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","ola","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","hello","kaixo","hallo","hola" },new Integer[] { 11,2,7,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(11,"hallo",4,new Integer[] { 2,7,11,1 },new String[] { "privet","salaam","hallo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","ola","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","hello","kaixo","hallo","hola" },new Integer[] { 11,2,7,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"privet",4,new Integer[] { 3,2,7,11 },new String[] { "privet","privet","salaam","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","ola","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","hello","kaixo","hallo","hola" },new Integer[] { 3,11,2,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"hello",4,new Integer[] { 9,3,2,11 },new String[] { "hello","privet","privet","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","ola","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","hello","kaixo","hallo","hola" },new Integer[] { 9,3,11,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(10,"kaixo",4,new Integer[] { 10,9,3,11 },new String[] { "kaixo","hello","privet","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","hello","kaixo","hallo","hola" },new Integer[] { 10,9,3,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"privet",4,new Integer[] { 10,9,3,11 },new String[] { "kaixo","hello","privet","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","hello","kaixo","hallo","hola" },new Integer[] { 3,10,9,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"salaam",4,new Integer[] { 7,10,9,3 },new String[] { "salaam","kaixo","hello","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","hello","kaixo","hallo","hola" },new Integer[] { 7,3,10,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"rimaykullayki",4,new Integer[] { 1,7,10,3 },new String[] { "rimaykullayki","salaam","kaixo","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","hello","kaixo","hallo","hola" },new Integer[] { 1,7,3,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"dobry den",4,new Integer[] { 5,1,7,3 },new String[] { "dobry den","rimaykullayki","salaam","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","hello","kaixo","hallo","hola" },new Integer[] { 5,1,7,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"privet",4,new Integer[] { 9,5,1,7 },new String[] { "privet","dobry den","rimaykullayki","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","hello","kaixo","hallo","hola" },new Integer[] { 9,5,1,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(11,"hola",4,new Integer[] { 11,9,5,1 },new String[] { "hola","privet","dobry den","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","hello","kaixo","hallo","hola" },new Integer[] { 11,9,5,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"namaste",4,new Integer[] { 6,11,9,5 },new String[] { "namaste","hola","privet","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","hello","kaixo","hallo","hola" },new Integer[] { 6,11,9,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"rimaykullayki",4,new Integer[] { 1,6,11,9 },new String[] { "rimaykullayki","namaste","hola","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","hello","kaixo","hallo","hola" },new Integer[] { 1,6,11,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"privet",4,new Integer[] { 3,1,6,11 },new String[] { "privet","rimaykullayki","namaste","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","privet","kaixo","hallo","hola" },new Integer[] { 3,1,6,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(10,"hello",4,new Integer[] { 10,3,1,6 },new String[] { "hello","privet","rimaykullayki","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","privet","kaixo","hola","hola" },new Integer[] { 10,3,1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(10,"hello",4,new Integer[] { 10,3,1,6 },new String[] { "hello","privet","rimaykullayki","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","privet","kaixo","hola","hola" },new Integer[] { 10,3,1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"namaste",4,new Integer[] { 10,3,1,6 },new String[] { "hello","privet","rimaykullayki","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","privet","kaixo","hola","hola" },new Integer[] { 6,10,3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"bon dia",4,new Integer[] { 10,3,1,6 },new String[] { "hello","bon dia","rimaykullayki","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","privet","kaixo","hola","hola" },new Integer[] { 3,6,10,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"ola",4,new Integer[] { 4,10,3,6 },new String[] { "ola","hello","bon dia","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","privet","kaixo","hola","hola" },new Integer[] { 4,3,6,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"ola",4,new Integer[] { 4,10,3,6 },new String[] { "ola","hello","bon dia","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","privet","kaixo","hola","hola" },new Integer[] { 4,3,6,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"ola",4,new Integer[] { 4,10,3,6 },new String[] { "ola","hello","bon dia","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","privet","kaixo","hola","hola" },new Integer[] { 4,3,6,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"zdravo",4,new Integer[] { 4,10,3,6 },new String[] { "zdravo","hello","bon dia","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","privet","kaixo","hola","hola" },new Integer[] { 4,3,6,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"privet",4,new Integer[] { 4,10,3,6 },new String[] { "zdravo","hello","privet","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","privet","kaixo","hola","hola" },new Integer[] { 3,4,6,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"privet",4,new Integer[] { 2,4,3,6 },new String[] { "privet","zdravo","privet","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","privet","hello","hola","hola" },new Integer[] { 2,3,4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"zdravo",4,new Integer[] { 2,4,3,6 },new String[] { "privet","zdravo","privet","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","salaam","salaam","zdravo","privet","hello","hola","hola" },new Integer[] { 4,2,3,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"salaam",4,new Integer[] { 7,2,4,3 },new String[] { "salaam","privet","zdravo","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","namaste","salaam","zdravo","privet","hello","hola","hola" },new Integer[] { 7,4,2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"privet",4,new Integer[] { 1,7,2,4 },new String[] { "privet","salaam","privet","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","namaste","salaam","zdravo","privet","hello","hola","hola" },new Integer[] { 1,7,4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"kaixo",4,new Integer[] { 1,7,2,4 },new String[] { "kaixo","salaam","privet","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","namaste","salaam","zdravo","privet","hello","hola","hola" },new Integer[] { 1,7,4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(12,"hola",4,new Integer[] { 12,1,7,4 },new String[] { "hola","kaixo","salaam","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","rimaykullayki","dobry den","namaste","salaam","zdravo","privet","hello","hola","hola" },new Integer[] { 12,1,7,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"hello",4,new Integer[] { 6,12,1,7 },new String[] { "hello","hola","kaixo","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","zdravo","dobry den","namaste","salaam","zdravo","privet","hello","hola","hola" },new Integer[] { 6,12,1,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(10,"hello",4,new Integer[] { 10,6,12,1 },new String[] { "hello","hello","hola","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","privet","privet","zdravo","dobry den","namaste","salaam","zdravo","privet","hello","hola","hola" },new Integer[] { 10,6,12,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"dobry den",4,new Integer[] { 9,10,6,12 },new String[] { "dobry den","hello","hello","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","privet","privet","zdravo","dobry den","namaste","salaam","zdravo","privet","hello","hola","hola" },new Integer[] { 9,10,6,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"privet",4,new Integer[] { 3,9,10,6 },new String[] { "privet","dobry den","hello","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","privet","privet","zdravo","dobry den","namaste","salaam","zdravo","privet","hello","hola","hola" },new Integer[] { 3,9,10,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(10,"dobry den",4,new Integer[] { 3,9,10,6 },new String[] { "privet","dobry den","dobry den","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","privet","privet","zdravo","dobry den","namaste","salaam","zdravo","privet","hello","hola","hola" },new Integer[] { 10,3,9,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"hello",4,new Integer[] { 3,9,10,6 },new String[] { "privet","dobry den","dobry den","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","privet","privet","zdravo","dobry den","namaste","salaam","zdravo","privet","hello","hola","hola" },new Integer[] { 6,10,3,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"privet",4,new Integer[] { 2,3,10,6 },new String[] { "privet","privet","dobry den","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","privet","privet","zdravo","dobry den","namaste","salaam","zdravo","dobry den","hello","hola","hola" },new Integer[] { 2,6,10,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(10,"dobry den",4,new Integer[] { 2,3,10,6 },new String[] { "privet","privet","dobry den","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","privet","privet","zdravo","dobry den","namaste","salaam","zdravo","dobry den","hello","hola","hola" },new Integer[] { 10,2,6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"ciao",4,new Integer[] { 8,2,10,6 },new String[] { "ciao","privet","dobry den","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","privet","privet","zdravo","dobry den","namaste","salaam","zdravo","dobry den","hello","hola","hola" },new Integer[] { 8,10,2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(10,"dobry den",4,new Integer[] { 8,2,10,6 },new String[] { "ciao","privet","dobry den","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","privet","privet","zdravo","dobry den","namaste","salaam","zdravo","dobry den","hello","hola","hola" },new Integer[] { 10,8,2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"kaixo",4,new Integer[] { 1,8,2,10 },new String[] { "kaixo","ciao","privet","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","privet","privet","zdravo","dobry den","hello","salaam","zdravo","dobry den","hello","hola","hola" },new Integer[] { 1,10,8,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(12,"hola",4,new Integer[] { 12,1,8,10 },new String[] { "hola","kaixo","ciao","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","privet","privet","zdravo","dobry den","hello","salaam","zdravo","dobry den","hello","hola","hola" },new Integer[] { 12,1,10,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"dobry den",4,new Integer[] { 9,12,1,10 },new String[] { "dobry den","hola","kaixo","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","privet","privet","zdravo","dobry den","hello","salaam","ciao","dobry den","hello","hola","hola" },new Integer[] { 9,12,1,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"dobry den",4,new Integer[] { 9,12,1,10 },new String[] { "dobry den","hola","kaixo","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","privet","privet","zdravo","dobry den","hello","salaam","ciao","dobry den","hello","hola","hola" },new Integer[] { 9,12,1,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(10,"namaste",4,new Integer[] { 9,12,1,10 },new String[] { "dobry den","hola","kaixo","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","privet","privet","zdravo","dobry den","hello","salaam","ciao","dobry den","hello","hola","hola" },new Integer[] { 10,9,12,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"namaste",4,new Integer[] { 8,9,12,10 },new String[] { "namaste","dobry den","hola","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","privet","privet","zdravo","dobry den","hello","salaam","ciao","dobry den","hello","hola","hola" },new Integer[] { 8,10,9,12 }) ;
      return ok_sofar ;
  }


  static boolean test_53 ()
  {
      
      testName = "test_53" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab6.constructor(3,new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "salaam","dobry den","rimaykullayki","kaixo","ciao","hallo","privet","ola","hi" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"bon dia",3,new Integer[] { 2 },new String[] { "bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "salaam","dobry den","rimaykullayki","kaixo","ciao","hallo","privet","ola","hi" },new Integer[] { 2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"hi",3,new Integer[] { 9,2 },new String[] { "hi","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "salaam","dobry den","rimaykullayki","kaixo","ciao","hallo","privet","ola","hi" },new Integer[] { 9,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"kaixo",3,new Integer[] { 4,9,2 },new String[] { "kaixo","hi","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "salaam","dobry den","rimaykullayki","kaixo","ciao","hallo","privet","ola","hi" },new Integer[] { 4,9,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"privet",3,new Integer[] { 1,4,9 },new String[] { "privet","kaixo","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "salaam","bon dia","rimaykullayki","kaixo","ciao","hallo","privet","ola","hi" },new Integer[] { 1,4,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"ciao",3,new Integer[] { 5,1,4 },new String[] { "ciao","privet","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "salaam","bon dia","rimaykullayki","kaixo","ciao","hallo","privet","ola","hi" },new Integer[] { 5,1,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"kaixo",3,new Integer[] { 5,1,4 },new String[] { "ciao","privet","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "salaam","bon dia","rimaykullayki","kaixo","ciao","hallo","privet","ola","hi" },new Integer[] { 4,5,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"dobry den",3,new Integer[] { 9,5,4 },new String[] { "dobry den","ciao","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "privet","bon dia","rimaykullayki","kaixo","ciao","hallo","privet","ola","hi" },new Integer[] { 9,4,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"privet",3,new Integer[] { 1,9,4 },new String[] { "privet","dobry den","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "privet","bon dia","rimaykullayki","kaixo","ciao","hallo","privet","ola","hi" },new Integer[] { 1,9,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"kaixo",3,new Integer[] { 1,9,4 },new String[] { "kaixo","dobry den","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "privet","bon dia","rimaykullayki","kaixo","ciao","hallo","privet","ola","hi" },new Integer[] { 1,9,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"dobry den",3,new Integer[] { 2,1,9 },new String[] { "dobry den","kaixo","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "privet","bon dia","rimaykullayki","kaixo","ciao","hallo","privet","ola","hi" },new Integer[] { 2,1,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"kaixo",3,new Integer[] { 4,2,1 },new String[] { "kaixo","dobry den","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "privet","bon dia","rimaykullayki","kaixo","ciao","hallo","privet","ola","dobry den" },new Integer[] { 4,2,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"hallo",3,new Integer[] { 6,4,2 },new String[] { "hallo","kaixo","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","bon dia","rimaykullayki","kaixo","ciao","hallo","privet","ola","dobry den" },new Integer[] { 6,4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"salaam",3,new Integer[] { 3,6,4 },new String[] { "salaam","hallo","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","dobry den","rimaykullayki","kaixo","ciao","hallo","privet","ola","dobry den" },new Integer[] { 3,6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"dobry den",3,new Integer[] { 2,3,6 },new String[] { "dobry den","salaam","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","dobry den","rimaykullayki","kaixo","ciao","hallo","privet","ola","dobry den" },new Integer[] { 2,3,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"hallo",3,new Integer[] { 2,3,6 },new String[] { "dobry den","salaam","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","dobry den","rimaykullayki","kaixo","ciao","hallo","privet","ola","dobry den" },new Integer[] { 6,2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"kaixo",3,new Integer[] { 4,2,6 },new String[] { "kaixo","dobry den","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","dobry den","salaam","kaixo","ciao","hallo","privet","ola","dobry den" },new Integer[] { 4,6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"bon dia",3,new Integer[] { 9,4,6 },new String[] { "bon dia","kaixo","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","dobry den","salaam","kaixo","ciao","hallo","privet","ola","dobry den" },new Integer[] { 9,4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"hallo",3,new Integer[] { 9,4,6 },new String[] { "bon dia","kaixo","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","dobry den","salaam","kaixo","ciao","hallo","privet","ola","dobry den" },new Integer[] { 6,9,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"namaste",3,new Integer[] { 5,9,6 },new String[] { "namaste","bon dia","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","dobry den","salaam","kaixo","ciao","hallo","privet","ola","dobry den" },new Integer[] { 5,6,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"kaixo",3,new Integer[] { 4,5,6 },new String[] { "kaixo","namaste","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","dobry den","salaam","kaixo","ciao","hallo","privet","ola","bon dia" },new Integer[] { 4,5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"salaam",3,new Integer[] { 3,4,5 },new String[] { "salaam","kaixo","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","dobry den","salaam","kaixo","ciao","hallo","privet","ola","bon dia" },new Integer[] { 3,4,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"kaixo",3,new Integer[] { 3,4,5 },new String[] { "salaam","kaixo","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","dobry den","salaam","kaixo","ciao","hallo","privet","ola","bon dia" },new Integer[] { 4,3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"kaixo",3,new Integer[] { 8,3,4 },new String[] { "kaixo","salaam","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","dobry den","salaam","kaixo","namaste","hallo","privet","ola","bon dia" },new Integer[] { 8,4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"dobry den",3,new Integer[] { 1,8,4 },new String[] { "dobry den","kaixo","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","dobry den","salaam","kaixo","namaste","hallo","privet","ola","bon dia" },new Integer[] { 1,8,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"hej",3,new Integer[] { 1,8,4 },new String[] { "dobry den","kaixo","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","dobry den","salaam","kaixo","namaste","hallo","privet","ola","bon dia" },new Integer[] { 4,1,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"kaixo",3,new Integer[] { 1,8,4 },new String[] { "dobry den","kaixo","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","dobry den","salaam","kaixo","namaste","hallo","privet","ola","bon dia" },new Integer[] { 8,4,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"zdravo",3,new Integer[] { 1,8,4 },new String[] { "dobry den","kaixo","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "kaixo","dobry den","salaam","kaixo","namaste","hallo","privet","ola","bon dia" },new Integer[] { 4,8,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"salaam",3,new Integer[] { 3,8,4 },new String[] { "salaam","kaixo","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","dobry den","salaam","kaixo","namaste","hallo","privet","ola","bon dia" },new Integer[] { 3,4,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"privet",3,new Integer[] { 3,8,4 },new String[] { "privet","kaixo","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","dobry den","salaam","kaixo","namaste","hallo","privet","ola","bon dia" },new Integer[] { 3,4,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"namaste",3,new Integer[] { 5,3,4 },new String[] { "namaste","privet","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","dobry den","salaam","kaixo","namaste","hallo","privet","kaixo","bon dia" },new Integer[] { 5,3,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"hej",3,new Integer[] { 9,5,3 },new String[] { "hej","namaste","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","dobry den","salaam","zdravo","namaste","hallo","privet","kaixo","bon dia" },new Integer[] { 9,5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(7,"hello",3,new Integer[] { 7,9,5 },new String[] { "hello","hej","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","dobry den","privet","zdravo","namaste","hallo","privet","kaixo","bon dia" },new Integer[] { 7,9,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"ciao",3,new Integer[] { 1,7,9 },new String[] { "ciao","hello","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","dobry den","privet","zdravo","namaste","hallo","privet","kaixo","bon dia" },new Integer[] { 1,7,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"hej",3,new Integer[] { 1,7,9 },new String[] { "ciao","hello","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","dobry den","privet","zdravo","namaste","hallo","privet","kaixo","bon dia" },new Integer[] { 9,1,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"zdravo",3,new Integer[] { 4,1,9 },new String[] { "zdravo","ciao","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "dobry den","dobry den","privet","zdravo","namaste","hallo","hello","kaixo","bon dia" },new Integer[] { 4,9,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"bon dia",3,new Integer[] { 2,4,9 },new String[] { "bon dia","zdravo","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","dobry den","privet","zdravo","namaste","hallo","hello","kaixo","bon dia" },new Integer[] { 2,4,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"bon dia",3,new Integer[] { 3,2,4 },new String[] { "bon dia","bon dia","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","dobry den","privet","zdravo","namaste","hallo","hello","kaixo","hej" },new Integer[] { 3,2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"hej",3,new Integer[] { 3,2,4 },new String[] { "bon dia","hej","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","dobry den","privet","zdravo","namaste","hallo","hello","kaixo","hej" },new Integer[] { 2,3,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"zdravo",3,new Integer[] { 3,2,4 },new String[] { "bon dia","hej","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","dobry den","privet","zdravo","namaste","hallo","hello","kaixo","hej" },new Integer[] { 4,2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"rimaykullayki",3,new Integer[] { 8,2,4 },new String[] { "rimaykullayki","hej","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","dobry den","bon dia","zdravo","namaste","hallo","hello","kaixo","hej" },new Integer[] { 8,4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"hi",3,new Integer[] { 3,8,4 },new String[] { "hi","rimaykullayki","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hej","bon dia","zdravo","namaste","hallo","hello","kaixo","hej" },new Integer[] { 3,8,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"rimaykullayki",3,new Integer[] { 3,8,4 },new String[] { "hi","rimaykullayki","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hej","bon dia","zdravo","namaste","hallo","hello","kaixo","hej" },new Integer[] { 4,3,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"namaste",3,new Integer[] { 5,3,4 },new String[] { "namaste","hi","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hej","bon dia","zdravo","namaste","hallo","hello","rimaykullayki","hej" },new Integer[] { 5,4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"namaste",3,new Integer[] { 5,3,4 },new String[] { "namaste","hi","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hej","bon dia","zdravo","namaste","hallo","hello","rimaykullayki","hej" },new Integer[] { 5,4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(9,"hej",3,new Integer[] { 9,5,4 },new String[] { "hej","namaste","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hej","hi","zdravo","namaste","hallo","hello","rimaykullayki","hej" },new Integer[] { 9,5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"hej",3,new Integer[] { 9,5,4 },new String[] { "hej","namaste","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hej","hi","zdravo","namaste","hallo","hello","rimaykullayki","hej" },new Integer[] { 4,9,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hej",3,new Integer[] { 2,9,4 },new String[] { "hej","hej","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hej","hi","zdravo","namaste","hallo","hello","rimaykullayki","hej" },new Integer[] { 2,4,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"hi",3,new Integer[] { 3,2,4 },new String[] { "hi","hej","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hej","hi","zdravo","namaste","hallo","hello","rimaykullayki","hej" },new Integer[] { 3,2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"bon dia",3,new Integer[] { 5,3,2 },new String[] { "bon dia","hi","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hej","hi","hej","namaste","hallo","hello","rimaykullayki","hej" },new Integer[] { 5,3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"hello",3,new Integer[] { 7,5,3 },new String[] { "hello","bon dia","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hej","hi","hej","namaste","hallo","hello","rimaykullayki","hej" },new Integer[] { 7,5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"bon dia",3,new Integer[] { 7,5,3 },new String[] { "hello","bon dia","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hej","hi","hej","namaste","hallo","hello","rimaykullayki","hej" },new Integer[] { 5,7,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"hallo",3,new Integer[] { 8,7,5 },new String[] { "hallo","hello","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hej","hi","hej","namaste","hallo","hello","rimaykullayki","hej" },new Integer[] { 8,5,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(7,"hello",3,new Integer[] { 8,7,5 },new String[] { "hallo","hello","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hej","hi","hej","namaste","hallo","hello","rimaykullayki","hej" },new Integer[] { 7,8,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(1,"rimaykullayki",3,new Integer[] { 1,8,7 },new String[] { "rimaykullayki","hallo","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hej","hi","hej","bon dia","hallo","hello","rimaykullayki","hej" },new Integer[] { 1,7,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"rimaykullayki",3,new Integer[] { 1,8,7 },new String[] { "rimaykullayki","hallo","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hej","hi","hej","bon dia","hallo","hello","rimaykullayki","hej" },new Integer[] { 1,7,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"hallo",3,new Integer[] { 6,1,7 },new String[] { "hallo","rimaykullayki","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hej","hi","hej","bon dia","hallo","hello","hallo","hej" },new Integer[] { 6,1,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(3,"hi",3,new Integer[] { 3,6,1 },new String[] { "hi","hallo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hej","hi","hej","bon dia","hallo","hello","hallo","hej" },new Integer[] { 3,6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(4,"hej",3,new Integer[] { 4,3,6 },new String[] { "hej","hi","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","hej","hi","hej","bon dia","hallo","hello","hallo","hej" },new Integer[] { 4,3,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"hi",3,new Integer[] { 4,3,6 },new String[] { "hej","hi","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","hej","hi","hej","bon dia","hallo","hello","hallo","hej" },new Integer[] { 3,4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(4,"hei",3,new Integer[] { 4,3,6 },new String[] { "hei","hi","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","hej","hi","hej","bon dia","hallo","hello","hallo","hej" },new Integer[] { 4,3,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(5,"salaam",3,new Integer[] { 5,4,3 },new String[] { "salaam","hei","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","hej","hi","hej","bon dia","hallo","hello","hallo","hej" },new Integer[] { 5,4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(6,"hallo",3,new Integer[] { 6,5,4 },new String[] { "hallo","salaam","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","hej","hi","hej","bon dia","hallo","hello","hallo","hej" },new Integer[] { 6,5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"hi",3,new Integer[] { 9,6,5 },new String[] { "hi","hallo","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","hej","hi","hei","bon dia","hallo","hello","hallo","hej" },new Integer[] { 9,6,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(2,"hej",3,new Integer[] { 2,9,6 },new String[] { "hej","hi","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","hej","hi","hei","salaam","hallo","hello","hallo","hej" },new Integer[] { 2,9,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(2,"ciao",3,new Integer[] { 2,9,6 },new String[] { "ciao","hi","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","hej","hi","hei","salaam","hallo","hello","hallo","hej" },new Integer[] { 2,9,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"salaam",3,new Integer[] { 5,2,9 },new String[] { "salaam","ciao","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","hej","hi","hei","salaam","hallo","hello","hallo","hej" },new Integer[] { 5,2,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(7,"hello",3,new Integer[] { 7,5,2 },new String[] { "hello","salaam","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","hej","hi","hei","salaam","hallo","hello","hallo","hi" },new Integer[] { 7,5,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(7,"hi",3,new Integer[] { 7,5,2 },new String[] { "hi","salaam","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","hej","hi","hei","salaam","hallo","hello","hallo","hi" },new Integer[] { 7,5,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(7,"hola",3,new Integer[] { 7,5,2 },new String[] { "hola","salaam","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","hej","hi","hei","salaam","hallo","hello","hallo","hi" },new Integer[] { 7,5,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(5,"salaam",3,new Integer[] { 7,5,2 },new String[] { "hola","salaam","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","hej","hi","hei","salaam","hallo","hello","hallo","hi" },new Integer[] { 5,7,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(1,"rimaykullayki",3,new Integer[] { 1,7,5 },new String[] { "rimaykullayki","hola","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","ciao","hi","hei","salaam","hallo","hello","hallo","hi" },new Integer[] { 1,5,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"namaste",3,new Integer[] { 8,1,5 },new String[] { "namaste","rimaykullayki","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","ciao","hi","hei","salaam","hallo","hola","hallo","hi" },new Integer[] { 8,1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"namaste",3,new Integer[] { 8,1,5 },new String[] { "namaste","rimaykullayki","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","ciao","hi","hei","salaam","hallo","hola","hallo","hi" },new Integer[] { 8,1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"hi",3,new Integer[] { 3,8,1 },new String[] { "hi","namaste","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","ciao","hi","hei","salaam","hallo","hola","hallo","hi" },new Integer[] { 3,8,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(9,"kaixo",3,new Integer[] { 9,3,8 },new String[] { "kaixo","hi","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","ciao","hi","hei","salaam","hallo","hola","hallo","hi" },new Integer[] { 9,3,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(8,"bon dia",3,new Integer[] { 9,3,8 },new String[] { "kaixo","hi","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","ciao","hi","hei","salaam","hallo","hola","hallo","hi" },new Integer[] { 8,9,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"bon dia",3,new Integer[] { 9,3,8 },new String[] { "kaixo","hi","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","ciao","hi","hei","salaam","hallo","hola","hallo","hi" },new Integer[] { 8,9,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(8,"bon dia",3,new Integer[] { 9,3,8 },new String[] { "kaixo","hi","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","ciao","hi","hei","salaam","hallo","hola","hallo","hi" },new Integer[] { 8,9,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.put(6,"kaixo",3,new Integer[] { 6,9,8 },new String[] { "kaixo","kaixo","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","ciao","hi","hei","salaam","hallo","hola","hallo","hi" },new Integer[] { 6,8,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab6.get(3,"hi",3,new Integer[] { 3,6,8 },new String[] { "hi","kaixo","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","ciao","hi","hei","salaam","hallo","hola","hallo","kaixo" },new Integer[] { 3,6,8 }) ;
      return ok_sofar ;
  }



  @SuppressWarnings("unchecked")
  static boolean constructor(int cacheSize,
                             Integer[] storageKeys,
                             String[] storageValues) {
      boolean ok_sofar = true;

      Storage<Integer,String> storage =
        new Storage<Integer,String>(storageKeys,storageValues);
      TesterLab6.storage = storage;

      callSeq += "\n  Initial storage:";
      callSeq += "\n    "+TesterLab6.storage+"\n";
      callSeq += "\n  Cache<..> cache = new Cache<..>("+cacheSize+");";

      try {
        cache = new Cache<Integer,String>(cacheSize, storage);
      } catch ( Throwable exc ) {
	  printCallException(exc);
	  ok_sofar = false;
      }

      if (ok_sofar) {
	  try {
	      mapField = cache.getClass().getDeclaredField("cacheContents");
	      mapField.setAccessible(true);
	      TesterLab6.map =
                (Map<Integer,CacheCell<Integer,String>>)
                mapField.get(cache);
	  } catch ( Throwable exc ) {
	      printCallException("access the field map",exc);
	      ok_sofar = false;
	      return false;
	  }

	  try {
	      mapField = cache.getClass().getDeclaredField("keyListLRU");
	      mapField.setAccessible(true);
	      TesterLab6.lru = (PositionList<Integer>) mapField.get(cache);
	  } catch ( Throwable exc ) {
	      printCallException("access the field lru",exc);
	      ok_sofar = false;
	      return false;
	  }
      }

      return true;
  }

  static boolean get(int key,
                     String expected,
                     int cacheSize,
                     Integer[] cacheKeys,
                     String[] cacheValues,
                     Integer[] storageKeys,
                     String[] storageValues,
                     Integer[] lruKeys) {
      boolean ok_sofar = true;

      String call = "cache.get("+key+")";
      callSeq += "\n  "+call+";";

      try {
        String result = cache.get(key);
        if (!expected.equals(result)) {
          printError
            (ExecutionTime.LAST,
             "\nthe call "+call+" returned the value "+result+
             " but should have returned "+expected);
          ok_sofar = false;
          return ok_sofar;
        }
      } catch ( Throwable exc ) {
	  printCallException(exc);
          System.out.println
            ("\nMap contents: "+TesterLab6.map+"\n"+
             "lru contents: "+TesterLab6.lru);
	  ok_sofar = false;
          return ok_sofar;
      }

      ok_sofar =
        checkLRUandMapStorage(callSeq,
                              cacheKeys,
                              cacheValues,
                              storageKeys,
                              storageValues,
                              lruKeys);

      return ok_sofar;
  }

  static boolean put(int key,
                     String value,
                     int cacheSize,
                     Integer[] cacheKeys,
                     String[] cacheValues,
                     Integer[] storageKeys,
                     String[] storageValues,
                     Integer[] lruKeys) {
      boolean ok_sofar = true;

      callSeq += "\n  cache.put("+key+",\""+value+"\");";

      try {
        cache.put(key,value);
      } catch ( Throwable exc ) {
	  printCallException(exc);
          System.out.println
            ("\nMap contents: "+TesterLab6.map+"\n"+
             "lru contents: "+TesterLab6.lru);
	  ok_sofar = false;
          return ok_sofar;
      }

      ok_sofar =
        checkLRUandMapStorage(callSeq,
                              cacheKeys,
                              cacheValues,
                              storageKeys,
                              storageValues,
                              lruKeys);

      return ok_sofar;
  }

  static boolean checkLRUandMapStorage(String callSeq,
                                       Integer[] cacheKeys,
                                       String[] cacheValues,
                                       Integer[] storageKeys,
                                       String[] storageValues,
                                       Integer[] lruKeys) {
    boolean ok_sofar = true;

    if (ok_sofar)
      ok_sofar =
        checkExternallyConsistent(callSeq, cacheKeys, cacheValues, lruKeys);

    if (ok_sofar)
      ok_sofar =
        checkStorageExternallyConsistent(callSeq, storageKeys, storageValues);

    return ok_sofar;
  }

  static boolean checkExternallyConsistent(String callSeq,
                                           Integer[] cacheKeys,
                                           String[] cacheValues,
                                           Integer[] lruKeys) {
    boolean ok_sofar = true;

    HashSet<Entry<Integer,String>> expected =
      new HashSet<Entry<Integer,String>>();
    HashSet<Entry<Integer,String>> lru =
      new HashSet<Entry<Integer,String>>();

    if (TesterLab6.lru.size() != TesterLab6.map.size()) {
      printError
        (ExecutionTime.AFTER,
         "\nthe size of the map and the lru differ:\n\n"+
         "Map contents: "+TesterLab6.map+"\n"+
         "lru contents: "+TesterLab6.lru);
      ok_sofar = false;
      return false;
    }

    if (lruKeys.length != TesterLab6.lru.size()) {
      printError
        (ExecutionTime.AFTER,
         "\nlru should contain entries with the keys "+printArray(lruKeys)+
         " but contains the entries "+TesterLab6.lru+"\n\n"+
         "Map contents: "+TesterLab6.map+"\n"+
         "lru contents: "+TesterLab6.lru);
      return false;
    }

    Position<Integer> cursor = TesterLab6.lru.first();
    for (int i=0; i<lruKeys.length; i++) {
      Integer key = cursor.element();
      if (key == null) {
        printError
          (ExecutionTime.AFTER,
           "\nlru contains a null key: "+TesterLab6.lru+"\n"+
           "Map contents: "+TesterLab6.map+"\n"+
           "lru contents: "+TesterLab6.lru);
        return false;
      }

      if (!lruKeys[i].equals(key)) {
        printError
          (ExecutionTime.AFTER,
           "\nlru should contain keys in the order "+printArray(lruKeys)+"\n"+
           "lru contents: "+TesterLab6.lru+"\n"+
           "Map contents: "+TesterLab6.map+"\n");
        return false;
      }

      CacheCell<Integer,String> cell = TesterLab6.map.get(key);
      if (cell == null) {
        printError
          (ExecutionTime.AFTER,
           "\nlru contains a key "+key+" that has no entry in map\n"+
           "lru contents: "+TesterLab6.lru+"\n"+
           "Map contents: "+TesterLab6.map+"\n");
        return false;
      }

      if (cell.getPos() != cursor) {
        printError
          (ExecutionTime.AFTER,
           "\nthe call get("+key+") returns a cell "+cell+
           " with a position that is different from the lru position"+
           " which has key "+key+" as an element\n"+
           "lru contents: "+TesterLab6.lru+"\n"+
           "Map contents: "+TesterLab6.map+"\n");
        return false;
      }

      lru.add(new EntryImpl<Integer,String>(key, cell.getValue()));
      cursor = TesterLab6.lru.next(cursor);
    }

    for (int i=0; i<cacheKeys.length; i++) {
      expected.add(new EntryImpl<Integer,String>(cacheKeys[i], cacheValues[i]));
    }

    ok_sofar =
      ok_sofar && expected.equals(lru);

    if (!ok_sofar) {
      printError
        (ExecutionTime.AFTER,
         "\nmap contains key-value pairs: "+lru+
         "\nbut should contain "+expected+"\n"+
         "\nlru contents: "+TesterLab6.lru+"\n"+
         "Map contents: "+TesterLab6.map+"\n");
      ok_sofar = false;
    }

    return ok_sofar;
  }
  
  static boolean checkStorageExternallyConsistent(String callSeq,
                                                  Integer[] cacheKeys,
                                                  String[] cacheValues) {
    boolean ok_sofar = true;

    HashSet<Entry<Integer,String>> expected =
      new HashSet<Entry<Integer,String>>();
    HashSet<Entry<Integer,String>> storage =
      new HashSet<Entry<Integer,String>>();

    for (int i=0; i<cacheKeys.length; i++) {
      expected.add(new EntryImpl<Integer,String>(cacheKeys[i], cacheValues[i]));
    }

    for (java.util.Map.Entry<Integer,String> entry : TesterLab6.storage.entrySet()) {
      storage.add(new EntryImpl<Integer,String>(entry.getKey(), entry.getValue()));
    }

    ok_sofar =
      ok_sofar && expected.equals(storage);

    ArrayList<Entry<Integer,String>> expectedList =
      new ArrayList<Entry<Integer,String>>();
    ArrayList<Entry<Integer,String>> storageList =
      new ArrayList<Entry<Integer,String>>();

    for (java.util.Map.Entry<Integer,String> expectedEntry : TesterLab6.storage.entrySet()) {
      storageList.add(new EntryImpl<Integer,String>(expectedEntry.getKey(), expectedEntry.getValue()));
    }

    for (int i=0; i<cacheKeys.length; i++) {
      expectedList.add(new EntryImpl<Integer,String>(cacheKeys[i], cacheValues[i]));
    }

    Collections.sort(storageList, new EntryComparator());
    Collections.sort(expectedList, new EntryComparator());

    if (!ok_sofar) {
      printError
        (ExecutionTime.AFTER,
         "\nstorage contains   "+storageList+
         "\nbut should contain "+expectedList);
      ok_sofar = false;
      return false;
    }

    return ok_sofar;
  }
  
  static int test_type_to_index(String test_type) {
      if (test_type.equals("cache")) return 0;
      System.out.println("*** Error: test "+test_type+" unknown.");
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
      for (int i=0; i<results_sofar.length; i++) {
	  if (results_sofar[i])
	      ++successes;
      }
      return successes >= results_sofar.length;
  }

static void report_results(String tester, boolean results_sofar[], boolean general_results) {
      System.out.println("\n++++++++++++++++++++++++++++++++++++++++++\n");

      for (int i=0; i<results_sofar.length; i++) {
	  String testName="";
	  if (i==0) testName = "cache";

	  System.out.print("Testing results for "+testName+": ");
	  if (results_sofar[i])
	      System.out.println("succeeded");
	  else
	      System.out.println("failed");

      }

      System.out.println("\n------------------------------------------");
      if (results_ok(results_sofar,general_results)) {
	  System.out.println("\n"+tester+": Test finalizado correctamente.");
	  System.out.println("\n\n");
      }
      else
	  System.out.println("\n"+tester+": errores detectados.\n");
  }


  static void printWarning(String TestName) {
      System.out.println("\n*** Warning in "+TestName+":\n");
  }

  static void printError(String TestName) {
      System.out.println("\n*** Error in "+TestName+":\n");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

    static void printCallException(ExecutionTime time, String msg, Throwable exc) {
      System.out.println("\n*** Error in "+testName+":\n");

      if (!callSeq.equals("")) {
	  System.out.print(callSeqString(time));
	  System.out.println();
	  System.out.println(callSeq);
          
      }

      switch (time) {
      case AFTER:
	  System.out.println("\nthe call to "+msg+" raised the exception "+exc+
			     " although it should not have\n");
	  break;
      default:
	  System.out.println("\nthe exception "+exc+" was raised although it "+
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
      System.out.println("\n*** Error in "+testName+":\n");
      System.out.print(callSeqString(time));
      System.out.println();
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
}

class EntryComparator implements Comparator<Entry<Integer,String>> {
  public int compare(Entry<Integer,String> e1, Entry<Integer,String> e2) {
    if (e1 == e2) return 0;
    if (e1.getKey() == null) return -1;
    if (e2.getKey() == null) return 1;
    return e1.getKey() - e2.getKey();
  }
}




