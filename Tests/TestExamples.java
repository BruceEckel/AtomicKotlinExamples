import org.junit.Test;

public class TestExamples extends AbstractTestExamples {

  @Test
  public void testAbsExercise1() {
    testExample("Examples/Abstract/AbsExercise1.kt", abstractclasses.AbsExercise1Kt::main);
  }

  @Test
  public void testAbsExercise2() {
    testExample("Examples/Abstract/AbsExercise2.kt", abstractclasses2.AbsExercise2Kt::main);
  }

  @Test
  public void testAbsExercise3() {
    testExample("Examples/Abstract/AbsExercise3.kt", abstractclasses3.AbsExercise3Kt::main);
  }

  @Test
  public void testImplementations() {
    testExample("Examples/Abstract/Implementations.kt", abstractclasses.ImplementationsKt::main);
  }

  @Test
  public void testInterfaceCollision() {
    testExample("Examples/Abstract/InterfaceCollision.kt", collision.InterfaceCollisionKt::main);
  }

  @Test
  public void testStateOfAClass() {
    testExample("Examples/Abstract/StateOfAClass.kt", abstractstate.StateOfAClassKt::main);
  }

  @Test
  public void testWithPropertyAccessor() {
    testExample("Examples/Abstract/WithPropertyAccessor.kt", abstractclasses.WithPropertyAccessorKt::main);
  }

  @Test
  public void testBigFibonacci() {
    testExample("Examples/AdaptingJava/BigFibonacci.kt", adaptingjava.BigFibonacciKt::main);
  }

  @Test
  public void testBCIExercise1() {
    testExample("Examples/BaseClassInit/BCIExercise1.kt", baseclassinit.BCIExercise1Kt::main);
  }

  @Test
  public void testBCIExercise2() {
    testExample("Examples/BaseClassInit/BCIExercise2.kt", baseclassinit.BCIExercise2Kt::main);
  }

  @Test
  public void testBCIExercise3() {
    testExample("Examples/BaseClassInit/BCIExercise3.kt", baseclassinit.BCIExercise3Kt::main);
  }

  @Test
  public void testGreatApe3() {
    testExample("Examples/BaseClassInit/GreatApe3.kt", baseclassinit.GreatApe3Kt::main);
  }

  @Test
  public void testHouse() {
    testExample("Examples/BaseClassInit/House.kt", baseclassinit.HouseKt::main);
  }

  @Test
  public void testOtherConstructors() {
    testExample("Examples/BaseClassInit/OtherConstructors.kt", baseclassinit.OtherConstructorsKt::main);
  }

  @Test
  public void testClosed() {
    testExample("Examples/Booleans/Closed.kt", ClosedKt::main);
  }

  @Test
  public void testEvaluationOrder() {
    testExample("Examples/Booleans/EvaluationOrder.kt", EvaluationOrderKt::main);
  }

  @Test
  public void testOpen1() {
    testExample("Examples/Booleans/Open1.kt", Open1Kt::main);
  }

  @Test
  public void testOpen2() {
    testExample("Examples/Booleans/Open2.kt", Open2Kt::main);
  }

  @Test
  public void testDoWhileControl() {
    testExample("Examples/BreakAndContinue/DoWhileControl.kt", DoWhileControlKt::main);
  }

  @Test
  public void testForControl() {
    testExample("Examples/BreakAndContinue/ForControl.kt", ForControlKt::main);
  }

  @Test
  public void testForLabeled() {
    testExample("Examples/BreakAndContinue/ForLabeled.kt", ForLabeledKt::main);
  }

  @Test
  public void testImproved() {
    testExample("Examples/BreakAndContinue/Improved.kt", ImprovedKt::main);
  }

  @Test
  public void testWhileControl() {
    testExample("Examples/BreakAndContinue/WhileControl.kt", WhileControlKt::main);
  }

  @Test
  public void testWhileLabeled() {
    testExample("Examples/BreakAndContinue/WhileLabeled.kt", WhileLabeledKt::main);
  }

  @Test
  public void testAssociateBy() {
    testExample("Examples/BuildingMaps/AssociateBy.kt", AssociateByKt::main);
  }

  @Test
  public void testAssociateByUnique() {
    testExample("Examples/BuildingMaps/AssociateByUnique.kt", AssociateByUniqueKt::main);
  }

  @Test
  public void testAssociateWith() {
    testExample("Examples/BuildingMaps/AssociateWith.kt", AssociateWithKt::main);
  }

  @Test
  public void testFilterMap() {
    testExample("Examples/BuildingMaps/FilterMap.kt", FilterMapKt::main);
  }

  @Test
  public void testGetOrPut() {
    testExample("Examples/BuildingMaps/GetOrPut.kt", GetOrPutKt::main);
  }

  @Test
  public void testGroupBy() {
    testExample("Examples/BuildingMaps/GroupBy.kt", GroupByKt::main);
  }

  @Test
  public void testGroupByVsFilter() {
    testExample("Examples/BuildingMaps/GroupByVsFilter.kt", GroupByVsFilterKt::main);
  }

  @Test
  public void testSimilarOperation() {
    testExample("Examples/BuildingMaps/SimilarOperation.kt", SimilarOperationKt::main);
  }

  @Test
  public void testTransformingMap() {
    testExample("Examples/BuildingMaps/TransformingMap.kt", TransformingMapKt::main);
  }

  @Test
  public void testHumanAlice() {
    testExample("Examples/Casting/HumanAlice.kt", downcasting.HumanAliceKt::main);
  }

  @Test
  public void testSafe() {
    testExample("Examples/Casting/Safe.kt", downcasting.SafeKt::main);
  }

  @Test
  public void testSmartCast() {
    testExample("Examples/Casting/SmartCast.kt", downcasting.SmartCastKt::main);
  }

  @Test
  public void testUnsafe() {
    testExample("Examples/Casting/Unsafe.kt", downcasting.UnsafeKt::main);
  }

  @Test
  public void testWhenAndHierarchy() {
    testExample("Examples/Casting/WhenAndHierarchy.kt", downcasting.WhenAndHierarchyKt::main);
  }

  @Test
  public void testGetTrace() {
    testExample("Examples/CheckInstructions/GetTrace.kt", checkinstructions.GetTraceKt::main);
  }

  @Test
  public void testLocalFile() {
    testExample("Examples/CheckInstructions/LocalFile.kt", checkinstructions.LocalFileKt::main);
  }

  @Test
  public void testPostconditions() {
    testExample("Examples/CheckInstructions/Postconditions.kt", checkinstructions.PostconditionsKt::main);
  }

  @Test
  public void testQuadraticRequire() {
    testExample("Examples/CheckInstructions/QuadraticRequire.kt", checkinstructions.QuadraticRequireKt::main);
  }

  @Test
  public void testRequireNotNull() {
    testExample("Examples/CheckInstructions/RequireNotNull.kt", checkinstructions.RequireNotNullKt::main);
  }

  @Test
  public void testSingleArgRequire() {
    testExample("Examples/CheckInstructions/SingleArgRequire.kt", checkinstructions.SingleArgRequireKt::main);
  }

  @Test
  public void testDelegatedControls() {
    testExample("Examples/ClassDelegation/DelegatedControls.kt", DelegatedControlsKt::main);
  }

  @Test
  public void testExplicitDelegation() {
    testExample("Examples/ClassDelegation/ExplicitDelegation.kt", ExplicitDelegationKt::main);
  }

  @Test
  public void testModelingMI() {
    testExample("Examples/ClassDelegation/ModelingMI.kt", ModelingMIKt::main);
  }

  @Test
  public void testHiddenArrayList() {
    testExample("Examples/CollectionsAndJava/HiddenArrayList.kt", HiddenArrayListKt::main);
  }

  @Test
  public void testJavaList() {
    testExample("Examples/CollectionsAndJava/JavaList.kt", JavaListKt::main);
  }

  @Test
  public void testReadOnlyCollections() {
    testExample("Examples/CollectionsAndJava/ReadOnlyCollections.kt", ReadOnlyCollectionsKt::main);
  }

  @Test
  public void testCompanionFactory() {
    testExample("Examples/CompanionObjects/CompanionFactory.kt", companionobjects.CompanionFactoryKt::main);
  }

  @Test
  public void testCompanionObject() {
    testExample("Examples/CompanionObjects/CompanionObject.kt", CompanionObjectKt::main);
  }

  @Test
  public void testNamedCompanionObject() {
    testExample("Examples/CompanionObjects/NamedCompanionObject.kt", NamedCompanionObjectKt::main);
  }

  @Test
  public void testObjectCounter() {
    testExample("Examples/CompanionObjects/ObjectCounter.kt", ObjectCounterKt::main);
  }

  @Test
  public void testObjectFunctions() {
    testExample("Examples/CompanionObjects/ObjectFunctions.kt", ObjectFunctionsKt::main);
  }

  @Test
  public void testObjectProperty() {
    testExample("Examples/CompanionObjects/ObjectProperty.kt", ObjectPropertyKt::main);
  }

  @Test
  public void testExercise1() {
    testExample("Examples/ComplexConstructors/Exercise1.kt", complexconstructors.Exercise1Kt::main);
  }

  @Test
  public void testExercise2() {
    testExample("Examples/ComplexConstructors/Exercise2.kt", complexconstructors.Exercise2Kt::main);
  }

  @Test
  public void testExercise3() {
    testExample("Examples/ComplexConstructors/Exercise3.kt", complexconstructors.Exercise3Kt::main);
  }

  @Test
  public void testInitSection() {
    testExample("Examples/ComplexConstructors/InitSection.kt", complexconstructors.InitSectionKt::main);
  }

