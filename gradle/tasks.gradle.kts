configurations {
    kotlinRuntime
}

dependencies {
    kotlinRuntime "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
}

def kotlinClassPath = configurations.kotlinRuntime + sourceSets.main.runtimeClasspath

task ASCIIMap(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ASCIIMapKt'
}

task AVarIsMutable(type: JavaExec) {
    classpath kotlinClassPath
    main = 'AVarIsMutableKt'
}

task Accessibility(type: JavaExec) {
    classpath kotlinClassPath
    main = 'propertydelegation.AccessibilityKt'
}

task Adapter(type: JavaExec) {
    classpath kotlinClassPath
    main = 'inheritanceextensions.AdapterKt'
}

task Add(type: JavaExec) {
    classpath kotlinClassPath
    main = 'propertydelegation2.AddKt'
}

task AddingIntToChar(type: JavaExec) {
    classpath kotlinClassPath
    main = 'AddingIntToCharKt'
}

task Airport(type: JavaExec) {
    classpath kotlinClassPath
    main = 'nestedclasses.AirportKt'
}

task Amphibian(type: JavaExec) {
    classpath kotlinClassPath
    main = 'nullabletypes.AmphibianKt'
}

task AnUnchangingVar(type: JavaExec) {
    classpath kotlinClassPath
    main = 'AnUnchangingVarKt'
}

task AnalyzeInput(type: JavaExec) {
    classpath kotlinClassPath
    main = 'whenexpressions.AnalyzeInputKt'
}

task AndNullability(type: JavaExec) {
    classpath kotlinClassPath
    main = 'scopefunctions.AndNullabilityKt'
}

task Animals(type: JavaExec) {
    classpath kotlinClassPath
    main = 'AnimalsKt'
}

task AnnotatedJava(type: JavaExec) {
    classpath kotlinClassPath
    main = 'interop.AnnotatedJavaKt'
}

task AnonymousFunction(type: JavaExec) {
    classpath kotlinClassPath
    main = 'extensionlambdas.AnonymousFunctionKt'
}

task Any(type: JavaExec) {
    classpath kotlinClassPath
    main = 'higherorderfunctions.AnyKt'
}

task AnyFromListOfStar(type: JavaExec) {
    classpath kotlinClassPath
    main = 'AnyFromListOfStarKt'
}

task AnyInstead(type: JavaExec) {
    classpath kotlinClassPath
    main = 'introgenerics.AnyInsteadKt'
}

task Arg(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ArgKt'
}

task ArgumentOrder(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ArgumentOrderKt'
}

task ArithmeticOperators(type: JavaExec) {
    classpath kotlinClassPath
    main = 'operatoroverloading.ArithmeticOperatorsKt'
}

task ArraySpread(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ArraySpreadKt'
}

task AssigningAnIf(type: JavaExec) {
    classpath kotlinClassPath
    main = 'AssigningAnIfKt'
}

task Assignment(type: JavaExec) {
    classpath kotlinClassPath
    main = 'AssignmentKt'
}

task AssignmentOperators(type: JavaExec) {
    classpath kotlinClassPath
    main = 'AssignmentOperatorsKt'
}

task AssociateBy(type: JavaExec) {
    classpath kotlinClassPath
    main = 'AssociateByKt'
}

task AssociateByUnique(type: JavaExec) {
    classpath kotlinClassPath
    main = 'AssociateByUniqueKt'
}

task AssociateWith(type: JavaExec) {
    classpath kotlinClassPath
    main = 'AssociateWithKt'
}

task AtomicTestCapture(type: JavaExec) {
    classpath kotlinClassPath
    main = 'AtomicTestCaptureKt'
}

task AutoCloseable(type: JavaExec) {
    classpath kotlinClassPath
    main = 'AutoCloseableKt'
}

task AverageIncome(type: JavaExec) {
    classpath kotlinClassPath
    main = 'firstversion.AverageIncomeKt'
}

task AverageIncomeWithException(type: JavaExec) {
    classpath kotlinClassPath
    main = 'properexception.AverageIncomeWithExceptionKt'
}

task AverageIncomeWithNull(type: JavaExec) {
    classpath kotlinClassPath
    main = 'withnull.AverageIncomeWithNullKt'
}

task BMIEnglish(type: JavaExec) {
    classpath kotlinClassPath
    main = 'BMIEnglishKt'
}

task BMIMetric(type: JavaExec) {
    classpath kotlinClassPath
    main = 'BMIMetricKt'
}

task Backticks(type: JavaExec) {
    classpath kotlinClassPath
    main = 'operatoroverloading.BackticksKt'
}

task BasicFunctions(type: JavaExec) {
    classpath kotlinClassPath
    main = 'BasicFunctionsKt'
}

task BasicLambda(type: JavaExec) {
    classpath kotlinClassPath
    main = 'BasicLambdaKt'
}

task BasicLogging(type: JavaExec) {
    classpath kotlinClassPath
    main = 'logging.BasicLoggingKt'
}

task BasicRead(type: JavaExec) {
    classpath kotlinClassPath
    main = 'propertydelegation.BasicReadKt'
}

task BasicRead2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'propertydelegation.BasicRead2Kt'
}

task BasicReadWrite(type: JavaExec) {
    classpath kotlinClassPath
    main = 'propertydelegation.BasicReadWriteKt'
}

task BasicReadWrite2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'propertydelegation.BasicReadWrite2Kt'
}

task BetterSuitcase(type: JavaExec) {
    classpath kotlinClassPath
    main = 'lateinitialization.BetterSuitcaseKt'
}

task BeverageContainer(type: JavaExec) {
    classpath kotlinClassPath
    main = 'typechecking.BeverageContainerKt'
}

task BeverageContainer2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'typechecking2.BeverageContainer2Kt'
}

task BeverageContainer3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'typechecking3.BeverageContainer3Kt'
}

task BigFibonacci(type: JavaExec) {
    classpath kotlinClassPath
    main = 'interop.BigFibonacciKt'
}

task BiggestLong(type: JavaExec) {
    classpath kotlinClassPath
    main = 'BiggestLongKt'
}

task Blob(type: JavaExec) {
    classpath kotlinClassPath
    main = 'scopefunctions.BlobKt'
}

task BmiWhen(type: JavaExec) {
    classpath kotlinClassPath
    main = 'whenexpressions.BmiWhenKt'
}

task BookExtensions(type: JavaExec) {
    classpath kotlinClassPath
    main = 'extensionfunctions.BookExtensionsKt'
}

task Booleans(type: JavaExec) {
    classpath kotlinClassPath
    main = 'BooleansKt'
}

task Boxes(type: JavaExec) {
    classpath kotlinClassPath
    main = 'summary2.BoxesKt'
}

task ByOperations(type: JavaExec) {
    classpath kotlinClassPath
    main = 'operationsoncollections.ByOperationsKt'
}

task CallStack(type: JavaExec) {
    classpath kotlinClassPath
    main = 'recursion.CallStackKt'
}

task CallTopLevelFunction(type: JavaExec) {
    classpath kotlinClassPath
    main = 'interoperability.CallTopLevelFunction'
}

task CallTopLevelFunction2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'interoperability.CallTopLevelFunction2'
}

task CallingReference(type: JavaExec) {
    classpath kotlinClassPath
    main = 'higherorderfunctions.CallingReferenceKt'
}

task CaptureImplementation(type: JavaExec) {
    classpath kotlinClassPath
    main = 'exceptionhandling.CaptureImplementationKt'
}

task Car(type: JavaExec) {
    classpath kotlinClassPath
    main = 'composition.CarKt'
}

task CarCrate(type: JavaExec) {
    classpath kotlinClassPath
    main = 'creatinggenerics.CarCrateKt'
}

task CarService(type: JavaExec) {
    classpath kotlinClassPath
    main = 'propertydelegation.CarServiceKt'
}

task Cat(type: JavaExec) {
    classpath kotlinClassPath
    main = 'CatKt'
}

task CatchChecked(type: JavaExec) {
    classpath kotlinClassPath
    main = 'interoperability.CatchChecked'
}

task ChainedCalls(type: JavaExec) {
    classpath kotlinClassPath
    main = 'safecalls.ChainedCallsKt'
}

task ChangingAVal(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ChangingAValKt'
}

task CharRange(type: JavaExec) {
    classpath kotlinClassPath
    main = 'CharRangeKt'
}

task CheckInstructionsSoln1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'checkInstructionsExercise1.CheckInstructionsSoln1Kt'
}

task CheckInstructionsSoln2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'checkInstructionsExercise2.CheckInstructionsSoln2Kt'
}

task CheckInstructionsSoln3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'checkInstructionsExercise3.CheckInstructionsSoln3Kt'
}

task CheckInstructionsSoln4(type: JavaExec) {
    classpath kotlinClassPath
    main = 'checkInstructionsExercise4.CheckInstructionsSoln4Kt'
}

task CheckObject(type: JavaExec) {
    classpath kotlinClassPath
    main = 'nothingtype.CheckObjectKt'
}

task CheckObject2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'nothingtype.CheckObject2Kt'
}

task CheckType(type: JavaExec) {
    classpath kotlinClassPath
    main = 'creatinggenerics.CheckTypeKt'
}

task CheckingOptions(type: JavaExec) {
    classpath kotlinClassPath
    main = 'checkingoptions.CheckingOptionsKt'
}

task ClassBodies(type: JavaExec) {
    classpath kotlinClassPath
    main = 'summary2.ClassBodiesKt'
}

task Closed(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ClosedKt'
}

task Closures(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ClosuresKt'
}

task Closures2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'Closures2Kt'
}

task Color2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'color2.Color2Kt'
}

task Color3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'color3.Color3Kt'
}

task ColorSet(type: JavaExec) {
    classpath kotlinClassPath
    main = 'summary2.ColorSetKt'
}

task CompanionDelegation(type: JavaExec) {
    classpath kotlinClassPath
    main = 'companionobjects.CompanionDelegationKt'
}

task CompanionEx1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'companionObjectsExercise1.CompanionEx1Kt'
}

task CompanionEx2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'companionObjectsExercise2.CompanionEx2Kt'
}

task CompanionEx3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'companionObjectsExercise3.CompanionEx3Kt'
}

task CompanionFactory(type: JavaExec) {
    classpath kotlinClassPath
    main = 'companionobjects.CompanionFactoryKt'
}

task CompanionInstance(type: JavaExec) {
    classpath kotlinClassPath
    main = 'companionobjects.CompanionInstanceKt'
}

task CompanionObject(type: JavaExec) {
    classpath kotlinClassPath
    main = 'companionobjects.CompanionObjectKt'
}

task ComparableRange(type: JavaExec) {
    classpath kotlinClassPath
    main = 'usingoperators.ComparableRangeKt'
}

task CompareTo(type: JavaExec) {
    classpath kotlinClassPath
    main = 'usingoperators.CompareToKt'
}

