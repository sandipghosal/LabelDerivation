// Generated from JavaLanguage.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaLanguageParser}.
 */
public interface JavaLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(@NotNull JavaLanguageParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(@NotNull JavaLanguageParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(@NotNull JavaLanguageParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(@NotNull JavaLanguageParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(@NotNull JavaLanguageParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(@NotNull JavaLanguageParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(@NotNull JavaLanguageParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(@NotNull JavaLanguageParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(@NotNull JavaLanguageParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(@NotNull JavaLanguageParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(@NotNull JavaLanguageParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(@NotNull JavaLanguageParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull JavaLanguageParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull JavaLanguageParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(@NotNull JavaLanguageParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(@NotNull JavaLanguageParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(@NotNull JavaLanguageParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(@NotNull JavaLanguageParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(@NotNull JavaLanguageParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(@NotNull JavaLanguageParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(@NotNull JavaLanguageParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(@NotNull JavaLanguageParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(@NotNull JavaLanguageParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(@NotNull JavaLanguageParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(@NotNull JavaLanguageParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(@NotNull JavaLanguageParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(@NotNull JavaLanguageParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(@NotNull JavaLanguageParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull JavaLanguageParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull JavaLanguageParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(@NotNull JavaLanguageParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(@NotNull JavaLanguageParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(@NotNull JavaLanguageParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(@NotNull JavaLanguageParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(@NotNull JavaLanguageParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(@NotNull JavaLanguageParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(@NotNull JavaLanguageParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(@NotNull JavaLanguageParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull JavaLanguageParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull JavaLanguageParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(@NotNull JavaLanguageParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(@NotNull JavaLanguageParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(@NotNull JavaLanguageParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(@NotNull JavaLanguageParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(@NotNull JavaLanguageParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(@NotNull JavaLanguageParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(@NotNull JavaLanguageParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(@NotNull JavaLanguageParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(@NotNull JavaLanguageParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(@NotNull JavaLanguageParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(@NotNull JavaLanguageParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(@NotNull JavaLanguageParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(@NotNull JavaLanguageParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(@NotNull JavaLanguageParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(@NotNull JavaLanguageParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(@NotNull JavaLanguageParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull JavaLanguageParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull JavaLanguageParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(@NotNull JavaLanguageParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(@NotNull JavaLanguageParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(@NotNull JavaLanguageParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(@NotNull JavaLanguageParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull JavaLanguageParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull JavaLanguageParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(@NotNull JavaLanguageParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(@NotNull JavaLanguageParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(@NotNull JavaLanguageParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(@NotNull JavaLanguageParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull JavaLanguageParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull JavaLanguageParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(@NotNull JavaLanguageParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(@NotNull JavaLanguageParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull JavaLanguageParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull JavaLanguageParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull JavaLanguageParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull JavaLanguageParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(@NotNull JavaLanguageParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(@NotNull JavaLanguageParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull JavaLanguageParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull JavaLanguageParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull JavaLanguageParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull JavaLanguageParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(@NotNull JavaLanguageParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(@NotNull JavaLanguageParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(@NotNull JavaLanguageParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(@NotNull JavaLanguageParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(@NotNull JavaLanguageParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(@NotNull JavaLanguageParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull JavaLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull JavaLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull JavaLanguageParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull JavaLanguageParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(@NotNull JavaLanguageParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(@NotNull JavaLanguageParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(@NotNull JavaLanguageParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(@NotNull JavaLanguageParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(@NotNull JavaLanguageParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(@NotNull JavaLanguageParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(@NotNull JavaLanguageParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(@NotNull JavaLanguageParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(@NotNull JavaLanguageParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(@NotNull JavaLanguageParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(@NotNull JavaLanguageParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(@NotNull JavaLanguageParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(@NotNull JavaLanguageParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(@NotNull JavaLanguageParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(@NotNull JavaLanguageParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(@NotNull JavaLanguageParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(@NotNull JavaLanguageParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(@NotNull JavaLanguageParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(@NotNull JavaLanguageParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(@NotNull JavaLanguageParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(@NotNull JavaLanguageParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(@NotNull JavaLanguageParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(@NotNull JavaLanguageParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(@NotNull JavaLanguageParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(@NotNull JavaLanguageParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(@NotNull JavaLanguageParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(@NotNull JavaLanguageParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(@NotNull JavaLanguageParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(@NotNull JavaLanguageParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(@NotNull JavaLanguageParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(@NotNull JavaLanguageParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(@NotNull JavaLanguageParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(@NotNull JavaLanguageParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(@NotNull JavaLanguageParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull JavaLanguageParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull JavaLanguageParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(@NotNull JavaLanguageParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(@NotNull JavaLanguageParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull JavaLanguageParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull JavaLanguageParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(@NotNull JavaLanguageParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(@NotNull JavaLanguageParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull JavaLanguageParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull JavaLanguageParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(@NotNull JavaLanguageParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(@NotNull JavaLanguageParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(@NotNull JavaLanguageParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(@NotNull JavaLanguageParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(@NotNull JavaLanguageParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(@NotNull JavaLanguageParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(@NotNull JavaLanguageParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(@NotNull JavaLanguageParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull JavaLanguageParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull JavaLanguageParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull JavaLanguageParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull JavaLanguageParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(@NotNull JavaLanguageParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(@NotNull JavaLanguageParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(@NotNull JavaLanguageParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(@NotNull JavaLanguageParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(@NotNull JavaLanguageParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(@NotNull JavaLanguageParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull JavaLanguageParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull JavaLanguageParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(@NotNull JavaLanguageParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(@NotNull JavaLanguageParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull JavaLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull JavaLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull JavaLanguageParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull JavaLanguageParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull JavaLanguageParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull JavaLanguageParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(@NotNull JavaLanguageParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(@NotNull JavaLanguageParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(@NotNull JavaLanguageParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(@NotNull JavaLanguageParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull JavaLanguageParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull JavaLanguageParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull JavaLanguageParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull JavaLanguageParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(@NotNull JavaLanguageParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(@NotNull JavaLanguageParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(@NotNull JavaLanguageParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(@NotNull JavaLanguageParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull JavaLanguageParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull JavaLanguageParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(@NotNull JavaLanguageParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(@NotNull JavaLanguageParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull JavaLanguageParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull JavaLanguageParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(@NotNull JavaLanguageParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(@NotNull JavaLanguageParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(@NotNull JavaLanguageParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(@NotNull JavaLanguageParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(@NotNull JavaLanguageParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(@NotNull JavaLanguageParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(@NotNull JavaLanguageParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(@NotNull JavaLanguageParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(@NotNull JavaLanguageParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(@NotNull JavaLanguageParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull JavaLanguageParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull JavaLanguageParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull JavaLanguageParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull JavaLanguageParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull JavaLanguageParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull JavaLanguageParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(@NotNull JavaLanguageParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(@NotNull JavaLanguageParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLanguageParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(@NotNull JavaLanguageParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLanguageParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(@NotNull JavaLanguageParser.TypeArgumentsOrDiamondContext ctx);
}