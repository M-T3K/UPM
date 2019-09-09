
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
// File generated at: 2018/11/11 -- 12:14:29
// Seed: {1541,934868,251791}
//
//////////////////////////////////////////////////////////////////////



package aed.huffman;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.indexedlist.*;
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
public class TesterLab4 {

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

  static String tester = "TesterLab4";

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

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_21());

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_22());

    if (ResultsHandler.local_results_ok_sofar("constructor"))
      ResultsHandler.add_result("constructor",test_23());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_24());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_25());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_26());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_27());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_28());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_29());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_30());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_31());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_32());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_33());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_34());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_35());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_36());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_37());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_38());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_39());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_40());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_41());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_42());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_43());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_44());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_45());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_46());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_47());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_48());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_49());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_50());

    if (ResultsHandler.local_results_ok_sofar("encode"))
      ResultsHandler.add_result("encode",test_51());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_52());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_53());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_54());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_55());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_56());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_57());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_58());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_59());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_60());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_61());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_62());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_63());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_64());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_65());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_66());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_67());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_68());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_69());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_70());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_71());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_72());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_73());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_74());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_75());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_76());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_77());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_78());

    if (ResultsHandler.local_results_ok_sofar("decode"))
      ResultsHandler.add_result("decode",test_79());


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
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)98)) ;
      ok_sofar = new aed.huffman.Constructor(new CharCode[] { new CharCode(97,new String("0")),new CharCode(98,new String("1")) }).doCall().checkResult(tree) ;
    }
    return ok_sofar ;
  }



  static boolean test_3 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_3") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)98)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)99)) ;
      ok_sofar = new aed.huffman.Constructor(new CharCode[] { new CharCode(97,new String("0")),new CharCode(98,new String("10")),new CharCode(99,new String("11")) }).doCall().checkResult(tree) ;
    }
    return ok_sofar ;
  }



  static boolean test_4 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_4") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)97)) ;
      Position<Character> var3 = tree.insertRight(root,((char)99)) ;
      ok_sofar = new aed.huffman.Constructor(new CharCode[] { new CharCode(97,new String("01")),new CharCode(98,new String("00")),new CharCode(99,new String("1")) }).doCall().checkResult(tree) ;
    }
    return ok_sofar ;
  }



  static boolean test_5 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_5") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)99)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)114)) ;
      Position<Character> var5 = tree.insertRight(var1,((char)101)) ;
      Position<Character> var6 = tree.insertRight(var0,((char)116)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)104)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)109)) ;
      Position<Character> var12 = tree.insertRight(var8,((char)97)) ;
      Position<Character> var13 = tree.insertRight(var7,((char)100)) ;
      ok_sofar = new aed.huffman.Constructor(new CharCode[] { new CharCode(109,new String("1001")),new CharCode(101,new String("001")),new CharCode(114,new String("0001")),new CharCode(97,new String("101")),new CharCode(116,new String("01")),new CharCode(104,new String("1000")),new CharCode(100,new String("11")),new CharCode(99,new String("0000")) }).doCall().checkResult(tree) ;
    }
    return ok_sofar ;
  }



  static boolean test_6 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_6") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)101)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)105)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)116)) ;
      Position<Character> var8 = tree.insertRight(var4,((char)111)) ;
      Position<Character> var9 = tree.insertRight(var3,((char)100)) ;
      Position<Character> var10 = tree.insertRight(var2,((char)110)) ;
      Position<Character> var11 = tree.insertRight(root,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)115)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)98)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)99)) ;
      ok_sofar = new aed.huffman.Constructor(new CharCode[] { new CharCode(100,new String("0101")),new CharCode(98,new String("110")),new CharCode(105,new String("010000")),new CharCode(116,new String("010001")),new CharCode(110,new String("011")),new CharCode(101,new String("00")),new CharCode(99,new String("111")),new CharCode(111,new String("01001")),new CharCode(115,new String("10")) }).doCall().checkResult(tree) ;
    }
    return ok_sofar ;
  }



  static boolean test_7 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_7") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)110)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)116)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)100)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)102)) ;
      Position<Character> var8 = tree.insertRight(var4,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)99)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)101)) ;
      Position<Character> var11 = tree.insertRight(root,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)109)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)114)) ;
      Position<Character> var15 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)105)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)111)) ;
      ok_sofar = new aed.huffman.Constructor(new CharCode[] { new CharCode(102,new String("0101")),new CharCode(99,new String("0110")),new CharCode(109,new String("100")),new CharCode(114,new String("101")),new CharCode(100,new String("0100")),new CharCode(116,new String("001")),new CharCode(110,new String("000")),new CharCode(101,new String("0111")),new CharCode(105,new String("110")),new CharCode(111,new String("111")) }).doCall().checkResult(tree) ;
    }
    return ok_sofar ;
  }



  static boolean test_8 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_8") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)117)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)114)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)101)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)104)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)110)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)98)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)103)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)116)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)111)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)102)) ;
      ok_sofar = new aed.huffman.Constructor(new CharCode[] { new CharCode(102,new String("11111")),new CharCode(116,new String("1110")),new CharCode(104,new String("011")),new CharCode(110,new String("100")),new CharCode(98,new String("101")),new CharCode(101,new String("010")),new CharCode(114,new String("001")),new CharCode(111,new String("11110")),new CharCode(117,new String("000")),new CharCode(103,new String("110")) }).doCall().checkResult(tree) ;
    }
    return ok_sofar ;
  }



  static boolean test_9 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_9") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)100)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)105)) ;
      Position<Character> var5 = tree.insertRight(var1,((char)98)) ;
      Position<Character> var6 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)97)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)104)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)116)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)110)) ;
      Position<Character> var13 = tree.insertRight(root,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)111)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)115)) ;
      Position<Character> var17 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)101)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)117)) ;
      ok_sofar = new aed.huffman.Constructor(new CharCode[] { new CharCode(101,new String("110")),new CharCode(104,new String("0110")),new CharCode(100,new String("0000")),new CharCode(115,new String("101")),new CharCode(105,new String("0001")),new CharCode(97,new String("010")),new CharCode(98,new String("001")),new CharCode(111,new String("100")),new CharCode(116,new String("01110")),new CharCode(117,new String("111")),new CharCode(110,new String("01111")) }).doCall().checkResult(tree) ;
    }
    return ok_sofar ;
  }



  static boolean test_10 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_10") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)114)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)104)) ;
      Position<Character> var6 = tree.insertRight(var2,((char)115)) ;
      Position<Character> var7 = tree.insertRight(var1,((char)121)) ;
      Position<Character> var8 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)97)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)99)) ;
      Position<Character> var12 = tree.insertRight(var8,((char)105)) ;
      Position<Character> var13 = tree.insertRight(root,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)111)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)45)) ;
      Position<Character> var17 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)101)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)116)) ;
      ok_sofar = new aed.huffman.Constructor(new CharCode[] { new CharCode(104,new String("00001")),new CharCode(116,new String("111")),new CharCode(121,new String("001")),new CharCode(97,new String("0100")),new CharCode(105,new String("011")),new CharCode(111,new String("100")),new CharCode(115,new String("0001")),new CharCode(45,new String("101")),new CharCode(99,new String("0101")),new CharCode(114,new String("00000")),new CharCode(101,new String("110")) }).doCall().checkResult(tree) ;
    }
    return ok_sofar ;
  }



  static boolean test_11 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_11") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)99)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)116)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)110)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)114)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)115)) ;
      Position<Character> var9 = tree.insertRight(root,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)101)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)112)) ;
      Position<Character> var13 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)103)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)111)) ;
      Position<Character> var17 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)105)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)104)) ;
      ok_sofar = new aed.huffman.Constructor(new CharCode[] { new CharCode(104,new String("1111")),new CharCode(111,new String("1101")),new CharCode(103,new String("1100")),new CharCode(114,new String("01110")),new CharCode(105,new String("1110")),new CharCode(110,new String("0110")),new CharCode(99,new String("00")),new CharCode(116,new String("010")),new CharCode(112,new String("101")),new CharCode(101,new String("100")),new CharCode(115,new String("01111")) }).doCall().checkResult(tree) ;
    }
    return ok_sofar ;
  }



  static boolean test_12 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_12") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)116)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)98)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)99)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)97)) ;
      Position<Character> var9 = tree.insertRight(var3,((char)104)) ;
      Position<Character> var10 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)110)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)105)) ;
      Position<Character> var14 = tree.insertRight(var10,((char)100)) ;
      Position<Character> var15 = tree.insertRight(root,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)111)) ;
      Position<Character> var18 = tree.insertRight(var16,((char)103)) ;
      Position<Character> var19 = tree.insertRight(var15,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)101)) ;
      Position<Character> var21 = tree.insertRight(var19,((char)115)) ;
      ok_sofar = new aed.huffman.Constructor(new CharCode[] { new CharCode(100,new String("011")),new CharCode(105,new String("0101")),new CharCode(110,new String("0100")),new CharCode(111,new String("100")),new CharCode(103,new String("101")),new CharCode(99,new String("001010")),new CharCode(98,new String("00100")),new CharCode(97,new String("001011")),new CharCode(116,new String("000")),new CharCode(115,new String("111")),new CharCode(101,new String("110")),new CharCode(104,new String("0011")) }).doCall().checkResult(tree) ;
    }
    return ok_sofar ;
  }



  static boolean test_13 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_13") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)97)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)102)) ;
      Position<Character> var5 = tree.insertRight(var1,((char)103)) ;
      Position<Character> var6 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)121)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)105)) ;
      Position<Character> var9 = tree.insertRight(root,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)115)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)110)) ;
      Position<Character> var13 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)101)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)117)) ;
      Position<Character> var18 = tree.insertRight(var16,((char)114)) ;
      Position<Character> var19 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)108)) ;
      Position<Character> var21 = tree.insertRight(var19,((char)116)) ;
      ok_sofar = new aed.huffman.Constructor(new CharCode[] { new CharCode(102,new String("0001")),new CharCode(116,new String("1111")),new CharCode(101,new String("1100")),new CharCode(115,new String("100")),new CharCode(110,new String("101")),new CharCode(114,new String("11011")),new CharCode(121,new String("010")),new CharCode(97,new String("0000")),new CharCode(108,new String("1110")),new CharCode(105,new String("011")),new CharCode(117,new String("11010")),new CharCode(103,new String("001")) }).doCall().checkResult(tree) ;
    }
    return ok_sofar ;
  }



  static boolean test_14 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_14") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)117)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)111)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)100)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)97)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)108)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)103)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)105)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)121)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)65)) ;
      Position<Character> var17 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)32)) ;
      Position<Character> var19 = tree.insertLeft(var18,((char)98)) ;
      Position<Character> var20 = tree.insertRight(var18,((char)101)) ;
      Position<Character> var21 = tree.insertRight(var17,((char)110)) ;
      ok_sofar = new aed.huffman.Constructor(new CharCode[] { new CharCode(103,new String("101")),new CharCode(100,new String("010")),new CharCode(101,new String("111101")),new CharCode(65,new String("11101")),new CharCode(117,new String("000")),new CharCode(111,new String("001")),new CharCode(98,new String("111100")),new CharCode(110,new String("11111")),new CharCode(108,new String("100")),new CharCode(105,new String("110")),new CharCode(97,new String("011")),new CharCode(121,new String("11100")) }).doCall().checkResult(tree) ;
    }
    return ok_sofar ;
  }



  static boolean test_15 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_15") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)114)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)110)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)108)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)115)) ;
      Position<Character> var9 = tree.insertRight(var5,((char)109)) ;
      Position<Character> var10 = tree.insertRight(var4,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)101)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)112)) ;
      Position<Character> var13 = tree.insertRight(root,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)116)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)104)) ;
      Position<Character> var17 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)111)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)121)) ;
      Position<Character> var21 = tree.insertRight(var19,((char)105)) ;
      ok_sofar = new aed.huffman.Constructor(new CharCode[] { new CharCode(105,new String("1111")),new CharCode(114,new String("00")),new CharCode(115,new String("011001")),new CharCode(104,new String("101")),new CharCode(116,new String("100")),new CharCode(110,new String("010")),new CharCode(121,new String("1110")),new CharCode(112,new String("01111")),new CharCode(111,new String("110")),new CharCode(108,new String("011000")),new CharCode(101,new String("01110")),new CharCode(109,new String("01101")) }).doCall().checkResult(tree) ;
    }
    return ok_sofar ;
  }



  static boolean test_16 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_16") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)115)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)107)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)109)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)100)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)97)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)102)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)116)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)99)) ;
      Position<Character> var15 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)111)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)101)) ;
      Position<Character> var20 = tree.insertRight(var16,((char)114)) ;
      Position<Character> var21 = tree.insertRight(var15,((char)105)) ;
      ok_sofar = new aed.huffman.Constructor(new CharCode[] { new CharCode(107,new String("001")),new CharCode(115,new String("000")),new CharCode(105,new String("1111")),new CharCode(100,new String("011")),new CharCode(114,new String("11101")),new CharCode(116,new String("1100")),new CharCode(99,new String("1101")),new CharCode(102,new String("101")),new CharCode(101,new String("111001")),new CharCode(97,new String("100")),new CharCode(109,new String("010")),new CharCode(111,new String("111000")) }).doCall().checkResult(tree) ;
    }
    return ok_sofar ;
  }



  static boolean test_17 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_17") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)105)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)115)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)97)) ;
      Position<Character> var5 = tree.insertRight(root,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)109)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)73)) ;
      Position<Character> var9 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)121)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)112)) ;
      Position<Character> var13 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)116)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)114)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)108)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)110)) ;
      Position<Character> var21 = tree.insertRight(var19,((char)101)) ;
      ok_sofar = new aed.huffman.Constructor(new CharCode[] { new CharCode(108,new String("111110")),new CharCode(114,new String("11110")),new CharCode(105,new String("00")),new CharCode(73,new String("101")),new CharCode(112,new String("1101")),new CharCode(101,new String("1111111")),new CharCode(97,new String("011")),new CharCode(110,new String("1111110")),new CharCode(116,new String("1110")),new CharCode(109,new String("100")),new CharCode(115,new String("010")),new CharCode(121,new String("1100")) }).doCall().checkResult(tree) ;
    }
    return ok_sofar ;
  }



  static boolean test_18 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_18") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)101)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)117)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)99)) ;
      Position<Character> var6 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)110)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)108)) ;
      Position<Character> var9 = tree.insertRight(root,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)119)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)116)) ;
      Position<Character> var15 = tree.insertRight(var11,((char)111)) ;
      Position<Character> var16 = tree.insertRight(var10,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)103)) ;
      Position<Character> var18 = tree.insertRight(var16,((char)100)) ;
      Position<Character> var19 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)105)) ;
      Position<Character> var21 = tree.insertRight(var19,((char)115)) ;
      ok_sofar = new aed.huffman.Constructor(new CharCode[] { new CharCode(111,new String("1001")),new CharCode(110,new String("010")),new CharCode(119,new String("10000")),new CharCode(100,new String("1011")),new CharCode(103,new String("1010")),new CharCode(99,new String("0011")),new CharCode(116,new String("10001")),new CharCode(115,new String("111")),new CharCode(117,new String("0010")),new CharCode(101,new String("000")),new CharCode(108,new String("011")),new CharCode(105,new String("110")) }).doCall().checkResult(tree) ;
    }
    return ok_sofar ;
  }



  static boolean test_19 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_19") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)97)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)121)) ;
      Position<Character> var5 = tree.insertRight(var1,((char)109)) ;
      Position<Character> var6 = tree.insertRight(var0,((char)114)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)117)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)110)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)98)) ;
      Position<Character> var16 = tree.insertRight(var12,((char)116)) ;
      Position<Character> var17 = tree.insertRight(var11,((char)105)) ;
      Position<Character> var18 = tree.insertRight(var8,((char)101)) ;
      Position<Character> var19 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)32)) ;
      Position<Character> var21 = tree.insertLeft(var20,((char)32)) ;
      Position<Character> var22 = tree.insertLeft(var21,((char)108)) ;
      Position<Character> var23 = tree.insertRight(var21,((char)100)) ;
      Position<Character> var24 = tree.insertRight(var20,((char)99)) ;
      Position<Character> var25 = tree.insertRight(var19,((char)111)) ;
      ok_sofar = new aed.huffman.Constructor(new CharCode[] { new CharCode(108,new String("11000")),new CharCode(121,new String("0001")),new CharCode(111,new String("111")),new CharCode(101,new String("101")),new CharCode(97,new String("0000")),new CharCode(110,new String("1001000")),new CharCode(99,new String("1101")),new CharCode(98,new String("1001001")),new CharCode(100,new String("11001")),new CharCode(116,new String("100101")),new CharCode(114,new String("01")),new CharCode(105,new String("10011")),new CharCode(117,new String("1000")),new CharCode(109,new String("001")) }).doCall().checkResult(tree) ;
    }
    return ok_sofar ;
  }



  static boolean test_20 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_20") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)100)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)115)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)116)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)105)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)97)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)98)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)111)) ;
      Position<Character> var14 = tree.insertRight(var8,((char)114)) ;
      Position<Character> var15 = tree.insertRight(root,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)110)) ;
      Position<Character> var18 = tree.insertRight(var16,((char)108)) ;
      Position<Character> var19 = tree.insertRight(var15,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)104)) ;
      Position<Character> var21 = tree.insertRight(var19,((char)32)) ;
      Position<Character> var22 = tree.insertLeft(var21,((char)101)) ;
      Position<Character> var23 = tree.insertRight(var21,((char)32)) ;
      Position<Character> var24 = tree.insertLeft(var23,((char)121)) ;
      Position<Character> var25 = tree.insertRight(var23,((char)99)) ;
      ok_sofar = new aed.huffman.Constructor(new CharCode[] { new CharCode(121,new String("11110")),new CharCode(104,new String("110")),new CharCode(101,new String("1110")),new CharCode(114,new String("01111")),new CharCode(99,new String("11111")),new CharCode(115,new String("001")),new CharCode(105,new String("0110")),new CharCode(98,new String("0111010")),new CharCode(116,new String("010")),new CharCode(111,new String("0111011")),new CharCode(100,new String("000")),new CharCode(108,new String("101")),new CharCode(97,new String("011100")),new CharCode(110,new String("100")) }).doCall().checkResult(tree) ;
    }
    return ok_sofar ;
  }



  static boolean test_21 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_21") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)98)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)110)) ;
      Position<Character> var5 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)121)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)116)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)105)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)99)) ;
      Position<Character> var14 = tree.insertRight(var10,((char)100)) ;
      Position<Character> var15 = tree.insertRight(var7,((char)117)) ;
      Position<Character> var16 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)109)) ;
      Position<Character> var18 = tree.insertRight(var16,((char)114)) ;
      Position<Character> var19 = tree.insertRight(root,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)32)) ;
      Position<Character> var21 = tree.insertLeft(var20,((char)111)) ;
      Position<Character> var22 = tree.insertRight(var20,((char)108)) ;
      Position<Character> var23 = tree.insertRight(var19,((char)32)) ;
      Position<Character> var24 = tree.insertLeft(var23,((char)32)) ;
      Position<Character> var25 = tree.insertLeft(var24,((char)97)) ;
      Position<Character> var26 = tree.insertRight(var24,((char)112)) ;
      Position<Character> var27 = tree.insertRight(var23,((char)101)) ;
      ok_sofar = new aed.huffman.Constructor(new CharCode[] { new CharCode(100,new String("0011011")),new CharCode(99,new String("00110101")),new CharCode(111,new String("100")),new CharCode(105,new String("00110100")),new CharCode(114,new String("011")),new CharCode(121,new String("0010")),new CharCode(116,new String("001100")),new CharCode(97,new String("1100")),new CharCode(109,new String("010")),new CharCode(108,new String("101")),new CharCode(117,new String("00111")),new CharCode(110,new String("0001")),new CharCode(98,new String("0000")),new CharCode(101,new String("111")),new CharCode(112,new String("1101")) }).doCall().checkResult(tree) ;
    }
    return ok_sofar ;
  }



  static boolean test_22 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_22") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)100)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)97)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)98)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)102)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)101)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)114)) ;
      Position<Character> var12 = tree.insertRight(var4,((char)104)) ;
      Position<Character> var13 = tree.insertRight(root,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)111)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)99)) ;
      Position<Character> var17 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)32)) ;
      Position<Character> var19 = tree.insertLeft(var18,((char)109)) ;
      Position<Character> var20 = tree.insertRight(var18,((char)121)) ;
      Position<Character> var21 = tree.insertRight(var17,((char)32)) ;
      Position<Character> var22 = tree.insertLeft(var21,((char)32)) ;
      Position<Character> var23 = tree.insertLeft(var22,((char)32)) ;
      Position<Character> var24 = tree.insertLeft(var23,((char)116)) ;
      Position<Character> var25 = tree.insertRight(var23,((char)117)) ;
      Position<Character> var26 = tree.insertRight(var22,((char)108)) ;
      Position<Character> var27 = tree.insertRight(var21,((char)105)) ;
      ok_sofar = new aed.huffman.Constructor(new CharCode[] { new CharCode(109,new String("1100")),new CharCode(114,new String("01011")),new CharCode(99,new String("101")),new CharCode(116,new String("111000")),new CharCode(121,new String("1101")),new CharCode(102,new String("010100")),new CharCode(105,new String("1111")),new CharCode(97,new String("001")),new CharCode(111,new String("100")),new CharCode(98,new String("0100")),new CharCode(117,new String("111001")),new CharCode(100,new String("000")),new CharCode(104,new String("011")),new CharCode(108,new String("11101")),new CharCode(101,new String("010101")) }).doCall().checkResult(tree) ;
    }
    return ok_sofar ;
  }



  static boolean test_23 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_23") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)108)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)114)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)116)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)112)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)97)) ;
      Position<Character> var10 = tree.insertRight(var4,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)99)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)105)) ;
      Position<Character> var13 = tree.insertRight(root,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)100)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)110)) ;
      Position<Character> var18 = tree.insertRight(var16,((char)121)) ;
      Position<Character> var19 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)32)) ;
      Position<Character> var21 = tree.insertLeft(var20,((char)104)) ;
      Position<Character> var22 = tree.insertRight(var20,((char)32)) ;
      Position<Character> var23 = tree.insertLeft(var22,((char)101)) ;
      Position<Character> var24 = tree.insertRight(var22,((char)109)) ;
      Position<Character> var25 = tree.insertRight(var19,((char)32)) ;
      Position<Character> var26 = tree.insertLeft(var25,((char)115)) ;
      Position<Character> var27 = tree.insertRight(var25,((char)111)) ;
      ok_sofar = new aed.huffman.Constructor(new CharCode[] { new CharCode(111,new String("1111")),new CharCode(110,new String("1010")),new CharCode(108,new String("000")),new CharCode(121,new String("1011")),new CharCode(104,new String("1100")),new CharCode(112,new String("01010")),new CharCode(115,new String("1110")),new CharCode(97,new String("01011")),new CharCode(100,new String("100")),new CharCode(114,new String("001")),new CharCode(109,new String("11011")),new CharCode(101,new String("11010")),new CharCode(105,new String("0111")),new CharCode(99,new String("0110")),new CharCode(116,new String("0100")) }).doCall().checkResult(tree) ;
    }
    return ok_sofar ;
  }



  static boolean test_24 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_24") ;
    boolean ok_sofar = true ;
    
    return ok_sofar ;
  }



  static boolean test_25 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_25") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)98)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("a"),new String("0")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_26 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_26") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)98)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("b"),new String("1")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_27 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_27") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)98)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)99)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("a"),new String("0")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_28 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_28") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)98)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)99)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("b"),new String("10")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_29 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_29") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)98)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)99)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("c"),new String("11")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_30 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_30") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)97)) ;
      Position<Character> var3 = tree.insertRight(root,((char)99)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("a"),new String("01")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_31 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_31") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)97)) ;
      Position<Character> var3 = tree.insertRight(root,((char)99)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("b"),new String("00")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_32 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_32") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)97)) ;
      Position<Character> var3 = tree.insertRight(root,((char)99)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("c"),new String("1")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_33 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_33") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)101)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)104)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)116)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)114)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)111)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)102)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)97)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("a"),new String("11")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_34 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_34") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)114)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)111)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)102)) ;
      Position<Character> var5 = tree.insertRight(root,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)109)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)116)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)101)) ;
      Position<Character> var11 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)107)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)97)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("to"),new String("1010010")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_35 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_35") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)111)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)101)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)97)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)104)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)115)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)116)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)98)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("those"),new String("11101110001110001")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_36 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_36") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)101)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)117)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)105)) ;
      Position<Character> var5 = tree.insertRight(root,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)108)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)97)) ;
      Position<Character> var9 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)116)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)121)) ;
      Position<Character> var15 = tree.insertRight(var11,((char)103)) ;
      Position<Character> var16 = tree.insertRight(var10,((char)110)) ;
      Position<Character> var17 = tree.insertRight(var9,((char)111)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("a"),new String("101")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_37 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_37") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)100)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)116)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)108)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)111)) ;
      Position<Character> var7 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)105)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)101)) ;
      Position<Character> var12 = tree.insertRight(var8,((char)104)) ;
      Position<Character> var13 = tree.insertRight(var7,((char)115)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("little"),new String("10011000010110011001")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_38 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_38") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)105)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)99)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)116)) ;
      Position<Character> var5 = tree.insertRight(root,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)110)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)101)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)111)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)104)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)100)) ;
      Position<Character> var16 = tree.insertRight(var12,((char)115)) ;
      Position<Character> var17 = tree.insertRight(var11,((char)103)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("good"),new String("11111111011101111001")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_39 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_39") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)117)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)104)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)111)) ;
      Position<Character> var5 = tree.insertRight(root,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)108)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)114)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)101)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)115)) ;
      Position<Character> var13 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)105)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)116)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)103)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("other"),new String("011110001101101010")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_40 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_40") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)111)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)103)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)114)) ;
      Position<Character> var5 = tree.insertRight(root,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)99)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)112)) ;
      Position<Character> var9 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)101)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)110)) ;
      Position<Character> var14 = tree.insertRight(var10,((char)115)) ;
      Position<Character> var15 = tree.insertRight(var9,((char)45)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("presence"),new String("101011110001101110001100110011000")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_41 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_41") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)117)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)45)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)97)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)99)) ;
      Position<Character> var8 = tree.insertRight(var2,((char)115)) ;
      Position<Character> var9 = tree.insertRight(root,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)101)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)108)) ;
      Position<Character> var13 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)111)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)114)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)98)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("because"),new String("1111100010110101000011100")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_42 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_42") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)115)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)118)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)114)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)111)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)108)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)105)) ;
      Position<Character> var12 = tree.insertRight(var4,((char)117)) ;
      Position<Character> var13 = tree.insertRight(root,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)116)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)98)) ;
      Position<Character> var17 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)101)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)104)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("those"),new String("100111010100000110")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_43 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_43") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)98)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)108)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)97)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)99)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)102)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)115)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)114)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)105)) ;
      Position<Character> var17 = tree.insertRight(var13,((char)101)) ;
      Position<Character> var18 = tree.insertRight(var12,((char)109)) ;
      Position<Character> var19 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)65)) ;
      Position<Character> var21 = tree.insertRight(var19,((char)110)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("been"),new String("00011001110011111")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_44 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_44") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)115)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)116)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)97)) ;
      Position<Character> var5 = tree.insertRight(root,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)110)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)111)) ;
      Position<Character> var10 = tree.insertRight(var6,((char)109)) ;
      Position<Character> var11 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)73)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)117)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)114)) ;
      Position<Character> var18 = tree.insertRight(var14,((char)101)) ;
      Position<Character> var19 = tree.insertRight(var11,((char)105)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("seriousI"),new String("0001101111010111110011101000001100")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_45 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_45") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)104)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)102)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)115)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)101)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)114)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)119)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)65)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)105)) ;
      Position<Character> var16 = tree.insertRight(var12,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)99)) ;
      Position<Character> var18 = tree.insertRight(var16,((char)109)) ;
      Position<Character> var19 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)110)) ;
      Position<Character> var21 = tree.insertRight(var19,((char)32)) ;
      Position<Character> var22 = tree.insertLeft(var21,((char)97)) ;
      Position<Character> var23 = tree.insertRight(var21,((char)32)) ;
      Position<Character> var24 = tree.insertLeft(var23,((char)111)) ;
      Position<Character> var25 = tree.insertRight(var23,((char)108)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("of"),new String("11110001")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_46 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_46") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)115)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)101)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)116)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)98)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)100)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)114)) ;
      Position<Character> var11 = tree.insertRight(root,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)99)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)112)) ;
      Position<Character> var15 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)109)) ;
      Position<Character> var18 = tree.insertRight(var16,((char)32)) ;
      Position<Character> var19 = tree.insertLeft(var18,((char)110)) ;
      Position<Character> var20 = tree.insertRight(var18,((char)105)) ;
      Position<Character> var21 = tree.insertRight(var15,((char)32)) ;
      Position<Character> var22 = tree.insertLeft(var21,((char)97)) ;
      Position<Character> var23 = tree.insertRight(var21,((char)111)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("presence"),new String("1010111110100001011010100010")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_47 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_47") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)110)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)104)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)100)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)101)) ;
      Position<Character> var9 = tree.insertRight(var5,((char)111)) ;
      Position<Character> var10 = tree.insertRight(var4,((char)98)) ;
      Position<Character> var11 = tree.insertRight(root,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)115)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)105)) ;
      Position<Character> var15 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)99)) ;
      Position<Character> var18 = tree.insertRight(var16,((char)108)) ;
      Position<Character> var19 = tree.insertRight(var15,((char)116)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("disobedience"),new String("010001011000101011010010100010101001000110001001")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_48 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_48") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)101)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)116)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)108)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)121)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)111)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)105)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)114)) ;
      Position<Character> var13 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)112)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)110)) ;
      Position<Character> var17 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)32)) ;
      Position<Character> var19 = tree.insertLeft(var18,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)100)) ;
      Position<Character> var21 = tree.insertRight(var19,((char)32)) ;
      Position<Character> var22 = tree.insertLeft(var21,((char)97)) ;
      Position<Character> var23 = tree.insertRight(var21,((char)99)) ;
      Position<Character> var24 = tree.insertRight(var18,((char)109)) ;
      Position<Character> var25 = tree.insertRight(var17,((char)98)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("obtain"),new String("1001111001111001010101101")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_49 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_49") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)104)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)114)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)111)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)97)) ;
      Position<Character> var9 = tree.insertRight(var5,((char)108)) ;
      Position<Character> var10 = tree.insertRight(var4,((char)102)) ;
      Position<Character> var11 = tree.insertRight(root,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)98)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)110)) ;
      Position<Character> var15 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)99)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)101)) ;
      Position<Character> var20 = tree.insertRight(var16,((char)115)) ;
      Position<Character> var21 = tree.insertRight(var15,((char)32)) ;
      Position<Character> var22 = tree.insertLeft(var21,((char)32)) ;
      Position<Character> var23 = tree.insertLeft(var22,((char)100)) ;
      Position<Character> var24 = tree.insertRight(var22,((char)105)) ;
      Position<Character> var25 = tree.insertRight(var21,((char)116)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("fearless"),new String("011110010100100101011100111011101")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_50 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_50") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)111)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)116)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)103)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)105)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)101)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)121)) ;
      Position<Character> var12 = tree.insertRight(var8,((char)104)) ;
      Position<Character> var13 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)108)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)117)) ;
      Position<Character> var20 = tree.insertRight(var16,((char)114)) ;
      Position<Character> var21 = tree.insertRight(var15,((char)98)) ;
      Position<Character> var22 = tree.insertRight(var14,((char)97)) ;
      Position<Character> var23 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var24 = tree.insertLeft(var23,((char)100)) ;
      Position<Character> var25 = tree.insertRight(var23,((char)32)) ;
      Position<Character> var26 = tree.insertLeft(var25,((char)110)) ;
      Position<Character> var27 = tree.insertRight(var25,((char)99)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("children"),new String("1111110101111000001110110001100011110")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_51 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_51") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)105)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)109)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)116)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)111)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)108)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)110)) ;
      Position<Character> var12 = tree.insertRight(var8,((char)98)) ;
      Position<Character> var13 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)115)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)121)) ;
      Position<Character> var17 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)101)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)32)) ;
      Position<Character> var21 = tree.insertLeft(var20,((char)112)) ;
      Position<Character> var22 = tree.insertRight(var20,((char)32)) ;
      Position<Character> var23 = tree.insertLeft(var22,((char)32)) ;
      Position<Character> var24 = tree.insertLeft(var23,((char)99)) ;
      Position<Character> var25 = tree.insertRight(var23,((char)100)) ;
      Position<Character> var26 = tree.insertRight(var22,((char)114)) ;
      Position<Character> var27 = tree.insertRight(var19,((char)104)) ;
      ok_sofar = new aed.huffman.Encode(tree,new String("disobedience"),new String("11110101000110001110111101111010100011101001111101001110")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_52 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_52") ;
    boolean ok_sofar = true ;
    
    return ok_sofar ;
  }



  static boolean test_53 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_53") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)98)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("0"),new String("a")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_54 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_54") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)98)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("1"),new String("b")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_55 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_55") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)98)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)99)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("0"),new String("a")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_56 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_56") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)97)) ;
      Position<Character> var3 = tree.insertRight(root,((char)99)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("1"),new String("c")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_57 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_57") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)98)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)99)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("10"),new String("b")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_58 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_58") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)98)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)99)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("11"),new String("c")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_59 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_59") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)97)) ;
      Position<Character> var3 = tree.insertRight(root,((char)99)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("00"),new String("b")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_60 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_60") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)97)) ;
      Position<Character> var3 = tree.insertRight(root,((char)99)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("01"),new String("a")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_61 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_61") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)110)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)97)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)100)) ;
      Position<Character> var5 = tree.insertRight(root,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)101)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)114)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("0011110"),new String("are")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_62 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_62") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)73)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)117)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)99)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)115)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)97)) ;
      Position<Character> var10 = tree.insertRight(var6,((char)110)) ;
      Position<Character> var11 = tree.insertRight(root,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)116)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)111)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)98)) ;
      Position<Character> var17 = tree.insertRight(var13,((char)101)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("000"),new String("I")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_63 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_63") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)116)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)109)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)101)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)100)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)105)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)114)) ;
      Position<Character> var12 = tree.insertRight(var4,((char)111)) ;
      Position<Character> var13 = tree.insertRight(root,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)97)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)99)) ;
      Position<Character> var17 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)104)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)73)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("111"),new String("I")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_64 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_64") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)101)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)99)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)108)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)121)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)73)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)103)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)110)) ;
      Position<Character> var14 = tree.insertRight(var8,((char)100)) ;
      Position<Character> var15 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)105)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)117)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)97)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("1000"),new String("I")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_65 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_65") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)111)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)105)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)108)) ;
      Position<Character> var7 = tree.insertRight(var3,((char)99)) ;
      Position<Character> var8 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)117)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)97)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)101)) ;
      Position<Character> var13 = tree.insertRight(root,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)110)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)109)) ;
      Position<Character> var18 = tree.insertRight(var14,((char)102)) ;
      Position<Character> var19 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)116)) ;
      Position<Character> var21 = tree.insertRight(var19,((char)114)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("0110"),new String("a")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_66 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_66") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)114)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)117)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)104)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)99)) ;
      Position<Character> var9 = tree.insertRight(var5,((char)111)) ;
      Position<Character> var10 = tree.insertRight(var4,((char)98)) ;
      Position<Character> var11 = tree.insertRight(root,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)116)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)73)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)97)) ;
      Position<Character> var17 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)101)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)115)) ;
      Position<Character> var21 = tree.insertRight(var19,((char)105)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("011110"),new String("be")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_67 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_67") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)121)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)105)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)116)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)110)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)97)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)104)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)100)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)99)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)111)) ;
      Position<Character> var17 = tree.insertRight(var13,((char)115)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("010101100010"),new String("that")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_68 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_68") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)100)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)114)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)98)) ;
      Position<Character> var7 = tree.insertRight(var3,((char)65)) ;
      Position<Character> var8 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)110)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)111)) ;
      Position<Character> var11 = tree.insertRight(root,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)116)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)101)) ;
      Position<Character> var15 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)121)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)109)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("11101100100101"),new String("more")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_69 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_69") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)103)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)117)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)106)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)105)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)101)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)97)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)116)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)110)) ;
      Position<Character> var16 = tree.insertRight(var12,((char)111)) ;
      Position<Character> var17 = tree.insertRight(var11,((char)100)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("11001100100111"),new String("need")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_70 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_70") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)110)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)99)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)111)) ;
      Position<Character> var5 = tree.insertRight(root,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)116)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)108)) ;
      Position<Character> var9 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)115)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)73)) ;
      Position<Character> var13 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)119)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)100)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)105)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("111011111101101"),new String("will")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_71 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_71") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)121)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)116)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)73)) ;
      Position<Character> var5 = tree.insertRight(root,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)108)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)101)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)114)) ;
      Position<Character> var14 = tree.insertRight(var10,((char)105)) ;
      Position<Character> var15 = tree.insertRight(var9,((char)110)) ;
      Position<Character> var16 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)112)) ;
      Position<Character> var18 = tree.insertRight(var16,((char)111)) ;
      Position<Character> var19 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)70)) ;
      Position<Character> var21 = tree.insertRight(var19,((char)109)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("110101111010001"),new String("For")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_72 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_72") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)104)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)114)) ;
      Position<Character> var6 = tree.insertRight(var2,((char)110)) ;
      Position<Character> var7 = tree.insertRight(var1,((char)115)) ;
      Position<Character> var8 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)102)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)97)) ;
      Position<Character> var11 = tree.insertRight(root,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)99)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)101)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)103)) ;
      Position<Character> var17 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)111)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)105)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("100000001101100011010"),new String("choose")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_73 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_73") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)99)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)108)) ;
      Position<Character> var5 = tree.insertRight(var1,((char)103)) ;
      Position<Character> var6 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)105)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)102)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)97)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)101)) ;
      Position<Character> var13 = tree.insertRight(root,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)121)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)104)) ;
      Position<Character> var17 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)32)) ;
      Position<Character> var19 = tree.insertLeft(var18,((char)109)) ;
      Position<Character> var20 = tree.insertRight(var18,((char)114)) ;
      Position<Character> var21 = tree.insertRight(var17,((char)32)) ;
      Position<Character> var22 = tree.insertLeft(var21,((char)112)) ;
      Position<Character> var23 = tree.insertRight(var21,((char)32)) ;
      Position<Character> var24 = tree.insertLeft(var23,((char)116)) ;
      Position<Character> var25 = tree.insertRight(var23,((char)110)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("011001110000001011111001"),new String("facing")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_74 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_74") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)114)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)121)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)108)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)112)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)116)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)109)) ;
      Position<Character> var12 = tree.insertRight(var8,((char)105)) ;
      Position<Character> var13 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)97)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)115)) ;
      Position<Character> var17 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)101)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)32)) ;
      Position<Character> var21 = tree.insertLeft(var20,((char)110)) ;
      Position<Character> var22 = tree.insertRight(var20,((char)103)) ;
      Position<Character> var23 = tree.insertRight(var19,((char)104)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("1000111111011111001111011101"),new String("things")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_75 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_75") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)98)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)116)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)121)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)114)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)101)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)111)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)108)) ;
      Position<Character> var13 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)99)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)115)) ;
      Position<Character> var18 = tree.insertRight(var16,((char)32)) ;
      Position<Character> var19 = tree.insertLeft(var18,((char)110)) ;
      Position<Character> var20 = tree.insertRight(var18,((char)117)) ;
      Position<Character> var21 = tree.insertRight(var15,((char)104)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("11111010111010100111000011011010"),new String("honestly")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_76 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_76") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)111)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)110)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)105)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)99)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)97)) ;
      Position<Character> var10 = tree.insertRight(var2,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)104)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)101)) ;
      Position<Character> var13 = tree.insertRight(root,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)116)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)115)) ;
      Position<Character> var18 = tree.insertRight(var16,((char)114)) ;
      Position<Character> var19 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)100)) ;
      Position<Character> var21 = tree.insertRight(var19,((char)108)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("010110011001010111110101101110100"),new String("children")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_77 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_77") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)108)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)110)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)97)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)100)) ;
      Position<Character> var9 = tree.insertRight(var5,((char)115)) ;
      Position<Character> var10 = tree.insertRight(var0,((char)111)) ;
      Position<Character> var11 = tree.insertRight(root,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)103)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)101)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)114)) ;
      Position<Character> var18 = tree.insertRight(var16,((char)105)) ;
      Position<Character> var19 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)117)) ;
      Position<Character> var21 = tree.insertRight(var19,((char)109)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("001101101000110000010111001010000111"),new String("dealings")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_78 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_78") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)103)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)115)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)117)) ;
      Position<Character> var8 = tree.insertRight(var4,((char)114)) ;
      Position<Character> var9 = tree.insertRight(var1,((char)118)) ;
      Position<Character> var10 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)102)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)108)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)97)) ;
      Position<Character> var15 = tree.insertRight(root,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)98)) ;
      Position<Character> var18 = tree.insertRight(var16,((char)101)) ;
      Position<Character> var19 = tree.insertRight(var15,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)32)) ;
      Position<Character> var21 = tree.insertLeft(var20,((char)105)) ;
      Position<Character> var22 = tree.insertRight(var20,((char)121)) ;
      Position<Character> var23 = tree.insertRight(var19,((char)110)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("0101010111000110110101000100000100"),new String("fearless")).doCall().checkResult(null) ;
    }
    return ok_sofar ;
  }



  static boolean test_79 ()
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_79") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
    {
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)115)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)99)) ;
      Position<Character> var5 = tree.insertRight(var1,((char)98)) ;
      Position<Character> var6 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)117)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)101)) ;
      Position<Character> var9 = tree.insertRight(root,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)114)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)110)) ;
      Position<Character> var14 = tree.insertRight(var10,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)97)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)121)) ;
      Position<Character> var18 = tree.insertRight(var14,((char)104)) ;
      Position<Character> var19 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)32)) ;
      Position<Character> var21 = tree.insertLeft(var20,((char)32)) ;
      Position<Character> var22 = tree.insertLeft(var21,((char)32)) ;
      Position<Character> var23 = tree.insertLeft(var22,((char)32)) ;
      Position<Character> var24 = tree.insertLeft(var23,((char)105)) ;
      Position<Character> var25 = tree.insertRight(var23,((char)109)) ;
      Position<Character> var26 = tree.insertRight(var22,((char)111)) ;
      Position<Character> var27 = tree.insertRight(var21,((char)112)) ;
      Position<Character> var28 = tree.insertRight(var20,((char)100)) ;
      Position<Character> var29 = tree.insertRight(var19,((char)32)) ;
      Position<Character> var30 = tree.insertLeft(var29,((char)116)) ;
      Position<Character> var31 = tree.insertRight(var29,((char)108)) ;
      ok_sofar = new aed.huffman.Decode(tree,new String("11001100001101111000011100000100101110011110111110101"),new String("preeminently")).doCall().checkResult(null) ;
    }
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

 