  @Test
  public void testSimpleConstructor() {
    testExample("Examples/ComplexConstructors/SimpleConstructor.kt", complexconstructors.SimpleConstructorKt::main);
  }

  @Test
  public void testCar() {
    testExample("Examples/Composition/Car.kt", composition.CarKt::main);
  }

  @Test
  public void testCompositionExercise1() {
    testExample("Examples/Composition/CompositionExercise1.kt", compositionex1.CompositionExercise1Kt::main);
  }

  @Test
  public void testCompositionExercise2() {
    testExample("Examples/Composition/CompositionExercise2.kt", compositionex2.CompositionExercise2Kt::main);
  }

  @Test
  public void testCompositionExercise3() {
    testExample("Examples/Composition/CompositionExercise3.kt", compositionex3.CompositionExercise3Kt::main);
  }

  @Test
  public void testArg() {
    testExample("Examples/Constructors/Arg.kt", ArgKt::main);
  }

  @Test
  public void testBear() {
    testExample("Examples/Constructors/Bear.kt", complexconstructors.BearKt::main);
  }

  @Test
  public void testDisplayAlienSpecies() {
    testExample("Examples/Constructors/DisplayAlienSpecies.kt", DisplayAlienSpeciesKt::main);
  }

  @Test
  public void testMultipleArgs() {
    testExample("Examples/Constructors/MultipleArgs.kt", MultipleArgsKt::main);
  }

  @Test
  public void testScientist() {
    testExample("Examples/Constructors/Scientist.kt", ScientistKt::main);
  }

  @Test
  public void testVisibleArgs() {
    testExample("Examples/Constructors/VisibleArgs.kt", VisibleArgsKt::main);
  }

  @Test
  public void testAnimals() {
    testExample("Examples/CreatingClasses/Animals.kt", AnimalsKt::main);
  }

  @Test
  public void testCat() {
    testExample("Examples/CreatingClasses/Cat.kt", CatKt::main);
  }

  @Test
  public void testDog() {
    testExample("Examples/CreatingClasses/Dog.kt", DogKt::main);
  }

  @Test
  public void testHamster() {
    testExample("Examples/CreatingClasses/Hamster.kt", HamsterKt::main);
  }

  @Test
  public void testEagerEvaluation() {
    testExample("Examples/CreatingSequences/EagerEvaluation.kt", EagerEvaluationKt::main);
  }

  @Test
  public void testEagerVsLazyEvaluation() {
    testExample("Examples/CreatingSequences/EagerVsLazyEvaluation.kt", creatingsequences.EagerVsLazyEvaluationKt::main);
  }

  @Test
  public void testNoComputationYet() {
    testExample("Examples/CreatingSequences/NoComputationYet.kt", creatingsequences.NoComputationYetKt::main);
  }

  @Test
  public void testTerminalOperations() {
    testExample("Examples/CreatingSequences/TerminalOperations.kt", creatingsequences.TerminalOperationsKt::main);
  }

  @Test
  public void testCopyDataClass() {
    testExample("Examples/DataClasses/CopyDataClass.kt", CopyDataClassKt::main);
  }

  @Test
  public void testDataClasses() {
    testExample("Examples/DataClasses/DataClasses.kt", dataclasses.DataClassesKt::main);
  }

  @Test
  public void testSimple() {
    testExample("Examples/DataClasses/Simple.kt", SimpleKt::main);
  }

  @Test
  public void testInference() {
    testExample("Examples/DataTypes/Inference.kt", InferenceKt::main);
  }

  @Test
  public void testStringPlusNumber() {
    testExample("Examples/DataTypes/StringPlusNumber.kt", StringPlusNumberKt::main);
  }

  @Test
  public void testTypes() {
    testExample("Examples/DataTypes/Types.kt", TypesKt::main);
  }

  @Test
  public void testBeverages() {
    testExample("Examples/DesigningWithInheritance/Beverages.kt", BeveragesKt::main);
  }

  @Test
  public void testMutableMaze() {
    testExample("Examples/DesigningWithInheritance/MutableMaze.kt", designingwithinheritance.MutableMazeKt::main);
  }

  @Test
  public void testUsingLists() {
    testExample("Examples/DesigningWithInheritance/UsingLists.kt", designingwithinheritance.UsingListsKt::main);
  }

  @Test
  public void testComputation() {
    testExample("Examples/Destructuring/Computation.kt", destructuring.ComputationKt::main);
  }

  @Test
  public void testForLoop() {
    testExample("Examples/Destructuring/ForLoop.kt", ForLoopKt::main);
  }

  @Test
  public void testPairDestructuring() {
    testExample("Examples/Destructuring/PairDestructuring.kt", destructuring.PairDestructuringKt::main);
  }

  @Test
  public void testPairs() {
    testExample("Examples/Destructuring/Pairs.kt", destructuring.PairsKt::main);
  }

  @Test
  public void testTuple() {
    testExample("Examples/Destructuring/Tuple.kt", destructuring.TupleKt::main);
  }

  @Test
  public void testCheckType() {
    testExample("Examples/DownCasting/CheckType.kt", downcasting.CheckTypeKt::main);
  }

  @Test
  public void testFilterIsInstance() {
    testExample("Examples/DownCasting/FilterIsInstance.kt", downcasting.FilterIsInstanceKt::main);
  }

  @Test
  public void testGame() {
    testExample("Examples/DownCasting/Game.kt", downcasting.GameKt::main);
  }

  @Test
  public void testWhenSubjectVariable() {
    testExample("Examples/DownCasting/WhenSubjectVariable.kt", downcasting.WhenSubjectVariableKt::main);
  }

  @Test
  public void testCheckingOptions() {
    testExample("Examples/Enumerations/CheckingOptions.kt", CheckingOptionsKt::main);
  }

  @Test
  public void testDirection() {
    testExample("Examples/Enumerations/Direction.kt", enumerations.DirectionKt::main);
  }

  @Test
  public void testEnumImport() {
    testExample("Examples/Enumerations/EnumImport.kt", EnumImportKt::main);
  }

  @Test
  public void testLevel() {
    testExample("Examples/Enumerations/Level.kt", enumerations.LevelKt::main);
  }

  @Test
  public void testRecursiveEnumImport() {
    testExample("Examples/Enumerations/RecursiveEnumImport.kt", enumerations.RecursiveEnumImportKt::main);
  }

  @Test
  public void testDefiningExceptions() {
    testExample("Examples/ExceptionHandling/DefiningExceptions.kt", exceptionhandling.DefiningExceptionsKt::main);
  }

  @Test
  public void testGuaranteedCleanup() {
    testExample("Examples/ExceptionHandling/GuaranteedCleanup.kt", GuaranteedCleanupKt::main);
  }

  @Test
  public void testHandlers() {
    testExample("Examples/ExceptionHandling/Handlers.kt", exceptionhandling.HandlersKt::main);
  }

  @Test
  public void testHierarchy() {
    testExample("Examples/ExceptionHandling/Hierarchy.kt", exceptionhandling.HierarchyKt::main);
  }

  @Test
  public void testKotlinChecked() {
    testExample("Examples/ExceptionHandling/KotlinChecked.kt", KotlinCheckedKt::main);
  }

  @Test
  public void testLibraryException() {
    testExample("Examples/ExceptionHandling/LibraryException.kt", exceptionhandling.LibraryExceptionKt::main);
  }

  @Test
  public void testNewException() {
    testExample("Examples/ExceptionHandling/NewException.kt", exceptionhandling.NewExceptionKt::main);
  }

  @Test
  public void testTryFinally() {
    testExample("Examples/ExceptionHandling/TryFinally.kt", exceptionhandling.TryFinallyKt::main);
  }

  @Test
  public void testWithCleanup() {
    testExample("Examples/ExceptionHandling/WithCleanup.kt", withfunction.WithCleanupKt::main);
  }

  @Test
  public void testAverageIncome() {
    testExample("Examples/Exceptions/AverageIncome.kt", firstversion.AverageIncomeKt::main);
  }

  @Test
  public void testAverageIncomeWithException() {
    testExample("Examples/Exceptions/AverageIncomeWithException.kt", properexception.AverageIncomeWithExceptionKt::main);
  }

  @Test
  public void testAverageIncomeWithNull() {
    testExample("Examples/Exceptions/AverageIncomeWithNull.kt", withnull.AverageIncomeWithNullKt::main);
  }

  @Test
  public void testIntroducingCapture() {
    testExample("Examples/Exceptions/IntroducingCapture.kt", IntroducingCaptureKt::main);
  }

  @Test
  public void testIntroducingNull() {
    testExample("Examples/Exceptions/IntroducingNull.kt", IntroducingNullKt::main);
  }

  @Test
  public void testToIntException() {
    testExample("Examples/Exceptions/ToIntException.kt", ToIntExceptionKt::main);
  }

  @Test
  public void testAssigningAnIf() {
    testExample("Examples/ExpressionsStatements/AssigningAnIf.kt", AssigningAnIfKt::main);
  }

  @Test
  public void testConfusing() {
    testExample("Examples/ExpressionsStatements/Confusing.kt", ConfusingKt::main);
  }

  @Test
  public void testForIsAStatement() {
    testExample("Examples/ExpressionsStatements/ForIsAStatement.kt", ForIsAStatementKt::main);
  }

  @Test
  public void testPostfixVsPrefix() {
    testExample("Examples/ExpressionsStatements/PostfixVsPrefix.kt", PostfixVsPrefixKt::main);
  }

  @Test
  public void testUnitReturnType() {
    testExample("Examples/ExpressionsStatements/UnitReturnType.kt", UnitReturnTypeKt::main);
  }