task Comparison(type: JavaExec) {
    classpath kotlinClassPath
    main = 'operatoroverloading.ComparisonKt'
}

task ComposeAdapter(type: JavaExec) {
    classpath kotlinClassPath
    main = 'inheritanceextensions2.ComposeAdapterKt'
}

task Computation(type: JavaExec) {
    classpath kotlinClassPath
    main = 'destructuring.ComputationKt'
}

task Computer(type: JavaExec) {
    classpath kotlinClassPath
    main = 'interfaces.ComputerKt'
}

task Configuration(type: JavaExec) {
    classpath kotlinClassPath
    main = 'propertydelegation.ConfigurationKt'
}

task Confusing(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ConfusingKt'
}

task ConfusingPrecedence(type: JavaExec) {
    classpath kotlinClassPath
    main = 'operatoroverloading.ConfusingPrecedenceKt'
}

task Constrained(type: JavaExec) {
    classpath kotlinClassPath
    main = 'creatinggenerics.ConstrainedKt'
}

task ConstructorReference(type: JavaExec) {
    classpath kotlinClassPath
    main = 'memberreferences3.ConstructorReferenceKt'
}

task ContactMap(type: JavaExec) {
    classpath kotlinClassPath
    main = 'maps.ContactMapKt'
}

task ContainerAccess(type: JavaExec) {
    classpath kotlinClassPath
    main = 'operatoroverloading.ContainerAccessKt'
}

task Convention(type: JavaExec) {
    classpath kotlinClassPath
    main = 'inheritanceextensions.ConventionKt'
}

task Conversion(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ConversionKt'
}

task Cookie(type: JavaExec) {
    classpath kotlinClassPath
    main = 'CookieKt'
}

task CopyDataClass(type: JavaExec) {
    classpath kotlinClassPath
    main = 'dataclasses.CopyDataClassKt'
}

task Counter(type: JavaExec) {
    classpath kotlinClassPath
    main = 'propertyaccessors.CounterKt'
}

task CounterFactory(type: JavaExec) {
    classpath kotlinClassPath
    main = 'innerclasses.CounterFactoryKt'
}

task CovariantList(type: JavaExec) {
    classpath kotlinClassPath
    main = 'variance.CovariantListKt'
}

task Crate(type: JavaExec) {
    classpath kotlinClassPath
    main = 'creatinggenerics.CrateKt'
}

task CreateString(type: JavaExec) {
    classpath kotlinClassPath
    main = 'CreateStringKt'
}

task CreateString2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'CreateString2Kt'
}

task CreatingGenericsSoln1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'creatingGenericsExercise1.CreatingGenericsSoln1Kt'
}

task CreatingGenericsSoln2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'creatingGenericsExercise2.CreatingGenericsSoln2Kt'
}

task CreatingGenericsSoln3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'creatingGenericsExercise3.CreatingGenericsSoln3Kt'
}

task CreatingLists(type: JavaExec) {
    classpath kotlinClassPath
    main = 'CreatingListsKt'
}

task Creature(type: JavaExec) {
    classpath kotlinClassPath
    main = 'downcasting.CreatureKt'
}

task Cup(type: JavaExec) {
    classpath kotlinClassPath
    main = 'CupKt'
}

task Cup2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'Cup2Kt'
}

task CustomLabel(type: JavaExec) {
    classpath kotlinClassPath
    main = 'CustomLabelKt'
}

task Data(type: JavaExec) {
    classpath kotlinClassPath
    main = 'propertyaccessors.DataKt'
}

task DataClasses(type: JavaExec) {
    classpath kotlinClassPath
    main = 'dataclasses.DataClassesKt'
}

task DataFile(type: JavaExec) {
    classpath kotlinClassPath
    main = 'checkinstructions.DataFileKt'
}

task Default(type: JavaExec) {
    classpath kotlinClassPath
    main = 'propertyaccessors.DefaultKt'
}

task DefaultEquality(type: JavaExec) {
    classpath kotlinClassPath
    main = 'operatoroverloading.DefaultEqualityKt'
}

task DefineTakeIf(type: JavaExec) {
    classpath kotlinClassPath
    main = 'sequences.DefineTakeIfKt'
}

task DefiningEquality(type: JavaExec) {
    classpath kotlinClassPath
    main = 'operatoroverloading.DefiningEqualityKt'
}

task DefiningExceptions(type: JavaExec) {
    classpath kotlinClassPath
    main = 'exceptionhandling.DefiningExceptionsKt'
}

task DefiningRanges(type: JavaExec) {
    classpath kotlinClassPath
    main = 'DefiningRangesKt'
}

task DelegToolsSoln1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'propertyDelegationToolsExercise2.DelegToolsSoln1Kt'
}

task DelegToolsSoln2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'propertyDelegationToolsExercise3.DelegToolsSoln2Kt'
}

task DelegToolsSoln3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'propertyDelegationToolsExercise4.DelegToolsSoln3Kt'
}

task DelegateAndExtend(type: JavaExec) {
    classpath kotlinClassPath
    main = 'companionobjects.DelegateAndExtendKt'
}

task DelegatedControls(type: JavaExec) {
    classpath kotlinClassPath
    main = 'classdelegation.DelegatedControlsKt'
}

task Dereference(type: JavaExec) {
    classpath kotlinClassPath
    main = 'DereferenceKt'
}

task DereferenceNull(type: JavaExec) {
    classpath kotlinClassPath
    main = 'DereferenceNullKt'
}

task DestructuringData(type: JavaExec) {
    classpath kotlinClassPath
    main = 'usingoperators.DestructuringDataKt'
}

task DestructuringDuo(type: JavaExec) {
    classpath kotlinClassPath
    main = 'usingoperators.DestructuringDuoKt'
}

task DestructuringMap(type: JavaExec) {
    classpath kotlinClassPath
    main = 'DestructuringMapKt'
}

task DeviceExtensions(type: JavaExec) {
    classpath kotlinClassPath
    main = 'inheritanceextensions2.DeviceExtensionsKt'
}

task DeviceMembers(type: JavaExec) {
    classpath kotlinClassPath
    main = 'inheritanceextensions1.DeviceMembersKt'
}

task Differences(type: JavaExec) {
    classpath kotlinClassPath
    main = 'scopefunctions.DifferencesKt'
}

task DifferentTypes(type: JavaExec) {
    classpath kotlinClassPath
    main = 'operatoroverloading.DifferentTypesKt'
}

task Direction(type: JavaExec) {
    classpath kotlinClassPath
    main = 'enumerations.DirectionKt'
}

task DisplayAlienSpecies(type: JavaExec) {
    classpath kotlinClassPath
    main = 'DisplayAlienSpeciesKt'
}

task DoWhile(type: JavaExec) {
    classpath kotlinClassPath
    main = 'DoWhileKt'
}

task DoWhileControl(type: JavaExec) {
    classpath kotlinClassPath
    main = 'DoWhileControlKt'
}

task DoWhileLoop(type: JavaExec) {
    classpath kotlinClassPath
    main = 'DoWhileLoopKt'
}

task Dog(type: JavaExec) {
    classpath kotlinClassPath
    main = 'DogKt'
}

task DownCastEx1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'downcastingExercise1.DownCastEx1Kt'
}

task DownCastEx2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'downcastingExercise2.DownCastEx2Kt'
}

task DownCastEx3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'downcastingExercise3.DownCastEx3Kt'
}

task Drawing(type: JavaExec) {
    classpath kotlinClassPath
    main = 'upcasting.DrawingKt'
}

task EagerEvaluation(type: JavaExec) {
    classpath kotlinClassPath
    main = 'EagerEvaluationKt'
}

task EagerVsLazyEvaluation(type: JavaExec) {
    classpath kotlinClassPath
    main = 'sequences.EagerVsLazyEvaluationKt'
}

task ElvisCall(type: JavaExec) {
    classpath kotlinClassPath
    main = 'safecalls.ElvisCallKt'
}

task ElvisOperator(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ElvisOperatorKt'
}

task EmptyProgram(type: JavaExec) {
    classpath kotlinClassPath
    main = 'EmptyProgramKt'
}

task EnumImport(type: JavaExec) {
    classpath kotlinClassPath
    main = 'EnumImportKt'
}

task EqualsForNullable(type: JavaExec) {
    classpath kotlinClassPath
    main = 'operatoroverloading.EqualsForNullableKt'
}

task Erasure(type: JavaExec) {
    classpath kotlinClassPath
    main = 'creatinggenerics.ErasureKt'
}

task Evaluation(type: JavaExec) {
    classpath kotlinClassPath
    main = 'namedanddefault.EvaluationKt'
}

task EvaluationOrder(type: JavaExec) {
    classpath kotlinClassPath
    main = 'EvaluationOrderKt'
}

task Exercise1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'complexConstructorsExercise1.Exercise1Kt'
}

task Exercise2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'complexConstructorsExercise2.Exercise2Kt'
}

task Exercise3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'complexConstructorsExercise3.Exercise3Kt'
}

task ExplicitCheck(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ExplicitCheckKt'
}

task ExplicitDelegation(type: JavaExec) {
    classpath kotlinClassPath
    main = 'classdelegation.ExplicitDelegationKt'
}

task ExplicitTyping(type: JavaExec) {
    classpath kotlinClassPath
    main = 'summary2.ExplicitTypingKt'
}

task ExpressionInTemplate(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ExpressionInTemplateKt'
}

task ExtensionFuncs(type: JavaExec) {
    classpath kotlinClassPath
    main = 'inheritanceextensions2.ExtensionFuncsKt'
}

task ExtensionLambdasSoln1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'extensionLambdasExercise1.ExtensionLambdasSoln1Kt'
}

task ExtensionLambdasSoln2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'extensionLambdasExercise2.ExtensionLambdasSoln2Kt'
}

task ExtensionLambdasSoln3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'extensionLambdasExercise3.ExtensionLambdasSoln3Kt'
}

task ExtensionPolymorphism(type: JavaExec) {
    classpath kotlinClassPath
    main = 'extensionlambdas.ExtensionPolymorphismKt'
}

task ExtensionReference(type: JavaExec) {
    classpath kotlinClassPath
    main = 'memberreferences.ExtensionReferenceKt'
}

task ExtensionsToJavaClass(type: JavaExec) {
    classpath kotlinClassPath
    main = 'interop.ExtensionsToJavaClassKt'
}

task Factorial(type: JavaExec) {
    classpath kotlinClassPath
    main = 'recursion.FactorialKt'
}

task Fail(type: JavaExec) {
    classpath kotlinClassPath
    main = 'nothingtype.FailKt'
}

task FantasyGame(type: JavaExec) {
    classpath kotlinClassPath
    main = 'polymorphism.FantasyGameKt'
}

task FaultySuitcase(type: JavaExec) {
    classpath kotlinClassPath
    main = 'lateinitialization.FaultySuitcaseKt'
}

task Fibonacci(type: JavaExec) {
    classpath kotlinClassPath
    main = 'recursion.FibonacciKt'
}

