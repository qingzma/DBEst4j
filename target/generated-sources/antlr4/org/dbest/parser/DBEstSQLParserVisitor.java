// Generated from org/dbest/parser/DBEstSQLParser.g4 by ANTLR 4.5.3
package org.dbest.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DBEstSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DBEstSQLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#dbest_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbest_statement(DBEstSQLParser.Dbest_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#create_model_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_model_statement(DBEstSQLParser.Create_model_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#drop_model_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_model_statement(DBEstSQLParser.Drop_model_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#drop_all_models_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_all_models_statement(DBEstSQLParser.Drop_all_models_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#show_models_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_models_statement(DBEstSQLParser.Show_models_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#sampling_method_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampling_method_name(DBEstSQLParser.Sampling_method_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#config_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_statement(DBEstSQLParser.Config_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#other_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_statement(DBEstSQLParser.Other_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#create_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database(DBEstSQLParser.Create_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#drop_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_database(DBEstSQLParser.Drop_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#config_set_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_set_statement(DBEstSQLParser.Config_set_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#config_get_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_get_statement(DBEstSQLParser.Config_get_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#config_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_key(DBEstSQLParser.Config_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#config_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_value(DBEstSQLParser.Config_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#tsql_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsql_file(DBEstSQLParser.Tsql_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#sql_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_clause(DBEstSQLParser.Sql_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#ddl_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_clause(DBEstSQLParser.Ddl_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(DBEstSQLParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#stream_select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream_select_statement(DBEstSQLParser.Stream_select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#output_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_clause(DBEstSQLParser.Output_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#output_dml_list_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_dml_list_elem(DBEstSQLParser.Output_dml_list_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#output_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_column_name(DBEstSQLParser.Output_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(DBEstSQLParser.Create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#create_table_as_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_as_select(DBEstSQLParser.Create_table_as_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#create_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view(DBEstSQLParser.Create_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#alter_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table(DBEstSQLParser.Alter_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#alter_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_database(DBEstSQLParser.Alter_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#drop_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table(DBEstSQLParser.Drop_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#drop_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_view(DBEstSQLParser.Drop_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#set_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_statment(DBEstSQLParser.Set_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#use_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_statement(DBEstSQLParser.Use_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#show_tables_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_tables_statement(DBEstSQLParser.Show_tables_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#show_databases_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_databases_statement(DBEstSQLParser.Show_databases_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#describe_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_table_statement(DBEstSQLParser.Describe_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#refresh_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefresh_statement(DBEstSQLParser.Refresh_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#show_config_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_config_statement(DBEstSQLParser.Show_config_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#table_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_type_definition(DBEstSQLParser.Table_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def_table_constraint(DBEstSQLParser.Column_def_table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(DBEstSQLParser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(DBEstSQLParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(DBEstSQLParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#set_special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_special(DBEstSQLParser.Set_specialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not_expression}
	 * labeled alternative in {@link DBEstSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_expression(DBEstSQLParser.Not_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binary_operator_expression}
	 * labeled alternative in {@link DBEstSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator_expression(DBEstSQLParser.Binary_operator_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitive_expression}
	 * labeled alternative in {@link DBEstSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_expression(DBEstSQLParser.Primitive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code date_expression}
	 * labeled alternative in {@link DBEstSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_expression(DBEstSQLParser.Date_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracket_expression}
	 * labeled alternative in {@link DBEstSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket_expression(DBEstSQLParser.Bracket_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary_operator_expression}
	 * labeled alternative in {@link DBEstSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator_expression(DBEstSQLParser.Unary_operator_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interval_expression}
	 * labeled alternative in {@link DBEstSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_expression(DBEstSQLParser.Interval_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_call_expression}
	 * labeled alternative in {@link DBEstSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_expression(DBEstSQLParser.Function_call_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code is_null_expression}
	 * labeled alternative in {@link DBEstSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_null_expression(DBEstSQLParser.Is_null_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code case_expression}
	 * labeled alternative in {@link DBEstSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression(DBEstSQLParser.Case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code column_ref_expression}
	 * labeled alternative in {@link DBEstSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_ref_expression(DBEstSQLParser.Column_ref_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subquery_expression}
	 * labeled alternative in {@link DBEstSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_expression(DBEstSQLParser.Subquery_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(DBEstSQLParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(DBEstSQLParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expression(DBEstSQLParser.Constant_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(DBEstSQLParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#dml_table_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_table_source(DBEstSQLParser.Dml_table_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#with_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_expression(DBEstSQLParser.With_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(DBEstSQLParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#update_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_elem(DBEstSQLParser.Update_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#search_condition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition_list(DBEstSQLParser.Search_condition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#search_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition(DBEstSQLParser.Search_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#search_condition_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition_or(DBEstSQLParser.Search_condition_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#search_condition_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition_not(DBEstSQLParser.Search_condition_notContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setcomp_expr_predicate}
	 * labeled alternative in {@link DBEstSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetcomp_expr_predicate(DBEstSQLParser.Setcomp_expr_predicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code is_predicate}
	 * labeled alternative in {@link DBEstSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_predicate(DBEstSQLParser.Is_predicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comp_expr_predicate}
	 * labeled alternative in {@link DBEstSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_expr_predicate(DBEstSQLParser.Comp_expr_predicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code in_predicate}
	 * labeled alternative in {@link DBEstSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_predicate(DBEstSQLParser.In_predicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracket_predicate}
	 * labeled alternative in {@link DBEstSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket_predicate(DBEstSQLParser.Bracket_predicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binary_func_predicate}
	 * labeled alternative in {@link DBEstSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_func_predicate(DBEstSQLParser.Binary_func_predicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exists_predicate}
	 * labeled alternative in {@link DBEstSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists_predicate(DBEstSQLParser.Exists_predicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary_func_predicate}
	 * labeled alternative in {@link DBEstSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_func_predicate(DBEstSQLParser.Unary_func_predicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comp_pred_expr_predicate}
	 * labeled alternative in {@link DBEstSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_pred_expr_predicate(DBEstSQLParser.Comp_pred_expr_predicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comp_between_expr}
	 * labeled alternative in {@link DBEstSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_between_expr(DBEstSQLParser.Comp_between_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code like_predicate}
	 * labeled alternative in {@link DBEstSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike_predicate(DBEstSQLParser.Like_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#query_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_expression(DBEstSQLParser.Query_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(DBEstSQLParser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#query_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_specification(DBEstSQLParser.Query_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#top_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_clause(DBEstSQLParser.Top_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#limit_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_clause(DBEstSQLParser.Limit_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(DBEstSQLParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#for_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_clause(DBEstSQLParser.For_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#xml_common_directives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_common_directives(DBEstSQLParser.Xml_common_directivesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#order_by_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_expression(DBEstSQLParser.Order_by_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#group_by_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_item(DBEstSQLParser.Group_by_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#option_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_clause(DBEstSQLParser.Option_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(DBEstSQLParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#optimize_for_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimize_for_arg(DBEstSQLParser.Optimize_for_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(DBEstSQLParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#select_list_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_elem(DBEstSQLParser.Select_list_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#partition_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_by_clause(DBEstSQLParser.Partition_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#table_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_source(DBEstSQLParser.Table_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#table_source_item_joined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_source_item_joined(DBEstSQLParser.Table_source_item_joinedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hinted_table_name_item}
	 * labeled alternative in {@link DBEstSQLParser#table_source_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHinted_table_name_item(DBEstSQLParser.Hinted_table_name_itemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code derived_table_source_item}
	 * labeled alternative in {@link DBEstSQLParser#table_source_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_table_source_item(DBEstSQLParser.Derived_table_source_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#change_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_table(DBEstSQLParser.Change_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#join_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_part(DBEstSQLParser.Join_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#table_name_with_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name_with_hint(DBEstSQLParser.Table_name_with_hintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#rowset_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowset_function(DBEstSQLParser.Rowset_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#bulk_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulk_option(DBEstSQLParser.Bulk_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#derived_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_table(DBEstSQLParser.Derived_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(DBEstSQLParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#datepart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatepart(DBEstSQLParser.DatepartContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#as_table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_table_alias(DBEstSQLParser.As_table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(DBEstSQLParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#index_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_column_name(DBEstSQLParser.Index_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#index_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_value(DBEstSQLParser.Index_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#column_alias_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias_list(DBEstSQLParser.Column_alias_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(DBEstSQLParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#table_value_constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_value_constructor(DBEstSQLParser.Table_value_constructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(DBEstSQLParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#case_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expr(DBEstSQLParser.Case_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRanking_windowed_function(DBEstSQLParser.Ranking_windowed_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#expression_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_function(DBEstSQLParser.Expression_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#extract_time_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_time_function(DBEstSQLParser.Extract_time_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#extract_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_unit(DBEstSQLParser.Extract_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#time_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_unit(DBEstSQLParser.Time_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#overlay_string_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverlay_string_function(DBEstSQLParser.Overlay_string_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#substring_string_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstring_string_function(DBEstSQLParser.Substring_string_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#nary_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNary_function(DBEstSQLParser.Nary_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#ternary_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary_function(DBEstSQLParser.Ternary_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#binary_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_function(DBEstSQLParser.Binary_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#unary_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_function(DBEstSQLParser.Unary_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#timestamp_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_function(DBEstSQLParser.Timestamp_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#dateadd_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateadd_function(DBEstSQLParser.Dateadd_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#unary_predicate_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_predicate_function(DBEstSQLParser.Unary_predicate_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#binary_predicate_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_predicate_function(DBEstSQLParser.Binary_predicate_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#noparam_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoparam_function(DBEstSQLParser.Noparam_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#lateral_view_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLateral_view_function(DBEstSQLParser.Lateral_view_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_windowed_function(DBEstSQLParser.Aggregate_windowed_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#all_distinct_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_distinct_expression(DBEstSQLParser.All_distinct_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#cast_as_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_as_expression(DBEstSQLParser.Cast_as_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause(DBEstSQLParser.Over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#row_or_range_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_or_range_clause(DBEstSQLParser.Row_or_range_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#window_frame_extent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_extent(DBEstSQLParser.Window_frame_extentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#window_frame_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_bound(DBEstSQLParser.Window_frame_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#window_frame_preceding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_preceding(DBEstSQLParser.Window_frame_precedingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#window_frame_following}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_following(DBEstSQLParser.Window_frame_followingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#full_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_table_name(DBEstSQLParser.Full_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(DBEstSQLParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(DBEstSQLParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#func_proc_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_proc_name(DBEstSQLParser.Func_proc_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#ddl_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_object(DBEstSQLParser.Ddl_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#full_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_column_name(DBEstSQLParser.Full_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#column_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name_list(DBEstSQLParser.Column_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(DBEstSQLParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(DBEstSQLParser.Cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#on_off}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_off(DBEstSQLParser.On_offContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#clustered}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClustered(DBEstSQLParser.ClusteredContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#null_notnull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_notnull(DBEstSQLParser.Null_notnullContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#true_orfalse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue_orfalse(DBEstSQLParser.True_orfalseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#scalar_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_function_name(DBEstSQLParser.Scalar_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(DBEstSQLParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_value(DBEstSQLParser.Default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(DBEstSQLParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DBEstSQLParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(DBEstSQLParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(DBEstSQLParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#simple_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_id(DBEstSQLParser.Simple_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#comparison_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operator(DBEstSQLParser.Comparison_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBEstSQLParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(DBEstSQLParser.Assignment_operatorContext ctx);
}