  @Test
  public void testBookExtensions() {
    testExample("Examples/ExtensionFunctions/BookExtensions.kt", BookExtensionsKt::main);
  }

  @Test
  public void testQuote() {
    testExample("Examples/ExtensionFunctions/Quote.kt", other.QuoteKt::main);
  }

  @Test
  public void testQuoting() {
    testExample("Examples/ExtensionFunctions/Quoting.kt", quoting.QuotingKt::main);
  }

  @Test
  public void testStrangeQuote() {
    testExample("Examples/ExtensionFunctions/StrangeQuote.kt", StrangeQuoteKt::main);
  }

  @Test
  public void testAnyFromListOfStar() {
    testExample("Examples/ExtensionProperties/AnyFromListOfStar.kt", extensionproperties.AnyFromListOfStarKt::main);
  }

  @Test
  public void testGenericListExt() {
    testExample("Examples/ExtensionProperties/GenericListExt.kt", extensionproperties.GenericListExtKt::main);
  }

  @Test
  public void testListOfStar() {
    testExample("Examples/ExtensionProperties/ListOfStar.kt", extensionproperties.ListOfStarKt::main);
  }

  @Test
  public void testStringIndices() {
    testExample("Examples/ExtensionProperties/StringIndices.kt", extensionproperties.StringIndicesKt::main);
  }

  @Test
  public void testFoldAndReduce() {
    testExample("Examples/FoldingLists/FoldAndReduce.kt", FoldAndReduceKt::main);
  }

  @Test
  public void testFoldRight() {
    testExample("Examples/FoldingLists/FoldRight.kt", FoldRightKt::main);
  }

  @Test
  public void testFoldVsForLoop() {
    testExample("Examples/FoldingLists/FoldVsForLoop.kt", FoldVsForLoopKt::main);
  }

  @Test
  public void testSumViaFold() {
    testExample("Examples/FoldingLists/SumViaFold.kt", SumViaFoldKt::main);
  }

  @Test
  public void testExtensionsToJavaClass() {
    testExample("Examples/fromkotlin/ExtensionsToJavaClass.kt", fromkotlin.ExtensionsToJavaClassKt::main);
  }

  @Test
  public void testRandom() {
    testExample("Examples/fromkotlin/Random.kt", RandomKt::main);
  }

  @Test
  public void testUseBeanClass() {
    testExample("Examples/fromkotlin/UseBeanClass.kt", UseBeanClassKt::main);
  }

  @Test
  public void testMultiplyByFour() {
    testExample("Examples/Functions/MultiplyByFour.kt", MultiplyByFourKt::main);
  }

  @Test
  public void testMultiplyByThree() {
    testExample("Examples/Functions/MultiplyByThree.kt", MultiplyByThreeKt::main);
  }

  @Test
  public void testMultiplyByTwo() {
    testExample("Examples/Functions/MultiplyByTwo.kt", MultiplyByTwoKt::main);
  }

  @Test
  public void testSayHello() {
    testExample("Examples/Functions/SayHello.kt", SayHelloKt::main);
  }

  @Test
  public void testBasicGenerics() {
    testExample("Examples/Generics/BasicGenerics.kt", generics.BasicGenericsKt::main);
  }

  @Test
  public void testCarHolder() {
    testExample("Examples/Generics/CarHolder.kt", generics.CarHolderKt::main);
  }

  @Test
  public void testGenericSpeakers() {
    testExample("Examples/Generics/GenericSpeakers.kt", generics.GenericSpeakersKt::main);
  }

  @Test
  public void testHolder() {
    testExample("Examples/Generics/Holder.kt", generics.HolderKt::main);
  }

  @Test
  public void testPerform() {
    testExample("Examples/Generics/Perform.kt", generics.PerformKt::main);
  }

  @Test
  public void testSpeakers() {
    testExample("Examples/Generics/Speakers.kt", generics.SpeakersKt::main);
  }

  @Test
  public void testEasyKeys() {
    testExample("Examples/Hashing/EasyKeys.kt", hashing.EasyKeysKt::main);
  }

  @Test
  public void testHashCodeFailure() {
    testExample("Examples/Hashing/HashCodeFailure.kt", HashCodeFailureKt::main);
  }

  @Test
  public void testKeyFailure() {
    testExample("Examples/Hashing/KeyFailure.kt", KeyFailureKt::main);
  }

  @Test
  public void testPets() {
    testExample("Examples/Hashing/Pets.kt", hashing.PetsKt::main);
  }

  @Test
  public void testSimpleHashing() {
    testExample("Examples/Hashing/SimpleHashing.kt", SimpleHashingKt::main);
  }

  @Test
  public void testStringHashCode() {
    testExample("Examples/Hashing/StringHashCode.kt", StringHashCodeKt::main);
  }

  @Test
  public void testUnpredictableHashing() {
    testExample("Examples/Hashing/UnpredictableHashing.kt", UnpredictableHashingKt::main);
  }

  @Test
  public void testEmptyProgram() {
    testExample("Examples/HelloWorld/EmptyProgram.kt", EmptyProgramKt::main);
  }

  @Test
  public void testHelloWorld() {
    testExample("Examples/HelloWorld/HelloWorld.kt", HelloWorldKt::main);
  }

  @Test
  public void testAny() {
    testExample("Examples/HigherOrderFunctions/Any.kt", AnyKt::main);
  }

  @Test
  public void testNullableFunction() {
    testExample("Examples/HigherOrderFunctions/NullableFunction.kt", NullableFunctionKt::main);
  }

  @Test
  public void testNullableReturn() {
    testExample("Examples/HigherOrderFunctions/NullableReturn.kt", NullableReturnKt::main);
  }

  @Test
  public void testRepeatByInt() {
    testExample("Examples/HigherOrderFunctions/RepeatByInt.kt", RepeatByIntKt::main);
  }

  @Test
  public void testRepeatFun() {
    testExample("Examples/HigherOrderFunctions/RepeatFun.kt", definingrepeat.RepeatFunKt::main);
  }

  @Test
  public void testRepeatVerbose() {
    testExample("Examples/HigherOrderFunctions/RepeatVerbose.kt", RepeatVerboseKt::main);
  }

  @Test
  public void testSimpleOperation() {
    testExample("Examples/HigherOrderFunctions/SimpleOperation.kt", SimpleOperationKt::main);
  }

  @Test
  public void testTypeDeclarations() {
    testExample("Examples/HigherOrderFunctions/TypeDeclarations.kt", TypeDeclarationsKt::main);
  }

  @Test
  public void testIf1() {
    testExample("Examples/IfExpressions/If1.kt", If1Kt::main);
  }

  @Test
  public void testIf2() {
    testExample("Examples/IfExpressions/If2.kt", If2Kt::main);
  }

  @Test
  public void testIf3() {
    testExample("Examples/IfExpressions/If3.kt", If3Kt::main);
  }

  @Test
  public void testIf4() {
    testExample("Examples/IfExpressions/If4.kt", If4Kt::main);
  }

  @Test
  public void testIf5() {
    testExample("Examples/IfExpressions/If5.kt", If5Kt::main);
  }

  @Test
  public void testIf6() {
    testExample("Examples/IfExpressions/If6.kt", If6Kt::main);
  }

  @Test
  public void testOneOrTheOther() {
    testExample("Examples/IfExpressions/OneOrTheOther.kt", OneOrTheOtherKt::main);
  }

  @Test
  public void testTrueOrFalse() {
    testExample("Examples/IfExpressions/TrueOrFalse.kt", TrueOrFalseKt::main);
  }

  @Test
  public void testColorBlend() {
    testExample("Examples/Immutability/ColorBlend.kt", colorblend.ColorBlendKt::main);
  }

  @Test
  public void testDataClassCopy() {
    testExample("Examples/Immutability/DataClassCopy.kt", DataClassCopyKt::main);
  }

  @Test
  public void testMutableBlendMap() {
    testExample("Examples/Immutability/MutableBlendMap.kt", mutableblendmap.MutableBlendMapKt::main);
  }

  @Test
  public void testMutableBlendMap2() {
    testExample("Examples/Immutability/MutableBlendMap2.kt", mutableblendmap2.MutableBlendMap2Kt::main);
  }

  @Test
  public void testReadOnlyBlendMap() {
    testExample("Examples/Immutability/ReadOnlyBlendMap.kt", readonlyblendmap.ReadOnlyBlendMapKt::main);
  }

  @Test
  public void testReadOnlyBlendMap2() {
    testExample("Examples/Immutability/ReadOnlyBlendMap2.kt", readonlyblendmap2.ReadOnlyBlendMap2Kt::main);
  }

  @Test
  public void testReadOnlyBlendMap3() {
    testExample("Examples/Immutability/ReadOnlyBlendMap3.kt", readonlyblendmap3.ReadOnlyBlendMap3Kt::main);
  }

  @Test
  public void testXYZFlatMap() {
    testExample("Examples/Immutability/XYZFlatMap.kt", xyzflatmap.XYZFlatMapKt::main);
  }

  @Test
  public void testXYZMap() {
    testExample("Examples/Immutability/XYZMap.kt", xyzmap.XYZMapKt::main);
  }

  @Test
  public void testClosures() {
    testExample("Examples/ImportanceOfLambdas/Closures.kt", ClosuresKt::main);
  }

  @Test
  public void testClosures2() {
    testExample("Examples/ImportanceOfLambdas/Closures2.kt", Closures2Kt::main);
  }

  @Test
  public void testFilter() {
    testExample("Examples/ImportanceOfLambdas/Filter.kt", FilterKt::main);
  }

  @Test
  public void testFilterEven() {
    testExample("Examples/ImportanceOfLambdas/FilterEven.kt", FilterEvenKt::main);
  }