task FibonacciProperty(type: JavaExec) {
    classpath kotlinClassPath
    main = 'propertydelegation.FibonacciPropertyKt'
}

task FillIt(type: JavaExec) {
    classpath kotlinClassPath
    main = 'nestedclasses.FillItKt'
}

task Filter(type: JavaExec) {
    classpath kotlinClassPath
    main = 'FilterKt'
}

task FilterEven(type: JavaExec) {
    classpath kotlinClassPath
    main = 'importanceoflambdas.FilterEvenKt'
}

task FilterIsInstance(type: JavaExec) {
    classpath kotlinClassPath
    main = 'FilterIsInstanceKt'
}

task FilterMap(type: JavaExec) {
    classpath kotlinClassPath
    main = 'FilterMapKt'
}

task FilterNotNull(type: JavaExec) {
    classpath kotlinClassPath
    main = 'FilterNotNullKt'
}

task FindType(type: JavaExec) {
    classpath kotlinClassPath
    main = 'downcasting.FindTypeKt'
}

task Flatten(type: JavaExec) {
    classpath kotlinClassPath
    main = 'FlattenKt'
}

task FlattenAndFlatMap(type: JavaExec) {
    classpath kotlinClassPath
    main = 'FlattenAndFlatMapKt'
}

task FloatingPointRange(type: JavaExec) {
    classpath kotlinClassPath
    main = 'FloatingPointRangeKt'
}

task FoldRight(type: JavaExec) {
    classpath kotlinClassPath
    main = 'FoldRightKt'
}

task FoldVsForLoop(type: JavaExec) {
    classpath kotlinClassPath
    main = 'FoldVsForLoopKt'
}

task ForControl(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ForControlKt'
}

task ForEachLine(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ForEachLineKt'
}

task ForIsAStatement(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ForIsAStatementKt'
}

task ForLabeled(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ForLabeledKt'
}

task ForLoop(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ForLoopKt'
}

task ForWithCharRange(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ForWithCharRangeKt'
}

task ForWithRanges(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ForWithRangesKt'
}

task FullyQualify(type: JavaExec) {
    classpath kotlinClassPath
    main = 'FullyQualifyKt'
}

task FuncReferences(type: JavaExec) {
    classpath kotlinClassPath
    main = 'extensionlambdas.FuncReferencesKt'
}

task FunctionClosure(type: JavaExec) {
    classpath kotlinClassPath
    main = 'importanceoflambdas.FunctionClosureKt'
}

task FunctionReference(type: JavaExec) {
    classpath kotlinClassPath
    main = 'memberreferences2.FunctionReferenceKt'
}

task GardenItem(type: JavaExec) {
    classpath kotlinClassPath
    main = 'secondaryconstructors.GardenItemKt'
}

task GenerateSequence1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'GenerateSequence1Kt'
}

task GenerateSequence2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'GenerateSequence2Kt'
}

task GenericFunction(type: JavaExec) {
    classpath kotlinClassPath
    main = 'introgenerics.GenericFunctionKt'
}

task GenericHolder(type: JavaExec) {
    classpath kotlinClassPath
    main = 'introgenerics.GenericHolderKt'
}

task GenericListExt(type: JavaExec) {
    classpath kotlinClassPath
    main = 'extensionproperties.GenericListExtKt'
}

task GenericListExtensions(type: JavaExec) {
    classpath kotlinClassPath
    main = 'introgenerics.GenericListExtensionsKt'
}

task GermanOrdinals(type: JavaExec) {
    classpath kotlinClassPath
    main = 'whenexpressions.GermanOrdinalsKt'
}

task GetOrPut(type: JavaExec) {
    classpath kotlinClassPath
    main = 'GetOrPutKt'
}

task GetTrace(type: JavaExec) {
    classpath kotlinClassPath
    main = 'checkinstructions.GetTraceKt'
}

task GetValue(type: JavaExec) {
    classpath kotlinClassPath
    main = 'GetValueKt'
}

task GetterAndSetter(type: JavaExec) {
    classpath kotlinClassPath
    main = 'summary2.GetterAndSetterKt'
}

task GreatApe(type: JavaExec) {
    classpath kotlinClassPath
    main = 'inheritance.ape1.GreatApeKt'
}

task GreatApe2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'inheritance.ape2.GreatApe2Kt'
}

task GreatApe3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'baseclassinit.GreatApe3Kt'
}

task GreaterThan2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'importanceoflambdas.GreaterThan2Kt'
}

task GroupBy(type: JavaExec) {
    classpath kotlinClassPath
    main = 'GroupByKt'
}

task GroupByVsFilter(type: JavaExec) {
    classpath kotlinClassPath
    main = 'GroupByVsFilterKt'
}

task GuaranteedCleanup(type: JavaExec) {
    classpath kotlinClassPath
    main = 'exceptionhandling.GuaranteedCleanupKt'
}

task Hamster(type: JavaExec) {
    classpath kotlinClassPath
    main = 'HamsterKt'
}

task Hamsters(type: JavaExec) {
    classpath kotlinClassPath
    main = 'propertyaccessors.HamstersKt'
}

task Handlers(type: JavaExec) {
    classpath kotlinClassPath
    main = 'exceptionhandling.HandlersKt'
}

task HasChar(type: JavaExec) {
    classpath kotlinClassPath
    main = 'HasCharKt'
}

task HashCode(type: JavaExec) {
    classpath kotlinClassPath
    main = 'dataclasses.HashCodeKt'
}

task Hello(type: JavaExec) {
    classpath kotlinClassPath
    main = 'HelloKt'
}

task HelloWorld(type: JavaExec) {
    classpath kotlinClassPath
    main = 'HelloWorldKt'
}

task HiddenArrayList(type: JavaExec) {
    classpath kotlinClassPath
    main = 'HiddenArrayListKt'
}

task Hierarchy(type: JavaExec) {
    classpath kotlinClassPath
    main = 'exceptionhandling.HierarchyKt'
}

task Hotel(type: JavaExec) {
    classpath kotlinClassPath
    main = 'innerclasses.HotelKt'
}

task Hotness(type: JavaExec) {
    classpath kotlinClassPath
    main = 'interfaces.HotnessKt'
}

task House(type: JavaExec) {
    classpath kotlinClassPath
    main = 'baseclassinit.HouseKt'
}

task If1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'If1Kt'
}

task If2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'If2Kt'
}

task If3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'If3Kt'
}

task If4(type: JavaExec) {
    classpath kotlinClassPath
    main = 'If4Kt'
}

task If5(type: JavaExec) {
    classpath kotlinClassPath
    main = 'If5Kt'
}

task If6(type: JavaExec) {
    classpath kotlinClassPath
    main = 'If6Kt'
}

task IfExpression(type: JavaExec) {
    classpath kotlinClassPath
    main = 'IfExpressionKt'
}

task IfResult(type: JavaExec) {
    classpath kotlinClassPath
    main = 'IfResultKt'
}

task Implementations(type: JavaExec) {
    classpath kotlinClassPath
    main = 'abstractclasses.ImplementationsKt'
}

task ImportClass(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ImportClassKt'
}

task ImportEverything(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ImportEverythingKt'
}

task ImportNameChange(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ImportNameChangeKt'
}

task ImportPythagorean(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ImportPythagoreanKt'
}

task Improved(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ImprovedKt'
}

task InBoxAssignment(type: JavaExec) {
    classpath kotlinClassPath
    main = 'variance.InBoxAssignmentKt'
}

task InString(type: JavaExec) {
    classpath kotlinClassPath
    main = 'InStringKt'
}

task IncrementOperator(type: JavaExec) {
    classpath kotlinClassPath
    main = 'IncrementOperatorKt'
}

task IndexIntoString(type: JavaExec) {
    classpath kotlinClassPath
    main = 'IndexIntoStringKt'
}

task InferInt(type: JavaExec) {
    classpath kotlinClassPath
    main = 'InferIntKt'
}

task Inference(type: JavaExec) {
    classpath kotlinClassPath
    main = 'InferenceKt'
}

task InfiniteRecursion(type: JavaExec) {
    classpath kotlinClassPath
    main = 'recursion.InfiniteRecursionKt'
}

task InhExtensionsEx1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'inheritanceAndExtensionsExercise2.InhExtensionsEx1Kt'
}

task InheritAdd(type: JavaExec) {
    classpath kotlinClassPath
    main = 'inheritanceextensions.InheritAddKt'
}

task InitSection(type: JavaExec) {
    classpath kotlinClassPath
    main = 'complexconstructors.InitSectionKt'
}

task Initialization(type: JavaExec) {
    classpath kotlinClassPath
    main = 'companionobjects.InitializationKt'
}

task InnerClassInheritance(type: JavaExec) {
    classpath kotlinClassPath
    main = 'innerclasses.InnerClassInheritanceKt'
}

task InnerEx1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'innerClassesExercise1.InnerEx1Kt'
}

task InnerEx2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'innerClassesExercise2.InnerEx2Kt'
}

task InnerEx3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'innerClassesExercise3.InnerEx3Kt'
}

task Insects(type: JavaExec) {
    classpath kotlinClassPath
    main = 'typechecking.InsectsKt'
}

task IntDivisionTruncates(type: JavaExec) {
    classpath kotlinClassPath
    main = 'IntDivisionTruncatesKt'
}

task IntRanges(type: JavaExec) {
    classpath kotlinClassPath
    main = 'IntRangesKt'
}

task IntegerOverflow(type: JavaExec) {
    classpath kotlinClassPath
    main = 'IntegerOverflowKt'
}

task InterestingSessions(type: JavaExec) {
    classpath kotlinClassPath
    main = 'InterestingSessionsKt'
}

task InterfaceCollision(type: JavaExec) {
    classpath kotlinClassPath
    main = 'collision.InterfaceCollisionKt'
}

task IntroducingCapture(type: JavaExec) {
    classpath kotlinClassPath
    main = 'IntroducingCaptureKt'
}

task IntroducingNull(type: JavaExec) {
    classpath kotlinClassPath
    main = 'IntroducingNullKt'
}

task Invoke(type: JavaExec) {
    classpath kotlinClassPath
    main = 'operatoroverloading.InvokeKt'
}

task InvokeFunctionType(type: JavaExec) {
    classpath kotlinClassPath
    main = 'operatoroverloading.InvokeFunctionTypeKt'
}

task IsInitialized(type: JavaExec) {
    classpath kotlinClassPath
    main = 'lateinitialization.IsInitializedKt'
}

task IsKeyword(type: JavaExec) {
    classpath kotlinClassPath
    main = 'IsKeywordKt'
}

task IsPlus(type: JavaExec) {
    classpath kotlinClassPath
    main = 'higherorderfunctions.IsPlusKt'
}

task IterateOverString(type: JavaExec) {
    classpath kotlinClassPath
    main = 'IterateOverStringKt'
}

task Iteration(type: JavaExec) {
    classpath kotlinClassPath
    main = 'iteration.IterationKt'
}

