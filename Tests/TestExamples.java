import org.junit.Test;

public class TestExamples extends AbstractTestExamples {

  @Test
  public void testImplementations() {
    testExample("Examples/Abstract/Implementations.kt", abstractclasses.ImplementationsKt::main);
  }

  @Test
  public void testInterfaceCollision() {
    testExample("Examples/Abstract/InterfaceCollision.kt", collision.InterfaceCollisionKt::main);
  }

  @Test
  public void testPropertyAccessor() {
    testExample("Examples/Abstract/PropertyAccessor.kt", abstractclasses.PropertyAccessorKt::main);
  }

  @Test
  public void testStateOfAClass() {
    testExample("Examples/Abstract/StateOfAClass.kt", abstractstate.StateOfAClassKt::main);
  }

  @Test
  public void testTask1() {
    testExample("Examples/Abstract/Task1.kt", abstractClassesExercise1.Task1Kt::main);
  }

  @Test
  public void testTask2() {
    testExample("Examples/Abstract/Task2.kt", abstractClassesExercise2.Task2Kt::main);
  }

  @Test
  public void testTask3() {
    testExample("Examples/Abstract/Task3.kt", abstractClassesExercise3.Task3Kt::main);
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
  public void testTask21() {
    testExample("Examples/BaseClassInit/Task2.kt", baseClassInitializationExercise2.Task2Kt::main);
  }

  @Test
  public void testTask31() {
    testExample("Examples/BaseClassInit/Task3.kt", baseClassInitializationExercise3.Task3Kt::main);
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
  public void testTask22() {
    testExample("Examples/Booleans/Task2.kt", booleansExercise2.Task2Kt::main);
  }

  @Test
  public void testTask32() {
    testExample("Examples/Booleans/Task3.kt", booleansExercise3.Task3Kt::main);
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
  public void testTask11() {
    testExample("Examples/BreakAndContinue/Task1.kt", breakAndContinueExercise1.Task1Kt::main);
  }

  @Test
  public void testTask23() {
    testExample("Examples/BreakAndContinue/Task2.kt", breakAndContinueExercise2.Task2Kt::main);
  }

  @Test
  public void testTask33() {
    testExample("Examples/BreakAndContinue/Task3.kt", breakAndContinueExercise3.Task3Kt::main);
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
  public void testTask12() {
    testExample("Examples/BuildingMaps/Task1.kt", buildingMapsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask24() {
    testExample("Examples/BuildingMaps/Task2.kt", buildingMapsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask34() {
    testExample("Examples/BuildingMaps/Task3.kt", buildingMapsExercise3.Task3Kt::main);
  }

  @Test
  public void testTransformingMap() {
    testExample("Examples/BuildingMaps/TransformingMap.kt", TransformingMapKt::main);
  }

  @Test
  public void testCheckInstructionsSoln1() {
    testExample("Examples/CheckInstructions/CheckInstructionsSoln1.kt", checkInstructionsExercise1.CheckInstructionsSoln1Kt::main);
  }

  @Test
  public void testCheckInstructionsSoln2() {
    testExample("Examples/CheckInstructions/CheckInstructionsSoln2.kt", checkInstructionsExercise2.CheckInstructionsSoln2Kt::main);
  }

  @Test
  public void testCheckInstructionsSoln3() {
    testExample("Examples/CheckInstructions/CheckInstructionsSoln3.kt", checkInstructionsExercise3.CheckInstructionsSoln3Kt::main);
  }

  @Test
  public void testCheckInstructionsSoln4() {
    testExample("Examples/CheckInstructions/CheckInstructionsSoln4.kt", checkInstructionsExercise4.CheckInstructionsSoln4Kt::main);
  }

  @Test
  public void testDataFile() {
    testExample("Examples/CheckInstructions/DataFile.kt", checkinstructions.DataFileKt::main);
  }

  @Test
  public void testGetTrace() {
    testExample("Examples/CheckInstructions/GetTrace.kt", checkinstructions.GetTraceKt::main);
  }

  @Test
  public void testJulianMonth() {
    testExample("Examples/CheckInstructions/JulianMonth.kt", checkinstructions.JulianMonthKt::main);
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
    testExample("Examples/ClassDelegation/DelegatedControls.kt", classdelegation.DelegatedControlsKt::main);
  }

  @Test
  public void testExplicitDelegation() {
    testExample("Examples/ClassDelegation/ExplicitDelegation.kt", classdelegation.ExplicitDelegationKt::main);
  }

  @Test
  public void testModelingMI() {
    testExample("Examples/ClassDelegation/ModelingMI.kt", classdelegation.ModelingMIKt::main);
  }

  @Test
  public void testTask13() {
    testExample("Examples/ClassDelegation/Task1.kt", classDelegationExercise1.Task1Kt::main);
  }

  @Test
  public void testTask25() {
    testExample("Examples/ClassDelegation/Task2.kt", classDelegationExercise2.Task2Kt::main);
  }

  @Test
  public void testTask35() {
    testExample("Examples/ClassDelegation/Task3.kt", classDelegationExercise3.Task3Kt::main);
  }

  @Test
  public void testCompanionDelegation() {
    testExample("Examples/CompanionObjects/CompanionDelegation.kt", companionobjects.CompanionDelegationKt::main);
  }

  @Test
  public void testCompanionEx1() {
    testExample("Examples/CompanionObjects/CompanionEx1.kt", companionObjectsExercise1.CompanionEx1Kt::main);
  }

  @Test
  public void testCompanionEx2() {
    testExample("Examples/CompanionObjects/CompanionEx2.kt", companionObjectsExercise2.CompanionEx2Kt::main);
  }

  @Test
  public void testCompanionEx3() {
    testExample("Examples/CompanionObjects/CompanionEx3.kt", companionObjectsExercise3.CompanionEx3Kt::main);
  }

  @Test
  public void testCompanionFactory() {
    testExample("Examples/CompanionObjects/CompanionFactory.kt", companionobjects.CompanionFactoryKt::main);
  }

  @Test
  public void testCompanionInstance() {
    testExample("Examples/CompanionObjects/CompanionInstance.kt", companionobjects.CompanionInstanceKt::main);
  }

  @Test
  public void testCompanionObject() {
    testExample("Examples/CompanionObjects/CompanionObject.kt", companionobjects.CompanionObjectKt::main);
  }

  @Test
  public void testDelegateAndExtend() {
    testExample("Examples/CompanionObjects/DelegateAndExtend.kt", companionobjects.DelegateAndExtendKt::main);
  }

  @Test
  public void testInitialization() {
    testExample("Examples/CompanionObjects/Initialization.kt", companionobjects.InitializationKt::main);
  }

  @Test
  public void testNamingCompanionObjects() {
    testExample("Examples/CompanionObjects/NamingCompanionObjects.kt", companionobjects.NamingCompanionObjectsKt::main);
  }

  @Test
  public void testObjectCounter() {
    testExample("Examples/CompanionObjects/ObjectCounter.kt", companionobjects.ObjectCounterKt::main);
  }

  @Test
  public void testObjectFunctions() {
    testExample("Examples/CompanionObjects/ObjectFunctions.kt", companionobjects.ObjectFunctionsKt::main);
  }

  @Test
  public void testObjectProperty() {
    testExample("Examples/CompanionObjects/ObjectProperty.kt", companionobjects.ObjectPropertyKt::main);
  }

  @Test
  public void testExercise1() {
    testExample("Examples/ComplexConstructors/Exercise1.kt", complexConstructorsExercise1.Exercise1Kt::main);
  }

  @Test
  public void testExercise2() {
    testExample("Examples/ComplexConstructors/Exercise2.kt", complexConstructorsExercise2.Exercise2Kt::main);
  }

  @Test
  public void testExercise3() {
    testExample("Examples/ComplexConstructors/Exercise3.kt", complexConstructorsExercise3.Exercise3Kt::main);
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
  public void testTask14() {
    testExample("Examples/Composition/Task1.kt", compositionExercise1.Task1Kt::main);
  }

  @Test
  public void testTask26() {
    testExample("Examples/Composition/Task2.kt", compositionExercise2.Task2Kt::main);
  }

  @Test
  public void testTask36() {
    testExample("Examples/Composition/Task3.kt", compositionExercise3.Task3Kt::main);
  }

  @Test
  public void testArg() {
    testExample("Examples/Constructors/Arg.kt", ArgKt::main);
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
  public void testTask15() {
    testExample("Examples/Constructors/Task1.kt", constructorsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask27() {
    testExample("Examples/Constructors/Task2.kt", constructorsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask37() {
    testExample("Examples/Constructors/Task3.kt", constructorsExercise3.Task3Kt::main);
  }

  @Test
  public void testVisibleArgs() {
    testExample("Examples/Constructors/VisibleArgs.kt", VisibleArgsKt::main);
  }

  @Test
  public void testWombat() {
    testExample("Examples/Constructors/Wombat.kt", WombatKt::main);
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
  public void testTask28() {
    testExample("Examples/CreatingClasses/Task2.kt", creatingClassesExercise2.Task2Kt::main);
  }

  @Test
  public void testTask38() {
    testExample("Examples/CreatingClasses/Task3.kt", creatingClassesExercise3.Task3Kt::main);
  }

  @Test
  public void testCarCrate() {
    testExample("Examples/CreatingGenerics/CarCrate.kt", creatinggenerics.CarCrateKt::main);
  }

  @Test
  public void testCheckType() {
    testExample("Examples/CreatingGenerics/CheckType.kt", creatinggenerics.CheckTypeKt::main);
  }

  @Test
  public void testConstrained() {
    testExample("Examples/CreatingGenerics/Constrained.kt", creatinggenerics.ConstrainedKt::main);
  }

  @Test
  public void testCovariantList() {
    testExample("Examples/CreatingGenerics/CovariantList.kt", variance.CovariantListKt::main);
  }

  @Test
  public void testCrate() {
    testExample("Examples/CreatingGenerics/Crate.kt", creatinggenerics.CrateKt::main);
  }

  @Test
  public void testCreatingGenericsSoln1() {
    testExample("Examples/CreatingGenerics/CreatingGenericsSoln1.kt", creatingGenericsExercise1.CreatingGenericsSoln1Kt::main);
  }

  @Test
  public void testCreatingGenericsSoln2() {
    testExample("Examples/CreatingGenerics/CreatingGenericsSoln2.kt", creatingGenericsExercise2.CreatingGenericsSoln2Kt::main);
  }

  @Test
  public void testCreatingGenericsSoln3() {
    testExample("Examples/CreatingGenerics/CreatingGenericsSoln3.kt", creatingGenericsExercise3.CreatingGenericsSoln3Kt::main);
  }

  @Test
  public void testErasure() {
    testExample("Examples/CreatingGenerics/Erasure.kt", creatinggenerics.ErasureKt::main);
  }

  @Test
  public void testInBoxAssignment() {
    testExample("Examples/CreatingGenerics/InBoxAssignment.kt", variance.InBoxAssignmentKt::main);
  }

  @Test
  public void testMapCrate() {
    testExample("Examples/CreatingGenerics/MapCrate.kt", creatinggenerics.MapCrateKt::main);
  }

  @Test
  public void testNonGenericConstraint() {
    testExample("Examples/CreatingGenerics/NonGenericConstraint.kt", creatinggenerics.NonGenericConstraintKt::main);
  }

  @Test
  public void testSelect() {
    testExample("Examples/CreatingGenerics/Select.kt", creatinggenerics.SelectKt::main);
  }

  @Test
  public void testSpeakers() {
    testExample("Examples/CreatingGenerics/Speakers.kt", creatinggenerics.SpeakersKt::main);
  }

  @Test
  public void testCopyDataClass() {
    testExample("Examples/DataClasses/CopyDataClass.kt", dataclasses.CopyDataClassKt::main);
  }

  @Test
  public void testDataClasses() {
    testExample("Examples/DataClasses/DataClasses.kt", dataclasses.DataClassesKt::main);
  }

  @Test
  public void testHashCode() {
    testExample("Examples/DataClasses/HashCode.kt", dataclasses.HashCodeKt::main);
  }

  @Test
  public void testSimple() {
    testExample("Examples/DataClasses/Simple.kt", dataclasses.SimpleKt::main);
  }

  @Test
  public void testTask16() {
    testExample("Examples/DataClasses/Task1.kt", dataClassesExercise1.Task1Kt::main);
  }

  @Test
  public void testTask29() {
    testExample("Examples/DataClasses/Task2.kt", dataClassesExercise2.Task2Kt::main);
  }

  @Test
  public void testTask39() {
    testExample("Examples/DataClasses/Task3.kt", dataClassesExercise3.Task3Kt::main);
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
  public void testTask17() {
    testExample("Examples/DataTypes/Task1.kt", dataTypesExercise1.Task1Kt::main);
  }

  @Test
  public void testTask210() {
    testExample("Examples/DataTypes/Task2.kt", dataTypesExercise2.Task2Kt::main);
  }

  @Test
  public void testTypes() {
    testExample("Examples/DataTypes/Types.kt", TypesKt::main);
  }

  @Test
  public void testCarService() {
    testExample("Examples/DelegationTools/CarService.kt", propertydelegation.CarServiceKt::main);
  }

  @Test
  public void testDelegToolsSoln1() {
    testExample("Examples/DelegationTools/DelegToolsSoln1.kt", propertyDelegationToolsExercise2.DelegToolsSoln1Kt::main);
  }

  @Test
  public void testDelegToolsSoln2() {
    testExample("Examples/DelegationTools/DelegToolsSoln2.kt", propertyDelegationToolsExercise3.DelegToolsSoln2Kt::main);
  }

  @Test
  public void testDelegToolsSoln3() {
    testExample("Examples/DelegationTools/DelegToolsSoln3.kt", propertyDelegationToolsExercise4.DelegToolsSoln3Kt::main);
  }

  @Test
  public void testNeverNull() {
    testExample("Examples/DelegationTools/NeverNull.kt", delegationtools.NeverNullKt::main);
  }

  @Test
  public void testTeam() {
    testExample("Examples/DelegationTools/Team.kt", delegationtools.TeamKt::main);
  }

  @Test
  public void testTeamWithTraditions() {
    testExample("Examples/DelegationTools/TeamWithTraditions.kt", delegationtools.TeamWithTraditionsKt::main);
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
  public void testLoopWithIndex() {
    testExample("Examples/Destructuring/LoopWithIndex.kt", LoopWithIndexKt::main);
  }

  @Test
  public void testPairDestructuring() {
    testExample("Examples/Destructuring/PairDestructuring.kt", PairDestructuringKt::main);
  }

  @Test
  public void testPairs() {
    testExample("Examples/Destructuring/Pairs.kt", destructuring.PairsKt::main);
  }

  @Test
  public void testTask18() {
    testExample("Examples/Destructuring/Task1.kt", destructuringDeclarationsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask211() {
    testExample("Examples/Destructuring/Task2.kt", destructuringDeclarationsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask310() {
    testExample("Examples/Destructuring/Task3.kt", destructuringDeclarationsExercise3.Task3Kt::main);
  }

  @Test
  public void testTuple() {
    testExample("Examples/Destructuring/Tuple.kt", destructuring.TupleKt::main);
  }

  @Test
  public void testCreature() {
    testExample("Examples/DownCasting/Creature.kt", downcasting.CreatureKt::main);
  }

  @Test
  public void testDownCastEx1() {
    testExample("Examples/DownCasting/DownCastEx1.kt", downcastingExercise1.DownCastEx1Kt::main);
  }

  @Test
  public void testDownCastEx2() {
    testExample("Examples/DownCasting/DownCastEx2.kt", downcastingExercise2.DownCastEx2Kt::main);
  }

  @Test
  public void testDownCastEx3() {
    testExample("Examples/DownCasting/DownCastEx3.kt", downcastingExercise3.DownCastEx3Kt::main);
  }

  @Test
  public void testFilterIsInstance() {
    testExample("Examples/DownCasting/FilterIsInstance.kt", FilterIsInstanceKt::main);
  }

  @Test
  public void testFindType() {
    testExample("Examples/DownCasting/FindType.kt", downcasting.FindTypeKt::main);
  }

  @Test
  public void testIsKeyword() {
    testExample("Examples/DownCasting/IsKeyword.kt", IsKeywordKt::main);
  }

  @Test
  public void testNarrowingUpcast() {
    testExample("Examples/DownCasting/NarrowingUpcast.kt", downcasting.NarrowingUpcastKt::main);
  }

  @Test
  public void testSafe() {
    testExample("Examples/DownCasting/Safe.kt", downcasting.SafeKt::main);
  }

  @Test
  public void testUnsafe() {
    testExample("Examples/DownCasting/Unsafe.kt", downcasting.UnsafeKt::main);
  }

  @Test
  public void testCheckingOptions() {
    testExample("Examples/Enumerations/CheckingOptions.kt", checkingoptions.CheckingOptionsKt::main);
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
  public void testTask19() {
    testExample("Examples/Enumerations/Task1.kt", enumerationsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask212() {
    testExample("Examples/Enumerations/Task2.kt", enumerationsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask311() {
    testExample("Examples/Enumerations/Task3.kt", enumerationsExercise3.Task3Kt::main);
  }

  @Test
  public void testCaptureImplementation() {
    testExample("Examples/ExceptionHandling/CaptureImplementation.kt", exceptionhandling.CaptureImplementationKt::main);
  }

  @Test
  public void testDefiningExceptions() {
    testExample("Examples/ExceptionHandling/DefiningExceptions.kt", exceptionhandling.DefiningExceptionsKt::main);
  }

  @Test
  public void testGuaranteedCleanup() {
    testExample("Examples/ExceptionHandling/GuaranteedCleanup.kt", exceptionhandling.GuaranteedCleanupKt::main);
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
  public void testLibraryException() {
    testExample("Examples/ExceptionHandling/LibraryException.kt", exceptionhandling.LibraryExceptionKt::main);
  }

  @Test
  public void testNewException() {
    testExample("Examples/ExceptionHandling/NewException.kt", exceptionhandling.NewExceptionKt::main);
  }

  @Test
  public void testStacktrace() {
    testExample("Examples/ExceptionHandling/Stacktrace.kt", stacktrace.StacktraceKt::main);
  }

  @Test
  public void testTask110() {
    testExample("Examples/ExceptionHandling/Task1.kt", exceptionHandlingExercise1.Task1Kt::main);
  }

  @Test
  public void testTask213() {
    testExample("Examples/ExceptionHandling/Task2.kt", exceptionHandlingExercise2.Task2Kt::main);
  }

  @Test
  public void testTask312() {
    testExample("Examples/ExceptionHandling/Task3.kt", exceptionHandlingExercise3.Task3Kt::main);
  }

  @Test
  public void testTryFinally() {
    testExample("Examples/ExceptionHandling/TryFinally.kt", exceptionhandling.TryFinallyKt::main);
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
  public void testTask111() {
    testExample("Examples/Exceptions/Task1.kt", exceptionsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask214() {
    testExample("Examples/Exceptions/Task2.kt", exceptionsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask313() {
    testExample("Examples/Exceptions/Task3.kt", exceptionsExercise3.Task3Kt::main);
  }

  @Test
  public void testToIntException() {
    testExample("Examples/Exceptions/ToIntException.kt", exceptions.ToIntExceptionKt::main);
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
  public void testTask112() {
    testExample("Examples/ExpressionsStatements/Task1.kt", expressionsAndStatementsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask215() {
    testExample("Examples/ExpressionsStatements/Task2.kt", expressionsAndStatementsExercise2.Task2Kt::main);
  }

  @Test
  public void testUnitReturnType() {
    testExample("Examples/ExpressionsStatements/UnitReturnType.kt", UnitReturnTypeKt::main);
  }

  @Test
  public void testBookExtensions() {
    testExample("Examples/ExtensionFunctions/BookExtensions.kt", extensionfunctions.BookExtensionsKt::main);
  }

  @Test
  public void testQuote() {
    testExample("Examples/ExtensionFunctions/Quote.kt", other.QuoteKt::main);
  }

  @Test
  public void testQuoting() {
    testExample("Examples/ExtensionFunctions/Quoting.kt", extensionfunctions.QuotingKt::main);
  }

  @Test
  public void testStrangeQuote() {
    testExample("Examples/ExtensionFunctions/StrangeQuote.kt", extensionfunctions.StrangeQuoteKt::main);
  }

  @Test
  public void testTask113() {
    testExample("Examples/ExtensionFunctions/Task1.kt", extensionFunctionsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask216() {
    testExample("Examples/ExtensionFunctions/Task2.kt", extensionFunctionsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask314() {
    testExample("Examples/ExtensionFunctions/Task3.kt", extensionFunctionsExercise3.Task3Kt::main);
  }

  @Test
  public void testAnonymousFunction() {
    testExample("Examples/ExtensionLambdas/AnonymousFunction.kt", extensionlambdas.AnonymousFunctionKt::main);
  }

  @Test
  public void testExtensionLambdasSoln1() {
    testExample("Examples/ExtensionLambdas/ExtensionLambdasSoln1.kt", extensionLambdasExercise1.ExtensionLambdasSoln1Kt::main);
  }

  @Test
  public void testExtensionLambdasSoln2() {
    testExample("Examples/ExtensionLambdas/ExtensionLambdasSoln2.kt", extensionLambdasExercise2.ExtensionLambdasSoln2Kt::main);
  }

  @Test
  public void testExtensionLambdasSoln3() {
    testExample("Examples/ExtensionLambdas/ExtensionLambdasSoln3.kt", extensionLambdasExercise3.ExtensionLambdasSoln3Kt::main);
  }

  @Test
  public void testExtensionPolymorphism() {
    testExample("Examples/ExtensionLambdas/ExtensionPolymorphism.kt", extensionlambdas.ExtensionPolymorphismKt::main);
  }

  @Test
  public void testFuncReferences() {
    testExample("Examples/ExtensionLambdas/FuncReferences.kt", extensionlambdas.FuncReferencesKt::main);
  }

  @Test
  public void testListsAndMaps() {
    testExample("Examples/ExtensionLambdas/ListsAndMaps.kt", extensionlambdas.ListsAndMapsKt::main);
  }

  @Test
  public void testParameters() {
    testExample("Examples/ExtensionLambdas/Parameters.kt", extensionlambdas.ParametersKt::main);
  }

  @Test
  public void testSandwich() {
    testExample("Examples/ExtensionLambdas/Sandwich.kt", sandwich.SandwichKt::main);
  }

  @Test
  public void testStringCreation() {
    testExample("Examples/ExtensionLambdas/StringCreation.kt", extensionlambdas.StringCreationKt::main);
  }

  @Test
  public void testTransform() {
    testExample("Examples/ExtensionLambdas/Transform.kt", extensionlambdas.TransformKt::main);
  }

  @Test
  public void testVanbo() {
    testExample("Examples/ExtensionLambdas/Vanbo.kt", extensionlambdas.VanboKt::main);
  }

  @Test
  public void testAnyFromListOfStar() {
    testExample("Examples/ExtensionProperties/AnyFromListOfStar.kt", AnyFromListOfStarKt::main);
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
  public void testTask114() {
    testExample("Examples/ExtensionProperties/Task1.kt", extensionPropertiesExercise1.Task1Kt::main);
  }

  @Test
  public void testTask217() {
    testExample("Examples/ExtensionProperties/Task2.kt", extensionPropertiesExercise2.Task2Kt::main);
  }

  @Test
  public void testTask315() {
    testExample("Examples/ExtensionProperties/Task3.kt", extensionPropertiesExercise3.Task3Kt::main);
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
  public void testReduceAndReduceRight() {
    testExample("Examples/FoldingLists/ReduceAndReduceRight.kt", ReduceAndReduceRightKt::main);
  }

  @Test
  public void testRunningFold() {
    testExample("Examples/FoldingLists/RunningFold.kt", RunningFoldKt::main);
  }

  @Test
  public void testSumViaFold() {
    testExample("Examples/FoldingLists/SumViaFold.kt", SumViaFoldKt::main);
  }

  @Test
  public void testTask115() {
    testExample("Examples/FoldingLists/Task1.kt", foldingListsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask218() {
    testExample("Examples/FoldingLists/Task2.kt", foldingListsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask316() {
    testExample("Examples/FoldingLists/Task3.kt", foldingListsExercise3.Task3Kt::main);
  }

  @Test
  public void testTask4() {
    testExample("Examples/FoldingLists/Task4.kt", foldingListsExercise4.Task4Kt::main);
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
  public void testTask116() {
    testExample("Examples/Functions/Task1.kt", functionsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask219() {
    testExample("Examples/Functions/Task2.kt", functionsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask317() {
    testExample("Examples/Functions/Task3.kt", functionsExercise3.Task3Kt::main);
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
  public void testTask117() {
    testExample("Examples/HelloWorld/Task1.kt", helloWorldExercise1.Task1Kt::main);
  }

  @Test
  public void testTask220() {
    testExample("Examples/HelloWorld/Task2.kt", helloWorldExercise2.Task2Kt::main);
  }

  @Test
  public void testTask318() {
    testExample("Examples/HelloWorld/Task3.kt", helloWorldExercise3.Task3Kt::main);
  }

  @Test
  public void testAny() {
    testExample("Examples/HigherOrderFunctions/Any.kt", higherorderfunctions.AnyKt::main);
  }

  @Test
  public void testCallingReference() {
    testExample("Examples/HigherOrderFunctions/CallingReference.kt", higherorderfunctions.CallingReferenceKt::main);
  }

  @Test
  public void testIsPlus() {
    testExample("Examples/HigherOrderFunctions/IsPlus.kt", higherorderfunctions.IsPlusKt::main);
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
  public void testRepeat() {
    testExample("Examples/HigherOrderFunctions/Repeat.kt", higherorderfunctions.RepeatKt::main);
  }

  @Test
  public void testRepeatByInt() {
    testExample("Examples/HigherOrderFunctions/RepeatByInt.kt", RepeatByIntKt::main);
  }

  @Test
  public void testTask118() {
    testExample("Examples/HigherOrderFunctions/Task1.kt", higherOrderFunctionsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask221() {
    testExample("Examples/HigherOrderFunctions/Task2.kt", higherOrderFunctionsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask319() {
    testExample("Examples/HigherOrderFunctions/Task3.kt", higherOrderFunctionsExercise3.Task3Kt::main);
  }

  @Test
  public void testTask41() {
    testExample("Examples/HigherOrderFunctions/Task4.kt", higherOrderFunctionsExercise4.Task4Kt::main);
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
  public void testTask119() {
    testExample("Examples/IfExpressions/Task1.kt", ifExpressionsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask222() {
    testExample("Examples/IfExpressions/Task2.kt", ifExpressionsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask320() {
    testExample("Examples/IfExpressions/Task3.kt", ifExpressionsExercise3.Task3Kt::main);
  }

  @Test
  public void testTrueOrFalse() {
    testExample("Examples/IfExpressions/TrueOrFalse.kt", TrueOrFalseKt::main);
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
    testExample("Examples/ImportanceOfLambdas/FilterEven.kt", importanceoflambdas.FilterEvenKt::main);
  }

  @Test
  public void testFunctionClosure() {
    testExample("Examples/ImportanceOfLambdas/FunctionClosure.kt", importanceoflambdas.FunctionClosureKt::main);
  }

  @Test
  public void testGreaterThan2() {
    testExample("Examples/ImportanceOfLambdas/GreaterThan2.kt", importanceoflambdas.GreaterThan2Kt::main);
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
  public void testTask120() {
    testExample("Examples/ImportanceOfLambdas/Task1.kt", theImportanceOfLambdasExercise1.Task1Kt::main);
  }

  @Test
  public void testTask223() {
    testExample("Examples/ImportanceOfLambdas/Task2.kt", theImportanceOfLambdasExercise2.Task2Kt::main);
  }

  @Test
  public void testTask321() {
    testExample("Examples/ImportanceOfLambdas/Task3.kt", theImportanceOfLambdasExercise3.Task3Kt::main);
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
  public void testTask121() {
    testExample("Examples/Inheritance/Task1.kt", inheritanceExercise1.Task1Kt::main);
  }

  @Test
  public void testTask224() {
    testExample("Examples/Inheritance/Task2.kt", inheritanceExercise2.Task2Kt::main);
  }

  @Test
  public void testTask322() {
    testExample("Examples/Inheritance/Task3.kt", inheritanceExercise3.Task3Kt::main);
  }

  @Test
  public void testAdapter() {
    testExample("Examples/InheritanceExtensions/Adapter.kt", inheritanceextensions.AdapterKt::main);
  }

  @Test
  public void testComposeAdapter() {
    testExample("Examples/InheritanceExtensions/ComposeAdapter.kt", inheritanceextensions2.ComposeAdapterKt::main);
  }

  @Test
  public void testConvention() {
    testExample("Examples/InheritanceExtensions/Convention.kt", inheritanceextensions.ConventionKt::main);
  }

  @Test
  public void testDeviceExtensions() {
    testExample("Examples/InheritanceExtensions/DeviceExtensions.kt", inheritanceextensions2.DeviceExtensionsKt::main);
  }

  @Test
  public void testDeviceMembers() {
    testExample("Examples/InheritanceExtensions/DeviceMembers.kt", inheritanceextensions1.DeviceMembersKt::main);
  }

  @Test
  public void testExtensionFuncs() {
    testExample("Examples/InheritanceExtensions/ExtensionFuncs.kt", inheritanceextensions2.ExtensionFuncsKt::main);
  }

  @Test
  public void testInheritAdd() {
    testExample("Examples/InheritanceExtensions/InheritAdd.kt", inheritanceextensions.InheritAddKt::main);
  }

  @Test
  public void testInhExtensionsEx1() {
    testExample("Examples/InheritanceExtensions/InhExtensionsEx1.kt", inheritanceAndExtensionsExercise2.InhExtensionsEx1Kt::main);
  }

  @Test
  public void testNoExtOverride() {
    testExample("Examples/InheritanceExtensions/NoExtOverride.kt", inheritanceextensions.NoExtOverrideKt::main);
  }

  @Test
  public void testTask122() {
    testExample("Examples/InheritanceExtensions/Task1.kt", inheritanceAndExtensionsExercise1.Task1Kt::main);
  }

  @Test
  public void testTemperatureDelta() {
    testExample("Examples/InheritanceExtensions/TemperatureDelta.kt", inheritanceextensions.TemperatureDeltaKt::main);
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
  public void testTask123() {
    testExample("Examples/InKeyword/Task1.kt", theInKeywordExercise1.Task1Kt::main);
  }

  @Test
  public void testTask225() {
    testExample("Examples/InKeyword/Task2.kt", theInKeywordExercise2.Task2Kt::main);
  }

  @Test
  public void testTask323() {
    testExample("Examples/InKeyword/Task3.kt", theInKeywordExercise3.Task3Kt::main);
  }

  @Test
  public void testTask42() {
    testExample("Examples/InKeyword/Task4.kt", theInKeywordExercise4.Task4Kt::main);
  }

  @Test
  public void testCounterFactory() {
    testExample("Examples/InnerClasses/CounterFactory.kt", innerclasses.CounterFactoryKt::main);
  }

  @Test
  public void testHotel() {
    testExample("Examples/InnerClasses/Hotel.kt", innerclasses.HotelKt::main);
  }

  @Test
  public void testInnerClassInheritance() {
    testExample("Examples/InnerClasses/InnerClassInheritance.kt", innerclasses.InnerClassInheritanceKt::main);
  }

  @Test
  public void testInnerEx1() {
    testExample("Examples/InnerClasses/InnerEx1.kt", innerClassesExercise1.InnerEx1Kt::main);
  }

  @Test
  public void testInnerEx2() {
    testExample("Examples/InnerClasses/InnerEx2.kt", innerClassesExercise2.InnerEx2Kt::main);
  }

  @Test
  public void testInnerEx3() {
    testExample("Examples/InnerClasses/InnerEx3.kt", innerClassesExercise3.InnerEx3Kt::main);
  }

  @Test
  public void testLocalInnerClasses() {
    testExample("Examples/InnerClasses/LocalInnerClasses.kt", innerclasses.LocalInnerClassesKt::main);
  }

  @Test
  public void testQualifiedThis() {
    testExample("Examples/InnerClasses/QualifiedThis.kt", innerclasses.QualifiedThisKt::main);
  }

  @Test
  public void testComputer() {
    testExample("Examples/Interfaces/Computer.kt", interfaces.ComputerKt::main);
  }

  @Test
  public void testHotness() {
    testExample("Examples/Interfaces/Hotness.kt", interfaces.HotnessKt::main);
  }

  @Test
  public void testPlayerInterface() {
    testExample("Examples/Interfaces/PlayerInterface.kt", interfaces.PlayerInterfaceKt::main);
  }

  @Test
  public void testSAMImplementation() {
    testExample("Examples/Interfaces/SAMImplementation.kt", interfaces.SAMImplementationKt::main);
  }

  @Test
  public void testTask124() {
    testExample("Examples/Interfaces/Task1.kt", interfacesExercise1.Task1Kt::main);
  }

  @Test
  public void testTask226() {
    testExample("Examples/Interfaces/Task2.kt", interfacesExercise2.Task2Kt::main);
  }

  @Test
  public void testTask324() {
    testExample("Examples/Interfaces/Task3.kt", interfacesExercise3.Task3Kt::main);
  }

  @Test
  public void testAnnotatedJava() {
    testExample("Examples/interoperability/AnnotatedJava.kt", interop.AnnotatedJavaKt::main);
  }

  @Test
  public void testBigFibonacci() {
    testExample("Examples/interoperability/BigFibonacci.kt", interop.BigFibonacciKt::main);
  }

  @Test
  public void testExtensionsToJavaClass() {
    testExample("Examples/interoperability/ExtensionsToJavaClass.kt", interop.ExtensionsToJavaClassKt::main);
  }

  @Test
  public void testHiddenArrayList() {
    testExample("Examples/interoperability/HiddenArrayList.kt", HiddenArrayListKt::main);
  }

  @Test
  public void testJavaList() {
    testExample("Examples/interoperability/JavaList.kt", JavaListKt::main);
  }

  @Test
  public void testKotlinChecked() {
    testExample("Examples/interoperability/KotlinChecked.kt", KotlinCheckedKt::main);
  }

  @Test
  public void testKotlinWrapper() {
    testExample("Examples/interoperability/KotlinWrapper.kt", interop.KotlinWrapperKt::main);
  }

  @Test
  public void testNPEOnPlatformType() {
    testExample("Examples/interoperability/NPEOnPlatformType.kt", NPEOnPlatformTypeKt::main);
  }

  @Test
  public void testPlatformTypes() {
    testExample("Examples/interoperability/PlatformTypes.kt", interop.PlatformTypesKt::main);
  }

  @Test
  public void testRandom() {
    testExample("Examples/interoperability/Random.kt", RandomKt::main);
  }

  @Test
  public void testReadOnlyCollections() {
    testExample("Examples/interoperability/ReadOnlyCollections.kt", ReadOnlyCollectionsKt::main);
  }

  @Test
  public void testUseBeanClass() {
    testExample("Examples/interoperability/UseBeanClass.kt", UseBeanClassKt::main);
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
  public void testTask125() {
    testExample("Examples/IntroGenerics/Task1.kt", introductionToGenericsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask227() {
    testExample("Examples/IntroGenerics/Task2.kt", introductionToGenericsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask325() {
    testExample("Examples/IntroGenerics/Task3.kt", introductionToGenericsExercise3.Task3Kt::main);
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
  public void testTask126() {
    testExample("Examples/Lambdas/Task1.kt", lambdasExercise1.Task1Kt::main);
  }

  @Test
  public void testTask228() {
    testExample("Examples/Lambdas/Task2.kt", lambdasExercise2.Task2Kt::main);
  }

  @Test
  public void testTask326() {
    testExample("Examples/Lambdas/Task3.kt", lambdasExercise3.Task3Kt::main);
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
  public void testBetterSuitcase() {
    testExample("Examples/LateInitialization/BetterSuitcase.kt", lateinitialization.BetterSuitcaseKt::main);
  }

  @Test
  public void testFaultySuitcase() {
    testExample("Examples/LateInitialization/FaultySuitcase.kt", lateinitialization.FaultySuitcaseKt::main);
  }

  @Test
  public void testIsInitialized() {
    testExample("Examples/LateInitialization/IsInitialized.kt", lateinitialization.IsInitializedKt::main);
  }

  @Test
  public void testLateInitSoln1() {
    testExample("Examples/LateInitialization/LateInitSoln1.kt", lateInitializationExercise1.LateInitSoln1Kt::main);
  }

  @Test
  public void testLateInitSoln2() {
    testExample("Examples/LateInitialization/LateInitSoln2.kt", lateInitializationExercise2.LateInitSoln2Kt::main);
  }

  @Test
  public void testLateInitSoln3() {
    testExample("Examples/LateInitialization/LateInitSoln3.kt", lateInitializationExercise3.LateInitSoln3Kt::main);
  }

  @Test
  public void testSuitcase() {
    testExample("Examples/LateInitialization/Suitcase.kt", lateinitialization.SuitcaseKt::main);
  }

  @Test
  public void testLazyInitSoln1() {
    testExample("Examples/LazyInitialization/LazyInitSoln1.kt", lazyInitializationExercise1.LazyInitSoln1Kt::main);
  }

  @Test
  public void testLazyInitSoln2() {
    testExample("Examples/LazyInitialization/LazyInitSoln2.kt", lazyInitializationExercise2.LazyInitSoln2Kt::main);
  }

  @Test
  public void testLazyInitSoln3() {
    testExample("Examples/LazyInitialization/LazyInitSoln3.kt", lazyInitializationExercise3.LazyInitSoln3Kt::main);
  }

  @Test
  public void testLazyInt() {
    testExample("Examples/LazyInitialization/LazyInt.kt", lazyinitialization.LazyIntKt::main);
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
    testExample("Examples/Lists/MutListIsList.kt", lists.MutListIsListKt::main);
  }

  @Test
  public void testOutOfBounds() {
    testExample("Examples/Lists/OutOfBounds.kt", OutOfBoundsKt::main);
  }

  @Test
  public void testParameterizedReturn() {
    testExample("Examples/Lists/ParameterizedReturn.kt", lists.ParameterizedReturnKt::main);
  }

  @Test
  public void testParameterizedTypes() {
    testExample("Examples/Lists/ParameterizedTypes.kt", ParameterizedTypesKt::main);
  }

  @Test
  public void testTask127() {
    testExample("Examples/Lists/Task1.kt", listsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask229() {
    testExample("Examples/Lists/Task2.kt", listsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask327() {
    testExample("Examples/Lists/Task3.kt", listsExercise3.Task3Kt::main);
  }

  @Test
  public void testCustomLabel() {
    testExample("Examples/LocalFunctions/CustomLabel.kt", CustomLabelKt::main);
  }

  @Test
  public void testInterestingSessions() {
    testExample("Examples/LocalFunctions/InterestingSessions.kt", InterestingSessionsKt::main);
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
    testExample("Examples/LocalFunctions/LocalFunctionReference.kt", LocalFunctionReferenceKt::main);
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
  public void testReturningFunc() {
    testExample("Examples/LocalFunctions/ReturningFunc.kt", localfunctions.ReturningFuncKt::main);
  }

  @Test
  public void testReturnInsideLambda() {
    testExample("Examples/LocalFunctions/ReturnInsideLambda.kt", ReturnInsideLambdaKt::main);
  }

  @Test
  public void testTask128() {
    testExample("Examples/LocalFunctions/Task1.kt", localFunctionsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask230() {
    testExample("Examples/LocalFunctions/Task2.kt", localFunctionsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask328() {
    testExample("Examples/LocalFunctions/Task3.kt", localFunctionsExercise3.Task3Kt::main);
  }

  @Test
  public void testBasicLogging() {
    testExample("Examples/Logging/BasicLogging.kt", logging.BasicLoggingKt::main);
  }

  @Test
  public void testLoggingSoln1() {
    testExample("Examples/Logging/LoggingSoln1.kt", loggingExercise1.LoggingSoln1Kt::main);
  }

  @Test
  public void testLoggingSoln2() {
    testExample("Examples/Logging/LoggingSoln2.kt", loggingExercise2.LoggingSoln2Kt::main);
  }

  @Test
  public void testLoggingSoln3() {
    testExample("Examples/Logging/LoggingSoln3.kt", loggingExercise3.LoggingSoln3Kt::main);
  }

  @Test
  public void testSimpleLoggingStrategy() {
    testExample("Examples/Logging/SimpleLoggingStrategy.kt", logging.SimpleLoggingStrategyKt::main);
  }

  @Test
  public void testUseAtomicLog() {
    testExample("Examples/Logging/UseAtomicLog.kt", useatomiclog.UseAtomicLogKt::main);
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
  public void testRepeatHi() {
    testExample("Examples/LoopingAndRanges/RepeatHi.kt", RepeatHiKt::main);
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
  public void testTask129() {
    testExample("Examples/LoopingAndRanges/Task1.kt", loopingAndRangesExercise1.Task1Kt::main);
  }

  @Test
  public void testTask231() {
    testExample("Examples/LoopingAndRanges/Task2.kt", loopingAndRangesExercise2.Task2Kt::main);
  }

  @Test
  public void testTask329() {
    testExample("Examples/LoopingAndRanges/Task3.kt", loopingAndRangesExercise3.Task3Kt::main);
  }

  @Test
  public void testTask43() {
    testExample("Examples/LoopingAndRanges/Task4.kt", loopingAndRangesExercise4.Task4Kt::main);
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
  public void testPlayingCards() {
    testExample("Examples/ManipulatingLists/PlayingCards.kt", manipulatinglists.PlayingCardsKt::main);
  }

  @Test
  public void testTask130() {
    testExample("Examples/ManipulatingLists/Task1.kt", manipulatingListsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask232() {
    testExample("Examples/ManipulatingLists/Task2.kt", manipulatingListsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask330() {
    testExample("Examples/ManipulatingLists/Task3.kt", manipulatingListsExercise3.Task3Kt::main);
  }

  @Test
  public void testTask44() {
    testExample("Examples/ManipulatingLists/Task4.kt", manipulatingListsExercise4.Task4Kt::main);
  }

  @Test
  public void testTask5() {
    testExample("Examples/ManipulatingLists/Task5.kt", manipulatingListsExercise5.Task5Kt::main);
  }

  @Test
  public void testTask6() {
    testExample("Examples/ManipulatingLists/Task6.kt", manipulatingListsExercise6.Task6Kt::main);
  }

  @Test
  public void testTask7() {
    testExample("Examples/ManipulatingLists/Task7.kt", manipulatingListsExercise7.Task7Kt::main);
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
    testExample("Examples/Maps/ContactMap.kt", maps.ContactMapKt::main);
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
  public void testTask131() {
    testExample("Examples/Maps/Task1.kt", mapsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask233() {
    testExample("Examples/Maps/Task2.kt", mapsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask331() {
    testExample("Examples/Maps/Task3.kt", mapsExercise3.Task3Kt::main);
  }

  @Test
  public void testConstructorReference() {
    testExample("Examples/MemberReferences/ConstructorReference.kt", memberreferences3.ConstructorReferenceKt::main);
  }

  @Test
  public void testExtensionReference() {
    testExample("Examples/MemberReferences/ExtensionReference.kt", memberreferences.ExtensionReferenceKt::main);
  }

  @Test
  public void testFunctionReference() {
    testExample("Examples/MemberReferences/FunctionReference.kt", memberreferences2.FunctionReferenceKt::main);
  }

  @Test
  public void testMemberReferencesEx1() {
    testExample("Examples/MemberReferences/MemberReferencesEx1.kt", memberReferencesExercise1.MemberReferencesEx1Kt::main);
  }

  @Test
  public void testPropertyReference() {
    testExample("Examples/MemberReferences/PropertyReference.kt", memberreferences1.PropertyReferenceKt::main);
  }

  @Test
  public void testSortWith() {
    testExample("Examples/MemberReferences/SortWith.kt", SortWithKt::main);
  }

  @Test
  public void testTask234() {
    testExample("Examples/MemberReferences/Task2.kt", memberReferencesExercise2.Task2Kt::main);
  }

  @Test
  public void testTask332() {
    testExample("Examples/MemberReferences/Task3.kt", memberReferencesExercise3.Task3Kt::main);
  }

  @Test
  public void testTopLevelFunctionRef() {
    testExample("Examples/MemberReferences/TopLevelFunctionRef.kt", memberreferences2.TopLevelFunctionRefKt::main);
  }

  @Test
  public void testArgumentOrder() {
    testExample("Examples/NamedAndDefaultArgs/ArgumentOrder.kt", ArgumentOrderKt::main);
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
    testExample("Examples/NamedAndDefaultArgs/Evaluation.kt", namedanddefault.EvaluationKt::main);
  }

  @Test
  public void testNamedArguments() {
    testExample("Examples/NamedAndDefaultArgs/NamedArguments.kt", color1.NamedArgumentsKt::main);
  }

  @Test
  public void testTask132() {
    testExample("Examples/NamedAndDefaultArgs/Task1.kt", namedAndDefaultArgumentsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask235() {
    testExample("Examples/NamedAndDefaultArgs/Task2.kt", namedAndDefaultArgumentsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask333() {
    testExample("Examples/NamedAndDefaultArgs/Task3.kt", namedAndDefaultArgumentsExercise3.Task3Kt::main);
  }

  @Test
  public void testTrimMargin() {
    testExample("Examples/NamedAndDefaultArgs/TrimMargin.kt", TrimMarginKt::main);
  }

  @Test
  public void testAirport() {
    testExample("Examples/NestedClasses/Airport.kt", nestedclasses.AirportKt::main);
  }

  @Test
  public void testFillIt() {
    testExample("Examples/NestedClasses/FillIt.kt", nestedclasses.FillItKt::main);
  }

  @Test
  public void testNestedEx1() {
    testExample("Examples/NestedClasses/NestedEx1.kt", nestedClassesExercise1.NestedEx1Kt::main);
  }

  @Test
  public void testNestedEx2() {
    testExample("Examples/NestedClasses/NestedEx2.kt", nestedClassesExercise2.NestedEx2Kt::main);
  }

  @Test
  public void testNestedEx3() {
    testExample("Examples/NestedClasses/NestedEx3.kt", nestedClassesExercise3.NestedEx3Kt::main);
  }

  @Test
  public void testNestedEx4() {
    testExample("Examples/NestedClasses/NestedEx4.kt", nestedClassesExercise4.NestedEx4Kt::main);
  }

  @Test
  public void testNestedHouse() {
    testExample("Examples/NestedClasses/NestedHouse.kt", nestedclasses.NestedHouseKt::main);
  }

  @Test
  public void testReturnLocal() {
    testExample("Examples/NestedClasses/ReturnLocal.kt", nestedclasses.ReturnLocalKt::main);
  }

  @Test
  public void testTicket() {
    testExample("Examples/NestedClasses/Ticket.kt", nestedclasses.TicketKt::main);
  }

  @Test
  public void testWithinInterface() {
    testExample("Examples/NestedClasses/WithinInterface.kt", nestedclasses.WithinInterfaceKt::main);
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
  public void testTask133() {
    testExample("Examples/NonNullAssertions/Task1.kt", nonNullAssertionsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask236() {
    testExample("Examples/NonNullAssertions/Task2.kt", nonNullAssertionsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask334() {
    testExample("Examples/NonNullAssertions/Task3.kt", nonNullAssertionsExercise3.Task3Kt::main);
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
  public void testListOfNothing() {
    testExample("Examples/NothingType/ListOfNothing.kt", ListOfNothingKt::main);
  }

  @Test
  public void testNothingTypeSoln1() {
    testExample("Examples/NothingType/NothingTypeSoln1.kt", theNothingTypeExercise1.NothingTypeSoln1Kt::main);
  }

  @Test
  public void testNothingTypeSoln2() {
    testExample("Examples/NothingType/NothingTypeSoln2.kt", theNothingTypeExercise2.NothingTypeSoln2Kt::main);
  }

  @Test
  public void testNothingTypeSoln3() {
    testExample("Examples/NothingType/NothingTypeSoln3.kt", theNothingTypeExercise3.NothingTypeSoln3Kt::main);
  }

  @Test
  public void testTodo() {
    testExample("Examples/NothingType/Todo.kt", nothingtype.TodoKt::main);
  }

  @Test
  public void testNullableExtension() {
    testExample("Examples/NullableExtensions/NullableExtension.kt", nullableextensions.NullableExtensionKt::main);
  }

  @Test
  public void testNullableParameter() {
    testExample("Examples/NullableExtensions/NullableParameter.kt", nullableextensions.NullableParameterKt::main);
  }

  @Test
  public void testStringIsNullOr() {
    testExample("Examples/NullableExtensions/StringIsNullOr.kt", StringIsNullOrKt::main);
  }

  @Test
  public void testTask134() {
    testExample("Examples/NullableExtensions/Task1.kt", extensionsForNullableTypesExercise1.Task1Kt::main);
  }

  @Test
  public void testTask237() {
    testExample("Examples/NullableExtensions/Task2.kt", extensionsForNullableTypesExercise2.Task2Kt::main);
  }

  @Test
  public void testTask335() {
    testExample("Examples/NullableExtensions/Task3.kt", extensionsForNullableTypesExercise3.Task3Kt::main);
  }

  @Test
  public void testAmphibian() {
    testExample("Examples/NullableTypes/Amphibian.kt", nullabletypes.AmphibianKt::main);
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
  public void testTask135() {
    testExample("Examples/NullableTypes/Task1.kt", nullableTypesExercise1.Task1Kt::main);
  }

  @Test
  public void testTask238() {
    testExample("Examples/NullableTypes/Task2.kt", nullableTypesExercise2.Task2Kt::main);
  }

  @Test
  public void testTask336() {
    testExample("Examples/NullableTypes/Task3.kt", nullableTypesExercise3.Task3Kt::main);
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
  public void testTask337() {
    testExample("Examples/NumberTypes/Task3.kt", numberTypesExercise3.Task3Kt::main);
  }

  @Test
  public void testTask45() {
    testExample("Examples/NumberTypes/Task4.kt", numberTypesExercise4.Task4Kt::main);
  }

  @Test
  public void testUsingLongs() {
    testExample("Examples/NumberTypes/UsingLongs.kt", UsingLongsKt::main);
  }

  @Test
  public void testObjectEx1() {
    testExample("Examples/Objects/ObjectEx1.kt", objectsExercise1.ObjectEx1Kt::main);
  }

  @Test
  public void testObjectEx2() {
    testExample("Examples/Objects/ObjectEx2.kt", objectsExercise2.ObjectEx2Kt::main);
  }

  @Test
  public void testObjectEx3() {
    testExample("Examples/Objects/ObjectEx3.kt", objectsExercise3.ObjectEx3Kt::main);
  }

  @Test
  public void testObjectInheritance() {
    testExample("Examples/Objects/ObjectInheritance.kt", objects.ObjectInheritanceKt::main);
  }

  @Test
  public void testObjectKeyword() {
    testExample("Examples/Objects/ObjectKeyword.kt", objects.ObjectKeywordKt::main);
  }

  @Test
  public void testObjectNesting() {
    testExample("Examples/Objects/ObjectNesting.kt", objects.ObjectNestingKt::main);
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
  public void testTask136() {
    testExample("Examples/ObjectsEverywhere/Task1.kt", objectsEverywhereExercise1.Task1Kt::main);
  }

  @Test
  public void testTask239() {
    testExample("Examples/ObjectsEverywhere/Task2.kt", objectsEverywhereExercise2.Task2Kt::main);
  }

  @Test
  public void testTask338() {
    testExample("Examples/ObjectsEverywhere/Task3.kt", objectsEverywhereExercise3.Task3Kt::main);
  }

  @Test
  public void testTask46() {
    testExample("Examples/ObjectsEverywhere/Task4.kt", objectsEverywhereExercise4.Task4Kt::main);
  }

  @Test
  public void testByOperations() {
    testExample("Examples/OperationsOnCollections/ByOperations.kt", operationsoncollections.ByOperationsKt::main);
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
  public void testPairOfLists() {
    testExample("Examples/OperationsOnCollections/PairOfLists.kt", operationsoncollections.PairOfListsKt::main);
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
  public void testSetOperations() {
    testExample("Examples/OperationsOnCollections/SetOperations.kt", SetOperationsKt::main);
  }

  @Test
  public void testTakeOrDrop() {
    testExample("Examples/OperationsOnCollections/TakeOrDrop.kt", TakeOrDropKt::main);
  }

  @Test
  public void testTask137() {
    testExample("Examples/OperationsOnCollections/Task1.kt", operationsOnCollectionsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask240() {
    testExample("Examples/OperationsOnCollections/Task2.kt", operationsOnCollectionsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask339() {
    testExample("Examples/OperationsOnCollections/Task3.kt", operationsOnCollectionsExercise3.Task3Kt::main);
  }

  @Test
  public void testTask47() {
    testExample("Examples/OperationsOnCollections/Task4.kt", operationsOnCollectionsExercise4.Task4Kt::main);
  }

  @Test
  public void testArithmeticOperators() {
    testExample("Examples/OperatorOverloading/ArithmeticOperators.kt", operatoroverloading.ArithmeticOperatorsKt::main);
  }

  @Test
  public void testBackticks() {
    testExample("Examples/OperatorOverloading/Backticks.kt", operatoroverloading.BackticksKt::main);
  }

  @Test
  public void testComparison() {
    testExample("Examples/OperatorOverloading/Comparison.kt", operatoroverloading.ComparisonKt::main);
  }

  @Test
  public void testConfusingPrecedence() {
    testExample("Examples/OperatorOverloading/ConfusingPrecedence.kt", operatoroverloading.ConfusingPrecedenceKt::main);
  }

  @Test
  public void testContainerAccess() {
    testExample("Examples/OperatorOverloading/ContainerAccess.kt", operatoroverloading.ContainerAccessKt::main);
  }

  @Test
  public void testDefaultEquality() {
    testExample("Examples/OperatorOverloading/DefaultEquality.kt", operatoroverloading.DefaultEqualityKt::main);
  }

  @Test
  public void testDefiningEquality() {
    testExample("Examples/OperatorOverloading/DefiningEquality.kt", operatoroverloading.DefiningEqualityKt::main);
  }

  @Test
  public void testDifferentTypes() {
    testExample("Examples/OperatorOverloading/DifferentTypes.kt", operatoroverloading.DifferentTypesKt::main);
  }

  @Test
  public void testEqualsForNullable() {
    testExample("Examples/OperatorOverloading/EqualsForNullable.kt", operatoroverloading.EqualsForNullableKt::main);
  }

  @Test
  public void testInvoke() {
    testExample("Examples/OperatorOverloading/Invoke.kt", operatoroverloading.InvokeKt::main);
  }

  @Test
  public void testInvokeFunctionType() {
    testExample("Examples/OperatorOverloading/InvokeFunctionType.kt", operatoroverloading.InvokeFunctionTypeKt::main);
  }

  @Test
  public void testMemberOperator() {
    testExample("Examples/OperatorOverloading/MemberOperator.kt", operatoroverloading.MemberOperatorKt::main);
  }

  @Test
  public void testMolecule() {
    testExample("Examples/OperatorOverloading/Molecule.kt", operatoroverloading.MoleculeKt::main);
  }

  @Test
  public void testNum() {
    testExample("Examples/OperatorOverloading/Num.kt", operatoroverloading.NumKt::main);
  }

  @Test
  public void testOpOverloadingSoln1() {
    testExample("Examples/OperatorOverloading/OpOverloadingSoln1.kt", operatorOverloadingExercise1.OpOverloadingSoln1Kt::main);
  }

  @Test
  public void testOpOverloadingSoln2() {
    testExample("Examples/OperatorOverloading/OpOverloadingSoln2.kt", operatorOverloadingExercise2.OpOverloadingSoln2Kt::main);
  }

  @Test
  public void testOpOverloadingSoln3() {
    testExample("Examples/OperatorOverloading/OpOverloadingSoln3.kt", operatorOverloadingExercise3.OpOverloadingSoln3Kt::main);
  }

  @Test
  public void testRanges() {
    testExample("Examples/OperatorOverloading/Ranges.kt", operatoroverloading.RangesKt::main);
  }

  @Test
  public void testStringInvoke() {
    testExample("Examples/OperatorOverloading/StringInvoke.kt", operatoroverloading.StringInvokeKt::main);
  }

  @Test
  public void testSwearing() {
    testExample("Examples/OperatorOverloading/Swearing.kt", operatoroverloading.SwearingKt::main);
  }

  @Test
  public void testMemberVsExtension() {
    testExample("Examples/Overloading/MemberVsExtension.kt", overloading.MemberVsExtensionKt::main);
  }

  @Test
  public void testOverloadedVsDefaultArg() {
    testExample("Examples/Overloading/OverloadedVsDefaultArg.kt", overloadingvsdefaultargs.OverloadedVsDefaultArgKt::main);
  }

  @Test
  public void testOverloading() {
    testExample("Examples/Overloading/Overloading.kt", overloading.OverloadingKt::main);
  }

  @Test
  public void testOverloadingAdd() {
    testExample("Examples/Overloading/OverloadingAdd.kt", overloading.OverloadingAddKt::main);
  }

  @Test
  public void testTask138() {
    testExample("Examples/Overloading/Task1.kt", overloadingExercise1.Task1Kt::main);
  }

  @Test
  public void testTask241() {
    testExample("Examples/Overloading/Task2.kt", overloadingExercise2.Task2Kt::main);
  }

  @Test
  public void testTask340() {
    testExample("Examples/Overloading/Task3.kt", overloadingExercise3.Task3Kt::main);
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
  public void testTask139() {
    testExample("Examples/Packages/Task1.kt", packagesExercise1.Task1Kt::main);
  }

  @Test
  public void testTask242() {
    testExample("Examples/Packages/Task2.kt", ccc.Task2Kt::main);
  }

  @Test
  public void testTask341() {
    testExample("Examples/Packages/Task3.kt", packagesExercise3.Task3Kt::main);
  }

  @Test
  public void testTask48() {
    testExample("Examples/Packages/Task4.kt", packagesExercise4.Task4Kt::main);
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
  public void testTask140() {
    testExample("Examples/Polymorphism/Task1.kt", polymorphismExercise1.Task1Kt::main);
  }

  @Test
  public void testTask243() {
    testExample("Examples/Polymorphism/Task2.kt", polymorphismExercise2.Task2Kt::main);
  }

  @Test
  public void testTask342() {
    testExample("Examples/Polymorphism/Task3.kt", polymorphismExercise3.Task3Kt::main);
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
  public void testTask141() {
    testExample("Examples/Properties/Task1.kt", propertiesExercise1.Task1Kt::main);
  }

  @Test
  public void testTask244() {
    testExample("Examples/Properties/Task2.kt", propertiesExercise2.Task2Kt::main);
  }

  @Test
  public void testTask343() {
    testExample("Examples/Properties/Task3.kt", propertiesExercise3.Task3Kt::main);
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
    testExample("Examples/PropertyAccessors/Default.kt", propertyaccessors.DefaultKt::main);
  }

  @Test
  public void testHamsters() {
    testExample("Examples/PropertyAccessors/Hamsters.kt", propertyaccessors.HamstersKt::main);
  }

  @Test
  public void testLogChanges() {
    testExample("Examples/PropertyAccessors/LogChanges.kt", propertyaccessors.LogChangesKt::main);
  }

  @Test
  public void testTask142() {
    testExample("Examples/PropertyAccessors/Task1.kt", propertyAccessorsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask245() {
    testExample("Examples/PropertyAccessors/Task2.kt", propertyAccessorsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask344() {
    testExample("Examples/PropertyAccessors/Task3.kt", propertyAccessorsExercise3.Task3Kt::main);
  }

  @Test
  public void testTask49() {
    testExample("Examples/PropertyAccessors/Task4.kt", propertyAccessorsExercise4.Task4Kt::main);
  }

  @Test
  public void testAccessibility() {
    testExample("Examples/PropertyDelegation/Accessibility.kt", propertydelegation.AccessibilityKt::main);
  }

  @Test
  public void testAdd() {
    testExample("Examples/PropertyDelegation/Add.kt", propertydelegation2.AddKt::main);
  }

  @Test
  public void testBasicRead() {
    testExample("Examples/PropertyDelegation/BasicRead.kt", propertydelegation.BasicReadKt::main);
  }

  @Test
  public void testBasicRead2() {
    testExample("Examples/PropertyDelegation/BasicRead2.kt", propertydelegation.BasicRead2Kt::main);
  }

  @Test
  public void testBasicReadWrite() {
    testExample("Examples/PropertyDelegation/BasicReadWrite.kt", propertydelegation.BasicReadWriteKt::main);
  }

  @Test
  public void testBasicReadWrite2() {
    testExample("Examples/PropertyDelegation/BasicReadWrite2.kt", propertydelegation.BasicReadWrite2Kt::main);
  }

  @Test
  public void testConfiguration() {
    testExample("Examples/PropertyDelegation/Configuration.kt", propertydelegation.ConfigurationKt::main);
  }

  @Test
  public void testFibonacciProperty() {
    testExample("Examples/PropertyDelegation/FibonacciProperty.kt", propertydelegation.FibonacciPropertyKt::main);
  }

  @Test
  public void testPropDelegationSoln1() {
    testExample("Examples/PropertyDelegation/PropDelegationSoln1.kt", propertyDelegationToolsExercise1.PropDelegationSoln1Kt::main);
  }

  @Test
  public void testPropDelegationSoln2() {
    testExample("Examples/PropertyDelegation/PropDelegationSoln2.kt", propertyDelegationExercise1.PropDelegationSoln2Kt::main);
  }

  @Test
  public void testPropDelegationSoln3() {
    testExample("Examples/PropertyDelegation/PropDelegationSoln3.kt", propertyDelegationExercise2.PropDelegationSoln3Kt::main);
  }

  @Test
  public void testPropDelegationSoln4() {
    testExample("Examples/PropertyDelegation/PropDelegationSoln4.kt", propertyDelegationExercise3.PropDelegationSoln4Kt::main);
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
  public void testTask143() {
    testExample("Examples/Recursion/Task1.kt", recursionExercise1.Task1Kt::main);
  }

  @Test
  public void testTask246() {
    testExample("Examples/Recursion/Task2.kt", recursionExercise2.Task2Kt::main);
  }

  @Test
  public void testTask345() {
    testExample("Examples/Recursion/Task3.kt", recursionExercise3.Task3Kt::main);
  }

  @Test
  public void testTask410() {
    testExample("Examples/Recursion/Task4.kt", recursionExercise4.Task4Kt::main);
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
  public void testTask144() {
    testExample("Examples/RepetitionWithWhile/Task1.kt", repetitionWithWhileExercise1.Task1Kt::main);
  }

  @Test
  public void testTask247() {
    testExample("Examples/RepetitionWithWhile/Task2.kt", repetitionWithWhileExercise2.Task2Kt::main);
  }

  @Test
  public void testTask346() {
    testExample("Examples/RepetitionWithWhile/Task3.kt", repetitionWithWhileExercise3.Task3Kt::main);
  }

  @Test
  public void testWhileLoop() {
    testExample("Examples/RepetitionWithWhile/WhileLoop.kt", WhileLoopKt::main);
  }

  @Test
  public void testAutoCloseable() {
    testExample("Examples/ResourceCleanup/AutoCloseable.kt", AutoCloseableKt::main);
  }

  @Test
  public void testForEachLine() {
    testExample("Examples/ResourceCleanup/ForEachLine.kt", ForEachLineKt::main);
  }

  @Test
  public void testResourceCleanupSoln1() {
    testExample("Examples/ResourceCleanup/ResourceCleanupSoln1.kt", resourceCleanupExercise1.ResourceCleanupSoln1Kt::main);
  }

  @Test
  public void testResourceCleanupSoln2() {
    testExample("Examples/ResourceCleanup/ResourceCleanupSoln2.kt", resourceCleanupExercise2.ResourceCleanupSoln2Kt::main);
  }

  @Test
  public void testResourceCleanupSoln3() {
    testExample("Examples/ResourceCleanup/ResourceCleanupSoln3.kt", resourceCleanupExercise3.ResourceCleanupSoln3Kt::main);
  }

  @Test
  public void testUsable() {
    testExample("Examples/ResourceCleanup/Usable.kt", resourcecleanup.UsableKt::main);
  }

  @Test
  public void testUseLines() {
    testExample("Examples/ResourceCleanup/UseLines.kt", UseLinesKt::main);
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
    testExample("Examples/SafeCallsAndElvis/ElvisCall.kt", safecalls.ElvisCallKt::main);
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
    testExample("Examples/SafeCallsAndElvis/SafeOperation.kt", safecalls.SafeOperationKt::main);
  }

  @Test
  public void testTask145() {
    testExample("Examples/SafeCallsAndElvis/Task1.kt", safeCallsAndTheElvisOperatorExercise1.Task1Kt::main);
  }

  @Test
  public void testTask248() {
    testExample("Examples/SafeCallsAndElvis/Task2.kt", safeCallsAndTheElvisOperatorExercise2.Task2Kt::main);
  }

  @Test
  public void testTask347() {
    testExample("Examples/SafeCallsAndElvis/Task3.kt", safeCallsAndTheElvisOperatorExercise3.Task3Kt::main);
  }

  @Test
  public void testAndNullability() {
    testExample("Examples/ScopeFunctions/AndNullability.kt", scopefunctions.AndNullabilityKt::main);
  }

  @Test
  public void testBlob() {
    testExample("Examples/ScopeFunctions/Blob.kt", scopefunctions.BlobKt::main);
  }

  @Test
  public void testDifferences() {
    testExample("Examples/ScopeFunctions/Differences.kt", scopefunctions.DifferencesKt::main);
  }

  @Test
  public void testMapLookup() {
    testExample("Examples/ScopeFunctions/MapLookup.kt", scopefunctions.MapLookupKt::main);
  }

  @Test
  public void testNameTag() {
    testExample("Examples/ScopeFunctions/NameTag.kt", scopefunctions.NameTagKt::main);
  }

  @Test
  public void testNesting() {
    testExample("Examples/ScopeFunctions/Nesting.kt", scopefunctions.NestingKt::main);
  }

  @Test
  public void testNullGnome() {
    testExample("Examples/ScopeFunctions/NullGnome.kt", scopefunctions.NullGnomeKt::main);
  }

  @Test
  public void testTask146() {
    testExample("Examples/ScopeFunctions/Task1.kt", scopeFunctionsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask249() {
    testExample("Examples/ScopeFunctions/Task2.kt", scopeFunctionsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask348() {
    testExample("Examples/ScopeFunctions/Task3.kt", scopeFunctionsExercise3.Task3Kt::main);
  }

  @Test
  public void testSealedClasses() {
    testExample("Examples/SealedClasses/SealedClasses.kt", sealedclasses.SealedClassesKt::main);
  }

  @Test
  public void testSealedEx1() {
    testExample("Examples/SealedClasses/SealedEx1.kt", sealedClassesExercise1.SealedEx1Kt::main);
  }

  @Test
  public void testSealedEx2() {
    testExample("Examples/SealedClasses/SealedEx2.kt", sealedClassesExercise2.SealedEx2Kt::main);
  }

  @Test
  public void testSealedEx3() {
    testExample("Examples/SealedClasses/SealedEx3.kt", sealedClassesExercise3.SealedEx3Kt::main);
  }

  @Test
  public void testSealedSubclasses() {
    testExample("Examples/SealedClasses/SealedSubclasses.kt", sealedclasses.SealedSubclassesKt::main);
  }

  @Test
  public void testSealedVsAbstract() {
    testExample("Examples/SealedClasses/SealedVsAbstract.kt", sealedclasses.SealedVsAbstractKt::main);
  }

  @Test
  public void testUnSealed() {
    testExample("Examples/SealedClasses/UnSealed.kt", withoutsealedclasses.UnSealedKt::main);
  }

  @Test
  public void testGardenItem() {
    testExample("Examples/SecondaryConstructors/GardenItem.kt", secondaryconstructors.GardenItemKt::main);
  }

  @Test
  public void testTask147() {
    testExample("Examples/SecondaryConstructors/Task1.kt", secondaryConstructorsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask250() {
    testExample("Examples/SecondaryConstructors/Task2.kt", secondaryConstructorsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask349() {
    testExample("Examples/SecondaryConstructors/Task3.kt", secondaryConstructorsExercise3.Task3Kt::main);
  }

  @Test
  public void testWithSecondary() {
    testExample("Examples/SecondaryConstructors/WithSecondary.kt", secondaryconstructors.WithSecondaryKt::main);
  }

  @Test
  public void testDefineTakeIf() {
    testExample("Examples/Sequences/DefineTakeIf.kt", sequences.DefineTakeIfKt::main);
  }

  @Test
  public void testEagerEvaluation() {
    testExample("Examples/Sequences/EagerEvaluation.kt", EagerEvaluationKt::main);
  }

  @Test
  public void testEagerVsLazyEvaluation() {
    testExample("Examples/Sequences/EagerVsLazyEvaluation.kt", sequences.EagerVsLazyEvaluationKt::main);
  }

  @Test
  public void testGenerateSequence1() {
    testExample("Examples/Sequences/GenerateSequence1.kt", GenerateSequence1Kt::main);
  }

  @Test
  public void testGenerateSequence2() {
    testExample("Examples/Sequences/GenerateSequence2.kt", GenerateSequence2Kt::main);
  }

  @Test
  public void testNoComputationYet() {
    testExample("Examples/Sequences/NoComputationYet.kt", NoComputationYetKt::main);
  }

  @Test
  public void testNumberSequence2() {
    testExample("Examples/Sequences/NumberSequence2.kt", NumberSequence2Kt::main);
  }

  @Test
  public void testTask61() {
    testExample("Examples/Sequences/Task6.kt", sequencesExercise6.Task6Kt::main);
  }

  @Test
  public void testTask71() {
    testExample("Examples/Sequences/Task7.kt", sequencesExercise7.Task7Kt::main);
  }

  @Test
  public void testTask8() {
    testExample("Examples/Sequences/Task8.kt", sequencesExercise8.Task8Kt::main);
  }

  @Test
  public void testTerminalOperations() {
    testExample("Examples/Sequences/TerminalOperations.kt", TerminalOperationsKt::main);
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
  public void testTask148() {
    testExample("Examples/Sets/Task1.kt", setsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask251() {
    testExample("Examples/Sets/Task2.kt", setsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask350() {
    testExample("Examples/Sets/Task3.kt", setsExercise3.Task3Kt::main);
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
  public void testTask149() {
    testExample("Examples/StringTemplates/Task1.kt", stringTemplatesExercise1.Task1Kt::main);
  }

  @Test
  public void testTask252() {
    testExample("Examples/StringTemplates/Task2.kt", stringTemplatesExercise2.Task2Kt::main);
  }

  @Test
  public void testTask351() {
    testExample("Examples/StringTemplates/Task3.kt", stringTemplatesExercise3.Task3Kt::main);
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
  public void testTask150() {
    testExample("Examples/Summary1/Task1.kt", summaryIExercise1.Task1Kt::main);
  }

  @Test
  public void testTask10() {
    testExample("Examples/Summary1/Task10.kt", summaryIExercise10.Task10Kt::main);
  }

  @Test
  public void testTask253() {
    testExample("Examples/Summary1/Task2.kt", summaryIExercise2.Task2Kt::main);
  }

  @Test
  public void testTask352() {
    testExample("Examples/Summary1/Task3.kt", summaryIExercise3.Task3Kt::main);
  }

  @Test
  public void testTask411() {
    testExample("Examples/Summary1/Task4.kt", summaryIExercise4.Task4Kt::main);
  }

  @Test
  public void testTask51() {
    testExample("Examples/Summary1/Task5.kt", summaryIExercise5.Task5Kt::main);
  }

  @Test
  public void testTask62() {
    testExample("Examples/Summary1/Task6.kt", summaryIExercise6.Task6Kt::main);
  }

  @Test
  public void testTask72() {
    testExample("Examples/Summary1/Task7.kt", summaryIExercise7.Task7Kt::main);
  }

  @Test
  public void testTask81() {
    testExample("Examples/Summary1/Task8.kt", summaryIExercise8.Task8Kt::main);
  }

  @Test
  public void testTask9() {
    testExample("Examples/Summary1/Task9.kt", summaryIExercise9.Task9Kt::main);
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
    testExample("Examples/Summary2/Boxes.kt", summary2.BoxesKt::main);
  }

  @Test
  public void testClassBodies() {
    testExample("Examples/Summary2/ClassBodies.kt", summary2.ClassBodiesKt::main);
  }

  @Test
  public void testColorSet() {
    testExample("Examples/Summary2/ColorSet.kt", summary2.ColorSetKt::main);
  }

  @Test
  public void testExplicitTyping() {
    testExample("Examples/Summary2/ExplicitTyping.kt", summary2.ExplicitTypingKt::main);
  }

  @Test
  public void testGetterAndSetter() {
    testExample("Examples/Summary2/GetterAndSetter.kt", summary2.GetterAndSetterKt::main);
  }

  @Test
  public void testJetPack() {
    testExample("Examples/Summary2/JetPack.kt", summary2.JetPackKt::main);
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
    testExample("Examples/Summary2/Quadratic.kt", summary2.QuadraticKt::main);
  }

  @Test
  public void testReadonlyVsMutableList() {
    testExample("Examples/Summary2/ReadonlyVsMutableList.kt", ReadonlyVsMutableListKt::main);
  }

  @Test
  public void testTask151() {
    testExample("Examples/Summary2/Task1.kt", summaryIIExercise1.Task1Kt::main);
  }

  @Test
  public void testTask254() {
    testExample("Examples/Summary2/Task2.kt", summaryIIExercise2.Task2Kt::main);
  }

  @Test
  public void testTask353() {
    testExample("Examples/Summary2/Task3.kt", summaryIIExercise3.Task3Kt::main);
  }

  @Test
  public void testTask412() {
    testExample("Examples/Summary2/Task4.kt", summaryIIExercise4.Task4Kt::main);
  }

  @Test
  public void testTask52() {
    testExample("Examples/Summary2/Task5.kt", summaryIIExercise5.Task5Kt::main);
  }

  @Test
  public void testTask63() {
    testExample("Examples/Summary2/Task6.kt", summaryIIExercise6.Task6Kt::main);
  }

  @Test
  public void testTask73() {
    testExample("Examples/Summary2/Task7.kt", summaryIIExercise7.Task7Kt::main);
  }

  @Test
  public void testTask82() {
    testExample("Examples/Summary2/Task8.kt", summaryIIExercise8.Task8Kt::main);
  }

  @Test
  public void testTemperature() {
    testExample("Examples/Summary2/Temperature.kt", summary2.TemperatureKt::main);
  }

  @Test
  public void testTicTacToe() {
    testExample("Examples/Summary2/TicTacToe.kt", summary2.TicTacToeKt::main);
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
    testExample("Examples/Summary2/VarArgs.kt", summary2.VarArgsKt::main);
  }

  @Test
  public void testWildAnimals() {
    testExample("Examples/Summary2/WildAnimals.kt", summary2.WildAnimalsKt::main);
  }

  @Test
  public void testTask152() {
    testExample("Examples/Testing/Task1.kt", testingExercise1.Task1Kt::main);
  }

  @Test
  public void testTask255() {
    testExample("Examples/Testing/Task2.kt", testingExercise2.Task2Kt::main);
  }

  @Test
  public void testTask354() {
    testExample("Examples/Testing/Task3.kt", testingExercise3.Task3Kt::main);
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
  public void testTrace1() {
    testExample("Examples/Testing/Trace1.kt", Trace1Kt::main);
  }

  @Test
  public void testUsingTrace() {
    testExample("Examples/Testing/UsingTrace.kt", UsingTraceKt::main);
  }

  @Test
  public void testBeverageContainer() {
    testExample("Examples/TypeChecking/BeverageContainer.kt", typechecking.BeverageContainerKt::main);
  }

  @Test
  public void testBeverageContainer2() {
    testExample("Examples/TypeChecking/BeverageContainer2.kt", typechecking2.BeverageContainer2Kt::main);
  }

  @Test
  public void testBeverageContainer3() {
    testExample("Examples/TypeChecking/BeverageContainer3.kt", typechecking3.BeverageContainer3Kt::main);
  }

  @Test
  public void testInsects() {
    testExample("Examples/TypeChecking/Insects.kt", typechecking.InsectsKt::main);
  }

  @Test
  public void testTypeCheck1() {
    testExample("Examples/TypeChecking/TypeCheck1.kt", typechecking.TypeCheck1Kt::main);
  }

  @Test
  public void testTypeCheck2() {
    testExample("Examples/TypeChecking/TypeCheck2.kt", typechecking.TypeCheck2Kt::main);
  }

  @Test
  public void testTypeCheck3() {
    testExample("Examples/TypeChecking/TypeCheck3.kt", typechecking3.TypeCheck3Kt::main);
  }

  @Test
  public void testTypeCheckingSoln1() {
    testExample("Examples/TypeChecking/TypeCheckingSoln1.kt", typeCheckingExercise1.TypeCheckingSoln1Kt::main);
  }

  @Test
  public void testTypeCheckingSoln2a() {
    testExample("Examples/TypeChecking/TypeCheckingSoln2a.kt", typeCheckingExercise2a.TypeCheckingSoln2aKt::main);
  }

  @Test
  public void testTypeCheckingSoln2b() {
    testExample("Examples/TypeChecking/TypeCheckingSoln2b.kt", typeCheckingExercise2b.TypeCheckingSoln2bKt::main);
  }

  @Test
  public void testTypeCheckingSoln3() {
    testExample("Examples/TypeChecking/TypeCheckingSoln3.kt", typeCheckingExercise3.TypeCheckingSoln3Kt::main);
  }

  @Test
  public void testNoFramework() {
    testExample("Examples/UnitTesting/NoFramework.kt", unittesting.NoFrameworkKt::main);
  }

  @Test
  public void testUsingExpect() {
    testExample("Examples/UnitTesting/UsingExpect.kt", unittesting.UsingExpectKt::main);
  }

  @Test
  public void testAssignment() {
    testExample("Examples/Upcasting/Assignment.kt", AssignmentKt::main);
  }

  @Test
  public void testDrawing() {
    testExample("Examples/Upcasting/Drawing.kt", upcasting.DrawingKt::main);
  }

  @Test
  public void testTask256() {
    testExample("Examples/Upcasting/Task2.kt", upcastingExercise2.Task2Kt::main);
  }

  @Test
  public void testTask355() {
    testExample("Examples/Upcasting/Task3.kt", upcastingExercise3.Task3Kt::main);
  }

  @Test
  public void testTrimmedMembers() {
    testExample("Examples/Upcasting/TrimmedMembers.kt", upcasting.TrimmedMembersKt::main);
  }

  @Test
  public void testUpcastExercise1() {
    testExample("Examples/Upcasting/UpcastExercise1.kt", upcastingExercise1.UpcastExercise1Kt::main);
  }

  @Test
  public void testComparableRange() {
    testExample("Examples/UsingOperators/ComparableRange.kt", usingoperators.ComparableRangeKt::main);
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
    testExample("Examples/UsingOperators/DestructuringDuo.kt", usingoperators.DestructuringDuoKt::main);
  }

  @Test
  public void testDestructuringMap() {
    testExample("Examples/UsingOperators/DestructuringMap.kt", DestructuringMapKt::main);
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
  public void testUsingOperatorsSoln1() {
    testExample("Examples/UsingOperators/UsingOperatorsSoln1.kt", usingOperatorsExercise1.UsingOperatorsSoln1Kt::main);
  }

  @Test
  public void testUsingOperatorsSoln2() {
    testExample("Examples/UsingOperators/UsingOperatorsSoln2.kt", usingOperatorsExercise2.UsingOperatorsSoln2Kt::main);
  }

  @Test
  public void testUsingOperatorsSoln3() {
    testExample("Examples/UsingOperators/UsingOperatorsSoln3.kt", usingOperatorsExercise3.UsingOperatorsSoln3Kt::main);
  }

  @Test
  public void testAVarIsMutable() {
    testExample("Examples/VarAndVal/AVarIsMutable.kt", AVarIsMutableKt::main);
  }

  @Test
  public void testTask153() {
    testExample("Examples/VarAndVal/Task1.kt", varAndValExercise1.Task1Kt::main);
  }

  @Test
  public void testTask257() {
    testExample("Examples/VarAndVal/Task2.kt", varAndValExercise2.Task2Kt::main);
  }

  @Test
  public void testTask356() {
    testExample("Examples/VarAndVal/Task3.kt", varAndValExercise3.Task3Kt::main);
  }

  @Test
  public void testTask413() {
    testExample("Examples/VarAndVal/Task4.kt", varAndValExercise4.Task4Kt::main);
  }

  @Test
  public void testTask53() {
    testExample("Examples/VarAndVal/Task5.kt", varAndValExercise5.Task5Kt::main);
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
  public void testTask154() {
    testExample("Examples/Varargs/Task1.kt", variableArgumentListsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask258() {
    testExample("Examples/Varargs/Task2.kt", variableArgumentListsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask357() {
    testExample("Examples/Varargs/Task3.kt", variableArgumentListsExercise3.Task3Kt::main);
  }

  @Test
  public void testTask414() {
    testExample("Examples/Varargs/Task4.kt", variableArgumentListsExercise4.Task4Kt::main);
  }

  @Test
  public void testTwoFunctionsWithVarargs() {
    testExample("Examples/Varargs/TwoFunctionsWithVarargs.kt", varargs.TwoFunctionsWithVarargsKt::main);
  }

  @Test
  public void testVarargLikeList() {
    testExample("Examples/Varargs/VarargLikeList.kt", varargs.VarargLikeListKt::main);
  }

  @Test
  public void testVarargSum() {
    testExample("Examples/Varargs/VarargSum.kt", varargs.VarargSumKt::main);
  }

  @Test
  public void testVariableArgList() {
    testExample("Examples/Varargs/VariableArgList.kt", varargs.VariableArgListKt::main);
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
  public void testTask155() {
    testExample("Examples/Visibility/Task1.kt", constrainingVisibilityExercise1.Task1Kt::main);
  }

  @Test
  public void testTask259() {
    testExample("Examples/Visibility/Task2.kt", constrainingVisibilityExercise2.Task2Kt::main);
  }

  @Test
  public void testTask358() {
    testExample("Examples/Visibility/Task3.kt", constrainingVisibilityExercise3.Task3Kt::main);
  }

  @Test
  public void testAnalyzeInput() {
    testExample("Examples/WhenExpressions/AnalyzeInput.kt", whenexpressions.AnalyzeInputKt::main);
  }

  @Test
  public void testBmiWhen() {
    testExample("Examples/WhenExpressions/BmiWhen.kt", whenexpressions.BmiWhenKt::main);
  }

  @Test
  public void testGermanOrdinals() {
    testExample("Examples/WhenExpressions/GermanOrdinals.kt", whenexpressions.GermanOrdinalsKt::main);
  }

  @Test
  public void testMatchingAgainstVals() {
    testExample("Examples/WhenExpressions/MatchingAgainstVals.kt", MatchingAgainstValsKt::main);
  }

  @Test
  public void testMixColors() {
    testExample("Examples/WhenExpressions/MixColors.kt", whenexpressions.MixColorsKt::main);
  }

  @Test
  public void testTask156() {
    testExample("Examples/WhenExpressions/Task1.kt", whenExpressionsExercise1.Task1Kt::main);
  }

  @Test
  public void testTask260() {
    testExample("Examples/WhenExpressions/Task2.kt", whenExpressionsExercise2.Task2Kt::main);
  }

  @Test
  public void testTask359() {
    testExample("Examples/WhenExpressions/Task3.kt", whenExpressionsExercise3.Task3Kt::main);
  }

  @Test
  public void testLearnerTest() {
    testJUnitClass(unittesting.LearnerTest.class);
  }

  @Test
  public void testSampleTest() {
    testJUnitClass(unittesting.SampleTest.class);
  }

  @Test
  public void testStateMachineTest() {
    testJUnitClass(unittesting.StateMachineTest.class);
  }
}