  @Test
  public void testFunctionClosure() {
    testExample("Examples/ImportanceOfLambdas/FunctionClosure.kt", FunctionClosureKt::main);
  }

  @Test
  public void testGreaterThan2() {
    testExample("Examples/ImportanceOfLambdas/GreaterThan2.kt", GreaterThan2Kt::main);
  }

  @Test
  public void testStoringLambda() {
    testExample("Examples/ImportanceOfLambdas/StoringLambda.kt", StoringLambdaKt::main);
  }

  @Test
  public void testSum() {
    testExample("Examples/ImportanceOfLambdas/Sum.kt", SumKt::main);
  }

  @Test
  public void testGreatApe() {
    testExample("Examples/Inheritance/GreatApe.kt", inheritance.ape1.GreatApeKt::main);
  }

  @Test
  public void testGreatApe2() {
    testExample("Examples/Inheritance/GreatApe2.kt", inheritance.ape2.GreatApe2Kt::main);
  }

  @Test
  public void testGadgetExtensions() {
    testExample("Examples/InheritanceAndExtensions/GadgetExtensions.kt", inheritanceandextensions2.GadgetExtensionsKt::main);
  }

  @Test
  public void testGadgetMembers() {
    testExample("Examples/InheritanceAndExtensions/GadgetMembers.kt", inheritanceandextensions1.GadgetMembersKt::main);
  }

  @Test
  public void testCharRange() {
    testExample("Examples/InKeyword/CharRange.kt", CharRangeKt::main);
  }

  @Test
  public void testFloatingPointRange() {
    testExample("Examples/InKeyword/FloatingPointRange.kt", FloatingPointRangeKt::main);
  }

  @Test
  public void testInString() {
    testExample("Examples/InKeyword/InString.kt", InStringKt::main);
  }

  @Test
  public void testIterationVsMembership() {
    testExample("Examples/InKeyword/IterationVsMembership.kt", IterationVsMembershipKt::main);
  }

  @Test
  public void testMembershipInRange() {
    testExample("Examples/InKeyword/MembershipInRange.kt", MembershipInRangeKt::main);
  }

  @Test
  public void testMembershipUsingBounds() {
    testExample("Examples/InKeyword/MembershipUsingBounds.kt", MembershipUsingBoundsKt::main);
  }

  @Test
  public void testStringRange() {
    testExample("Examples/InKeyword/StringRange.kt", StringRangeKt::main);
  }

  @Test
  public void testComputer() {
    testExample("Examples/Interfaces/Computer.kt", interfaces.ComputerKt::main);
  }

  @Test
  public void testAnyInstead() {
    testExample("Examples/IntroGenerics/AnyInstead.kt", introgenerics.AnyInsteadKt::main);
  }

  @Test
  public void testGenericFunction() {
    testExample("Examples/IntroGenerics/GenericFunction.kt", introgenerics.GenericFunctionKt::main);
  }

  @Test
  public void testGenericHolder() {
    testExample("Examples/IntroGenerics/GenericHolder.kt", introgenerics.GenericHolderKt::main);
  }

  @Test
  public void testGenericListExtensions() {
    testExample("Examples/IntroGenerics/GenericListExtensions.kt", introgenerics.GenericListExtensionsKt::main);
  }

  @Test
  public void testRigidHolder() {
    testExample("Examples/IntroGenerics/RigidHolder.kt", introgenerics.RigidHolderKt::main);
  }

  @Test
  public void testLabeledThis() {
    testExample("Examples/LabeledThis/LabeledThis.kt", labeledthis.LabeledThisKt::main);
  }

  @Test
  public void testBasicLambda() {
    testExample("Examples/Lambdas/BasicLambda.kt", BasicLambdaKt::main);
  }

  @Test
  public void testJoinToString() {
    testExample("Examples/Lambdas/JoinToString.kt", JoinToStringKt::main);
  }

  @Test
  public void testLambdaAndNamedArgs() {
    testExample("Examples/Lambdas/LambdaAndNamedArgs.kt", LambdaAndNamedArgsKt::main);
  }

  @Test
  public void testLambdaIt() {
    testExample("Examples/Lambdas/LambdaIt.kt", LambdaItKt::main);
  }

  @Test
  public void testLambdaTypeInference() {
    testExample("Examples/Lambdas/LambdaTypeInference.kt", LambdaTypeInferenceKt::main);
  }

  @Test
  public void testListIndicesMap() {
    testExample("Examples/Lambdas/ListIndicesMap.kt", ListIndicesMapKt::main);
  }

  @Test
  public void testMapping() {
    testExample("Examples/Lambdas/Mapping.kt", MappingKt::main);
  }

  @Test
  public void testOmittingParentheses() {
    testExample("Examples/Lambdas/OmittingParentheses.kt", OmittingParenthesesKt::main);
  }

  @Test
  public void testTwoArgLambda() {
    testExample("Examples/Lambdas/TwoArgLambda.kt", TwoArgLambdaKt::main);
  }

  @Test
  public void testUnderscore() {
    testExample("Examples/Lambdas/Underscore.kt", UnderscoreKt::main);
  }

  @Test
  public void testZeroArguments() {
    testExample("Examples/Lambdas/ZeroArguments.kt", ZeroArgumentsKt::main);
  }

  @Test
  public void testBuildString() {
    testExample("Examples/LambdaWithReceiver/BuildString.kt", BuildStringKt::main);
  }

  @Test
  public void testBuildStringAndThis() {
    testExample("Examples/LambdaWithReceiver/BuildStringAndThis.kt", BuildStringAndThisKt::main);
  }

  @Test
  public void testDeclarations() {
    testExample("Examples/LambdaWithReceiver/Declarations.kt", lambdawithreceiver.DeclarationsKt::main);
  }

  @Test
  public void testRegularLambda() {
    testExample("Examples/LambdaWithReceiver/RegularLambda.kt", regularlambda.RegularLambdaKt::main);
  }

  @Test
  public void testStringBuilder() {
    testExample("Examples/LambdaWithReceiver/StringBuilder.kt", StringBuilderKt::main);
  }

  @Test
  public void testBetterSuitcase() {
    testExample("Examples/LateInitialization/BetterSuitcase.kt", lateinitialization.BetterSuitcaseKt::main);
  }

  @Test
  public void testFaultySuitcase() {
    testExample("Examples/LateInitialization/FaultySuitcase.kt", lateinitialization.FaultySuitcaseKt::main);
  }

  @Test
  public void testSuitcase() {
    testExample("Examples/LateInitialization/Suitcase.kt", lateinitialization.SuitcaseKt::main);
  }

  @Test
  public void testLazyInt() {
    testExample("Examples/LazyInitialization/LazyInt.kt", LazyIntKt::main);
  }

  @Test
  public void testLazySyntax() {
    testExample("Examples/LazyInitialization/LazySyntax.kt", lazyinitialization.LazySyntaxKt::main);
  }

  @Test
  public void testPropertyOptions() {
    testExample("Examples/LazyInitialization/PropertyOptions.kt", lazyinitialization.PropertyOptionsKt::main);
  }

  @Test
  public void testLists() {
    testExample("Examples/Lists/Lists.kt", ListsKt::main);
  }

  @Test
  public void testListUsefulFunction() {
    testExample("Examples/Lists/ListUsefulFunction.kt", ListUsefulFunctionKt::main);
  }

  @Test
  public void testMultipleListRefs() {
    testExample("Examples/Lists/MultipleListRefs.kt", MultipleListRefsKt::main);
  }

  @Test
  public void testMutableList() {
    testExample("Examples/Lists/MutableList.kt", MutableListKt::main);
  }

  @Test
  public void testMutListIsList() {
    testExample("Examples/Lists/MutListIsList.kt", MutListIsListKt::main);
  }

  @Test
  public void testOutOfBounds() {
    testExample("Examples/Lists/OutOfBounds.kt", OutOfBoundsKt::main);
  }

  @Test
  public void testParameterizedReturn() {
    testExample("Examples/Lists/ParameterizedReturn.kt", ParameterizedReturnKt::main);
  }

  @Test
  public void testParameterizedTypes() {
    testExample("Examples/Lists/ParameterizedTypes.kt", ParameterizedTypesKt::main);
  }

  @Test
  public void testCustomLabel() {
    testExample("Examples/LocalFunctions/CustomLabel.kt", CustomLabelKt::main);
  }

  @Test
  public void testHelperFunction() {
    testExample("Examples/LocalFunctions/HelperFunction.kt", localfunctions.HelperFunctionKt::main);
  }

  @Test
  public void testInterestingSessions() {
    testExample("Examples/LocalFunctions/InterestingSessions.kt", localfunctions.InterestingSessionsKt::main);
  }

  @Test
  public void testLabeledReturn() {
    testExample("Examples/LocalFunctions/LabeledReturn.kt", LabeledReturnKt::main);
  }

  @Test
  public void testLocalExtensions() {
    testExample("Examples/LocalFunctions/LocalExtensions.kt", LocalExtensionsKt::main);
  }

  @Test
  public void testLocalFunctionReference() {
    testExample("Examples/LocalFunctions/LocalFunctionReference.kt", localfunctions.LocalFunctionReferenceKt::main);
  }

  @Test
  public void testLocalFunctions() {
    testExample("Examples/LocalFunctions/LocalFunctions.kt", LocalFunctionsKt::main);
  }

  @Test
  public void testReturnFromFun() {
    testExample("Examples/LocalFunctions/ReturnFromFun.kt", ReturnFromFunKt::main);
  }

  @Test
  public void testReturnInsideLambda() {
    testExample("Examples/LocalFunctions/ReturnInsideLambda.kt", localfunctions.ReturnInsideLambdaKt::main);
  }