task IterationVsMembership(type: JavaExec) {
    classpath kotlinClassPath
    main = 'IterationVsMembershipKt'
}

task JavaChecked(type: JavaExec) {
    classpath kotlinClassPath
    main = 'interoperability.JavaChecked'
}

task JavaList(type: JavaExec) {
    classpath kotlinClassPath
    main = 'JavaListKt'
}

task JavaWrapper(type: JavaExec) {
    classpath kotlinClassPath
    main = 'interoperability.JavaWrapper'
}

task JetPack(type: JavaExec) {
    classpath kotlinClassPath
    main = 'summary2.JetPackKt'
}

task JoinToString(type: JavaExec) {
    classpath kotlinClassPath
    main = 'JoinToStringKt'
}

task JulianMonth(type: JavaExec) {
    classpath kotlinClassPath
    main = 'checkinstructions.JulianMonthKt'
}

task KotlinChecked(type: JavaExec) {
    classpath kotlinClassPath
    main = 'KotlinCheckedKt'
}

task KotlinWrapper(type: JavaExec) {
    classpath kotlinClassPath
    main = 'interop.KotlinWrapperKt'
}

task LabeledReturn(type: JavaExec) {
    classpath kotlinClassPath
    main = 'LabeledReturnKt'
}

task LambdaAndNamedArgs(type: JavaExec) {
    classpath kotlinClassPath
    main = 'LambdaAndNamedArgsKt'
}

task LambdaIt(type: JavaExec) {
    classpath kotlinClassPath
    main = 'LambdaItKt'
}

task LambdaTypeInference(type: JavaExec) {
    classpath kotlinClassPath
    main = 'LambdaTypeInferenceKt'
}

task LateInitSoln1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'lateInitializationExercise1.LateInitSoln1Kt'
}

task LateInitSoln2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'lateInitializationExercise2.LateInitSoln2Kt'
}

task LateInitSoln3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'lateInitializationExercise3.LateInitSoln3Kt'
}

task LazyInitSoln1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'lazyInitializationExercise1.LazyInitSoln1Kt'
}

task LazyInitSoln2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'lazyInitializationExercise2.LazyInitSoln2Kt'
}

task LazyInitSoln3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'lazyInitializationExercise3.LazyInitSoln3Kt'
}

task LazyInt(type: JavaExec) {
    classpath kotlinClassPath
    main = 'lazyinitialization.LazyIntKt'
}

task LazySyntax(type: JavaExec) {
    classpath kotlinClassPath
    main = 'lazyinitialization.LazySyntaxKt'
}

task Level(type: JavaExec) {
    classpath kotlinClassPath
    main = 'enumerations.LevelKt'
}

task LibraryException(type: JavaExec) {
    classpath kotlinClassPath
    main = 'exceptionhandling.LibraryExceptionKt'
}

task ListCollection(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ListCollectionKt'
}

task ListIndicesMap(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ListIndicesMapKt'
}

task ListInit(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ListInitKt'
}

task ListOf(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ListOfKt'
}

task ListOfNothing(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ListOfNothingKt'
}

task ListOfStar(type: JavaExec) {
    classpath kotlinClassPath
    main = 'extensionproperties.ListOfStarKt'
}

task ListOfStrings(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ListOfStringsKt'
}

task ListUsefulFunction(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ListUsefulFunctionKt'
}

task Lists(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ListsKt'
}

task ListsAndMaps(type: JavaExec) {
    classpath kotlinClassPath
    main = 'extensionlambdas.ListsAndMapsKt'
}

task LocalExtensions(type: JavaExec) {
    classpath kotlinClassPath
    main = 'LocalExtensionsKt'
}

task LocalFunctionReference(type: JavaExec) {
    classpath kotlinClassPath
    main = 'LocalFunctionReferenceKt'
}

task LocalFunctions(type: JavaExec) {
    classpath kotlinClassPath
    main = 'LocalFunctionsKt'
}

task LocalInnerClasses(type: JavaExec) {
    classpath kotlinClassPath
    main = 'innerclasses.LocalInnerClassesKt'
}

task LogChanges(type: JavaExec) {
    classpath kotlinClassPath
    main = 'propertyaccessors.LogChangesKt'
}

task LoggingSoln1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'loggingExercise1.LoggingSoln1Kt'
}

task LoggingSoln2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'loggingExercise2.LoggingSoln2Kt'
}

task LoggingSoln3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'loggingExercise3.LoggingSoln3Kt'
}

task LongConstants(type: JavaExec) {
    classpath kotlinClassPath
    main = 'LongConstantsKt'
}

task LoopWithIndex(type: JavaExec) {
    classpath kotlinClassPath
    main = 'LoopWithIndexKt'
}

task MainArgConversion(type: JavaExec) {
    classpath kotlinClassPath
    main = 'MainArgConversionKt'
}

task MainArgs(type: JavaExec) {
    classpath kotlinClassPath
    main = 'MainArgsKt'
}

task MakeSalad(type: JavaExec) {
    classpath kotlinClassPath
    main = 'interoperability.MakeSalad'
}

task MapCrate(type: JavaExec) {
    classpath kotlinClassPath
    main = 'creatinggenerics.MapCrateKt'
}

task MapLookup(type: JavaExec) {
    classpath kotlinClassPath
    main = 'scopefunctions.MapLookupKt'
}

task Mapping(type: JavaExec) {
    classpath kotlinClassPath
    main = 'MappingKt'
}

task Maps(type: JavaExec) {
    classpath kotlinClassPath
    main = 'MapsKt'
}

task MatchingAgainstVals(type: JavaExec) {
    classpath kotlinClassPath
    main = 'MatchingAgainstValsKt'
}

task MemberOperator(type: JavaExec) {
    classpath kotlinClassPath
    main = 'operatoroverloading.MemberOperatorKt'
}

task MemberReferencesEx1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'memberReferencesExercise1.MemberReferencesEx1Kt'
}

task MemberVsExtension(type: JavaExec) {
    classpath kotlinClassPath
    main = 'overloading.MemberVsExtensionKt'
}

task Membership(type: JavaExec) {
    classpath kotlinClassPath
    main = 'MembershipKt'
}

task MembershipInRange(type: JavaExec) {
    classpath kotlinClassPath
    main = 'MembershipInRangeKt'
}

task MembershipUsingBounds(type: JavaExec) {
    classpath kotlinClassPath
    main = 'MembershipUsingBoundsKt'
}

task MixColors(type: JavaExec) {
    classpath kotlinClassPath
    main = 'whenexpressions.MixColorsKt'
}

task ModelingMI(type: JavaExec) {
    classpath kotlinClassPath
    main = 'classdelegation.ModelingMIKt'
}

task Modulus(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ModulusKt'
}

task Molecule(type: JavaExec) {
    classpath kotlinClassPath
    main = 'operatoroverloading.MoleculeKt'
}

task MultipleArgs(type: JavaExec) {
    classpath kotlinClassPath
    main = 'MultipleArgsKt'
}

task MultipleListReferences(type: JavaExec) {
    classpath kotlinClassPath
    main = 'MultipleListReferencesKt'
}

task MultipleListRefs(type: JavaExec) {
    classpath kotlinClassPath
    main = 'MultipleListRefsKt'
}

task MultipleRef(type: JavaExec) {
    classpath kotlinClassPath
    main = 'MultipleRefKt'
}

task MultiplyByFour(type: JavaExec) {
    classpath kotlinClassPath
    main = 'MultiplyByFourKt'
}

task MultiplyByThree(type: JavaExec) {
    classpath kotlinClassPath
    main = 'MultiplyByThreeKt'
}

task MultiplyByTwo(type: JavaExec) {
    classpath kotlinClassPath
    main = 'MultiplyByTwoKt'
}

task MutListIsList(type: JavaExec) {
    classpath kotlinClassPath
    main = 'lists.MutListIsListKt'
}

task MutableList(type: JavaExec) {
    classpath kotlinClassPath
    main = 'MutableListKt'
}

task MutableMaps(type: JavaExec) {
    classpath kotlinClassPath
    main = 'MutableMapsKt'
}

task MutableSet(type: JavaExec) {
    classpath kotlinClassPath
    main = 'MutableSetKt'
}

task NPEOnPlatformType(type: JavaExec) {
    classpath kotlinClassPath
    main = 'NPEOnPlatformTypeKt'
}

task NameTag(type: JavaExec) {
    classpath kotlinClassPath
    main = 'scopefunctions.NameTagKt'
}

task NamedArguments(type: JavaExec) {
    classpath kotlinClassPath
    main = 'color1.NamedArgumentsKt'
}

task NamingCompanionObjects(type: JavaExec) {
    classpath kotlinClassPath
    main = 'companionobjects.NamingCompanionObjectsKt'
}

task NarrowingUpcast(type: JavaExec) {
    classpath kotlinClassPath
    main = 'downcasting.NarrowingUpcastKt'
}

task NestedEx1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'nestedClassesExercise1.NestedEx1Kt'
}

task NestedEx2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'nestedClassesExercise2.NestedEx2Kt'
}

task NestedEx3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'nestedClassesExercise3.NestedEx3Kt'
}

task NestedEx4(type: JavaExec) {
    classpath kotlinClassPath
    main = 'nestedClassesExercise4.NestedEx4Kt'
}

task NestedHouse(type: JavaExec) {
    classpath kotlinClassPath
    main = 'nestedclasses.NestedHouseKt'
}

task Nesting(type: JavaExec) {
    classpath kotlinClassPath
    main = 'scopefunctions.NestingKt'
}

task NeverNull(type: JavaExec) {
    classpath kotlinClassPath
    main = 'delegationtools.NeverNullKt'
}

task NewAngle(type: JavaExec) {
    classpath kotlinClassPath
    main = 'NewAngleKt'
}

task NewException(type: JavaExec) {
    classpath kotlinClassPath
    main = 'exceptionhandling.NewExceptionKt'
}

task NoComputationYet(type: JavaExec) {
    classpath kotlinClassPath
    main = 'NoComputationYetKt'
}

task NoExtOverride(type: JavaExec) {
    classpath kotlinClassPath
    main = 'inheritanceextensions.NoExtOverrideKt'
}

task NoFramework(type: JavaExec) {
    classpath kotlinClassPath
    main = 'unittesting.NoFrameworkKt'
}

task NonGenericConstraint(type: JavaExec) {
    classpath kotlinClassPath
    main = 'creatinggenerics.NonGenericConstraintKt'
}

task NonNullAssert(type: JavaExec) {
    classpath kotlinClassPath
    main = 'NonNullAssertKt'
}

task NonNullAssertCall(type: JavaExec) {
    classpath kotlinClassPath
    main = 'NonNullAssertCallKt'
}

task NothingTypeSoln1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'theNothingTypeExercise1.NothingTypeSoln1Kt'
}

task NothingTypeSoln2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'theNothingTypeExercise2.NothingTypeSoln2Kt'
}