class HuffmanChecker {
  public static <T> PositionList<T> toPositionList(T[] arr) {
    NodePositionList<T> l = new NodePositionList<T>();
    for (int i=0; i<arr.length; i++)
      l.addLast(arr[i]);
    return l;
  }
  
  static boolean checkTree(String callString, BinaryTree<Character> tree, BinaryTree<Character>expt) {
    boolean ok_sofar = true;
    
    if (ok_sofar && (expt.isEmpty() != tree.isEmpty()))
      ok_sofar = false;
    
    if (ok_sofar)
      ok_sofar =
	checkTreePos(callString, tree, tree.root(), expt, expt.root());
    
    if (!ok_sofar) {
      TestUtils.printError
	(TestUtils.ExecutionTime.LAST,
	 "\nThe tree generated by "+callString+
	 "\nhas the shape\n"+
	 tree.toString()+
	 "\nbut should have the shape\n"+
	 expt.toString());
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
}

class Constructor extends TestCall<Huffman,BinaryTree<Character>> {
  
  CharCode[] charCodes;
  CharCode[] origCharCodes;
  
  public Constructor(CharCode[] charCodes) {
    this.charCodes = charCodes;
    this.origCharCodes = Arrays.copyOf(charCodes,charCodes.length);
  }
  
  @Override
  public String toString() {
    return "new Huffman("+Arrays.toString(charCodes)+")";
  }
  
  @Override
  public Huffman call() {
    return new Huffman(charCodes);
  }
  
  @Override
  @SuppressWarnings({"unchecked","rawtypes"})
  public boolean checkResult(BinaryTree<Character> bt) {
    if (!noException() || !nonNull())
      return false;
    
    if (!TestUtils.unChanged(this.toString(),origCharCodes,charCodes))
      return false;
    
    BinaryTree<Character> tree = null;

    try {
      Field treeField;
      Huffman huffman = result.getValue();
      treeField = huffman.getClass().getDeclaredField("huffmanTree");
      treeField.setAccessible(true);
      tree = (BinaryTree<Character>) treeField.get(huffman);
    } catch ( Throwable exc ) {
      TestUtils.printCallException
	(TestUtils.ExecutionTime.LAST,
	 "cannot access the field huffmanTree: ",
	 exc);
      return false;
    }
    return HuffmanChecker.checkTree(toString(),tree,bt);
  }
}


class Encode extends TestCall<String,Void> {
  LinkedBinaryTree<Character> bt;
  String text;
  String encodedText;
  
  public Encode(LinkedBinaryTree<Character>bt, String text, String encodedText) {
    this.bt = bt;
    this.text = text;
    this.encodedText = encodedText;
  }
  
  @Override
  public String toString() {
    return "huffman.encode(\""+text+"\")";
  }
  
  @Override
  public String call() {
    Huffman huffman = new Huffman(bt);
    return huffman.encode(text);
  }
  
  @Override
  public boolean checkResult(Void v) {
    if (!noException() || !nonNull())
      return false;
    
    if (!valuesMatch(encodedText)) {
      System.out.print("\n The three has the shape\n");
      System.out.println(bt);
      return false;
    }
    return true;
  }
}

class Decode extends TestCall<String,Void> {
  LinkedBinaryTree<Character> bt;
  String encodedText;
  String clearText;
  
  public Decode(LinkedBinaryTree<Character>bt, String encodedText, String clearText) {
    this.bt = bt;
    this.encodedText = encodedText;
    this.clearText = clearText;
  }
  
  @Override
  public String toString() {
    return "huffman.decode(\""+encodedText+"\")";
  }
  
  @Override
  public String call() {
    Huffman huffman = new Huffman(bt);
    return huffman.decode(encodedText);
  }
  
  @Override
  public boolean checkResult(Void v) {
    if (!noException() || !nonNull())
      return false;
    
    if (!valuesMatch(clearText)) {
      System.out.print("\n The three has the shape\n");
      System.out.println(bt);
      return false;
    }
    return true;
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