  @Test
  public void testBasicLogging() {
    testExample("Examples/Logging/BasicLogging.kt", logging.BasicLoggingKt::main);
  }

  @Test
  public void testSimpleLoggingStrategy() {
    testExample("Examples/Logging/SimpleLoggingStrategy.kt", logging.SimpleLoggingStrategyKt::main);
  }

  @Test
  public void testUseAtomicLog() {
    testExample("Examples/Logging/UseAtomicLog.kt", UseAtomicLogKt::main);
  }

  @Test
  public void testAddingIntToChar() {
    testExample("Examples/LoopingAndRanges/AddingIntToChar.kt", AddingIntToCharKt::main);
  }

  @Test
  public void testDefiningRanges() {
    testExample("Examples/LoopingAndRanges/DefiningRanges.kt", DefiningRangesKt::main);
  }

  @Test
  public void testForWithCharRange() {
    testExample("Examples/LoopingAndRanges/ForWithCharRange.kt", ForWithCharRangeKt::main);
  }

  @Test
  public void testForWithRanges() {
    testExample("Examples/LoopingAndRanges/ForWithRanges.kt", ForWithRangesKt::main);
  }

  @Test
  public void testHasChar() {
    testExample("Examples/LoopingAndRanges/HasChar.kt", HasCharKt::main);
  }

  @Test
  public void testIndexIntoString() {
    testExample("Examples/LoopingAndRanges/IndexIntoString.kt", IndexIntoStringKt::main);
  }

  @Test
  public void testIterateOverString() {
    testExample("Examples/LoopingAndRanges/IterateOverString.kt", IterateOverStringKt::main);
  }

  @Test
  public void testRepeat() {
    testExample("Examples/LoopingAndRanges/Repeat.kt", RepeatKt::main);
  }

  @Test
  public void testRepeatThreeTimes() {
    testExample("Examples/LoopingAndRanges/RepeatThreeTimes.kt", RepeatThreeTimesKt::main);
  }

  @Test
  public void testSumUsingRange() {
    testExample("Examples/LoopingAndRanges/SumUsingRange.kt", SumUsingRangeKt::main);
  }

  @Test
  public void testFlatten() {
    testExample("Examples/ManipulatingLists/Flatten.kt", FlattenKt::main);
  }

  @Test
  public void testFlattenAndFlatMap() {
    testExample("Examples/ManipulatingLists/FlattenAndFlatMap.kt", FlattenAndFlatMapKt::main);
  }

  @Test
  public void testWhyFlatMap() {
    testExample("Examples/ManipulatingLists/WhyFlatMap.kt", manipulatinglists.WhyFlatMapKt::main);
  }

  @Test
  public void testZipAndTransform() {
    testExample("Examples/ManipulatingLists/ZipAndTransform.kt", manipulatinglists.ZipAndTransformKt::main);
  }

  @Test
  public void testZipper() {
    testExample("Examples/ManipulatingLists/Zipper.kt", ZipperKt::main);
  }

  @Test
  public void testZippingWithNext() {
    testExample("Examples/ManipulatingLists/ZippingWithNext.kt", ZippingWithNextKt::main);
  }

  @Test
  public void testContactMap() {
    testExample("Examples/Maps/ContactMap.kt", ContactMapKt::main);
  }

  @Test
  public void testGetValue() {
    testExample("Examples/Maps/GetValue.kt", GetValueKt::main);
  }

  @Test
  public void testMaps() {
    testExample("Examples/Maps/Maps.kt", MapsKt::main);
  }

  @Test
  public void testMutableMaps() {
    testExample("Examples/Maps/MutableMaps.kt", MutableMapsKt::main);
  }

  @Test
  public void testReadOnlyMaps() {
    testExample("Examples/Maps/ReadOnlyMaps.kt", ReadOnlyMapsKt::main);
  }

  @Test
  public void testConstructorReference() {
    testExample("Examples/MemberReferences/ConstructorReference.kt", memberreferences3.ConstructorReferenceKt::main);
  }

  @Test
  public void testFunctionReference() {
    testExample("Examples/MemberReferences/FunctionReference.kt", memberreferences2.FunctionReferenceKt::main);
  }

  @Test
  public void testPropertyReference() {
    testExample("Examples/MemberReferences/PropertyReference.kt", memberreferences1.PropertyReferenceKt::main);
  }

  @Test
  public void testSortWith() {
    testExample("Examples/MemberReferences/SortWith.kt", memberreferences1.SortWithKt::main);
  }

  @Test
  public void testTopLevelFunctionRef() {
    testExample("Examples/MemberReferences/TopLevelFunctionRef.kt", memberreferences2.TopLevelFunctionRefKt::main);
  }

  @Test
  public void testDefineTakeIf() {
    testExample("Examples/MoreLibraryFunctions/DefineTakeIf.kt", definetakeif.DefineTakeIfKt::main);
  }

  @Test
  public void testInputLines1() {
    testExample("Examples/MoreLibraryFunctions/InputLines1.kt", InputLines1Kt::main);
  }

  @Test
  public void testInputLines2() {
    testExample("Examples/MoreLibraryFunctions/InputLines2.kt", InputLines2Kt::main);
  }

  @Test
  public void testNumberSequence1() {
    testExample("Examples/MoreLibraryFunctions/NumberSequence1.kt", NumberSequence1Kt::main);
  }

  @Test
  public void testNumberSequence2() {
    testExample("Examples/MoreLibraryFunctions/NumberSequence2.kt", NumberSequence2Kt::main);
  }

  @Test
  public void testReadingName() {
    testExample("Examples/MoreLibraryFunctions/ReadingName.kt", ReadingNameKt::main);
  }

  @Test
  public void testReadingNameWithIf() {
    testExample("Examples/MoreLibraryFunctions/ReadingNameWithIf.kt", ReadingNameWithIfKt::main);
  }

  @Test
  public void testArgumentOrder() {
    testExample("Examples/NamedAndDefaultArgs/ArgumentOrder.kt", color1.ArgumentOrderKt::main);
  }

  @Test
  public void testColor2() {
    testExample("Examples/NamedAndDefaultArgs/Color2.kt", color2.Color2Kt::main);
  }

  @Test
  public void testColor3() {
    testExample("Examples/NamedAndDefaultArgs/Color3.kt", color3.Color3Kt::main);
  }

  @Test
  public void testCreateString() {
    testExample("Examples/NamedAndDefaultArgs/CreateString.kt", CreateStringKt::main);
  }

  @Test
  public void testCreateString2() {
    testExample("Examples/NamedAndDefaultArgs/CreateString2.kt", CreateString2Kt::main);
  }

  @Test
  public void testEvaluation() {
    testExample("Examples/NamedAndDefaultArgs/Evaluation.kt", EvaluationKt::main);
  }

  @Test
  public void testNamedArguments() {
    testExample("Examples/NamedAndDefaultArgs/NamedArguments.kt", color1.NamedArgumentsKt::main);
  }

  @Test
  public void testTrimMargin() {
    testExample("Examples/NamedAndDefaultArgs/TrimMargin.kt", TrimMarginKt::main);
  }

  @Test
  public void testNonNullAssert() {
    testExample("Examples/NonNullAssertions/NonNullAssert.kt", NonNullAssertKt::main);
  }

  @Test
  public void testNonNullAssertCall() {
    testExample("Examples/NonNullAssertions/NonNullAssertCall.kt", NonNullAssertCallKt::main);
  }

  @Test
  public void testValueFromMap() {
    testExample("Examples/NonNullAssertions/ValueFromMap.kt", ValueFromMapKt::main);
  }

  @Test
  public void testCheckObject() {
    testExample("Examples/NothingType/CheckObject.kt", nothingtype.CheckObjectKt::main);
  }

  @Test
  public void testCheckObject2() {
    testExample("Examples/NothingType/CheckObject2.kt", nothingtype.CheckObject2Kt::main);
  }

  @Test
  public void testFail() {
    testExample("Examples/NothingType/Fail.kt", nothingtype.FailKt::main);
  }

  @Test
  public void testTodo() {
    testExample("Examples/NothingType/Todo.kt", nothingtype.TodoKt::main);
  }

  @Test
  public void testAnnotatedJava() {
    testExample("Examples/NullabilityAnnotations/AnnotatedJava.kt", nullabilityannotations.AnnotatedJavaKt::main);
  }

  @Test
  public void testDefinition() {
    testExample("Examples/NullableExtensions/Definition.kt", DefinitionKt::main);
  }

  @Test
  public void testNullableParameter() {
    testExample("Examples/NullableExtensions/NullableParameter.kt", NullableParameterKt::main);
  }

  @Test
  public void testStringIsNullOr() {
    testExample("Examples/NullableExtensions/StringIsNullOr.kt", StringIsNullOrKt::main);
  }

  @Test
  public void testAmphibian() {
    testExample("Examples/NullableTypes/Amphibian.kt", AmphibianKt::main);
  }

  @Test
  public void testDereference() {
    testExample("Examples/NullableTypes/Dereference.kt", DereferenceKt::main);
  }

  @Test
  public void testExplicitCheck() {
    testExample("Examples/NullableTypes/ExplicitCheck.kt", ExplicitCheckKt::main);
  }

  @Test
  public void testNullableInMap() {
    testExample("Examples/NullableTypes/NullableInMap.kt", NullableInMapKt::main);
  }

  @Test
  public void testNullableTypes() {
    testExample("Examples/NullableTypes/NullableTypes.kt", NullableTypesKt::main);
  }

  @Test
  public void testNullInMaps() {
    testExample("Examples/NullableTypes/NullInMaps.kt", NullInMapsKt::main);
  }