task NothingTypeSoln3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'theNothingTypeExercise3.NothingTypeSoln3Kt'
}

task NullGnome(type: JavaExec) {
    classpath kotlinClassPath
    main = 'scopefunctions.NullGnomeKt'
}

task NullInMaps(type: JavaExec) {
    classpath kotlinClassPath
    main = 'NullInMapsKt'
}

task NullableExtension(type: JavaExec) {
    classpath kotlinClassPath
    main = 'nullableextensions.NullableExtensionKt'
}

task NullableFunction(type: JavaExec) {
    classpath kotlinClassPath
    main = 'NullableFunctionKt'
}

task NullableInMap(type: JavaExec) {
    classpath kotlinClassPath
    main = 'NullableInMapKt'
}

task NullableParameter(type: JavaExec) {
    classpath kotlinClassPath
    main = 'nullableextensions.NullableParameterKt'
}

task NullableReturn(type: JavaExec) {
    classpath kotlinClassPath
    main = 'NullableReturnKt'
}

task NullableTypes(type: JavaExec) {
    classpath kotlinClassPath
    main = 'NullableTypesKt'
}

task Num(type: JavaExec) {
    classpath kotlinClassPath
    main = 'operatoroverloading.NumKt'
}

task NumberConversions(type: JavaExec) {
    classpath kotlinClassPath
    main = 'NumberConversionsKt'
}

task NumberSequence2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'NumberSequence2Kt'
}

task NumberTypes(type: JavaExec) {
    classpath kotlinClassPath
    main = 'NumberTypesKt'
}

task ObjectCounter(type: JavaExec) {
    classpath kotlinClassPath
    main = 'companionobjects.ObjectCounterKt'
}

task ObjectEx1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'objectsExercise1.ObjectEx1Kt'
}

task ObjectEx2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'objectsExercise2.ObjectEx2Kt'
}

task ObjectEx3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'objectsExercise3.ObjectEx3Kt'
}

task ObjectFunctions(type: JavaExec) {
    classpath kotlinClassPath
    main = 'companionobjects.ObjectFunctionsKt'
}

task ObjectInheritance(type: JavaExec) {
    classpath kotlinClassPath
    main = 'objects.ObjectInheritanceKt'
}

task ObjectKeyword(type: JavaExec) {
    classpath kotlinClassPath
    main = 'objects.ObjectKeywordKt'
}

task ObjectNesting(type: JavaExec) {
    classpath kotlinClassPath
    main = 'objects.ObjectNestingKt'
}

task ObjectProperty(type: JavaExec) {
    classpath kotlinClassPath
    main = 'companionobjects.ObjectPropertyKt'
}

task ObserveAnimals(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ObserveAnimalsKt'
}

task OmittingParentheses(type: JavaExec) {
    classpath kotlinClassPath
    main = 'OmittingParenthesesKt'
}

task OneOrTheOther(type: JavaExec) {
    classpath kotlinClassPath
    main = 'OneOrTheOtherKt'
}

task OpOrder(type: JavaExec) {
    classpath kotlinClassPath
    main = 'OpOrderKt'
}

task OpOrderParens(type: JavaExec) {
    classpath kotlinClassPath
    main = 'OpOrderParensKt'
}

task OpOverloadingSoln1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'operatorOverloadingExercise1.OpOverloadingSoln1Kt'
}

task OpOverloadingSoln2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'operatorOverloadingExercise2.OpOverloadingSoln2Kt'
}

task OpOverloadingSoln3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'operatorOverloadingExercise3.OpOverloadingSoln3Kt'
}

task Open1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'Open1Kt'
}

task Open2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'Open2Kt'
}

task OperatorPlus(type: JavaExec) {
    classpath kotlinClassPath
    main = 'OperatorPlusKt'
}

task OtherConstructors(type: JavaExec) {
    classpath kotlinClassPath
    main = 'baseclassinit.OtherConstructorsKt'
}

task OutOfBounds(type: JavaExec) {
    classpath kotlinClassPath
    main = 'OutOfBoundsKt'
}

task Overflow(type: JavaExec) {
    classpath kotlinClassPath
    main = 'OverflowKt'
}

task OverloadedVsDefaultArg(type: JavaExec) {
    classpath kotlinClassPath
    main = 'overloadingvsdefaultargs.OverloadedVsDefaultArgKt'
}

task Overloading(type: JavaExec) {
    classpath kotlinClassPath
    main = 'overloading.OverloadingKt'
}

task OverloadingAdd(type: JavaExec) {
    classpath kotlinClassPath
    main = 'overloading.OverloadingAddKt'
}

task PairDestructuring(type: JavaExec) {
    classpath kotlinClassPath
    main = 'PairDestructuringKt'
}

task PairOfLists(type: JavaExec) {
    classpath kotlinClassPath
    main = 'operationsoncollections.PairOfListsKt'
}

task Pairs(type: JavaExec) {
    classpath kotlinClassPath
    main = 'destructuring.PairsKt'
}

task ParameterizedReturn(type: JavaExec) {
    classpath kotlinClassPath
    main = 'lists.ParameterizedReturnKt'
}

task ParameterizedTypes(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ParameterizedTypesKt'
}

task Parameters(type: JavaExec) {
    classpath kotlinClassPath
    main = 'extensionlambdas.ParametersKt'
}

task Partition(type: JavaExec) {
    classpath kotlinClassPath
    main = 'PartitionKt'
}

task Pet(type: JavaExec) {
    classpath kotlinClassPath
    main = 'polymorphism.PetKt'
}

task PlatformTypes(type: JavaExec) {
    classpath kotlinClassPath
    main = 'interop.PlatformTypesKt'
}

task PlayerInterface(type: JavaExec) {
    classpath kotlinClassPath
    main = 'interfaces.PlayerInterfaceKt'
}

task PlayingCards(type: JavaExec) {
    classpath kotlinClassPath
    main = 'manipulatinglists.PlayingCardsKt'
}

task Postconditions(type: JavaExec) {
    classpath kotlinClassPath
    main = 'checkinstructions.PostconditionsKt'
}

task PostfixVsPrefix(type: JavaExec) {
    classpath kotlinClassPath
    main = 'PostfixVsPrefixKt'
}

task Predicates(type: JavaExec) {
    classpath kotlinClassPath
    main = 'PredicatesKt'
}

task PropDelegationSoln1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'propertyDelegationToolsExercise1.PropDelegationSoln1Kt'
}

task PropDelegationSoln2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'propertyDelegationExercise1.PropDelegationSoln2Kt'
}

task PropDelegationSoln3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'propertyDelegationExercise2.PropDelegationSoln3Kt'
}

task PropDelegationSoln4(type: JavaExec) {
    classpath kotlinClassPath
    main = 'propertyDelegationExercise3.PropDelegationSoln4Kt'
}

task PropertyAccessor(type: JavaExec) {
    classpath kotlinClassPath
    main = 'abstractclasses.PropertyAccessorKt'
}

task PropertyOptions(type: JavaExec) {
    classpath kotlinClassPath
    main = 'lazyinitialization.PropertyOptionsKt'
}

task PropertyReadWrite(type: JavaExec) {
    classpath kotlinClassPath
    main = 'summary2.PropertyReadWriteKt'
}

task PropertyReference(type: JavaExec) {
    classpath kotlinClassPath
    main = 'memberreferences1.PropertyReferenceKt'
}

task Quadratic(type: JavaExec) {
    classpath kotlinClassPath
    main = 'summary2.QuadraticKt'
}

task QuadraticRequire(type: JavaExec) {
    classpath kotlinClassPath
    main = 'checkinstructions.QuadraticRequireKt'
}

task QualifiedThis(type: JavaExec) {
    classpath kotlinClassPath
    main = 'innerclasses.QualifiedThisKt'
}

task Quote(type: JavaExec) {
    classpath kotlinClassPath
    main = 'other.QuoteKt'
}

task Quoting(type: JavaExec) {
    classpath kotlinClassPath
    main = 'extensionfunctions.QuotingKt'
}

task Random(type: JavaExec) {
    classpath kotlinClassPath
    main = 'RandomKt'
}

task RangeOfInt(type: JavaExec) {
    classpath kotlinClassPath
    main = 'RangeOfIntKt'
}

task RangeSum(type: JavaExec) {
    classpath kotlinClassPath
    main = 'RangeSumKt'
}

task Ranges(type: JavaExec) {
    classpath kotlinClassPath
    main = 'operatoroverloading.RangesKt'
}

task ReadOnlyAndPlus(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ReadOnlyAndPlusKt'
}

task ReadOnlyCollections(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ReadOnlyCollectionsKt'
}

task ReadOnlyMaps(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ReadOnlyMapsKt'
}

task ReadonlyVsMutableList(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ReadonlyVsMutableListKt'
}

task RecursionLimits(type: JavaExec) {
    classpath kotlinClassPath
    main = 'recursion.RecursionLimitsKt'
}

task RecursiveEnumImport(type: JavaExec) {
    classpath kotlinClassPath
    main = 'enumerations.RecursiveEnumImportKt'
}

task ReduceAndReduceRight(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ReduceAndReduceRightKt'
}

task References(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ReferencesKt'
}

task RemoveDuplicates(type: JavaExec) {
    classpath kotlinClassPath
    main = 'RemoveDuplicatesKt'
}

task Repeat(type: JavaExec) {
    classpath kotlinClassPath
    main = 'higherorderfunctions.RepeatKt'
}

task RepeatByInt(type: JavaExec) {
    classpath kotlinClassPath
    main = 'RepeatByIntKt'
}

task RepeatHi(type: JavaExec) {
    classpath kotlinClassPath
    main = 'RepeatHiKt'
}

task RepeatThreeTimes(type: JavaExec) {
    classpath kotlinClassPath
    main = 'RepeatThreeTimesKt'
}

task RequireNotNull(type: JavaExec) {
    classpath kotlinClassPath
    main = 'checkinstructions.RequireNotNullKt'
}

task ResourceCleanupSoln1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'resourceCleanupExercise1.ResourceCleanupSoln1Kt'
}

task ResourceCleanupSoln2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'resourceCleanupExercise2.ResourceCleanupSoln2Kt'
}

task ResourceCleanupSoln3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'resourceCleanupExercise3.ResourceCleanupSoln3Kt'
}

task ReturnFromFun(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ReturnFromFunKt'
}

task ReturnInsideLambda(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ReturnInsideLambdaKt'
}

task ReturnLocal(type: JavaExec) {
    classpath kotlinClassPath
    main = 'nestedclasses.ReturnLocalKt'
}

task ReturningFunc(type: JavaExec) {
    classpath kotlinClassPath
    main = 'localfunctions.ReturningFuncKt'
}

task RigidHolder(type: JavaExec) {
    classpath kotlinClassPath
    main = 'introgenerics.RigidHolderKt'
}

task RunningFold(type: JavaExec) {
    classpath kotlinClassPath
    main = 'RunningFoldKt'
}