  @Test
  public void testBiggestLong() {
    testExample("Examples/NumberTypes/BiggestLong.kt", BiggestLongKt::main);
  }

  @Test
  public void testBMIEnglish() {
    testExample("Examples/NumberTypes/BMIEnglish.kt", BMIEnglishKt::main);
  }

  @Test
  public void testBMIMetric() {
    testExample("Examples/NumberTypes/BMIMetric.kt", BMIMetricKt::main);
  }

  @Test
  public void testInferInt() {
    testExample("Examples/NumberTypes/InferInt.kt", InferIntKt::main);
  }

  @Test
  public void testIntDivisionTruncates() {
    testExample("Examples/NumberTypes/IntDivisionTruncates.kt", IntDivisionTruncatesKt::main);
  }

  @Test
  public void testIntegerOverflow() {
    testExample("Examples/NumberTypes/IntegerOverflow.kt", IntegerOverflowKt::main);
  }

  @Test
  public void testLongConstants() {
    testExample("Examples/NumberTypes/LongConstants.kt", LongConstantsKt::main);
  }

  @Test
  public void testModulus() {
    testExample("Examples/NumberTypes/Modulus.kt", ModulusKt::main);
  }

  @Test
  public void testOpOrder() {
    testExample("Examples/NumberTypes/OpOrder.kt", OpOrderKt::main);
  }

  @Test
  public void testOpOrderParens() {
    testExample("Examples/NumberTypes/OpOrderParens.kt", OpOrderParensKt::main);
  }

  @Test
  public void testUsingLongs() {
    testExample("Examples/NumberTypes/UsingLongs.kt", UsingLongsKt::main);
  }

  @Test
  public void testExploreMaze() {
    testExample("Examples/ObjectOrientedDesign/ExploreMaze.kt", robotexplorer.ExploreMazeKt::main);
  }

  @Test
  public void testObjectInheritance() {
    testExample("Examples/Objects/ObjectInheritance.kt", ObjectInheritanceKt::main);
  }

  @Test
  public void testObjectKeyword() {
    testExample("Examples/Objects/ObjectKeyword.kt", ObjectKeywordKt::main);
  }

  @Test
  public void testObjectNesting() {
    testExample("Examples/Objects/ObjectNesting.kt", ObjectNestingKt::main);
  }

  @Test
  public void testShare2() {
    testExample("Examples/Objects/Share2.kt", objectshare2.Share2Kt::main);
  }

  @Test
  public void testConversion() {
    testExample("Examples/ObjectsEverywhere/Conversion.kt", ConversionKt::main);
  }

  @Test
  public void testIntRanges() {
    testExample("Examples/ObjectsEverywhere/IntRanges.kt", IntRangesKt::main);
  }

  @Test
  public void testNumberConversions() {
    testExample("Examples/ObjectsEverywhere/NumberConversions.kt", NumberConversionsKt::main);
  }

  @Test
  public void testRangeSum() {
    testExample("Examples/ObjectsEverywhere/RangeSum.kt", RangeSumKt::main);
  }

  @Test
  public void testStrings() {
    testExample("Examples/ObjectsEverywhere/Strings.kt", StringsKt::main);
  }

  @Test
  public void testByOperations() {
    testExample("Examples/OperationsOnCollections/ByOperations.kt", ByOperationsKt::main);
  }

  @Test
  public void testCreatingLists() {
    testExample("Examples/OperationsOnCollections/CreatingLists.kt", CreatingListsKt::main);
  }

  @Test
  public void testFilterNotNull() {
    testExample("Examples/OperationsOnCollections/FilterNotNull.kt", FilterNotNullKt::main);
  }

  @Test
  public void testListInit() {
    testExample("Examples/OperationsOnCollections/ListInit.kt", ListInitKt::main);
  }

  @Test
  public void testOperationsOnSets() {
    testExample("Examples/OperationsOnCollections/OperationsOnSets.kt", OperationsOnSetsKt::main);
  }

  @Test
  public void testPairOfLists() {
    testExample("Examples/OperationsOnCollections/PairOfLists.kt", PairOfListsKt::main);
  }

  @Test
  public void testPartition() {
    testExample("Examples/OperationsOnCollections/Partition.kt", PartitionKt::main);
  }

  @Test
  public void testPredicates() {
    testExample("Examples/OperationsOnCollections/Predicates.kt", PredicatesKt::main);
  }

  @Test
  public void testTakeOrDrop() {
    testExample("Examples/OperationsOnCollections/TakeOrDrop.kt", TakeOrDropKt::main);
  }

  @Test
  public void testAllOperators() {
    testExample("Examples/OperatorOverloading/AllOperators.kt", operatoroverloading.AllOperatorsKt::main);
  }

  @Test
  public void testBackticks() {
    testExample("Examples/OperatorOverloading/Backticks.kt", BackticksKt::main);
  }

  @Test
  public void testInvoke() {
    testExample("Examples/OperatorOverloading/Invoke.kt", InvokeKt::main);
  }

  @Test
  public void testMemberOperator() {
    testExample("Examples/OperatorOverloading/MemberOperator.kt", operatoroverloading.MemberOperatorKt::main);
  }

  @Test
  public void testMolecule() {
    testExample("Examples/OperatorOverloading/Molecule.kt", MoleculeKt::main);
  }

  @Test
  public void testNum() {
    testExample("Examples/OperatorOverloading/Num.kt", operatoroverloading.NumKt::main);
  }

  @Test
  public void testStringInvoke() {
    testExample("Examples/OperatorOverloading/StringInvoke.kt", StringInvokeKt::main);
  }

  @Test
  public void testSwearing() {
    testExample("Examples/OperatorOverloading/Swearing.kt", SwearingKt::main);
  }

  @Test
  public void testMemberVsExtension() {
    testExample("Examples/Overloading/MemberVsExtension.kt", MemberVsExtensionKt::main);
  }

  @Test
  public void testOverloadedVsDefaultArg() {
    testExample("Examples/Overloading/OverloadedVsDefaultArg.kt", overloadingvsdefaultargs.OverloadedVsDefaultArgKt::main);
  }

  @Test
  public void testOverloading() {
    testExample("Examples/Overloading/Overloading.kt", OverloadingKt::main);
  }

  @Test
  public void testOverloadingAdd() {
    testExample("Examples/Overloading/OverloadingAdd.kt", OverloadingAddKt::main);
  }

  @Test
  public void testWithDefaultArguments() {
    testExample("Examples/Overloading/WithDefaultArguments.kt", withdefaultarguments.WithDefaultArgumentsKt::main);
  }

  @Test
  public void testWithoutDefaultArguments() {
    testExample("Examples/Overloading/WithoutDefaultArguments.kt", withoutdefaultarguments.WithoutDefaultArgumentsKt::main);
  }

  @Test
  public void testFullyQualify() {
    testExample("Examples/Packages/FullyQualify.kt", FullyQualifyKt::main);
  }

  @Test
  public void testImportClass() {
    testExample("Examples/Packages/ImportClass.kt", ImportClassKt::main);
  }

  @Test
  public void testImportEverything() {
    testExample("Examples/Packages/ImportEverything.kt", ImportEverythingKt::main);
  }

  @Test
  public void testImportNameChange() {
    testExample("Examples/Packages/ImportNameChange.kt", ImportNameChangeKt::main);
  }

  @Test
  public void testImportPythagorean() {
    testExample("Examples/Packages/ImportPythagorean.kt", ImportPythagoreanKt::main);
  }

  @Test
  public void testModule2() {
    testExample("Examples/Packages/Module2.kt", module2.Module2Kt::main);
  }

  @Test
  public void testNPEOnPlatformType() {
    testExample("Examples/PlatformTypes/NPEOnPlatformType.kt", NPEOnPlatformTypeKt::main);
  }

  @Test
  public void testPlatformTypes() {
    testExample("Examples/PlatformTypes/PlatformTypes.kt", PlatformTypesKt::main);
  }

  @Test
  public void testFantasyGame() {
    testExample("Examples/Polymorphism/FantasyGame.kt", polymorphism.FantasyGameKt::main);
  }

  @Test
  public void testPet() {
    testExample("Examples/Polymorphism/Pet.kt", polymorphism.PetKt::main);
  }

  @Test
  public void testPolyExercise1() {
    testExample("Examples/Polymorphism/PolyExercise1.kt", polymorphismex1.PolyExercise1Kt::main);
  }

  @Test
  public void testPolyExercise2() {
    testExample("Examples/Polymorphism/PolyExercise2.kt", polymorphismex2.PolyExercise2Kt::main);
  }

  @Test
  public void testPolyExercise3() {
    testExample("Examples/Polymorphism/PolyExercise3.kt", polymorphism.PolyExercise3Kt::main);
  }

  @Test
  public void testAnUnchangingVar() {
    testExample("Examples/Properties/AnUnchangingVar.kt", AnUnchangingVarKt::main);
  }

  @Test
  public void testChangingAVal() {
    testExample("Examples/Properties/ChangingAVal.kt", ChangingAValKt::main);
  }

  @Test
  public void testCup() {
    testExample("Examples/Properties/Cup.kt", CupKt::main);
  }

  @Test
  public void testCup2() {
    testExample("Examples/Properties/Cup2.kt", Cup2Kt::main);
  }

  @Test
  public void testReferences() {
    testExample("Examples/Properties/References.kt", ReferencesKt::main);
  }

  @Test
  public void testCounter() {
    testExample("Examples/PropertyAccessors/Counter.kt", propertyaccessors.CounterKt::main);
  }

  @Test
  public void testData() {
    testExample("Examples/PropertyAccessors/Data.kt", propertyaccessors.DataKt::main);
  }

  @Test
  public void testDefault() {
    testExample("Examples/PropertyAccessors/Default.kt", DefaultKt::main);
  }

  @Test
  public void testHamsters() {
    testExample("Examples/PropertyAccessors/Hamsters.kt", propertyaccessors.HamstersKt::main);
  }

  @Test
  public void testLogChanges() {
    testExample("Examples/PropertyAccessors/LogChanges.kt", LogChangesKt::main);
  }

  @Test
  public void testFibonacciProperty() {
    testExample("Examples/PropertyDelegation/FibonacciProperty.kt", FibonacciPropertyKt::main);
  }

  @Test
  public void testNickName() {
    testExample("Examples/PropertyDelegation/NickName.kt", propertydelegation.NickNameKt::main);
  }

  @Test
  public void testTeam() {
    testExample("Examples/PropertyDelegation/Team.kt", TeamKt::main);
  }

  @Test
  public void testTeamWithTraditions() {
    testExample("Examples/PropertyDelegation/TeamWithTraditions.kt", TeamWithTraditionsKt::main);
  }

  @Test
  public void testCallStack() {
    testExample("Examples/Recursion/CallStack.kt", recursion.CallStackKt::main);
  }

  @Test
  public void testFactorial() {
    testExample("Examples/Recursion/Factorial.kt", recursion.FactorialKt::main);
  }

  @Test
  public void testFibonacci() {
    testExample("Examples/Recursion/Fibonacci.kt", recursion.FibonacciKt::main);
  }

  @Test
  public void testInfiniteRecursion() {
    testExample("Examples/Recursion/InfiniteRecursion.kt", recursion.InfiniteRecursionKt::main);
  }

  @Test
  public void testIteration() {
    testExample("Examples/Recursion/Iteration.kt", iteration.IterationKt::main);
  }

  @Test
  public void testRecursionLimits() {
    testExample("Examples/Recursion/RecursionLimits.kt", recursion.RecursionLimitsKt::main);
  }

  @Test
  public void testTailRecursiveSum() {
    testExample("Examples/Recursion/TailRecursiveSum.kt", tailrecursion.TailRecursiveSumKt::main);
  }

  @Test
  public void testVerySlowFibonacci() {
    testExample("Examples/Recursion/VerySlowFibonacci.kt", slowfibonacci.VerySlowFibonacciKt::main);
  }

  @Test
  public void testAssignmentOperators() {
    testExample("Examples/RepetitionWithWhile/AssignmentOperators.kt", AssignmentOperatorsKt::main);
  }

  @Test
  public void testDoWhileLoop() {
    testExample("Examples/RepetitionWithWhile/DoWhileLoop.kt", DoWhileLoopKt::main);
  }

  @Test
  public void testIncrementOperator() {
    testExample("Examples/RepetitionWithWhile/IncrementOperator.kt", IncrementOperatorKt::main);
  }

  @Test
  public void testWhileLoop() {
    testExample("Examples/RepetitionWithWhile/WhileLoop.kt", WhileLoopKt::main);
  }

  @Test
  public void testCloseable() {
    testExample("Examples/ResourceCleanup/Closeable.kt", resourcecleanup.CloseableKt::main);
  }

  @Test
  public void testForEachLine() {
    testExample("Examples/ResourceCleanup/ForEachLine.kt", resourcecleanup.ForEachLineKt::main);
  }

  @Test
  public void testUsable() {
    testExample("Examples/ResourceCleanup/Usable.kt", resourcecleanup.UsableKt::main);
  }

  @Test
  public void testUseLines() {
    testExample("Examples/ResourceCleanup/UseLines.kt", resourcecleanup.UseLinesKt::main);
  }

  @Test
  public void testExploreMaze2() {
    testExample("Examples/RobotExplorer2/ExploreMaze2.kt", robotexplorer2.ExploreMaze2Kt::main);
  }

  @Test
  public void testChainedCalls() {
    testExample("Examples/SafeCallsAndElvis/ChainedCalls.kt", safecalls.ChainedCallsKt::main);
  }

  @Test
  public void testDereferenceNull() {
    testExample("Examples/SafeCallsAndElvis/DereferenceNull.kt", DereferenceNullKt::main);
  }

  @Test
  public void testElvisCall() {
    testExample("Examples/SafeCallsAndElvis/ElvisCall.kt", elvisoperator.ElvisCallKt::main);
  }

  @Test
  public void testElvisOperator() {
    testExample("Examples/SafeCallsAndElvis/ElvisOperator.kt", ElvisOperatorKt::main);
  }

  @Test
  public void testSafeCall() {
    testExample("Examples/SafeCallsAndElvis/SafeCall.kt", safecalls.SafeCallKt::main);
  }

  @Test
  public void testSafeOperation() {
    testExample("Examples/SafeCallsAndElvis/SafeOperation.kt", SafeOperationKt::main);
  }

  @Test
  public void testAlso() {
    testExample("Examples/ScopeFunctions/Also.kt", scopefunctions.AlsoKt::main);
  }

  @Test
  public void testApplyIfNotNull() {
    testExample("Examples/ScopeFunctions/ApplyIfNotNull.kt", scopefunctions.ApplyIfNotNullKt::main);
  }

  @Test
  public void testApplyVsAlso() {
    testExample("Examples/ScopeFunctions/ApplyVsAlso.kt", scopefunctions.ApplyVsAlsoKt::main);
  }

  @Test
  public void testCheckingArgument() {
    testExample("Examples/ScopeFunctions/CheckingArgument.kt", scopefunctions.CheckingArgumentKt::main);
  }

  @Test
  public void testLet() {
    testExample("Examples/ScopeFunctions/Let.kt", scopefunctions.LetKt::main);
  }

  @Test
  public void testNullableReceiver() {
    testExample("Examples/ScopeFunctions/NullableReceiver.kt", scopefunctions.NullableReceiverKt::main);
  }

  @Test
  public void testResultOfApply() {
    testExample("Examples/ScopeFunctions/ResultOfApply.kt", scopefunctions.ResultOfApplyKt::main);
  }

  @Test
  public void testResultOfWith() {
    testExample("Examples/ScopeFunctions/ResultOfWith.kt", scopefunctions.ResultOfWithKt::main);
  }

  @Test
  public void testRegularClasses() {
    testExample("Examples/SealedClasses/RegularClasses.kt", withoutsealedclasses.RegularClassesKt::main);
  }

  @Test
  public void testSealedClasses() {
    testExample("Examples/SealedClasses/SealedClasses.kt", sealedclasses.SealedClassesKt::main);
  }

  @Test
  public void testGardenItem() {
    testExample("Examples/SecondaryConstructors/GardenItem.kt", secondaryconstructors.GardenItemKt::main);
  }

  @Test
  public void testWithSecondary() {
    testExample("Examples/SecondaryConstructors/WithSecondary.kt", secondaryconstructors.WithSecondaryKt::main);
  }

  @Test
  public void testMutableSet() {
    testExample("Examples/Sets/MutableSet.kt", MutableSetKt::main);
  }

  @Test
  public void testRemoveDuplicates() {
    testExample("Examples/Sets/RemoveDuplicates.kt", RemoveDuplicatesKt::main);
  }

  @Test
  public void testSets() {
    testExample("Examples/Sets/Sets.kt", SetsKt::main);
  }

  @Test
  public void testExpressionInTemplate() {
    testExample("Examples/StringTemplates/ExpressionInTemplate.kt", ExpressionInTemplateKt::main);
  }

  @Test
  public void testStringConcatenation() {
    testExample("Examples/StringTemplates/StringConcatenation.kt", StringConcatenationKt::main);
  }

  @Test
  public void testStringTemplates() {
    testExample("Examples/StringTemplates/StringTemplates.kt", StringTemplatesKt::main);
  }

  @Test
  public void testTripleQuotes() {
    testExample("Examples/StringTemplates/TripleQuotes.kt", TripleQuotesKt::main);
  }

  @Test
  public void testBasicFunctions() {
    testExample("Examples/Summary1/BasicFunctions.kt", BasicFunctionsKt::main);
  }

  @Test
  public void testBooleans() {
    testExample("Examples/Summary1/Booleans.kt", BooleansKt::main);
  }

  @Test
  public void testDoWhile() {
    testExample("Examples/Summary1/DoWhile.kt", DoWhileKt::main);
  }

  @Test
  public void testHello() {
    testExample("Examples/Summary1/Hello.kt", HelloKt::main);
  }

  @Test
  public void testIfExpression() {
    testExample("Examples/Summary1/IfExpression.kt", IfExpressionKt::main);
  }

  @Test
  public void testIfResult() {
    testExample("Examples/Summary1/IfResult.kt", IfResultKt::main);
  }

  @Test
  public void testMembership() {
    testExample("Examples/Summary1/Membership.kt", MembershipKt::main);
  }

  @Test
  public void testNumberTypes() {
    testExample("Examples/Summary1/NumberTypes.kt", NumberTypesKt::main);
  }

  @Test
  public void testOverflow() {
    testExample("Examples/Summary1/Overflow.kt", OverflowKt::main);
  }

  @Test
  public void testRangeOfInt() {
    testExample("Examples/Summary1/RangeOfInt.kt", RangeOfIntKt::main);
  }

  @Test
  public void testStringIteration() {
    testExample("Examples/Summary1/StringIteration.kt", StringIterationKt::main);
  }

  @Test
  public void testStrTemplates() {
    testExample("Examples/Summary1/StrTemplates.kt", StrTemplatesKt::main);
  }

  @Test
  public void testThreeQuotes() {
    testExample("Examples/Summary1/ThreeQuotes.kt", ThreeQuotesKt::main);
  }