task SAMConversion(type: JavaExec) {
    classpath kotlinClassPath
    main = 'interfaces.SAMConversionKt'
}

task SAMImplementation(type: JavaExec) {
    classpath kotlinClassPath
    main = 'interfaces.SAMImplementationKt'
}

task Safe(type: JavaExec) {
    classpath kotlinClassPath
    main = 'downcasting.SafeKt'
}

task SafeCall(type: JavaExec) {
    classpath kotlinClassPath
    main = 'safecalls.SafeCallKt'
}

task SafeOperation(type: JavaExec) {
    classpath kotlinClassPath
    main = 'safecalls.SafeOperationKt'
}

task Sandwich(type: JavaExec) {
    classpath kotlinClassPath
    main = 'sandwich.SandwichKt'
}

task SayHello(type: JavaExec) {
    classpath kotlinClassPath
    main = 'SayHelloKt'
}

task Scientist(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ScientistKt'
}

task SealedClasses(type: JavaExec) {
    classpath kotlinClassPath
    main = 'sealedclasses.SealedClassesKt'
}

task SealedEx1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'sealedClassesExercise1.SealedEx1Kt'
}

task SealedEx2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'sealedClassesExercise2.SealedEx2Kt'
}

task SealedEx3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'sealedClassesExercise3.SealedEx3Kt'
}

task SealedSubclasses(type: JavaExec) {
    classpath kotlinClassPath
    main = 'sealedclasses.SealedSubclassesKt'
}

task SealedVsAbstract(type: JavaExec) {
    classpath kotlinClassPath
    main = 'sealedclasses.SealedVsAbstractKt'
}

task Select(type: JavaExec) {
    classpath kotlinClassPath
    main = 'creatinggenerics.SelectKt'
}

task SetOperations(type: JavaExec) {
    classpath kotlinClassPath
    main = 'SetOperationsKt'
}

task Sets(type: JavaExec) {
    classpath kotlinClassPath
    main = 'SetsKt'
}

task Share2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'objectshare2.Share2Kt'
}

task SimilarOperation(type: JavaExec) {
    classpath kotlinClassPath
    main = 'SimilarOperationKt'
}

task Simple(type: JavaExec) {
    classpath kotlinClassPath
    main = 'dataclasses.SimpleKt'
}

task SimpleConstructor(type: JavaExec) {
    classpath kotlinClassPath
    main = 'complexconstructors.SimpleConstructorKt'
}

task SimpleLoggingStrategy(type: JavaExec) {
    classpath kotlinClassPath
    main = 'logging.SimpleLoggingStrategyKt'
}

task SingleArgRequire(type: JavaExec) {
    classpath kotlinClassPath
    main = 'checkinstructions.SingleArgRequireKt'
}

task SortWith(type: JavaExec) {
    classpath kotlinClassPath
    main = 'SortWithKt'
}

task Speakers(type: JavaExec) {
    classpath kotlinClassPath
    main = 'creatinggenerics.SpeakersKt'
}

task SpreadOperator(type: JavaExec) {
    classpath kotlinClassPath
    main = 'SpreadOperatorKt'
}

task Stacktrace(type: JavaExec) {
    classpath kotlinClassPath
    main = 'stacktrace.StacktraceKt'
}

task StateOfAClass(type: JavaExec) {
    classpath kotlinClassPath
    main = 'abstractstate.StateOfAClassKt'
}

task StoringLambda(type: JavaExec) {
    classpath kotlinClassPath
    main = 'StoringLambdaKt'
}

task StrTemplates(type: JavaExec) {
    classpath kotlinClassPath
    main = 'StrTemplatesKt'
}

task StrangeQuote(type: JavaExec) {
    classpath kotlinClassPath
    main = 'extensionfunctions.StrangeQuoteKt'
}

task StringConcatenation(type: JavaExec) {
    classpath kotlinClassPath
    main = 'StringConcatenationKt'
}

task StringCreation(type: JavaExec) {
    classpath kotlinClassPath
    main = 'extensionlambdas.StringCreationKt'
}

task StringIndices(type: JavaExec) {
    classpath kotlinClassPath
    main = 'extensionproperties.StringIndicesKt'
}

task StringInvoke(type: JavaExec) {
    classpath kotlinClassPath
    main = 'operatoroverloading.StringInvokeKt'
}

task StringIsNullOr(type: JavaExec) {
    classpath kotlinClassPath
    main = 'StringIsNullOrKt'
}

task StringIteration(type: JavaExec) {
    classpath kotlinClassPath
    main = 'StringIterationKt'
}

task StringPlusNumber(type: JavaExec) {
    classpath kotlinClassPath
    main = 'StringPlusNumberKt'
}

task StringRange(type: JavaExec) {
    classpath kotlinClassPath
    main = 'StringRangeKt'
}

task StringTemplates(type: JavaExec) {
    classpath kotlinClassPath
    main = 'StringTemplatesKt'
}

task Strings(type: JavaExec) {
    classpath kotlinClassPath
    main = 'StringsKt'
}

task Suitcase(type: JavaExec) {
    classpath kotlinClassPath
    main = 'lateinitialization.SuitcaseKt'
}

task Sum(type: JavaExec) {
    classpath kotlinClassPath
    main = 'SumKt'
}

task SumUsingRange(type: JavaExec) {
    classpath kotlinClassPath
    main = 'SumUsingRangeKt'
}

task SumViaFold(type: JavaExec) {
    classpath kotlinClassPath
    main = 'SumViaFoldKt'
}

task Swearing(type: JavaExec) {
    classpath kotlinClassPath
    main = 'operatoroverloading.SwearingKt'
}

task TDDFail(type: JavaExec) {
    classpath kotlinClassPath
    main = 'testing1.TDDFailKt'
}

task TDDStillFails(type: JavaExec) {
    classpath kotlinClassPath
    main = 'testing2.TDDStillFailsKt'
}

task TDDWorks(type: JavaExec) {
    classpath kotlinClassPath
    main = 'testing3.TDDWorksKt'
}

task TailRecursiveSum(type: JavaExec) {
    classpath kotlinClassPath
    main = 'tailrecursion.TailRecursiveSumKt'
}

task TakeOrDrop(type: JavaExec) {
    classpath kotlinClassPath
    main = 'TakeOrDropKt'
}

task Task1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'whenExpressionsExercise1.Task1Kt'
}

task Task10(type: JavaExec) {
    classpath kotlinClassPath
    main = 'summaryIExercise10.Task10Kt'
}

task Task2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'whenExpressionsExercise2.Task2Kt'
}

task Task3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'whenExpressionsExercise3.Task3Kt'
}

task Task4(type: JavaExec) {
    classpath kotlinClassPath
    main = 'whenExpressionsExercise4.Task4Kt'
}

task Task5(type: JavaExec) {
    classpath kotlinClassPath
    main = 'constrainingVisibilityExercise5.Task5Kt'
}

task Task6(type: JavaExec) {
    classpath kotlinClassPath
    main = 'summaryIIExercise6.Task6Kt'
}

task Task7(type: JavaExec) {
    classpath kotlinClassPath
    main = 'summaryIIExercise7.Task7Kt'
}

task Task8(type: JavaExec) {
    classpath kotlinClassPath
    main = 'summaryIIExercise8.Task8Kt'
}

task Task9(type: JavaExec) {
    classpath kotlinClassPath
    main = 'summaryIExercise9.Task9Kt'
}

task Team(type: JavaExec) {
    classpath kotlinClassPath
    main = 'delegationtools.TeamKt'
}

task TeamWithTraditions(type: JavaExec) {
    classpath kotlinClassPath
    main = 'delegationtools.TeamWithTraditionsKt'
}

task Temperature(type: JavaExec) {
    classpath kotlinClassPath
    main = 'summary2.TemperatureKt'
}

task TemperatureDelta(type: JavaExec) {
    classpath kotlinClassPath
    main = 'inheritanceextensions.TemperatureDeltaKt'
}

task TerminalOperations(type: JavaExec) {
    classpath kotlinClassPath
    main = 'TerminalOperationsKt'
}

task TestingExample(type: JavaExec) {
    classpath kotlinClassPath
    main = 'TestingExampleKt'
}

task ThreeQuotes(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ThreeQuotesKt'
}

task TicTacToe(type: JavaExec) {
    classpath kotlinClassPath
    main = 'summary2.TicTacToeKt'
}

task Ticket(type: JavaExec) {
    classpath kotlinClassPath
    main = 'nestedclasses.TicketKt'
}

task ToDoubleException(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ToDoubleExceptionKt'
}

task ToIntException(type: JavaExec) {
    classpath kotlinClassPath
    main = 'exceptions.ToIntExceptionKt'
}

task Todo(type: JavaExec) {
    classpath kotlinClassPath
    main = 'nothingtype.TodoKt'
}

task TopLevelFunctionRef(type: JavaExec) {
    classpath kotlinClassPath
    main = 'memberreferences2.TopLevelFunctionRefKt'
}

task Trace1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'Trace1Kt'
}

task Transform(type: JavaExec) {
    classpath kotlinClassPath
    main = 'extensionlambdas.TransformKt'
}

task TransformingMap(type: JavaExec) {
    classpath kotlinClassPath
    main = 'TransformingMapKt'
}

task TrimMargin(type: JavaExec) {
    classpath kotlinClassPath
    main = 'TrimMarginKt'
}

task TrimmedMembers(type: JavaExec) {
    classpath kotlinClassPath
    main = 'upcasting.TrimmedMembersKt'
}

task TripleQuotes(type: JavaExec) {
    classpath kotlinClassPath
    main = 'TripleQuotesKt'
}

task TrueOrFalse(type: JavaExec) {
    classpath kotlinClassPath
    main = 'TrueOrFalseKt'
}

task Truncation(type: JavaExec) {
    classpath kotlinClassPath
    main = 'TruncationKt'
}

task TryFinally(type: JavaExec) {
    classpath kotlinClassPath
    main = 'exceptionhandling.TryFinallyKt'
}

task Tuple(type: JavaExec) {
    classpath kotlinClassPath
    main = 'destructuring.TupleKt'
}

task TwoArgLambda(type: JavaExec) {
    classpath kotlinClassPath
    main = 'TwoArgLambdaKt'
}

task TwoFunctionsWithVarargs(type: JavaExec) {
    classpath kotlinClassPath
    main = 'varargs.TwoFunctionsWithVarargsKt'
}

task TypeCheck1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'typechecking.TypeCheck1Kt'
}

task TypeCheck2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'typechecking.TypeCheck2Kt'
}

task TypeCheck3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'typechecking3.TypeCheck3Kt'
}

task TypeCheckingSoln1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'typeCheckingExercise1.TypeCheckingSoln1Kt'
}

task TypeCheckingSoln2a(type: JavaExec) {
    classpath kotlinClassPath
    main = 'typeCheckingExercise2a.TypeCheckingSoln2aKt'
}

task TypeCheckingSoln2b(type: JavaExec) {
    classpath kotlinClassPath
    main = 'typeCheckingExercise2b.TypeCheckingSoln2bKt'
}

task TypeCheckingSoln3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'typeCheckingExercise3.TypeCheckingSoln3Kt'
}

task Types(type: JavaExec) {
    classpath kotlinClassPath
    main = 'TypesKt'
}

task UnSealed(type: JavaExec) {
    classpath kotlinClassPath
    main = 'withoutsealedclasses.UnSealedKt'
}

task Underscore(type: JavaExec) {
    classpath kotlinClassPath
    main = 'UnderscoreKt'
}

task Unexpected(type: JavaExec) {
    classpath kotlinClassPath
    main = 'UnexpectedKt'
}

task UnitReturn(type: JavaExec) {
    classpath kotlinClassPath
    main = 'UnitReturnKt'
}

task UnitReturnType(type: JavaExec) {
    classpath kotlinClassPath
    main = 'UnitReturnTypeKt'
}

task Unsafe(type: JavaExec) {
    classpath kotlinClassPath
    main = 'downcasting.UnsafeKt'
}

task UpcastExercise1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'upcastingExercise1.UpcastExercise1Kt'
}

task Usable(type: JavaExec) {
    classpath kotlinClassPath
    main = 'resourcecleanup.UsableKt'
}

task UseALibrary(type: JavaExec) {
    classpath kotlinClassPath
    main = 'UseALibraryKt'
}

task UseAtomicLog(type: JavaExec) {
    classpath kotlinClassPath
    main = 'useatomiclog.UseAtomicLogKt'
}

task UseBeanClass(type: JavaExec) {
    classpath kotlinClassPath
    main = 'UseBeanClassKt'
}

task UseDataClass(type: JavaExec) {
    classpath kotlinClassPath
    main = 'interoperability.UseDataClass'
}

task UseLines(type: JavaExec) {
    classpath kotlinClassPath
    main = 'UseLinesKt'
}

task UsingAtomicTest(type: JavaExec) {
    classpath kotlinClassPath
    main = 'UsingAtomicTestKt'
}

task UsingExpect(type: JavaExec) {
    classpath kotlinClassPath
    main = 'unittesting.UsingExpectKt'
}

task UsingKotlinClass(type: JavaExec) {
    classpath kotlinClassPath
    main = 'interoperability.UsingKotlinClass'
}

task UsingLongs(type: JavaExec) {
    classpath kotlinClassPath
    main = 'UsingLongsKt'
}

task UsingOperatorsSoln1(type: JavaExec) {
    classpath kotlinClassPath
    main = 'usingOperatorsExercise1.UsingOperatorsSoln1Kt'
}

task UsingOperatorsSoln2(type: JavaExec) {
    classpath kotlinClassPath
    main = 'usingOperatorsExercise2.UsingOperatorsSoln2Kt'
}

task UsingOperatorsSoln3(type: JavaExec) {
    classpath kotlinClassPath
    main = 'usingOperatorsExercise3.UsingOperatorsSoln3Kt'
}

task UsingTrace(type: JavaExec) {
    classpath kotlinClassPath
    main = 'UsingTraceKt'
}

task Vals(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ValsKt'
}

task ValueFromMap(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ValueFromMapKt'
}

task Vanbo(type: JavaExec) {
    classpath kotlinClassPath
    main = 'extensionlambdas.VanboKt'
}

task VarArgs(type: JavaExec) {
    classpath kotlinClassPath
    main = 'summary2.VarArgsKt'
}

task VarargLikeList(type: JavaExec) {
    classpath kotlinClassPath
    main = 'varargs.VarargLikeListKt'
}

task VarargSum(type: JavaExec) {
    classpath kotlinClassPath
    main = 'varargs.VarargSumKt'
}

task VariableArgList(type: JavaExec) {
    classpath kotlinClassPath
    main = 'varargs.VariableArgListKt'
}

task Vars(type: JavaExec) {
    classpath kotlinClassPath
    main = 'VarsKt'
}

task VerySlowFibonacci(type: JavaExec) {
    classpath kotlinClassPath
    main = 'slowfibonacci.VerySlowFibonacciKt'
}

task VisibleArgs(type: JavaExec) {
    classpath kotlinClassPath
    main = 'VisibleArgsKt'
}

task While(type: JavaExec) {
    classpath kotlinClassPath
    main = 'WhileKt'
}

task WhileControl(type: JavaExec) {
    classpath kotlinClassPath
    main = 'WhileControlKt'
}

task WhileLabeled(type: JavaExec) {
    classpath kotlinClassPath
    main = 'WhileLabeledKt'
}

task WhileLoop(type: JavaExec) {
    classpath kotlinClassPath
    main = 'WhileLoopKt'
}

task WhyFlatMap(type: JavaExec) {
    classpath kotlinClassPath
    main = 'manipulatinglists.WhyFlatMapKt'
}

task WildAnimals(type: JavaExec) {
    classpath kotlinClassPath
    main = 'summary2.WildAnimalsKt'
}

task WithDefaultArguments(type: JavaExec) {
    classpath kotlinClassPath
    main = 'withdefaultarguments.WithDefaultArgumentsKt'
}

task WithSecondary(type: JavaExec) {
    classpath kotlinClassPath
    main = 'secondaryconstructors.WithSecondaryKt'
}

task WithinInterface(type: JavaExec) {
    classpath kotlinClassPath
    main = 'nestedclasses.WithinInterfaceKt'
}

task WithoutDefaultArguments(type: JavaExec) {
    classpath kotlinClassPath
    main = 'withoutdefaultarguments.WithoutDefaultArgumentsKt'
}

task Wombat(type: JavaExec) {
    classpath kotlinClassPath
    main = 'WombatKt'
}

task ZeroArguments(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ZeroArgumentsKt'
}

task ZipAndTransform(type: JavaExec) {
    classpath kotlinClassPath
    main = 'manipulatinglists.ZipAndTransformKt'
}

task Zipper(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ZipperKt'
}

task ZippingWithNext(type: JavaExec) {
    classpath kotlinClassPath
    main = 'ZippingWithNextKt'
}