  @Test
  public void testTruncation() {
    testExample("Examples/Summary1/Truncation.kt", TruncationKt::main);
  }

  @Test
  public void testUnitReturn() {
    testExample("Examples/Summary1/UnitReturn.kt", UnitReturnKt::main);
  }

  @Test
  public void testWhile() {
    testExample("Examples/Summary1/While.kt", WhileKt::main);
  }

  @Test
  public void testArraySpread() {
    testExample("Examples/Summary2/ArraySpread.kt", ArraySpreadKt::main);
  }

  @Test
  public void testASCIIMap() {
    testExample("Examples/Summary2/ASCIIMap.kt", ASCIIMapKt::main);
  }

  @Test
  public void testAtomicTestCapture() {
    testExample("Examples/Summary2/AtomicTestCapture.kt", AtomicTestCaptureKt::main);
  }

  @Test
  public void testBoxes() {
    testExample("Examples/Summary2/Boxes.kt", BoxesKt::main);
  }

  @Test
  public void testClassBodies() {
    testExample("Examples/Summary2/ClassBodies.kt", ClassBodiesKt::main);
  }

  @Test
  public void testColorSet() {
    testExample("Examples/Summary2/ColorSet.kt", ColorSetKt::main);
  }

  @Test
  public void testExplicitTyping() {
    testExample("Examples/Summary2/ExplicitTyping.kt", ExplicitTypingKt::main);
  }

  @Test
  public void testGetterAndSetter() {
    testExample("Examples/Summary2/GetterAndSetter.kt", summary2.GetterAndSetterKt::main);
  }

  @Test
  public void testJetPack() {
    testExample("Examples/Summary2/JetPack.kt", JetPackKt::main);
  }

  @Test
  public void testListCollection() {
    testExample("Examples/Summary2/ListCollection.kt", ListCollectionKt::main);
  }

  @Test
  public void testListOfStrings() {
    testExample("Examples/Summary2/ListOfStrings.kt", ListOfStringsKt::main);
  }

  @Test
  public void testMultipleListReferences() {
    testExample("Examples/Summary2/MultipleListReferences.kt", MultipleListReferencesKt::main);
  }

  @Test
  public void testPropertyReadWrite() {
    testExample("Examples/Summary2/PropertyReadWrite.kt", summary2.PropertyReadWriteKt::main);
  }

  @Test
  public void testQuadratic() {
    testExample("Examples/Summary2/Quadratic.kt", QuadraticKt::main);
  }

  @Test
  public void testReadonlyVsMutableList() {
    testExample("Examples/Summary2/ReadonlyVsMutableList.kt", ReadonlyVsMutableListKt::main);
  }

  @Test
  public void testTemperature() {
    testExample("Examples/Summary2/Temperature.kt", TemperatureKt::main);
  }

  @Test
  public void testTicTacToe() {
    testExample("Examples/Summary2/TicTacToe.kt", TicTacToeKt::main);
  }

  @Test
  public void testToDoubleException() {
    testExample("Examples/Summary2/ToDoubleException.kt", ToDoubleExceptionKt::main);
  }

  @Test
  public void testUseALibrary() {
    testExample("Examples/Summary2/UseALibrary.kt", UseALibraryKt::main);
  }

  @Test
  public void testUsingAtomicTest() {
    testExample("Examples/Summary2/UsingAtomicTest.kt", UsingAtomicTestKt::main);
  }

  @Test
  public void testVarArgs() {
    testExample("Examples/Summary2/VarArgs.kt", VarArgsKt::main);
  }

  @Test
  public void testWildAnimals() {
    testExample("Examples/Summary2/WildAnimals.kt", WildAnimalsKt::main);
  }

  @Test
  public void testTDDFail() {
    testExample("Examples/Testing/TDDFail.kt", testing1.TDDFailKt::main);
  }

  @Test
  public void testTDDStillFails() {
    testExample("Examples/Testing/TDDStillFails.kt", testing2.TDDStillFailsKt::main);
  }

  @Test
  public void testTDDWorks() {
    testExample("Examples/Testing/TDDWorks.kt", testing3.TDDWorksKt::main);
  }

  @Test
  public void testTestingExample() {
    testExample("Examples/Testing/TestingExample.kt", TestingExampleKt::main);
  }

  @Test
  public void testBasic() {
    testExample("Examples/UnitTesting/Basic.kt", BasicKt::main);
  }

  @Test
  public void testAssignment() {
    testExample("Examples/Upcasting/Assignment.kt", upcasting.AssignmentKt::main);
  }

  @Test
  public void testDrawing() {
    testExample("Examples/Upcasting/Drawing.kt", upcasting.DrawingKt::main);
  }

  @Test
  public void testTrimmedMembers() {
    testExample("Examples/Upcasting/TrimmedMembers.kt", upcasting.TrimmedMembersKt::main);
  }

  @Test
  public void testUpcastExercise1() {
    testExample("Examples/Upcasting/UpcastExercise1.kt", upcasting.UpcastExercise1Kt::main);
  }

  @Test
  public void testUpcastExercise2() {
    testExample("Examples/Upcasting/UpcastExercise2.kt", upcasting.UpcastExercise2Kt::main);
  }

  @Test
  public void testUpcastExercise3() {
    testExample("Examples/Upcasting/UpcastExercise3.kt", upcasting.UpcastExercise3Kt::main);
  }

  @Test
  public void testCompareTo() {
    testExample("Examples/UsingOperators/CompareTo.kt", usingoperators.CompareToKt::main);
  }

  @Test
  public void testDestructuringData() {
    testExample("Examples/UsingOperators/DestructuringData.kt", usingoperators.DestructuringDataKt::main);
  }

  @Test
  public void testDestructuringDuo() {
    testExample("Examples/UsingOperators/DestructuringDuo.kt", DestructuringDuoKt::main);
  }

  @Test
  public void testDestructuringMap() {
    testExample("Examples/UsingOperators/DestructuringMap.kt", usingoperators.DestructuringMapKt::main);
  }

  @Test
  public void testNewAngle() {
    testExample("Examples/UsingOperators/NewAngle.kt", NewAngleKt::main);
  }

  @Test
  public void testOperatorPlus() {
    testExample("Examples/UsingOperators/OperatorPlus.kt", OperatorPlusKt::main);
  }

  @Test
  public void testReadOnlyAndPlus() {
    testExample("Examples/UsingOperators/ReadOnlyAndPlus.kt", ReadOnlyAndPlusKt::main);
  }

  @Test
  public void testUnexpected() {
    testExample("Examples/UsingOperators/Unexpected.kt", UnexpectedKt::main);
  }

  @Test
  public void testAVarIsMutable() {
    testExample("Examples/VarAndVal/AVarIsMutable.kt", AVarIsMutableKt::main);
  }

  @Test
  public void testVals() {
    testExample("Examples/VarAndVal/Vals.kt", ValsKt::main);
  }

  @Test
  public void testVars() {
    testExample("Examples/VarAndVal/Vars.kt", VarsKt::main);
  }

  @Test
  public void testListOf() {
    testExample("Examples/Varargs/ListOf.kt", ListOfKt::main);
  }

  @Test
  public void testMainArgConversion() {
    testExample("Examples/Varargs/MainArgConversion.kt", MainArgConversionKt::main);
  }

  @Test
  public void testMainArgs() {
    testExample("Examples/Varargs/MainArgs.kt", MainArgsKt::main);
  }

  @Test
  public void testSpreadOperator() {
    testExample("Examples/Varargs/SpreadOperator.kt", SpreadOperatorKt::main);
  }

  @Test
  public void testTwoFunctionsWithVarargs() {
    testExample("Examples/Varargs/TwoFunctionsWithVarargs.kt", TwoFunctionsWithVarargsKt::main);
  }

  @Test
  public void testVarargLikeList() {
    testExample("Examples/Varargs/VarargLikeList.kt", VarargLikeListKt::main);
  }

  @Test
  public void testVarargSum() {
    testExample("Examples/Varargs/VarargSum.kt", VarargSumKt::main);
  }

  @Test
  public void testVariableArgList() {
    testExample("Examples/Varargs/VariableArgList.kt", VariableArgListKt::main);
  }

  @Test
  public void testCookie() {
    testExample("Examples/Visibility/Cookie.kt", CookieKt::main);
  }

  @Test
  public void testMultipleRef() {
    testExample("Examples/Visibility/MultipleRef.kt", MultipleRefKt::main);
  }

  @Test
  public void testObserveAnimals() {
    testExample("Examples/Visibility/ObserveAnimals.kt", ObserveAnimalsKt::main);
  }

  @Test
  public void testAnalyzeInput() {
    testExample("Examples/WhenExpressions/AnalyzeInput.kt", AnalyzeInputKt::main);
  }

  @Test
  public void testBmiWhen() {
    testExample("Examples/WhenExpressions/BmiWhen.kt", BmiWhenKt::main);
  }

  @Test
  public void testGermanOrdinals() {
    testExample("Examples/WhenExpressions/GermanOrdinals.kt", GermanOrdinalsKt::main);
  }

  @Test
  public void testMatchingAgainstVals() {
    testExample("Examples/WhenExpressions/MatchingAgainstVals.kt", MatchingAgainstValsKt::main);
  }

  @Test
  public void testMixColors() {
    testExample("Examples/WhenExpressions/MixColors.kt", MixColorsKt::main);
  }

  @Test
  public void testRepetitive() {
    testExample("Examples/WithFunction/Repetitive.kt", withfunction.RepetitiveKt::main);
  }

  @Test
  public void testUsingWith() {
    testExample("Examples/WithFunction/UsingWith.kt", withfunction.UsingWithKt::main);
  }
}