task run (dependsOn: [
    'ASCIIMap',
    'AVarIsMutable',
    'Accessibility',
    'Adapter',
    'Add',
    'AddingIntToChar',
    'Airport',
    'Amphibian',
    'AnUnchangingVar',
    'AnalyzeInput',
    'AndNullability',
    'Animals',
    'AnnotatedJava',
    'AnonymousFunction',
    'Any',
    'AnyFromListOfStar',
    'AnyInstead',
    'Arg',
    'ArgumentOrder',
    'ArithmeticOperators',
    'ArraySpread',
    'AssigningAnIf',
    'Assignment',
    'AssignmentOperators',
    'AssociateBy',
    'AssociateByUnique',
    'AssociateWith',
    'AtomicTestCapture',
    'AutoCloseable',
    'AverageIncome',
    'AverageIncomeWithException',
    'AverageIncomeWithNull',
    'BMIEnglish',
    'BMIMetric',
    'Backticks',
    'BasicFunctions',
    'BasicLambda',
    'BasicLogging',
    'BasicRead',
    'BasicRead2',
    'BasicReadWrite',
    'BasicReadWrite2',
    'BetterSuitcase',
    'BeverageContainer',
    'BeverageContainer2',
    'BeverageContainer3',
    'BigFibonacci',
    'BiggestLong',
    'Blob',
    'BmiWhen',
    'BookExtensions',
    'Booleans',
    'Boxes',
    'ByOperations',
    'CallStack',
    'CallTopLevelFunction',
    'CallTopLevelFunction2',
    'CallingReference',
    'CaptureImplementation',
    'Car',
    'CarCrate',
    'CarService',
    'Cat',
    'CatchChecked',
    'ChainedCalls',
    'ChangingAVal',
    'CharRange',
    'CheckInstructionsSoln1',
    'CheckInstructionsSoln2',
    'CheckInstructionsSoln3',
    'CheckInstructionsSoln4',
    'CheckObject',
    'CheckObject2',
    'CheckType',
    'CheckingOptions',
    'ClassBodies',
    'Closed',
    'Closures',
    'Closures2',
    'Color2',
    'Color3',
    'ColorSet',
    'CompanionDelegation',
    'CompanionEx1',
    'CompanionEx2',
    'CompanionEx3',
    'CompanionFactory',
    'CompanionInstance',
    'CompanionObject',
    'ComparableRange',
    'CompareTo',
    'Comparison',
    'ComposeAdapter',
    'Computation',
    'Computer',
    'Configuration',
    'Confusing',
    'ConfusingPrecedence',
    'Constrained',
    'ConstructorReference',
    'ContactMap',
    'ContainerAccess',
    'Convention',
    'Conversion',
    'Cookie',
    'CopyDataClass',
    'Counter',
    'CounterFactory',
    'CovariantList',
    'Crate',
    'CreateString',
    'CreateString2',
    'CreatingGenericsSoln1',
    'CreatingGenericsSoln2',
    'CreatingGenericsSoln3',
    'CreatingLists',
    'Creature',
    'Cup',
    'Cup2',
    'CustomLabel',
    'Data',
    'DataClasses',
    'DataFile',
    'Default',
    'DefaultEquality',
    'DefineTakeIf',
    'DefiningEquality',
    'DefiningExceptions',
    'DefiningRanges',
    'DelegToolsSoln1',
    'DelegToolsSoln2',
    'DelegToolsSoln3',
    'DelegateAndExtend',
    'DelegatedControls',
    'Dereference',
    'DereferenceNull',
    'DestructuringData',
    'DestructuringDuo',
    'DestructuringMap',
    'DeviceExtensions',
    'DeviceMembers',
    'Differences',
    'DifferentTypes',
    'Direction',
    'DisplayAlienSpecies',
    'DoWhile',
    'DoWhileControl',
    'DoWhileLoop',
    'Dog',
    'DownCastEx1',
    'DownCastEx2',
    'DownCastEx3',
    'Drawing',
    'EagerEvaluation',
    'EagerVsLazyEvaluation',
    'ElvisCall',
    'ElvisOperator',
    'EmptyProgram',
    'EnumImport',
    'EqualsForNullable',
    'Erasure',
    'Evaluation',
    'EvaluationOrder',
    'Exercise1',
    'Exercise2',
    'Exercise3',
    'ExplicitCheck',
    'ExplicitDelegation',
    'ExplicitTyping',
    'ExpressionInTemplate',
    'ExtensionFuncs',
    'ExtensionLambdasSoln1',
    'ExtensionLambdasSoln2',
    'ExtensionLambdasSoln3',
    'ExtensionPolymorphism',
    'ExtensionReference',
    'ExtensionsToJavaClass',
    'Factorial',
    'Fail',
    'FantasyGame',
    'FaultySuitcase',
    'Fibonacci',
    'FibonacciProperty',
    'FillIt',
    'Filter',
    'FilterEven',
    'FilterIsInstance',
    'FilterMap',
    'FilterNotNull',
    'FindType',
    'Flatten',
    'FlattenAndFlatMap',
    'FloatingPointRange',
    'FoldRight',
    'FoldVsForLoop',
    'ForControl',
    'ForEachLine',
    'ForIsAStatement',
    'ForLabeled',
    'ForLoop',
    'ForWithCharRange',
    'ForWithRanges',
    'FullyQualify',
    'FuncReferences',
    'FunctionClosure',
    'FunctionReference',
    'GardenItem',
    'GenerateSequence1',
    'GenerateSequence2',
    'GenericFunction',
    'GenericHolder',
    'GenericListExt',
    'GenericListExtensions',
    'GermanOrdinals',
    'GetOrPut',
    'GetTrace',
    'GetValue',
    'GetterAndSetter',
    'GreatApe',
    'GreatApe2',
    'GreatApe3',
    'GreaterThan2',
    'GroupBy',
    'GroupByVsFilter',
    'GuaranteedCleanup',
    'Hamster',
    'Hamsters',
    'Handlers',
    'HasChar',
    'HashCode',
    'Hello',
    'HelloWorld',
    'HiddenArrayList',
    'Hierarchy',
    'Hotel',
    'Hotness',
    'House',
    'If1',
    'If2',
    'If3',
    'If4',
    'If5',
    'If6',
    'IfExpression',
    'IfResult',
    'Implementations',
    'ImportClass',
    'ImportEverything',
    'ImportNameChange',
    'ImportPythagorean',
    'Improved',
    'InBoxAssignment',
    'InString',
    'IncrementOperator',
    'IndexIntoString',
    'InferInt',
    'Inference',
    'InfiniteRecursion',
    'InhExtensionsEx1',
    'InheritAdd',
    'InitSection',
    'Initialization',
    'InnerClassInheritance',
    'InnerEx1',
    'InnerEx2',
    'InnerEx3',
    'Insects',
    'IntDivisionTruncates',
    'IntRanges',
    'IntegerOverflow',
    'InterestingSessions',
    'InterfaceCollision',
    'IntroducingCapture',
    'IntroducingNull',
    'Invoke',
    'InvokeFunctionType',
    'IsInitialized',
    'IsKeyword',
    'IsPlus',
    'IterateOverString',
    'Iteration',
    'IterationVsMembership',
    'JavaChecked',
    'JavaList',
    'JavaWrapper',
    'JetPack',
    'JoinToString',
    'JulianMonth',
    'KotlinChecked',
    'KotlinWrapper',
    'LabeledReturn',
    'LambdaAndNamedArgs',
    'LambdaIt',
    'LambdaTypeInference',
    'LateInitSoln1',
    'LateInitSoln2',
    'LateInitSoln3',
    'LazyInitSoln1',
    'LazyInitSoln2',
    'LazyInitSoln3',
    'LazyInt',
    'LazySyntax',
    'Level',
    'LibraryException',
    'ListCollection',
    'ListIndicesMap',
    'ListInit',
    'ListOf',
    'ListOfNothing',
    'ListOfStar',
    'ListOfStrings',
    'ListUsefulFunction',
    'Lists',
    'ListsAndMaps',
    'LocalExtensions',
    'LocalFunctionReference',
    'LocalFunctions',
    'LocalInnerClasses',
    'LogChanges',
    'LoggingSoln1',
    'LoggingSoln2',
    'LoggingSoln3',
    'LongConstants',
    'LoopWithIndex',
    'MainArgConversion',
    'MainArgs',
    'MakeSalad',
    'MapCrate',
    'MapLookup',
    'Mapping',
    'Maps',
    'MatchingAgainstVals',
    'MemberOperator',
    'MemberReferencesEx1',
    'MemberVsExtension',
    'Membership',
    'MembershipInRange',
    'MembershipUsingBounds',
    'MixColors',
    'ModelingMI',
    'Modulus',
    'Molecule',
    'MultipleArgs',
    'MultipleListReferences',
    'MultipleListRefs',
    'MultipleRef',
    'MultiplyByFour',
    'MultiplyByThree',
    'MultiplyByTwo',
    'MutListIsList',
    'MutableList',
    'MutableMaps',
    'MutableSet',
    'NPEOnPlatformType',
    'NameTag',
    'NamedArguments',
    'NamingCompanionObjects',
    'NarrowingUpcast',
    'NestedEx1',
    'NestedEx2',
    'NestedEx3',
    'NestedEx4',
    'NestedHouse',
    'Nesting',
    'NeverNull',
    'NewAngle',
    'NewException',
    'NoComputationYet',
    'NoExtOverride',
    'NoFramework',
    'NonGenericConstraint',
    'NonNullAssert',
    'NonNullAssertCall',
    'NothingTypeSoln1',
    'NothingTypeSoln2',
    'NothingTypeSoln3',
    'NullGnome',
    'NullInMaps',
    'NullableExtension',
    'NullableFunction',
    'NullableInMap',
    'NullableParameter',
    'NullableReturn',
    'NullableTypes',
    'Num',
    'NumberConversions',
    'NumberSequence2',
    'NumberTypes',
    'ObjectCounter',
    'ObjectEx1',
    'ObjectEx2',
    'ObjectEx3',
    'ObjectFunctions',
    'ObjectInheritance',
    'ObjectKeyword',
    'ObjectNesting',
    'ObjectProperty',
    'ObserveAnimals',
    'OmittingParentheses',
    'OneOrTheOther',
    'OpOrder',
    'OpOrderParens',
    'OpOverloadingSoln1',
    'OpOverloadingSoln2',
    'OpOverloadingSoln3',
    'Open1',
    'Open2',
    'OperatorPlus',
    'OtherConstructors',
    'OutOfBounds',
    'Overflow',
    'OverloadedVsDefaultArg',
    'Overloading',
    'OverloadingAdd',
    'PairDestructuring',
    'PairOfLists',
    'Pairs',
    'ParameterizedReturn',
    'ParameterizedTypes',
    'Parameters',
    'Partition',
    'Pet',
    'PlatformTypes',
    'PlayerInterface',
    'PlayingCards',
    'Postconditions',
    'PostfixVsPrefix',
    'Predicates',
    'PropDelegationSoln1',
    'PropDelegationSoln2',
    'PropDelegationSoln3',
    'PropDelegationSoln4',
    'PropertyAccessor',
    'PropertyOptions',
    'PropertyReadWrite',
    'PropertyReference',
    'Quadratic',
    'QuadraticRequire',
    'QualifiedThis',
    'Quote',
    'Quoting',
    'Random',
    'RangeOfInt',
    'RangeSum',
    'Ranges',
    'ReadOnlyAndPlus',
    'ReadOnlyCollections',
    'ReadOnlyMaps',
    'ReadonlyVsMutableList',
    'RecursionLimits',
    'RecursiveEnumImport',
    'ReduceAndReduceRight',
    'References',
    'RemoveDuplicates',
    'Repeat',
    'RepeatByInt',
    'RepeatHi',
    'RepeatThreeTimes',
    'RequireNotNull',
    'ResourceCleanupSoln1',
    'ResourceCleanupSoln2',
    'ResourceCleanupSoln3',
    'ReturnFromFun',
    'ReturnInsideLambda',
    'ReturnLocal',
    'ReturningFunc',
    'RigidHolder',
    'RunningFold',
    'SAMConversion',
    'SAMImplementation',
    'Safe',
    'SafeCall',
    'SafeOperation',
    'Sandwich',
    'SayHello',
    'Scientist',
    'SealedClasses',
    'SealedEx1',
    'SealedEx2',
    'SealedEx3',
    'SealedSubclasses',
    'SealedVsAbstract',
    'Select',
    'SetOperations',
    'Sets',
    'Share2',
    'SimilarOperation',
    'Simple',
    'SimpleConstructor',
    'SimpleLoggingStrategy',
    'SingleArgRequire',
    'SortWith',
    'Speakers',
    'SpreadOperator',
    'Stacktrace',
    'StateOfAClass',
    'StoringLambda',
    'StrTemplates',
    'StrangeQuote',
    'StringConcatenation',
    'StringCreation',
    'StringIndices',
    'StringInvoke',
    'StringIsNullOr',
    'StringIteration',
    'StringPlusNumber',
    'StringRange',
    'StringTemplates',
    'Strings',
    'Suitcase',
    'Sum',
    'SumUsingRange',
    'SumViaFold',
    'Swearing',
    'TDDFail',
    'TDDStillFails',
    'TDDWorks',
    'TailRecursiveSum',
    'TakeOrDrop',
    'Task1',
    'Task10',
    'Task2',
    'Task3',
    'Task4',
    'Task5',
    'Task6',
    'Task7',
    'Task8',
    'Task9',
    'Team',
    'TeamWithTraditions',
    'Temperature',
    'TemperatureDelta',
    'TerminalOperations',
    'TestingExample',
    'ThreeQuotes',
    'TicTacToe',
    'Ticket',
    'ToDoubleException',
    'ToIntException',
    'Todo',
    'TopLevelFunctionRef',
    'Trace1',
    'Transform',
    'TransformingMap',
    'TrimMargin',
    'TrimmedMembers',
    'TripleQuotes',
    'TrueOrFalse',
    'Truncation',
    'TryFinally',
    'Tuple',
    'TwoArgLambda',
    'TwoFunctionsWithVarargs',
    'TypeCheck1',
    'TypeCheck2',
    'TypeCheck3',
    'TypeCheckingSoln1',
    'TypeCheckingSoln2a',
    'TypeCheckingSoln2b',
    'TypeCheckingSoln3',
    'Types',
    'UnSealed',
    'Underscore',
    'Unexpected',
    'UnitReturn',
    'UnitReturnType',
    'Unsafe',
    'UpcastExercise1',
    'Usable',
    'UseALibrary',
    'UseAtomicLog',
    'UseBeanClass',
    'UseDataClass',
    'UseLines',
    'UsingAtomicTest',
    'UsingExpect',
    'UsingKotlinClass',
    'UsingLongs',
    'UsingOperatorsSoln1',
    'UsingOperatorsSoln2',
    'UsingOperatorsSoln3',
    'UsingTrace',
    'Vals',
    'ValueFromMap',
    'Vanbo',
    'VarArgs',
    'VarargLikeList',
    'VarargSum',
    'VariableArgList',
    'Vars',
    'VerySlowFibonacci',
    'VisibleArgs',
    'While',
    'WhileControl',
    'WhileLabeled',
    'WhileLoop',
    'WhyFlatMap',
    'WildAnimals',
    'WithDefaultArguments',
    'WithSecondary',
    'WithinInterface',
    'WithoutDefaultArguments',
    'Wombat',
    'ZeroArguments',
    'ZipAndTransform',
    'Zipper',
    'ZippingWithNext'
    ]) {
    doLast {
        println '*** run complete ***'
    }
}
