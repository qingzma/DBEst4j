// Generated from org/dbest/parser/DBEstSQLParser.g4 by ANTLR 4.5.3
package org.dbest.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DBEstSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MODEL=1, MODELS=2, ADD=3, ALL=4, ALTER=5, AND=6, ANY=7, APPROX_DISTINCT=8, 
		AS=9, ASC=10, ASCII=11, AUTHORIZATION=12, BACKUP=13, BEGIN=14, BETWEEN=15, 
		BLOCKSIZE=16, BREAK=17, BROWSE=18, BULK=19, BY=20, CASCADE=21, CASE=22, 
		CHANGETABLE=23, CHANGES=24, CHECK=25, CHECKPOINT=26, CLOSE=27, CLUSTERED=28, 
		COALESCE=29, COLLATE=30, COLUMN=31, COMMIT=32, COMPUTE=33, CONSTRAINT=34, 
		CONTAINS=35, CONTAINSTABLE=36, CONTINUE=37, CONV=38, CONVERT=39, CREATE=40, 
		CROSS=41, CURRENT=42, CURRENT_DATE=43, CURRENT_TIME=44, CURRENT_TIMESTAMP=45, 
		CURRENT_USER=46, CURSOR=47, DATABASE=48, DATABASES=49, DBCC=50, DEALLOCATE=51, 
		DECLARE=52, DELETE=53, DENY=54, DESC=55, DESCRIBE=56, DISK=57, DISTINCT=58, 
		DISTRIBUTED=59, DOUBLE=60, DROP=61, DUMP=62, ELSE=63, END=64, ERRLVL=65, 
		ESCAPE=66, EXCEPT=67, EXEC=68, EXECUTE=69, EXISTS=70, EXIT=71, EXTERNAL=72, 
		FALSE=73, FETCH=74, FILE=75, FILLFACTOR=76, FOR=77, FORCESEEK=78, FOREIGN=79, 
		FREETEXT=80, FREETEXTTABLE=81, FROM=82, FULL=83, FUNCTION=84, GOTO=85, 
		GRANT=86, GROUP=87, HASH=88, HASHCOLUMN=89, HAVING=90, IDENTITY=91, IDENTITYCOL=92, 
		IDENTITY_INSERT=93, IF=94, IN=95, INDEX=96, INNER=97, INSERT=98, INT4LARGER=99, 
		INTERSECT=100, INTO=101, IS=102, JOIN=103, KEY=104, KILL=105, LEFT=106, 
		LIKE=107, LIMIT=108, LINENO=109, LOAD=110, MERGE=111, MID=112, NATIONAL=113, 
		NOCHECK=114, NONCLUSTERED=115, NOT=116, NULL=117, NULLIF=118, NULLS=119, 
		OF=120, OFF=121, OFFSETS=122, ON=123, OPEN=124, OPENDATASOURCE=125, OPENQUERY=126, 
		OPENROWSET=127, OPENXML=128, OPTION=129, OR=130, ORDER=131, OUTER=132, 
		OVER=133, PERCENT=134, PIVOT=135, PLAN=136, PRECISION=137, PRIMARY=138, 
		PRINT=139, PROC=140, PROCEDURE=141, RAISERROR=142, RATIO=143, RAWTOHEX=144, 
		READ=145, READTEXT=146, RECONFIGURE=147, REFERENCES=148, REPLICATION=149, 
		RESTORE=150, RESTRICT=151, RETURN=152, REVERT=153, REVOKE=154, RIGHT=155, 
		RLIKE=156, ROLLBACK=157, ROWCOUNT=158, ROWGUIDCOL=159, RPAD=160, RULE=161, 
		SAVE=162, SCHEMA=163, SCHEMAS=164, SECURITYAUDIT=165, SELECT=166, SEMANTICKEYPHRASETABLE=167, 
		SEMANTICSIMILARITYDETAILSTABLE=168, SEMANTICSIMILARITYTABLE=169, SEMI=170, 
		SESSION_USER=171, SET=172, SETUSER=173, SHUTDOWN=174, SOME=175, SUBSTR=176, 
		SUBSTRING=177, STATISTICS=178, SYSTEM_USER=179, TABLE=180, TABLES=181, 
		TABLESAMPLE=182, TEXTSIZE=183, THEN=184, TO=185, TOP=186, TRAN=187, TRANSACTION=188, 
		TRIGGER=189, TRUE=190, TRUNCATE=191, TRY_CONVERT=192, TSEQUAL=193, UNION=194, 
		UNIQUE=195, UNPIVOT=196, UPDATE=197, UPDATETEXT=198, USE=199, USER=200, 
		VALUES=201, VARYING=202, VIEW=203, WAITFOR=204, WHEN=205, WHERE=206, WHILE=207, 
		WITH=208, WITHIN=209, WITHOUT=210, WRITETEXT=211, ZONE=212, ABBREV=213, 
		ABSOLUTE=214, ABS=215, ACOS=216, ADDDATE=217, ADDTIME=218, AES_DECRYPT=219, 
		AES_ENCRYPT=220, AGE=221, APPLY=222, AREA=223, ARRAY_AGG=224, ARRAY_APPEND=225, 
		ARRAY_CAT=226, ARRAY_DIMS=227, ARRAY_LENGTH=228, ARRAY_LOWER=229, ARRAY_NDIMS=230, 
		ARRAY_POSITION=231, ARRAY_POSITIONS=232, ARRAY_PREPEND=233, ARRAY_REMOVE=234, 
		ARRAY_REPLACE=235, ARRAY_TO_JSON=236, ARRAY_TO_STRING=237, ARRAY_TO_TSVECTOR=238, 
		ARRAY_UPPER=239, ASIN=240, ATAN=241, ATAN2=242, AUTO=243, AVG=244, BASE64=245, 
		BIGINT=246, BIN=247, BINARY_CHECKSUM=248, BIT=249, BIT_LENGTH=250, BOOL_AND=251, 
		BOOL_OR=252, BOX=253, BOUND_BOX=254, BROADCAST=255, BTRIM=256, BROUND=257, 
		CALLER=258, CARDINALITY=259, CAST=260, CATCH=261, CBRT=262, CEIL=263, 
		CEILING=264, CENTER=265, CHAR=266, CHAR_LENGTH=267, CHARACTER_LENGTH=268, 
		CHECKSUM=269, CHECKSUM_AGG=270, CHR=271, CIRCLE=272, CLOCK_TIMESTAMP=273, 
		COMMITTED=274, CONCAT=275, CONCAT_WS=276, CONFIG=277, CONVERT_FROM=278, 
		CONVERT_TO=279, COOKIE=280, COS=281, CORR=282, COVAR_POP=283, COVAR_SAMP=284, 
		COT=285, COUNT=286, COUNT_BIG=287, CRC32=288, CURDATE=289, CURRVAL=290, 
		CURTIME=291, DATE=292, DATEADD=293, DATE_ADD=294, DATE_FORMAT=295, DATE_PART=296, 
		DATE_SUB=297, DATE_TRUNC=298, DATEDIFF=299, DATENAME=300, DATEPART=301, 
		DATETIME=302, DATETIME2=303, DATETIMEOFFSET=304, DAY=305, DAYNAME=306, 
		DAYOFMONTH=307, DAYOFWEEK=308, DAYOFYEAR=309, DAYS=310, DECODE=311, DEGREES=312, 
		DELAY=313, DELETED=314, DENSE_RANK=315, DIAMETER=316, DISABLE=317, DIV=318, 
		DYNAMIC=319, NATURAL_CONSTANT=320, ENCODE=321, ENCRYPTION=322, ENUM_FIRST=323, 
		ENUM_LAST=324, ENUM_RANGE=325, ESCAPED_BY=326, EXACT=327, EXP=328, EXPLODE=329, 
		EXTRACT=330, EVERY=331, FACTORIAL=332, FAMILY=333, FAST=334, FAST_FORWARD=335, 
		FIELD=336, FIELDS_SEPARATED_BY=337, FIND_IN_SET=338, FIRST=339, FLOOR=340, 
		FOLLOWING=341, FORMAT=342, FORMAT_NUMBER=343, FORWARD_ONLY=344, FNV_HASH=345, 
		FROM_DAYS=346, FROM_UNIXTIME=347, FULLSCAN=348, GEOGRAPHY=349, GEOMETRY=350, 
		GET_BIT=351, GET_BYTE=352, GET_CURRENT_TS_CONFIG=353, GET_JSON_OBJECT=354, 
		GLOBAL=355, GO=356, GREATEST=357, GROUPING=358, GROUPING_ID=359, HEIGHT=360, 
		HEX=361, HIERARCHYID=362, HOST=363, HOSTMASK=364, HOUR=365, IFNULL=366, 
		IMAGE=367, INT=368, INITCAP=369, INSENSITIVE=370, INSERTED=371, INSTR=372, 
		INTERVAL=373, IN_FILE=374, INET_SAME_FAMILY=375, INET_MERGE=376, ISCLOSED=377, 
		ISEMPTY=378, ISFINITE=379, ISNULL=380, ISOLATION=381, ISOPEN=382, JSON_AGG=383, 
		JSON_ARRAY_LENGTH=384, JSON_ARRAY_ELEMENTS=385, JSON_ARRAY_ELEMENTS_TEXT=386, 
		JSON_BUILD_ARRAY=387, JSON_BUILD_OBJECT=388, JSON_EACH=389, JSON_EACH_TEXT=390, 
		JSON_EXTRACT_PATH=391, JSON_EXTRACT_PATH_TEXT=392, JSON_OBJECT=393, JSON_OBJECT_KEYS=394, 
		JSON_OBJECT_AGG=395, JSON_POPULATE_RECORD=396, JSON_POPULATE_RECORDSET=397, 
		JSON_STRIP_NULLS=398, JSON_TO_RECORD=399, JSON_TO_RECORDSET=400, JSON_TYPEOF=401, 
		JSONB_AGG=402, JSONB_OBJECT_AGG=403, JSONB_SET=404, JSONB_INSERT=405, 
		JSONB_PRETTY=406, JUSTIFY_DAYS=407, JUSTIFY_HOURS=408, JUSTIFY_INTERVALS=409, 
		KEEPFIXED=410, KEYSET=411, LAST=412, LASTVAL=413, LAST_DAY=414, LAST_INSERT_ID=415, 
		LATERAL=416, LCASE=417, LEAST=418, LENGTH=419, LEVEL=420, LINE=421, LN=422, 
		LOCAL=423, LOCALTIME=424, LOCALTIMESTAMP=425, LOCATE=426, LOCATION=427, 
		LOCK_ESCALATION=428, LOG=429, LOG2=430, LOG10=431, LOGIN=432, LOOP=433, 
		LOWER=434, LOWER_INC=435, LOWER_INF=436, LPAD=437, LTRIM=438, LSEG=439, 
		MACADDR8_SET7BIT=440, MAKEDATE=441, MAKETIME=442, MAKE_DATE=443, MAKE_TIME=444, 
		MAKE_TIMESTAMP=445, MAKE_TIMESTAMPTZ=446, MARK=447, MASKLEN=448, MAX=449, 
		MD5=450, METHOD=451, MICROSECOND=452, MIN=453, MIN_ACTIVE_ROWVERSION=454, 
		MINUTE=455, MOD=456, MODIFY=457, MONEY=458, MONTH=459, MONTHNAME=460, 
		MONTHS=461, NEGATIVE=462, NEXT=463, NETMASK=464, NETWORK=465, NAME=466, 
		NCHAR=467, NDV=468, NEXTVAL=469, NOCOUNT=470, NOEXPAND=471, NORECOMPUTE=472, 
		NOW=473, NPOINTS=474, NTEXT=475, NTILE=476, NUMBER=477, NUMNODE=478, NUMERIC=479, 
		NVARCHAR=480, NVL=481, OCTET_LENGTH=482, OFFSET=483, ONLY=484, OPTIMISTIC=485, 
		OPTIMIZE=486, OUT=487, OUTPUT=488, OVERLAY=489, OWNER=490, PARTITION=491, 
		PATH=492, PCLOSE=493, PERCENTILE=494, PERIOD_ADD=495, PERIOD_DIFF=496, 
		PG_CLIENT_ENCODING=497, PLAINTO_TSQUERY=498, PHRASETO_TSQUERY=499, PI=500, 
		PLACING=501, PMOD=502, POINT=503, POLYGON=504, POPEN=505, POSITION=506, 
		POSITIVE=507, POW=508, POWER=509, PRECEDING=510, PRIOR=511, QUARTER=512, 
		QUERYTREE=513, QUOTED_BY=514, QUOTE_IDENT=515, QUOTE_LITERAL=516, QUOTE_NULLABLE=517, 
		RADIANS=518, RADIUS=519, RAND=520, RANDOM=521, RANGE=522, RANGE_MERGE=523, 
		RANK=524, READONLY=525, READ_ONLY=526, RECOMMENDED=527, RECOMPILE=528, 
		REFRESH=529, REGR_AVGX=530, REGR_AVGY=531, REGR_COUNT=532, REGR_INTERCEPT=533, 
		REGR_R2=534, REGR_SLOPE=535, REGR_SXX=536, REGR_SXY=537, REGR_SYY=538, 
		RELATIVE=539, REGEXP_MATCHES=540, REGEXP_REPLACE=541, REGEXP_SPLIT_TO_ARRAY=542, 
		REGEXP_SPLIT_TO_TABLE=543, REMOTE=544, REPEAT=545, REPEATABLE=546, REPLACE=547, 
		REVERSE=548, ROLLUP=549, ROOT=550, ROUND=551, ROW=552, ROW_TO_JSON=553, 
		ROWGUID=554, ROWS=555, ROW_NUMBER=556, RTRIM=557, SAMPLE=558, SCALE=559, 
		SCHEMABINDING=560, SCROLL=561, SCROLL_LOCKS=562, SECOND=563, SEC_TO_TIME=564, 
		SELF=565, SERIALIZABLE=566, SETSEED=567, SETWEIGHT=568, SETVAL=569, SET_BIT=570, 
		SET_BYTE=571, SET_MASKLEN=572, SHA1=573, SHA2=574, SHIFTLEFT=575, SHIFTRIGHT=576, 
		SHIFTRIGHTUNSIGNED=577, SIGN=578, SIN=579, SMALLDATETIME=580, SMALLINT=581, 
		SMALLMONEY=582, SNAPSHOT=583, SPACE_FUNCTION=584, SPATIAL_WINDOW_MAX_CELLS=585, 
		SPLIT=586, SPLIT_PART=587, SQL_VARIANT=588, STATEMENT_TIMESTAMP=589, STATIC=590, 
		STATS_STREAM=591, STDEV=592, STDDEV=593, STDEVP=594, STDDEV_SAMP=595, 
		STORED_AS_PARQUET=596, STRCMP=597, STRING_AGG=598, STRING_TO_ARRAY=599, 
		STRPOS=600, STR_TO_DATE=601, SUBDATE=602, SUBSTRING_INDEX=603, SUM=604, 
		SQRT=605, STDDEV_POP=606, STRIP=607, STRTOL=608, SYSDATE=609, TAN=610, 
		TEXT=611, THROW=612, TIES=613, TIME=614, TIMEDIFF=615, TIMEOFDAY=616, 
		TIMESTAMP=617, TIME_FORMAT=618, TIME_TO_SEC=619, TINYINT=620, TO_ASCII=621, 
		TO_CHAR=622, TO_DATE=623, TO_DAYS=624, TO_HEX=625, TO_JSON=626, TO_JSONB=627, 
		TO_NUMBER=628, TO_TIMESTAMP=629, TO_TSQUERY=630, TO_TSVECTOR=631, TRANSACTION_TIMESTAMP=632, 
		TRANSLATE=633, TRIM=634, TRUNC=635, TRY=636, TS_DELETE=637, TS_FILTER=638, 
		TS_HEADLINE=639, TS_RANK=640, TS_RANK_CD=641, TS_REWRITE=642, TSQUERY_PHRASE=643, 
		TSVECTOR_TO_ARRAY=644, TSVECTOR_UPDATE_TRIGGER=645, TSVECTOR_UPDATE_TRIGGER_COLUMN=646, 
		TYPE=647, TYPE_WARNING=648, UCASE=649, UNBOUNDED=650, UNCOMMITTED=651, 
		UNHEX=652, UNIQUEIDENTIFIER=653, UNIVERSE=654, UNIX_TIMESTAMP=655, UNKNOWN=656, 
		UNNEST=657, UPPER=658, UPPER_INC=659, UPPER_INF=660, USING=661, VAR=662, 
		VARBINARY=663, VARCHAR=664, VARIANCE=665, VAR_POP=666, VAR_SAMP=667, VARP=668, 
		VERSION=669, VIEW_METADATA=670, WEEKOFYEAR=671, WEEK=672, WEEKDAY=673, 
		WIDTH=674, WIDTH_BUCKET=675, WORK=676, XML=677, XMLAGG=678, XMLCOMMENT=679, 
		XMLCONCAT=680, XMLELEMENT=681, XMLFOREST=682, XMLNAMESPACES=683, XMLPI=684, 
		XMLROOT=685, XML_ISWELL_FORMAT=686, XPATH=687, XPATH_EXISTS=688, YEAR=689, 
		YEARS=690, YEARWEEK=691, ST_ASBINARY=692, ST_ASTEXT=693, ST_GEOMETRYFROMTEXT=694, 
		ST_GEOMFROMBINARY=695, ST_LINEFROMTEXT=696, ST_LINESTRING=697, ST_MULTIPOINT=698, 
		ST_POINT=699, ST_POLYGON=700, ST_CONTAINS=701, ST_CROSSES=702, ST_DISJOINT=703, 
		ST_EQUALS=704, ST_INTERSECTS=705, ST_OVERLAPS=706, ST_RELATE=707, ST_TOUCHES=708, 
		ST_WITHIN=709, GEOMETRY_UNION=710, ST_BOUNDARY=711, ST_BUFFER=712, ST_DIFFERENCE=713, 
		ST_ENVELOPE=714, ST_ENVELOPEASPTS=715, ST_EXTERIORRING=716, ST_INTERSECTION=717, 
		ST_SYMDIFFERENCE=718, ST_UNION=719, ST_AREA=720, ST_CENTROID=721, ST_CONVEXHULL=722, 
		ST_COORDDIM=723, ST_DIMENSION=724, ST_DISTANCE=725, ST_GEOMETRYN=726, 
		ST_INTERIORRINGN=727, ST_GEOMETRYTYPE=728, ST_ISCLOSED=729, ST_ISEMPTY=730, 
		ST_ISSIMPLE=731, ST_ISRING=732, ST_ISVALID=733, ST_LENGTH=734, ST_POINTN=735, 
		ST_XMAX=736, ST_YMAX=737, ST_XMIN=738, ST_YMIN=739, ST_STARTPOINT=740, 
		SIMPLIFY_GEOMETRY=741, ST_ENDPOINT=742, ST_X=743, ST_Y=744, ST_INTERIORRINGS=745, 
		ST_NUMGEOMETRIES=746, ST_GEOMETRIES=747, ST_NUMPOINTS=748, ST_NUMINTERIORRING=749, 
		LINE_LOCATE_POINT=750, GEOMETRY_INVALID_REASON=751, GREAT_CIRCLE_DISTANCE=752, 
		CONVEX_HULL_AGG=753, GEOMETRY_UNION_AGG=754, BING_TILE=755, BING_TILE_AT=756, 
		BING_TILES_AROUND=757, BING_TILE_COORDINATES=758, BING_TILE_POLYGON=759, 
		BING_TILE_QUADKEY=760, BING_TILE_ZOOM_LEVEL=761, GEOMETRY_TO_BING_TILES=762, 
		DOLLAR_ACTION=763, SPACE=764, COMMENT=765, LINE_COMMENT=766, DOUBLE_QUOTE_ID=767, 
		BACKTICK_ID=768, SQUARE_BRACKET_ID=769, LOCAL_ID=770, DECIMAL=771, ID=772, 
		STRING=773, BINARY=774, FLOAT=775, REAL=776, EQUAL=777, GREATER=778, LESS=779, 
		EXCLAMATION=780, PLUS_ASSIGN=781, MINUS_ASSIGN=782, MULT_ASSIGN=783, DIV_ASSIGN=784, 
		MOD_ASSIGN=785, AND_ASSIGN=786, XOR_ASSIGN=787, OR_ASSIGN=788, DOT=789, 
		UNDERLINE=790, AT=791, SHARP=792, DOLLAR=793, LR_BRACKET=794, RR_BRACKET=795, 
		COMMA=796, SEMICOLON=797, COLON=798, STAR=799, DIVIDE=800, MODULE=801, 
		PLUS=802, MINUS=803, BIT_NOT=804, BIT_OR=805, BIT_AND=806, BIT_XOR=807, 
		BIT_CONCAT=808, BIT_LSHIFT=809, BIT_RSHIFT=810, INDEPENDENT=811, DEPENDENT=812, 
		SHOW=813, UNIFORM=814, GET=815, STREAM=816;
	public static final int
		RULE_dbest_statement = 0, RULE_create_model_statement = 1, RULE_drop_model_statement = 2, 
		RULE_drop_all_models_statement = 3, RULE_show_models_statement = 4, RULE_sampling_method_name = 5, 
		RULE_config_statement = 6, RULE_other_statement = 7, RULE_create_database = 8, 
		RULE_drop_database = 9, RULE_config_set_statement = 10, RULE_config_get_statement = 11, 
		RULE_config_key = 12, RULE_config_value = 13, RULE_tsql_file = 14, RULE_sql_clause = 15, 
		RULE_ddl_clause = 16, RULE_select_statement = 17, RULE_stream_select_statement = 18, 
		RULE_output_clause = 19, RULE_output_dml_list_elem = 20, RULE_output_column_name = 21, 
		RULE_create_table = 22, RULE_create_table_as_select = 23, RULE_create_view = 24, 
		RULE_alter_table = 25, RULE_alter_database = 26, RULE_drop_table = 27, 
		RULE_drop_view = 28, RULE_set_statment = 29, RULE_use_statement = 30, 
		RULE_show_tables_statement = 31, RULE_show_databases_statement = 32, RULE_describe_table_statement = 33, 
		RULE_refresh_statement = 34, RULE_show_config_statement = 35, RULE_table_type_definition = 36, 
		RULE_column_def_table_constraint = 37, RULE_column_definition = 38, RULE_column_constraint = 39, 
		RULE_table_constraint = 40, RULE_set_special = 41, RULE_expression = 42, 
		RULE_interval = 43, RULE_date = 44, RULE_constant_expression = 45, RULE_subquery = 46, 
		RULE_dml_table_source = 47, RULE_with_expression = 48, RULE_common_table_expression = 49, 
		RULE_update_elem = 50, RULE_search_condition_list = 51, RULE_search_condition = 52, 
		RULE_search_condition_or = 53, RULE_search_condition_not = 54, RULE_predicate = 55, 
		RULE_query_expression = 56, RULE_union = 57, RULE_query_specification = 58, 
		RULE_top_clause = 59, RULE_limit_clause = 60, RULE_order_by_clause = 61, 
		RULE_for_clause = 62, RULE_xml_common_directives = 63, RULE_order_by_expression = 64, 
		RULE_group_by_item = 65, RULE_option_clause = 66, RULE_option = 67, RULE_optimize_for_arg = 68, 
		RULE_select_list = 69, RULE_select_list_elem = 70, RULE_partition_by_clause = 71, 
		RULE_table_source = 72, RULE_table_source_item_joined = 73, RULE_table_source_item = 74, 
		RULE_change_table = 75, RULE_join_part = 76, RULE_table_name_with_hint = 77, 
		RULE_rowset_function = 78, RULE_bulk_option = 79, RULE_derived_table = 80, 
		RULE_function_call = 81, RULE_datepart = 82, RULE_as_table_alias = 83, 
		RULE_table_alias = 84, RULE_index_column_name = 85, RULE_index_value = 86, 
		RULE_column_alias_list = 87, RULE_column_alias = 88, RULE_table_value_constructor = 89, 
		RULE_expression_list = 90, RULE_case_expr = 91, RULE_ranking_windowed_function = 92, 
		RULE_expression_function = 93, RULE_extract_time_function = 94, RULE_extract_unit = 95, 
		RULE_time_unit = 96, RULE_overlay_string_function = 97, RULE_substring_string_function = 98, 
		RULE_nary_function = 99, RULE_ternary_function = 100, RULE_binary_function = 101, 
		RULE_unary_function = 102, RULE_timestamp_function = 103, RULE_dateadd_function = 104, 
		RULE_unary_predicate_function = 105, RULE_binary_predicate_function = 106, 
		RULE_noparam_function = 107, RULE_lateral_view_function = 108, RULE_aggregate_windowed_function = 109, 
		RULE_all_distinct_expression = 110, RULE_cast_as_expression = 111, RULE_over_clause = 112, 
		RULE_row_or_range_clause = 113, RULE_window_frame_extent = 114, RULE_window_frame_bound = 115, 
		RULE_window_frame_preceding = 116, RULE_window_frame_following = 117, 
		RULE_full_table_name = 118, RULE_table_name = 119, RULE_view_name = 120, 
		RULE_func_proc_name = 121, RULE_ddl_object = 122, RULE_full_column_name = 123, 
		RULE_column_name_list = 124, RULE_column_name = 125, RULE_cursor_name = 126, 
		RULE_on_off = 127, RULE_clustered = 128, RULE_null_notnull = 129, RULE_true_orfalse = 130, 
		RULE_scalar_function_name = 131, RULE_data_type = 132, RULE_default_value = 133, 
		RULE_constant = 134, RULE_number = 135, RULE_sign = 136, RULE_id = 137, 
		RULE_simple_id = 138, RULE_comparison_operator = 139, RULE_assignment_operator = 140;
	public static final String[] ruleNames = {
		"dbest_statement", "create_model_statement", "drop_model_statement", "drop_all_models_statement", 
		"show_models_statement", "sampling_method_name", "config_statement", "other_statement", 
		"create_database", "drop_database", "config_set_statement", "config_get_statement", 
		"config_key", "config_value", "tsql_file", "sql_clause", "ddl_clause", 
		"select_statement", "stream_select_statement", "output_clause", "output_dml_list_elem", 
		"output_column_name", "create_table", "create_table_as_select", "create_view", 
		"alter_table", "alter_database", "drop_table", "drop_view", "set_statment", 
		"use_statement", "show_tables_statement", "show_databases_statement", 
		"describe_table_statement", "refresh_statement", "show_config_statement", 
		"table_type_definition", "column_def_table_constraint", "column_definition", 
		"column_constraint", "table_constraint", "set_special", "expression", 
		"interval", "date", "constant_expression", "subquery", "dml_table_source", 
		"with_expression", "common_table_expression", "update_elem", "search_condition_list", 
		"search_condition", "search_condition_or", "search_condition_not", "predicate", 
		"query_expression", "union", "query_specification", "top_clause", "limit_clause", 
		"order_by_clause", "for_clause", "xml_common_directives", "order_by_expression", 
		"group_by_item", "option_clause", "option", "optimize_for_arg", "select_list", 
		"select_list_elem", "partition_by_clause", "table_source", "table_source_item_joined", 
		"table_source_item", "change_table", "join_part", "table_name_with_hint", 
		"rowset_function", "bulk_option", "derived_table", "function_call", "datepart", 
		"as_table_alias", "table_alias", "index_column_name", "index_value", "column_alias_list", 
		"column_alias", "table_value_constructor", "expression_list", "case_expr", 
		"ranking_windowed_function", "expression_function", "extract_time_function", 
		"extract_unit", "time_unit", "overlay_string_function", "substring_string_function", 
		"nary_function", "ternary_function", "binary_function", "unary_function", 
		"timestamp_function", "dateadd_function", "unary_predicate_function", 
		"binary_predicate_function", "noparam_function", "lateral_view_function", 
		"aggregate_windowed_function", "all_distinct_expression", "cast_as_expression", 
		"over_clause", "row_or_range_clause", "window_frame_extent", "window_frame_bound", 
		"window_frame_preceding", "window_frame_following", "full_table_name", 
		"table_name", "view_name", "func_proc_name", "ddl_object", "full_column_name", 
		"column_name_list", "column_name", "cursor_name", "on_off", "clustered", 
		"null_notnull", "true_orfalse", "scalar_function_name", "data_type", "default_value", 
		"constant", "number", "sign", "id", "simple_id", "comparison_operator", 
		"assignment_operator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'='", "'>'", "'<'", 
		"'!'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'^='", "'|='", 
		"'.'", "'_'", "'@'", "'#'", "'$'", "'('", "')'", "','", "';'", "':'", 
		"'*'", "'/'", "'%'", "'+'", "'-'", "'~'", "'|'", "'&'", "'^'", "'||'", 
		"'<<'", "'>>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MODEL", "MODELS", "ADD", "ALL", "ALTER", "AND", "ANY", "APPROX_DISTINCT", 
		"AS", "ASC", "ASCII", "AUTHORIZATION", "BACKUP", "BEGIN", "BETWEEN", "BLOCKSIZE", 
		"BREAK", "BROWSE", "BULK", "BY", "CASCADE", "CASE", "CHANGETABLE", "CHANGES", 
		"CHECK", "CHECKPOINT", "CLOSE", "CLUSTERED", "COALESCE", "COLLATE", "COLUMN", 
		"COMMIT", "COMPUTE", "CONSTRAINT", "CONTAINS", "CONTAINSTABLE", "CONTINUE", 
		"CONV", "CONVERT", "CREATE", "CROSS", "CURRENT", "CURRENT_DATE", "CURRENT_TIME", 
		"CURRENT_TIMESTAMP", "CURRENT_USER", "CURSOR", "DATABASE", "DATABASES", 
		"DBCC", "DEALLOCATE", "DECLARE", "DELETE", "DENY", "DESC", "DESCRIBE", 
		"DISK", "DISTINCT", "DISTRIBUTED", "DOUBLE", "DROP", "DUMP", "ELSE", "END", 
		"ERRLVL", "ESCAPE", "EXCEPT", "EXEC", "EXECUTE", "EXISTS", "EXIT", "EXTERNAL", 
		"FALSE", "FETCH", "FILE", "FILLFACTOR", "FOR", "FORCESEEK", "FOREIGN", 
		"FREETEXT", "FREETEXTTABLE", "FROM", "FULL", "FUNCTION", "GOTO", "GRANT", 
		"GROUP", "HASH", "HASHCOLUMN", "HAVING", "IDENTITY", "IDENTITYCOL", "IDENTITY_INSERT", 
		"IF", "IN", "INDEX", "INNER", "INSERT", "INT4LARGER", "INTERSECT", "INTO", 
		"IS", "JOIN", "KEY", "KILL", "LEFT", "LIKE", "LIMIT", "LINENO", "LOAD", 
		"MERGE", "MID", "NATIONAL", "NOCHECK", "NONCLUSTERED", "NOT", "NULL", 
		"NULLIF", "NULLS", "OF", "OFF", "OFFSETS", "ON", "OPEN", "OPENDATASOURCE", 
		"OPENQUERY", "OPENROWSET", "OPENXML", "OPTION", "OR", "ORDER", "OUTER", 
		"OVER", "PERCENT", "PIVOT", "PLAN", "PRECISION", "PRIMARY", "PRINT", "PROC", 
		"PROCEDURE", "RAISERROR", "RATIO", "RAWTOHEX", "READ", "READTEXT", "RECONFIGURE", 
		"REFERENCES", "REPLICATION", "RESTORE", "RESTRICT", "RETURN", "REVERT", 
		"REVOKE", "RIGHT", "RLIKE", "ROLLBACK", "ROWCOUNT", "ROWGUIDCOL", "RPAD", 
		"RULE", "SAVE", "SCHEMA", "SCHEMAS", "SECURITYAUDIT", "SELECT", "SEMANTICKEYPHRASETABLE", 
		"SEMANTICSIMILARITYDETAILSTABLE", "SEMANTICSIMILARITYTABLE", "SEMI", "SESSION_USER", 
		"SET", "SETUSER", "SHUTDOWN", "SOME", "SUBSTR", "SUBSTRING", "STATISTICS", 
		"SYSTEM_USER", "TABLE", "TABLES", "TABLESAMPLE", "TEXTSIZE", "THEN", "TO", 
		"TOP", "TRAN", "TRANSACTION", "TRIGGER", "TRUE", "TRUNCATE", "TRY_CONVERT", 
		"TSEQUAL", "UNION", "UNIQUE", "UNPIVOT", "UPDATE", "UPDATETEXT", "USE", 
		"USER", "VALUES", "VARYING", "VIEW", "WAITFOR", "WHEN", "WHERE", "WHILE", 
		"WITH", "WITHIN", "WITHOUT", "WRITETEXT", "ZONE", "ABBREV", "ABSOLUTE", 
		"ABS", "ACOS", "ADDDATE", "ADDTIME", "AES_DECRYPT", "AES_ENCRYPT", "AGE", 
		"APPLY", "AREA", "ARRAY_AGG", "ARRAY_APPEND", "ARRAY_CAT", "ARRAY_DIMS", 
		"ARRAY_LENGTH", "ARRAY_LOWER", "ARRAY_NDIMS", "ARRAY_POSITION", "ARRAY_POSITIONS", 
		"ARRAY_PREPEND", "ARRAY_REMOVE", "ARRAY_REPLACE", "ARRAY_TO_JSON", "ARRAY_TO_STRING", 
		"ARRAY_TO_TSVECTOR", "ARRAY_UPPER", "ASIN", "ATAN", "ATAN2", "AUTO", "AVG", 
		"BASE64", "BIGINT", "BIN", "BINARY_CHECKSUM", "BIT", "BIT_LENGTH", "BOOL_AND", 
		"BOOL_OR", "BOX", "BOUND_BOX", "BROADCAST", "BTRIM", "BROUND", "CALLER", 
		"CARDINALITY", "CAST", "CATCH", "CBRT", "CEIL", "CEILING", "CENTER", "CHAR", 
		"CHAR_LENGTH", "CHARACTER_LENGTH", "CHECKSUM", "CHECKSUM_AGG", "CHR", 
		"CIRCLE", "CLOCK_TIMESTAMP", "COMMITTED", "CONCAT", "CONCAT_WS", "CONFIG", 
		"CONVERT_FROM", "CONVERT_TO", "COOKIE", "COS", "CORR", "COVAR_POP", "COVAR_SAMP", 
		"COT", "COUNT", "COUNT_BIG", "CRC32", "CURDATE", "CURRVAL", "CURTIME", 
		"DATE", "DATEADD", "DATE_ADD", "DATE_FORMAT", "DATE_PART", "DATE_SUB", 
		"DATE_TRUNC", "DATEDIFF", "DATENAME", "DATEPART", "DATETIME", "DATETIME2", 
		"DATETIMEOFFSET", "DAY", "DAYNAME", "DAYOFMONTH", "DAYOFWEEK", "DAYOFYEAR", 
		"DAYS", "DECODE", "DEGREES", "DELAY", "DELETED", "DENSE_RANK", "DIAMETER", 
		"DISABLE", "DIV", "DYNAMIC", "NATURAL_CONSTANT", "ENCODE", "ENCRYPTION", 
		"ENUM_FIRST", "ENUM_LAST", "ENUM_RANGE", "ESCAPED_BY", "EXACT", "EXP", 
		"EXPLODE", "EXTRACT", "EVERY", "FACTORIAL", "FAMILY", "FAST", "FAST_FORWARD", 
		"FIELD", "FIELDS_SEPARATED_BY", "FIND_IN_SET", "FIRST", "FLOOR", "FOLLOWING", 
		"FORMAT", "FORMAT_NUMBER", "FORWARD_ONLY", "FNV_HASH", "FROM_DAYS", "FROM_UNIXTIME", 
		"FULLSCAN", "GEOGRAPHY", "GEOMETRY", "GET_BIT", "GET_BYTE", "GET_CURRENT_TS_CONFIG", 
		"GET_JSON_OBJECT", "GLOBAL", "GO", "GREATEST", "GROUPING", "GROUPING_ID", 
		"HEIGHT", "HEX", "HIERARCHYID", "HOST", "HOSTMASK", "HOUR", "IFNULL", 
		"IMAGE", "INT", "INITCAP", "INSENSITIVE", "INSERTED", "INSTR", "INTERVAL", 
		"IN_FILE", "INET_SAME_FAMILY", "INET_MERGE", "ISCLOSED", "ISEMPTY", "ISFINITE", 
		"ISNULL", "ISOLATION", "ISOPEN", "JSON_AGG", "JSON_ARRAY_LENGTH", "JSON_ARRAY_ELEMENTS", 
		"JSON_ARRAY_ELEMENTS_TEXT", "JSON_BUILD_ARRAY", "JSON_BUILD_OBJECT", "JSON_EACH", 
		"JSON_EACH_TEXT", "JSON_EXTRACT_PATH", "JSON_EXTRACT_PATH_TEXT", "JSON_OBJECT", 
		"JSON_OBJECT_KEYS", "JSON_OBJECT_AGG", "JSON_POPULATE_RECORD", "JSON_POPULATE_RECORDSET", 
		"JSON_STRIP_NULLS", "JSON_TO_RECORD", "JSON_TO_RECORDSET", "JSON_TYPEOF", 
		"JSONB_AGG", "JSONB_OBJECT_AGG", "JSONB_SET", "JSONB_INSERT", "JSONB_PRETTY", 
		"JUSTIFY_DAYS", "JUSTIFY_HOURS", "JUSTIFY_INTERVALS", "KEEPFIXED", "KEYSET", 
		"LAST", "LASTVAL", "LAST_DAY", "LAST_INSERT_ID", "LATERAL", "LCASE", "LEAST", 
		"LENGTH", "LEVEL", "LINE", "LN", "LOCAL", "LOCALTIME", "LOCALTIMESTAMP", 
		"LOCATE", "LOCATION", "LOCK_ESCALATION", "LOG", "LOG2", "LOG10", "LOGIN", 
		"LOOP", "LOWER", "LOWER_INC", "LOWER_INF", "LPAD", "LTRIM", "LSEG", "MACADDR8_SET7BIT", 
		"MAKEDATE", "MAKETIME", "MAKE_DATE", "MAKE_TIME", "MAKE_TIMESTAMP", "MAKE_TIMESTAMPTZ", 
		"MARK", "MASKLEN", "MAX", "MD5", "METHOD", "MICROSECOND", "MIN", "MIN_ACTIVE_ROWVERSION", 
		"MINUTE", "MOD", "MODIFY", "MONEY", "MONTH", "MONTHNAME", "MONTHS", "NEGATIVE", 
		"NEXT", "NETMASK", "NETWORK", "NAME", "NCHAR", "NDV", "NEXTVAL", "NOCOUNT", 
		"NOEXPAND", "NORECOMPUTE", "NOW", "NPOINTS", "NTEXT", "NTILE", "NUMBER", 
		"NUMNODE", "NUMERIC", "NVARCHAR", "NVL", "OCTET_LENGTH", "OFFSET", "ONLY", 
		"OPTIMISTIC", "OPTIMIZE", "OUT", "OUTPUT", "OVERLAY", "OWNER", "PARTITION", 
		"PATH", "PCLOSE", "PERCENTILE", "PERIOD_ADD", "PERIOD_DIFF", "PG_CLIENT_ENCODING", 
		"PLAINTO_TSQUERY", "PHRASETO_TSQUERY", "PI", "PLACING", "PMOD", "POINT", 
		"POLYGON", "POPEN", "POSITION", "POSITIVE", "POW", "POWER", "PRECEDING", 
		"PRIOR", "QUARTER", "QUERYTREE", "QUOTED_BY", "QUOTE_IDENT", "QUOTE_LITERAL", 
		"QUOTE_NULLABLE", "RADIANS", "RADIUS", "RAND", "RANDOM", "RANGE", "RANGE_MERGE", 
		"RANK", "READONLY", "READ_ONLY", "RECOMMENDED", "RECOMPILE", "REFRESH", 
		"REGR_AVGX", "REGR_AVGY", "REGR_COUNT", "REGR_INTERCEPT", "REGR_R2", "REGR_SLOPE", 
		"REGR_SXX", "REGR_SXY", "REGR_SYY", "RELATIVE", "REGEXP_MATCHES", "REGEXP_REPLACE", 
		"REGEXP_SPLIT_TO_ARRAY", "REGEXP_SPLIT_TO_TABLE", "REMOTE", "REPEAT", 
		"REPEATABLE", "REPLACE", "REVERSE", "ROLLUP", "ROOT", "ROUND", "ROW", 
		"ROW_TO_JSON", "ROWGUID", "ROWS", "ROW_NUMBER", "RTRIM", "SAMPLE", "SCALE", 
		"SCHEMABINDING", "SCROLL", "SCROLL_LOCKS", "SECOND", "SEC_TO_TIME", "SELF", 
		"SERIALIZABLE", "SETSEED", "SETWEIGHT", "SETVAL", "SET_BIT", "SET_BYTE", 
		"SET_MASKLEN", "SHA1", "SHA2", "SHIFTLEFT", "SHIFTRIGHT", "SHIFTRIGHTUNSIGNED", 
		"SIGN", "SIN", "SMALLDATETIME", "SMALLINT", "SMALLMONEY", "SNAPSHOT", 
		"SPACE_FUNCTION", "SPATIAL_WINDOW_MAX_CELLS", "SPLIT", "SPLIT_PART", "SQL_VARIANT", 
		"STATEMENT_TIMESTAMP", "STATIC", "STATS_STREAM", "STDEV", "STDDEV", "STDEVP", 
		"STDDEV_SAMP", "STORED_AS_PARQUET", "STRCMP", "STRING_AGG", "STRING_TO_ARRAY", 
		"STRPOS", "STR_TO_DATE", "SUBDATE", "SUBSTRING_INDEX", "SUM", "SQRT", 
		"STDDEV_POP", "STRIP", "STRTOL", "SYSDATE", "TAN", "TEXT", "THROW", "TIES", 
		"TIME", "TIMEDIFF", "TIMEOFDAY", "TIMESTAMP", "TIME_FORMAT", "TIME_TO_SEC", 
		"TINYINT", "TO_ASCII", "TO_CHAR", "TO_DATE", "TO_DAYS", "TO_HEX", "TO_JSON", 
		"TO_JSONB", "TO_NUMBER", "TO_TIMESTAMP", "TO_TSQUERY", "TO_TSVECTOR", 
		"TRANSACTION_TIMESTAMP", "TRANSLATE", "TRIM", "TRUNC", "TRY", "TS_DELETE", 
		"TS_FILTER", "TS_HEADLINE", "TS_RANK", "TS_RANK_CD", "TS_REWRITE", "TSQUERY_PHRASE", 
		"TSVECTOR_TO_ARRAY", "TSVECTOR_UPDATE_TRIGGER", "TSVECTOR_UPDATE_TRIGGER_COLUMN", 
		"TYPE", "TYPE_WARNING", "UCASE", "UNBOUNDED", "UNCOMMITTED", "UNHEX", 
		"UNIQUEIDENTIFIER", "UNIVERSE", "UNIX_TIMESTAMP", "UNKNOWN", "UNNEST", 
		"UPPER", "UPPER_INC", "UPPER_INF", "USING", "VAR", "VARBINARY", "VARCHAR", 
		"VARIANCE", "VAR_POP", "VAR_SAMP", "VARP", "VERSION", "VIEW_METADATA", 
		"WEEKOFYEAR", "WEEK", "WEEKDAY", "WIDTH", "WIDTH_BUCKET", "WORK", "XML", 
		"XMLAGG", "XMLCOMMENT", "XMLCONCAT", "XMLELEMENT", "XMLFOREST", "XMLNAMESPACES", 
		"XMLPI", "XMLROOT", "XML_ISWELL_FORMAT", "XPATH", "XPATH_EXISTS", "YEAR", 
		"YEARS", "YEARWEEK", "ST_ASBINARY", "ST_ASTEXT", "ST_GEOMETRYFROMTEXT", 
		"ST_GEOMFROMBINARY", "ST_LINEFROMTEXT", "ST_LINESTRING", "ST_MULTIPOINT", 
		"ST_POINT", "ST_POLYGON", "ST_CONTAINS", "ST_CROSSES", "ST_DISJOINT", 
		"ST_EQUALS", "ST_INTERSECTS", "ST_OVERLAPS", "ST_RELATE", "ST_TOUCHES", 
		"ST_WITHIN", "GEOMETRY_UNION", "ST_BOUNDARY", "ST_BUFFER", "ST_DIFFERENCE", 
		"ST_ENVELOPE", "ST_ENVELOPEASPTS", "ST_EXTERIORRING", "ST_INTERSECTION", 
		"ST_SYMDIFFERENCE", "ST_UNION", "ST_AREA", "ST_CENTROID", "ST_CONVEXHULL", 
		"ST_COORDDIM", "ST_DIMENSION", "ST_DISTANCE", "ST_GEOMETRYN", "ST_INTERIORRINGN", 
		"ST_GEOMETRYTYPE", "ST_ISCLOSED", "ST_ISEMPTY", "ST_ISSIMPLE", "ST_ISRING", 
		"ST_ISVALID", "ST_LENGTH", "ST_POINTN", "ST_XMAX", "ST_YMAX", "ST_XMIN", 
		"ST_YMIN", "ST_STARTPOINT", "SIMPLIFY_GEOMETRY", "ST_ENDPOINT", "ST_X", 
		"ST_Y", "ST_INTERIORRINGS", "ST_NUMGEOMETRIES", "ST_GEOMETRIES", "ST_NUMPOINTS", 
		"ST_NUMINTERIORRING", "LINE_LOCATE_POINT", "GEOMETRY_INVALID_REASON", 
		"GREAT_CIRCLE_DISTANCE", "CONVEX_HULL_AGG", "GEOMETRY_UNION_AGG", "BING_TILE", 
		"BING_TILE_AT", "BING_TILES_AROUND", "BING_TILE_COORDINATES", "BING_TILE_POLYGON", 
		"BING_TILE_QUADKEY", "BING_TILE_ZOOM_LEVEL", "GEOMETRY_TO_BING_TILES", 
		"DOLLAR_ACTION", "SPACE", "COMMENT", "LINE_COMMENT", "DOUBLE_QUOTE_ID", 
		"BACKTICK_ID", "SQUARE_BRACKET_ID", "LOCAL_ID", "DECIMAL", "ID", "STRING", 
		"BINARY", "FLOAT", "REAL", "EQUAL", "GREATER", "LESS", "EXCLAMATION", 
		"PLUS_ASSIGN", "MINUS_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
		"AND_ASSIGN", "XOR_ASSIGN", "OR_ASSIGN", "DOT", "UNDERLINE", "AT", "SHARP", 
		"DOLLAR", "LR_BRACKET", "RR_BRACKET", "COMMA", "SEMICOLON", "COLON", "STAR", 
		"DIVIDE", "MODULE", "PLUS", "MINUS", "BIT_NOT", "BIT_OR", "BIT_AND", "BIT_XOR", 
		"BIT_CONCAT", "BIT_LSHIFT", "BIT_RSHIFT", "INDEPENDENT", "DEPENDENT", 
		"SHOW", "UNIFORM", "GET", "STREAM"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DBEstSQLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DBEstSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Dbest_statementContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Stream_select_statementContext stream_select_statement() {
			return getRuleContext(Stream_select_statementContext.class,0);
		}
		public Create_model_statementContext create_model_statement() {
			return getRuleContext(Create_model_statementContext.class,0);
		}
		public Drop_model_statementContext drop_model_statement() {
			return getRuleContext(Drop_model_statementContext.class,0);
		}
		public Drop_all_models_statementContext drop_all_models_statement() {
			return getRuleContext(Drop_all_models_statementContext.class,0);
		}
		public Show_models_statementContext show_models_statement() {
			return getRuleContext(Show_models_statementContext.class,0);
		}
		public Config_statementContext config_statement() {
			return getRuleContext(Config_statementContext.class,0);
		}
		public Other_statementContext other_statement() {
			return getRuleContext(Other_statementContext.class,0);
		}
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public Create_table_as_selectContext create_table_as_select() {
			return getRuleContext(Create_table_as_selectContext.class,0);
		}
		public Create_viewContext create_view() {
			return getRuleContext(Create_viewContext.class,0);
		}
		public Drop_tableContext drop_table() {
			return getRuleContext(Drop_tableContext.class,0);
		}
		public Drop_viewContext drop_view() {
			return getRuleContext(Drop_viewContext.class,0);
		}
		public Dbest_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbest_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitDbest_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dbest_statementContext dbest_statement() throws RecognitionException {
		Dbest_statementContext _localctx = new Dbest_statementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dbest_statement);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				select_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				stream_select_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				create_model_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				drop_model_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				drop_all_models_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				show_models_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				config_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(289);
				other_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(290);
				create_table();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(291);
				create_table_as_select();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(292);
				create_view();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(293);
				drop_table();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(294);
				drop_view();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_model_statementContext extends ParserRuleContext {
		public Table_nameContext model_name;
		public Table_nameContext original_table;
		public Column_nameContext independent_value;
		public Column_nameContext dependent_value;
		public Sampling_method_nameContext sampling_method;
		public Token percent;
		public TerminalNode CREATE() { return getToken(DBEstSQLParser.CREATE, 0); }
		public TerminalNode MODEL() { return getToken(DBEstSQLParser.MODEL, 0); }
		public TerminalNode FROM() { return getToken(DBEstSQLParser.FROM, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode IF() { return getToken(DBEstSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(DBEstSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(DBEstSQLParser.EXISTS, 0); }
		public TerminalNode INDEPENDENT() { return getToken(DBEstSQLParser.INDEPENDENT, 0); }
		public TerminalNode DEPENDENT() { return getToken(DBEstSQLParser.DEPENDENT, 0); }
		public TerminalNode METHOD() { return getToken(DBEstSQLParser.METHOD, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Sampling_method_nameContext sampling_method_name() {
			return getRuleContext(Sampling_method_nameContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(DBEstSQLParser.FLOAT, 0); }
		public TerminalNode RATIO() { return getToken(DBEstSQLParser.RATIO, 0); }
		public Create_model_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_model_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitCreate_model_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_model_statementContext create_model_statement() throws RecognitionException {
		Create_model_statementContext _localctx = new Create_model_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_create_model_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(CREATE);
			setState(298);
			match(MODEL);
			setState(302);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(299);
				match(IF);
				setState(300);
				match(NOT);
				setState(301);
				match(EXISTS);
				}
			}

			setState(304);
			((Create_model_statementContext)_localctx).model_name = table_name();
			setState(305);
			match(FROM);
			setState(306);
			((Create_model_statementContext)_localctx).original_table = table_name();
			setState(312);
			_la = _input.LA(1);
			if (_la==INDEPENDENT) {
				{
				setState(307);
				match(INDEPENDENT);
				setState(308);
				((Create_model_statementContext)_localctx).independent_value = column_name();
				setState(309);
				match(DEPENDENT);
				setState(310);
				((Create_model_statementContext)_localctx).dependent_value = column_name();
				}
			}

			setState(316);
			_la = _input.LA(1);
			if (_la==METHOD) {
				{
				setState(314);
				match(METHOD);
				setState(315);
				((Create_model_statementContext)_localctx).sampling_method = sampling_method_name();
				}
			}

			setState(320);
			_la = _input.LA(1);
			if (_la==RATIO) {
				{
				{
				setState(318);
				match(RATIO);
				}
				setState(319);
				((Create_model_statementContext)_localctx).percent = match(FLOAT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_model_statementContext extends ParserRuleContext {
		public Table_nameContext model_name;
		public Table_nameContext original_table;
		public TerminalNode DROP() { return getToken(DBEstSQLParser.DROP, 0); }
		public TerminalNode MODEL() { return getToken(DBEstSQLParser.MODEL, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode ON() { return getToken(DBEstSQLParser.ON, 0); }
		public Drop_model_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_model_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitDrop_model_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_model_statementContext drop_model_statement() throws RecognitionException {
		Drop_model_statementContext _localctx = new Drop_model_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_drop_model_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(DROP);
			setState(323);
			match(MODEL);
			setState(324);
			((Drop_model_statementContext)_localctx).model_name = table_name();
			setState(327);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(325);
				match(ON);
				setState(326);
				((Drop_model_statementContext)_localctx).original_table = table_name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_all_models_statementContext extends ParserRuleContext {
		public Table_nameContext original_table;
		public TerminalNode DROP() { return getToken(DBEstSQLParser.DROP, 0); }
		public TerminalNode ALL() { return getToken(DBEstSQLParser.ALL, 0); }
		public TerminalNode MODELS() { return getToken(DBEstSQLParser.MODELS, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Drop_all_models_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_all_models_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitDrop_all_models_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_all_models_statementContext drop_all_models_statement() throws RecognitionException {
		Drop_all_models_statementContext _localctx = new Drop_all_models_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_drop_all_models_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(DROP);
			setState(330);
			match(ALL);
			setState(331);
			match(MODELS);
			setState(332);
			((Drop_all_models_statementContext)_localctx).original_table = table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_models_statementContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(DBEstSQLParser.SHOW, 0); }
		public TerminalNode MODELS() { return getToken(DBEstSQLParser.MODELS, 0); }
		public Show_models_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_models_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitShow_models_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_models_statementContext show_models_statement() throws RecognitionException {
		Show_models_statementContext _localctx = new Show_models_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_show_models_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(SHOW);
			setState(335);
			match(MODELS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sampling_method_nameContext extends ParserRuleContext {
		public Config_valueContext config_value() {
			return getRuleContext(Config_valueContext.class,0);
		}
		public TerminalNode HASH() { return getToken(DBEstSQLParser.HASH, 0); }
		public TerminalNode UNIFORM() { return getToken(DBEstSQLParser.UNIFORM, 0); }
		public Sampling_method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampling_method_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitSampling_method_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sampling_method_nameContext sampling_method_name() throws RecognitionException {
		Sampling_method_nameContext _localctx = new Sampling_method_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sampling_method_name);
		try {
			setState(340);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTE_ID:
			case ID:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				config_value();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				match(HASH);
				}
				break;
			case UNIFORM:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				match(UNIFORM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Config_statementContext extends ParserRuleContext {
		public Config_set_statementContext config_set_statement() {
			return getRuleContext(Config_set_statementContext.class,0);
		}
		public Config_get_statementContext config_get_statement() {
			return getRuleContext(Config_get_statementContext.class,0);
		}
		public Config_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitConfig_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Config_statementContext config_statement() throws RecognitionException {
		Config_statementContext _localctx = new Config_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_config_statement);
		try {
			setState(344);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				config_set_statement();
				}
				break;
			case GET:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				config_get_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Other_statementContext extends ParserRuleContext {
		public Use_statementContext use_statement() {
			return getRuleContext(Use_statementContext.class,0);
		}
		public Show_tables_statementContext show_tables_statement() {
			return getRuleContext(Show_tables_statementContext.class,0);
		}
		public Show_databases_statementContext show_databases_statement() {
			return getRuleContext(Show_databases_statementContext.class,0);
		}
		public Describe_table_statementContext describe_table_statement() {
			return getRuleContext(Describe_table_statementContext.class,0);
		}
		public Refresh_statementContext refresh_statement() {
			return getRuleContext(Refresh_statementContext.class,0);
		}
		public Show_config_statementContext show_config_statement() {
			return getRuleContext(Show_config_statementContext.class,0);
		}
		public Create_databaseContext create_database() {
			return getRuleContext(Create_databaseContext.class,0);
		}
		public Drop_databaseContext drop_database() {
			return getRuleContext(Drop_databaseContext.class,0);
		}
		public Other_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitOther_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Other_statementContext other_statement() throws RecognitionException {
		Other_statementContext _localctx = new Other_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_other_statement);
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				use_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				show_tables_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				show_databases_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(349);
				describe_table_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(350);
				refresh_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(351);
				show_config_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(352);
				create_database();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(353);
				drop_database();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_databaseContext extends ParserRuleContext {
		public IdContext database;
		public TerminalNode CREATE() { return getToken(DBEstSQLParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(DBEstSQLParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(DBEstSQLParser.SCHEMA, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Create_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitCreate_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_databaseContext create_database() throws RecognitionException {
		Create_databaseContext _localctx = new Create_databaseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_create_database);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(CREATE);
			setState(357);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			{
			setState(358);
			((Create_databaseContext)_localctx).database = id();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_databaseContext extends ParserRuleContext {
		public IdContext database;
		public TerminalNode DROP() { return getToken(DBEstSQLParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(DBEstSQLParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(DBEstSQLParser.SCHEMA, 0); }
		public TerminalNode IF() { return getToken(DBEstSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(DBEstSQLParser.EXISTS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Drop_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_database; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitDrop_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_databaseContext drop_database() throws RecognitionException {
		Drop_databaseContext _localctx = new Drop_databaseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_drop_database);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(DROP);
			setState(361);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(364);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(362);
				match(IF);
				setState(363);
				match(EXISTS);
				}
			}

			{
			setState(366);
			((Drop_databaseContext)_localctx).database = id();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Config_set_statementContext extends ParserRuleContext {
		public Config_keyContext key;
		public Config_valueContext value;
		public TerminalNode SET() { return getToken(DBEstSQLParser.SET, 0); }
		public Config_keyContext config_key() {
			return getRuleContext(Config_keyContext.class,0);
		}
		public Config_valueContext config_value() {
			return getRuleContext(Config_valueContext.class,0);
		}
		public Config_set_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config_set_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitConfig_set_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Config_set_statementContext config_set_statement() throws RecognitionException {
		Config_set_statementContext _localctx = new Config_set_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_config_set_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(SET);
			setState(369);
			((Config_set_statementContext)_localctx).key = config_key();
			setState(370);
			match(EQUAL);
			setState(371);
			((Config_set_statementContext)_localctx).value = config_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Config_get_statementContext extends ParserRuleContext {
		public Config_keyContext key;
		public TerminalNode GET() { return getToken(DBEstSQLParser.GET, 0); }
		public Config_keyContext config_key() {
			return getRuleContext(Config_keyContext.class,0);
		}
		public Config_get_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config_get_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitConfig_get_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Config_get_statementContext config_get_statement() throws RecognitionException {
		Config_get_statementContext _localctx = new Config_get_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_config_get_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(GET);
			setState(374);
			((Config_get_statementContext)_localctx).key = config_key();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Config_keyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DBEstSQLParser.ID, 0); }
		public Config_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config_key; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitConfig_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Config_keyContext config_key() throws RecognitionException {
		Config_keyContext _localctx = new Config_keyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_config_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Config_valueContext extends ParserRuleContext {
		public TerminalNode DOUBLE_QUOTE_ID() { return getToken(DBEstSQLParser.DOUBLE_QUOTE_ID, 0); }
		public TerminalNode STRING() { return getToken(DBEstSQLParser.STRING, 0); }
		public List<TerminalNode> ID() { return getTokens(DBEstSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBEstSQLParser.ID, i);
		}
		public Config_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitConfig_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Config_valueContext config_value() throws RecognitionException {
		Config_valueContext _localctx = new Config_valueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_config_value);
		int _la;
		try {
			setState(388);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTE_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(DOUBLE_QUOTE_ID);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				match(ID);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(381);
					match(COMMA);
					setState(382);
					match(ID);
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tsql_fileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DBEstSQLParser.EOF, 0); }
		public List<Sql_clauseContext> sql_clause() {
			return getRuleContexts(Sql_clauseContext.class);
		}
		public Sql_clauseContext sql_clause(int i) {
			return getRuleContext(Sql_clauseContext.class,i);
		}
		public Tsql_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsql_file; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitTsql_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tsql_fileContext tsql_file() throws RecognitionException {
		Tsql_fileContext _localctx = new Tsql_fileContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tsql_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << CREATE) | (1L << DESCRIBE) | (1L << DROP))) != 0) || _la==USE || _la==REFRESH || _la==SHOW) {
				{
				{
				setState(390);
				sql_clause();
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_clauseContext extends ParserRuleContext {
		public Ddl_clauseContext ddl_clause() {
			return getRuleContext(Ddl_clauseContext.class,0);
		}
		public Other_statementContext other_statement() {
			return getRuleContext(Other_statementContext.class,0);
		}
		public Sql_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitSql_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_clauseContext sql_clause() throws RecognitionException {
		Sql_clauseContext _localctx = new Sql_clauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sql_clause);
		try {
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				ddl_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				other_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ddl_clauseContext extends ParserRuleContext {
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public Create_viewContext create_view() {
			return getRuleContext(Create_viewContext.class,0);
		}
		public Alter_tableContext alter_table() {
			return getRuleContext(Alter_tableContext.class,0);
		}
		public Alter_databaseContext alter_database() {
			return getRuleContext(Alter_databaseContext.class,0);
		}
		public Drop_tableContext drop_table() {
			return getRuleContext(Drop_tableContext.class,0);
		}
		public Drop_viewContext drop_view() {
			return getRuleContext(Drop_viewContext.class,0);
		}
		public Ddl_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitDdl_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ddl_clauseContext ddl_clause() throws RecognitionException {
		Ddl_clauseContext _localctx = new Ddl_clauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ddl_clause);
		try {
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				create_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				create_view();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				alter_table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(405);
				alter_database();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(406);
				drop_table();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(407);
				drop_view();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_statementContext extends ParserRuleContext {
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public With_expressionContext with_expression() {
			return getRuleContext(With_expressionContext.class,0);
		}
		public TerminalNode EXACT() { return getToken(DBEstSQLParser.EXACT, 0); }
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitSelect_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(410);
				with_expression();
				}
			}

			setState(414);
			_la = _input.LA(1);
			if (_la==EXACT) {
				{
				setState(413);
				match(EXACT);
				}
			}

			setState(416);
			query_expression();
			setState(418);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(417);
				order_by_clause();
				}
			}

			setState(421);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(420);
				limit_clause();
				}
			}

			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(423);
				match(SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stream_select_statementContext extends ParserRuleContext {
		public TerminalNode STREAM() { return getToken(DBEstSQLParser.STREAM, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Stream_select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stream_select_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitStream_select_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stream_select_statementContext stream_select_statement() throws RecognitionException {
		Stream_select_statementContext _localctx = new Stream_select_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stream_select_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(STREAM);
			setState(427);
			select_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_clauseContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(DBEstSQLParser.OUTPUT, 0); }
		public List<Output_dml_list_elemContext> output_dml_list_elem() {
			return getRuleContexts(Output_dml_list_elemContext.class);
		}
		public Output_dml_list_elemContext output_dml_list_elem(int i) {
			return getRuleContext(Output_dml_list_elemContext.class,i);
		}
		public TerminalNode INTO() { return getToken(DBEstSQLParser.INTO, 0); }
		public TerminalNode LOCAL_ID() { return getToken(DBEstSQLParser.LOCAL_ID, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Output_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitOutput_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_clauseContext output_clause() throws RecognitionException {
		Output_clauseContext _localctx = new Output_clauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_output_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(OUTPUT);
			setState(430);
			output_dml_list_elem();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(431);
				match(COMMA);
				setState(432);
				output_dml_list_elem();
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(449);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(438);
				match(INTO);
				setState(441);
				switch (_input.LA(1)) {
				case LOCAL_ID:
					{
					setState(439);
					match(LOCAL_ID);
					}
					break;
				case DISTINCT:
				case LEFT:
				case RIGHT:
				case AGE:
				case AREA:
				case CENTER:
				case CIRCLE:
				case COUNT:
				case DATE:
				case DAY:
				case DAYNAME:
				case DAYOFMONTH:
				case DAYOFWEEK:
				case DAYOFYEAR:
				case DEGREES:
				case DIAMETER:
				case HEIGHT:
				case HOUR:
				case LENGTH:
				case MAKEDATE:
				case MICROSECOND:
				case MINUTE:
				case MOD:
				case MONTH:
				case MONTHNAME:
				case POWER:
				case SCALE:
				case SECOND:
				case TEXT:
				case TIME:
				case TIMESTAMP:
				case VARIANCE:
				case WEEKOFYEAR:
				case DOUBLE_QUOTE_ID:
				case BACKTICK_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(440);
					table_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(447);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(443);
					match(LR_BRACKET);
					setState(444);
					column_name_list();
					setState(445);
					match(RR_BRACKET);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_dml_list_elemContext extends ParserRuleContext {
		public Output_column_nameContext output_column_name() {
			return getRuleContext(Output_column_nameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(DBEstSQLParser.AS, 0); }
		public Output_dml_list_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_dml_list_elem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitOutput_dml_list_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_dml_list_elemContext output_dml_list_elem() throws RecognitionException {
		Output_dml_list_elemContext _localctx = new Output_dml_list_elemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_output_dml_list_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(451);
				output_column_name();
				}
				break;
			case 2:
				{
				setState(452);
				expression(0);
				}
				break;
			}
			setState(459);
			_la = _input.LA(1);
			if (_la==AS || _la==DISTINCT || _la==LEFT || _la==RIGHT || ((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (AGE - 221)) | (1L << (AREA - 221)) | (1L << (CENTER - 221)) | (1L << (CIRCLE - 221)))) != 0) || ((((_la - 286)) & ~0x3f) == 0 && ((1L << (_la - 286)) & ((1L << (COUNT - 286)) | (1L << (DATE - 286)) | (1L << (DAY - 286)) | (1L << (DAYNAME - 286)) | (1L << (DAYOFMONTH - 286)) | (1L << (DAYOFWEEK - 286)) | (1L << (DAYOFYEAR - 286)) | (1L << (DEGREES - 286)) | (1L << (DIAMETER - 286)))) != 0) || ((((_la - 360)) & ~0x3f) == 0 && ((1L << (_la - 360)) & ((1L << (HEIGHT - 360)) | (1L << (HOUR - 360)) | (1L << (LENGTH - 360)))) != 0) || ((((_la - 441)) & ~0x3f) == 0 && ((1L << (_la - 441)) & ((1L << (MAKEDATE - 441)) | (1L << (MICROSECOND - 441)) | (1L << (MINUTE - 441)) | (1L << (MOD - 441)) | (1L << (MONTH - 441)) | (1L << (MONTHNAME - 441)))) != 0) || ((((_la - 509)) & ~0x3f) == 0 && ((1L << (_la - 509)) & ((1L << (POWER - 509)) | (1L << (SCALE - 509)) | (1L << (SECOND - 509)))) != 0) || ((((_la - 611)) & ~0x3f) == 0 && ((1L << (_la - 611)) & ((1L << (TEXT - 611)) | (1L << (TIME - 611)) | (1L << (TIMESTAMP - 611)) | (1L << (VARIANCE - 611)) | (1L << (WEEKOFYEAR - 611)))) != 0) || ((((_la - 767)) & ~0x3f) == 0 && ((1L << (_la - 767)) & ((1L << (DOUBLE_QUOTE_ID - 767)) | (1L << (BACKTICK_ID - 767)) | (1L << (SQUARE_BRACKET_ID - 767)) | (1L << (ID - 767)) | (1L << (STRING - 767)))) != 0)) {
				{
				setState(456);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(455);
					match(AS);
					}
				}

				setState(458);
				column_alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_column_nameContext extends ParserRuleContext {
		public TerminalNode DELETED() { return getToken(DBEstSQLParser.DELETED, 0); }
		public TerminalNode INSERTED() { return getToken(DBEstSQLParser.INSERTED, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode DOLLAR_ACTION() { return getToken(DBEstSQLParser.DOLLAR_ACTION, 0); }
		public Output_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_column_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitOutput_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_column_nameContext output_column_name() throws RecognitionException {
		Output_column_nameContext _localctx = new Output_column_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_output_column_name);
		try {
			setState(472);
			switch (_input.LA(1)) {
			case DISTINCT:
			case LEFT:
			case RIGHT:
			case AGE:
			case AREA:
			case CENTER:
			case CIRCLE:
			case COUNT:
			case DATE:
			case DAY:
			case DAYNAME:
			case DAYOFMONTH:
			case DAYOFWEEK:
			case DAYOFYEAR:
			case DEGREES:
			case DELETED:
			case DIAMETER:
			case HEIGHT:
			case HOUR:
			case INSERTED:
			case LENGTH:
			case MAKEDATE:
			case MICROSECOND:
			case MINUTE:
			case MOD:
			case MONTH:
			case MONTHNAME:
			case POWER:
			case SCALE:
			case SECOND:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case VARIANCE:
			case WEEKOFYEAR:
			case DOUBLE_QUOTE_ID:
			case BACKTICK_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				switch (_input.LA(1)) {
				case DELETED:
					{
					setState(461);
					match(DELETED);
					}
					break;
				case INSERTED:
					{
					setState(462);
					match(INSERTED);
					}
					break;
				case DISTINCT:
				case LEFT:
				case RIGHT:
				case AGE:
				case AREA:
				case CENTER:
				case CIRCLE:
				case COUNT:
				case DATE:
				case DAY:
				case DAYNAME:
				case DAYOFMONTH:
				case DAYOFWEEK:
				case DAYOFYEAR:
				case DEGREES:
				case DIAMETER:
				case HEIGHT:
				case HOUR:
				case LENGTH:
				case MAKEDATE:
				case MICROSECOND:
				case MINUTE:
				case MOD:
				case MONTH:
				case MONTHNAME:
				case POWER:
				case SCALE:
				case SECOND:
				case TEXT:
				case TIME:
				case TIMESTAMP:
				case VARIANCE:
				case WEEKOFYEAR:
				case DOUBLE_QUOTE_ID:
				case BACKTICK_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(463);
					table_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(466);
				match(DOT);
				setState(469);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(467);
					match(STAR);
					}
					break;
				case DISTINCT:
				case LEFT:
				case RIGHT:
				case AGE:
				case AREA:
				case CENTER:
				case CIRCLE:
				case COUNT:
				case DATE:
				case DAY:
				case DAYNAME:
				case DAYOFMONTH:
				case DAYOFWEEK:
				case DAYOFYEAR:
				case DEGREES:
				case DIAMETER:
				case HEIGHT:
				case HOUR:
				case LENGTH:
				case MAKEDATE:
				case MICROSECOND:
				case MINUTE:
				case MOD:
				case MONTH:
				case MONTHNAME:
				case POWER:
				case SCALE:
				case SECOND:
				case TEXT:
				case TIME:
				case TIMESTAMP:
				case VARIANCE:
				case WEEKOFYEAR:
				case DOUBLE_QUOTE_ID:
				case BACKTICK_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(468);
					column_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case DOLLAR_ACTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				match(DOLLAR_ACTION);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_tableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(DBEstSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(DBEstSQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Column_def_table_constraintContext> column_def_table_constraint() {
			return getRuleContexts(Column_def_table_constraintContext.class);
		}
		public Column_def_table_constraintContext column_def_table_constraint(int i) {
			return getRuleContext(Column_def_table_constraintContext.class,i);
		}
		public Create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitCreate_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_create_table);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(CREATE);
			setState(475);
			match(TABLE);
			setState(476);
			table_name();
			setState(477);
			match(LR_BRACKET);
			setState(478);
			column_def_table_constraint();
			setState(485);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(480);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(479);
						match(COMMA);
						}
					}

					setState(482);
					column_def_table_constraint();
					}
					} 
				}
				setState(487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(489);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(488);
				match(COMMA);
				}
			}

			setState(491);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_as_selectContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(DBEstSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(DBEstSQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(DBEstSQLParser.AS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode IF() { return getToken(DBEstSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(DBEstSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(DBEstSQLParser.EXISTS, 0); }
		public TerminalNode STORED_AS_PARQUET() { return getToken(DBEstSQLParser.STORED_AS_PARQUET, 0); }
		public Create_table_as_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_as_select; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitCreate_table_as_select(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_as_selectContext create_table_as_select() throws RecognitionException {
		Create_table_as_selectContext _localctx = new Create_table_as_selectContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_create_table_as_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(CREATE);
			setState(494);
			match(TABLE);
			setState(498);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(495);
				match(IF);
				setState(496);
				match(NOT);
				setState(497);
				match(EXISTS);
				}
			}

			setState(500);
			table_name();
			setState(502);
			_la = _input.LA(1);
			if (_la==STORED_AS_PARQUET) {
				{
				setState(501);
				match(STORED_AS_PARQUET);
				}
			}

			setState(504);
			match(AS);
			setState(505);
			select_statement();
			setState(507);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(506);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_viewContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(DBEstSQLParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(DBEstSQLParser.VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(DBEstSQLParser.AS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode WITH() { return getToken(DBEstSQLParser.WITH, 0); }
		public TerminalNode CHECK() { return getToken(DBEstSQLParser.CHECK, 0); }
		public TerminalNode OPTION() { return getToken(DBEstSQLParser.OPTION, 0); }
		public Create_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitCreate_view(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_viewContext create_view() throws RecognitionException {
		Create_viewContext _localctx = new Create_viewContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_create_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(CREATE);
			setState(510);
			match(VIEW);
			setState(511);
			view_name();
			setState(523);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(512);
				match(LR_BRACKET);
				setState(513);
				column_name();
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(514);
					match(COMMA);
					setState(515);
					column_name();
					}
					}
					setState(520);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(521);
				match(RR_BRACKET);
				}
			}

			setState(525);
			match(AS);
			setState(526);
			select_statement();
			setState(530);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(527);
				match(WITH);
				setState(528);
				match(CHECK);
				setState(529);
				match(OPTION);
				}
			}

			setState(533);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(532);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_tableContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(DBEstSQLParser.ALTER, 0); }
		public List<TerminalNode> TABLE() { return getTokens(DBEstSQLParser.TABLE); }
		public TerminalNode TABLE(int i) {
			return getToken(DBEstSQLParser.TABLE, i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode SET() { return getToken(DBEstSQLParser.SET, 0); }
		public TerminalNode LOCK_ESCALATION() { return getToken(DBEstSQLParser.LOCK_ESCALATION, 0); }
		public TerminalNode AUTO() { return getToken(DBEstSQLParser.AUTO, 0); }
		public TerminalNode DISABLE() { return getToken(DBEstSQLParser.DISABLE, 0); }
		public TerminalNode ADD() { return getToken(DBEstSQLParser.ADD, 0); }
		public Column_def_table_constraintContext column_def_table_constraint() {
			return getRuleContext(Column_def_table_constraintContext.class,0);
		}
		public Alter_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitAlter_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_tableContext alter_table() throws RecognitionException {
		Alter_tableContext _localctx = new Alter_tableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_alter_table);
		int _la;
		try {
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				match(ALTER);
				setState(536);
				match(TABLE);
				setState(537);
				table_name();
				setState(538);
				match(SET);
				setState(539);
				match(LR_BRACKET);
				setState(540);
				match(LOCK_ESCALATION);
				setState(541);
				match(EQUAL);
				setState(542);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==AUTO || _la==DISABLE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(543);
				match(RR_BRACKET);
				setState(545);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(544);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				match(ALTER);
				setState(548);
				match(TABLE);
				setState(549);
				table_name();
				setState(550);
				match(ADD);
				setState(551);
				column_def_table_constraint();
				setState(553);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(552);
					match(SEMICOLON);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_databaseContext extends ParserRuleContext {
		public IdContext database;
		public IdContext new_name;
		public TerminalNode ALTER() { return getToken(DBEstSQLParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(DBEstSQLParser.DATABASE, 0); }
		public TerminalNode MODIFY() { return getToken(DBEstSQLParser.MODIFY, 0); }
		public TerminalNode NAME() { return getToken(DBEstSQLParser.NAME, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode CURRENT() { return getToken(DBEstSQLParser.CURRENT, 0); }
		public Alter_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_database; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitAlter_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_databaseContext alter_database() throws RecognitionException {
		Alter_databaseContext _localctx = new Alter_databaseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_alter_database);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(ALTER);
			setState(558);
			match(DATABASE);
			setState(561);
			switch (_input.LA(1)) {
			case DISTINCT:
			case LEFT:
			case RIGHT:
			case AGE:
			case AREA:
			case CENTER:
			case CIRCLE:
			case COUNT:
			case DATE:
			case DAY:
			case DAYNAME:
			case DAYOFMONTH:
			case DAYOFWEEK:
			case DAYOFYEAR:
			case DEGREES:
			case DIAMETER:
			case HEIGHT:
			case HOUR:
			case LENGTH:
			case MAKEDATE:
			case MICROSECOND:
			case MINUTE:
			case MOD:
			case MONTH:
			case MONTHNAME:
			case POWER:
			case SCALE:
			case SECOND:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case VARIANCE:
			case WEEKOFYEAR:
			case DOUBLE_QUOTE_ID:
			case BACKTICK_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				{
				setState(559);
				((Alter_databaseContext)_localctx).database = id();
				}
				break;
			case CURRENT:
				{
				setState(560);
				match(CURRENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(563);
			match(MODIFY);
			setState(564);
			match(NAME);
			setState(565);
			match(EQUAL);
			setState(566);
			((Alter_databaseContext)_localctx).new_name = id();
			setState(568);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(567);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_tableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(DBEstSQLParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(DBEstSQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode IF() { return getToken(DBEstSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(DBEstSQLParser.EXISTS, 0); }
		public Drop_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitDrop_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_tableContext drop_table() throws RecognitionException {
		Drop_tableContext _localctx = new Drop_tableContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_drop_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(DROP);
			setState(571);
			match(TABLE);
			setState(574);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(572);
				match(IF);
				setState(573);
				match(EXISTS);
				}
			}

			setState(576);
			table_name();
			setState(578);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(577);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_viewContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(DBEstSQLParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(DBEstSQLParser.VIEW, 0); }
		public List<View_nameContext> view_name() {
			return getRuleContexts(View_nameContext.class);
		}
		public View_nameContext view_name(int i) {
			return getRuleContext(View_nameContext.class,i);
		}
		public TerminalNode IF() { return getToken(DBEstSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(DBEstSQLParser.EXISTS, 0); }
		public Drop_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitDrop_view(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_viewContext drop_view() throws RecognitionException {
		Drop_viewContext _localctx = new Drop_viewContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_drop_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(DROP);
			setState(581);
			match(VIEW);
			setState(584);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(582);
				match(IF);
				setState(583);
				match(EXISTS);
				}
			}

			setState(586);
			view_name();
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(587);
				match(COMMA);
				setState(588);
				view_name();
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(595);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(594);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_statmentContext extends ParserRuleContext {
		public IdContext member_name;
		public TerminalNode SET() { return getToken(DBEstSQLParser.SET, 0); }
		public TerminalNode LOCAL_ID() { return getToken(DBEstSQLParser.LOCAL_ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Set_specialContext set_special() {
			return getRuleContext(Set_specialContext.class,0);
		}
		public Set_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_statment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitSet_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_statmentContext set_statment() throws RecognitionException {
		Set_statmentContext _localctx = new Set_statmentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_set_statment);
		int _la;
		try {
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				match(SET);
				setState(598);
				match(LOCAL_ID);
				setState(601);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(599);
					match(DOT);
					setState(600);
					((Set_statmentContext)_localctx).member_name = id();
					}
				}

				setState(603);
				match(EQUAL);
				setState(604);
				expression(0);
				setState(606);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(605);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				match(SET);
				setState(609);
				match(LOCAL_ID);
				setState(610);
				assignment_operator();
				setState(611);
				expression(0);
				setState(613);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(612);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(615);
				set_special();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Use_statementContext extends ParserRuleContext {
		public IdContext database;
		public TerminalNode USE() { return getToken(DBEstSQLParser.USE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Use_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitUse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_statementContext use_statement() throws RecognitionException {
		Use_statementContext _localctx = new Use_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_use_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(USE);
			setState(619);
			((Use_statementContext)_localctx).database = id();
			setState(621);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(620);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_tables_statementContext extends ParserRuleContext {
		public IdContext schema;
		public TerminalNode SHOW() { return getToken(DBEstSQLParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(DBEstSQLParser.TABLES, 0); }
		public TerminalNode IN() { return getToken(DBEstSQLParser.IN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Show_tables_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_tables_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitShow_tables_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_tables_statementContext show_tables_statement() throws RecognitionException {
		Show_tables_statementContext _localctx = new Show_tables_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_show_tables_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(SHOW);
			setState(624);
			match(TABLES);
			setState(627);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(625);
				match(IN);
				setState(626);
				((Show_tables_statementContext)_localctx).schema = id();
				}
			}

			setState(630);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(629);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_databases_statementContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(DBEstSQLParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(DBEstSQLParser.DATABASES, 0); }
		public TerminalNode SCHEMAS() { return getToken(DBEstSQLParser.SCHEMAS, 0); }
		public Show_databases_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_databases_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitShow_databases_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_databases_statementContext show_databases_statement() throws RecognitionException {
		Show_databases_statementContext _localctx = new Show_databases_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_show_databases_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(SHOW);
			setState(633);
			_la = _input.LA(1);
			if ( !(_la==DATABASES || _la==SCHEMAS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Describe_table_statementContext extends ParserRuleContext {
		public Table_nameContext table;
		public TerminalNode DESCRIBE() { return getToken(DBEstSQLParser.DESCRIBE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Describe_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describe_table_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitDescribe_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Describe_table_statementContext describe_table_statement() throws RecognitionException {
		Describe_table_statementContext _localctx = new Describe_table_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_describe_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(DESCRIBE);
			setState(636);
			((Describe_table_statementContext)_localctx).table = table_name();
			setState(638);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(637);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Refresh_statementContext extends ParserRuleContext {
		public IdContext schema;
		public TerminalNode REFRESH() { return getToken(DBEstSQLParser.REFRESH, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Refresh_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refresh_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitRefresh_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Refresh_statementContext refresh_statement() throws RecognitionException {
		Refresh_statementContext _localctx = new Refresh_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_refresh_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(REFRESH);
			setState(642);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==LEFT || _la==RIGHT || ((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (AGE - 221)) | (1L << (AREA - 221)) | (1L << (CENTER - 221)) | (1L << (CIRCLE - 221)))) != 0) || ((((_la - 286)) & ~0x3f) == 0 && ((1L << (_la - 286)) & ((1L << (COUNT - 286)) | (1L << (DATE - 286)) | (1L << (DAY - 286)) | (1L << (DAYNAME - 286)) | (1L << (DAYOFMONTH - 286)) | (1L << (DAYOFWEEK - 286)) | (1L << (DAYOFYEAR - 286)) | (1L << (DEGREES - 286)) | (1L << (DIAMETER - 286)))) != 0) || ((((_la - 360)) & ~0x3f) == 0 && ((1L << (_la - 360)) & ((1L << (HEIGHT - 360)) | (1L << (HOUR - 360)) | (1L << (LENGTH - 360)))) != 0) || ((((_la - 441)) & ~0x3f) == 0 && ((1L << (_la - 441)) & ((1L << (MAKEDATE - 441)) | (1L << (MICROSECOND - 441)) | (1L << (MINUTE - 441)) | (1L << (MOD - 441)) | (1L << (MONTH - 441)) | (1L << (MONTHNAME - 441)))) != 0) || ((((_la - 509)) & ~0x3f) == 0 && ((1L << (_la - 509)) & ((1L << (POWER - 509)) | (1L << (SCALE - 509)) | (1L << (SECOND - 509)))) != 0) || ((((_la - 611)) & ~0x3f) == 0 && ((1L << (_la - 611)) & ((1L << (TEXT - 611)) | (1L << (TIME - 611)) | (1L << (TIMESTAMP - 611)) | (1L << (VARIANCE - 611)) | (1L << (WEEKOFYEAR - 611)))) != 0) || ((((_la - 767)) & ~0x3f) == 0 && ((1L << (_la - 767)) & ((1L << (DOUBLE_QUOTE_ID - 767)) | (1L << (BACKTICK_ID - 767)) | (1L << (SQUARE_BRACKET_ID - 767)) | (1L << (ID - 767)))) != 0)) {
				{
				setState(641);
				((Refresh_statementContext)_localctx).schema = id();
				}
			}

			setState(645);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(644);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_config_statementContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(DBEstSQLParser.SHOW, 0); }
		public TerminalNode CONFIG() { return getToken(DBEstSQLParser.CONFIG, 0); }
		public Show_config_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_config_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitShow_config_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_config_statementContext show_config_statement() throws RecognitionException {
		Show_config_statementContext _localctx = new Show_config_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_show_config_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(SHOW);
			setState(648);
			match(CONFIG);
			setState(650);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(649);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_type_definitionContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(DBEstSQLParser.TABLE, 0); }
		public List<Column_def_table_constraintContext> column_def_table_constraint() {
			return getRuleContexts(Column_def_table_constraintContext.class);
		}
		public Column_def_table_constraintContext column_def_table_constraint(int i) {
			return getRuleContext(Column_def_table_constraintContext.class,i);
		}
		public Table_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_type_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitTable_type_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_type_definitionContext table_type_definition() throws RecognitionException {
		Table_type_definitionContext _localctx = new Table_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_table_type_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(TABLE);
			setState(653);
			match(LR_BRACKET);
			setState(654);
			column_def_table_constraint();
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONSTRAINT || _la==DISTINCT || _la==LEFT || _la==RIGHT || ((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (AGE - 221)) | (1L << (AREA - 221)) | (1L << (CENTER - 221)) | (1L << (CIRCLE - 221)))) != 0) || ((((_la - 286)) & ~0x3f) == 0 && ((1L << (_la - 286)) & ((1L << (COUNT - 286)) | (1L << (DATE - 286)) | (1L << (DAY - 286)) | (1L << (DAYNAME - 286)) | (1L << (DAYOFMONTH - 286)) | (1L << (DAYOFWEEK - 286)) | (1L << (DAYOFYEAR - 286)) | (1L << (DEGREES - 286)) | (1L << (DIAMETER - 286)))) != 0) || ((((_la - 360)) & ~0x3f) == 0 && ((1L << (_la - 360)) & ((1L << (HEIGHT - 360)) | (1L << (HOUR - 360)) | (1L << (LENGTH - 360)))) != 0) || ((((_la - 441)) & ~0x3f) == 0 && ((1L << (_la - 441)) & ((1L << (MAKEDATE - 441)) | (1L << (MICROSECOND - 441)) | (1L << (MINUTE - 441)) | (1L << (MOD - 441)) | (1L << (MONTH - 441)) | (1L << (MONTHNAME - 441)))) != 0) || ((((_la - 509)) & ~0x3f) == 0 && ((1L << (_la - 509)) & ((1L << (POWER - 509)) | (1L << (SCALE - 509)) | (1L << (SECOND - 509)))) != 0) || ((((_la - 611)) & ~0x3f) == 0 && ((1L << (_la - 611)) & ((1L << (TEXT - 611)) | (1L << (TIME - 611)) | (1L << (TIMESTAMP - 611)) | (1L << (VARIANCE - 611)) | (1L << (WEEKOFYEAR - 611)))) != 0) || ((((_la - 767)) & ~0x3f) == 0 && ((1L << (_la - 767)) & ((1L << (DOUBLE_QUOTE_ID - 767)) | (1L << (BACKTICK_ID - 767)) | (1L << (SQUARE_BRACKET_ID - 767)) | (1L << (ID - 767)) | (1L << (LR_BRACKET - 767)) | (1L << (COMMA - 767)))) != 0)) {
				{
				{
				setState(656);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(655);
					match(COMMA);
					}
				}

				setState(658);
				column_def_table_constraint();
				}
				}
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(664);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_def_table_constraintContext extends ParserRuleContext {
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Column_def_table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def_table_constraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitColumn_def_table_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_def_table_constraintContext column_def_table_constraint() throws RecognitionException {
		Column_def_table_constraintContext _localctx = new Column_def_table_constraintContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_column_def_table_constraint);
		try {
			setState(668);
			switch (_input.LA(1)) {
			case DISTINCT:
			case LEFT:
			case RIGHT:
			case AGE:
			case AREA:
			case CENTER:
			case CIRCLE:
			case COUNT:
			case DATE:
			case DAY:
			case DAYNAME:
			case DAYOFMONTH:
			case DAYOFWEEK:
			case DAYOFYEAR:
			case DEGREES:
			case DIAMETER:
			case HEIGHT:
			case HOUR:
			case LENGTH:
			case MAKEDATE:
			case MICROSECOND:
			case MINUTE:
			case MOD:
			case MONTH:
			case MONTHNAME:
			case POWER:
			case SCALE:
			case SECOND:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case VARIANCE:
			case WEEKOFYEAR:
			case DOUBLE_QUOTE_ID:
			case BACKTICK_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(666);
				column_definition();
				}
				break;
			case CONSTRAINT:
			case LR_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				table_constraint();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_definitionContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode AS() { return getToken(DBEstSQLParser.AS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Null_notnullContext null_notnull() {
			return getRuleContext(Null_notnullContext.class,0);
		}
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitColumn_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_column_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			column_name();
			setState(674);
			switch (_input.LA(1)) {
			case DISTINCT:
			case DOUBLE:
			case LEFT:
			case RIGHT:
			case AGE:
			case AREA:
			case BIGINT:
			case BIT:
			case CENTER:
			case CHAR:
			case CIRCLE:
			case COUNT:
			case DATE:
			case DATETIME:
			case DATETIME2:
			case DATETIMEOFFSET:
			case DAY:
			case DAYNAME:
			case DAYOFMONTH:
			case DAYOFWEEK:
			case DAYOFYEAR:
			case DEGREES:
			case DIAMETER:
			case GEOGRAPHY:
			case GEOMETRY:
			case HEIGHT:
			case HIERARCHYID:
			case HOUR:
			case IMAGE:
			case INT:
			case LENGTH:
			case MAKEDATE:
			case MAX:
			case MICROSECOND:
			case MINUTE:
			case MOD:
			case MONEY:
			case MONTH:
			case MONTHNAME:
			case NCHAR:
			case NTEXT:
			case NUMERIC:
			case NVARCHAR:
			case POWER:
			case SCALE:
			case SECOND:
			case SMALLDATETIME:
			case SMALLINT:
			case SMALLMONEY:
			case SQL_VARIANT:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TINYINT:
			case UNIQUEIDENTIFIER:
			case VARBINARY:
			case VARCHAR:
			case VARIANCE:
			case WEEKOFYEAR:
			case XML:
			case DOUBLE_QUOTE_ID:
			case BACKTICK_ID:
			case SQUARE_BRACKET_ID:
			case DECIMAL:
			case ID:
			case BINARY:
			case FLOAT:
			case REAL:
				{
				setState(671);
				data_type();
				}
				break;
			case AS:
				{
				setState(672);
				match(AS);
				setState(673);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(677);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(676);
				null_notnull();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(DBEstSQLParser.CONSTRAINT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Null_notnullContext null_notnull() {
			return getRuleContext(Null_notnullContext.class,0);
		}
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(679);
				match(CONSTRAINT);
				setState(680);
				id();
				}
			}

			setState(684);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(683);
				null_notnull();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(DBEstSQLParser.CONSTRAINT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(686);
				match(CONSTRAINT);
				setState(687);
				id();
				}
			}

			setState(690);
			match(LR_BRACKET);
			setState(691);
			column_name_list();
			setState(692);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_specialContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(DBEstSQLParser.SET, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(DBEstSQLParser.LOCAL_ID, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public TerminalNode TRANSACTION() { return getToken(DBEstSQLParser.TRANSACTION, 0); }
		public TerminalNode ISOLATION() { return getToken(DBEstSQLParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(DBEstSQLParser.LEVEL, 0); }
		public TerminalNode READ() { return getToken(DBEstSQLParser.READ, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(DBEstSQLParser.UNCOMMITTED, 0); }
		public TerminalNode COMMITTED() { return getToken(DBEstSQLParser.COMMITTED, 0); }
		public TerminalNode REPEATABLE() { return getToken(DBEstSQLParser.REPEATABLE, 0); }
		public TerminalNode SNAPSHOT() { return getToken(DBEstSQLParser.SNAPSHOT, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(DBEstSQLParser.SERIALIZABLE, 0); }
		public TerminalNode IDENTITY_INSERT() { return getToken(DBEstSQLParser.IDENTITY_INSERT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Set_specialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_special; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitSet_special(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_specialContext set_special() throws RecognitionException {
		Set_specialContext _localctx = new Set_specialContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_set_special);
		int _la;
		try {
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				match(SET);
				setState(695);
				id();
				setState(700);
				switch (_input.LA(1)) {
				case DISTINCT:
				case LEFT:
				case RIGHT:
				case AGE:
				case AREA:
				case CENTER:
				case CIRCLE:
				case COUNT:
				case DATE:
				case DAY:
				case DAYNAME:
				case DAYOFMONTH:
				case DAYOFWEEK:
				case DAYOFYEAR:
				case DEGREES:
				case DIAMETER:
				case HEIGHT:
				case HOUR:
				case LENGTH:
				case MAKEDATE:
				case MICROSECOND:
				case MINUTE:
				case MOD:
				case MONTH:
				case MONTHNAME:
				case POWER:
				case SCALE:
				case SECOND:
				case TEXT:
				case TIME:
				case TIMESTAMP:
				case VARIANCE:
				case WEEKOFYEAR:
				case DOUBLE_QUOTE_ID:
				case BACKTICK_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(696);
					id();
					}
					break;
				case DECIMAL:
				case STRING:
				case BINARY:
				case FLOAT:
				case REAL:
				case DOLLAR:
				case PLUS:
				case MINUS:
					{
					setState(697);
					constant();
					}
					break;
				case LOCAL_ID:
					{
					setState(698);
					match(LOCAL_ID);
					}
					break;
				case OFF:
				case ON:
					{
					setState(699);
					on_off();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(703);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(702);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				match(SET);
				setState(706);
				match(TRANSACTION);
				setState(707);
				match(ISOLATION);
				setState(708);
				match(LEVEL);
				setState(717);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(709);
					match(READ);
					setState(710);
					match(UNCOMMITTED);
					}
					break;
				case 2:
					{
					setState(711);
					match(READ);
					setState(712);
					match(COMMITTED);
					}
					break;
				case 3:
					{
					setState(713);
					match(REPEATABLE);
					setState(714);
					match(READ);
					}
					break;
				case 4:
					{
					setState(715);
					match(SNAPSHOT);
					}
					break;
				case 5:
					{
					setState(716);
					match(SERIALIZABLE);
					}
					break;
				}
				setState(720);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(719);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(722);
				match(SET);
				setState(723);
				match(IDENTITY_INSERT);
				setState(724);
				table_name();
				setState(725);
				on_off();
				setState(727);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(726);
					match(SEMICOLON);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Not_expressionContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(DBEstSQLParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Not_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitNot_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Binary_operator_expressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public Binary_operator_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitBinary_operator_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Primitive_expressionContext extends ExpressionContext {
		public TerminalNode NULL() { return getToken(DBEstSQLParser.NULL, 0); }
		public TerminalNode LOCAL_ID() { return getToken(DBEstSQLParser.LOCAL_ID, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public True_orfalseContext true_orfalse() {
			return getRuleContext(True_orfalseContext.class,0);
		}
		public Primitive_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitPrimitive_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Date_expressionContext extends ExpressionContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public Date_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitDate_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bracket_expressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bracket_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitBracket_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Unary_operator_expressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Unary_operator_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitUnary_operator_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Interval_expressionContext extends ExpressionContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public Interval_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitInterval_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Function_call_expressionContext extends ExpressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(DBEstSQLParser.COLLATE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_call_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitFunction_call_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Is_null_expressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IS() { return getToken(DBEstSQLParser.IS, 0); }
		public Null_notnullContext null_notnull() {
			return getRuleContext(Null_notnullContext.class,0);
		}
		public Is_null_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitIs_null_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Case_expressionContext extends ExpressionContext {
		public Case_exprContext case_expr() {
			return getRuleContext(Case_exprContext.class,0);
		}
		public Case_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitCase_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Column_ref_expressionContext extends ExpressionContext {
		public Full_column_nameContext full_column_name() {
			return getRuleContext(Full_column_nameContext.class,0);
		}
		public Column_ref_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitColumn_ref_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Subquery_expressionContext extends ExpressionContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Subquery_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitSubquery_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				_localctx = new Primitive_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(732);
				match(NULL);
				}
				break;
			case 2:
				{
				_localctx = new Primitive_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(733);
				match(LOCAL_ID);
				}
				break;
			case 3:
				{
				_localctx = new Primitive_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(734);
				constant();
				}
				break;
			case 4:
				{
				_localctx = new Primitive_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(735);
				true_orfalse();
				}
				break;
			case 5:
				{
				_localctx = new Case_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(736);
				case_expr();
				}
				break;
			case 6:
				{
				_localctx = new Column_ref_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(737);
				full_column_name();
				}
				break;
			case 7:
				{
				_localctx = new Bracket_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(738);
				match(LR_BRACKET);
				setState(739);
				expression(0);
				setState(740);
				match(RR_BRACKET);
				}
				break;
			case 8:
				{
				_localctx = new Subquery_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(742);
				match(LR_BRACKET);
				setState(743);
				subquery();
				setState(744);
				match(RR_BRACKET);
				}
				break;
			case 9:
				{
				_localctx = new Unary_operator_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(746);
				match(BIT_NOT);
				setState(747);
				expression(11);
				}
				break;
			case 10:
				{
				_localctx = new Unary_operator_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(748);
				((Unary_operator_expressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Unary_operator_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(749);
				expression(9);
				}
				break;
			case 11:
				{
				_localctx = new Not_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(750);
				match(NOT);
				setState(751);
				expression(6);
				}
				break;
			case 12:
				{
				_localctx = new Interval_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(752);
				interval();
				}
				break;
			case 13:
				{
				_localctx = new Date_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(753);
				date();
				}
				break;
			case 14:
				{
				_localctx = new Function_call_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(754);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(775);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(773);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						_localctx = new Binary_operator_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(757);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(758);
						((Binary_operator_expressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 799)) & ~0x3f) == 0 && ((1L << (_la - 799)) & ((1L << (STAR - 799)) | (1L << (DIVIDE - 799)) | (1L << (MODULE - 799)))) != 0)) ) {
							((Binary_operator_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(759);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new Binary_operator_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(760);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(761);
						((Binary_operator_expressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 792)) & ~0x3f) == 0 && ((1L << (_la - 792)) & ((1L << (SHARP - 792)) | (1L << (PLUS - 792)) | (1L << (MINUS - 792)) | (1L << (BIT_OR - 792)) | (1L << (BIT_AND - 792)) | (1L << (BIT_XOR - 792)) | (1L << (BIT_CONCAT - 792)) | (1L << (BIT_LSHIFT - 792)) | (1L << (BIT_RSHIFT - 792)))) != 0)) ) {
							((Binary_operator_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(762);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new Binary_operator_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(763);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(764);
						comparison_operator();
						setState(765);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new Is_null_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(767);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(768);
						match(IS);
						setState(769);
						null_notnull();
						}
						break;
					case 5:
						{
						_localctx = new Function_call_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(770);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(771);
						match(COLLATE);
						setState(772);
						id();
						}
						break;
					}
					} 
				}
				setState(777);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(DBEstSQLParser.INTERVAL, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public TerminalNode DAY() { return getToken(DBEstSQLParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(DBEstSQLParser.DAYS, 0); }
		public TerminalNode MONTH() { return getToken(DBEstSQLParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(DBEstSQLParser.MONTHS, 0); }
		public TerminalNode YEAR() { return getToken(DBEstSQLParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(DBEstSQLParser.YEARS, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(INTERVAL);
			setState(779);
			constant_expression();
			setState(780);
			_la = _input.LA(1);
			if ( !(_la==DAY || _la==DAYS || _la==MONTH || _la==MONTHS || _la==YEAR || _la==YEARS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(DBEstSQLParser.DATE, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(DATE);
			setState(783);
			constant_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_expressionContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(DBEstSQLParser.NULL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(DBEstSQLParser.LOCAL_ID, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitConstant_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_constant_expression);
		try {
			setState(792);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(785);
				match(NULL);
				}
				break;
			case DECIMAL:
			case STRING:
			case BINARY:
			case FLOAT:
			case REAL:
			case DOLLAR:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(786);
				constant();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(787);
				match(LOCAL_ID);
				}
				break;
			case LR_BRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(788);
				match(LR_BRACKET);
				setState(789);
				constant_expression();
				setState(790);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			select_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dml_table_sourceContext extends ParserRuleContext {
		public Query_specificationContext query_specification() {
			return getRuleContext(Query_specificationContext.class,0);
		}
		public Dml_table_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dml_table_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitDml_table_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dml_table_sourceContext dml_table_source() throws RecognitionException {
		Dml_table_sourceContext _localctx = new Dml_table_sourceContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_dml_table_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			query_specification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_expressionContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(DBEstSQLParser.WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode XMLNAMESPACES() { return getToken(DBEstSQLParser.XMLNAMESPACES, 0); }
		public With_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitWith_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_expressionContext with_expression() throws RecognitionException {
		With_expressionContext _localctx = new With_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_with_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(WITH);
			setState(801);
			_la = _input.LA(1);
			if (_la==XMLNAMESPACES) {
				{
				setState(799);
				match(XMLNAMESPACES);
				setState(800);
				match(COMMA);
				}
			}

			setState(803);
			common_table_expression();
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(804);
				match(COMMA);
				setState(805);
				common_table_expression();
				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_table_expressionContext extends ParserRuleContext {
		public IdContext expression_name;
		public TerminalNode AS() { return getToken(DBEstSQLParser.AS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			((Common_table_expressionContext)_localctx).expression_name = id();
			setState(816);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(812);
				match(LR_BRACKET);
				setState(813);
				column_name_list();
				setState(814);
				match(RR_BRACKET);
				}
			}

			setState(818);
			match(AS);
			setState(819);
			match(LR_BRACKET);
			setState(820);
			select_statement();
			setState(821);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_elemContext extends ParserRuleContext {
		public IdContext udt_column_name;
		public IdContext method_name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Full_column_nameContext full_column_name() {
			return getRuleContext(Full_column_nameContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(DBEstSQLParser.LOCAL_ID, 0); }
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Update_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_elem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitUpdate_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_elemContext update_elem() throws RecognitionException {
		Update_elemContext _localctx = new Update_elemContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_update_elem);
		try {
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(825);
				switch (_input.LA(1)) {
				case DISTINCT:
				case LEFT:
				case RIGHT:
				case AGE:
				case AREA:
				case CENTER:
				case CIRCLE:
				case COUNT:
				case DATE:
				case DAY:
				case DAYNAME:
				case DAYOFMONTH:
				case DAYOFWEEK:
				case DAYOFYEAR:
				case DEGREES:
				case DIAMETER:
				case HEIGHT:
				case HOUR:
				case LENGTH:
				case MAKEDATE:
				case MICROSECOND:
				case MINUTE:
				case MOD:
				case MONTH:
				case MONTHNAME:
				case POWER:
				case SCALE:
				case SECOND:
				case TEXT:
				case TIME:
				case TIMESTAMP:
				case VARIANCE:
				case WEEKOFYEAR:
				case DOUBLE_QUOTE_ID:
				case BACKTICK_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(823);
					full_column_name();
					}
					break;
				case LOCAL_ID:
					{
					setState(824);
					match(LOCAL_ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(829);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(827);
					match(EQUAL);
					}
					break;
				case PLUS_ASSIGN:
				case MINUS_ASSIGN:
				case MULT_ASSIGN:
				case DIV_ASSIGN:
				case MOD_ASSIGN:
				case AND_ASSIGN:
				case XOR_ASSIGN:
				case OR_ASSIGN:
					{
					setState(828);
					assignment_operator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(831);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(832);
				((Update_elemContext)_localctx).udt_column_name = id();
				setState(833);
				match(DOT);
				setState(834);
				((Update_elemContext)_localctx).method_name = id();
				setState(835);
				match(LR_BRACKET);
				setState(836);
				expression_list();
				setState(837);
				match(RR_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Search_condition_listContext extends ParserRuleContext {
		public List<Search_conditionContext> search_condition() {
			return getRuleContexts(Search_conditionContext.class);
		}
		public Search_conditionContext search_condition(int i) {
			return getRuleContext(Search_conditionContext.class,i);
		}
		public Search_condition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitSearch_condition_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_condition_listContext search_condition_list() throws RecognitionException {
		Search_condition_listContext _localctx = new Search_condition_listContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_search_condition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			search_condition();
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(842);
				match(COMMA);
				setState(843);
				search_condition();
				}
				}
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Search_conditionContext extends ParserRuleContext {
		public List<Search_condition_orContext> search_condition_or() {
			return getRuleContexts(Search_condition_orContext.class);
		}
		public Search_condition_orContext search_condition_or(int i) {
			return getRuleContext(Search_condition_orContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(DBEstSQLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(DBEstSQLParser.AND, i);
		}
		public Search_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitSearch_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_conditionContext search_condition() throws RecognitionException {
		Search_conditionContext _localctx = new Search_conditionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_search_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			search_condition_or();
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(850);
				match(AND);
				setState(851);
				search_condition_or();
				}
				}
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Search_condition_orContext extends ParserRuleContext {
		public List<Search_condition_notContext> search_condition_not() {
			return getRuleContexts(Search_condition_notContext.class);
		}
		public Search_condition_notContext search_condition_not(int i) {
			return getRuleContext(Search_condition_notContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(DBEstSQLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(DBEstSQLParser.OR, i);
		}
		public Search_condition_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition_or; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitSearch_condition_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_condition_orContext search_condition_or() throws RecognitionException {
		Search_condition_orContext _localctx = new Search_condition_orContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_search_condition_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			search_condition_not();
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(858);
				match(OR);
				setState(859);
				search_condition_not();
				}
				}
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Search_condition_notContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode NOT() { return getToken(DBEstSQLParser.NOT, 0); }
		public Search_condition_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition_not; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitSearch_condition_not(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_condition_notContext search_condition_not() throws RecognitionException {
		Search_condition_notContext _localctx = new Search_condition_notContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_search_condition_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(865);
				match(NOT);
				}
				break;
			}
			setState(868);
			predicate(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Setcomp_expr_predicateContext extends PredicateContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(DBEstSQLParser.ALL, 0); }
		public TerminalNode SOME() { return getToken(DBEstSQLParser.SOME, 0); }
		public TerminalNode ANY() { return getToken(DBEstSQLParser.ANY, 0); }
		public Setcomp_expr_predicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitSetcomp_expr_predicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Is_predicateContext extends PredicateContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IS() { return getToken(DBEstSQLParser.IS, 0); }
		public Null_notnullContext null_notnull() {
			return getRuleContext(Null_notnullContext.class,0);
		}
		public Is_predicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitIs_predicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Comp_expr_predicateContext extends PredicateContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public Comp_expr_predicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitComp_expr_predicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class In_predicateContext extends PredicateContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IN() { return getToken(DBEstSQLParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode NOT() { return getToken(DBEstSQLParser.NOT, 0); }
		public In_predicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitIn_predicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bracket_predicateContext extends PredicateContext {
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public Bracket_predicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitBracket_predicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Binary_func_predicateContext extends PredicateContext {
		public Binary_predicate_functionContext binary_predicate_function() {
			return getRuleContext(Binary_predicate_functionContext.class,0);
		}
		public Binary_func_predicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitBinary_func_predicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Exists_predicateContext extends PredicateContext {
		public TerminalNode EXISTS() { return getToken(DBEstSQLParser.EXISTS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Exists_predicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitExists_predicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Unary_func_predicateContext extends PredicateContext {
		public Unary_predicate_functionContext unary_predicate_function() {
			return getRuleContext(Unary_predicate_functionContext.class,0);
		}
		public Unary_func_predicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitUnary_func_predicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Comp_pred_expr_predicateContext extends PredicateContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Comp_pred_expr_predicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitComp_pred_expr_predicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Comp_between_exprContext extends PredicateContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(DBEstSQLParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(DBEstSQLParser.AND, 0); }
		public TerminalNode NOT() { return getToken(DBEstSQLParser.NOT, 0); }
		public Comp_between_exprContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitComp_between_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Like_predicateContext extends PredicateContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(DBEstSQLParser.LIKE, 0); }
		public TerminalNode RLIKE() { return getToken(DBEstSQLParser.RLIKE, 0); }
		public TerminalNode NOT() { return getToken(DBEstSQLParser.NOT, 0); }
		public TerminalNode ESCAPE() { return getToken(DBEstSQLParser.ESCAPE, 0); }
		public Like_predicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitLike_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		return predicate(0);
	}

	private PredicateContext predicate(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PredicateContext _localctx = new PredicateContext(_ctx, _parentState);
		PredicateContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_predicate, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				_localctx = new Exists_predicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(871);
				match(EXISTS);
				setState(872);
				match(LR_BRACKET);
				setState(873);
				subquery();
				setState(874);
				match(RR_BRACKET);
				}
				break;
			case 2:
				{
				_localctx = new Bracket_predicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(876);
				match(LR_BRACKET);
				setState(877);
				search_condition();
				setState(878);
				match(RR_BRACKET);
				}
				break;
			case 3:
				{
				_localctx = new Comp_expr_predicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(880);
				expression(0);
				setState(881);
				comparison_operator();
				setState(882);
				expression(0);
				}
				break;
			case 4:
				{
				_localctx = new Setcomp_expr_predicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(884);
				expression(0);
				setState(885);
				comparison_operator();
				setState(886);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(887);
				match(LR_BRACKET);
				setState(888);
				subquery();
				setState(889);
				match(RR_BRACKET);
				}
				break;
			case 5:
				{
				_localctx = new Comp_between_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(891);
				expression(0);
				setState(893);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(892);
					match(NOT);
					}
				}

				setState(895);
				match(BETWEEN);
				setState(896);
				expression(0);
				setState(897);
				match(AND);
				setState(898);
				expression(0);
				}
				break;
			case 6:
				{
				_localctx = new In_predicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(900);
				expression(0);
				setState(902);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(901);
					match(NOT);
					}
				}

				setState(904);
				match(IN);
				setState(905);
				match(LR_BRACKET);
				setState(908);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(906);
					subquery();
					}
					break;
				case 2:
					{
					setState(907);
					expression_list();
					}
					break;
				}
				setState(910);
				match(RR_BRACKET);
				}
				break;
			case 7:
				{
				_localctx = new Like_predicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(912);
				expression(0);
				setState(914);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(913);
					match(NOT);
					}
				}

				setState(916);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==RLIKE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(917);
				expression(0);
				setState(920);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(918);
					match(ESCAPE);
					setState(919);
					expression(0);
					}
					break;
				}
				}
				break;
			case 8:
				{
				_localctx = new Is_predicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(922);
				expression(0);
				setState(923);
				match(IS);
				setState(924);
				null_notnull();
				}
				break;
			case 9:
				{
				_localctx = new Unary_func_predicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(926);
				unary_predicate_function();
				}
				break;
			case 10:
				{
				_localctx = new Binary_func_predicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(927);
				binary_predicate_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(936);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Comp_pred_expr_predicateContext(new PredicateContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_predicate);
					setState(930);
					if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
					setState(931);
					comparison_operator();
					setState(932);
					expression(0);
					}
					} 
				}
				setState(938);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Query_expressionContext extends ParserRuleContext {
		public Query_specificationContext query_specification() {
			return getRuleContext(Query_specificationContext.class,0);
		}
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public List<UnionContext> union() {
			return getRuleContexts(UnionContext.class);
		}
		public UnionContext union(int i) {
			return getRuleContext(UnionContext.class,i);
		}
		public Query_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitQuery_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_expressionContext query_expression() throws RecognitionException {
		Query_expressionContext _localctx = new Query_expressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_query_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(939);
				query_specification();
				}
				break;
			case LR_BRACKET:
				{
				setState(940);
				match(LR_BRACKET);
				setState(941);
				query_expression();
				setState(942);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXCEPT || _la==INTERSECT || _la==UNION) {
				{
				{
				setState(946);
				union();
				}
				}
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(DBEstSQLParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(DBEstSQLParser.EXCEPT, 0); }
		public TerminalNode INTERSECT() { return getToken(DBEstSQLParser.INTERSECT, 0); }
		public Query_specificationContext query_specification() {
			return getRuleContext(Query_specificationContext.class,0);
		}
		public TerminalNode ALL() { return getToken(DBEstSQLParser.ALL, 0); }
		public List<Query_expressionContext> query_expression() {
			return getRuleContexts(Query_expressionContext.class);
		}
		public Query_expressionContext query_expression(int i) {
			return getRuleContext(Query_expressionContext.class,i);
		}
		public UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionContext union() throws RecognitionException {
		UnionContext _localctx = new UnionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_union);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			switch (_input.LA(1)) {
			case UNION:
				{
				setState(952);
				match(UNION);
				setState(954);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(953);
					match(ALL);
					}
				}

				}
				break;
			case EXCEPT:
				{
				setState(956);
				match(EXCEPT);
				}
				break;
			case INTERSECT:
				{
				setState(957);
				match(INTERSECT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(969);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(960);
				query_specification();
				}
				break;
			case LR_BRACKET:
				{
				setState(965); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(961);
					match(LR_BRACKET);
					setState(962);
					query_expression();
					setState(963);
					match(RR_BRACKET);
					}
					}
					setState(967); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LR_BRACKET );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_specificationContext extends ParserRuleContext {
		public Table_nameContext into_table;
		public Search_conditionContext where;
		public Search_conditionContext having;
		public TerminalNode SELECT() { return getToken(DBEstSQLParser.SELECT, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public Top_clauseContext top_clause() {
			return getRuleContext(Top_clauseContext.class,0);
		}
		public TerminalNode INTO() { return getToken(DBEstSQLParser.INTO, 0); }
		public TerminalNode FROM() { return getToken(DBEstSQLParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(DBEstSQLParser.WHERE, 0); }
		public TerminalNode HAVING() { return getToken(DBEstSQLParser.HAVING, 0); }
		public TerminalNode ALL() { return getToken(DBEstSQLParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(DBEstSQLParser.DISTINCT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Search_conditionContext> search_condition() {
			return getRuleContexts(Search_conditionContext.class);
		}
		public Search_conditionContext search_condition(int i) {
			return getRuleContext(Search_conditionContext.class,i);
		}
		public List<Table_sourceContext> table_source() {
			return getRuleContexts(Table_sourceContext.class);
		}
		public Table_sourceContext table_source(int i) {
			return getRuleContext(Table_sourceContext.class,i);
		}
		public TerminalNode GROUP() { return getToken(DBEstSQLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(DBEstSQLParser.BY, 0); }
		public List<Group_by_itemContext> group_by_item() {
			return getRuleContexts(Group_by_itemContext.class);
		}
		public Group_by_itemContext group_by_item(int i) {
			return getRuleContext(Group_by_itemContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(DBEstSQLParser.ROLLUP, 0); }
		public TerminalNode WITH() { return getToken(DBEstSQLParser.WITH, 0); }
		public Query_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_specification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitQuery_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_specificationContext query_specification() throws RecognitionException {
		Query_specificationContext _localctx = new Query_specificationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_query_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			match(SELECT);
			setState(973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(972);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(976);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(975);
				top_clause();
				}
			}

			setState(978);
			select_list();
			setState(981);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(979);
				match(INTO);
				setState(980);
				((Query_specificationContext)_localctx).into_table = table_name();
				}
			}

			setState(992);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(983);
				match(FROM);
				{
				setState(984);
				table_source();
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(985);
					match(COMMA);
					setState(986);
					table_source();
					}
					}
					setState(991);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
			}

			setState(996);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(994);
				match(WHERE);
				setState(995);
				((Query_specificationContext)_localctx).where = search_condition();
				}
			}

			setState(1026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				{
				setState(998);
				match(GROUP);
				setState(999);
				match(BY);
				setState(1000);
				group_by_item();
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1001);
					match(COMMA);
					setState(1002);
					group_by_item();
					}
					}
					setState(1007);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1010);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1008);
					match(WITH);
					setState(1009);
					match(ROLLUP);
					}
					break;
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(1012);
				match(GROUP);
				setState(1013);
				match(BY);
				setState(1014);
				match(ROLLUP);
				setState(1015);
				match(LR_BRACKET);
				setState(1016);
				group_by_item();
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1017);
					match(COMMA);
					setState(1018);
					group_by_item();
					}
					}
					setState(1023);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1024);
				match(RR_BRACKET);
				}
				}
				break;
			}
			setState(1030);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(1028);
				match(HAVING);
				setState(1029);
				((Query_specificationContext)_localctx).having = search_condition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Top_clauseContext extends ParserRuleContext {
		public TerminalNode TOP() { return getToken(DBEstSQLParser.TOP, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Top_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitTop_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Top_clauseContext top_clause() throws RecognitionException {
		Top_clauseContext _localctx = new Top_clauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_top_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			match(TOP);
			setState(1033);
			number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Limit_clauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(DBEstSQLParser.LIMIT, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Limit_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitLimit_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Limit_clauseContext limit_clause() throws RecognitionException {
		Limit_clauseContext _localctx = new Limit_clauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_limit_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			match(LIMIT);
			setState(1036);
			number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(DBEstSQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(DBEstSQLParser.BY, 0); }
		public List<Order_by_expressionContext> order_by_expression() {
			return getRuleContexts(Order_by_expressionContext.class);
		}
		public Order_by_expressionContext order_by_expression(int i) {
			return getRuleContext(Order_by_expressionContext.class,i);
		}
		public TerminalNode OFFSET() { return getToken(DBEstSQLParser.OFFSET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ROW() { return getTokens(DBEstSQLParser.ROW); }
		public TerminalNode ROW(int i) {
			return getToken(DBEstSQLParser.ROW, i);
		}
		public List<TerminalNode> ROWS() { return getTokens(DBEstSQLParser.ROWS); }
		public TerminalNode ROWS(int i) {
			return getToken(DBEstSQLParser.ROWS, i);
		}
		public TerminalNode FETCH() { return getToken(DBEstSQLParser.FETCH, 0); }
		public TerminalNode ONLY() { return getToken(DBEstSQLParser.ONLY, 0); }
		public TerminalNode FIRST() { return getToken(DBEstSQLParser.FIRST, 0); }
		public TerminalNode NEXT() { return getToken(DBEstSQLParser.NEXT, 0); }
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitOrder_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_order_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			match(ORDER);
			setState(1039);
			match(BY);
			setState(1040);
			order_by_expression();
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1041);
				match(COMMA);
				setState(1042);
				order_by_expression();
				}
				}
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1059);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(1048);
				match(OFFSET);
				setState(1049);
				expression(0);
				setState(1050);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1057);
				_la = _input.LA(1);
				if (_la==FETCH) {
					{
					setState(1051);
					match(FETCH);
					setState(1052);
					_la = _input.LA(1);
					if ( !(_la==FIRST || _la==NEXT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1053);
					expression(0);
					setState(1054);
					_la = _input.LA(1);
					if ( !(_la==ROW || _la==ROWS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1055);
					match(ONLY);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_clauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(DBEstSQLParser.FOR, 0); }
		public TerminalNode BROWSE() { return getToken(DBEstSQLParser.BROWSE, 0); }
		public TerminalNode XML() { return getToken(DBEstSQLParser.XML, 0); }
		public TerminalNode AUTO() { return getToken(DBEstSQLParser.AUTO, 0); }
		public Xml_common_directivesContext xml_common_directives() {
			return getRuleContext(Xml_common_directivesContext.class,0);
		}
		public TerminalNode PATH() { return getToken(DBEstSQLParser.PATH, 0); }
		public TerminalNode STRING() { return getToken(DBEstSQLParser.STRING, 0); }
		public For_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitFor_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_clauseContext for_clause() throws RecognitionException {
		For_clauseContext _localctx = new For_clauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_for_clause);
		int _la;
		try {
			setState(1080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1061);
				match(FOR);
				setState(1062);
				match(BROWSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1063);
				match(FOR);
				setState(1064);
				match(XML);
				setState(1065);
				match(AUTO);
				setState(1067);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1066);
					xml_common_directives();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1069);
				match(FOR);
				setState(1070);
				match(XML);
				setState(1071);
				match(PATH);
				setState(1075);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(1072);
					match(LR_BRACKET);
					setState(1073);
					match(STRING);
					setState(1074);
					match(RR_BRACKET);
					}
				}

				setState(1078);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1077);
					xml_common_directives();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Xml_common_directivesContext extends ParserRuleContext {
		public TerminalNode BINARY() { return getToken(DBEstSQLParser.BINARY, 0); }
		public TerminalNode BASE64() { return getToken(DBEstSQLParser.BASE64, 0); }
		public TerminalNode TYPE() { return getToken(DBEstSQLParser.TYPE, 0); }
		public TerminalNode ROOT() { return getToken(DBEstSQLParser.ROOT, 0); }
		public Xml_common_directivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml_common_directives; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitXml_common_directives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xml_common_directivesContext xml_common_directives() throws RecognitionException {
		Xml_common_directivesContext _localctx = new Xml_common_directivesContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_xml_common_directives);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			match(COMMA);
			setState(1087);
			switch (_input.LA(1)) {
			case BINARY:
				{
				setState(1083);
				match(BINARY);
				setState(1084);
				match(BASE64);
				}
				break;
			case TYPE:
				{
				setState(1085);
				match(TYPE);
				}
				break;
			case ROOT:
				{
				setState(1086);
				match(ROOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(DBEstSQLParser.NULLS, 0); }
		public TerminalNode FIRST() { return getToken(DBEstSQLParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(DBEstSQLParser.LAST, 0); }
		public TerminalNode ASC() { return getToken(DBEstSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(DBEstSQLParser.DESC, 0); }
		public Order_by_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitOrder_by_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_expressionContext order_by_expression() throws RecognitionException {
		Order_by_expressionContext _localctx = new Order_by_expressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_order_by_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			expression(0);
			setState(1091);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1090);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1093);
				match(NULLS);
				setState(1094);
				match(FIRST);
				}
				break;
			case 2:
				{
				setState(1095);
				match(NULLS);
				setState(1096);
				match(LAST);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_by_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Group_by_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitGroup_by_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_itemContext group_by_item() throws RecognitionException {
		Group_by_itemContext _localctx = new Group_by_itemContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_group_by_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Option_clauseContext extends ParserRuleContext {
		public TerminalNode OPTION() { return getToken(DBEstSQLParser.OPTION, 0); }
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public Option_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitOption_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Option_clauseContext option_clause() throws RecognitionException {
		Option_clauseContext _localctx = new Option_clauseContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_option_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			match(OPTION);
			setState(1102);
			match(LR_BRACKET);
			setState(1103);
			option();
			setState(1108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1104);
				match(COMMA);
				setState(1105);
				option();
				}
				}
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1111);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionContext extends ParserRuleContext {
		public Token number_rows;
		public TerminalNode FAST() { return getToken(DBEstSQLParser.FAST, 0); }
		public TerminalNode DECIMAL() { return getToken(DBEstSQLParser.DECIMAL, 0); }
		public TerminalNode GROUP() { return getToken(DBEstSQLParser.GROUP, 0); }
		public TerminalNode HASH() { return getToken(DBEstSQLParser.HASH, 0); }
		public TerminalNode ORDER() { return getToken(DBEstSQLParser.ORDER, 0); }
		public TerminalNode UNION() { return getToken(DBEstSQLParser.UNION, 0); }
		public TerminalNode MERGE() { return getToken(DBEstSQLParser.MERGE, 0); }
		public TerminalNode CONCAT() { return getToken(DBEstSQLParser.CONCAT, 0); }
		public TerminalNode KEEPFIXED() { return getToken(DBEstSQLParser.KEEPFIXED, 0); }
		public TerminalNode PLAN() { return getToken(DBEstSQLParser.PLAN, 0); }
		public TerminalNode OPTIMIZE() { return getToken(DBEstSQLParser.OPTIMIZE, 0); }
		public TerminalNode FOR() { return getToken(DBEstSQLParser.FOR, 0); }
		public List<Optimize_for_argContext> optimize_for_arg() {
			return getRuleContexts(Optimize_for_argContext.class);
		}
		public Optimize_for_argContext optimize_for_arg(int i) {
			return getRuleContext(Optimize_for_argContext.class,i);
		}
		public TerminalNode UNKNOWN() { return getToken(DBEstSQLParser.UNKNOWN, 0); }
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_option);
		int _la;
		try {
			setState(1137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1113);
				match(FAST);
				setState(1114);
				((OptionContext)_localctx).number_rows = match(DECIMAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1115);
				_la = _input.LA(1);
				if ( !(_la==HASH || _la==ORDER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1116);
				match(GROUP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1117);
				_la = _input.LA(1);
				if ( !(_la==HASH || _la==MERGE || _la==CONCAT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1118);
				match(UNION);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1119);
				match(KEEPFIXED);
				setState(1120);
				match(PLAN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1121);
				match(OPTIMIZE);
				setState(1122);
				match(FOR);
				setState(1123);
				match(LR_BRACKET);
				setState(1124);
				optimize_for_arg();
				setState(1129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1125);
					match(COMMA);
					setState(1126);
					optimize_for_arg();
					}
					}
					setState(1131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1132);
				match(RR_BRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1134);
				match(OPTIMIZE);
				setState(1135);
				match(FOR);
				setState(1136);
				match(UNKNOWN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optimize_for_argContext extends ParserRuleContext {
		public TerminalNode LOCAL_ID() { return getToken(DBEstSQLParser.LOCAL_ID, 0); }
		public TerminalNode UNKNOWN() { return getToken(DBEstSQLParser.UNKNOWN, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Optimize_for_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optimize_for_arg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitOptimize_for_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optimize_for_argContext optimize_for_arg() throws RecognitionException {
		Optimize_for_argContext _localctx = new Optimize_for_argContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_optimize_for_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			match(LOCAL_ID);
			setState(1143);
			switch (_input.LA(1)) {
			case UNKNOWN:
				{
				setState(1140);
				match(UNKNOWN);
				}
				break;
			case EQUAL:
				{
				setState(1141);
				match(EQUAL);
				setState(1142);
				constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public List<Select_list_elemContext> select_list_elem() {
			return getRuleContexts(Select_list_elemContext.class);
		}
		public Select_list_elemContext select_list_elem(int i) {
			return getRuleContext(Select_list_elemContext.class,i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			select_list_elem();
			setState(1150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1146);
				match(COMMA);
				setState(1147);
				select_list_elem();
				}
				}
				setState(1152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_elemContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(DBEstSQLParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode IDENTITY() { return getToken(DBEstSQLParser.IDENTITY, 0); }
		public TerminalNode ROWGUID() { return getToken(DBEstSQLParser.ROWGUID, 0); }
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(DBEstSQLParser.AS, 0); }
		public Select_list_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_elem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitSelect_list_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_elemContext select_list_elem() throws RecognitionException {
		Select_list_elemContext _localctx = new Select_list_elemContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_select_list_elem);
		int _la;
		try {
			setState(1174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1156);
				_la = _input.LA(1);
				if (_la==DISTINCT || _la==LEFT || _la==RIGHT || ((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (AGE - 221)) | (1L << (AREA - 221)) | (1L << (CENTER - 221)) | (1L << (CIRCLE - 221)))) != 0) || ((((_la - 286)) & ~0x3f) == 0 && ((1L << (_la - 286)) & ((1L << (COUNT - 286)) | (1L << (DATE - 286)) | (1L << (DAY - 286)) | (1L << (DAYNAME - 286)) | (1L << (DAYOFMONTH - 286)) | (1L << (DAYOFWEEK - 286)) | (1L << (DAYOFYEAR - 286)) | (1L << (DEGREES - 286)) | (1L << (DIAMETER - 286)))) != 0) || ((((_la - 360)) & ~0x3f) == 0 && ((1L << (_la - 360)) & ((1L << (HEIGHT - 360)) | (1L << (HOUR - 360)) | (1L << (LENGTH - 360)))) != 0) || ((((_la - 441)) & ~0x3f) == 0 && ((1L << (_la - 441)) & ((1L << (MAKEDATE - 441)) | (1L << (MICROSECOND - 441)) | (1L << (MINUTE - 441)) | (1L << (MOD - 441)) | (1L << (MONTH - 441)) | (1L << (MONTHNAME - 441)))) != 0) || ((((_la - 509)) & ~0x3f) == 0 && ((1L << (_la - 509)) & ((1L << (POWER - 509)) | (1L << (SCALE - 509)) | (1L << (SECOND - 509)))) != 0) || ((((_la - 611)) & ~0x3f) == 0 && ((1L << (_la - 611)) & ((1L << (TEXT - 611)) | (1L << (TIME - 611)) | (1L << (TIMESTAMP - 611)) | (1L << (VARIANCE - 611)) | (1L << (WEEKOFYEAR - 611)))) != 0) || ((((_la - 767)) & ~0x3f) == 0 && ((1L << (_la - 767)) & ((1L << (DOUBLE_QUOTE_ID - 767)) | (1L << (BACKTICK_ID - 767)) | (1L << (SQUARE_BRACKET_ID - 767)) | (1L << (ID - 767)))) != 0)) {
					{
					setState(1153);
					table_name();
					setState(1154);
					match(DOT);
					}
				}

				setState(1161);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(1158);
					match(STAR);
					}
					break;
				case DOLLAR:
					{
					setState(1159);
					match(DOLLAR);
					setState(1160);
					_la = _input.LA(1);
					if ( !(_la==IDENTITY || _la==ROWGUID) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1163);
				column_alias();
				setState(1164);
				match(EQUAL);
				setState(1165);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1167);
				expression(0);
				setState(1172);
				_la = _input.LA(1);
				if (_la==AS || _la==DISTINCT || _la==LEFT || _la==RIGHT || ((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (AGE - 221)) | (1L << (AREA - 221)) | (1L << (CENTER - 221)) | (1L << (CIRCLE - 221)))) != 0) || ((((_la - 286)) & ~0x3f) == 0 && ((1L << (_la - 286)) & ((1L << (COUNT - 286)) | (1L << (DATE - 286)) | (1L << (DAY - 286)) | (1L << (DAYNAME - 286)) | (1L << (DAYOFMONTH - 286)) | (1L << (DAYOFWEEK - 286)) | (1L << (DAYOFYEAR - 286)) | (1L << (DEGREES - 286)) | (1L << (DIAMETER - 286)))) != 0) || ((((_la - 360)) & ~0x3f) == 0 && ((1L << (_la - 360)) & ((1L << (HEIGHT - 360)) | (1L << (HOUR - 360)) | (1L << (LENGTH - 360)))) != 0) || ((((_la - 441)) & ~0x3f) == 0 && ((1L << (_la - 441)) & ((1L << (MAKEDATE - 441)) | (1L << (MICROSECOND - 441)) | (1L << (MINUTE - 441)) | (1L << (MOD - 441)) | (1L << (MONTH - 441)) | (1L << (MONTHNAME - 441)))) != 0) || ((((_la - 509)) & ~0x3f) == 0 && ((1L << (_la - 509)) & ((1L << (POWER - 509)) | (1L << (SCALE - 509)) | (1L << (SECOND - 509)))) != 0) || ((((_la - 611)) & ~0x3f) == 0 && ((1L << (_la - 611)) & ((1L << (TEXT - 611)) | (1L << (TIME - 611)) | (1L << (TIMESTAMP - 611)) | (1L << (VARIANCE - 611)) | (1L << (WEEKOFYEAR - 611)))) != 0) || ((((_la - 767)) & ~0x3f) == 0 && ((1L << (_la - 767)) & ((1L << (DOUBLE_QUOTE_ID - 767)) | (1L << (BACKTICK_ID - 767)) | (1L << (SQUARE_BRACKET_ID - 767)) | (1L << (ID - 767)) | (1L << (STRING - 767)))) != 0)) {
					{
					setState(1169);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1168);
						match(AS);
						}
					}

					setState(1171);
					column_alias();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_by_clauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(DBEstSQLParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(DBEstSQLParser.BY, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Partition_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_by_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitPartition_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_by_clauseContext partition_by_clause() throws RecognitionException {
		Partition_by_clauseContext _localctx = new Partition_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_partition_by_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			match(PARTITION);
			setState(1177);
			match(BY);
			setState(1178);
			expression_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_sourceContext extends ParserRuleContext {
		public Table_source_item_joinedContext table_source_item_joined() {
			return getRuleContext(Table_source_item_joinedContext.class,0);
		}
		public Table_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitTable_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_sourceContext table_source() throws RecognitionException {
		Table_sourceContext _localctx = new Table_sourceContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_table_source);
		try {
			setState(1185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1180);
				table_source_item_joined();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1181);
				match(LR_BRACKET);
				setState(1182);
				table_source_item_joined();
				setState(1183);
				match(RR_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_source_item_joinedContext extends ParserRuleContext {
		public Table_source_itemContext table_source_item() {
			return getRuleContext(Table_source_itemContext.class,0);
		}
		public List<Join_partContext> join_part() {
			return getRuleContexts(Join_partContext.class);
		}
		public Join_partContext join_part(int i) {
			return getRuleContext(Join_partContext.class,i);
		}
		public Table_source_item_joinedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_source_item_joined; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitTable_source_item_joined(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_source_item_joinedContext table_source_item_joined() throws RecognitionException {
		Table_source_item_joinedContext _localctx = new Table_source_item_joinedContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_table_source_item_joined);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1187);
			table_source_item();
			setState(1191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1188);
					join_part();
					}
					} 
				}
				setState(1193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_source_itemContext extends ParserRuleContext {
		public Table_source_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_source_item; }
	 
		public Table_source_itemContext() { }
		public void copyFrom(Table_source_itemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Hinted_table_name_itemContext extends Table_source_itemContext {
		public Table_name_with_hintContext table_name_with_hint() {
			return getRuleContext(Table_name_with_hintContext.class,0);
		}
		public As_table_aliasContext as_table_alias() {
			return getRuleContext(As_table_aliasContext.class,0);
		}
		public Hinted_table_name_itemContext(Table_source_itemContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitHinted_table_name_item(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Derived_table_source_itemContext extends Table_source_itemContext {
		public Derived_tableContext derived_table() {
			return getRuleContext(Derived_tableContext.class,0);
		}
		public As_table_aliasContext as_table_alias() {
			return getRuleContext(As_table_aliasContext.class,0);
		}
		public Column_alias_listContext column_alias_list() {
			return getRuleContext(Column_alias_listContext.class,0);
		}
		public Derived_table_source_itemContext(Table_source_itemContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitDerived_table_source_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_source_itemContext table_source_item() throws RecognitionException {
		Table_source_itemContext _localctx = new Table_source_itemContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_table_source_item);
		int _la;
		try {
			setState(1205);
			switch (_input.LA(1)) {
			case DISTINCT:
			case LEFT:
			case RIGHT:
			case AGE:
			case AREA:
			case CENTER:
			case CIRCLE:
			case COUNT:
			case DATE:
			case DAY:
			case DAYNAME:
			case DAYOFMONTH:
			case DAYOFWEEK:
			case DAYOFYEAR:
			case DEGREES:
			case DIAMETER:
			case HEIGHT:
			case HOUR:
			case LENGTH:
			case MAKEDATE:
			case MICROSECOND:
			case MINUTE:
			case MOD:
			case MONTH:
			case MONTHNAME:
			case POWER:
			case SCALE:
			case SECOND:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case VARIANCE:
			case WEEKOFYEAR:
			case DOUBLE_QUOTE_ID:
			case BACKTICK_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				_localctx = new Hinted_table_name_itemContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1194);
				table_name_with_hint();
				setState(1196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1195);
					as_table_alias();
					}
					break;
				}
				}
				break;
			case VALUES:
			case LR_BRACKET:
				_localctx = new Derived_table_source_itemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1198);
				derived_table();
				setState(1203);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1199);
					as_table_alias();
					setState(1201);
					_la = _input.LA(1);
					if (_la==LR_BRACKET) {
						{
						setState(1200);
						column_alias_list();
						}
					}

					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Change_tableContext extends ParserRuleContext {
		public TerminalNode CHANGETABLE() { return getToken(DBEstSQLParser.CHANGETABLE, 0); }
		public TerminalNode CHANGES() { return getToken(DBEstSQLParser.CHANGES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode NULL() { return getToken(DBEstSQLParser.NULL, 0); }
		public TerminalNode DECIMAL() { return getToken(DBEstSQLParser.DECIMAL, 0); }
		public TerminalNode LOCAL_ID() { return getToken(DBEstSQLParser.LOCAL_ID, 0); }
		public Change_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_change_table; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitChange_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Change_tableContext change_table() throws RecognitionException {
		Change_tableContext _localctx = new Change_tableContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_change_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			match(CHANGETABLE);
			setState(1208);
			match(LR_BRACKET);
			setState(1209);
			match(CHANGES);
			setState(1210);
			table_name();
			setState(1211);
			match(COMMA);
			setState(1212);
			_la = _input.LA(1);
			if ( !(_la==NULL || _la==LOCAL_ID || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1213);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_partContext extends ParserRuleContext {
		public Token join_type;
		public Token join_hint;
		public TerminalNode JOIN() { return getToken(DBEstSQLParser.JOIN, 0); }
		public Table_sourceContext table_source() {
			return getRuleContext(Table_sourceContext.class,0);
		}
		public TerminalNode ON() { return getToken(DBEstSQLParser.ON, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode LEFT() { return getToken(DBEstSQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(DBEstSQLParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(DBEstSQLParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(DBEstSQLParser.INNER, 0); }
		public TerminalNode OUTER() { return getToken(DBEstSQLParser.OUTER, 0); }
		public TerminalNode LOOP() { return getToken(DBEstSQLParser.LOOP, 0); }
		public TerminalNode HASH() { return getToken(DBEstSQLParser.HASH, 0); }
		public TerminalNode MERGE() { return getToken(DBEstSQLParser.MERGE, 0); }
		public TerminalNode REMOTE() { return getToken(DBEstSQLParser.REMOTE, 0); }
		public TerminalNode SEMI() { return getToken(DBEstSQLParser.SEMI, 0); }
		public TerminalNode CROSS() { return getToken(DBEstSQLParser.CROSS, 0); }
		public TerminalNode APPLY() { return getToken(DBEstSQLParser.APPLY, 0); }
		public TerminalNode LATERAL() { return getToken(DBEstSQLParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(DBEstSQLParser.VIEW, 0); }
		public Lateral_view_functionContext lateral_view_function() {
			return getRuleContext(Lateral_view_functionContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(DBEstSQLParser.AS, 0); }
		public Join_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_part; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitJoin_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_partContext join_part() throws RecognitionException {
		Join_partContext _localctx = new Join_partContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_join_part);
		int _la;
		try {
			setState(1254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1222);
				switch (_input.LA(1)) {
				case HASH:
				case INNER:
				case JOIN:
				case MERGE:
				case SEMI:
				case LOOP:
				case REMOTE:
					{
					setState(1216);
					_la = _input.LA(1);
					if (_la==INNER) {
						{
						setState(1215);
						match(INNER);
						}
					}

					}
					break;
				case FULL:
				case LEFT:
				case RIGHT:
					{
					setState(1218);
					((Join_partContext)_localctx).join_type = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==FULL || _la==LEFT || _la==RIGHT) ) {
						((Join_partContext)_localctx).join_type = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1220);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1219);
						match(OUTER);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1225);
				_la = _input.LA(1);
				if (_la==HASH || _la==MERGE || _la==SEMI || _la==LOOP || _la==REMOTE) {
					{
					setState(1224);
					((Join_partContext)_localctx).join_hint = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==HASH || _la==MERGE || _la==SEMI || _la==LOOP || _la==REMOTE) ) {
						((Join_partContext)_localctx).join_hint = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(1227);
				match(JOIN);
				setState(1228);
				table_source();
				setState(1231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1229);
					match(ON);
					setState(1230);
					search_condition();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1233);
				match(CROSS);
				setState(1234);
				match(APPLY);
				setState(1235);
				table_source();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1236);
				match(CROSS);
				setState(1237);
				match(JOIN);
				setState(1238);
				table_source();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1239);
				match(OUTER);
				setState(1240);
				match(APPLY);
				setState(1241);
				table_source();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1242);
				match(LATERAL);
				setState(1243);
				match(VIEW);
				setState(1244);
				lateral_view_function();
				setState(1246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1245);
					table_alias();
					}
					break;
				}
				setState(1252);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1249);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1248);
						match(AS);
						}
					}

					setState(1251);
					column_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_name_with_hintContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Table_name_with_hintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name_with_hint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitTable_name_with_hint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_name_with_hintContext table_name_with_hint() throws RecognitionException {
		Table_name_with_hintContext _localctx = new Table_name_with_hintContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_table_name_with_hint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rowset_functionContext extends ParserRuleContext {
		public Token data_file;
		public TerminalNode OPENROWSET() { return getToken(DBEstSQLParser.OPENROWSET, 0); }
		public TerminalNode BULK() { return getToken(DBEstSQLParser.BULK, 0); }
		public TerminalNode STRING() { return getToken(DBEstSQLParser.STRING, 0); }
		public List<Bulk_optionContext> bulk_option() {
			return getRuleContexts(Bulk_optionContext.class);
		}
		public Bulk_optionContext bulk_option(int i) {
			return getRuleContext(Bulk_optionContext.class,i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Rowset_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowset_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitRowset_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rowset_functionContext rowset_function() throws RecognitionException {
		Rowset_functionContext _localctx = new Rowset_functionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_rowset_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			match(OPENROWSET);
			setState(1259);
			match(LR_BRACKET);
			setState(1260);
			match(BULK);
			setState(1261);
			((Rowset_functionContext)_localctx).data_file = match(STRING);
			setState(1262);
			match(COMMA);
			setState(1272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1263);
				bulk_option();
				setState(1268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1264);
					match(COMMA);
					setState(1265);
					bulk_option();
					}
					}
					setState(1270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1271);
				id();
				}
				break;
			}
			setState(1274);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bulk_optionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(DBEstSQLParser.DECIMAL, 0); }
		public TerminalNode STRING() { return getToken(DBEstSQLParser.STRING, 0); }
		public Bulk_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bulk_option; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitBulk_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bulk_optionContext bulk_option() throws RecognitionException {
		Bulk_optionContext _localctx = new Bulk_optionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_bulk_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			id();
			setState(1277);
			match(EQUAL);
			setState(1278);
			_la = _input.LA(1);
			if ( !(_la==DECIMAL || _la==STRING) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Derived_tableContext extends ParserRuleContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Table_value_constructorContext table_value_constructor() {
			return getRuleContext(Table_value_constructorContext.class,0);
		}
		public Derived_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derived_table; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitDerived_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Derived_tableContext derived_table() throws RecognitionException {
		Derived_tableContext _localctx = new Derived_tableContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_derived_table);
		try {
			setState(1285);
			switch (_input.LA(1)) {
			case LR_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1280);
				match(LR_BRACKET);
				setState(1281);
				subquery();
				setState(1282);
				match(RR_BRACKET);
				}
				break;
			case VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1284);
				table_value_constructor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public Ranking_windowed_functionContext ranking_windowed_function() {
			return getRuleContext(Ranking_windowed_functionContext.class,0);
		}
		public Expression_functionContext expression_function() {
			return getRuleContext(Expression_functionContext.class,0);
		}
		public Aggregate_windowed_functionContext aggregate_windowed_function() {
			return getRuleContext(Aggregate_windowed_functionContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_function_call);
		try {
			setState(1290);
			switch (_input.LA(1)) {
			case DENSE_RANK:
			case NTILE:
			case RANK:
			case ROW_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1287);
				ranking_windowed_function();
				}
				break;
			case APPROX_DISTINCT:
			case ASCII:
			case COALESCE:
			case CONV:
			case CONVERT:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATABASE:
			case HASH:
			case IF:
			case INT4LARGER:
			case LEFT:
			case MID:
			case NOT:
			case NULLIF:
			case RAWTOHEX:
			case RIGHT:
			case RPAD:
			case SESSION_USER:
			case SUBSTR:
			case SUBSTRING:
			case SYSTEM_USER:
			case TRUNCATE:
			case USER:
			case ABBREV:
			case ABS:
			case ACOS:
			case ADDDATE:
			case ADDTIME:
			case AES_DECRYPT:
			case AES_ENCRYPT:
			case AGE:
			case AREA:
			case ARRAY_AGG:
			case ARRAY_APPEND:
			case ARRAY_CAT:
			case ARRAY_DIMS:
			case ARRAY_LENGTH:
			case ARRAY_LOWER:
			case ARRAY_NDIMS:
			case ARRAY_POSITION:
			case ARRAY_POSITIONS:
			case ARRAY_PREPEND:
			case ARRAY_REMOVE:
			case ARRAY_REPLACE:
			case ARRAY_TO_JSON:
			case ARRAY_TO_STRING:
			case ARRAY_TO_TSVECTOR:
			case ARRAY_UPPER:
			case ASIN:
			case ATAN:
			case ATAN2:
			case BIN:
			case BIT_LENGTH:
			case BOOL_AND:
			case BOOL_OR:
			case BOX:
			case BOUND_BOX:
			case BROADCAST:
			case BTRIM:
			case BROUND:
			case CARDINALITY:
			case CAST:
			case CBRT:
			case CEIL:
			case CEILING:
			case CENTER:
			case CHAR_LENGTH:
			case CHARACTER_LENGTH:
			case CHR:
			case CIRCLE:
			case CLOCK_TIMESTAMP:
			case CONCAT:
			case CONCAT_WS:
			case CONVERT_FROM:
			case CONVERT_TO:
			case COS:
			case CORR:
			case COVAR_POP:
			case COVAR_SAMP:
			case COT:
			case CRC32:
			case CURDATE:
			case CURRVAL:
			case CURTIME:
			case DATE:
			case DATEADD:
			case DATE_ADD:
			case DATE_FORMAT:
			case DATE_PART:
			case DATE_SUB:
			case DATE_TRUNC:
			case DATEDIFF:
			case DAY:
			case DAYNAME:
			case DAYOFMONTH:
			case DAYOFWEEK:
			case DAYOFYEAR:
			case DECODE:
			case DEGREES:
			case DIAMETER:
			case DIV:
			case NATURAL_CONSTANT:
			case ENCODE:
			case ENUM_FIRST:
			case ENUM_LAST:
			case ENUM_RANGE:
			case EXP:
			case EXTRACT:
			case EVERY:
			case FACTORIAL:
			case FAMILY:
			case FIELD:
			case FIND_IN_SET:
			case FLOOR:
			case FORMAT:
			case FORMAT_NUMBER:
			case FNV_HASH:
			case FROM_DAYS:
			case FROM_UNIXTIME:
			case GET_BIT:
			case GET_BYTE:
			case GET_CURRENT_TS_CONFIG:
			case GET_JSON_OBJECT:
			case GREATEST:
			case HEIGHT:
			case HEX:
			case HOST:
			case HOSTMASK:
			case HOUR:
			case IFNULL:
			case INITCAP:
			case INSTR:
			case IN_FILE:
			case INET_SAME_FAMILY:
			case INET_MERGE:
			case ISCLOSED:
			case ISEMPTY:
			case ISFINITE:
			case ISNULL:
			case ISOPEN:
			case JSON_AGG:
			case JSON_ARRAY_LENGTH:
			case JSON_ARRAY_ELEMENTS:
			case JSON_ARRAY_ELEMENTS_TEXT:
			case JSON_BUILD_ARRAY:
			case JSON_BUILD_OBJECT:
			case JSON_EACH:
			case JSON_EACH_TEXT:
			case JSON_EXTRACT_PATH:
			case JSON_EXTRACT_PATH_TEXT:
			case JSON_OBJECT:
			case JSON_OBJECT_KEYS:
			case JSON_OBJECT_AGG:
			case JSON_POPULATE_RECORD:
			case JSON_POPULATE_RECORDSET:
			case JSON_STRIP_NULLS:
			case JSON_TO_RECORD:
			case JSON_TO_RECORDSET:
			case JSON_TYPEOF:
			case JSONB_AGG:
			case JSONB_OBJECT_AGG:
			case JSONB_SET:
			case JSONB_INSERT:
			case JSONB_PRETTY:
			case JUSTIFY_DAYS:
			case JUSTIFY_HOURS:
			case JUSTIFY_INTERVALS:
			case LASTVAL:
			case LAST_DAY:
			case LAST_INSERT_ID:
			case LCASE:
			case LEAST:
			case LENGTH:
			case LINE:
			case LN:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOCATE:
			case LOG:
			case LOG2:
			case LOG10:
			case LOWER:
			case LOWER_INC:
			case LOWER_INF:
			case LPAD:
			case LTRIM:
			case LSEG:
			case MACADDR8_SET7BIT:
			case MAKEDATE:
			case MAKETIME:
			case MAKE_DATE:
			case MAKE_TIME:
			case MAKE_TIMESTAMP:
			case MAKE_TIMESTAMPTZ:
			case MASKLEN:
			case MD5:
			case MICROSECOND:
			case MINUTE:
			case MOD:
			case MONTH:
			case MONTHNAME:
			case NEGATIVE:
			case NETMASK:
			case NETWORK:
			case NEXTVAL:
			case NOW:
			case NPOINTS:
			case NUMNODE:
			case NVL:
			case OCTET_LENGTH:
			case OVERLAY:
			case PATH:
			case PCLOSE:
			case PERCENTILE:
			case PERIOD_ADD:
			case PERIOD_DIFF:
			case PG_CLIENT_ENCODING:
			case PLAINTO_TSQUERY:
			case PHRASETO_TSQUERY:
			case PI:
			case PMOD:
			case POINT:
			case POLYGON:
			case POPEN:
			case POSITION:
			case POSITIVE:
			case POW:
			case POWER:
			case QUARTER:
			case QUERYTREE:
			case QUOTE_IDENT:
			case QUOTE_LITERAL:
			case QUOTE_NULLABLE:
			case RADIANS:
			case RADIUS:
			case RAND:
			case RANDOM:
			case RANGE_MERGE:
			case REGR_AVGX:
			case REGR_AVGY:
			case REGR_COUNT:
			case REGR_INTERCEPT:
			case REGR_R2:
			case REGR_SLOPE:
			case REGR_SXX:
			case REGR_SXY:
			case REGR_SYY:
			case REGEXP_MATCHES:
			case REGEXP_REPLACE:
			case REGEXP_SPLIT_TO_ARRAY:
			case REGEXP_SPLIT_TO_TABLE:
			case REPEAT:
			case REPLACE:
			case REVERSE:
			case ROUND:
			case ROW_TO_JSON:
			case RTRIM:
			case SCALE:
			case SECOND:
			case SEC_TO_TIME:
			case SETSEED:
			case SETWEIGHT:
			case SETVAL:
			case SET_BIT:
			case SET_BYTE:
			case SET_MASKLEN:
			case SHA1:
			case SHA2:
			case SHIFTLEFT:
			case SHIFTRIGHT:
			case SHIFTRIGHTUNSIGNED:
			case SIGN:
			case SIN:
			case SPACE_FUNCTION:
			case SPLIT:
			case SPLIT_PART:
			case STATEMENT_TIMESTAMP:
			case STDDEV:
			case STRCMP:
			case STRING_AGG:
			case STRING_TO_ARRAY:
			case STRPOS:
			case STR_TO_DATE:
			case SUBDATE:
			case SUBSTRING_INDEX:
			case SQRT:
			case STDDEV_POP:
			case STRIP:
			case STRTOL:
			case SYSDATE:
			case TAN:
			case TEXT:
			case TIME:
			case TIMEDIFF:
			case TIMEOFDAY:
			case TIMESTAMP:
			case TIME_FORMAT:
			case TIME_TO_SEC:
			case TO_ASCII:
			case TO_CHAR:
			case TO_DATE:
			case TO_DAYS:
			case TO_HEX:
			case TO_JSON:
			case TO_JSONB:
			case TO_NUMBER:
			case TO_TIMESTAMP:
			case TO_TSQUERY:
			case TO_TSVECTOR:
			case TRANSACTION_TIMESTAMP:
			case TRANSLATE:
			case TRIM:
			case TRUNC:
			case TS_DELETE:
			case TS_FILTER:
			case TS_HEADLINE:
			case TS_RANK:
			case TS_RANK_CD:
			case TS_REWRITE:
			case TSQUERY_PHRASE:
			case TSVECTOR_TO_ARRAY:
			case TSVECTOR_UPDATE_TRIGGER:
			case TSVECTOR_UPDATE_TRIGGER_COLUMN:
			case UCASE:
			case UNHEX:
			case UNIX_TIMESTAMP:
			case UNNEST:
			case UPPER:
			case UPPER_INC:
			case UPPER_INF:
			case VARIANCE:
			case VAR_POP:
			case VAR_SAMP:
			case VERSION:
			case WEEKOFYEAR:
			case WEEK:
			case WEEKDAY:
			case WIDTH:
			case WIDTH_BUCKET:
			case XMLAGG:
			case XMLCOMMENT:
			case XMLCONCAT:
			case XMLELEMENT:
			case XMLFOREST:
			case XMLPI:
			case XMLROOT:
			case XML_ISWELL_FORMAT:
			case XPATH:
			case XPATH_EXISTS:
			case YEAR:
			case YEARWEEK:
			case ST_ASBINARY:
			case ST_ASTEXT:
			case ST_GEOMETRYFROMTEXT:
			case ST_GEOMFROMBINARY:
			case ST_LINEFROMTEXT:
			case ST_LINESTRING:
			case ST_MULTIPOINT:
			case ST_POINT:
			case ST_POLYGON:
			case ST_CONTAINS:
			case ST_CROSSES:
			case ST_DISJOINT:
			case ST_EQUALS:
			case ST_INTERSECTS:
			case ST_OVERLAPS:
			case ST_RELATE:
			case ST_TOUCHES:
			case ST_WITHIN:
			case GEOMETRY_UNION:
			case ST_BOUNDARY:
			case ST_BUFFER:
			case ST_DIFFERENCE:
			case ST_ENVELOPE:
			case ST_ENVELOPEASPTS:
			case ST_EXTERIORRING:
			case ST_INTERSECTION:
			case ST_SYMDIFFERENCE:
			case ST_UNION:
			case ST_AREA:
			case ST_CENTROID:
			case ST_CONVEXHULL:
			case ST_DIMENSION:
			case ST_DISTANCE:
			case ST_GEOMETRYN:
			case ST_INTERIORRINGN:
			case ST_GEOMETRYTYPE:
			case ST_ISCLOSED:
			case ST_ISEMPTY:
			case ST_ISSIMPLE:
			case ST_ISRING:
			case ST_ISVALID:
			case ST_LENGTH:
			case ST_POINTN:
			case ST_XMAX:
			case ST_YMAX:
			case ST_XMIN:
			case ST_YMIN:
			case ST_STARTPOINT:
			case SIMPLIFY_GEOMETRY:
			case ST_ENDPOINT:
			case ST_X:
			case ST_Y:
			case ST_INTERIORRINGS:
			case ST_NUMGEOMETRIES:
			case ST_GEOMETRIES:
			case ST_NUMPOINTS:
			case ST_NUMINTERIORRING:
			case LINE_LOCATE_POINT:
			case GEOMETRY_INVALID_REASON:
			case GREAT_CIRCLE_DISTANCE:
			case CONVEX_HULL_AGG:
			case GEOMETRY_UNION_AGG:
			case BING_TILE:
			case BING_TILE_AT:
			case BING_TILES_AROUND:
			case BING_TILE_COORDINATES:
			case BING_TILE_POLYGON:
			case BING_TILE_QUADKEY:
			case BING_TILE_ZOOM_LEVEL:
			case GEOMETRY_TO_BING_TILES:
			case SPACE:
			case BINARY:
			case BIT_OR:
			case BIT_AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(1288);
				expression_function();
				}
				break;
			case AVG:
			case CHECKSUM_AGG:
			case COUNT:
			case COUNT_BIG:
			case GROUPING:
			case GROUPING_ID:
			case MAX:
			case MIN:
			case NDV:
			case STDEV:
			case STDEVP:
			case STDDEV_SAMP:
			case SUM:
			case VAR:
			case VARP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1289);
				aggregate_windowed_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatepartContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DBEstSQLParser.ID, 0); }
		public DatepartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datepart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitDatepart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatepartContext datepart() throws RecognitionException {
		DatepartContext _localctx = new DatepartContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_datepart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class As_table_aliasContext extends ParserRuleContext {
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(DBEstSQLParser.AS, 0); }
		public As_table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_table_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitAs_table_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final As_table_aliasContext as_table_alias() throws RecognitionException {
		As_table_aliasContext _localctx = new As_table_aliasContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_as_table_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1295);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1294);
				match(AS);
				}
			}

			setState(1297);
			table_alias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_column_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DBEstSQLParser.ID, 0); }
		public Index_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitIndex_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_column_nameContext index_column_name() throws RecognitionException {
		Index_column_nameContext _localctx = new Index_column_nameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_index_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_valueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DBEstSQLParser.ID, 0); }
		public TerminalNode DECIMAL() { return getToken(DBEstSQLParser.DECIMAL, 0); }
		public Index_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitIndex_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_valueContext index_value() throws RecognitionException {
		Index_valueContext _localctx = new Index_valueContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_index_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			_la = _input.LA(1);
			if ( !(_la==DECIMAL || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_alias_listContext extends ParserRuleContext {
		public List<Column_aliasContext> column_alias() {
			return getRuleContexts(Column_aliasContext.class);
		}
		public Column_aliasContext column_alias(int i) {
			return getRuleContext(Column_aliasContext.class,i);
		}
		public Column_alias_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitColumn_alias_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_alias_listContext column_alias_list() throws RecognitionException {
		Column_alias_listContext _localctx = new Column_alias_listContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_column_alias_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			match(LR_BRACKET);
			setState(1306);
			column_alias();
			setState(1311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1307);
				match(COMMA);
				setState(1308);
				column_alias();
				}
				}
				setState(1313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1314);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode STRING() { return getToken(DBEstSQLParser.STRING, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_column_alias);
		try {
			setState(1318);
			switch (_input.LA(1)) {
			case DISTINCT:
			case LEFT:
			case RIGHT:
			case AGE:
			case AREA:
			case CENTER:
			case CIRCLE:
			case COUNT:
			case DATE:
			case DAY:
			case DAYNAME:
			case DAYOFMONTH:
			case DAYOFWEEK:
			case DAYOFYEAR:
			case DEGREES:
			case DIAMETER:
			case HEIGHT:
			case HOUR:
			case LENGTH:
			case MAKEDATE:
			case MICROSECOND:
			case MINUTE:
			case MOD:
			case MONTH:
			case MONTHNAME:
			case POWER:
			case SCALE:
			case SECOND:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case VARIANCE:
			case WEEKOFYEAR:
			case DOUBLE_QUOTE_ID:
			case BACKTICK_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1316);
				id();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1317);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_value_constructorContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(DBEstSQLParser.VALUES, 0); }
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public Table_value_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_value_constructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitTable_value_constructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_value_constructorContext table_value_constructor() throws RecognitionException {
		Table_value_constructorContext _localctx = new Table_value_constructorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_table_value_constructor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			match(VALUES);
			setState(1321);
			match(LR_BRACKET);
			setState(1322);
			expression_list();
			setState(1323);
			match(RR_BRACKET);
			setState(1331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1324);
					match(COMMA);
					setState(1325);
					match(LR_BRACKET);
					setState(1326);
					expression_list();
					setState(1327);
					match(RR_BRACKET);
					}
					} 
				}
				setState(1333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			expression(0);
			setState(1339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1335);
				match(COMMA);
				setState(1336);
				expression(0);
				}
				}
				setState(1341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_exprContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(DBEstSQLParser.CASE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode END() { return getToken(DBEstSQLParser.END, 0); }
		public List<TerminalNode> WHEN() { return getTokens(DBEstSQLParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(DBEstSQLParser.WHEN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(DBEstSQLParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(DBEstSQLParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(DBEstSQLParser.ELSE, 0); }
		public List<Search_conditionContext> search_condition() {
			return getRuleContexts(Search_conditionContext.class);
		}
		public Search_conditionContext search_condition(int i) {
			return getRuleContext(Search_conditionContext.class,i);
		}
		public Case_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitCase_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_exprContext case_expr() throws RecognitionException {
		Case_exprContext _localctx = new Case_exprContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_case_expr);
		int _la;
		try {
			setState(1375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1342);
				match(CASE);
				setState(1343);
				expression(0);
				setState(1349); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1344);
					match(WHEN);
					setState(1345);
					expression(0);
					setState(1346);
					match(THEN);
					setState(1347);
					expression(0);
					}
					}
					setState(1351); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1355);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1353);
					match(ELSE);
					setState(1354);
					expression(0);
					}
				}

				setState(1357);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1359);
				match(CASE);
				setState(1365); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1360);
					match(WHEN);
					setState(1361);
					search_condition();
					setState(1362);
					match(THEN);
					setState(1363);
					expression(0);
					}
					}
					setState(1367); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1371);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1369);
					match(ELSE);
					setState(1370);
					expression(0);
					}
				}

				setState(1373);
				match(END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ranking_windowed_functionContext extends ParserRuleContext {
		public TerminalNode RANK() { return getToken(DBEstSQLParser.RANK, 0); }
		public Over_clauseContext over_clause() {
			return getRuleContext(Over_clauseContext.class,0);
		}
		public TerminalNode DENSE_RANK() { return getToken(DBEstSQLParser.DENSE_RANK, 0); }
		public TerminalNode NTILE() { return getToken(DBEstSQLParser.NTILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROW_NUMBER() { return getToken(DBEstSQLParser.ROW_NUMBER, 0); }
		public Ranking_windowed_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ranking_windowed_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitRanking_windowed_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ranking_windowed_functionContext ranking_windowed_function() throws RecognitionException {
		Ranking_windowed_functionContext _localctx = new Ranking_windowed_functionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_ranking_windowed_function);
		try {
			setState(1395);
			switch (_input.LA(1)) {
			case RANK:
				enterOuterAlt(_localctx, 1);
				{
				setState(1377);
				match(RANK);
				setState(1378);
				match(LR_BRACKET);
				setState(1379);
				match(RR_BRACKET);
				setState(1380);
				over_clause();
				}
				break;
			case DENSE_RANK:
				enterOuterAlt(_localctx, 2);
				{
				setState(1381);
				match(DENSE_RANK);
				setState(1382);
				match(LR_BRACKET);
				setState(1383);
				match(RR_BRACKET);
				setState(1384);
				over_clause();
				}
				break;
			case NTILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1385);
				match(NTILE);
				setState(1386);
				match(LR_BRACKET);
				setState(1387);
				expression(0);
				setState(1388);
				match(RR_BRACKET);
				setState(1389);
				over_clause();
				}
				break;
			case ROW_NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1391);
				match(ROW_NUMBER);
				setState(1392);
				match(LR_BRACKET);
				setState(1393);
				match(RR_BRACKET);
				setState(1394);
				over_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_functionContext extends ParserRuleContext {
		public Unary_functionContext unary_function() {
			return getRuleContext(Unary_functionContext.class,0);
		}
		public Noparam_functionContext noparam_function() {
			return getRuleContext(Noparam_functionContext.class,0);
		}
		public Binary_functionContext binary_function() {
			return getRuleContext(Binary_functionContext.class,0);
		}
		public Ternary_functionContext ternary_function() {
			return getRuleContext(Ternary_functionContext.class,0);
		}
		public Nary_functionContext nary_function() {
			return getRuleContext(Nary_functionContext.class,0);
		}
		public Unary_predicate_functionContext unary_predicate_function() {
			return getRuleContext(Unary_predicate_functionContext.class,0);
		}
		public Binary_predicate_functionContext binary_predicate_function() {
			return getRuleContext(Binary_predicate_functionContext.class,0);
		}
		public Timestamp_functionContext timestamp_function() {
			return getRuleContext(Timestamp_functionContext.class,0);
		}
		public Dateadd_functionContext dateadd_function() {
			return getRuleContext(Dateadd_functionContext.class,0);
		}
		public Extract_time_functionContext extract_time_function() {
			return getRuleContext(Extract_time_functionContext.class,0);
		}
		public Overlay_string_functionContext overlay_string_function() {
			return getRuleContext(Overlay_string_functionContext.class,0);
		}
		public Substring_string_functionContext substring_string_function() {
			return getRuleContext(Substring_string_functionContext.class,0);
		}
		public Expression_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitExpression_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_functionContext expression_function() throws RecognitionException {
		Expression_functionContext _localctx = new Expression_functionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_expression_function);
		try {
			setState(1409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1397);
				unary_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1398);
				noparam_function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1399);
				binary_function();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1400);
				ternary_function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1401);
				nary_function();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1402);
				unary_predicate_function();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1403);
				binary_predicate_function();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1404);
				timestamp_function();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1405);
				dateadd_function();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1406);
				extract_time_function();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1407);
				overlay_string_function();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1408);
				substring_string_function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extract_time_functionContext extends ParserRuleContext {
		public Token function_name;
		public Extract_unitContext extract_unit() {
			return getRuleContext(Extract_unitContext.class,0);
		}
		public TerminalNode FROM() { return getToken(DBEstSQLParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EXTRACT() { return getToken(DBEstSQLParser.EXTRACT, 0); }
		public Extract_time_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extract_time_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitExtract_time_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extract_time_functionContext extract_time_function() throws RecognitionException {
		Extract_time_functionContext _localctx = new Extract_time_functionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_extract_time_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1411);
			((Extract_time_functionContext)_localctx).function_name = match(EXTRACT);
			setState(1412);
			match(LR_BRACKET);
			setState(1413);
			extract_unit();
			setState(1414);
			match(FROM);
			setState(1415);
			expression(0);
			setState(1416);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extract_unitContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(DBEstSQLParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(DBEstSQLParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(DBEstSQLParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(DBEstSQLParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(DBEstSQLParser.MINUTE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Extract_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extract_unit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitExtract_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extract_unitContext extract_unit() throws RecognitionException {
		Extract_unitContext _localctx = new Extract_unitContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_extract_unit);
		try {
			setState(1424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1418);
				match(YEAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1419);
				match(MONTH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1420);
				match(DAY);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1421);
				match(HOUR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1422);
				match(MINUTE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1423);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_unitContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(DBEstSQLParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(DBEstSQLParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(DBEstSQLParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(DBEstSQLParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(DBEstSQLParser.MINUTE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Time_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_unit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitTime_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_unitContext time_unit() throws RecognitionException {
		Time_unitContext _localctx = new Time_unitContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_time_unit);
		try {
			setState(1432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1426);
				match(YEAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1427);
				match(MONTH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1428);
				match(DAY);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1429);
				match(HOUR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1430);
				match(MINUTE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1431);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Overlay_string_functionContext extends ParserRuleContext {
		public Token function_name;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLACING() { return getToken(DBEstSQLParser.PLACING, 0); }
		public TerminalNode FROM() { return getToken(DBEstSQLParser.FROM, 0); }
		public TerminalNode OVERLAY() { return getToken(DBEstSQLParser.OVERLAY, 0); }
		public TerminalNode FOR() { return getToken(DBEstSQLParser.FOR, 0); }
		public Overlay_string_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overlay_string_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitOverlay_string_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Overlay_string_functionContext overlay_string_function() throws RecognitionException {
		Overlay_string_functionContext _localctx = new Overlay_string_functionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_overlay_string_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
			((Overlay_string_functionContext)_localctx).function_name = match(OVERLAY);
			setState(1435);
			match(LR_BRACKET);
			setState(1436);
			expression(0);
			setState(1437);
			match(PLACING);
			setState(1438);
			expression(0);
			setState(1439);
			match(FROM);
			setState(1440);
			expression(0);
			setState(1443);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(1441);
				match(FOR);
				setState(1442);
				expression(0);
				}
			}

			setState(1445);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Substring_string_functionContext extends ParserRuleContext {
		public Token function_name;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(DBEstSQLParser.FROM, 0); }
		public TerminalNode SUBSTRING() { return getToken(DBEstSQLParser.SUBSTRING, 0); }
		public TerminalNode FOR() { return getToken(DBEstSQLParser.FOR, 0); }
		public Substring_string_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substring_string_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitSubstring_string_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Substring_string_functionContext substring_string_function() throws RecognitionException {
		Substring_string_functionContext _localctx = new Substring_string_functionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_substring_string_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
			((Substring_string_functionContext)_localctx).function_name = match(SUBSTRING);
			setState(1448);
			match(LR_BRACKET);
			setState(1449);
			expression(0);
			setState(1450);
			match(FROM);
			setState(1451);
			expression(0);
			setState(1454);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(1452);
				match(FOR);
				setState(1453);
				expression(0);
				}
			}

			setState(1456);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nary_functionContext extends ParserRuleContext {
		public Token function_name;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CONCAT() { return getToken(DBEstSQLParser.CONCAT, 0); }
		public TerminalNode CONCAT_WS() { return getToken(DBEstSQLParser.CONCAT_WS, 0); }
		public TerminalNode COALESCE() { return getToken(DBEstSQLParser.COALESCE, 0); }
		public TerminalNode FIELD() { return getToken(DBEstSQLParser.FIELD, 0); }
		public TerminalNode GREATEST() { return getToken(DBEstSQLParser.GREATEST, 0); }
		public TerminalNode LEAST() { return getToken(DBEstSQLParser.LEAST, 0); }
		public TerminalNode WIDTH_BUCKET() { return getToken(DBEstSQLParser.WIDTH_BUCKET, 0); }
		public TerminalNode BTRIM() { return getToken(DBEstSQLParser.BTRIM, 0); }
		public TerminalNode FORMAT() { return getToken(DBEstSQLParser.FORMAT, 0); }
		public TerminalNode REGEXP_MATCHES() { return getToken(DBEstSQLParser.REGEXP_MATCHES, 0); }
		public TerminalNode REGEXP_REPLACE() { return getToken(DBEstSQLParser.REGEXP_REPLACE, 0); }
		public TerminalNode REGEXP_SPLIT_TO_ARRAY() { return getToken(DBEstSQLParser.REGEXP_SPLIT_TO_ARRAY, 0); }
		public TerminalNode REGEXP_SPLIT_TO_TABLE() { return getToken(DBEstSQLParser.REGEXP_SPLIT_TO_TABLE, 0); }
		public TerminalNode LTRIM() { return getToken(DBEstSQLParser.LTRIM, 0); }
		public TerminalNode RTRIM() { return getToken(DBEstSQLParser.RTRIM, 0); }
		public TerminalNode TO_ASCII() { return getToken(DBEstSQLParser.TO_ASCII, 0); }
		public TerminalNode MAKE_TIMESTAMP() { return getToken(DBEstSQLParser.MAKE_TIMESTAMP, 0); }
		public TerminalNode MAKE_TIMESTAMPTZ() { return getToken(DBEstSQLParser.MAKE_TIMESTAMPTZ, 0); }
		public TerminalNode TS_HEADLINE() { return getToken(DBEstSQLParser.TS_HEADLINE, 0); }
		public TerminalNode TS_RANK() { return getToken(DBEstSQLParser.TS_RANK, 0); }
		public TerminalNode TS_RANK_CD() { return getToken(DBEstSQLParser.TS_RANK_CD, 0); }
		public List<TerminalNode> UNNEST() { return getTokens(DBEstSQLParser.UNNEST); }
		public TerminalNode UNNEST(int i) {
			return getToken(DBEstSQLParser.UNNEST, i);
		}
		public TerminalNode XMLCONCAT() { return getToken(DBEstSQLParser.XMLCONCAT, 0); }
		public TerminalNode XMLELEMENT() { return getToken(DBEstSQLParser.XMLELEMENT, 0); }
		public TerminalNode XMLFOREST() { return getToken(DBEstSQLParser.XMLFOREST, 0); }
		public TerminalNode JSON_BUILD_ARRAY() { return getToken(DBEstSQLParser.JSON_BUILD_ARRAY, 0); }
		public TerminalNode JSON_BUILD_OBJECT() { return getToken(DBEstSQLParser.JSON_BUILD_OBJECT, 0); }
		public TerminalNode JSONB_SET() { return getToken(DBEstSQLParser.JSONB_SET, 0); }
		public TerminalNode JSONB_INSERT() { return getToken(DBEstSQLParser.JSONB_INSERT, 0); }
		public TerminalNode GREAT_CIRCLE_DISTANCE() { return getToken(DBEstSQLParser.GREAT_CIRCLE_DISTANCE, 0); }
		public TerminalNode BING_TILES_AROUND() { return getToken(DBEstSQLParser.BING_TILES_AROUND, 0); }
		public Nary_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nary_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitNary_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nary_functionContext nary_function() throws RecognitionException {
		Nary_functionContext _localctx = new Nary_functionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_nary_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			((Nary_functionContext)_localctx).function_name = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==COALESCE || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (BTRIM - 256)) | (1L << (CONCAT - 256)) | (1L << (CONCAT_WS - 256)))) != 0) || ((((_la - 336)) & ~0x3f) == 0 && ((1L << (_la - 336)) & ((1L << (FIELD - 336)) | (1L << (FORMAT - 336)) | (1L << (GREATEST - 336)) | (1L << (JSON_BUILD_ARRAY - 336)) | (1L << (JSON_BUILD_OBJECT - 336)))) != 0) || ((((_la - 404)) & ~0x3f) == 0 && ((1L << (_la - 404)) & ((1L << (JSONB_SET - 404)) | (1L << (JSONB_INSERT - 404)) | (1L << (LEAST - 404)) | (1L << (LTRIM - 404)) | (1L << (MAKE_TIMESTAMP - 404)) | (1L << (MAKE_TIMESTAMPTZ - 404)))) != 0) || ((((_la - 540)) & ~0x3f) == 0 && ((1L << (_la - 540)) & ((1L << (REGEXP_MATCHES - 540)) | (1L << (REGEXP_REPLACE - 540)) | (1L << (REGEXP_SPLIT_TO_ARRAY - 540)) | (1L << (REGEXP_SPLIT_TO_TABLE - 540)) | (1L << (RTRIM - 540)))) != 0) || ((((_la - 621)) & ~0x3f) == 0 && ((1L << (_la - 621)) & ((1L << (TO_ASCII - 621)) | (1L << (TS_HEADLINE - 621)) | (1L << (TS_RANK - 621)) | (1L << (TS_RANK_CD - 621)) | (1L << (UNNEST - 621)) | (1L << (WIDTH_BUCKET - 621)) | (1L << (XMLCONCAT - 621)) | (1L << (XMLELEMENT - 621)) | (1L << (XMLFOREST - 621)))) != 0) || _la==GREAT_CIRCLE_DISTANCE || _la==BING_TILES_AROUND) ) {
				((Nary_functionContext)_localctx).function_name = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1459);
			match(LR_BRACKET);
			setState(1460);
			expression(0);
			setState(1465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1461);
				match(COMMA);
				setState(1462);
				expression(0);
				}
				}
				setState(1467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1468);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ternary_functionContext extends ParserRuleContext {
		public Token function_name;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> IF() { return getTokens(DBEstSQLParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(DBEstSQLParser.IF, i);
		}
		public TerminalNode CONV() { return getToken(DBEstSQLParser.CONV, 0); }
		public TerminalNode SUBSTR() { return getToken(DBEstSQLParser.SUBSTR, 0); }
		public TerminalNode HASH() { return getToken(DBEstSQLParser.HASH, 0); }
		public TerminalNode RPAD() { return getToken(DBEstSQLParser.RPAD, 0); }
		public TerminalNode SUBSTRING() { return getToken(DBEstSQLParser.SUBSTRING, 0); }
		public TerminalNode LPAD() { return getToken(DBEstSQLParser.LPAD, 0); }
		public TerminalNode MID() { return getToken(DBEstSQLParser.MID, 0); }
		public TerminalNode REPLACE() { return getToken(DBEstSQLParser.REPLACE, 0); }
		public TerminalNode SUBSTRING_INDEX() { return getToken(DBEstSQLParser.SUBSTRING_INDEX, 0); }
		public TerminalNode MAKETIME() { return getToken(DBEstSQLParser.MAKETIME, 0); }
		public TerminalNode CONVERT() { return getToken(DBEstSQLParser.CONVERT, 0); }
		public TerminalNode SPLIT_PART() { return getToken(DBEstSQLParser.SPLIT_PART, 0); }
		public TerminalNode TRANSLATE() { return getToken(DBEstSQLParser.TRANSLATE, 0); }
		public TerminalNode MAKE_DATE() { return getToken(DBEstSQLParser.MAKE_DATE, 0); }
		public TerminalNode MAKE_TIME() { return getToken(DBEstSQLParser.MAKE_TIME, 0); }
		public TerminalNode SETWEIGHT() { return getToken(DBEstSQLParser.SETWEIGHT, 0); }
		public TerminalNode TS_REWRITE() { return getToken(DBEstSQLParser.TS_REWRITE, 0); }
		public TerminalNode TSQUERY_PHRASE() { return getToken(DBEstSQLParser.TSQUERY_PHRASE, 0); }
		public TerminalNode XMLROOT() { return getToken(DBEstSQLParser.XMLROOT, 0); }
		public TerminalNode XPATH() { return getToken(DBEstSQLParser.XPATH, 0); }
		public TerminalNode XPATH_EXISTS() { return getToken(DBEstSQLParser.XPATH_EXISTS, 0); }
		public TerminalNode ARRAY_REPLACE() { return getToken(DBEstSQLParser.ARRAY_REPLACE, 0); }
		public TerminalNode ARRAY_TO_STRING() { return getToken(DBEstSQLParser.ARRAY_TO_STRING, 0); }
		public TerminalNode STRING_TO_ARRAY() { return getToken(DBEstSQLParser.STRING_TO_ARRAY, 0); }
		public TerminalNode LOCATE() { return getToken(DBEstSQLParser.LOCATE, 0); }
		public TerminalNode BING_TILE() { return getToken(DBEstSQLParser.BING_TILE, 0); }
		public TerminalNode BING_TILE_AT() { return getToken(DBEstSQLParser.BING_TILE_AT, 0); }
		public TerminalNode BING_TILES_AROUND() { return getToken(DBEstSQLParser.BING_TILES_AROUND, 0); }
		public Ternary_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitTernary_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ternary_functionContext ternary_function() throws RecognitionException {
		Ternary_functionContext _localctx = new Ternary_functionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_ternary_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			((Ternary_functionContext)_localctx).function_name = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (CONV - 38)) | (1L << (CONVERT - 38)) | (1L << (HASH - 38)) | (1L << (IF - 38)))) != 0) || _la==MID || _la==RPAD || ((((_la - 176)) & ~0x3f) == 0 && ((1L << (_la - 176)) & ((1L << (SUBSTR - 176)) | (1L << (SUBSTRING - 176)) | (1L << (ARRAY_REPLACE - 176)) | (1L << (ARRAY_TO_STRING - 176)))) != 0) || ((((_la - 426)) & ~0x3f) == 0 && ((1L << (_la - 426)) & ((1L << (LOCATE - 426)) | (1L << (LPAD - 426)) | (1L << (MAKETIME - 426)) | (1L << (MAKE_DATE - 426)) | (1L << (MAKE_TIME - 426)))) != 0) || ((((_la - 547)) & ~0x3f) == 0 && ((1L << (_la - 547)) & ((1L << (REPLACE - 547)) | (1L << (SETWEIGHT - 547)) | (1L << (SPLIT_PART - 547)) | (1L << (STRING_TO_ARRAY - 547)) | (1L << (SUBSTRING_INDEX - 547)))) != 0) || ((((_la - 633)) & ~0x3f) == 0 && ((1L << (_la - 633)) & ((1L << (TRANSLATE - 633)) | (1L << (TS_REWRITE - 633)) | (1L << (TSQUERY_PHRASE - 633)) | (1L << (XMLROOT - 633)) | (1L << (XPATH - 633)) | (1L << (XPATH_EXISTS - 633)))) != 0) || ((((_la - 755)) & ~0x3f) == 0 && ((1L << (_la - 755)) & ((1L << (BING_TILE - 755)) | (1L << (BING_TILE_AT - 755)) | (1L << (BING_TILES_AROUND - 755)))) != 0)) ) {
				((Ternary_functionContext)_localctx).function_name = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1471);
			match(LR_BRACKET);
			setState(1472);
			expression(0);
			setState(1473);
			match(COMMA);
			setState(1474);
			expression(0);
			setState(1475);
			match(COMMA);
			setState(1476);
			expression(0);
			setState(1477);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_functionContext extends ParserRuleContext {
		public Token function_name;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ROUND() { return getToken(DBEstSQLParser.ROUND, 0); }
		public TerminalNode MOD() { return getToken(DBEstSQLParser.MOD, 0); }
		public TerminalNode PMOD() { return getToken(DBEstSQLParser.PMOD, 0); }
		public TerminalNode LEFT() { return getToken(DBEstSQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(DBEstSQLParser.RIGHT, 0); }
		public TerminalNode STRTOL() { return getToken(DBEstSQLParser.STRTOL, 0); }
		public TerminalNode POW() { return getToken(DBEstSQLParser.POW, 0); }
		public TerminalNode POWER() { return getToken(DBEstSQLParser.POWER, 0); }
		public TerminalNode PERCENTILE() { return getToken(DBEstSQLParser.PERCENTILE, 0); }
		public TerminalNode SPLIT() { return getToken(DBEstSQLParser.SPLIT, 0); }
		public TerminalNode INSTR() { return getToken(DBEstSQLParser.INSTR, 0); }
		public TerminalNode ENCODE() { return getToken(DBEstSQLParser.ENCODE, 0); }
		public TerminalNode DECODE() { return getToken(DBEstSQLParser.DECODE, 0); }
		public TerminalNode SHIFTLEFT() { return getToken(DBEstSQLParser.SHIFTLEFT, 0); }
		public TerminalNode SHIFTRIGHT() { return getToken(DBEstSQLParser.SHIFTRIGHT, 0); }
		public TerminalNode SHIFTRIGHTUNSIGNED() { return getToken(DBEstSQLParser.SHIFTRIGHTUNSIGNED, 0); }
		public TerminalNode NVL() { return getToken(DBEstSQLParser.NVL, 0); }
		public TerminalNode FIND_IN_SET() { return getToken(DBEstSQLParser.FIND_IN_SET, 0); }
		public TerminalNode FORMAT_NUMBER() { return getToken(DBEstSQLParser.FORMAT_NUMBER, 0); }
		public TerminalNode FORMAT() { return getToken(DBEstSQLParser.FORMAT, 0); }
		public TerminalNode GET_JSON_OBJECT() { return getToken(DBEstSQLParser.GET_JSON_OBJECT, 0); }
		public TerminalNode IN_FILE() { return getToken(DBEstSQLParser.IN_FILE, 0); }
		public TerminalNode LOCATE() { return getToken(DBEstSQLParser.LOCATE, 0); }
		public TerminalNode REPEAT() { return getToken(DBEstSQLParser.REPEAT, 0); }
		public TerminalNode AES_ENCRYPT() { return getToken(DBEstSQLParser.AES_ENCRYPT, 0); }
		public TerminalNode AES_DECRYPT() { return getToken(DBEstSQLParser.AES_DECRYPT, 0); }
		public TerminalNode POSITION() { return getToken(DBEstSQLParser.POSITION, 0); }
		public TerminalNode STRCMP() { return getToken(DBEstSQLParser.STRCMP, 0); }
		public TerminalNode TRUNCATE() { return getToken(DBEstSQLParser.TRUNCATE, 0); }
		public TerminalNode ADDDATE() { return getToken(DBEstSQLParser.ADDDATE, 0); }
		public TerminalNode ADDTIME() { return getToken(DBEstSQLParser.ADDTIME, 0); }
		public TerminalNode DATEDIFF() { return getToken(DBEstSQLParser.DATEDIFF, 0); }
		public TerminalNode DATE_ADD() { return getToken(DBEstSQLParser.DATE_ADD, 0); }
		public TerminalNode DATE_FORMAT() { return getToken(DBEstSQLParser.DATE_FORMAT, 0); }
		public TerminalNode DATE_SUB() { return getToken(DBEstSQLParser.DATE_SUB, 0); }
		public TerminalNode MAKEDATE() { return getToken(DBEstSQLParser.MAKEDATE, 0); }
		public TerminalNode PERIOD_ADD() { return getToken(DBEstSQLParser.PERIOD_ADD, 0); }
		public TerminalNode PERIOD_DIFF() { return getToken(DBEstSQLParser.PERIOD_DIFF, 0); }
		public TerminalNode SUBDATE() { return getToken(DBEstSQLParser.SUBDATE, 0); }
		public TerminalNode TIME_FORMAT() { return getToken(DBEstSQLParser.TIME_FORMAT, 0); }
		public TerminalNode TIMEDIFF() { return getToken(DBEstSQLParser.TIMEDIFF, 0); }
		public TerminalNode CONVERT() { return getToken(DBEstSQLParser.CONVERT, 0); }
		public TerminalNode IFNULL() { return getToken(DBEstSQLParser.IFNULL, 0); }
		public TerminalNode NULLIF() { return getToken(DBEstSQLParser.NULLIF, 0); }
		public TerminalNode DIV() { return getToken(DBEstSQLParser.DIV, 0); }
		public TerminalNode LOG() { return getToken(DBEstSQLParser.LOG, 0); }
		public TerminalNode TRUNC() { return getToken(DBEstSQLParser.TRUNC, 0); }
		public TerminalNode CONVERT_FROM() { return getToken(DBEstSQLParser.CONVERT_FROM, 0); }
		public TerminalNode CONVERT_TO() { return getToken(DBEstSQLParser.CONVERT_TO, 0); }
		public TerminalNode LENGTH() { return getToken(DBEstSQLParser.LENGTH, 0); }
		public TerminalNode STRPOS() { return getToken(DBEstSQLParser.STRPOS, 0); }
		public TerminalNode GET_BIT() { return getToken(DBEstSQLParser.GET_BIT, 0); }
		public TerminalNode GET_BYTE() { return getToken(DBEstSQLParser.GET_BYTE, 0); }
		public TerminalNode SET_BIT() { return getToken(DBEstSQLParser.SET_BIT, 0); }
		public TerminalNode SET_BYTE() { return getToken(DBEstSQLParser.SET_BYTE, 0); }
		public TerminalNode TO_CHAR() { return getToken(DBEstSQLParser.TO_CHAR, 0); }
		public TerminalNode TO_NUMBER() { return getToken(DBEstSQLParser.TO_NUMBER, 0); }
		public TerminalNode TO_TIMESTAMP() { return getToken(DBEstSQLParser.TO_TIMESTAMP, 0); }
		public TerminalNode AGE() { return getToken(DBEstSQLParser.AGE, 0); }
		public TerminalNode DATE_PART() { return getToken(DBEstSQLParser.DATE_PART, 0); }
		public TerminalNode DATE_TRUNC() { return getToken(DBEstSQLParser.DATE_TRUNC, 0); }
		public TerminalNode ENUM_RANGE() { return getToken(DBEstSQLParser.ENUM_RANGE, 0); }
		public TerminalNode BOUND_BOX() { return getToken(DBEstSQLParser.BOUND_BOX, 0); }
		public TerminalNode CIRCLE() { return getToken(DBEstSQLParser.CIRCLE, 0); }
		public TerminalNode POINT() { return getToken(DBEstSQLParser.POINT, 0); }
		public TerminalNode SET_MASKLEN() { return getToken(DBEstSQLParser.SET_MASKLEN, 0); }
		public TerminalNode INET_SAME_FAMILY() { return getToken(DBEstSQLParser.INET_SAME_FAMILY, 0); }
		public TerminalNode INET_MERGE() { return getToken(DBEstSQLParser.INET_MERGE, 0); }
		public TerminalNode PLAINTO_TSQUERY() { return getToken(DBEstSQLParser.PLAINTO_TSQUERY, 0); }
		public TerminalNode PHRASETO_TSQUERY() { return getToken(DBEstSQLParser.PHRASETO_TSQUERY, 0); }
		public TerminalNode SETWEIGHT() { return getToken(DBEstSQLParser.SETWEIGHT, 0); }
		public TerminalNode TO_TSQUERY() { return getToken(DBEstSQLParser.TO_TSQUERY, 0); }
		public TerminalNode TO_TSVECTOR() { return getToken(DBEstSQLParser.TO_TSVECTOR, 0); }
		public TerminalNode TS_DELETE() { return getToken(DBEstSQLParser.TS_DELETE, 0); }
		public TerminalNode TS_FILTER() { return getToken(DBEstSQLParser.TS_FILTER, 0); }
		public TerminalNode TS_REWRITE() { return getToken(DBEstSQLParser.TS_REWRITE, 0); }
		public TerminalNode TSQUERY_PHRASE() { return getToken(DBEstSQLParser.TSQUERY_PHRASE, 0); }
		public TerminalNode XMLPI() { return getToken(DBEstSQLParser.XMLPI, 0); }
		public TerminalNode XMLROOT() { return getToken(DBEstSQLParser.XMLROOT, 0); }
		public TerminalNode XPATH() { return getToken(DBEstSQLParser.XPATH, 0); }
		public TerminalNode XPATH_EXISTS() { return getToken(DBEstSQLParser.XPATH_EXISTS, 0); }
		public TerminalNode ARRAY_TO_JSON() { return getToken(DBEstSQLParser.ARRAY_TO_JSON, 0); }
		public TerminalNode ROW_TO_JSON() { return getToken(DBEstSQLParser.ROW_TO_JSON, 0); }
		public TerminalNode JSON_OBJECT() { return getToken(DBEstSQLParser.JSON_OBJECT, 0); }
		public TerminalNode JSON_EXTRACT_PATH() { return getToken(DBEstSQLParser.JSON_EXTRACT_PATH, 0); }
		public TerminalNode JSON_EXTRACT_PATH_TEXT() { return getToken(DBEstSQLParser.JSON_EXTRACT_PATH_TEXT, 0); }
		public TerminalNode JSON_POPULATE_RECORDSET() { return getToken(DBEstSQLParser.JSON_POPULATE_RECORDSET, 0); }
		public TerminalNode JSON_POPULATE_RECORD() { return getToken(DBEstSQLParser.JSON_POPULATE_RECORD, 0); }
		public TerminalNode SETVAL() { return getToken(DBEstSQLParser.SETVAL, 0); }
		public TerminalNode ARRAY_APPEND() { return getToken(DBEstSQLParser.ARRAY_APPEND, 0); }
		public TerminalNode ARRAY_CAT() { return getToken(DBEstSQLParser.ARRAY_CAT, 0); }
		public TerminalNode ARRAY_LENGTH() { return getToken(DBEstSQLParser.ARRAY_LENGTH, 0); }
		public TerminalNode ARRAY_LOWER() { return getToken(DBEstSQLParser.ARRAY_LOWER, 0); }
		public TerminalNode ARRAY_POSITION() { return getToken(DBEstSQLParser.ARRAY_POSITION, 0); }
		public TerminalNode ARRAY_POSITIONS() { return getToken(DBEstSQLParser.ARRAY_POSITIONS, 0); }
		public TerminalNode ARRAY_PREPEND() { return getToken(DBEstSQLParser.ARRAY_PREPEND, 0); }
		public TerminalNode ARRAY_REMOVE() { return getToken(DBEstSQLParser.ARRAY_REMOVE, 0); }
		public TerminalNode ARRAY_TO_STRING() { return getToken(DBEstSQLParser.ARRAY_TO_STRING, 0); }
		public TerminalNode ARRAY_UPPER() { return getToken(DBEstSQLParser.ARRAY_UPPER, 0); }
		public TerminalNode STRING_TO_ARRAY() { return getToken(DBEstSQLParser.STRING_TO_ARRAY, 0); }
		public TerminalNode RANGE_MERGE() { return getToken(DBEstSQLParser.RANGE_MERGE, 0); }
		public TerminalNode CORR() { return getToken(DBEstSQLParser.CORR, 0); }
		public TerminalNode COVAR_POP() { return getToken(DBEstSQLParser.COVAR_POP, 0); }
		public TerminalNode COVAR_SAMP() { return getToken(DBEstSQLParser.COVAR_SAMP, 0); }
		public TerminalNode REGR_AVGX() { return getToken(DBEstSQLParser.REGR_AVGX, 0); }
		public TerminalNode REGR_AVGY() { return getToken(DBEstSQLParser.REGR_AVGY, 0); }
		public TerminalNode REGR_COUNT() { return getToken(DBEstSQLParser.REGR_COUNT, 0); }
		public TerminalNode REGR_INTERCEPT() { return getToken(DBEstSQLParser.REGR_INTERCEPT, 0); }
		public TerminalNode REGR_R2() { return getToken(DBEstSQLParser.REGR_R2, 0); }
		public TerminalNode REGR_SLOPE() { return getToken(DBEstSQLParser.REGR_SLOPE, 0); }
		public TerminalNode REGR_SXX() { return getToken(DBEstSQLParser.REGR_SXX, 0); }
		public TerminalNode REGR_SXY() { return getToken(DBEstSQLParser.REGR_SXY, 0); }
		public TerminalNode REGR_SYY() { return getToken(DBEstSQLParser.REGR_SYY, 0); }
		public TerminalNode SUBSTR() { return getToken(DBEstSQLParser.SUBSTR, 0); }
		public TerminalNode STDDEV_POP() { return getToken(DBEstSQLParser.STDDEV_POP, 0); }
		public TerminalNode VARIANCE() { return getToken(DBEstSQLParser.VARIANCE, 0); }
		public TerminalNode VAR_POP() { return getToken(DBEstSQLParser.VAR_POP, 0); }
		public TerminalNode VAR_SAMP() { return getToken(DBEstSQLParser.VAR_SAMP, 0); }
		public TerminalNode INT4LARGER() { return getToken(DBEstSQLParser.INT4LARGER, 0); }
		public TerminalNode SUBSTRING() { return getToken(DBEstSQLParser.SUBSTRING, 0); }
		public TerminalNode ST_POINT() { return getToken(DBEstSQLParser.ST_POINT, 0); }
		public TerminalNode ST_CONTAINS() { return getToken(DBEstSQLParser.ST_CONTAINS, 0); }
		public TerminalNode ST_CROSSES() { return getToken(DBEstSQLParser.ST_CROSSES, 0); }
		public TerminalNode ST_DISJOINT() { return getToken(DBEstSQLParser.ST_DISJOINT, 0); }
		public TerminalNode ST_EQUALS() { return getToken(DBEstSQLParser.ST_EQUALS, 0); }
		public TerminalNode ST_INTERSECTS() { return getToken(DBEstSQLParser.ST_INTERSECTS, 0); }
		public TerminalNode ST_OVERLAPS() { return getToken(DBEstSQLParser.ST_OVERLAPS, 0); }
		public TerminalNode ST_RELATE() { return getToken(DBEstSQLParser.ST_RELATE, 0); }
		public TerminalNode ST_TOUCHES() { return getToken(DBEstSQLParser.ST_TOUCHES, 0); }
		public TerminalNode ST_WITHIN() { return getToken(DBEstSQLParser.ST_WITHIN, 0); }
		public TerminalNode ST_BUFFER() { return getToken(DBEstSQLParser.ST_BUFFER, 0); }
		public TerminalNode ST_DIFFERENCE() { return getToken(DBEstSQLParser.ST_DIFFERENCE, 0); }
		public TerminalNode ST_INTERSECTION() { return getToken(DBEstSQLParser.ST_INTERSECTION, 0); }
		public TerminalNode ST_SYMDIFFERENCE() { return getToken(DBEstSQLParser.ST_SYMDIFFERENCE, 0); }
		public TerminalNode ST_UNION() { return getToken(DBEstSQLParser.ST_UNION, 0); }
		public TerminalNode ST_DISTANCE() { return getToken(DBEstSQLParser.ST_DISTANCE, 0); }
		public TerminalNode ST_GEOMETRYN() { return getToken(DBEstSQLParser.ST_GEOMETRYN, 0); }
		public TerminalNode ST_INTERIORRINGN() { return getToken(DBEstSQLParser.ST_INTERIORRINGN, 0); }
		public TerminalNode ST_POINTN() { return getToken(DBEstSQLParser.ST_POINTN, 0); }
		public TerminalNode SIMPLIFY_GEOMETRY() { return getToken(DBEstSQLParser.SIMPLIFY_GEOMETRY, 0); }
		public TerminalNode LINE_LOCATE_POINT() { return getToken(DBEstSQLParser.LINE_LOCATE_POINT, 0); }
		public TerminalNode GEOMETRY_TO_BING_TILES() { return getToken(DBEstSQLParser.GEOMETRY_TO_BING_TILES, 0); }
		public Binary_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitBinary_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_functionContext binary_function() throws RecognitionException {
		Binary_functionContext _localctx = new Binary_functionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_binary_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479);
			((Binary_functionContext)_localctx).function_name = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==CONVERT || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (INT4LARGER - 99)) | (1L << (LEFT - 99)) | (1L << (NULLIF - 99)) | (1L << (RIGHT - 99)))) != 0) || ((((_la - 176)) & ~0x3f) == 0 && ((1L << (_la - 176)) & ((1L << (SUBSTR - 176)) | (1L << (SUBSTRING - 176)) | (1L << (TRUNCATE - 176)) | (1L << (ADDDATE - 176)) | (1L << (ADDTIME - 176)) | (1L << (AES_DECRYPT - 176)) | (1L << (AES_ENCRYPT - 176)) | (1L << (AGE - 176)) | (1L << (ARRAY_APPEND - 176)) | (1L << (ARRAY_CAT - 176)) | (1L << (ARRAY_LENGTH - 176)) | (1L << (ARRAY_LOWER - 176)) | (1L << (ARRAY_POSITION - 176)) | (1L << (ARRAY_POSITIONS - 176)) | (1L << (ARRAY_PREPEND - 176)) | (1L << (ARRAY_REMOVE - 176)) | (1L << (ARRAY_TO_JSON - 176)) | (1L << (ARRAY_TO_STRING - 176)) | (1L << (ARRAY_UPPER - 176)))) != 0) || ((((_la - 254)) & ~0x3f) == 0 && ((1L << (_la - 254)) & ((1L << (BOUND_BOX - 254)) | (1L << (CIRCLE - 254)) | (1L << (CONVERT_FROM - 254)) | (1L << (CONVERT_TO - 254)) | (1L << (CORR - 254)) | (1L << (COVAR_POP - 254)) | (1L << (COVAR_SAMP - 254)) | (1L << (DATE_ADD - 254)) | (1L << (DATE_FORMAT - 254)) | (1L << (DATE_PART - 254)) | (1L << (DATE_SUB - 254)) | (1L << (DATE_TRUNC - 254)) | (1L << (DATEDIFF - 254)) | (1L << (DECODE - 254)))) != 0) || ((((_la - 318)) & ~0x3f) == 0 && ((1L << (_la - 318)) & ((1L << (DIV - 318)) | (1L << (ENCODE - 318)) | (1L << (ENUM_RANGE - 318)) | (1L << (FIND_IN_SET - 318)) | (1L << (FORMAT - 318)) | (1L << (FORMAT_NUMBER - 318)) | (1L << (GET_BIT - 318)) | (1L << (GET_BYTE - 318)) | (1L << (GET_JSON_OBJECT - 318)) | (1L << (IFNULL - 318)) | (1L << (INSTR - 318)) | (1L << (IN_FILE - 318)) | (1L << (INET_SAME_FAMILY - 318)) | (1L << (INET_MERGE - 318)))) != 0) || ((((_la - 391)) & ~0x3f) == 0 && ((1L << (_la - 391)) & ((1L << (JSON_EXTRACT_PATH - 391)) | (1L << (JSON_EXTRACT_PATH_TEXT - 391)) | (1L << (JSON_OBJECT - 391)) | (1L << (JSON_POPULATE_RECORD - 391)) | (1L << (JSON_POPULATE_RECORDSET - 391)) | (1L << (LENGTH - 391)) | (1L << (LOCATE - 391)) | (1L << (LOG - 391)) | (1L << (MAKEDATE - 391)))) != 0) || ((((_la - 456)) & ~0x3f) == 0 && ((1L << (_la - 456)) & ((1L << (MOD - 456)) | (1L << (NVL - 456)) | (1L << (PERCENTILE - 456)) | (1L << (PERIOD_ADD - 456)) | (1L << (PERIOD_DIFF - 456)) | (1L << (PLAINTO_TSQUERY - 456)) | (1L << (PHRASETO_TSQUERY - 456)) | (1L << (PMOD - 456)) | (1L << (POINT - 456)) | (1L << (POSITION - 456)) | (1L << (POW - 456)) | (1L << (POWER - 456)))) != 0) || ((((_la - 523)) & ~0x3f) == 0 && ((1L << (_la - 523)) & ((1L << (RANGE_MERGE - 523)) | (1L << (REGR_AVGX - 523)) | (1L << (REGR_AVGY - 523)) | (1L << (REGR_COUNT - 523)) | (1L << (REGR_INTERCEPT - 523)) | (1L << (REGR_R2 - 523)) | (1L << (REGR_SLOPE - 523)) | (1L << (REGR_SXX - 523)) | (1L << (REGR_SXY - 523)) | (1L << (REGR_SYY - 523)) | (1L << (REPEAT - 523)) | (1L << (ROUND - 523)) | (1L << (ROW_TO_JSON - 523)) | (1L << (SETWEIGHT - 523)) | (1L << (SETVAL - 523)) | (1L << (SET_BIT - 523)) | (1L << (SET_BYTE - 523)) | (1L << (SET_MASKLEN - 523)) | (1L << (SHIFTLEFT - 523)) | (1L << (SHIFTRIGHT - 523)) | (1L << (SHIFTRIGHTUNSIGNED - 523)) | (1L << (SPLIT - 523)))) != 0) || ((((_la - 597)) & ~0x3f) == 0 && ((1L << (_la - 597)) & ((1L << (STRCMP - 597)) | (1L << (STRING_TO_ARRAY - 597)) | (1L << (STRPOS - 597)) | (1L << (SUBDATE - 597)) | (1L << (STDDEV_POP - 597)) | (1L << (STRTOL - 597)) | (1L << (TIMEDIFF - 597)) | (1L << (TIME_FORMAT - 597)) | (1L << (TO_CHAR - 597)) | (1L << (TO_NUMBER - 597)) | (1L << (TO_TIMESTAMP - 597)) | (1L << (TO_TSQUERY - 597)) | (1L << (TO_TSVECTOR - 597)) | (1L << (TRUNC - 597)) | (1L << (TS_DELETE - 597)) | (1L << (TS_FILTER - 597)) | (1L << (TS_REWRITE - 597)) | (1L << (TSQUERY_PHRASE - 597)))) != 0) || ((((_la - 665)) & ~0x3f) == 0 && ((1L << (_la - 665)) & ((1L << (VARIANCE - 665)) | (1L << (VAR_POP - 665)) | (1L << (VAR_SAMP - 665)) | (1L << (XMLPI - 665)) | (1L << (XMLROOT - 665)) | (1L << (XPATH - 665)) | (1L << (XPATH_EXISTS - 665)) | (1L << (ST_POINT - 665)) | (1L << (ST_CONTAINS - 665)) | (1L << (ST_CROSSES - 665)) | (1L << (ST_DISJOINT - 665)) | (1L << (ST_EQUALS - 665)) | (1L << (ST_INTERSECTS - 665)) | (1L << (ST_OVERLAPS - 665)) | (1L << (ST_RELATE - 665)) | (1L << (ST_TOUCHES - 665)) | (1L << (ST_WITHIN - 665)) | (1L << (ST_BUFFER - 665)) | (1L << (ST_DIFFERENCE - 665)) | (1L << (ST_INTERSECTION - 665)) | (1L << (ST_SYMDIFFERENCE - 665)) | (1L << (ST_UNION - 665)) | (1L << (ST_DISTANCE - 665)) | (1L << (ST_GEOMETRYN - 665)) | (1L << (ST_INTERIORRINGN - 665)))) != 0) || ((((_la - 735)) & ~0x3f) == 0 && ((1L << (_la - 735)) & ((1L << (ST_POINTN - 735)) | (1L << (SIMPLIFY_GEOMETRY - 735)) | (1L << (LINE_LOCATE_POINT - 735)) | (1L << (GEOMETRY_TO_BING_TILES - 735)))) != 0)) ) {
				((Binary_functionContext)_localctx).function_name = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1480);
			match(LR_BRACKET);
			setState(1481);
			expression(0);
			setState(1482);
			match(COMMA);
			setState(1483);
			expression(0);
			setState(1484);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_functionContext extends ParserRuleContext {
		public Token function_name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ISNULL() { return getToken(DBEstSQLParser.ISNULL, 0); }
		public TerminalNode ROUND() { return getToken(DBEstSQLParser.ROUND, 0); }
		public TerminalNode CHAR_LENGTH() { return getToken(DBEstSQLParser.CHAR_LENGTH, 0); }
		public TerminalNode FLOOR() { return getToken(DBEstSQLParser.FLOOR, 0); }
		public TerminalNode CEIL() { return getToken(DBEstSQLParser.CEIL, 0); }
		public TerminalNode CEILING() { return getToken(DBEstSQLParser.CEILING, 0); }
		public TerminalNode EXP() { return getToken(DBEstSQLParser.EXP, 0); }
		public TerminalNode LN() { return getToken(DBEstSQLParser.LN, 0); }
		public TerminalNode LOG() { return getToken(DBEstSQLParser.LOG, 0); }
		public TerminalNode LOG10() { return getToken(DBEstSQLParser.LOG10, 0); }
		public TerminalNode LOG2() { return getToken(DBEstSQLParser.LOG2, 0); }
		public TerminalNode SIN() { return getToken(DBEstSQLParser.SIN, 0); }
		public TerminalNode COS() { return getToken(DBEstSQLParser.COS, 0); }
		public TerminalNode COT() { return getToken(DBEstSQLParser.COT, 0); }
		public TerminalNode TAN() { return getToken(DBEstSQLParser.TAN, 0); }
		public TerminalNode SIGN() { return getToken(DBEstSQLParser.SIGN, 0); }
		public TerminalNode RAND() { return getToken(DBEstSQLParser.RAND, 0); }
		public TerminalNode FNV_HASH() { return getToken(DBEstSQLParser.FNV_HASH, 0); }
		public TerminalNode RAWTOHEX() { return getToken(DBEstSQLParser.RAWTOHEX, 0); }
		public TerminalNode ABS() { return getToken(DBEstSQLParser.ABS, 0); }
		public TerminalNode STDDEV() { return getToken(DBEstSQLParser.STDDEV, 0); }
		public TerminalNode SQRT() { return getToken(DBEstSQLParser.SQRT, 0); }
		public TerminalNode LCASE() { return getToken(DBEstSQLParser.LCASE, 0); }
		public TerminalNode MD5() { return getToken(DBEstSQLParser.MD5, 0); }
		public TerminalNode CRC32() { return getToken(DBEstSQLParser.CRC32, 0); }
		public TerminalNode YEAR() { return getToken(DBEstSQLParser.YEAR, 0); }
		public TerminalNode QUARTER() { return getToken(DBEstSQLParser.QUARTER, 0); }
		public TerminalNode MONTH() { return getToken(DBEstSQLParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(DBEstSQLParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(DBEstSQLParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(DBEstSQLParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(DBEstSQLParser.SECOND, 0); }
		public TerminalNode WEEKOFYEAR() { return getToken(DBEstSQLParser.WEEKOFYEAR, 0); }
		public TerminalNode LOWER() { return getToken(DBEstSQLParser.LOWER, 0); }
		public TerminalNode UPPER() { return getToken(DBEstSQLParser.UPPER, 0); }
		public TerminalNode UCASE() { return getToken(DBEstSQLParser.UCASE, 0); }
		public TerminalNode ASCII() { return getToken(DBEstSQLParser.ASCII, 0); }
		public TerminalNode CHARACTER_LENGTH() { return getToken(DBEstSQLParser.CHARACTER_LENGTH, 0); }
		public TerminalNode FACTORIAL() { return getToken(DBEstSQLParser.FACTORIAL, 0); }
		public TerminalNode CBRT() { return getToken(DBEstSQLParser.CBRT, 0); }
		public TerminalNode LENGTH() { return getToken(DBEstSQLParser.LENGTH, 0); }
		public TerminalNode TRIM() { return getToken(DBEstSQLParser.TRIM, 0); }
		public TerminalNode ASIN() { return getToken(DBEstSQLParser.ASIN, 0); }
		public TerminalNode ACOS() { return getToken(DBEstSQLParser.ACOS, 0); }
		public TerminalNode ATAN() { return getToken(DBEstSQLParser.ATAN, 0); }
		public TerminalNode ATAN2() { return getToken(DBEstSQLParser.ATAN2, 0); }
		public TerminalNode DEGREES() { return getToken(DBEstSQLParser.DEGREES, 0); }
		public TerminalNode RADIANS() { return getToken(DBEstSQLParser.RADIANS, 0); }
		public TerminalNode POSITIVE() { return getToken(DBEstSQLParser.POSITIVE, 0); }
		public TerminalNode NEGATIVE() { return getToken(DBEstSQLParser.NEGATIVE, 0); }
		public TerminalNode BROUND() { return getToken(DBEstSQLParser.BROUND, 0); }
		public TerminalNode BIN() { return getToken(DBEstSQLParser.BIN, 0); }
		public TerminalNode HEX() { return getToken(DBEstSQLParser.HEX, 0); }
		public TerminalNode UNHEX() { return getToken(DBEstSQLParser.UNHEX, 0); }
		public TerminalNode FROM_UNIXTIME() { return getToken(DBEstSQLParser.FROM_UNIXTIME, 0); }
		public TerminalNode TO_DATE() { return getToken(DBEstSQLParser.TO_DATE, 0); }
		public List<TerminalNode> CHR() { return getTokens(DBEstSQLParser.CHR); }
		public TerminalNode CHR(int i) {
			return getToken(DBEstSQLParser.CHR, i);
		}
		public TerminalNode LTRIM() { return getToken(DBEstSQLParser.LTRIM, 0); }
		public TerminalNode RTRIM() { return getToken(DBEstSQLParser.RTRIM, 0); }
		public TerminalNode REVERSE() { return getToken(DBEstSQLParser.REVERSE, 0); }
		public TerminalNode SPACE_FUNCTION() { return getToken(DBEstSQLParser.SPACE_FUNCTION, 0); }
		public TerminalNode SHA1() { return getToken(DBEstSQLParser.SHA1, 0); }
		public TerminalNode SHA2() { return getToken(DBEstSQLParser.SHA2, 0); }
		public TerminalNode SPACE() { return getToken(DBEstSQLParser.SPACE, 0); }
		public TerminalNode DATE() { return getToken(DBEstSQLParser.DATE, 0); }
		public TerminalNode DAYNAME() { return getToken(DBEstSQLParser.DAYNAME, 0); }
		public TerminalNode DAYOFMONTH() { return getToken(DBEstSQLParser.DAYOFMONTH, 0); }
		public TerminalNode DAYOFWEEK() { return getToken(DBEstSQLParser.DAYOFWEEK, 0); }
		public TerminalNode DAYOFYEAR() { return getToken(DBEstSQLParser.DAYOFYEAR, 0); }
		public TerminalNode FROM_DAYS() { return getToken(DBEstSQLParser.FROM_DAYS, 0); }
		public TerminalNode LAST_DAY() { return getToken(DBEstSQLParser.LAST_DAY, 0); }
		public TerminalNode MICROSECOND() { return getToken(DBEstSQLParser.MICROSECOND, 0); }
		public TerminalNode MONTHNAME() { return getToken(DBEstSQLParser.MONTHNAME, 0); }
		public TerminalNode SEC_TO_TIME() { return getToken(DBEstSQLParser.SEC_TO_TIME, 0); }
		public TerminalNode STR_TO_DATE() { return getToken(DBEstSQLParser.STR_TO_DATE, 0); }
		public TerminalNode TIME() { return getToken(DBEstSQLParser.TIME, 0); }
		public TerminalNode TIME_TO_SEC() { return getToken(DBEstSQLParser.TIME_TO_SEC, 0); }
		public TerminalNode TIMESTAMP() { return getToken(DBEstSQLParser.TIMESTAMP, 0); }
		public TerminalNode TO_DAYS() { return getToken(DBEstSQLParser.TO_DAYS, 0); }
		public TerminalNode WEEK() { return getToken(DBEstSQLParser.WEEK, 0); }
		public TerminalNode WEEKDAY() { return getToken(DBEstSQLParser.WEEKDAY, 0); }
		public TerminalNode YEARWEEK() { return getToken(DBEstSQLParser.YEARWEEK, 0); }
		public TerminalNode BINARY() { return getToken(DBEstSQLParser.BINARY, 0); }
		public TerminalNode SCALE() { return getToken(DBEstSQLParser.SCALE, 0); }
		public TerminalNode TRUNC() { return getToken(DBEstSQLParser.TRUNC, 0); }
		public TerminalNode SETSEED() { return getToken(DBEstSQLParser.SETSEED, 0); }
		public TerminalNode BIT_LENGTH() { return getToken(DBEstSQLParser.BIT_LENGTH, 0); }
		public TerminalNode OCTET_LENGTH() { return getToken(DBEstSQLParser.OCTET_LENGTH, 0); }
		public TerminalNode INITCAP() { return getToken(DBEstSQLParser.INITCAP, 0); }
		public TerminalNode QUOTE_IDENT() { return getToken(DBEstSQLParser.QUOTE_IDENT, 0); }
		public TerminalNode QUOTE_LITERAL() { return getToken(DBEstSQLParser.QUOTE_LITERAL, 0); }
		public TerminalNode QUOTE_NULLABLE() { return getToken(DBEstSQLParser.QUOTE_NULLABLE, 0); }
		public TerminalNode TO_HEX() { return getToken(DBEstSQLParser.TO_HEX, 0); }
		public TerminalNode AGE() { return getToken(DBEstSQLParser.AGE, 0); }
		public TerminalNode ISFINITE() { return getToken(DBEstSQLParser.ISFINITE, 0); }
		public TerminalNode JUSTIFY_DAYS() { return getToken(DBEstSQLParser.JUSTIFY_DAYS, 0); }
		public TerminalNode JUSTIFY_HOURS() { return getToken(DBEstSQLParser.JUSTIFY_HOURS, 0); }
		public TerminalNode JUSTIFY_INTERVALS() { return getToken(DBEstSQLParser.JUSTIFY_INTERVALS, 0); }
		public TerminalNode TO_TIMESTAMP() { return getToken(DBEstSQLParser.TO_TIMESTAMP, 0); }
		public TerminalNode ENUM_RANGE() { return getToken(DBEstSQLParser.ENUM_RANGE, 0); }
		public TerminalNode ENUM_FIRST() { return getToken(DBEstSQLParser.ENUM_FIRST, 0); }
		public TerminalNode ENUM_LAST() { return getToken(DBEstSQLParser.ENUM_LAST, 0); }
		public TerminalNode AREA() { return getToken(DBEstSQLParser.AREA, 0); }
		public TerminalNode CENTER() { return getToken(DBEstSQLParser.CENTER, 0); }
		public TerminalNode DIAMETER() { return getToken(DBEstSQLParser.DIAMETER, 0); }
		public TerminalNode HEIGHT() { return getToken(DBEstSQLParser.HEIGHT, 0); }
		public TerminalNode ISCLOSED() { return getToken(DBEstSQLParser.ISCLOSED, 0); }
		public TerminalNode ISOPEN() { return getToken(DBEstSQLParser.ISOPEN, 0); }
		public TerminalNode NPOINTS() { return getToken(DBEstSQLParser.NPOINTS, 0); }
		public TerminalNode PCLOSE() { return getToken(DBEstSQLParser.PCLOSE, 0); }
		public TerminalNode POPEN() { return getToken(DBEstSQLParser.POPEN, 0); }
		public TerminalNode RADIUS() { return getToken(DBEstSQLParser.RADIUS, 0); }
		public TerminalNode WIDTH() { return getToken(DBEstSQLParser.WIDTH, 0); }
		public TerminalNode BOX() { return getToken(DBEstSQLParser.BOX, 0); }
		public TerminalNode CIRCLE() { return getToken(DBEstSQLParser.CIRCLE, 0); }
		public TerminalNode LINE() { return getToken(DBEstSQLParser.LINE, 0); }
		public TerminalNode LSEG() { return getToken(DBEstSQLParser.LSEG, 0); }
		public TerminalNode PATH() { return getToken(DBEstSQLParser.PATH, 0); }
		public TerminalNode POINT() { return getToken(DBEstSQLParser.POINT, 0); }
		public TerminalNode POLYGON() { return getToken(DBEstSQLParser.POLYGON, 0); }
		public TerminalNode ABBREV() { return getToken(DBEstSQLParser.ABBREV, 0); }
		public TerminalNode BROADCAST() { return getToken(DBEstSQLParser.BROADCAST, 0); }
		public TerminalNode FAMILY() { return getToken(DBEstSQLParser.FAMILY, 0); }
		public TerminalNode HOST() { return getToken(DBEstSQLParser.HOST, 0); }
		public TerminalNode HOSTMASK() { return getToken(DBEstSQLParser.HOSTMASK, 0); }
		public TerminalNode MASKLEN() { return getToken(DBEstSQLParser.MASKLEN, 0); }
		public TerminalNode NETMASK() { return getToken(DBEstSQLParser.NETMASK, 0); }
		public TerminalNode NETWORK() { return getToken(DBEstSQLParser.NETWORK, 0); }
		public TerminalNode TEXT() { return getToken(DBEstSQLParser.TEXT, 0); }
		public TerminalNode MACADDR8_SET7BIT() { return getToken(DBEstSQLParser.MACADDR8_SET7BIT, 0); }
		public TerminalNode ARRAY_TO_TSVECTOR() { return getToken(DBEstSQLParser.ARRAY_TO_TSVECTOR, 0); }
		public TerminalNode NUMNODE() { return getToken(DBEstSQLParser.NUMNODE, 0); }
		public TerminalNode PLAINTO_TSQUERY() { return getToken(DBEstSQLParser.PLAINTO_TSQUERY, 0); }
		public TerminalNode PHRASETO_TSQUERY() { return getToken(DBEstSQLParser.PHRASETO_TSQUERY, 0); }
		public TerminalNode QUERYTREE() { return getToken(DBEstSQLParser.QUERYTREE, 0); }
		public TerminalNode STRIP() { return getToken(DBEstSQLParser.STRIP, 0); }
		public TerminalNode TO_TSQUERY() { return getToken(DBEstSQLParser.TO_TSQUERY, 0); }
		public TerminalNode TO_TSVECTOR() { return getToken(DBEstSQLParser.TO_TSVECTOR, 0); }
		public TerminalNode TSVECTOR_TO_ARRAY() { return getToken(DBEstSQLParser.TSVECTOR_TO_ARRAY, 0); }
		public TerminalNode XMLCOMMENT() { return getToken(DBEstSQLParser.XMLCOMMENT, 0); }
		public TerminalNode XMLPI() { return getToken(DBEstSQLParser.XMLPI, 0); }
		public TerminalNode XMLAGG() { return getToken(DBEstSQLParser.XMLAGG, 0); }
		public TerminalNode XML_ISWELL_FORMAT() { return getToken(DBEstSQLParser.XML_ISWELL_FORMAT, 0); }
		public TerminalNode TO_JSON() { return getToken(DBEstSQLParser.TO_JSON, 0); }
		public TerminalNode TO_JSONB() { return getToken(DBEstSQLParser.TO_JSONB, 0); }
		public TerminalNode ARRAY_TO_JSON() { return getToken(DBEstSQLParser.ARRAY_TO_JSON, 0); }
		public TerminalNode ROW_TO_JSON() { return getToken(DBEstSQLParser.ROW_TO_JSON, 0); }
		public TerminalNode JSON_OBJECT() { return getToken(DBEstSQLParser.JSON_OBJECT, 0); }
		public TerminalNode JSON_ARRAY_LENGTH() { return getToken(DBEstSQLParser.JSON_ARRAY_LENGTH, 0); }
		public TerminalNode JSON_EACH() { return getToken(DBEstSQLParser.JSON_EACH, 0); }
		public TerminalNode JSON_EACH_TEXT() { return getToken(DBEstSQLParser.JSON_EACH_TEXT, 0); }
		public TerminalNode JSON_OBJECT_KEYS() { return getToken(DBEstSQLParser.JSON_OBJECT_KEYS, 0); }
		public TerminalNode JSON_ARRAY_ELEMENTS() { return getToken(DBEstSQLParser.JSON_ARRAY_ELEMENTS, 0); }
		public TerminalNode JSON_ARRAY_ELEMENTS_TEXT() { return getToken(DBEstSQLParser.JSON_ARRAY_ELEMENTS_TEXT, 0); }
		public TerminalNode JSON_TYPEOF() { return getToken(DBEstSQLParser.JSON_TYPEOF, 0); }
		public TerminalNode JSON_TO_RECORD() { return getToken(DBEstSQLParser.JSON_TO_RECORD, 0); }
		public TerminalNode JSON_TO_RECORDSET() { return getToken(DBEstSQLParser.JSON_TO_RECORDSET, 0); }
		public TerminalNode JSON_STRIP_NULLS() { return getToken(DBEstSQLParser.JSON_STRIP_NULLS, 0); }
		public TerminalNode JSONB_PRETTY() { return getToken(DBEstSQLParser.JSONB_PRETTY, 0); }
		public TerminalNode CURRVAL() { return getToken(DBEstSQLParser.CURRVAL, 0); }
		public TerminalNode NEXTVAL() { return getToken(DBEstSQLParser.NEXTVAL, 0); }
		public TerminalNode ARRAY_NDIMS() { return getToken(DBEstSQLParser.ARRAY_NDIMS, 0); }
		public TerminalNode ARRAY_DIMS() { return getToken(DBEstSQLParser.ARRAY_DIMS, 0); }
		public TerminalNode CARDINALITY() { return getToken(DBEstSQLParser.CARDINALITY, 0); }
		public TerminalNode ISEMPTY() { return getToken(DBEstSQLParser.ISEMPTY, 0); }
		public TerminalNode LOWER_INC() { return getToken(DBEstSQLParser.LOWER_INC, 0); }
		public TerminalNode UPPER_INC() { return getToken(DBEstSQLParser.UPPER_INC, 0); }
		public TerminalNode LOWER_INF() { return getToken(DBEstSQLParser.LOWER_INF, 0); }
		public TerminalNode UPPER_INF() { return getToken(DBEstSQLParser.UPPER_INF, 0); }
		public TerminalNode ARRAY_AGG() { return getToken(DBEstSQLParser.ARRAY_AGG, 0); }
		public TerminalNode BIT_AND() { return getToken(DBEstSQLParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(DBEstSQLParser.BIT_OR, 0); }
		public TerminalNode BOOL_AND() { return getToken(DBEstSQLParser.BOOL_AND, 0); }
		public TerminalNode BOOL_OR() { return getToken(DBEstSQLParser.BOOL_OR, 0); }
		public TerminalNode EVERY() { return getToken(DBEstSQLParser.EVERY, 0); }
		public TerminalNode JSON_AGG() { return getToken(DBEstSQLParser.JSON_AGG, 0); }
		public TerminalNode JSONB_AGG() { return getToken(DBEstSQLParser.JSONB_AGG, 0); }
		public TerminalNode JSON_OBJECT_AGG() { return getToken(DBEstSQLParser.JSON_OBJECT_AGG, 0); }
		public TerminalNode JSONB_OBJECT_AGG() { return getToken(DBEstSQLParser.JSONB_OBJECT_AGG, 0); }
		public TerminalNode STRING_AGG() { return getToken(DBEstSQLParser.STRING_AGG, 0); }
		public TerminalNode ST_ASBINARY() { return getToken(DBEstSQLParser.ST_ASBINARY, 0); }
		public TerminalNode ST_ASTEXT() { return getToken(DBEstSQLParser.ST_ASTEXT, 0); }
		public TerminalNode ST_GEOMETRYFROMTEXT() { return getToken(DBEstSQLParser.ST_GEOMETRYFROMTEXT, 0); }
		public TerminalNode ST_GEOMFROMBINARY() { return getToken(DBEstSQLParser.ST_GEOMFROMBINARY, 0); }
		public TerminalNode ST_LINEFROMTEXT() { return getToken(DBEstSQLParser.ST_LINEFROMTEXT, 0); }
		public TerminalNode ST_LINESTRING() { return getToken(DBEstSQLParser.ST_LINESTRING, 0); }
		public TerminalNode ST_MULTIPOINT() { return getToken(DBEstSQLParser.ST_MULTIPOINT, 0); }
		public TerminalNode ST_POLYGON() { return getToken(DBEstSQLParser.ST_POLYGON, 0); }
		public TerminalNode GEOMETRY_UNION() { return getToken(DBEstSQLParser.GEOMETRY_UNION, 0); }
		public TerminalNode ST_BOUNDARY() { return getToken(DBEstSQLParser.ST_BOUNDARY, 0); }
		public TerminalNode ST_ENVELOPE() { return getToken(DBEstSQLParser.ST_ENVELOPE, 0); }
		public TerminalNode ST_ENVELOPEASPTS() { return getToken(DBEstSQLParser.ST_ENVELOPEASPTS, 0); }
		public TerminalNode ST_EXTERIORRING() { return getToken(DBEstSQLParser.ST_EXTERIORRING, 0); }
		public TerminalNode ST_AREA() { return getToken(DBEstSQLParser.ST_AREA, 0); }
		public TerminalNode ST_CENTROID() { return getToken(DBEstSQLParser.ST_CENTROID, 0); }
		public TerminalNode ST_CONVEXHULL() { return getToken(DBEstSQLParser.ST_CONVEXHULL, 0); }
		public TerminalNode ST_DIMENSION() { return getToken(DBEstSQLParser.ST_DIMENSION, 0); }
		public TerminalNode ST_GEOMETRYTYPE() { return getToken(DBEstSQLParser.ST_GEOMETRYTYPE, 0); }
		public TerminalNode ST_ISCLOSED() { return getToken(DBEstSQLParser.ST_ISCLOSED, 0); }
		public TerminalNode ST_ISEMPTY() { return getToken(DBEstSQLParser.ST_ISEMPTY, 0); }
		public TerminalNode ST_ISSIMPLE() { return getToken(DBEstSQLParser.ST_ISSIMPLE, 0); }
		public TerminalNode ST_ISRING() { return getToken(DBEstSQLParser.ST_ISRING, 0); }
		public TerminalNode ST_ISVALID() { return getToken(DBEstSQLParser.ST_ISVALID, 0); }
		public TerminalNode ST_LENGTH() { return getToken(DBEstSQLParser.ST_LENGTH, 0); }
		public TerminalNode ST_XMAX() { return getToken(DBEstSQLParser.ST_XMAX, 0); }
		public TerminalNode ST_YMAX() { return getToken(DBEstSQLParser.ST_YMAX, 0); }
		public TerminalNode ST_XMIN() { return getToken(DBEstSQLParser.ST_XMIN, 0); }
		public TerminalNode ST_YMIN() { return getToken(DBEstSQLParser.ST_YMIN, 0); }
		public TerminalNode ST_STARTPOINT() { return getToken(DBEstSQLParser.ST_STARTPOINT, 0); }
		public TerminalNode ST_ENDPOINT() { return getToken(DBEstSQLParser.ST_ENDPOINT, 0); }
		public TerminalNode ST_X() { return getToken(DBEstSQLParser.ST_X, 0); }
		public TerminalNode ST_Y() { return getToken(DBEstSQLParser.ST_Y, 0); }
		public TerminalNode ST_INTERIORRINGS() { return getToken(DBEstSQLParser.ST_INTERIORRINGS, 0); }
		public TerminalNode ST_NUMGEOMETRIES() { return getToken(DBEstSQLParser.ST_NUMGEOMETRIES, 0); }
		public TerminalNode ST_GEOMETRIES() { return getToken(DBEstSQLParser.ST_GEOMETRIES, 0); }
		public TerminalNode ST_NUMPOINTS() { return getToken(DBEstSQLParser.ST_NUMPOINTS, 0); }
		public TerminalNode ST_NUMINTERIORRING() { return getToken(DBEstSQLParser.ST_NUMINTERIORRING, 0); }
		public TerminalNode GEOMETRY_INVALID_REASON() { return getToken(DBEstSQLParser.GEOMETRY_INVALID_REASON, 0); }
		public TerminalNode CONVEX_HULL_AGG() { return getToken(DBEstSQLParser.CONVEX_HULL_AGG, 0); }
		public TerminalNode GEOMETRY_UNION_AGG() { return getToken(DBEstSQLParser.GEOMETRY_UNION_AGG, 0); }
		public TerminalNode BING_TILE() { return getToken(DBEstSQLParser.BING_TILE, 0); }
		public TerminalNode BING_TILE_COORDINATES() { return getToken(DBEstSQLParser.BING_TILE_COORDINATES, 0); }
		public TerminalNode BING_TILE_POLYGON() { return getToken(DBEstSQLParser.BING_TILE_POLYGON, 0); }
		public TerminalNode BING_TILE_QUADKEY() { return getToken(DBEstSQLParser.BING_TILE_QUADKEY, 0); }
		public TerminalNode BING_TILE_ZOOM_LEVEL() { return getToken(DBEstSQLParser.BING_TILE_ZOOM_LEVEL, 0); }
		public TerminalNode APPROX_DISTINCT() { return getToken(DBEstSQLParser.APPROX_DISTINCT, 0); }
		public Cast_as_expressionContext cast_as_expression() {
			return getRuleContext(Cast_as_expressionContext.class,0);
		}
		public TerminalNode CAST() { return getToken(DBEstSQLParser.CAST, 0); }
		public Unary_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitUnary_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_functionContext unary_function() throws RecognitionException {
		Unary_functionContext _localctx = new Unary_functionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_unary_function);
		int _la;
		try {
			setState(1496);
			switch (_input.LA(1)) {
			case APPROX_DISTINCT:
			case ASCII:
			case RAWTOHEX:
			case ABBREV:
			case ABS:
			case ACOS:
			case AGE:
			case AREA:
			case ARRAY_AGG:
			case ARRAY_DIMS:
			case ARRAY_NDIMS:
			case ARRAY_TO_JSON:
			case ARRAY_TO_TSVECTOR:
			case ASIN:
			case ATAN:
			case ATAN2:
			case BIN:
			case BIT_LENGTH:
			case BOOL_AND:
			case BOOL_OR:
			case BOX:
			case BROADCAST:
			case BROUND:
			case CARDINALITY:
			case CBRT:
			case CEIL:
			case CEILING:
			case CENTER:
			case CHAR_LENGTH:
			case CHARACTER_LENGTH:
			case CHR:
			case CIRCLE:
			case COS:
			case COT:
			case CRC32:
			case CURRVAL:
			case DATE:
			case DAY:
			case DAYNAME:
			case DAYOFMONTH:
			case DAYOFWEEK:
			case DAYOFYEAR:
			case DEGREES:
			case DIAMETER:
			case ENUM_FIRST:
			case ENUM_LAST:
			case ENUM_RANGE:
			case EXP:
			case EVERY:
			case FACTORIAL:
			case FAMILY:
			case FLOOR:
			case FNV_HASH:
			case FROM_DAYS:
			case FROM_UNIXTIME:
			case HEIGHT:
			case HEX:
			case HOST:
			case HOSTMASK:
			case HOUR:
			case INITCAP:
			case ISCLOSED:
			case ISEMPTY:
			case ISFINITE:
			case ISNULL:
			case ISOPEN:
			case JSON_AGG:
			case JSON_ARRAY_LENGTH:
			case JSON_ARRAY_ELEMENTS:
			case JSON_ARRAY_ELEMENTS_TEXT:
			case JSON_EACH:
			case JSON_EACH_TEXT:
			case JSON_OBJECT:
			case JSON_OBJECT_KEYS:
			case JSON_OBJECT_AGG:
			case JSON_STRIP_NULLS:
			case JSON_TO_RECORD:
			case JSON_TO_RECORDSET:
			case JSON_TYPEOF:
			case JSONB_AGG:
			case JSONB_OBJECT_AGG:
			case JSONB_PRETTY:
			case JUSTIFY_DAYS:
			case JUSTIFY_HOURS:
			case JUSTIFY_INTERVALS:
			case LAST_DAY:
			case LCASE:
			case LENGTH:
			case LINE:
			case LN:
			case LOG:
			case LOG2:
			case LOG10:
			case LOWER:
			case LOWER_INC:
			case LOWER_INF:
			case LTRIM:
			case LSEG:
			case MACADDR8_SET7BIT:
			case MASKLEN:
			case MD5:
			case MICROSECOND:
			case MINUTE:
			case MONTH:
			case MONTHNAME:
			case NEGATIVE:
			case NETMASK:
			case NETWORK:
			case NEXTVAL:
			case NPOINTS:
			case NUMNODE:
			case OCTET_LENGTH:
			case PATH:
			case PCLOSE:
			case PLAINTO_TSQUERY:
			case PHRASETO_TSQUERY:
			case POINT:
			case POLYGON:
			case POPEN:
			case POSITIVE:
			case QUARTER:
			case QUERYTREE:
			case QUOTE_IDENT:
			case QUOTE_LITERAL:
			case QUOTE_NULLABLE:
			case RADIANS:
			case RADIUS:
			case RAND:
			case REVERSE:
			case ROUND:
			case ROW_TO_JSON:
			case RTRIM:
			case SCALE:
			case SECOND:
			case SEC_TO_TIME:
			case SETSEED:
			case SHA1:
			case SHA2:
			case SIGN:
			case SIN:
			case SPACE_FUNCTION:
			case STDDEV:
			case STRING_AGG:
			case STR_TO_DATE:
			case SQRT:
			case STRIP:
			case TAN:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TIME_TO_SEC:
			case TO_DATE:
			case TO_DAYS:
			case TO_HEX:
			case TO_JSON:
			case TO_JSONB:
			case TO_TIMESTAMP:
			case TO_TSQUERY:
			case TO_TSVECTOR:
			case TRIM:
			case TRUNC:
			case TSVECTOR_TO_ARRAY:
			case UCASE:
			case UNHEX:
			case UPPER:
			case UPPER_INC:
			case UPPER_INF:
			case WEEKOFYEAR:
			case WEEK:
			case WEEKDAY:
			case WIDTH:
			case XMLAGG:
			case XMLCOMMENT:
			case XMLPI:
			case XML_ISWELL_FORMAT:
			case YEAR:
			case YEARWEEK:
			case ST_ASBINARY:
			case ST_ASTEXT:
			case ST_GEOMETRYFROMTEXT:
			case ST_GEOMFROMBINARY:
			case ST_LINEFROMTEXT:
			case ST_LINESTRING:
			case ST_MULTIPOINT:
			case ST_POLYGON:
			case GEOMETRY_UNION:
			case ST_BOUNDARY:
			case ST_ENVELOPE:
			case ST_ENVELOPEASPTS:
			case ST_EXTERIORRING:
			case ST_AREA:
			case ST_CENTROID:
			case ST_CONVEXHULL:
			case ST_DIMENSION:
			case ST_GEOMETRYTYPE:
			case ST_ISCLOSED:
			case ST_ISEMPTY:
			case ST_ISSIMPLE:
			case ST_ISRING:
			case ST_ISVALID:
			case ST_LENGTH:
			case ST_XMAX:
			case ST_YMAX:
			case ST_XMIN:
			case ST_YMIN:
			case ST_STARTPOINT:
			case ST_ENDPOINT:
			case ST_X:
			case ST_Y:
			case ST_INTERIORRINGS:
			case ST_NUMGEOMETRIES:
			case ST_GEOMETRIES:
			case ST_NUMPOINTS:
			case ST_NUMINTERIORRING:
			case GEOMETRY_INVALID_REASON:
			case CONVEX_HULL_AGG:
			case GEOMETRY_UNION_AGG:
			case BING_TILE:
			case BING_TILE_COORDINATES:
			case BING_TILE_POLYGON:
			case BING_TILE_QUADKEY:
			case BING_TILE_ZOOM_LEVEL:
			case SPACE:
			case BINARY:
			case BIT_OR:
			case BIT_AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(1486);
				((Unary_functionContext)_localctx).function_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==APPROX_DISTINCT || _la==ASCII || _la==RAWTOHEX || ((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (ABBREV - 213)) | (1L << (ABS - 213)) | (1L << (ACOS - 213)) | (1L << (AGE - 213)) | (1L << (AREA - 213)) | (1L << (ARRAY_AGG - 213)) | (1L << (ARRAY_DIMS - 213)) | (1L << (ARRAY_NDIMS - 213)) | (1L << (ARRAY_TO_JSON - 213)) | (1L << (ARRAY_TO_TSVECTOR - 213)) | (1L << (ASIN - 213)) | (1L << (ATAN - 213)) | (1L << (ATAN2 - 213)) | (1L << (BIN - 213)) | (1L << (BIT_LENGTH - 213)) | (1L << (BOOL_AND - 213)) | (1L << (BOOL_OR - 213)) | (1L << (BOX - 213)) | (1L << (BROADCAST - 213)) | (1L << (BROUND - 213)) | (1L << (CARDINALITY - 213)) | (1L << (CBRT - 213)) | (1L << (CEIL - 213)) | (1L << (CEILING - 213)) | (1L << (CENTER - 213)) | (1L << (CHAR_LENGTH - 213)) | (1L << (CHARACTER_LENGTH - 213)) | (1L << (CHR - 213)) | (1L << (CIRCLE - 213)))) != 0) || ((((_la - 281)) & ~0x3f) == 0 && ((1L << (_la - 281)) & ((1L << (COS - 281)) | (1L << (COT - 281)) | (1L << (CRC32 - 281)) | (1L << (CURRVAL - 281)) | (1L << (DATE - 281)) | (1L << (DAY - 281)) | (1L << (DAYNAME - 281)) | (1L << (DAYOFMONTH - 281)) | (1L << (DAYOFWEEK - 281)) | (1L << (DAYOFYEAR - 281)) | (1L << (DEGREES - 281)) | (1L << (DIAMETER - 281)) | (1L << (ENUM_FIRST - 281)) | (1L << (ENUM_LAST - 281)) | (1L << (ENUM_RANGE - 281)) | (1L << (EXP - 281)) | (1L << (EVERY - 281)) | (1L << (FACTORIAL - 281)) | (1L << (FAMILY - 281)) | (1L << (FLOOR - 281)))) != 0) || ((((_la - 345)) & ~0x3f) == 0 && ((1L << (_la - 345)) & ((1L << (FNV_HASH - 345)) | (1L << (FROM_DAYS - 345)) | (1L << (FROM_UNIXTIME - 345)) | (1L << (HEIGHT - 345)) | (1L << (HEX - 345)) | (1L << (HOST - 345)) | (1L << (HOSTMASK - 345)) | (1L << (HOUR - 345)) | (1L << (INITCAP - 345)) | (1L << (ISCLOSED - 345)) | (1L << (ISEMPTY - 345)) | (1L << (ISFINITE - 345)) | (1L << (ISNULL - 345)) | (1L << (ISOPEN - 345)) | (1L << (JSON_AGG - 345)) | (1L << (JSON_ARRAY_LENGTH - 345)) | (1L << (JSON_ARRAY_ELEMENTS - 345)) | (1L << (JSON_ARRAY_ELEMENTS_TEXT - 345)) | (1L << (JSON_EACH - 345)) | (1L << (JSON_EACH_TEXT - 345)) | (1L << (JSON_OBJECT - 345)) | (1L << (JSON_OBJECT_KEYS - 345)) | (1L << (JSON_OBJECT_AGG - 345)) | (1L << (JSON_STRIP_NULLS - 345)) | (1L << (JSON_TO_RECORD - 345)) | (1L << (JSON_TO_RECORDSET - 345)) | (1L << (JSON_TYPEOF - 345)) | (1L << (JSONB_AGG - 345)) | (1L << (JSONB_OBJECT_AGG - 345)) | (1L << (JSONB_PRETTY - 345)) | (1L << (JUSTIFY_DAYS - 345)) | (1L << (JUSTIFY_HOURS - 345)))) != 0) || ((((_la - 409)) & ~0x3f) == 0 && ((1L << (_la - 409)) & ((1L << (JUSTIFY_INTERVALS - 409)) | (1L << (LAST_DAY - 409)) | (1L << (LCASE - 409)) | (1L << (LENGTH - 409)) | (1L << (LINE - 409)) | (1L << (LN - 409)) | (1L << (LOG - 409)) | (1L << (LOG2 - 409)) | (1L << (LOG10 - 409)) | (1L << (LOWER - 409)) | (1L << (LOWER_INC - 409)) | (1L << (LOWER_INF - 409)) | (1L << (LTRIM - 409)) | (1L << (LSEG - 409)) | (1L << (MACADDR8_SET7BIT - 409)) | (1L << (MASKLEN - 409)) | (1L << (MD5 - 409)) | (1L << (MICROSECOND - 409)) | (1L << (MINUTE - 409)) | (1L << (MONTH - 409)) | (1L << (MONTHNAME - 409)) | (1L << (NEGATIVE - 409)) | (1L << (NETMASK - 409)) | (1L << (NETWORK - 409)) | (1L << (NEXTVAL - 409)))) != 0) || ((((_la - 474)) & ~0x3f) == 0 && ((1L << (_la - 474)) & ((1L << (NPOINTS - 474)) | (1L << (NUMNODE - 474)) | (1L << (OCTET_LENGTH - 474)) | (1L << (PATH - 474)) | (1L << (PCLOSE - 474)) | (1L << (PLAINTO_TSQUERY - 474)) | (1L << (PHRASETO_TSQUERY - 474)) | (1L << (POINT - 474)) | (1L << (POLYGON - 474)) | (1L << (POPEN - 474)) | (1L << (POSITIVE - 474)) | (1L << (QUARTER - 474)) | (1L << (QUERYTREE - 474)) | (1L << (QUOTE_IDENT - 474)) | (1L << (QUOTE_LITERAL - 474)) | (1L << (QUOTE_NULLABLE - 474)) | (1L << (RADIANS - 474)) | (1L << (RADIUS - 474)) | (1L << (RAND - 474)))) != 0) || ((((_la - 548)) & ~0x3f) == 0 && ((1L << (_la - 548)) & ((1L << (REVERSE - 548)) | (1L << (ROUND - 548)) | (1L << (ROW_TO_JSON - 548)) | (1L << (RTRIM - 548)) | (1L << (SCALE - 548)) | (1L << (SECOND - 548)) | (1L << (SEC_TO_TIME - 548)) | (1L << (SETSEED - 548)) | (1L << (SHA1 - 548)) | (1L << (SHA2 - 548)) | (1L << (SIGN - 548)) | (1L << (SIN - 548)) | (1L << (SPACE_FUNCTION - 548)) | (1L << (STDDEV - 548)) | (1L << (STRING_AGG - 548)) | (1L << (STR_TO_DATE - 548)) | (1L << (SQRT - 548)) | (1L << (STRIP - 548)) | (1L << (TAN - 548)) | (1L << (TEXT - 548)))) != 0) || ((((_la - 614)) & ~0x3f) == 0 && ((1L << (_la - 614)) & ((1L << (TIME - 614)) | (1L << (TIMESTAMP - 614)) | (1L << (TIME_TO_SEC - 614)) | (1L << (TO_DATE - 614)) | (1L << (TO_DAYS - 614)) | (1L << (TO_HEX - 614)) | (1L << (TO_JSON - 614)) | (1L << (TO_JSONB - 614)) | (1L << (TO_TIMESTAMP - 614)) | (1L << (TO_TSQUERY - 614)) | (1L << (TO_TSVECTOR - 614)) | (1L << (TRIM - 614)) | (1L << (TRUNC - 614)) | (1L << (TSVECTOR_TO_ARRAY - 614)) | (1L << (UCASE - 614)) | (1L << (UNHEX - 614)) | (1L << (UPPER - 614)) | (1L << (UPPER_INC - 614)) | (1L << (UPPER_INF - 614)) | (1L << (WEEKOFYEAR - 614)) | (1L << (WEEK - 614)) | (1L << (WEEKDAY - 614)) | (1L << (WIDTH - 614)))) != 0) || ((((_la - 678)) & ~0x3f) == 0 && ((1L << (_la - 678)) & ((1L << (XMLAGG - 678)) | (1L << (XMLCOMMENT - 678)) | (1L << (XMLPI - 678)) | (1L << (XML_ISWELL_FORMAT - 678)) | (1L << (YEAR - 678)) | (1L << (YEARWEEK - 678)) | (1L << (ST_ASBINARY - 678)) | (1L << (ST_ASTEXT - 678)) | (1L << (ST_GEOMETRYFROMTEXT - 678)) | (1L << (ST_GEOMFROMBINARY - 678)) | (1L << (ST_LINEFROMTEXT - 678)) | (1L << (ST_LINESTRING - 678)) | (1L << (ST_MULTIPOINT - 678)) | (1L << (ST_POLYGON - 678)) | (1L << (GEOMETRY_UNION - 678)) | (1L << (ST_BOUNDARY - 678)) | (1L << (ST_ENVELOPE - 678)) | (1L << (ST_ENVELOPEASPTS - 678)) | (1L << (ST_EXTERIORRING - 678)) | (1L << (ST_AREA - 678)) | (1L << (ST_CENTROID - 678)) | (1L << (ST_CONVEXHULL - 678)) | (1L << (ST_DIMENSION - 678)) | (1L << (ST_GEOMETRYTYPE - 678)) | (1L << (ST_ISCLOSED - 678)) | (1L << (ST_ISEMPTY - 678)) | (1L << (ST_ISSIMPLE - 678)) | (1L << (ST_ISRING - 678)) | (1L << (ST_ISVALID - 678)) | (1L << (ST_LENGTH - 678)) | (1L << (ST_XMAX - 678)) | (1L << (ST_YMAX - 678)) | (1L << (ST_XMIN - 678)) | (1L << (ST_YMIN - 678)) | (1L << (ST_STARTPOINT - 678)))) != 0) || ((((_la - 742)) & ~0x3f) == 0 && ((1L << (_la - 742)) & ((1L << (ST_ENDPOINT - 742)) | (1L << (ST_X - 742)) | (1L << (ST_Y - 742)) | (1L << (ST_INTERIORRINGS - 742)) | (1L << (ST_NUMGEOMETRIES - 742)) | (1L << (ST_GEOMETRIES - 742)) | (1L << (ST_NUMPOINTS - 742)) | (1L << (ST_NUMINTERIORRING - 742)) | (1L << (GEOMETRY_INVALID_REASON - 742)) | (1L << (CONVEX_HULL_AGG - 742)) | (1L << (GEOMETRY_UNION_AGG - 742)) | (1L << (BING_TILE - 742)) | (1L << (BING_TILE_COORDINATES - 742)) | (1L << (BING_TILE_POLYGON - 742)) | (1L << (BING_TILE_QUADKEY - 742)) | (1L << (BING_TILE_ZOOM_LEVEL - 742)) | (1L << (SPACE - 742)) | (1L << (BINARY - 742)) | (1L << (BIT_OR - 742)))) != 0) || _la==BIT_AND) ) {
					((Unary_functionContext)_localctx).function_name = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1487);
				match(LR_BRACKET);
				setState(1488);
				expression(0);
				setState(1489);
				match(RR_BRACKET);
				}
				break;
			case CAST:
				enterOuterAlt(_localctx, 2);
				{
				setState(1491);
				((Unary_functionContext)_localctx).function_name = match(CAST);
				setState(1492);
				match(LR_BRACKET);
				setState(1493);
				cast_as_expression();
				setState(1494);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Timestamp_functionContext extends ParserRuleContext {
		public Token function_name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TIMESTAMP() { return getToken(DBEstSQLParser.TIMESTAMP, 0); }
		public Timestamp_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitTimestamp_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timestamp_functionContext timestamp_function() throws RecognitionException {
		Timestamp_functionContext _localctx = new Timestamp_functionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_timestamp_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
			((Timestamp_functionContext)_localctx).function_name = match(TIMESTAMP);
			setState(1499);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dateadd_functionContext extends ParserRuleContext {
		public Token function_name;
		public Time_unitContext time_unit() {
			return getRuleContext(Time_unitContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DATEADD() { return getToken(DBEstSQLParser.DATEADD, 0); }
		public Dateadd_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateadd_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitDateadd_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dateadd_functionContext dateadd_function() throws RecognitionException {
		Dateadd_functionContext _localctx = new Dateadd_functionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_dateadd_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1501);
			((Dateadd_functionContext)_localctx).function_name = match(DATEADD);
			setState(1502);
			match(LR_BRACKET);
			setState(1503);
			time_unit();
			setState(1504);
			match(COMMA);
			setState(1505);
			expression(0);
			setState(1506);
			match(COMMA);
			setState(1507);
			expression(0);
			setState(1508);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_predicate_functionContext extends ParserRuleContext {
		public Token function_name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ISNULL() { return getToken(DBEstSQLParser.ISNULL, 0); }
		public TerminalNode ST_ISCLOSED() { return getToken(DBEstSQLParser.ST_ISCLOSED, 0); }
		public TerminalNode ST_ISEMPTY() { return getToken(DBEstSQLParser.ST_ISEMPTY, 0); }
		public TerminalNode ST_ISRING() { return getToken(DBEstSQLParser.ST_ISRING, 0); }
		public TerminalNode ST_ISVALID() { return getToken(DBEstSQLParser.ST_ISVALID, 0); }
		public TerminalNode NOT() { return getToken(DBEstSQLParser.NOT, 0); }
		public Unary_predicate_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_predicate_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitUnary_predicate_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_predicate_functionContext unary_predicate_function() throws RecognitionException {
		Unary_predicate_functionContext _localctx = new Unary_predicate_functionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_unary_predicate_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1511);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1510);
				match(NOT);
				}
			}

			setState(1513);
			((Unary_predicate_functionContext)_localctx).function_name = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ISNULL || ((((_la - 729)) & ~0x3f) == 0 && ((1L << (_la - 729)) & ((1L << (ST_ISCLOSED - 729)) | (1L << (ST_ISEMPTY - 729)) | (1L << (ST_ISRING - 729)) | (1L << (ST_ISVALID - 729)))) != 0)) ) {
				((Unary_predicate_functionContext)_localctx).function_name = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1514);
			match(LR_BRACKET);
			setState(1515);
			expression(0);
			setState(1516);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_predicate_functionContext extends ParserRuleContext {
		public Token function_name;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ST_CONTAINS() { return getToken(DBEstSQLParser.ST_CONTAINS, 0); }
		public TerminalNode ST_CROSSES() { return getToken(DBEstSQLParser.ST_CROSSES, 0); }
		public TerminalNode ST_DISJOINT() { return getToken(DBEstSQLParser.ST_DISJOINT, 0); }
		public TerminalNode ST_EQUALS() { return getToken(DBEstSQLParser.ST_EQUALS, 0); }
		public TerminalNode ST_INTERSECTS() { return getToken(DBEstSQLParser.ST_INTERSECTS, 0); }
		public TerminalNode ST_OVERLAPS() { return getToken(DBEstSQLParser.ST_OVERLAPS, 0); }
		public TerminalNode ST_RELATE() { return getToken(DBEstSQLParser.ST_RELATE, 0); }
		public TerminalNode ST_TOUCHES() { return getToken(DBEstSQLParser.ST_TOUCHES, 0); }
		public TerminalNode ST_WITHIN() { return getToken(DBEstSQLParser.ST_WITHIN, 0); }
		public TerminalNode NOT() { return getToken(DBEstSQLParser.NOT, 0); }
		public Binary_predicate_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_predicate_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitBinary_predicate_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_predicate_functionContext binary_predicate_function() throws RecognitionException {
		Binary_predicate_functionContext _localctx = new Binary_predicate_functionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_binary_predicate_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1519);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1518);
				match(NOT);
				}
			}

			setState(1521);
			((Binary_predicate_functionContext)_localctx).function_name = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 701)) & ~0x3f) == 0 && ((1L << (_la - 701)) & ((1L << (ST_CONTAINS - 701)) | (1L << (ST_CROSSES - 701)) | (1L << (ST_DISJOINT - 701)) | (1L << (ST_EQUALS - 701)) | (1L << (ST_INTERSECTS - 701)) | (1L << (ST_OVERLAPS - 701)) | (1L << (ST_RELATE - 701)) | (1L << (ST_TOUCHES - 701)) | (1L << (ST_WITHIN - 701)))) != 0)) ) {
				((Binary_predicate_functionContext)_localctx).function_name = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1522);
			match(LR_BRACKET);
			setState(1523);
			expression(0);
			setState(1524);
			match(COMMA);
			setState(1525);
			expression(0);
			setState(1526);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Noparam_functionContext extends ParserRuleContext {
		public Token function_name;
		public TerminalNode UNIX_TIMESTAMP() { return getToken(DBEstSQLParser.UNIX_TIMESTAMP, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(DBEstSQLParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(DBEstSQLParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(DBEstSQLParser.CURRENT_TIME, 0); }
		public TerminalNode RANDOM() { return getToken(DBEstSQLParser.RANDOM, 0); }
		public TerminalNode RAND() { return getToken(DBEstSQLParser.RAND, 0); }
		public TerminalNode NATURAL_CONSTANT() { return getToken(DBEstSQLParser.NATURAL_CONSTANT, 0); }
		public TerminalNode PI() { return getToken(DBEstSQLParser.PI, 0); }
		public TerminalNode CURDATE() { return getToken(DBEstSQLParser.CURDATE, 0); }
		public TerminalNode CURTIME() { return getToken(DBEstSQLParser.CURTIME, 0); }
		public TerminalNode LOCALTIME() { return getToken(DBEstSQLParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(DBEstSQLParser.LOCALTIMESTAMP, 0); }
		public TerminalNode NOW() { return getToken(DBEstSQLParser.NOW, 0); }
		public TerminalNode SYSDATE() { return getToken(DBEstSQLParser.SYSDATE, 0); }
		public TerminalNode CURRENT_USER() { return getToken(DBEstSQLParser.CURRENT_USER, 0); }
		public TerminalNode DATABASE() { return getToken(DBEstSQLParser.DATABASE, 0); }
		public TerminalNode LAST_INSERT_ID() { return getToken(DBEstSQLParser.LAST_INSERT_ID, 0); }
		public TerminalNode SESSION_USER() { return getToken(DBEstSQLParser.SESSION_USER, 0); }
		public TerminalNode SYSTEM_USER() { return getToken(DBEstSQLParser.SYSTEM_USER, 0); }
		public TerminalNode USER() { return getToken(DBEstSQLParser.USER, 0); }
		public TerminalNode VERSION() { return getToken(DBEstSQLParser.VERSION, 0); }
		public TerminalNode PG_CLIENT_ENCODING() { return getToken(DBEstSQLParser.PG_CLIENT_ENCODING, 0); }
		public TerminalNode CLOCK_TIMESTAMP() { return getToken(DBEstSQLParser.CLOCK_TIMESTAMP, 0); }
		public TerminalNode STATEMENT_TIMESTAMP() { return getToken(DBEstSQLParser.STATEMENT_TIMESTAMP, 0); }
		public TerminalNode TIMEOFDAY() { return getToken(DBEstSQLParser.TIMEOFDAY, 0); }
		public TerminalNode TRANSACTION_TIMESTAMP() { return getToken(DBEstSQLParser.TRANSACTION_TIMESTAMP, 0); }
		public TerminalNode GET_CURRENT_TS_CONFIG() { return getToken(DBEstSQLParser.GET_CURRENT_TS_CONFIG, 0); }
		public TerminalNode TSVECTOR_UPDATE_TRIGGER() { return getToken(DBEstSQLParser.TSVECTOR_UPDATE_TRIGGER, 0); }
		public TerminalNode TSVECTOR_UPDATE_TRIGGER_COLUMN() { return getToken(DBEstSQLParser.TSVECTOR_UPDATE_TRIGGER_COLUMN, 0); }
		public TerminalNode LASTVAL() { return getToken(DBEstSQLParser.LASTVAL, 0); }
		public Noparam_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noparam_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitNoparam_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Noparam_functionContext noparam_function() throws RecognitionException {
		Noparam_functionContext _localctx = new Noparam_functionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_noparam_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1528);
			((Noparam_functionContext)_localctx).function_name = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATABASE))) != 0) || ((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (SESSION_USER - 171)) | (1L << (SYSTEM_USER - 171)) | (1L << (USER - 171)))) != 0) || ((((_la - 273)) & ~0x3f) == 0 && ((1L << (_la - 273)) & ((1L << (CLOCK_TIMESTAMP - 273)) | (1L << (CURDATE - 273)) | (1L << (CURTIME - 273)) | (1L << (NATURAL_CONSTANT - 273)))) != 0) || ((((_la - 353)) & ~0x3f) == 0 && ((1L << (_la - 353)) & ((1L << (GET_CURRENT_TS_CONFIG - 353)) | (1L << (LASTVAL - 353)) | (1L << (LAST_INSERT_ID - 353)))) != 0) || ((((_la - 424)) & ~0x3f) == 0 && ((1L << (_la - 424)) & ((1L << (LOCALTIME - 424)) | (1L << (LOCALTIMESTAMP - 424)) | (1L << (NOW - 424)))) != 0) || ((((_la - 497)) & ~0x3f) == 0 && ((1L << (_la - 497)) & ((1L << (PG_CLIENT_ENCODING - 497)) | (1L << (PI - 497)) | (1L << (RAND - 497)) | (1L << (RANDOM - 497)))) != 0) || ((((_la - 589)) & ~0x3f) == 0 && ((1L << (_la - 589)) & ((1L << (STATEMENT_TIMESTAMP - 589)) | (1L << (SYSDATE - 589)) | (1L << (TIMEOFDAY - 589)) | (1L << (TRANSACTION_TIMESTAMP - 589)) | (1L << (TSVECTOR_UPDATE_TRIGGER - 589)) | (1L << (TSVECTOR_UPDATE_TRIGGER_COLUMN - 589)))) != 0) || _la==UNIX_TIMESTAMP || _la==VERSION) ) {
				((Noparam_functionContext)_localctx).function_name = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1529);
			match(LR_BRACKET);
			setState(1530);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lateral_view_functionContext extends ParserRuleContext {
		public Token function_name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EXPLODE() { return getToken(DBEstSQLParser.EXPLODE, 0); }
		public Lateral_view_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateral_view_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitLateral_view_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lateral_view_functionContext lateral_view_function() throws RecognitionException {
		Lateral_view_functionContext _localctx = new Lateral_view_functionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_lateral_view_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
			((Lateral_view_functionContext)_localctx).function_name = match(EXPLODE);
			setState(1533);
			match(LR_BRACKET);
			setState(1534);
			expression(0);
			setState(1535);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggregate_windowed_functionContext extends ParserRuleContext {
		public TerminalNode AVG() { return getToken(DBEstSQLParser.AVG, 0); }
		public All_distinct_expressionContext all_distinct_expression() {
			return getRuleContext(All_distinct_expressionContext.class,0);
		}
		public Over_clauseContext over_clause() {
			return getRuleContext(Over_clauseContext.class,0);
		}
		public TerminalNode CHECKSUM_AGG() { return getToken(DBEstSQLParser.CHECKSUM_AGG, 0); }
		public TerminalNode GROUPING() { return getToken(DBEstSQLParser.GROUPING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode GROUPING_ID() { return getToken(DBEstSQLParser.GROUPING_ID, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode MAX() { return getToken(DBEstSQLParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(DBEstSQLParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(DBEstSQLParser.SUM, 0); }
		public TerminalNode STDEV() { return getToken(DBEstSQLParser.STDEV, 0); }
		public TerminalNode STDEVP() { return getToken(DBEstSQLParser.STDEVP, 0); }
		public TerminalNode STDDEV_SAMP() { return getToken(DBEstSQLParser.STDDEV_SAMP, 0); }
		public TerminalNode VAR() { return getToken(DBEstSQLParser.VAR, 0); }
		public TerminalNode VARP() { return getToken(DBEstSQLParser.VARP, 0); }
		public TerminalNode COUNT() { return getToken(DBEstSQLParser.COUNT, 0); }
		public TerminalNode NDV() { return getToken(DBEstSQLParser.NDV, 0); }
		public TerminalNode COUNT_BIG() { return getToken(DBEstSQLParser.COUNT_BIG, 0); }
		public Aggregate_windowed_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_windowed_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitAggregate_windowed_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_windowed_functionContext aggregate_windowed_function() throws RecognitionException {
		Aggregate_windowed_functionContext _localctx = new Aggregate_windowed_functionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_aggregate_windowed_function);
		try {
			setState(1642);
			switch (_input.LA(1)) {
			case AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(1537);
				match(AVG);
				setState(1538);
				match(LR_BRACKET);
				setState(1539);
				all_distinct_expression();
				setState(1540);
				match(RR_BRACKET);
				setState(1542);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1541);
					over_clause();
					}
					break;
				}
				}
				break;
			case CHECKSUM_AGG:
				enterOuterAlt(_localctx, 2);
				{
				setState(1544);
				match(CHECKSUM_AGG);
				setState(1545);
				match(LR_BRACKET);
				setState(1546);
				all_distinct_expression();
				setState(1547);
				match(RR_BRACKET);
				}
				break;
			case GROUPING:
				enterOuterAlt(_localctx, 3);
				{
				setState(1549);
				match(GROUPING);
				setState(1550);
				match(LR_BRACKET);
				setState(1551);
				expression(0);
				setState(1552);
				match(RR_BRACKET);
				}
				break;
			case GROUPING_ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(1554);
				match(GROUPING_ID);
				setState(1555);
				match(LR_BRACKET);
				setState(1556);
				expression_list();
				setState(1557);
				match(RR_BRACKET);
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 5);
				{
				setState(1559);
				match(MAX);
				setState(1560);
				match(LR_BRACKET);
				setState(1561);
				all_distinct_expression();
				setState(1562);
				match(RR_BRACKET);
				setState(1564);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1563);
					over_clause();
					}
					break;
				}
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 6);
				{
				setState(1566);
				match(MIN);
				setState(1567);
				match(LR_BRACKET);
				setState(1568);
				all_distinct_expression();
				setState(1569);
				match(RR_BRACKET);
				setState(1571);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1570);
					over_clause();
					}
					break;
				}
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 7);
				{
				setState(1573);
				match(SUM);
				setState(1574);
				match(LR_BRACKET);
				setState(1575);
				all_distinct_expression();
				setState(1576);
				match(RR_BRACKET);
				setState(1578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1577);
					over_clause();
					}
					break;
				}
				}
				break;
			case STDEV:
				enterOuterAlt(_localctx, 8);
				{
				setState(1580);
				match(STDEV);
				setState(1581);
				match(LR_BRACKET);
				setState(1582);
				all_distinct_expression();
				setState(1583);
				match(RR_BRACKET);
				setState(1585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1584);
					over_clause();
					}
					break;
				}
				}
				break;
			case STDEVP:
				enterOuterAlt(_localctx, 9);
				{
				setState(1587);
				match(STDEVP);
				setState(1588);
				match(LR_BRACKET);
				setState(1589);
				all_distinct_expression();
				setState(1590);
				match(RR_BRACKET);
				setState(1592);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1591);
					over_clause();
					}
					break;
				}
				}
				break;
			case STDDEV_SAMP:
				enterOuterAlt(_localctx, 10);
				{
				setState(1594);
				match(STDDEV_SAMP);
				setState(1595);
				match(LR_BRACKET);
				setState(1596);
				all_distinct_expression();
				setState(1597);
				match(RR_BRACKET);
				setState(1599);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1598);
					over_clause();
					}
					break;
				}
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 11);
				{
				setState(1601);
				match(VAR);
				setState(1602);
				match(LR_BRACKET);
				setState(1603);
				all_distinct_expression();
				setState(1604);
				match(RR_BRACKET);
				setState(1606);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1605);
					over_clause();
					}
					break;
				}
				}
				break;
			case VARP:
				enterOuterAlt(_localctx, 12);
				{
				setState(1608);
				match(VARP);
				setState(1609);
				match(LR_BRACKET);
				setState(1610);
				all_distinct_expression();
				setState(1611);
				match(RR_BRACKET);
				setState(1613);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1612);
					over_clause();
					}
					break;
				}
				}
				break;
			case COUNT:
				enterOuterAlt(_localctx, 13);
				{
				setState(1615);
				match(COUNT);
				setState(1616);
				match(LR_BRACKET);
				setState(1619);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(1617);
					match(STAR);
					}
					break;
				case ALL:
				case APPROX_DISTINCT:
				case ASCII:
				case CASE:
				case COALESCE:
				case CONV:
				case CONVERT:
				case CURRENT_DATE:
				case CURRENT_TIME:
				case CURRENT_TIMESTAMP:
				case CURRENT_USER:
				case DATABASE:
				case DISTINCT:
				case FALSE:
				case HASH:
				case IF:
				case INT4LARGER:
				case LEFT:
				case MID:
				case NOT:
				case NULL:
				case NULLIF:
				case RAWTOHEX:
				case RIGHT:
				case RPAD:
				case SESSION_USER:
				case SUBSTR:
				case SUBSTRING:
				case SYSTEM_USER:
				case TRUE:
				case TRUNCATE:
				case USER:
				case ABBREV:
				case ABS:
				case ACOS:
				case ADDDATE:
				case ADDTIME:
				case AES_DECRYPT:
				case AES_ENCRYPT:
				case AGE:
				case AREA:
				case ARRAY_AGG:
				case ARRAY_APPEND:
				case ARRAY_CAT:
				case ARRAY_DIMS:
				case ARRAY_LENGTH:
				case ARRAY_LOWER:
				case ARRAY_NDIMS:
				case ARRAY_POSITION:
				case ARRAY_POSITIONS:
				case ARRAY_PREPEND:
				case ARRAY_REMOVE:
				case ARRAY_REPLACE:
				case ARRAY_TO_JSON:
				case ARRAY_TO_STRING:
				case ARRAY_TO_TSVECTOR:
				case ARRAY_UPPER:
				case ASIN:
				case ATAN:
				case ATAN2:
				case AVG:
				case BIN:
				case BIT_LENGTH:
				case BOOL_AND:
				case BOOL_OR:
				case BOX:
				case BOUND_BOX:
				case BROADCAST:
				case BTRIM:
				case BROUND:
				case CARDINALITY:
				case CAST:
				case CBRT:
				case CEIL:
				case CEILING:
				case CENTER:
				case CHAR_LENGTH:
				case CHARACTER_LENGTH:
				case CHECKSUM_AGG:
				case CHR:
				case CIRCLE:
				case CLOCK_TIMESTAMP:
				case CONCAT:
				case CONCAT_WS:
				case CONVERT_FROM:
				case CONVERT_TO:
				case COS:
				case CORR:
				case COVAR_POP:
				case COVAR_SAMP:
				case COT:
				case COUNT:
				case COUNT_BIG:
				case CRC32:
				case CURDATE:
				case CURRVAL:
				case CURTIME:
				case DATE:
				case DATEADD:
				case DATE_ADD:
				case DATE_FORMAT:
				case DATE_PART:
				case DATE_SUB:
				case DATE_TRUNC:
				case DATEDIFF:
				case DAY:
				case DAYNAME:
				case DAYOFMONTH:
				case DAYOFWEEK:
				case DAYOFYEAR:
				case DECODE:
				case DEGREES:
				case DENSE_RANK:
				case DIAMETER:
				case DIV:
				case NATURAL_CONSTANT:
				case ENCODE:
				case ENUM_FIRST:
				case ENUM_LAST:
				case ENUM_RANGE:
				case EXP:
				case EXTRACT:
				case EVERY:
				case FACTORIAL:
				case FAMILY:
				case FIELD:
				case FIND_IN_SET:
				case FLOOR:
				case FORMAT:
				case FORMAT_NUMBER:
				case FNV_HASH:
				case FROM_DAYS:
				case FROM_UNIXTIME:
				case GET_BIT:
				case GET_BYTE:
				case GET_CURRENT_TS_CONFIG:
				case GET_JSON_OBJECT:
				case GREATEST:
				case GROUPING:
				case GROUPING_ID:
				case HEIGHT:
				case HEX:
				case HOST:
				case HOSTMASK:
				case HOUR:
				case IFNULL:
				case INITCAP:
				case INSTR:
				case INTERVAL:
				case IN_FILE:
				case INET_SAME_FAMILY:
				case INET_MERGE:
				case ISCLOSED:
				case ISEMPTY:
				case ISFINITE:
				case ISNULL:
				case ISOPEN:
				case JSON_AGG:
				case JSON_ARRAY_LENGTH:
				case JSON_ARRAY_ELEMENTS:
				case JSON_ARRAY_ELEMENTS_TEXT:
				case JSON_BUILD_ARRAY:
				case JSON_BUILD_OBJECT:
				case JSON_EACH:
				case JSON_EACH_TEXT:
				case JSON_EXTRACT_PATH:
				case JSON_EXTRACT_PATH_TEXT:
				case JSON_OBJECT:
				case JSON_OBJECT_KEYS:
				case JSON_OBJECT_AGG:
				case JSON_POPULATE_RECORD:
				case JSON_POPULATE_RECORDSET:
				case JSON_STRIP_NULLS:
				case JSON_TO_RECORD:
				case JSON_TO_RECORDSET:
				case JSON_TYPEOF:
				case JSONB_AGG:
				case JSONB_OBJECT_AGG:
				case JSONB_SET:
				case JSONB_INSERT:
				case JSONB_PRETTY:
				case JUSTIFY_DAYS:
				case JUSTIFY_HOURS:
				case JUSTIFY_INTERVALS:
				case LASTVAL:
				case LAST_DAY:
				case LAST_INSERT_ID:
				case LCASE:
				case LEAST:
				case LENGTH:
				case LINE:
				case LN:
				case LOCALTIME:
				case LOCALTIMESTAMP:
				case LOCATE:
				case LOG:
				case LOG2:
				case LOG10:
				case LOWER:
				case LOWER_INC:
				case LOWER_INF:
				case LPAD:
				case LTRIM:
				case LSEG:
				case MACADDR8_SET7BIT:
				case MAKEDATE:
				case MAKETIME:
				case MAKE_DATE:
				case MAKE_TIME:
				case MAKE_TIMESTAMP:
				case MAKE_TIMESTAMPTZ:
				case MASKLEN:
				case MAX:
				case MD5:
				case MICROSECOND:
				case MIN:
				case MINUTE:
				case MOD:
				case MONTH:
				case MONTHNAME:
				case NEGATIVE:
				case NETMASK:
				case NETWORK:
				case NDV:
				case NEXTVAL:
				case NOW:
				case NPOINTS:
				case NTILE:
				case NUMNODE:
				case NVL:
				case OCTET_LENGTH:
				case OVERLAY:
				case PATH:
				case PCLOSE:
				case PERCENTILE:
				case PERIOD_ADD:
				case PERIOD_DIFF:
				case PG_CLIENT_ENCODING:
				case PLAINTO_TSQUERY:
				case PHRASETO_TSQUERY:
				case PI:
				case PMOD:
				case POINT:
				case POLYGON:
				case POPEN:
				case POSITION:
				case POSITIVE:
				case POW:
				case POWER:
				case QUARTER:
				case QUERYTREE:
				case QUOTE_IDENT:
				case QUOTE_LITERAL:
				case QUOTE_NULLABLE:
				case RADIANS:
				case RADIUS:
				case RAND:
				case RANDOM:
				case RANGE_MERGE:
				case RANK:
				case REGR_AVGX:
				case REGR_AVGY:
				case REGR_COUNT:
				case REGR_INTERCEPT:
				case REGR_R2:
				case REGR_SLOPE:
				case REGR_SXX:
				case REGR_SXY:
				case REGR_SYY:
				case REGEXP_MATCHES:
				case REGEXP_REPLACE:
				case REGEXP_SPLIT_TO_ARRAY:
				case REGEXP_SPLIT_TO_TABLE:
				case REPEAT:
				case REPLACE:
				case REVERSE:
				case ROUND:
				case ROW_TO_JSON:
				case ROW_NUMBER:
				case RTRIM:
				case SCALE:
				case SECOND:
				case SEC_TO_TIME:
				case SETSEED:
				case SETWEIGHT:
				case SETVAL:
				case SET_BIT:
				case SET_BYTE:
				case SET_MASKLEN:
				case SHA1:
				case SHA2:
				case SHIFTLEFT:
				case SHIFTRIGHT:
				case SHIFTRIGHTUNSIGNED:
				case SIGN:
				case SIN:
				case SPACE_FUNCTION:
				case SPLIT:
				case SPLIT_PART:
				case STATEMENT_TIMESTAMP:
				case STDEV:
				case STDDEV:
				case STDEVP:
				case STDDEV_SAMP:
				case STRCMP:
				case STRING_AGG:
				case STRING_TO_ARRAY:
				case STRPOS:
				case STR_TO_DATE:
				case SUBDATE:
				case SUBSTRING_INDEX:
				case SUM:
				case SQRT:
				case STDDEV_POP:
				case STRIP:
				case STRTOL:
				case SYSDATE:
				case TAN:
				case TEXT:
				case TIME:
				case TIMEDIFF:
				case TIMEOFDAY:
				case TIMESTAMP:
				case TIME_FORMAT:
				case TIME_TO_SEC:
				case TO_ASCII:
				case TO_CHAR:
				case TO_DATE:
				case TO_DAYS:
				case TO_HEX:
				case TO_JSON:
				case TO_JSONB:
				case TO_NUMBER:
				case TO_TIMESTAMP:
				case TO_TSQUERY:
				case TO_TSVECTOR:
				case TRANSACTION_TIMESTAMP:
				case TRANSLATE:
				case TRIM:
				case TRUNC:
				case TS_DELETE:
				case TS_FILTER:
				case TS_HEADLINE:
				case TS_RANK:
				case TS_RANK_CD:
				case TS_REWRITE:
				case TSQUERY_PHRASE:
				case TSVECTOR_TO_ARRAY:
				case TSVECTOR_UPDATE_TRIGGER:
				case TSVECTOR_UPDATE_TRIGGER_COLUMN:
				case UCASE:
				case UNHEX:
				case UNIX_TIMESTAMP:
				case UNNEST:
				case UPPER:
				case UPPER_INC:
				case UPPER_INF:
				case VAR:
				case VARIANCE:
				case VAR_POP:
				case VAR_SAMP:
				case VARP:
				case VERSION:
				case WEEKOFYEAR:
				case WEEK:
				case WEEKDAY:
				case WIDTH:
				case WIDTH_BUCKET:
				case XMLAGG:
				case XMLCOMMENT:
				case XMLCONCAT:
				case XMLELEMENT:
				case XMLFOREST:
				case XMLPI:
				case XMLROOT:
				case XML_ISWELL_FORMAT:
				case XPATH:
				case XPATH_EXISTS:
				case YEAR:
				case YEARWEEK:
				case ST_ASBINARY:
				case ST_ASTEXT:
				case ST_GEOMETRYFROMTEXT:
				case ST_GEOMFROMBINARY:
				case ST_LINEFROMTEXT:
				case ST_LINESTRING:
				case ST_MULTIPOINT:
				case ST_POINT:
				case ST_POLYGON:
				case ST_CONTAINS:
				case ST_CROSSES:
				case ST_DISJOINT:
				case ST_EQUALS:
				case ST_INTERSECTS:
				case ST_OVERLAPS:
				case ST_RELATE:
				case ST_TOUCHES:
				case ST_WITHIN:
				case GEOMETRY_UNION:
				case ST_BOUNDARY:
				case ST_BUFFER:
				case ST_DIFFERENCE:
				case ST_ENVELOPE:
				case ST_ENVELOPEASPTS:
				case ST_EXTERIORRING:
				case ST_INTERSECTION:
				case ST_SYMDIFFERENCE:
				case ST_UNION:
				case ST_AREA:
				case ST_CENTROID:
				case ST_CONVEXHULL:
				case ST_DIMENSION:
				case ST_DISTANCE:
				case ST_GEOMETRYN:
				case ST_INTERIORRINGN:
				case ST_GEOMETRYTYPE:
				case ST_ISCLOSED:
				case ST_ISEMPTY:
				case ST_ISSIMPLE:
				case ST_ISRING:
				case ST_ISVALID:
				case ST_LENGTH:
				case ST_POINTN:
				case ST_XMAX:
				case ST_YMAX:
				case ST_XMIN:
				case ST_YMIN:
				case ST_STARTPOINT:
				case SIMPLIFY_GEOMETRY:
				case ST_ENDPOINT:
				case ST_X:
				case ST_Y:
				case ST_INTERIORRINGS:
				case ST_NUMGEOMETRIES:
				case ST_GEOMETRIES:
				case ST_NUMPOINTS:
				case ST_NUMINTERIORRING:
				case LINE_LOCATE_POINT:
				case GEOMETRY_INVALID_REASON:
				case GREAT_CIRCLE_DISTANCE:
				case CONVEX_HULL_AGG:
				case GEOMETRY_UNION_AGG:
				case BING_TILE:
				case BING_TILE_AT:
				case BING_TILES_AROUND:
				case BING_TILE_COORDINATES:
				case BING_TILE_POLYGON:
				case BING_TILE_QUADKEY:
				case BING_TILE_ZOOM_LEVEL:
				case GEOMETRY_TO_BING_TILES:
				case SPACE:
				case DOUBLE_QUOTE_ID:
				case BACKTICK_ID:
				case SQUARE_BRACKET_ID:
				case LOCAL_ID:
				case DECIMAL:
				case ID:
				case STRING:
				case BINARY:
				case FLOAT:
				case REAL:
				case DOLLAR:
				case LR_BRACKET:
				case PLUS:
				case MINUS:
				case BIT_NOT:
				case BIT_OR:
				case BIT_AND:
					{
					setState(1618);
					all_distinct_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1621);
				match(RR_BRACKET);
				setState(1623);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1622);
					over_clause();
					}
					break;
				}
				}
				break;
			case NDV:
				enterOuterAlt(_localctx, 14);
				{
				setState(1625);
				match(NDV);
				setState(1626);
				match(LR_BRACKET);
				setState(1627);
				all_distinct_expression();
				setState(1628);
				match(RR_BRACKET);
				setState(1630);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1629);
					over_clause();
					}
					break;
				}
				}
				break;
			case COUNT_BIG:
				enterOuterAlt(_localctx, 15);
				{
				setState(1632);
				match(COUNT_BIG);
				setState(1633);
				match(LR_BRACKET);
				setState(1636);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(1634);
					match(STAR);
					}
					break;
				case ALL:
				case APPROX_DISTINCT:
				case ASCII:
				case CASE:
				case COALESCE:
				case CONV:
				case CONVERT:
				case CURRENT_DATE:
				case CURRENT_TIME:
				case CURRENT_TIMESTAMP:
				case CURRENT_USER:
				case DATABASE:
				case DISTINCT:
				case FALSE:
				case HASH:
				case IF:
				case INT4LARGER:
				case LEFT:
				case MID:
				case NOT:
				case NULL:
				case NULLIF:
				case RAWTOHEX:
				case RIGHT:
				case RPAD:
				case SESSION_USER:
				case SUBSTR:
				case SUBSTRING:
				case SYSTEM_USER:
				case TRUE:
				case TRUNCATE:
				case USER:
				case ABBREV:
				case ABS:
				case ACOS:
				case ADDDATE:
				case ADDTIME:
				case AES_DECRYPT:
				case AES_ENCRYPT:
				case AGE:
				case AREA:
				case ARRAY_AGG:
				case ARRAY_APPEND:
				case ARRAY_CAT:
				case ARRAY_DIMS:
				case ARRAY_LENGTH:
				case ARRAY_LOWER:
				case ARRAY_NDIMS:
				case ARRAY_POSITION:
				case ARRAY_POSITIONS:
				case ARRAY_PREPEND:
				case ARRAY_REMOVE:
				case ARRAY_REPLACE:
				case ARRAY_TO_JSON:
				case ARRAY_TO_STRING:
				case ARRAY_TO_TSVECTOR:
				case ARRAY_UPPER:
				case ASIN:
				case ATAN:
				case ATAN2:
				case AVG:
				case BIN:
				case BIT_LENGTH:
				case BOOL_AND:
				case BOOL_OR:
				case BOX:
				case BOUND_BOX:
				case BROADCAST:
				case BTRIM:
				case BROUND:
				case CARDINALITY:
				case CAST:
				case CBRT:
				case CEIL:
				case CEILING:
				case CENTER:
				case CHAR_LENGTH:
				case CHARACTER_LENGTH:
				case CHECKSUM_AGG:
				case CHR:
				case CIRCLE:
				case CLOCK_TIMESTAMP:
				case CONCAT:
				case CONCAT_WS:
				case CONVERT_FROM:
				case CONVERT_TO:
				case COS:
				case CORR:
				case COVAR_POP:
				case COVAR_SAMP:
				case COT:
				case COUNT:
				case COUNT_BIG:
				case CRC32:
				case CURDATE:
				case CURRVAL:
				case CURTIME:
				case DATE:
				case DATEADD:
				case DATE_ADD:
				case DATE_FORMAT:
				case DATE_PART:
				case DATE_SUB:
				case DATE_TRUNC:
				case DATEDIFF:
				case DAY:
				case DAYNAME:
				case DAYOFMONTH:
				case DAYOFWEEK:
				case DAYOFYEAR:
				case DECODE:
				case DEGREES:
				case DENSE_RANK:
				case DIAMETER:
				case DIV:
				case NATURAL_CONSTANT:
				case ENCODE:
				case ENUM_FIRST:
				case ENUM_LAST:
				case ENUM_RANGE:
				case EXP:
				case EXTRACT:
				case EVERY:
				case FACTORIAL:
				case FAMILY:
				case FIELD:
				case FIND_IN_SET:
				case FLOOR:
				case FORMAT:
				case FORMAT_NUMBER:
				case FNV_HASH:
				case FROM_DAYS:
				case FROM_UNIXTIME:
				case GET_BIT:
				case GET_BYTE:
				case GET_CURRENT_TS_CONFIG:
				case GET_JSON_OBJECT:
				case GREATEST:
				case GROUPING:
				case GROUPING_ID:
				case HEIGHT:
				case HEX:
				case HOST:
				case HOSTMASK:
				case HOUR:
				case IFNULL:
				case INITCAP:
				case INSTR:
				case INTERVAL:
				case IN_FILE:
				case INET_SAME_FAMILY:
				case INET_MERGE:
				case ISCLOSED:
				case ISEMPTY:
				case ISFINITE:
				case ISNULL:
				case ISOPEN:
				case JSON_AGG:
				case JSON_ARRAY_LENGTH:
				case JSON_ARRAY_ELEMENTS:
				case JSON_ARRAY_ELEMENTS_TEXT:
				case JSON_BUILD_ARRAY:
				case JSON_BUILD_OBJECT:
				case JSON_EACH:
				case JSON_EACH_TEXT:
				case JSON_EXTRACT_PATH:
				case JSON_EXTRACT_PATH_TEXT:
				case JSON_OBJECT:
				case JSON_OBJECT_KEYS:
				case JSON_OBJECT_AGG:
				case JSON_POPULATE_RECORD:
				case JSON_POPULATE_RECORDSET:
				case JSON_STRIP_NULLS:
				case JSON_TO_RECORD:
				case JSON_TO_RECORDSET:
				case JSON_TYPEOF:
				case JSONB_AGG:
				case JSONB_OBJECT_AGG:
				case JSONB_SET:
				case JSONB_INSERT:
				case JSONB_PRETTY:
				case JUSTIFY_DAYS:
				case JUSTIFY_HOURS:
				case JUSTIFY_INTERVALS:
				case LASTVAL:
				case LAST_DAY:
				case LAST_INSERT_ID:
				case LCASE:
				case LEAST:
				case LENGTH:
				case LINE:
				case LN:
				case LOCALTIME:
				case LOCALTIMESTAMP:
				case LOCATE:
				case LOG:
				case LOG2:
				case LOG10:
				case LOWER:
				case LOWER_INC:
				case LOWER_INF:
				case LPAD:
				case LTRIM:
				case LSEG:
				case MACADDR8_SET7BIT:
				case MAKEDATE:
				case MAKETIME:
				case MAKE_DATE:
				case MAKE_TIME:
				case MAKE_TIMESTAMP:
				case MAKE_TIMESTAMPTZ:
				case MASKLEN:
				case MAX:
				case MD5:
				case MICROSECOND:
				case MIN:
				case MINUTE:
				case MOD:
				case MONTH:
				case MONTHNAME:
				case NEGATIVE:
				case NETMASK:
				case NETWORK:
				case NDV:
				case NEXTVAL:
				case NOW:
				case NPOINTS:
				case NTILE:
				case NUMNODE:
				case NVL:
				case OCTET_LENGTH:
				case OVERLAY:
				case PATH:
				case PCLOSE:
				case PERCENTILE:
				case PERIOD_ADD:
				case PERIOD_DIFF:
				case PG_CLIENT_ENCODING:
				case PLAINTO_TSQUERY:
				case PHRASETO_TSQUERY:
				case PI:
				case PMOD:
				case POINT:
				case POLYGON:
				case POPEN:
				case POSITION:
				case POSITIVE:
				case POW:
				case POWER:
				case QUARTER:
				case QUERYTREE:
				case QUOTE_IDENT:
				case QUOTE_LITERAL:
				case QUOTE_NULLABLE:
				case RADIANS:
				case RADIUS:
				case RAND:
				case RANDOM:
				case RANGE_MERGE:
				case RANK:
				case REGR_AVGX:
				case REGR_AVGY:
				case REGR_COUNT:
				case REGR_INTERCEPT:
				case REGR_R2:
				case REGR_SLOPE:
				case REGR_SXX:
				case REGR_SXY:
				case REGR_SYY:
				case REGEXP_MATCHES:
				case REGEXP_REPLACE:
				case REGEXP_SPLIT_TO_ARRAY:
				case REGEXP_SPLIT_TO_TABLE:
				case REPEAT:
				case REPLACE:
				case REVERSE:
				case ROUND:
				case ROW_TO_JSON:
				case ROW_NUMBER:
				case RTRIM:
				case SCALE:
				case SECOND:
				case SEC_TO_TIME:
				case SETSEED:
				case SETWEIGHT:
				case SETVAL:
				case SET_BIT:
				case SET_BYTE:
				case SET_MASKLEN:
				case SHA1:
				case SHA2:
				case SHIFTLEFT:
				case SHIFTRIGHT:
				case SHIFTRIGHTUNSIGNED:
				case SIGN:
				case SIN:
				case SPACE_FUNCTION:
				case SPLIT:
				case SPLIT_PART:
				case STATEMENT_TIMESTAMP:
				case STDEV:
				case STDDEV:
				case STDEVP:
				case STDDEV_SAMP:
				case STRCMP:
				case STRING_AGG:
				case STRING_TO_ARRAY:
				case STRPOS:
				case STR_TO_DATE:
				case SUBDATE:
				case SUBSTRING_INDEX:
				case SUM:
				case SQRT:
				case STDDEV_POP:
				case STRIP:
				case STRTOL:
				case SYSDATE:
				case TAN:
				case TEXT:
				case TIME:
				case TIMEDIFF:
				case TIMEOFDAY:
				case TIMESTAMP:
				case TIME_FORMAT:
				case TIME_TO_SEC:
				case TO_ASCII:
				case TO_CHAR:
				case TO_DATE:
				case TO_DAYS:
				case TO_HEX:
				case TO_JSON:
				case TO_JSONB:
				case TO_NUMBER:
				case TO_TIMESTAMP:
				case TO_TSQUERY:
				case TO_TSVECTOR:
				case TRANSACTION_TIMESTAMP:
				case TRANSLATE:
				case TRIM:
				case TRUNC:
				case TS_DELETE:
				case TS_FILTER:
				case TS_HEADLINE:
				case TS_RANK:
				case TS_RANK_CD:
				case TS_REWRITE:
				case TSQUERY_PHRASE:
				case TSVECTOR_TO_ARRAY:
				case TSVECTOR_UPDATE_TRIGGER:
				case TSVECTOR_UPDATE_TRIGGER_COLUMN:
				case UCASE:
				case UNHEX:
				case UNIX_TIMESTAMP:
				case UNNEST:
				case UPPER:
				case UPPER_INC:
				case UPPER_INF:
				case VAR:
				case VARIANCE:
				case VAR_POP:
				case VAR_SAMP:
				case VARP:
				case VERSION:
				case WEEKOFYEAR:
				case WEEK:
				case WEEKDAY:
				case WIDTH:
				case WIDTH_BUCKET:
				case XMLAGG:
				case XMLCOMMENT:
				case XMLCONCAT:
				case XMLELEMENT:
				case XMLFOREST:
				case XMLPI:
				case XMLROOT:
				case XML_ISWELL_FORMAT:
				case XPATH:
				case XPATH_EXISTS:
				case YEAR:
				case YEARWEEK:
				case ST_ASBINARY:
				case ST_ASTEXT:
				case ST_GEOMETRYFROMTEXT:
				case ST_GEOMFROMBINARY:
				case ST_LINEFROMTEXT:
				case ST_LINESTRING:
				case ST_MULTIPOINT:
				case ST_POINT:
				case ST_POLYGON:
				case ST_CONTAINS:
				case ST_CROSSES:
				case ST_DISJOINT:
				case ST_EQUALS:
				case ST_INTERSECTS:
				case ST_OVERLAPS:
				case ST_RELATE:
				case ST_TOUCHES:
				case ST_WITHIN:
				case GEOMETRY_UNION:
				case ST_BOUNDARY:
				case ST_BUFFER:
				case ST_DIFFERENCE:
				case ST_ENVELOPE:
				case ST_ENVELOPEASPTS:
				case ST_EXTERIORRING:
				case ST_INTERSECTION:
				case ST_SYMDIFFERENCE:
				case ST_UNION:
				case ST_AREA:
				case ST_CENTROID:
				case ST_CONVEXHULL:
				case ST_DIMENSION:
				case ST_DISTANCE:
				case ST_GEOMETRYN:
				case ST_INTERIORRINGN:
				case ST_GEOMETRYTYPE:
				case ST_ISCLOSED:
				case ST_ISEMPTY:
				case ST_ISSIMPLE:
				case ST_ISRING:
				case ST_ISVALID:
				case ST_LENGTH:
				case ST_POINTN:
				case ST_XMAX:
				case ST_YMAX:
				case ST_XMIN:
				case ST_YMIN:
				case ST_STARTPOINT:
				case SIMPLIFY_GEOMETRY:
				case ST_ENDPOINT:
				case ST_X:
				case ST_Y:
				case ST_INTERIORRINGS:
				case ST_NUMGEOMETRIES:
				case ST_GEOMETRIES:
				case ST_NUMPOINTS:
				case ST_NUMINTERIORRING:
				case LINE_LOCATE_POINT:
				case GEOMETRY_INVALID_REASON:
				case GREAT_CIRCLE_DISTANCE:
				case CONVEX_HULL_AGG:
				case GEOMETRY_UNION_AGG:
				case BING_TILE:
				case BING_TILE_AT:
				case BING_TILES_AROUND:
				case BING_TILE_COORDINATES:
				case BING_TILE_POLYGON:
				case BING_TILE_QUADKEY:
				case BING_TILE_ZOOM_LEVEL:
				case GEOMETRY_TO_BING_TILES:
				case SPACE:
				case DOUBLE_QUOTE_ID:
				case BACKTICK_ID:
				case SQUARE_BRACKET_ID:
				case LOCAL_ID:
				case DECIMAL:
				case ID:
				case STRING:
				case BINARY:
				case FLOAT:
				case REAL:
				case DOLLAR:
				case LR_BRACKET:
				case PLUS:
				case MINUS:
				case BIT_NOT:
				case BIT_OR:
				case BIT_AND:
					{
					setState(1635);
					all_distinct_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1638);
				match(RR_BRACKET);
				setState(1640);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1639);
					over_clause();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_distinct_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ALL() { return getToken(DBEstSQLParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(DBEstSQLParser.DISTINCT, 0); }
		public All_distinct_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_distinct_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitAll_distinct_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_distinct_expressionContext all_distinct_expression() throws RecognitionException {
		All_distinct_expressionContext _localctx = new All_distinct_expressionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_all_distinct_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1644);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(1647);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_as_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(DBEstSQLParser.AS, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Cast_as_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_as_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitCast_as_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_as_expressionContext cast_as_expression() throws RecognitionException {
		Cast_as_expressionContext _localctx = new Cast_as_expressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_cast_as_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			expression(0);
			setState(1650);
			match(AS);
			setState(1651);
			data_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Over_clauseContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(DBEstSQLParser.OVER, 0); }
		public Partition_by_clauseContext partition_by_clause() {
			return getRuleContext(Partition_by_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Row_or_range_clauseContext row_or_range_clause() {
			return getRuleContext(Row_or_range_clauseContext.class,0);
		}
		public Over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitOver_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Over_clauseContext over_clause() throws RecognitionException {
		Over_clauseContext _localctx = new Over_clauseContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1653);
			match(OVER);
			setState(1654);
			match(LR_BRACKET);
			setState(1656);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1655);
				partition_by_clause();
				}
			}

			setState(1659);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1658);
				order_by_clause();
				}
			}

			setState(1662);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(1661);
				row_or_range_clause();
				}
			}

			setState(1664);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_or_range_clauseContext extends ParserRuleContext {
		public Window_frame_extentContext window_frame_extent() {
			return getRuleContext(Window_frame_extentContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(DBEstSQLParser.ROWS, 0); }
		public TerminalNode RANGE() { return getToken(DBEstSQLParser.RANGE, 0); }
		public Row_or_range_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_or_range_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitRow_or_range_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Row_or_range_clauseContext row_or_range_clause() throws RecognitionException {
		Row_or_range_clauseContext _localctx = new Row_or_range_clauseContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_row_or_range_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			_la = _input.LA(1);
			if ( !(_la==RANGE || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1667);
			window_frame_extent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_frame_extentContext extends ParserRuleContext {
		public Window_frame_precedingContext window_frame_preceding() {
			return getRuleContext(Window_frame_precedingContext.class,0);
		}
		public TerminalNode BETWEEN() { return getToken(DBEstSQLParser.BETWEEN, 0); }
		public List<Window_frame_boundContext> window_frame_bound() {
			return getRuleContexts(Window_frame_boundContext.class);
		}
		public Window_frame_boundContext window_frame_bound(int i) {
			return getRuleContext(Window_frame_boundContext.class,i);
		}
		public TerminalNode AND() { return getToken(DBEstSQLParser.AND, 0); }
		public Window_frame_extentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_extent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitWindow_frame_extent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_frame_extentContext window_frame_extent() throws RecognitionException {
		Window_frame_extentContext _localctx = new Window_frame_extentContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_window_frame_extent);
		try {
			setState(1675);
			switch (_input.LA(1)) {
			case CURRENT:
			case UNBOUNDED:
			case DECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1669);
				window_frame_preceding();
				}
				break;
			case BETWEEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1670);
				match(BETWEEN);
				setState(1671);
				window_frame_bound();
				setState(1672);
				match(AND);
				setState(1673);
				window_frame_bound();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_frame_boundContext extends ParserRuleContext {
		public Window_frame_precedingContext window_frame_preceding() {
			return getRuleContext(Window_frame_precedingContext.class,0);
		}
		public Window_frame_followingContext window_frame_following() {
			return getRuleContext(Window_frame_followingContext.class,0);
		}
		public Window_frame_boundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_bound; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitWindow_frame_bound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_frame_boundContext window_frame_bound() throws RecognitionException {
		Window_frame_boundContext _localctx = new Window_frame_boundContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_window_frame_bound);
		try {
			setState(1679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1677);
				window_frame_preceding();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1678);
				window_frame_following();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_frame_precedingContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(DBEstSQLParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(DBEstSQLParser.PRECEDING, 0); }
		public TerminalNode DECIMAL() { return getToken(DBEstSQLParser.DECIMAL, 0); }
		public TerminalNode CURRENT() { return getToken(DBEstSQLParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(DBEstSQLParser.ROW, 0); }
		public Window_frame_precedingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_preceding; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitWindow_frame_preceding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_frame_precedingContext window_frame_preceding() throws RecognitionException {
		Window_frame_precedingContext _localctx = new Window_frame_precedingContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_window_frame_preceding);
		try {
			setState(1687);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(1681);
				match(UNBOUNDED);
				setState(1682);
				match(PRECEDING);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1683);
				match(DECIMAL);
				setState(1684);
				match(PRECEDING);
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1685);
				match(CURRENT);
				setState(1686);
				match(ROW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_frame_followingContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(DBEstSQLParser.UNBOUNDED, 0); }
		public TerminalNode FOLLOWING() { return getToken(DBEstSQLParser.FOLLOWING, 0); }
		public TerminalNode DECIMAL() { return getToken(DBEstSQLParser.DECIMAL, 0); }
		public Window_frame_followingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_following; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitWindow_frame_following(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_frame_followingContext window_frame_following() throws RecognitionException {
		Window_frame_followingContext _localctx = new Window_frame_followingContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_window_frame_following);
		try {
			setState(1693);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(1689);
				match(UNBOUNDED);
				setState(1690);
				match(FOLLOWING);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1691);
				match(DECIMAL);
				setState(1692);
				match(FOLLOWING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Full_table_nameContext extends ParserRuleContext {
		public IdContext server;
		public IdContext database;
		public IdContext schema;
		public IdContext table;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Full_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_table_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitFull_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Full_table_nameContext full_table_name() throws RecognitionException {
		Full_table_nameContext _localctx = new Full_table_nameContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_full_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1695);
				((Full_table_nameContext)_localctx).server = id();
				setState(1696);
				match(DOT);
				setState(1697);
				((Full_table_nameContext)_localctx).database = id();
				setState(1698);
				match(DOT);
				setState(1699);
				((Full_table_nameContext)_localctx).schema = id();
				setState(1700);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(1702);
				((Full_table_nameContext)_localctx).database = id();
				setState(1703);
				match(DOT);
				setState(1705);
				_la = _input.LA(1);
				if (_la==DISTINCT || _la==LEFT || _la==RIGHT || ((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (AGE - 221)) | (1L << (AREA - 221)) | (1L << (CENTER - 221)) | (1L << (CIRCLE - 221)))) != 0) || ((((_la - 286)) & ~0x3f) == 0 && ((1L << (_la - 286)) & ((1L << (COUNT - 286)) | (1L << (DATE - 286)) | (1L << (DAY - 286)) | (1L << (DAYNAME - 286)) | (1L << (DAYOFMONTH - 286)) | (1L << (DAYOFWEEK - 286)) | (1L << (DAYOFYEAR - 286)) | (1L << (DEGREES - 286)) | (1L << (DIAMETER - 286)))) != 0) || ((((_la - 360)) & ~0x3f) == 0 && ((1L << (_la - 360)) & ((1L << (HEIGHT - 360)) | (1L << (HOUR - 360)) | (1L << (LENGTH - 360)))) != 0) || ((((_la - 441)) & ~0x3f) == 0 && ((1L << (_la - 441)) & ((1L << (MAKEDATE - 441)) | (1L << (MICROSECOND - 441)) | (1L << (MINUTE - 441)) | (1L << (MOD - 441)) | (1L << (MONTH - 441)) | (1L << (MONTHNAME - 441)))) != 0) || ((((_la - 509)) & ~0x3f) == 0 && ((1L << (_la - 509)) & ((1L << (POWER - 509)) | (1L << (SCALE - 509)) | (1L << (SECOND - 509)))) != 0) || ((((_la - 611)) & ~0x3f) == 0 && ((1L << (_la - 611)) & ((1L << (TEXT - 611)) | (1L << (TIME - 611)) | (1L << (TIMESTAMP - 611)) | (1L << (VARIANCE - 611)) | (1L << (WEEKOFYEAR - 611)))) != 0) || ((((_la - 767)) & ~0x3f) == 0 && ((1L << (_la - 767)) & ((1L << (DOUBLE_QUOTE_ID - 767)) | (1L << (BACKTICK_ID - 767)) | (1L << (SQUARE_BRACKET_ID - 767)) | (1L << (ID - 767)))) != 0)) {
					{
					setState(1704);
					((Full_table_nameContext)_localctx).schema = id();
					}
				}

				setState(1707);
				match(DOT);
				}
				break;
			case 3:
				{
				setState(1709);
				((Full_table_nameContext)_localctx).schema = id();
				setState(1710);
				match(DOT);
				}
				break;
			}
			setState(1714);
			((Full_table_nameContext)_localctx).table = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public IdContext schema;
		public IdContext table;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1716);
				((Table_nameContext)_localctx).schema = id();
				setState(1717);
				match(DOT);
				}
				break;
			}
			setState(1721);
			((Table_nameContext)_localctx).table = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_nameContext extends ParserRuleContext {
		public IdContext schema;
		public IdContext view;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1723);
				((View_nameContext)_localctx).schema = id();
				setState(1724);
				match(DOT);
				}
				break;
			}
			setState(1728);
			((View_nameContext)_localctx).view = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_proc_nameContext extends ParserRuleContext {
		public IdContext database;
		public IdContext schema;
		public IdContext procedure;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Func_proc_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_proc_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitFunc_proc_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_proc_nameContext func_proc_name() throws RecognitionException {
		Func_proc_nameContext _localctx = new Func_proc_nameContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_func_proc_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1730);
				((Func_proc_nameContext)_localctx).database = id();
				setState(1731);
				match(DOT);
				setState(1733);
				_la = _input.LA(1);
				if (_la==DISTINCT || _la==LEFT || _la==RIGHT || ((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (AGE - 221)) | (1L << (AREA - 221)) | (1L << (CENTER - 221)) | (1L << (CIRCLE - 221)))) != 0) || ((((_la - 286)) & ~0x3f) == 0 && ((1L << (_la - 286)) & ((1L << (COUNT - 286)) | (1L << (DATE - 286)) | (1L << (DAY - 286)) | (1L << (DAYNAME - 286)) | (1L << (DAYOFMONTH - 286)) | (1L << (DAYOFWEEK - 286)) | (1L << (DAYOFYEAR - 286)) | (1L << (DEGREES - 286)) | (1L << (DIAMETER - 286)))) != 0) || ((((_la - 360)) & ~0x3f) == 0 && ((1L << (_la - 360)) & ((1L << (HEIGHT - 360)) | (1L << (HOUR - 360)) | (1L << (LENGTH - 360)))) != 0) || ((((_la - 441)) & ~0x3f) == 0 && ((1L << (_la - 441)) & ((1L << (MAKEDATE - 441)) | (1L << (MICROSECOND - 441)) | (1L << (MINUTE - 441)) | (1L << (MOD - 441)) | (1L << (MONTH - 441)) | (1L << (MONTHNAME - 441)))) != 0) || ((((_la - 509)) & ~0x3f) == 0 && ((1L << (_la - 509)) & ((1L << (POWER - 509)) | (1L << (SCALE - 509)) | (1L << (SECOND - 509)))) != 0) || ((((_la - 611)) & ~0x3f) == 0 && ((1L << (_la - 611)) & ((1L << (TEXT - 611)) | (1L << (TIME - 611)) | (1L << (TIMESTAMP - 611)) | (1L << (VARIANCE - 611)) | (1L << (WEEKOFYEAR - 611)))) != 0) || ((((_la - 767)) & ~0x3f) == 0 && ((1L << (_la - 767)) & ((1L << (DOUBLE_QUOTE_ID - 767)) | (1L << (BACKTICK_ID - 767)) | (1L << (SQUARE_BRACKET_ID - 767)) | (1L << (ID - 767)))) != 0)) {
					{
					setState(1732);
					((Func_proc_nameContext)_localctx).schema = id();
					}
				}

				setState(1735);
				match(DOT);
				}
				break;
			case 2:
				{
				{
				setState(1737);
				((Func_proc_nameContext)_localctx).schema = id();
				}
				setState(1738);
				match(DOT);
				}
				break;
			}
			setState(1742);
			((Func_proc_nameContext)_localctx).procedure = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ddl_objectContext extends ParserRuleContext {
		public Full_table_nameContext full_table_name() {
			return getRuleContext(Full_table_nameContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(DBEstSQLParser.LOCAL_ID, 0); }
		public Ddl_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl_object; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitDdl_object(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ddl_objectContext ddl_object() throws RecognitionException {
		Ddl_objectContext _localctx = new Ddl_objectContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_ddl_object);
		try {
			setState(1746);
			switch (_input.LA(1)) {
			case DISTINCT:
			case LEFT:
			case RIGHT:
			case AGE:
			case AREA:
			case CENTER:
			case CIRCLE:
			case COUNT:
			case DATE:
			case DAY:
			case DAYNAME:
			case DAYOFMONTH:
			case DAYOFWEEK:
			case DAYOFYEAR:
			case DEGREES:
			case DIAMETER:
			case HEIGHT:
			case HOUR:
			case LENGTH:
			case MAKEDATE:
			case MICROSECOND:
			case MINUTE:
			case MOD:
			case MONTH:
			case MONTHNAME:
			case POWER:
			case SCALE:
			case SECOND:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case VARIANCE:
			case WEEKOFYEAR:
			case DOUBLE_QUOTE_ID:
			case BACKTICK_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1744);
				full_table_name();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1745);
				match(LOCAL_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Full_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Full_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_column_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitFull_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Full_column_nameContext full_column_name() throws RecognitionException {
		Full_column_nameContext _localctx = new Full_column_nameContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_full_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1748);
				table_name();
				setState(1749);
				match(DOT);
				}
				break;
			}
			setState(1753);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_name_listContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Column_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitColumn_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_name_listContext column_name_list() throws RecognitionException {
		Column_name_listContext _localctx = new Column_name_listContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			column_name();
			setState(1760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1756);
				match(COMMA);
				setState(1757);
				column_name();
				}
				}
				setState(1762);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(DBEstSQLParser.LOCAL_ID, 0); }
		public Cursor_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitCursor_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_nameContext cursor_name() throws RecognitionException {
		Cursor_nameContext _localctx = new Cursor_nameContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_cursor_name);
		try {
			setState(1767);
			switch (_input.LA(1)) {
			case DISTINCT:
			case LEFT:
			case RIGHT:
			case AGE:
			case AREA:
			case CENTER:
			case CIRCLE:
			case COUNT:
			case DATE:
			case DAY:
			case DAYNAME:
			case DAYOFMONTH:
			case DAYOFWEEK:
			case DAYOFYEAR:
			case DEGREES:
			case DIAMETER:
			case HEIGHT:
			case HOUR:
			case LENGTH:
			case MAKEDATE:
			case MICROSECOND:
			case MINUTE:
			case MOD:
			case MONTH:
			case MONTHNAME:
			case POWER:
			case SCALE:
			case SECOND:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case VARIANCE:
			case WEEKOFYEAR:
			case DOUBLE_QUOTE_ID:
			case BACKTICK_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1765);
				id();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1766);
				match(LOCAL_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class On_offContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(DBEstSQLParser.ON, 0); }
		public TerminalNode OFF() { return getToken(DBEstSQLParser.OFF, 0); }
		public On_offContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_on_off; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitOn_off(this);
			else return visitor.visitChildren(this);
		}
	}

	public final On_offContext on_off() throws RecognitionException {
		On_offContext _localctx = new On_offContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_on_off);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1769);
			_la = _input.LA(1);
			if ( !(_la==OFF || _la==ON) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClusteredContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(DBEstSQLParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(DBEstSQLParser.NONCLUSTERED, 0); }
		public ClusteredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clustered; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitClustered(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClusteredContext clustered() throws RecognitionException {
		ClusteredContext _localctx = new ClusteredContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_clustered);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			_la = _input.LA(1);
			if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_notnullContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(DBEstSQLParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(DBEstSQLParser.NOT, 0); }
		public Null_notnullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_notnull; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitNull_notnull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_notnullContext null_notnull() throws RecognitionException {
		Null_notnullContext _localctx = new Null_notnullContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_null_notnull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1773);
				match(NOT);
				}
			}

			setState(1776);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class True_orfalseContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(DBEstSQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(DBEstSQLParser.FALSE, 0); }
		public True_orfalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_orfalse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitTrue_orfalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final True_orfalseContext true_orfalse() throws RecognitionException {
		True_orfalseContext _localctx = new True_orfalseContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_true_orfalse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1778);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scalar_function_nameContext extends ParserRuleContext {
		public Func_proc_nameContext func_proc_name() {
			return getRuleContext(Func_proc_nameContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(DBEstSQLParser.RIGHT, 0); }
		public TerminalNode LEFT() { return getToken(DBEstSQLParser.LEFT, 0); }
		public TerminalNode BINARY_CHECKSUM() { return getToken(DBEstSQLParser.BINARY_CHECKSUM, 0); }
		public TerminalNode CHECKSUM() { return getToken(DBEstSQLParser.CHECKSUM, 0); }
		public Scalar_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_function_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitScalar_function_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scalar_function_nameContext scalar_function_name() throws RecognitionException {
		Scalar_function_nameContext _localctx = new Scalar_function_nameContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_scalar_function_name);
		try {
			setState(1785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1780);
				func_proc_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1781);
				match(RIGHT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1782);
				match(LEFT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1783);
				match(BINARY_CHECKSUM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1784);
				match(CHECKSUM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode BIGINT() { return getToken(DBEstSQLParser.BIGINT, 0); }
		public TerminalNode BINARY() { return getToken(DBEstSQLParser.BINARY, 0); }
		public List<TerminalNode> DECIMAL() { return getTokens(DBEstSQLParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(DBEstSQLParser.DECIMAL, i);
		}
		public TerminalNode BIT() { return getToken(DBEstSQLParser.BIT, 0); }
		public TerminalNode CHAR() { return getToken(DBEstSQLParser.CHAR, 0); }
		public TerminalNode DATE() { return getToken(DBEstSQLParser.DATE, 0); }
		public TerminalNode DATETIME() { return getToken(DBEstSQLParser.DATETIME, 0); }
		public TerminalNode DATETIME2() { return getToken(DBEstSQLParser.DATETIME2, 0); }
		public TerminalNode DATETIMEOFFSET() { return getToken(DBEstSQLParser.DATETIMEOFFSET, 0); }
		public TerminalNode DOUBLE() { return getToken(DBEstSQLParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(DBEstSQLParser.PRECISION, 0); }
		public TerminalNode FLOAT() { return getToken(DBEstSQLParser.FLOAT, 0); }
		public TerminalNode GEOGRAPHY() { return getToken(DBEstSQLParser.GEOGRAPHY, 0); }
		public TerminalNode GEOMETRY() { return getToken(DBEstSQLParser.GEOMETRY, 0); }
		public TerminalNode HIERARCHYID() { return getToken(DBEstSQLParser.HIERARCHYID, 0); }
		public TerminalNode IMAGE() { return getToken(DBEstSQLParser.IMAGE, 0); }
		public TerminalNode INT() { return getToken(DBEstSQLParser.INT, 0); }
		public TerminalNode MONEY() { return getToken(DBEstSQLParser.MONEY, 0); }
		public TerminalNode NCHAR() { return getToken(DBEstSQLParser.NCHAR, 0); }
		public TerminalNode NTEXT() { return getToken(DBEstSQLParser.NTEXT, 0); }
		public TerminalNode NUMERIC() { return getToken(DBEstSQLParser.NUMERIC, 0); }
		public TerminalNode NVARCHAR() { return getToken(DBEstSQLParser.NVARCHAR, 0); }
		public TerminalNode MAX() { return getToken(DBEstSQLParser.MAX, 0); }
		public TerminalNode REAL() { return getToken(DBEstSQLParser.REAL, 0); }
		public TerminalNode SMALLDATETIME() { return getToken(DBEstSQLParser.SMALLDATETIME, 0); }
		public TerminalNode SMALLINT() { return getToken(DBEstSQLParser.SMALLINT, 0); }
		public TerminalNode SMALLMONEY() { return getToken(DBEstSQLParser.SMALLMONEY, 0); }
		public TerminalNode SQL_VARIANT() { return getToken(DBEstSQLParser.SQL_VARIANT, 0); }
		public TerminalNode TEXT() { return getToken(DBEstSQLParser.TEXT, 0); }
		public TerminalNode TIME() { return getToken(DBEstSQLParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(DBEstSQLParser.TIMESTAMP, 0); }
		public TerminalNode WITHOUT() { return getToken(DBEstSQLParser.WITHOUT, 0); }
		public TerminalNode ZONE() { return getToken(DBEstSQLParser.ZONE, 0); }
		public TerminalNode TINYINT() { return getToken(DBEstSQLParser.TINYINT, 0); }
		public TerminalNode UNIQUEIDENTIFIER() { return getToken(DBEstSQLParser.UNIQUEIDENTIFIER, 0); }
		public TerminalNode VARBINARY() { return getToken(DBEstSQLParser.VARBINARY, 0); }
		public TerminalNode VARCHAR() { return getToken(DBEstSQLParser.VARCHAR, 0); }
		public TerminalNode XML() { return getToken(DBEstSQLParser.XML, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode IDENTITY() { return getToken(DBEstSQLParser.IDENTITY, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_data_type);
		int _la;
		try {
			setState(1879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1787);
				match(BIGINT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1788);
				match(BINARY);
				setState(1789);
				match(LR_BRACKET);
				setState(1790);
				match(DECIMAL);
				setState(1791);
				match(RR_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1792);
				match(BIT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1793);
				match(CHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1794);
				match(CHAR);
				setState(1795);
				match(LR_BRACKET);
				setState(1796);
				match(DECIMAL);
				setState(1797);
				match(RR_BRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1798);
				match(DATE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1799);
				match(DATETIME);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1800);
				match(DATETIME2);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1801);
				match(DATETIMEOFFSET);
				setState(1802);
				match(LR_BRACKET);
				setState(1803);
				match(DECIMAL);
				setState(1804);
				match(RR_BRACKET);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1805);
				match(DECIMAL);
				setState(1806);
				match(LR_BRACKET);
				setState(1807);
				match(DECIMAL);
				setState(1808);
				match(COMMA);
				setState(1809);
				match(DECIMAL);
				setState(1810);
				match(RR_BRACKET);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1811);
				match(DOUBLE);
				setState(1813);
				_la = _input.LA(1);
				if (_la==PRECISION) {
					{
					setState(1812);
					match(PRECISION);
					}
				}

				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1815);
				match(FLOAT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1816);
				match(GEOGRAPHY);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1817);
				match(GEOMETRY);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1818);
				match(HIERARCHYID);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1819);
				match(IMAGE);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1820);
				match(INT);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1821);
				match(MONEY);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1822);
				match(NCHAR);
				setState(1823);
				match(LR_BRACKET);
				setState(1824);
				match(DECIMAL);
				setState(1825);
				match(RR_BRACKET);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1826);
				match(NTEXT);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1827);
				match(NUMERIC);
				setState(1828);
				match(LR_BRACKET);
				setState(1829);
				match(DECIMAL);
				setState(1830);
				match(COMMA);
				setState(1831);
				match(DECIMAL);
				setState(1832);
				match(RR_BRACKET);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1833);
				match(NVARCHAR);
				setState(1834);
				match(LR_BRACKET);
				setState(1835);
				match(DECIMAL);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1836);
				match(MAX);
				setState(1837);
				match(RR_BRACKET);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1838);
				match(REAL);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1839);
				match(SMALLDATETIME);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1840);
				match(SMALLINT);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1841);
				match(SMALLMONEY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1842);
				match(SQL_VARIANT);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1843);
				match(TEXT);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1844);
				match(TIME);
				setState(1845);
				match(LR_BRACKET);
				setState(1846);
				match(DECIMAL);
				setState(1847);
				match(RR_BRACKET);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1848);
				match(TIMESTAMP);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1849);
				match(TIMESTAMP);
				setState(1850);
				match(WITHOUT);
				setState(1851);
				match(TIME);
				setState(1852);
				match(ZONE);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1853);
				match(TINYINT);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1854);
				match(UNIQUEIDENTIFIER);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1855);
				match(VARBINARY);
				setState(1856);
				match(LR_BRACKET);
				setState(1857);
				match(DECIMAL);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1858);
				match(MAX);
				setState(1859);
				match(RR_BRACKET);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1860);
				match(VARCHAR);
				setState(1861);
				match(LR_BRACKET);
				setState(1862);
				match(DECIMAL);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1863);
				match(MAX);
				setState(1864);
				match(RR_BRACKET);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1865);
				match(XML);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1866);
				id();
				setState(1868);
				_la = _input.LA(1);
				if (_la==IDENTITY) {
					{
					setState(1867);
					match(IDENTITY);
					}
				}

				setState(1877);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1870);
					match(LR_BRACKET);
					setState(1871);
					_la = _input.LA(1);
					if ( !(_la==MAX || _la==DECIMAL) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1874);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1872);
						match(COMMA);
						setState(1873);
						match(DECIMAL);
						}
					}

					setState(1876);
					match(RR_BRACKET);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_valueContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(DBEstSQLParser.NULL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitDefault_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_valueContext default_value() throws RecognitionException {
		Default_valueContext _localctx = new Default_valueContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_default_value);
		try {
			setState(1883);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1881);
				match(NULL);
				}
				break;
			case DECIMAL:
			case STRING:
			case BINARY:
			case FLOAT:
			case REAL:
			case DOLLAR:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1882);
				constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DBEstSQLParser.STRING, 0); }
		public TerminalNode BINARY() { return getToken(DBEstSQLParser.BINARY, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode REAL() { return getToken(DBEstSQLParser.REAL, 0); }
		public TerminalNode FLOAT() { return getToken(DBEstSQLParser.FLOAT, 0); }
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(DBEstSQLParser.DECIMAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_constant);
		int _la;
		try {
			setState(1897);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1885);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1886);
				match(BINARY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1887);
				number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1889);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1888);
					sign();
					}
				}

				setState(1891);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==REAL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1893);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1892);
					sign();
					}
				}

				setState(1895);
				match(DOLLAR);
				setState(1896);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(DBEstSQLParser.DECIMAL, 0); }
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1900);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1899);
				sign();
				}
			}

			setState(1902);
			match(DECIMAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(DBEstSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DBEstSQLParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1904);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public Simple_idContext simple_id() {
			return getRuleContext(Simple_idContext.class,0);
		}
		public TerminalNode DOUBLE_QUOTE_ID() { return getToken(DBEstSQLParser.DOUBLE_QUOTE_ID, 0); }
		public TerminalNode SQUARE_BRACKET_ID() { return getToken(DBEstSQLParser.SQUARE_BRACKET_ID, 0); }
		public TerminalNode BACKTICK_ID() { return getToken(DBEstSQLParser.BACKTICK_ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_id);
		try {
			setState(1910);
			switch (_input.LA(1)) {
			case DISTINCT:
			case LEFT:
			case RIGHT:
			case AGE:
			case AREA:
			case CENTER:
			case CIRCLE:
			case COUNT:
			case DATE:
			case DAY:
			case DAYNAME:
			case DAYOFMONTH:
			case DAYOFWEEK:
			case DAYOFYEAR:
			case DEGREES:
			case DIAMETER:
			case HEIGHT:
			case HOUR:
			case LENGTH:
			case MAKEDATE:
			case MICROSECOND:
			case MINUTE:
			case MOD:
			case MONTH:
			case MONTHNAME:
			case POWER:
			case SCALE:
			case SECOND:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case VARIANCE:
			case WEEKOFYEAR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1906);
				simple_id();
				}
				break;
			case DOUBLE_QUOTE_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1907);
				match(DOUBLE_QUOTE_ID);
				}
				break;
			case SQUARE_BRACKET_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(1908);
				match(SQUARE_BRACKET_ID);
				}
				break;
			case BACKTICK_ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(1909);
				match(BACKTICK_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DBEstSQLParser.ID, 0); }
		public TerminalNode AGE() { return getToken(DBEstSQLParser.AGE, 0); }
		public TerminalNode AREA() { return getToken(DBEstSQLParser.AREA, 0); }
		public TerminalNode CENTER() { return getToken(DBEstSQLParser.CENTER, 0); }
		public TerminalNode CIRCLE() { return getToken(DBEstSQLParser.CIRCLE, 0); }
		public TerminalNode COUNT() { return getToken(DBEstSQLParser.COUNT, 0); }
		public TerminalNode DATE() { return getToken(DBEstSQLParser.DATE, 0); }
		public TerminalNode DAY() { return getToken(DBEstSQLParser.DAY, 0); }
		public TerminalNode DAYNAME() { return getToken(DBEstSQLParser.DAYNAME, 0); }
		public TerminalNode DAYOFMONTH() { return getToken(DBEstSQLParser.DAYOFMONTH, 0); }
		public TerminalNode DAYOFWEEK() { return getToken(DBEstSQLParser.DAYOFWEEK, 0); }
		public TerminalNode DAYOFYEAR() { return getToken(DBEstSQLParser.DAYOFYEAR, 0); }
		public TerminalNode DEGREES() { return getToken(DBEstSQLParser.DEGREES, 0); }
		public TerminalNode DIAMETER() { return getToken(DBEstSQLParser.DIAMETER, 0); }
		public TerminalNode DISTINCT() { return getToken(DBEstSQLParser.DISTINCT, 0); }
		public TerminalNode HEIGHT() { return getToken(DBEstSQLParser.HEIGHT, 0); }
		public TerminalNode HOUR() { return getToken(DBEstSQLParser.HOUR, 0); }
		public TerminalNode LEFT() { return getToken(DBEstSQLParser.LEFT, 0); }
		public TerminalNode LENGTH() { return getToken(DBEstSQLParser.LENGTH, 0); }
		public TerminalNode MAKEDATE() { return getToken(DBEstSQLParser.MAKEDATE, 0); }
		public TerminalNode MICROSECOND() { return getToken(DBEstSQLParser.MICROSECOND, 0); }
		public TerminalNode MINUTE() { return getToken(DBEstSQLParser.MINUTE, 0); }
		public TerminalNode MOD() { return getToken(DBEstSQLParser.MOD, 0); }
		public TerminalNode MONTH() { return getToken(DBEstSQLParser.MONTH, 0); }
		public TerminalNode MONTHNAME() { return getToken(DBEstSQLParser.MONTHNAME, 0); }
		public TerminalNode RIGHT() { return getToken(DBEstSQLParser.RIGHT, 0); }
		public TerminalNode POWER() { return getToken(DBEstSQLParser.POWER, 0); }
		public TerminalNode SCALE() { return getToken(DBEstSQLParser.SCALE, 0); }
		public TerminalNode SECOND() { return getToken(DBEstSQLParser.SECOND, 0); }
		public TerminalNode TEXT() { return getToken(DBEstSQLParser.TEXT, 0); }
		public TerminalNode TIME() { return getToken(DBEstSQLParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(DBEstSQLParser.TIMESTAMP, 0); }
		public TerminalNode VARIANCE() { return getToken(DBEstSQLParser.VARIANCE, 0); }
		public TerminalNode WEEKOFYEAR() { return getToken(DBEstSQLParser.WEEKOFYEAR, 0); }
		public Simple_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitSimple_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_idContext simple_id() throws RecognitionException {
		Simple_idContext _localctx = new Simple_idContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_simple_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1912);
			_la = _input.LA(1);
			if ( !(_la==DISTINCT || _la==LEFT || _la==RIGHT || ((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (AGE - 221)) | (1L << (AREA - 221)) | (1L << (CENTER - 221)) | (1L << (CIRCLE - 221)))) != 0) || ((((_la - 286)) & ~0x3f) == 0 && ((1L << (_la - 286)) & ((1L << (COUNT - 286)) | (1L << (DATE - 286)) | (1L << (DAY - 286)) | (1L << (DAYNAME - 286)) | (1L << (DAYOFMONTH - 286)) | (1L << (DAYOFWEEK - 286)) | (1L << (DAYOFYEAR - 286)) | (1L << (DEGREES - 286)) | (1L << (DIAMETER - 286)))) != 0) || ((((_la - 360)) & ~0x3f) == 0 && ((1L << (_la - 360)) & ((1L << (HEIGHT - 360)) | (1L << (HOUR - 360)) | (1L << (LENGTH - 360)))) != 0) || ((((_la - 441)) & ~0x3f) == 0 && ((1L << (_la - 441)) & ((1L << (MAKEDATE - 441)) | (1L << (MICROSECOND - 441)) | (1L << (MINUTE - 441)) | (1L << (MOD - 441)) | (1L << (MONTH - 441)) | (1L << (MONTHNAME - 441)))) != 0) || ((((_la - 509)) & ~0x3f) == 0 && ((1L << (_la - 509)) & ((1L << (POWER - 509)) | (1L << (SCALE - 509)) | (1L << (SECOND - 509)))) != 0) || ((((_la - 611)) & ~0x3f) == 0 && ((1L << (_la - 611)) & ((1L << (TEXT - 611)) | (1L << (TIME - 611)) | (1L << (TIMESTAMP - 611)) | (1L << (VARIANCE - 611)) | (1L << (WEEKOFYEAR - 611)))) != 0) || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_operatorContext extends ParserRuleContext {
		public Comparison_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitComparison_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_operatorContext comparison_operator() throws RecognitionException {
		Comparison_operatorContext _localctx = new Comparison_operatorContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_comparison_operator);
		try {
			setState(1929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1914);
				match(EQUAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1915);
				match(GREATER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1916);
				match(LESS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1917);
				match(LESS);
				setState(1918);
				match(EQUAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1919);
				match(GREATER);
				setState(1920);
				match(EQUAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1921);
				match(LESS);
				setState(1922);
				match(GREATER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1923);
				match(EXCLAMATION);
				setState(1924);
				match(EQUAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1925);
				match(EXCLAMATION);
				setState(1926);
				match(GREATER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1927);
				match(EXCLAMATION);
				setState(1928);
				match(LESS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBEstSQLParserVisitor ) return ((DBEstSQLParserVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1931);
			_la = _input.LA(1);
			if ( !(((((_la - 781)) & ~0x3f) == 0 && ((1L << (_la - 781)) & ((1L << (PLUS_ASSIGN - 781)) | (1L << (MINUS_ASSIGN - 781)) | (1L << (MULT_ASSIGN - 781)) | (1L << (DIV_ASSIGN - 781)) | (1L << (MOD_ASSIGN - 781)) | (1L << (AND_ASSIGN - 781)) | (1L << (XOR_ASSIGN - 781)) | (1L << (OR_ASSIGN - 781)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 42:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 55:
			return predicate_sempred((PredicateContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean predicate_sempred(PredicateContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0332\u0790\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u012a"+
		"\n\2\3\3\3\3\3\3\3\3\3\3\5\3\u0131\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\u013b\n\3\3\3\3\3\5\3\u013f\n\3\3\3\3\3\5\3\u0143\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\u014a\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\5\7"+
		"\u0157\n\7\3\b\3\b\5\b\u015b\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0165"+
		"\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u016f\n\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u0182"+
		"\n\17\f\17\16\17\u0185\13\17\5\17\u0187\n\17\3\20\7\20\u018a\n\20\f\20"+
		"\16\20\u018d\13\20\3\20\3\20\3\21\3\21\5\21\u0193\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u019b\n\22\3\23\5\23\u019e\n\23\3\23\5\23\u01a1\n"+
		"\23\3\23\3\23\5\23\u01a5\n\23\3\23\5\23\u01a8\n\23\3\23\5\23\u01ab\n\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u01b4\n\25\f\25\16\25\u01b7\13"+
		"\25\3\25\3\25\3\25\5\25\u01bc\n\25\3\25\3\25\3\25\3\25\5\25\u01c2\n\25"+
		"\5\25\u01c4\n\25\3\26\3\26\5\26\u01c8\n\26\3\26\5\26\u01cb\n\26\3\26\5"+
		"\26\u01ce\n\26\3\27\3\27\3\27\5\27\u01d3\n\27\3\27\3\27\3\27\5\27\u01d8"+
		"\n\27\3\27\5\27\u01db\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01e3\n"+
		"\30\3\30\7\30\u01e6\n\30\f\30\16\30\u01e9\13\30\3\30\5\30\u01ec\n\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u01f5\n\31\3\31\3\31\5\31\u01f9"+
		"\n\31\3\31\3\31\3\31\5\31\u01fe\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\7\32\u0207\n\32\f\32\16\32\u020a\13\32\3\32\3\32\5\32\u020e\n\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u0215\n\32\3\32\5\32\u0218\n\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0224\n\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u022c\n\33\5\33\u022e\n\33\3\34\3\34\3\34\3\34\5"+
		"\34\u0234\n\34\3\34\3\34\3\34\3\34\3\34\5\34\u023b\n\34\3\35\3\35\3\35"+
		"\3\35\5\35\u0241\n\35\3\35\3\35\5\35\u0245\n\35\3\36\3\36\3\36\3\36\5"+
		"\36\u024b\n\36\3\36\3\36\3\36\7\36\u0250\n\36\f\36\16\36\u0253\13\36\3"+
		"\36\5\36\u0256\n\36\3\37\3\37\3\37\3\37\5\37\u025c\n\37\3\37\3\37\3\37"+
		"\5\37\u0261\n\37\3\37\3\37\3\37\3\37\3\37\5\37\u0268\n\37\3\37\5\37\u026b"+
		"\n\37\3 \3 \3 \5 \u0270\n \3!\3!\3!\3!\5!\u0276\n!\3!\5!\u0279\n!\3\""+
		"\3\"\3\"\3#\3#\3#\5#\u0281\n#\3$\3$\5$\u0285\n$\3$\5$\u0288\n$\3%\3%\3"+
		"%\5%\u028d\n%\3&\3&\3&\3&\5&\u0293\n&\3&\7&\u0296\n&\f&\16&\u0299\13&"+
		"\3&\3&\3\'\3\'\5\'\u029f\n\'\3(\3(\3(\3(\5(\u02a5\n(\3(\5(\u02a8\n(\3"+
		")\3)\5)\u02ac\n)\3)\5)\u02af\n)\3*\3*\5*\u02b3\n*\3*\3*\3*\3*\3+\3+\3"+
		"+\3+\3+\3+\5+\u02bf\n+\3+\5+\u02c2\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\5+\u02d0\n+\3+\5+\u02d3\n+\3+\3+\3+\3+\3+\5+\u02da\n+\5+\u02dc\n"+
		"+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\5,\u02f6\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u0308"+
		"\n,\f,\16,\u030b\13,\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\5/\u031b"+
		"\n/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\5\62\u0324\n\62\3\62\3\62\3\62"+
		"\7\62\u0329\n\62\f\62\16\62\u032c\13\62\3\63\3\63\3\63\3\63\3\63\5\63"+
		"\u0333\n\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\5\64\u033c\n\64\3\64\3"+
		"\64\5\64\u0340\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u034a"+
		"\n\64\3\65\3\65\3\65\7\65\u034f\n\65\f\65\16\65\u0352\13\65\3\66\3\66"+
		"\3\66\7\66\u0357\n\66\f\66\16\66\u035a\13\66\3\67\3\67\3\67\7\67\u035f"+
		"\n\67\f\67\16\67\u0362\13\67\38\58\u0365\n8\38\38\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u0380\n9\39\39\3"+
		"9\39\39\39\39\59\u0389\n9\39\39\39\39\59\u038f\n9\39\39\39\39\59\u0395"+
		"\n9\39\39\39\39\59\u039b\n9\39\39\39\39\39\39\59\u03a3\n9\39\39\39\39"+
		"\79\u03a9\n9\f9\169\u03ac\139\3:\3:\3:\3:\3:\5:\u03b3\n:\3:\7:\u03b6\n"+
		":\f:\16:\u03b9\13:\3;\3;\5;\u03bd\n;\3;\3;\5;\u03c1\n;\3;\3;\3;\3;\3;"+
		"\6;\u03c8\n;\r;\16;\u03c9\5;\u03cc\n;\3<\3<\5<\u03d0\n<\3<\5<\u03d3\n"+
		"<\3<\3<\3<\5<\u03d8\n<\3<\3<\3<\3<\7<\u03de\n<\f<\16<\u03e1\13<\5<\u03e3"+
		"\n<\3<\3<\5<\u03e7\n<\3<\3<\3<\3<\3<\7<\u03ee\n<\f<\16<\u03f1\13<\3<\3"+
		"<\5<\u03f5\n<\3<\3<\3<\3<\3<\3<\3<\7<\u03fe\n<\f<\16<\u0401\13<\3<\3<"+
		"\5<\u0405\n<\3<\3<\5<\u0409\n<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3?\3?\7?\u0416"+
		"\n?\f?\16?\u0419\13?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u0424\n?\5?\u0426\n"+
		"?\3@\3@\3@\3@\3@\3@\5@\u042e\n@\3@\3@\3@\3@\3@\3@\5@\u0436\n@\3@\5@\u0439"+
		"\n@\5@\u043b\n@\3A\3A\3A\3A\3A\5A\u0442\nA\3B\3B\5B\u0446\nB\3B\3B\3B"+
		"\3B\5B\u044c\nB\3C\3C\3D\3D\3D\3D\3D\7D\u0455\nD\fD\16D\u0458\13D\3D\3"+
		"D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\7E\u046a\nE\fE\16E\u046d\13"+
		"E\3E\3E\3E\3E\3E\5E\u0474\nE\3F\3F\3F\3F\5F\u047a\nF\3G\3G\3G\7G\u047f"+
		"\nG\fG\16G\u0482\13G\3H\3H\3H\5H\u0487\nH\3H\3H\3H\5H\u048c\nH\3H\3H\3"+
		"H\3H\3H\3H\5H\u0494\nH\3H\5H\u0497\nH\5H\u0499\nH\3I\3I\3I\3I\3J\3J\3"+
		"J\3J\3J\5J\u04a4\nJ\3K\3K\7K\u04a8\nK\fK\16K\u04ab\13K\3L\3L\5L\u04af"+
		"\nL\3L\3L\3L\5L\u04b4\nL\5L\u04b6\nL\5L\u04b8\nL\3M\3M\3M\3M\3M\3M\3M"+
		"\3M\3N\5N\u04c3\nN\3N\3N\5N\u04c7\nN\5N\u04c9\nN\3N\5N\u04cc\nN\3N\3N"+
		"\3N\3N\5N\u04d2\nN\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u04e1\nN"+
		"\3N\5N\u04e4\nN\3N\5N\u04e7\nN\5N\u04e9\nN\3O\3O\3P\3P\3P\3P\3P\3P\3P"+
		"\3P\7P\u04f5\nP\fP\16P\u04f8\13P\3P\5P\u04fb\nP\3P\3P\3Q\3Q\3Q\3Q\3R\3"+
		"R\3R\3R\3R\5R\u0508\nR\3S\3S\3S\5S\u050d\nS\3T\3T\3U\5U\u0512\nU\3U\3"+
		"U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Y\3Y\7Y\u0520\nY\fY\16Y\u0523\13Y\3Y\3Y\3Z"+
		"\3Z\5Z\u0529\nZ\3[\3[\3[\3[\3[\3[\3[\3[\3[\7[\u0534\n[\f[\16[\u0537\13"+
		"[\3\\\3\\\3\\\7\\\u053c\n\\\f\\\16\\\u053f\13\\\3]\3]\3]\3]\3]\3]\3]\6"+
		"]\u0548\n]\r]\16]\u0549\3]\3]\5]\u054e\n]\3]\3]\3]\3]\3]\3]\3]\3]\6]\u0558"+
		"\n]\r]\16]\u0559\3]\3]\5]\u055e\n]\3]\3]\5]\u0562\n]\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u0576\n^\3_\3_\3_\3_\3_\3_\3"+
		"_\3_\3_\3_\3_\3_\5_\u0584\n_\3`\3`\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\5"+
		"a\u0593\na\3b\3b\3b\3b\3b\3b\5b\u059b\nb\3c\3c\3c\3c\3c\3c\3c\3c\3c\5"+
		"c\u05a6\nc\3c\3c\3d\3d\3d\3d\3d\3d\3d\5d\u05b1\nd\3d\3d\3e\3e\3e\3e\3"+
		"e\7e\u05ba\ne\fe\16e\u05bd\13e\3e\3e\3f\3f\3f\3f\3f\3f\3f\3f\3f\3g\3g"+
		"\3g\3g\3g\3g\3g\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\5h\u05db\nh\3i\3i\3i\3j"+
		"\3j\3j\3j\3j\3j\3j\3j\3j\3k\5k\u05ea\nk\3k\3k\3k\3k\3k\3l\5l\u05f2\nl"+
		"\3l\3l\3l\3l\3l\3l\3l\3m\3m\3m\3m\3n\3n\3n\3n\3n\3o\3o\3o\3o\3o\5o\u0609"+
		"\no\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u061f"+
		"\no\3o\3o\3o\3o\3o\5o\u0626\no\3o\3o\3o\3o\3o\5o\u062d\no\3o\3o\3o\3o"+
		"\3o\5o\u0634\no\3o\3o\3o\3o\3o\5o\u063b\no\3o\3o\3o\3o\3o\5o\u0642\no"+
		"\3o\3o\3o\3o\3o\5o\u0649\no\3o\3o\3o\3o\3o\5o\u0650\no\3o\3o\3o\3o\5o"+
		"\u0656\no\3o\3o\5o\u065a\no\3o\3o\3o\3o\3o\5o\u0661\no\3o\3o\3o\3o\5o"+
		"\u0667\no\3o\3o\5o\u066b\no\5o\u066d\no\3p\5p\u0670\np\3p\3p\3q\3q\3q"+
		"\3q\3r\3r\3r\5r\u067b\nr\3r\5r\u067e\nr\3r\5r\u0681\nr\3r\3r\3s\3s\3s"+
		"\3t\3t\3t\3t\3t\3t\5t\u068e\nt\3u\3u\5u\u0692\nu\3v\3v\3v\3v\3v\3v\5v"+
		"\u069a\nv\3w\3w\3w\3w\5w\u06a0\nw\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\5x\u06ac"+
		"\nx\3x\3x\3x\3x\3x\5x\u06b3\nx\3x\3x\3y\3y\3y\5y\u06ba\ny\3y\3y\3z\3z"+
		"\3z\5z\u06c1\nz\3z\3z\3{\3{\3{\5{\u06c8\n{\3{\3{\3{\3{\3{\5{\u06cf\n{"+
		"\3{\3{\3|\3|\5|\u06d5\n|\3}\3}\3}\5}\u06da\n}\3}\3}\3~\3~\3~\7~\u06e1"+
		"\n~\f~\16~\u06e4\13~\3\177\3\177\3\u0080\3\u0080\5\u0080\u06ea\n\u0080"+
		"\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\5\u0083\u06f1\n\u0083\3\u0083"+
		"\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085"+
		"\u06fc\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\5\u0086\u0718\n\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\5\u0086\u074f\n\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\5\u0086\u0755\n\u0086\3\u0086\5\u0086\u0758\n\u0086\5\u0086\u075a"+
		"\n\u0086\3\u0087\3\u0087\5\u0087\u075e\n\u0087\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\5\u0088\u0764\n\u0088\3\u0088\3\u0088\5\u0088\u0768\n\u0088\3"+
		"\u0088\3\u0088\5\u0088\u076c\n\u0088\3\u0089\5\u0089\u076f\n\u0089\3\u0089"+
		"\3\u0089\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0779"+
		"\n\u008b\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\5\u008d\u078c\n\u008d\3\u008e\3\u008e\3\u008e\2\4Vp\u008f\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\2\'\4\2\62\62\u00a5"+
		"\u00a5\5\2\u00b6\u00b6\u00f5\u00f5\u013f\u013f\4\2\63\63\u00a6\u00a6\3"+
		"\2\u0324\u0325\3\2\u0321\u0323\5\2\u031a\u031a\u0324\u0325\u0327\u032c"+
		"\7\2\u0133\u0133\u0138\u0138\u01cd\u01cd\u01cf\u01cf\u02b3\u02b4\5\2\6"+
		"\6\t\t\u00b1\u00b1\4\2mm\u009e\u009e\4\2\6\6<<\4\2\u022a\u022a\u022d\u022d"+
		"\4\2\u0155\u0155\u01d1\u01d1\4\2\f\f99\4\2ZZ\u0085\u0085\5\2ZZqq\u0115"+
		"\u0115\4\2]]\u022c\u022c\4\2ww\u0304\u0305\5\2UUll\u009d\u009d\7\2ZZq"+
		"q\u00ac\u00ac\u01b3\u01b3\u0222\u0222\4\2\u0305\u0305\u0307\u0307\3\2"+
		"\u0305\u0306\26\2\37\37\u0102\u0102\u0115\u0116\u0152\u0152\u0158\u0158"+
		"\u0167\u0167\u0185\u0186\u0196\u0197\u01a4\u01a4\u01b8\u01b8\u01bf\u01c0"+
		"\u021e\u0221\u022f\u022f\u026f\u026f\u0281\u0283\u0293\u0293\u02a5\u02a5"+
		"\u02aa\u02ac\u02f2\u02f2\u02f7\u02f7\27\2()ZZ``rr\u00a2\u00a2\u00b2\u00b3"+
		"\u00ed\u00ed\u00ef\u00ef\u01ac\u01ac\u01b7\u01b7\u01bc\u01be\u0225\u0225"+
		"\u023a\u023a\u024d\u024d\u0259\u0259\u025d\u025d\u027b\u027b\u0284\u0285"+
		"\u02af\u02af\u02b1\u02b2\u02f5\u02f7L\2))eellxx\u009d\u009d\u00b2\u00b3"+
		"\u00c1\u00c1\u00db\u00df\u00e3\u00e4\u00e6\u00e7\u00e9\u00ec\u00ee\u00ef"+
		"\u00f1\u00f1\u0100\u0100\u0112\u0112\u0118\u0119\u011c\u011e\u0128\u012d"+
		"\u0139\u0139\u0140\u0140\u0143\u0143\u0147\u0147\u0154\u0154\u0158\u0159"+
		"\u0161\u0162\u0164\u0164\u0170\u0170\u0176\u0176\u0178\u017a\u0189\u018b"+
		"\u018e\u018f\u01a5\u01a5\u01ac\u01ac\u01af\u01af\u01bb\u01bb\u01ca\u01ca"+
		"\u01e3\u01e3\u01f0\u01f2\u01f4\u01f5\u01f8\u01f9\u01fc\u01fc\u01fe\u01ff"+
		"\u020d\u020d\u0214\u021c\u0223\u0223\u0229\u0229\u022b\u022b\u023a\u023e"+
		"\u0241\u0243\u024c\u024c\u0257\u0257\u0259\u025a\u025c\u025c\u0260\u0260"+
		"\u0262\u0262\u0269\u0269\u026c\u026c\u0270\u0270\u0276\u0279\u027d\u027d"+
		"\u027f\u0280\u0284\u0285\u029b\u029d\u02ae\u02af\u02b1\u02b2\u02bd\u02bd"+
		"\u02bf\u02c7\u02ca\u02cb\u02cf\u02d1\u02d7\u02d9\u02e1\u02e1\u02e7\u02e7"+
		"\u02f0\u02f0\u02fc\u02fcr\2\n\n\r\r\u0092\u0092\u00d7\u00d7\u00d9\u00da"+
		"\u00df\u00df\u00e1\u00e2\u00e5\u00e5\u00e8\u00e8\u00ee\u00ee\u00f0\u00f0"+
		"\u00f2\u00f4\u00f9\u00f9\u00fc\u00ff\u0101\u0101\u0103\u0103\u0105\u0105"+
		"\u0108\u010b\u010d\u010e\u0111\u0112\u011b\u011b\u011f\u011f\u0122\u0122"+
		"\u0124\u0124\u0126\u0126\u0133\u0137\u013a\u013a\u013e\u013e\u0145\u0147"+
		"\u014a\u014a\u014d\u014f\u0156\u0156\u015b\u015d\u016a\u016b\u016d\u016f"+
		"\u0173\u0173\u017b\u017e\u0180\u0184\u0187\u0188\u018b\u018d\u0190\u0195"+
		"\u0198\u019b\u01a0\u01a0\u01a3\u01a3\u01a5\u01a5\u01a7\u01a8\u01af\u01b1"+
		"\u01b4\u01b6\u01b8\u01ba\u01c2\u01c2\u01c4\u01c4\u01c6\u01c6\u01c9\u01c9"+
		"\u01cd\u01ce\u01d0\u01d0\u01d2\u01d3\u01d7\u01d7\u01dc\u01dc\u01e0\u01e0"+
		"\u01e4\u01e4\u01ee\u01ef\u01f4\u01f5\u01f9\u01fb\u01fd\u01fd\u0202\u0203"+
		"\u0205\u020a\u0226\u0226\u0229\u0229\u022b\u022b\u022f\u022f\u0231\u0231"+
		"\u0235\u0236\u0239\u0239\u023f\u0240\u0244\u0245\u024a\u024a\u0253\u0253"+
		"\u0258\u0258\u025b\u025b\u025f\u025f\u0261\u0261\u0264\u0265\u0268\u0268"+
		"\u026b\u026b\u026d\u026d\u0271\u0275\u0277\u0279\u027c\u027d\u0286\u0286"+
		"\u028b\u028b\u028e\u028e\u0294\u0296\u02a1\u02a4\u02a8\u02a9\u02ae\u02ae"+
		"\u02b0\u02b0\u02b3\u02b3\u02b5\u02bc\u02be\u02be\u02c8\u02c9\u02cc\u02ce"+
		"\u02d2\u02d4\u02d6\u02d6\u02da\u02e0\u02e2\u02e6\u02e8\u02ef\u02f1\u02f1"+
		"\u02f3\u02f5\u02f8\u02fb\u02fe\u02fe\u0308\u0308\u0327\u0328\5\2\u017e"+
		"\u017e\u02db\u02dc\u02de\u02df\3\2\u02bf\u02c7\32\2-\60\62\62\u00ad\u00ad"+
		"\u00b5\u00b5\u00ca\u00ca\u0113\u0113\u0123\u0123\u0125\u0125\u0142\u0142"+
		"\u0163\u0163\u019f\u019f\u01a1\u01a1\u01aa\u01ab\u01db\u01db\u01f3\u01f3"+
		"\u01f6\u01f6\u020a\u020b\u024f\u024f\u0263\u0263\u026a\u026a\u027a\u027a"+
		"\u0287\u0288\u0291\u0291\u029f\u029f\4\2\u020c\u020c\u022d\u022d\4\2{"+
		"{}}\4\2\36\36uu\4\2KK\u00c0\u00c0\4\2\u01c3\u01c3\u0305\u0305\3\2\u0309"+
		"\u030a\4\2\u0305\u0305\u0309\u0309\36\2<<ll\u009d\u009d\u00df\u00df\u00e1"+
		"\u00e1\u010b\u010b\u0112\u0112\u0120\u0120\u0126\u0126\u0133\u0137\u013a"+
		"\u013a\u013e\u013e\u016a\u016a\u016f\u016f\u01a5\u01a5\u01bb\u01bb\u01c6"+
		"\u01c6\u01c9\u01ca\u01cd\u01ce\u01ff\u01ff\u0231\u0231\u0235\u0235\u0265"+
		"\u0265\u0268\u0268\u026b\u026b\u029b\u029b\u02a1\u02a1\u0306\u0306\3\2"+
		"\u030f\u0316\u087d\2\u0129\3\2\2\2\4\u012b\3\2\2\2\6\u0144\3\2\2\2\b\u014b"+
		"\3\2\2\2\n\u0150\3\2\2\2\f\u0156\3\2\2\2\16\u015a\3\2\2\2\20\u0164\3\2"+
		"\2\2\22\u0166\3\2\2\2\24\u016a\3\2\2\2\26\u0172\3\2\2\2\30\u0177\3\2\2"+
		"\2\32\u017a\3\2\2\2\34\u0186\3\2\2\2\36\u018b\3\2\2\2 \u0192\3\2\2\2\""+
		"\u019a\3\2\2\2$\u019d\3\2\2\2&\u01ac\3\2\2\2(\u01af\3\2\2\2*\u01c7\3\2"+
		"\2\2,\u01da\3\2\2\2.\u01dc\3\2\2\2\60\u01ef\3\2\2\2\62\u01ff\3\2\2\2\64"+
		"\u022d\3\2\2\2\66\u022f\3\2\2\28\u023c\3\2\2\2:\u0246\3\2\2\2<\u026a\3"+
		"\2\2\2>\u026c\3\2\2\2@\u0271\3\2\2\2B\u027a\3\2\2\2D\u027d\3\2\2\2F\u0282"+
		"\3\2\2\2H\u0289\3\2\2\2J\u028e\3\2\2\2L\u029e\3\2\2\2N\u02a0\3\2\2\2P"+
		"\u02ab\3\2\2\2R\u02b2\3\2\2\2T\u02db\3\2\2\2V\u02f5\3\2\2\2X\u030c\3\2"+
		"\2\2Z\u0310\3\2\2\2\\\u031a\3\2\2\2^\u031c\3\2\2\2`\u031e\3\2\2\2b\u0320"+
		"\3\2\2\2d\u032d\3\2\2\2f\u0349\3\2\2\2h\u034b\3\2\2\2j\u0353\3\2\2\2l"+
		"\u035b\3\2\2\2n\u0364\3\2\2\2p\u03a2\3\2\2\2r\u03b2\3\2\2\2t\u03c0\3\2"+
		"\2\2v\u03cd\3\2\2\2x\u040a\3\2\2\2z\u040d\3\2\2\2|\u0410\3\2\2\2~\u043a"+
		"\3\2\2\2\u0080\u043c\3\2\2\2\u0082\u0443\3\2\2\2\u0084\u044d\3\2\2\2\u0086"+
		"\u044f\3\2\2\2\u0088\u0473\3\2\2\2\u008a\u0475\3\2\2\2\u008c\u047b\3\2"+
		"\2\2\u008e\u0498\3\2\2\2\u0090\u049a\3\2\2\2\u0092\u04a3\3\2\2\2\u0094"+
		"\u04a5\3\2\2\2\u0096\u04b7\3\2\2\2\u0098\u04b9\3\2\2\2\u009a\u04e8\3\2"+
		"\2\2\u009c\u04ea\3\2\2\2\u009e\u04ec\3\2\2\2\u00a0\u04fe\3\2\2\2\u00a2"+
		"\u0507\3\2\2\2\u00a4\u050c\3\2\2\2\u00a6\u050e\3\2\2\2\u00a8\u0511\3\2"+
		"\2\2\u00aa\u0515\3\2\2\2\u00ac\u0517\3\2\2\2\u00ae\u0519\3\2\2\2\u00b0"+
		"\u051b\3\2\2\2\u00b2\u0528\3\2\2\2\u00b4\u052a\3\2\2\2\u00b6\u0538\3\2"+
		"\2\2\u00b8\u0561\3\2\2\2\u00ba\u0575\3\2\2\2\u00bc\u0583\3\2\2\2\u00be"+
		"\u0585\3\2\2\2\u00c0\u0592\3\2\2\2\u00c2\u059a\3\2\2\2\u00c4\u059c\3\2"+
		"\2\2\u00c6\u05a9\3\2\2\2\u00c8\u05b4\3\2\2\2\u00ca\u05c0\3\2\2\2\u00cc"+
		"\u05c9\3\2\2\2\u00ce\u05da\3\2\2\2\u00d0\u05dc\3\2\2\2\u00d2\u05df\3\2"+
		"\2\2\u00d4\u05e9\3\2\2\2\u00d6\u05f1\3\2\2\2\u00d8\u05fa\3\2\2\2\u00da"+
		"\u05fe\3\2\2\2\u00dc\u066c\3\2\2\2\u00de\u066f\3\2\2\2\u00e0\u0673\3\2"+
		"\2\2\u00e2\u0677\3\2\2\2\u00e4\u0684\3\2\2\2\u00e6\u068d\3\2\2\2\u00e8"+
		"\u0691\3\2\2\2\u00ea\u0699\3\2\2\2\u00ec\u069f\3\2\2\2\u00ee\u06b2\3\2"+
		"\2\2\u00f0\u06b9\3\2\2\2\u00f2\u06c0\3\2\2\2\u00f4\u06ce\3\2\2\2\u00f6"+
		"\u06d4\3\2\2\2\u00f8\u06d9\3\2\2\2\u00fa\u06dd\3\2\2\2\u00fc\u06e5\3\2"+
		"\2\2\u00fe\u06e9\3\2\2\2\u0100\u06eb\3\2\2\2\u0102\u06ed\3\2\2\2\u0104"+
		"\u06f0\3\2\2\2\u0106\u06f4\3\2\2\2\u0108\u06fb\3\2\2\2\u010a\u0759\3\2"+
		"\2\2\u010c\u075d\3\2\2\2\u010e\u076b\3\2\2\2\u0110\u076e\3\2\2\2\u0112"+
		"\u0772\3\2\2\2\u0114\u0778\3\2\2\2\u0116\u077a\3\2\2\2\u0118\u078b\3\2"+
		"\2\2\u011a\u078d\3\2\2\2\u011c\u012a\5$\23\2\u011d\u012a\5&\24\2\u011e"+
		"\u012a\5\4\3\2\u011f\u012a\5\6\4\2\u0120\u012a\5\b\5\2\u0121\u012a\5\n"+
		"\6\2\u0122\u012a\5\16\b\2\u0123\u012a\5\20\t\2\u0124\u012a\5.\30\2\u0125"+
		"\u012a\5\60\31\2\u0126\u012a\5\62\32\2\u0127\u012a\58\35\2\u0128\u012a"+
		"\5:\36\2\u0129\u011c\3\2\2\2\u0129\u011d\3\2\2\2\u0129\u011e\3\2\2\2\u0129"+
		"\u011f\3\2\2\2\u0129\u0120\3\2\2\2\u0129\u0121\3\2\2\2\u0129\u0122\3\2"+
		"\2\2\u0129\u0123\3\2\2\2\u0129\u0124\3\2\2\2\u0129\u0125\3\2\2\2\u0129"+
		"\u0126\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a\3\3\2\2\2"+
		"\u012b\u012c\7*\2\2\u012c\u0130\7\3\2\2\u012d\u012e\7`\2\2\u012e\u012f"+
		"\7v\2\2\u012f\u0131\7H\2\2\u0130\u012d\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0133\5\u00f0y\2\u0133\u0134\7T\2\2\u0134\u013a\5"+
		"\u00f0y\2\u0135\u0136\7\u032d\2\2\u0136\u0137\5\u00fc\177\2\u0137\u0138"+
		"\7\u032e\2\2\u0138\u0139\5\u00fc\177\2\u0139\u013b\3\2\2\2\u013a\u0135"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013d\7\u01c5\2"+
		"\2\u013d\u013f\5\f\7\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0142"+
		"\3\2\2\2\u0140\u0141\7\u0091\2\2\u0141\u0143\7\u0309\2\2\u0142\u0140\3"+
		"\2\2\2\u0142\u0143\3\2\2\2\u0143\5\3\2\2\2\u0144\u0145\7?\2\2\u0145\u0146"+
		"\7\3\2\2\u0146\u0149\5\u00f0y\2\u0147\u0148\7}\2\2\u0148\u014a\5\u00f0"+
		"y\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\7\3\2\2\2\u014b\u014c"+
		"\7?\2\2\u014c\u014d\7\6\2\2\u014d\u014e\7\4\2\2\u014e\u014f\5\u00f0y\2"+
		"\u014f\t\3\2\2\2\u0150\u0151\7\u032f\2\2\u0151\u0152\7\4\2\2\u0152\13"+
		"\3\2\2\2\u0153\u0157\5\34\17\2\u0154\u0157\7Z\2\2\u0155\u0157\7\u0330"+
		"\2\2\u0156\u0153\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157"+
		"\r\3\2\2\2\u0158\u015b\5\26\f\2\u0159\u015b\5\30\r\2\u015a\u0158\3\2\2"+
		"\2\u015a\u0159\3\2\2\2\u015b\17\3\2\2\2\u015c\u0165\5> \2\u015d\u0165"+
		"\5@!\2\u015e\u0165\5B\"\2\u015f\u0165\5D#\2\u0160\u0165\5F$\2\u0161\u0165"+
		"\5H%\2\u0162\u0165\5\22\n\2\u0163\u0165\5\24\13\2\u0164\u015c\3\2\2\2"+
		"\u0164\u015d\3\2\2\2\u0164\u015e\3\2\2\2\u0164\u015f\3\2\2\2\u0164\u0160"+
		"\3\2\2\2\u0164\u0161\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165"+
		"\21\3\2\2\2\u0166\u0167\7*\2\2\u0167\u0168\t\2\2\2\u0168\u0169\5\u0114"+
		"\u008b\2\u0169\23\3\2\2\2\u016a\u016b\7?\2\2\u016b\u016e\t\2\2\2\u016c"+
		"\u016d\7`\2\2\u016d\u016f\7H\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2"+
		"\2\u016f\u0170\3\2\2\2\u0170\u0171\5\u0114\u008b\2\u0171\25\3\2\2\2\u0172"+
		"\u0173\7\u00ae\2\2\u0173\u0174\5\32\16\2\u0174\u0175\7\u030b\2\2\u0175"+
		"\u0176\5\34\17\2\u0176\27\3\2\2\2\u0177\u0178\7\u0331\2\2\u0178\u0179"+
		"\5\32\16\2\u0179\31\3\2\2\2\u017a\u017b\7\u0306\2\2\u017b\33\3\2\2\2\u017c"+
		"\u0187\7\u0301\2\2\u017d\u0187\7\u0307\2\2\u017e\u0183\7\u0306\2\2\u017f"+
		"\u0180\7\u031e\2\2\u0180\u0182\7\u0306\2\2\u0181\u017f\3\2\2\2\u0182\u0185"+
		"\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0187\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0186\u017c\3\2\2\2\u0186\u017d\3\2\2\2\u0186\u017e\3\2"+
		"\2\2\u0187\35\3\2\2\2\u0188\u018a\5 \21\2\u0189\u0188\3\2\2\2\u018a\u018d"+
		"\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d"+
		"\u018b\3\2\2\2\u018e\u018f\7\2\2\3\u018f\37\3\2\2\2\u0190\u0193\5\"\22"+
		"\2\u0191\u0193\5\20\t\2\u0192\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193"+
		"!\3\2\2\2\u0194\u019b\5.\30\2\u0195\u019b\5\62\32\2\u0196\u019b\5\64\33"+
		"\2\u0197\u019b\5\66\34\2\u0198\u019b\58\35\2\u0199\u019b\5:\36\2\u019a"+
		"\u0194\3\2\2\2\u019a\u0195\3\2\2\2\u019a\u0196\3\2\2\2\u019a\u0197\3\2"+
		"\2\2\u019a\u0198\3\2\2\2\u019a\u0199\3\2\2\2\u019b#\3\2\2\2\u019c\u019e"+
		"\5b\62\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f"+
		"\u01a1\7\u0149\2\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a4\5r:\2\u01a3\u01a5\5|?\2\u01a4\u01a3\3\2\2\2\u01a4"+
		"\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a8\5z>\2\u01a7\u01a6\3\2\2"+
		"\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01ab\7\u031f\2\2\u01aa"+
		"\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab%\3\2\2\2\u01ac\u01ad\7\u0332"+
		"\2\2\u01ad\u01ae\5$\23\2\u01ae\'\3\2\2\2\u01af\u01b0\7\u01ea\2\2\u01b0"+
		"\u01b5\5*\26\2\u01b1\u01b2\7\u031e\2\2\u01b2\u01b4\5*\26\2\u01b3\u01b1"+
		"\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01c3\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01bb\7g\2\2\u01b9\u01bc\7\u0304"+
		"\2\2\u01ba\u01bc\5\u00f0y\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bc"+
		"\u01c1\3\2\2\2\u01bd\u01be\7\u031c\2\2\u01be\u01bf\5\u00fa~\2\u01bf\u01c0"+
		"\7\u031d\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bd\3\2\2\2\u01c1\u01c2\3\2\2"+
		"\2\u01c2\u01c4\3\2\2\2\u01c3\u01b8\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4)"+
		"\3\2\2\2\u01c5\u01c8\5,\27\2\u01c6\u01c8\5V,\2\u01c7\u01c5\3\2\2\2\u01c7"+
		"\u01c6\3\2\2\2\u01c8\u01cd\3\2\2\2\u01c9\u01cb\7\13\2\2\u01ca\u01c9\3"+
		"\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\5\u00b2Z\2"+
		"\u01cd\u01ca\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce+\3\2\2\2\u01cf\u01d3\7"+
		"\u013c\2\2\u01d0\u01d3\7\u0175\2\2\u01d1\u01d3\5\u00f0y\2\u01d2\u01cf"+
		"\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"\u01d7\7\u0317\2\2\u01d5\u01d8\7\u0321\2\2\u01d6\u01d8\5\u00fc\177\2\u01d7"+
		"\u01d5\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01db\7\u02fd"+
		"\2\2\u01da\u01d2\3\2\2\2\u01da\u01d9\3\2\2\2\u01db-\3\2\2\2\u01dc\u01dd"+
		"\7*\2\2\u01dd\u01de\7\u00b6\2\2\u01de\u01df\5\u00f0y\2\u01df\u01e0\7\u031c"+
		"\2\2\u01e0\u01e7\5L\'\2\u01e1\u01e3\7\u031e\2\2\u01e2\u01e1\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\5L\'\2\u01e5\u01e2\3\2"+
		"\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01ec\7\u031e\2\2\u01eb\u01ea"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\7\u031d\2"+
		"\2\u01ee/\3\2\2\2\u01ef\u01f0\7*\2\2\u01f0\u01f4\7\u00b6\2\2\u01f1\u01f2"+
		"\7`\2\2\u01f2\u01f3\7v\2\2\u01f3\u01f5\7H\2\2\u01f4\u01f1\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\5\u00f0y\2\u01f7\u01f9"+
		"\7\u0256\2\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2"+
		"\2\u01fa\u01fb\7\13\2\2\u01fb\u01fd\5$\23\2\u01fc\u01fe\7\u031f\2\2\u01fd"+
		"\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\61\3\2\2\2\u01ff\u0200\7*\2\2"+
		"\u0200\u0201\7\u00cd\2\2\u0201\u020d\5\u00f2z\2\u0202\u0203\7\u031c\2"+
		"\2\u0203\u0208\5\u00fc\177\2\u0204\u0205\7\u031e\2\2\u0205\u0207\5\u00fc"+
		"\177\2\u0206\u0204\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020c\7\u031d"+
		"\2\2\u020c\u020e\3\2\2\2\u020d\u0202\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020f\u0210\7\13\2\2\u0210\u0214\5$\23\2\u0211\u0212\7"+
		"\u00d2\2\2\u0212\u0213\7\33\2\2\u0213\u0215\7\u0083\2\2\u0214\u0211\3"+
		"\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0218\7\u031f\2\2"+
		"\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\63\3\2\2\2\u0219\u021a"+
		"\7\7\2\2\u021a\u021b\7\u00b6\2\2\u021b\u021c\5\u00f0y\2\u021c\u021d\7"+
		"\u00ae\2\2\u021d\u021e\7\u031c\2\2\u021e\u021f\7\u01ae\2\2\u021f\u0220"+
		"\7\u030b\2\2\u0220\u0221\t\3\2\2\u0221\u0223\7\u031d\2\2\u0222\u0224\7"+
		"\u031f\2\2\u0223\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u022e\3\2\2\2"+
		"\u0225\u0226\7\7\2\2\u0226\u0227\7\u00b6\2\2\u0227\u0228\5\u00f0y\2\u0228"+
		"\u0229\7\5\2\2\u0229\u022b\5L\'\2\u022a\u022c\7\u031f\2\2\u022b\u022a"+
		"\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e\3\2\2\2\u022d\u0219\3\2\2\2\u022d"+
		"\u0225\3\2\2\2\u022e\65\3\2\2\2\u022f\u0230\7\7\2\2\u0230\u0233\7\62\2"+
		"\2\u0231\u0234\5\u0114\u008b\2\u0232\u0234\7,\2\2\u0233\u0231\3\2\2\2"+
		"\u0233\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\7\u01cb\2\2\u0236"+
		"\u0237\7\u01d4\2\2\u0237\u0238\7\u030b\2\2\u0238\u023a\5\u0114\u008b\2"+
		"\u0239\u023b\7\u031f\2\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\67\3\2\2\2\u023c\u023d\7?\2\2\u023d\u0240\7\u00b6\2\2\u023e\u023f\7`"+
		"\2\2\u023f\u0241\7H\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0242\3\2\2\2\u0242\u0244\5\u00f0y\2\u0243\u0245\7\u031f\2\2\u0244\u0243"+
		"\3\2\2\2\u0244\u0245\3\2\2\2\u02459\3\2\2\2\u0246\u0247\7?\2\2\u0247\u024a"+
		"\7\u00cd\2\2\u0248\u0249\7`\2\2\u0249\u024b\7H\2\2\u024a\u0248\3\2\2\2"+
		"\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u0251\5\u00f2z\2\u024d"+
		"\u024e\7\u031e\2\2\u024e\u0250\5\u00f2z\2\u024f\u024d\3\2\2\2\u0250\u0253"+
		"\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0255\3\2\2\2\u0253"+
		"\u0251\3\2\2\2\u0254\u0256\7\u031f\2\2\u0255\u0254\3\2\2\2\u0255\u0256"+
		"\3\2\2\2\u0256;\3\2\2\2\u0257\u0258\7\u00ae\2\2\u0258\u025b\7\u0304\2"+
		"\2\u0259\u025a\7\u0317\2\2\u025a\u025c\5\u0114\u008b\2\u025b\u0259\3\2"+
		"\2\2\u025b\u025c\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\7\u030b\2\2\u025e"+
		"\u0260\5V,\2\u025f\u0261\7\u031f\2\2\u0260\u025f\3\2\2\2\u0260\u0261\3"+
		"\2\2\2\u0261\u026b\3\2\2\2\u0262\u0263\7\u00ae\2\2\u0263\u0264\7\u0304"+
		"\2\2\u0264\u0265\5\u011a\u008e\2\u0265\u0267\5V,\2\u0266\u0268\7\u031f"+
		"\2\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026b\3\2\2\2\u0269"+
		"\u026b\5T+\2\u026a\u0257\3\2\2\2\u026a\u0262\3\2\2\2\u026a\u0269\3\2\2"+
		"\2\u026b=\3\2\2\2\u026c\u026d\7\u00c9\2\2\u026d\u026f\5\u0114\u008b\2"+
		"\u026e\u0270\7\u031f\2\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270"+
		"?\3\2\2\2\u0271\u0272\7\u032f\2\2\u0272\u0275\7\u00b7\2\2\u0273\u0274"+
		"\7a\2\2\u0274\u0276\5\u0114\u008b\2\u0275\u0273\3\2\2\2\u0275\u0276\3"+
		"\2\2\2\u0276\u0278\3\2\2\2\u0277\u0279\7\u031f\2\2\u0278\u0277\3\2\2\2"+
		"\u0278\u0279\3\2\2\2\u0279A\3\2\2\2\u027a\u027b\7\u032f\2\2\u027b\u027c"+
		"\t\4\2\2\u027cC\3\2\2\2\u027d\u027e\7:\2\2\u027e\u0280\5\u00f0y\2\u027f"+
		"\u0281\7\u031f\2\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281E\3\2"+
		"\2\2\u0282\u0284\7\u0213\2\2\u0283\u0285\5\u0114\u008b\2\u0284\u0283\3"+
		"\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\3\2\2\2\u0286\u0288\7\u031f\2\2"+
		"\u0287\u0286\3\2\2\2\u0287\u0288\3\2\2\2\u0288G\3\2\2\2\u0289\u028a\7"+
		"\u032f\2\2\u028a\u028c\7\u0117\2\2\u028b\u028d\7\u031f\2\2\u028c\u028b"+
		"\3\2\2\2\u028c\u028d\3\2\2\2\u028dI\3\2\2\2\u028e\u028f\7\u00b6\2\2\u028f"+
		"\u0290\7\u031c\2\2\u0290\u0297\5L\'\2\u0291\u0293\7\u031e\2\2\u0292\u0291"+
		"\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0296\5L\'\2\u0295"+
		"\u0292\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2"+
		"\2\2\u0298\u029a\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u029b\7\u031d\2\2\u029b"+
		"K\3\2\2\2\u029c\u029f\5N(\2\u029d\u029f\5R*\2\u029e\u029c\3\2\2\2\u029e"+
		"\u029d\3\2\2\2\u029fM\3\2\2\2\u02a0\u02a4\5\u00fc\177\2\u02a1\u02a5\5"+
		"\u010a\u0086\2\u02a2\u02a3\7\13\2\2\u02a3\u02a5\5V,\2\u02a4\u02a1\3\2"+
		"\2\2\u02a4\u02a2\3\2\2\2\u02a5\u02a7\3\2\2\2\u02a6\u02a8\5\u0104\u0083"+
		"\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8O\3\2\2\2\u02a9\u02aa"+
		"\7$\2\2\u02aa\u02ac\5\u0114\u008b\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3"+
		"\2\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02af\5\u0104\u0083\2\u02ae\u02ad\3\2"+
		"\2\2\u02ae\u02af\3\2\2\2\u02afQ\3\2\2\2\u02b0\u02b1\7$\2\2\u02b1\u02b3"+
		"\5\u0114\u008b\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\3"+
		"\2\2\2\u02b4\u02b5\7\u031c\2\2\u02b5\u02b6\5\u00fa~\2\u02b6\u02b7\7\u031d"+
		"\2\2\u02b7S\3\2\2\2\u02b8\u02b9\7\u00ae\2\2\u02b9\u02be\5\u0114\u008b"+
		"\2\u02ba\u02bf\5\u0114\u008b\2\u02bb\u02bf\5\u010e\u0088\2\u02bc\u02bf"+
		"\7\u0304\2\2\u02bd\u02bf\5\u0100\u0081\2\u02be\u02ba\3\2\2\2\u02be\u02bb"+
		"\3\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bd\3\2\2\2\u02bf\u02c1\3\2\2\2\u02c0"+
		"\u02c2\7\u031f\2\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02dc"+
		"\3\2\2\2\u02c3\u02c4\7\u00ae\2\2\u02c4\u02c5\7\u00be\2\2\u02c5\u02c6\7"+
		"\u017f\2\2\u02c6\u02cf\7\u01a6\2\2\u02c7\u02c8\7\u0093\2\2\u02c8\u02d0"+
		"\7\u028d\2\2\u02c9\u02ca\7\u0093\2\2\u02ca\u02d0\7\u0114\2\2\u02cb\u02cc"+
		"\7\u0224\2\2\u02cc\u02d0\7\u0093\2\2\u02cd\u02d0\7\u0249\2\2\u02ce\u02d0"+
		"\7\u0238\2\2\u02cf\u02c7\3\2\2\2\u02cf\u02c9\3\2\2\2\u02cf\u02cb\3\2\2"+
		"\2\u02cf\u02cd\3\2\2\2\u02cf\u02ce\3\2\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02d3"+
		"\7\u031f\2\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02dc\3\2\2"+
		"\2\u02d4\u02d5\7\u00ae\2\2\u02d5\u02d6\7_\2\2\u02d6\u02d7\5\u00f0y\2\u02d7"+
		"\u02d9\5\u0100\u0081\2\u02d8\u02da\7\u031f\2\2\u02d9\u02d8\3\2\2\2\u02d9"+
		"\u02da\3\2\2\2\u02da\u02dc\3\2\2\2\u02db\u02b8\3\2\2\2\u02db\u02c3\3\2"+
		"\2\2\u02db\u02d4\3\2\2\2\u02dcU\3\2\2\2\u02dd\u02de\b,\1\2\u02de\u02f6"+
		"\7w\2\2\u02df\u02f6\7\u0304\2\2\u02e0\u02f6\5\u010e\u0088\2\u02e1\u02f6"+
		"\5\u0106\u0084\2\u02e2\u02f6\5\u00b8]\2\u02e3\u02f6\5\u00f8}\2\u02e4\u02e5"+
		"\7\u031c\2\2\u02e5\u02e6\5V,\2\u02e6\u02e7\7\u031d\2\2\u02e7\u02f6\3\2"+
		"\2\2\u02e8\u02e9\7\u031c\2\2\u02e9\u02ea\5^\60\2\u02ea\u02eb\7\u031d\2"+
		"\2\u02eb\u02f6\3\2\2\2\u02ec\u02ed\7\u0326\2\2\u02ed\u02f6\5V,\r\u02ee"+
		"\u02ef\t\5\2\2\u02ef\u02f6\5V,\13\u02f0\u02f1\7v\2\2\u02f1\u02f6\5V,\b"+
		"\u02f2\u02f6\5X-\2\u02f3\u02f6\5Z.\2\u02f4\u02f6\5\u00a4S\2\u02f5\u02dd"+
		"\3\2\2\2\u02f5\u02df\3\2\2\2\u02f5\u02e0\3\2\2\2\u02f5\u02e1\3\2\2\2\u02f5"+
		"\u02e2\3\2\2\2\u02f5\u02e3\3\2\2\2\u02f5\u02e4\3\2\2\2\u02f5\u02e8\3\2"+
		"\2\2\u02f5\u02ec\3\2\2\2\u02f5\u02ee\3\2\2\2\u02f5\u02f0\3\2\2\2\u02f5"+
		"\u02f2\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f4\3\2\2\2\u02f6\u0309\3\2"+
		"\2\2\u02f7\u02f8\f\f\2\2\u02f8\u02f9\t\6\2\2\u02f9\u0308\5V,\r\u02fa\u02fb"+
		"\f\n\2\2\u02fb\u02fc\t\7\2\2\u02fc\u0308\5V,\13\u02fd\u02fe\f\t\2\2\u02fe"+
		"\u02ff\5\u0118\u008d\2\u02ff\u0300\5V,\n\u0300\u0308\3\2\2\2\u0301\u0302"+
		"\f\7\2\2\u0302\u0303\7h\2\2\u0303\u0308\5\u0104\u0083\2\u0304\u0305\f"+
		"\3\2\2\u0305\u0306\7 \2\2\u0306\u0308\5\u0114\u008b\2\u0307\u02f7\3\2"+
		"\2\2\u0307\u02fa\3\2\2\2\u0307\u02fd\3\2\2\2\u0307\u0301\3\2\2\2\u0307"+
		"\u0304\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2"+
		"\2\2\u030aW\3\2\2\2\u030b\u0309\3\2\2\2\u030c\u030d\7\u0177\2\2\u030d"+
		"\u030e\5\\/\2\u030e\u030f\t\b\2\2\u030fY\3\2\2\2\u0310\u0311\7\u0126\2"+
		"\2\u0311\u0312\5\\/\2\u0312[\3\2\2\2\u0313\u031b\7w\2\2\u0314\u031b\5"+
		"\u010e\u0088\2\u0315\u031b\7\u0304\2\2\u0316\u0317\7\u031c\2\2\u0317\u0318"+
		"\5\\/\2\u0318\u0319\7\u031d\2\2\u0319\u031b\3\2\2\2\u031a\u0313\3\2\2"+
		"\2\u031a\u0314\3\2\2\2\u031a\u0315\3\2\2\2\u031a\u0316\3\2\2\2\u031b]"+
		"\3\2\2\2\u031c\u031d\5$\23\2\u031d_\3\2\2\2\u031e\u031f\5v<\2\u031fa\3"+
		"\2\2\2\u0320\u0323\7\u00d2\2\2\u0321\u0322\7\u02ad\2\2\u0322\u0324\7\u031e"+
		"\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0325\3\2\2\2\u0325"+
		"\u032a\5d\63\2\u0326\u0327\7\u031e\2\2\u0327\u0329\5d\63\2\u0328\u0326"+
		"\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b"+
		"c\3\2\2\2\u032c\u032a\3\2\2\2\u032d\u0332\5\u0114\u008b\2\u032e\u032f"+
		"\7\u031c\2\2\u032f\u0330\5\u00fa~\2\u0330\u0331\7\u031d\2\2\u0331\u0333"+
		"\3\2\2\2\u0332\u032e\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0334\3\2\2\2\u0334"+
		"\u0335\7\13\2\2\u0335\u0336\7\u031c\2\2\u0336\u0337\5$\23\2\u0337\u0338"+
		"\7\u031d\2\2\u0338e\3\2\2\2\u0339\u033c\5\u00f8}\2\u033a\u033c\7\u0304"+
		"\2\2\u033b\u0339\3\2\2\2\u033b\u033a\3\2\2\2\u033c\u033f\3\2\2\2\u033d"+
		"\u0340\7\u030b\2\2\u033e\u0340\5\u011a\u008e\2\u033f\u033d\3\2\2\2\u033f"+
		"\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u034a\5V,\2\u0342\u0343\5\u0114"+
		"\u008b\2\u0343\u0344\7\u0317\2\2\u0344\u0345\5\u0114\u008b\2\u0345\u0346"+
		"\7\u031c\2\2\u0346\u0347\5\u00b6\\\2\u0347\u0348\7\u031d\2\2\u0348\u034a"+
		"\3\2\2\2\u0349\u033b\3\2\2\2\u0349\u0342\3\2\2\2\u034ag\3\2\2\2\u034b"+
		"\u0350\5j\66\2\u034c\u034d\7\u031e\2\2\u034d\u034f\5j\66\2\u034e\u034c"+
		"\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351"+
		"i\3\2\2\2\u0352\u0350\3\2\2\2\u0353\u0358\5l\67\2\u0354\u0355\7\b\2\2"+
		"\u0355\u0357\5l\67\2\u0356\u0354\3\2\2\2\u0357\u035a\3\2\2\2\u0358\u0356"+
		"\3\2\2\2\u0358\u0359\3\2\2\2\u0359k\3\2\2\2\u035a\u0358\3\2\2\2\u035b"+
		"\u0360\5n8\2\u035c\u035d\7\u0084\2\2\u035d\u035f\5n8\2\u035e\u035c\3\2"+
		"\2\2\u035f\u0362\3\2\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361"+
		"m\3\2\2\2\u0362\u0360\3\2\2\2\u0363\u0365\7v\2\2\u0364\u0363\3\2\2\2\u0364"+
		"\u0365\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0367\5p9\2\u0367o\3\2\2\2\u0368"+
		"\u0369\b9\1\2\u0369\u036a\7H\2\2\u036a\u036b\7\u031c\2\2\u036b\u036c\5"+
		"^\60\2\u036c\u036d\7\u031d\2\2\u036d\u03a3\3\2\2\2\u036e\u036f\7\u031c"+
		"\2\2\u036f\u0370\5j\66\2\u0370\u0371\7\u031d\2\2\u0371\u03a3\3\2\2\2\u0372"+
		"\u0373\5V,\2\u0373\u0374\5\u0118\u008d\2\u0374\u0375\5V,\2\u0375\u03a3"+
		"\3\2\2\2\u0376\u0377\5V,\2\u0377\u0378\5\u0118\u008d\2\u0378\u0379\t\t"+
		"\2\2\u0379\u037a\7\u031c\2\2\u037a\u037b\5^\60\2\u037b\u037c\7\u031d\2"+
		"\2\u037c\u03a3\3\2\2\2\u037d\u037f\5V,\2\u037e\u0380\7v\2\2\u037f\u037e"+
		"\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382\7\21\2\2"+
		"\u0382\u0383\5V,\2\u0383\u0384\7\b\2\2\u0384\u0385\5V,\2\u0385\u03a3\3"+
		"\2\2\2\u0386\u0388\5V,\2\u0387\u0389\7v\2\2\u0388\u0387\3\2\2\2\u0388"+
		"\u0389\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038b\7a\2\2\u038b\u038e\7\u031c"+
		"\2\2\u038c\u038f\5^\60\2\u038d\u038f\5\u00b6\\\2\u038e\u038c\3\2\2\2\u038e"+
		"\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0391\7\u031d\2\2\u0391\u03a3"+
		"\3\2\2\2\u0392\u0394\5V,\2\u0393\u0395\7v\2\2\u0394\u0393\3\2\2\2\u0394"+
		"\u0395\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\t\n\2\2\u0397\u039a\5V"+
		",\2\u0398\u0399\7D\2\2\u0399\u039b\5V,\2\u039a\u0398\3\2\2\2\u039a\u039b"+
		"\3\2\2\2\u039b\u03a3\3\2\2\2\u039c\u039d\5V,\2\u039d\u039e\7h\2\2\u039e"+
		"\u039f\5\u0104\u0083\2\u039f\u03a3\3\2\2\2\u03a0\u03a3\5\u00d4k\2\u03a1"+
		"\u03a3\5\u00d6l\2\u03a2\u0368\3\2\2\2\u03a2\u036e\3\2\2\2\u03a2\u0372"+
		"\3\2\2\2\u03a2\u0376\3\2\2\2\u03a2\u037d\3\2\2\2\u03a2\u0386\3\2\2\2\u03a2"+
		"\u0392\3\2\2\2\u03a2\u039c\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a1\3\2"+
		"\2\2\u03a3\u03aa\3\2\2\2\u03a4\u03a5\f\13\2\2\u03a5\u03a6\5\u0118\u008d"+
		"\2\u03a6\u03a7\5V,\2\u03a7\u03a9\3\2\2\2\u03a8\u03a4\3\2\2\2\u03a9\u03ac"+
		"\3\2\2\2\u03aa\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03abq\3\2\2\2\u03ac"+
		"\u03aa\3\2\2\2\u03ad\u03b3\5v<\2\u03ae\u03af\7\u031c\2\2\u03af\u03b0\5"+
		"r:\2\u03b0\u03b1\7\u031d\2\2\u03b1\u03b3\3\2\2\2\u03b2\u03ad\3\2\2\2\u03b2"+
		"\u03ae\3\2\2\2\u03b3\u03b7\3\2\2\2\u03b4\u03b6\5t;\2\u03b5\u03b4\3\2\2"+
		"\2\u03b6\u03b9\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8s"+
		"\3\2\2\2\u03b9\u03b7\3\2\2\2\u03ba\u03bc\7\u00c4\2\2\u03bb\u03bd\7\6\2"+
		"\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03c1\3\2\2\2\u03be\u03c1"+
		"\7E\2\2\u03bf\u03c1\7f\2\2\u03c0\u03ba\3\2\2\2\u03c0\u03be\3\2\2\2\u03c0"+
		"\u03bf\3\2\2\2\u03c1\u03cb\3\2\2\2\u03c2\u03cc\5v<\2\u03c3\u03c4\7\u031c"+
		"\2\2\u03c4\u03c5\5r:\2\u03c5\u03c6\7\u031d\2\2\u03c6\u03c8\3\2\2\2\u03c7"+
		"\u03c3\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03c7\3\2\2\2\u03c9\u03ca\3\2"+
		"\2\2\u03ca\u03cc\3\2\2\2\u03cb\u03c2\3\2\2\2\u03cb\u03c7\3\2\2\2\u03cc"+
		"u\3\2\2\2\u03cd\u03cf\7\u00a8\2\2\u03ce\u03d0\t\13\2\2\u03cf\u03ce\3\2"+
		"\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d2\3\2\2\2\u03d1\u03d3\5x=\2\u03d2\u03d1"+
		"\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d7\5\u008cG"+
		"\2\u03d5\u03d6\7g\2\2\u03d6\u03d8\5\u00f0y\2\u03d7\u03d5\3\2\2\2\u03d7"+
		"\u03d8\3\2\2\2\u03d8\u03e2\3\2\2\2\u03d9\u03da\7T\2\2\u03da\u03df\5\u0092"+
		"J\2\u03db\u03dc\7\u031e\2\2\u03dc\u03de\5\u0092J\2\u03dd\u03db\3\2\2\2"+
		"\u03de\u03e1\3\2\2\2\u03df\u03dd\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e3"+
		"\3\2\2\2\u03e1\u03df\3\2\2\2\u03e2\u03d9\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3"+
		"\u03e6\3\2\2\2\u03e4\u03e5\7\u00d0\2\2\u03e5\u03e7\5j\66\2\u03e6\u03e4"+
		"\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u0404\3\2\2\2\u03e8\u03e9\7Y\2\2\u03e9"+
		"\u03ea\7\26\2\2\u03ea\u03ef\5\u0084C\2\u03eb\u03ec\7\u031e\2\2\u03ec\u03ee"+
		"\5\u0084C\2\u03ed\u03eb\3\2\2\2\u03ee\u03f1\3\2\2\2\u03ef\u03ed\3\2\2"+
		"\2\u03ef\u03f0\3\2\2\2\u03f0\u03f4\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f2\u03f3"+
		"\7\u00d2\2\2\u03f3\u03f5\7\u0227\2\2\u03f4\u03f2\3\2\2\2\u03f4\u03f5\3"+
		"\2\2\2\u03f5\u0405\3\2\2\2\u03f6\u03f7\7Y\2\2\u03f7\u03f8\7\26\2\2\u03f8"+
		"\u03f9\7\u0227\2\2\u03f9\u03fa\7\u031c\2\2\u03fa\u03ff\5\u0084C\2\u03fb"+
		"\u03fc\7\u031e\2\2\u03fc\u03fe\5\u0084C\2\u03fd\u03fb\3\2\2\2\u03fe\u0401"+
		"\3\2\2\2\u03ff\u03fd\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0402\3\2\2\2\u0401"+
		"\u03ff\3\2\2\2\u0402\u0403\7\u031d\2\2\u0403\u0405\3\2\2\2\u0404\u03e8"+
		"\3\2\2\2\u0404\u03f6\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0408\3\2\2\2\u0406"+
		"\u0407\7\\\2\2\u0407\u0409\5j\66\2\u0408\u0406\3\2\2\2\u0408\u0409\3\2"+
		"\2\2\u0409w\3\2\2\2\u040a\u040b\7\u00bc\2\2\u040b\u040c\5\u0110\u0089"+
		"\2\u040cy\3\2\2\2\u040d\u040e\7n\2\2\u040e\u040f\5\u0110\u0089\2\u040f"+
		"{\3\2\2\2\u0410\u0411\7\u0085\2\2\u0411\u0412\7\26\2\2\u0412\u0417\5\u0082"+
		"B\2\u0413\u0414\7\u031e\2\2\u0414\u0416\5\u0082B\2\u0415\u0413\3\2\2\2"+
		"\u0416\u0419\3\2\2\2\u0417\u0415\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u0425"+
		"\3\2\2\2\u0419\u0417\3\2\2\2\u041a\u041b\7\u01e5\2\2\u041b\u041c\5V,\2"+
		"\u041c\u0423\t\f\2\2\u041d\u041e\7L\2\2\u041e\u041f\t\r\2\2\u041f\u0420"+
		"\5V,\2\u0420\u0421\t\f\2\2\u0421\u0422\7\u01e6\2\2\u0422\u0424\3\2\2\2"+
		"\u0423\u041d\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0426\3\2\2\2\u0425\u041a"+
		"\3\2\2\2\u0425\u0426\3\2\2\2\u0426}\3\2\2\2\u0427\u0428\7O\2\2\u0428\u043b"+
		"\7\24\2\2\u0429\u042a\7O\2\2\u042a\u042b\7\u02a7\2\2\u042b\u042d\7\u00f5"+
		"\2\2\u042c\u042e\5\u0080A\2\u042d\u042c\3\2\2\2\u042d\u042e\3\2\2\2\u042e"+
		"\u043b\3\2\2\2\u042f\u0430\7O\2\2\u0430\u0431\7\u02a7\2\2\u0431\u0435"+
		"\7\u01ee\2\2\u0432\u0433\7\u031c\2\2\u0433\u0434\7\u0307\2\2\u0434\u0436"+
		"\7\u031d\2\2\u0435\u0432\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0438\3\2\2"+
		"\2\u0437\u0439\5\u0080A\2\u0438\u0437\3\2\2\2\u0438\u0439\3\2\2\2\u0439"+
		"\u043b\3\2\2\2\u043a\u0427\3\2\2\2\u043a\u0429\3\2\2\2\u043a\u042f\3\2"+
		"\2\2\u043b\177\3\2\2\2\u043c\u0441\7\u031e\2\2\u043d\u043e\7\u0308\2\2"+
		"\u043e\u0442\7\u00f7\2\2\u043f\u0442\7\u0289\2\2\u0440\u0442\7\u0228\2"+
		"\2\u0441\u043d\3\2\2\2\u0441\u043f\3\2\2\2\u0441\u0440\3\2\2\2\u0442\u0081"+
		"\3\2\2\2\u0443\u0445\5V,\2\u0444\u0446\t\16\2\2\u0445\u0444\3\2\2\2\u0445"+
		"\u0446\3\2\2\2\u0446\u044b\3\2\2\2\u0447\u0448\7y\2\2\u0448\u044c\7\u0155"+
		"\2\2\u0449\u044a\7y\2\2\u044a\u044c\7\u019e\2\2\u044b\u0447\3\2\2\2\u044b"+
		"\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u0083\3\2\2\2\u044d\u044e\5V"+
		",\2\u044e\u0085\3\2\2\2\u044f\u0450\7\u0083\2\2\u0450\u0451\7\u031c\2"+
		"\2\u0451\u0456\5\u0088E\2\u0452\u0453\7\u031e\2\2\u0453\u0455\5\u0088"+
		"E\2\u0454\u0452\3\2\2\2\u0455\u0458\3\2\2\2\u0456\u0454\3\2\2\2\u0456"+
		"\u0457\3\2\2\2\u0457\u0459\3\2\2\2\u0458\u0456\3\2\2\2\u0459\u045a\7\u031d"+
		"\2\2\u045a\u0087\3\2\2\2\u045b\u045c\7\u0150\2\2\u045c\u0474\7\u0305\2"+
		"\2\u045d\u045e\t\17\2\2\u045e\u0474\7Y\2\2\u045f\u0460\t\20\2\2\u0460"+
		"\u0474\7\u00c4\2\2\u0461\u0462\7\u019c\2\2\u0462\u0474\7\u008a\2\2\u0463"+
		"\u0464\7\u01e8\2\2\u0464\u0465\7O\2\2\u0465\u0466\7\u031c\2\2\u0466\u046b"+
		"\5\u008aF\2\u0467\u0468\7\u031e\2\2\u0468\u046a\5\u008aF\2\u0469\u0467"+
		"\3\2\2\2\u046a\u046d\3\2\2\2\u046b\u0469\3\2\2\2\u046b\u046c\3\2\2\2\u046c"+
		"\u046e\3\2\2\2\u046d\u046b\3\2\2\2\u046e\u046f\7\u031d\2\2\u046f\u0474"+
		"\3\2\2\2\u0470\u0471\7\u01e8\2\2\u0471\u0472\7O\2\2\u0472\u0474\7\u0292"+
		"\2\2\u0473\u045b\3\2\2\2\u0473\u045d\3\2\2\2\u0473\u045f\3\2\2\2\u0473"+
		"\u0461\3\2\2\2\u0473\u0463\3\2\2\2\u0473\u0470\3\2\2\2\u0474\u0089\3\2"+
		"\2\2\u0475\u0479\7\u0304\2\2\u0476\u047a\7\u0292\2\2\u0477\u0478\7\u030b"+
		"\2\2\u0478\u047a\5\u010e\u0088\2\u0479\u0476\3\2\2\2\u0479\u0477\3\2\2"+
		"\2\u047a\u008b\3\2\2\2\u047b\u0480\5\u008eH\2\u047c\u047d\7\u031e\2\2"+
		"\u047d\u047f\5\u008eH\2\u047e\u047c\3\2\2\2\u047f\u0482\3\2\2\2\u0480"+
		"\u047e\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u008d\3\2\2\2\u0482\u0480\3\2"+
		"\2\2\u0483\u0484\5\u00f0y\2\u0484\u0485\7\u0317\2\2\u0485\u0487\3\2\2"+
		"\2\u0486\u0483\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u048b\3\2\2\2\u0488\u048c"+
		"\7\u0321\2\2\u0489\u048a\7\u031b\2\2\u048a\u048c\t\21\2\2\u048b\u0488"+
		"\3\2\2\2\u048b\u0489\3\2\2\2\u048c\u0499\3\2\2\2\u048d\u048e\5\u00b2Z"+
		"\2\u048e\u048f\7\u030b\2\2\u048f\u0490\5V,\2\u0490\u0499\3\2\2\2\u0491"+
		"\u0496\5V,\2\u0492\u0494\7\13\2\2\u0493\u0492\3\2\2\2\u0493\u0494\3\2"+
		"\2\2\u0494\u0495\3\2\2\2\u0495\u0497\5\u00b2Z\2\u0496\u0493\3\2\2\2\u0496"+
		"\u0497\3\2\2\2\u0497\u0499\3\2\2\2\u0498\u0486\3\2\2\2\u0498\u048d\3\2"+
		"\2\2\u0498\u0491\3\2\2\2\u0499\u008f\3\2\2\2\u049a\u049b\7\u01ed\2\2\u049b"+
		"\u049c\7\26\2\2\u049c\u049d\5\u00b6\\\2\u049d\u0091\3\2\2\2\u049e\u04a4"+
		"\5\u0094K\2\u049f\u04a0\7\u031c\2\2\u04a0\u04a1\5\u0094K\2\u04a1\u04a2"+
		"\7\u031d\2\2\u04a2\u04a4\3\2\2\2\u04a3\u049e\3\2\2\2\u04a3\u049f\3\2\2"+
		"\2\u04a4\u0093\3\2\2\2\u04a5\u04a9\5\u0096L\2\u04a6\u04a8\5\u009aN\2\u04a7"+
		"\u04a6\3\2\2\2\u04a8\u04ab\3\2\2\2\u04a9\u04a7\3\2\2\2\u04a9\u04aa\3\2"+
		"\2\2\u04aa\u0095\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ac\u04ae\5\u009cO\2\u04ad"+
		"\u04af\5\u00a8U\2\u04ae\u04ad\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b8"+
		"\3\2\2\2\u04b0\u04b5\5\u00a2R\2\u04b1\u04b3\5\u00a8U\2\u04b2\u04b4\5\u00b0"+
		"Y\2\u04b3\u04b2\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b6\3\2\2\2\u04b5"+
		"\u04b1\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b8\3\2\2\2\u04b7\u04ac\3\2"+
		"\2\2\u04b7\u04b0\3\2\2\2\u04b8\u0097\3\2\2\2\u04b9\u04ba\7\31\2\2\u04ba"+
		"\u04bb\7\u031c\2\2\u04bb\u04bc\7\32\2\2\u04bc\u04bd\5\u00f0y\2\u04bd\u04be"+
		"\7\u031e\2\2\u04be\u04bf\t\22\2\2\u04bf\u04c0\7\u031d\2\2\u04c0\u0099"+
		"\3\2\2\2\u04c1\u04c3\7c\2\2\u04c2\u04c1\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3"+
		"\u04c9\3\2\2\2\u04c4\u04c6\t\23\2\2\u04c5\u04c7\7\u0086\2\2\u04c6\u04c5"+
		"\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c9\3\2\2\2\u04c8\u04c2\3\2\2\2\u04c8"+
		"\u04c4\3\2\2\2\u04c9\u04cb\3\2\2\2\u04ca\u04cc\t\24\2\2\u04cb\u04ca\3"+
		"\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04ce\7i\2\2\u04ce"+
		"\u04d1\5\u0092J\2\u04cf\u04d0\7}\2\2\u04d0\u04d2\5j\66\2\u04d1\u04cf\3"+
		"\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04e9\3\2\2\2\u04d3\u04d4\7+\2\2\u04d4"+
		"\u04d5\7\u00e0\2\2\u04d5\u04e9\5\u0092J\2\u04d6\u04d7\7+\2\2\u04d7\u04d8"+
		"\7i\2\2\u04d8\u04e9\5\u0092J\2\u04d9\u04da\7\u0086\2\2\u04da\u04db\7\u00e0"+
		"\2\2\u04db\u04e9\5\u0092J\2\u04dc\u04dd\7\u01a2\2\2\u04dd\u04de\7\u00cd"+
		"\2\2\u04de\u04e0\5\u00dan\2\u04df\u04e1\5\u00aaV\2\u04e0\u04df\3\2\2\2"+
		"\u04e0\u04e1\3\2\2\2\u04e1\u04e6\3\2\2\2\u04e2\u04e4\7\13\2\2\u04e3\u04e2"+
		"\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e7\5\u00b2Z"+
		"\2\u04e6\u04e3\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e9\3\2\2\2\u04e8\u04c8"+
		"\3\2\2\2\u04e8\u04d3\3\2\2\2\u04e8\u04d6\3\2\2\2\u04e8\u04d9\3\2\2\2\u04e8"+
		"\u04dc\3\2\2\2\u04e9\u009b\3\2\2\2\u04ea\u04eb\5\u00f0y\2\u04eb\u009d"+
		"\3\2\2\2\u04ec\u04ed\7\u0081\2\2\u04ed\u04ee\7\u031c\2\2\u04ee\u04ef\7"+
		"\25\2\2\u04ef\u04f0\7\u0307\2\2\u04f0\u04fa\7\u031e\2\2\u04f1\u04f6\5"+
		"\u00a0Q\2\u04f2\u04f3\7\u031e\2\2\u04f3\u04f5\5\u00a0Q\2\u04f4\u04f2\3"+
		"\2\2\2\u04f5\u04f8\3\2\2\2\u04f6\u04f4\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7"+
		"\u04fb\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f9\u04fb\5\u0114\u008b\2\u04fa\u04f1"+
		"\3\2\2\2\u04fa\u04f9\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fd\7\u031d\2"+
		"\2\u04fd\u009f\3\2\2\2\u04fe\u04ff\5\u0114\u008b\2\u04ff\u0500\7\u030b"+
		"\2\2\u0500\u0501\t\25\2\2\u0501\u00a1\3\2\2\2\u0502\u0503\7\u031c\2\2"+
		"\u0503\u0504\5^\60\2\u0504\u0505\7\u031d\2\2\u0505\u0508\3\2\2\2\u0506"+
		"\u0508\5\u00b4[\2\u0507\u0502\3\2\2\2\u0507\u0506\3\2\2\2\u0508\u00a3"+
		"\3\2\2\2\u0509\u050d\5\u00ba^\2\u050a\u050d\5\u00bc_\2\u050b\u050d\5\u00dc"+
		"o\2\u050c\u0509\3\2\2\2\u050c\u050a\3\2\2\2\u050c\u050b\3\2\2\2\u050d"+
		"\u00a5\3\2\2\2\u050e\u050f\7\u0306\2\2\u050f\u00a7\3\2\2\2\u0510\u0512"+
		"\7\13\2\2\u0511\u0510\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0513\3\2\2\2"+
		"\u0513\u0514\5\u00aaV\2\u0514\u00a9\3\2\2\2\u0515\u0516\5\u0114\u008b"+
		"\2\u0516\u00ab\3\2\2\2\u0517\u0518\7\u0306\2\2\u0518\u00ad\3\2\2\2\u0519"+
		"\u051a\t\26\2\2\u051a\u00af\3\2\2\2\u051b\u051c\7\u031c\2\2\u051c\u0521"+
		"\5\u00b2Z\2\u051d\u051e\7\u031e\2\2\u051e\u0520\5\u00b2Z\2\u051f\u051d"+
		"\3\2\2\2\u0520\u0523\3\2\2\2\u0521\u051f\3\2\2\2\u0521\u0522\3\2\2\2\u0522"+
		"\u0524\3\2\2\2\u0523\u0521\3\2\2\2\u0524\u0525\7\u031d\2\2\u0525\u00b1"+
		"\3\2\2\2\u0526\u0529\5\u0114\u008b\2\u0527\u0529\7\u0307\2\2\u0528\u0526"+
		"\3\2\2\2\u0528\u0527\3\2\2\2\u0529\u00b3\3\2\2\2\u052a\u052b\7\u00cb\2"+
		"\2\u052b\u052c\7\u031c\2\2\u052c\u052d\5\u00b6\\\2\u052d\u0535\7\u031d"+
		"\2\2\u052e\u052f\7\u031e\2\2\u052f\u0530\7\u031c\2\2\u0530\u0531\5\u00b6"+
		"\\\2\u0531\u0532\7\u031d\2\2\u0532\u0534\3\2\2\2\u0533\u052e\3\2\2\2\u0534"+
		"\u0537\3\2\2\2\u0535\u0533\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u00b5\3\2"+
		"\2\2\u0537\u0535\3\2\2\2\u0538\u053d\5V,\2\u0539\u053a\7\u031e\2\2\u053a"+
		"\u053c\5V,\2\u053b\u0539\3\2\2\2\u053c\u053f\3\2\2\2\u053d\u053b\3\2\2"+
		"\2\u053d\u053e\3\2\2\2\u053e\u00b7\3\2\2\2\u053f\u053d\3\2\2\2\u0540\u0541"+
		"\7\30\2\2\u0541\u0547\5V,\2\u0542\u0543\7\u00cf\2\2\u0543\u0544\5V,\2"+
		"\u0544\u0545\7\u00ba\2\2\u0545\u0546\5V,\2\u0546\u0548\3\2\2\2\u0547\u0542"+
		"\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u0547\3\2\2\2\u0549\u054a\3\2\2\2\u054a"+
		"\u054d\3\2\2\2\u054b\u054c\7A\2\2\u054c\u054e\5V,\2\u054d\u054b\3\2\2"+
		"\2\u054d\u054e\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0550\7B\2\2\u0550\u0562"+
		"\3\2\2\2\u0551\u0557\7\30\2\2\u0552\u0553\7\u00cf\2\2\u0553\u0554\5j\66"+
		"\2\u0554\u0555\7\u00ba\2\2\u0555\u0556\5V,\2\u0556\u0558\3\2\2\2\u0557"+
		"\u0552\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u0557\3\2\2\2\u0559\u055a\3\2"+
		"\2\2\u055a\u055d\3\2\2\2\u055b\u055c\7A\2\2\u055c\u055e\5V,\2\u055d\u055b"+
		"\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0560\7B\2\2\u0560"+
		"\u0562\3\2\2\2\u0561\u0540\3\2\2\2\u0561\u0551\3\2\2\2\u0562\u00b9\3\2"+
		"\2\2\u0563\u0564\7\u020e\2\2\u0564\u0565\7\u031c\2\2\u0565\u0566\7\u031d"+
		"\2\2\u0566\u0576\5\u00e2r\2\u0567\u0568\7\u013d\2\2\u0568\u0569\7\u031c"+
		"\2\2\u0569\u056a\7\u031d\2\2\u056a\u0576\5\u00e2r\2\u056b\u056c\7\u01de"+
		"\2\2\u056c\u056d\7\u031c\2\2\u056d\u056e\5V,\2\u056e\u056f\7\u031d\2\2"+
		"\u056f\u0570\5\u00e2r\2\u0570\u0576\3\2\2\2\u0571\u0572\7\u022e\2\2\u0572"+
		"\u0573\7\u031c\2\2\u0573\u0574\7\u031d\2\2\u0574\u0576\5\u00e2r\2\u0575"+
		"\u0563\3\2\2\2\u0575\u0567\3\2\2\2\u0575\u056b\3\2\2\2\u0575\u0571\3\2"+
		"\2\2\u0576\u00bb\3\2\2\2\u0577\u0584\5\u00ceh\2\u0578\u0584\5\u00d8m\2"+
		"\u0579\u0584\5\u00ccg\2\u057a\u0584\5\u00caf\2\u057b\u0584\5\u00c8e\2"+
		"\u057c\u0584\5\u00d4k\2\u057d\u0584\5\u00d6l\2\u057e\u0584\5\u00d0i\2"+
		"\u057f\u0584\5\u00d2j\2\u0580\u0584\5\u00be`\2\u0581\u0584\5\u00c4c\2"+
		"\u0582\u0584\5\u00c6d\2\u0583\u0577\3\2\2\2\u0583\u0578\3\2\2\2\u0583"+
		"\u0579\3\2\2\2\u0583\u057a\3\2\2\2\u0583\u057b\3\2\2\2\u0583\u057c\3\2"+
		"\2\2\u0583\u057d\3\2\2\2\u0583\u057e\3\2\2\2\u0583\u057f\3\2\2\2\u0583"+
		"\u0580\3\2\2\2\u0583\u0581\3\2\2\2\u0583\u0582\3\2\2\2\u0584\u00bd\3\2"+
		"\2\2\u0585\u0586\7\u014c\2\2\u0586\u0587\7\u031c\2\2\u0587\u0588\5\u00c0"+
		"a\2\u0588\u0589\7T\2\2\u0589\u058a\5V,\2\u058a\u058b\7\u031d\2\2\u058b"+
		"\u00bf\3\2\2\2\u058c\u0593\7\u02b3\2\2\u058d\u0593\7\u01cd\2\2\u058e\u0593"+
		"\7\u0133\2\2\u058f\u0593\7\u016f\2\2\u0590\u0593\7\u01c9\2\2\u0591\u0593"+
		"\5V,\2\u0592\u058c\3\2\2\2\u0592\u058d\3\2\2\2\u0592\u058e\3\2\2\2\u0592"+
		"\u058f\3\2\2\2\u0592\u0590\3\2\2\2\u0592\u0591\3\2\2\2\u0593\u00c1\3\2"+
		"\2\2\u0594\u059b\7\u02b3\2\2\u0595\u059b\7\u01cd\2\2\u0596\u059b\7\u0133"+
		"\2\2\u0597\u059b\7\u016f\2\2\u0598\u059b\7\u01c9\2\2\u0599\u059b\5V,\2"+
		"\u059a\u0594\3\2\2\2\u059a\u0595\3\2\2\2\u059a\u0596\3\2\2\2\u059a\u0597"+
		"\3\2\2\2\u059a\u0598\3\2\2\2\u059a\u0599\3\2\2\2\u059b\u00c3\3\2\2\2\u059c"+
		"\u059d\7\u01eb\2\2\u059d\u059e\7\u031c\2\2\u059e\u059f\5V,\2\u059f\u05a0"+
		"\7\u01f7\2\2\u05a0\u05a1\5V,\2\u05a1\u05a2\7T\2\2\u05a2\u05a5\5V,\2\u05a3"+
		"\u05a4\7O\2\2\u05a4\u05a6\5V,\2\u05a5\u05a3\3\2\2\2\u05a5\u05a6\3\2\2"+
		"\2\u05a6\u05a7\3\2\2\2\u05a7\u05a8\7\u031d\2\2\u05a8\u00c5\3\2\2\2\u05a9"+
		"\u05aa\7\u00b3\2\2\u05aa\u05ab\7\u031c\2\2\u05ab\u05ac\5V,\2\u05ac\u05ad"+
		"\7T\2\2\u05ad\u05b0\5V,\2\u05ae\u05af\7O\2\2\u05af\u05b1\5V,\2\u05b0\u05ae"+
		"\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b3\7\u031d\2"+
		"\2\u05b3\u00c7\3\2\2\2\u05b4\u05b5\t\27\2\2\u05b5\u05b6\7\u031c\2\2\u05b6"+
		"\u05bb\5V,\2\u05b7\u05b8\7\u031e\2\2\u05b8\u05ba\5V,\2\u05b9\u05b7\3\2"+
		"\2\2\u05ba\u05bd\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc"+
		"\u05be\3\2\2\2\u05bd\u05bb\3\2\2\2\u05be\u05bf\7\u031d\2\2\u05bf\u00c9"+
		"\3\2\2\2\u05c0\u05c1\t\30\2\2\u05c1\u05c2\7\u031c\2\2\u05c2\u05c3\5V,"+
		"\2\u05c3\u05c4\7\u031e\2\2\u05c4\u05c5\5V,\2\u05c5\u05c6\7\u031e\2\2\u05c6"+
		"\u05c7\5V,\2\u05c7\u05c8\7\u031d\2\2\u05c8\u00cb\3\2\2\2\u05c9\u05ca\t"+
		"\31\2\2\u05ca\u05cb\7\u031c\2\2\u05cb\u05cc\5V,\2\u05cc\u05cd\7\u031e"+
		"\2\2\u05cd\u05ce\5V,\2\u05ce\u05cf\7\u031d\2\2\u05cf\u00cd\3\2\2\2\u05d0"+
		"\u05d1\t\32\2\2\u05d1\u05d2\7\u031c\2\2\u05d2\u05d3\5V,\2\u05d3\u05d4"+
		"\7\u031d\2\2\u05d4\u05db\3\2\2\2\u05d5\u05d6\7\u0106\2\2\u05d6\u05d7\7"+
		"\u031c\2\2\u05d7\u05d8\5\u00e0q\2\u05d8\u05d9\7\u031d\2\2\u05d9\u05db"+
		"\3\2\2\2\u05da\u05d0\3\2\2\2\u05da\u05d5\3\2\2\2\u05db\u00cf\3\2\2\2\u05dc"+
		"\u05dd\7\u026b\2\2\u05dd\u05de\5V,\2\u05de\u00d1\3\2\2\2\u05df\u05e0\7"+
		"\u0127\2\2\u05e0\u05e1\7\u031c\2\2\u05e1\u05e2\5\u00c2b\2\u05e2\u05e3"+
		"\7\u031e\2\2\u05e3\u05e4\5V,\2\u05e4\u05e5\7\u031e\2\2\u05e5\u05e6\5V"+
		",\2\u05e6\u05e7\7\u031d\2\2\u05e7\u00d3\3\2\2\2\u05e8\u05ea\7v\2\2\u05e9"+
		"\u05e8\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ec\t\33"+
		"\2\2\u05ec\u05ed\7\u031c\2\2\u05ed\u05ee\5V,\2\u05ee\u05ef\7\u031d\2\2"+
		"\u05ef\u00d5\3\2\2\2\u05f0\u05f2\7v\2\2\u05f1\u05f0\3\2\2\2\u05f1\u05f2"+
		"\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f4\t\34\2\2\u05f4\u05f5\7\u031c"+
		"\2\2\u05f5\u05f6\5V,\2\u05f6\u05f7\7\u031e\2\2\u05f7\u05f8\5V,\2\u05f8"+
		"\u05f9\7\u031d\2\2\u05f9\u00d7\3\2\2\2\u05fa\u05fb\t\35\2\2\u05fb\u05fc"+
		"\7\u031c\2\2\u05fc\u05fd\7\u031d\2\2\u05fd\u00d9\3\2\2\2\u05fe\u05ff\7"+
		"\u014b\2\2\u05ff\u0600\7\u031c\2\2\u0600\u0601\5V,\2\u0601\u0602\7\u031d"+
		"\2\2\u0602\u00db\3\2\2\2\u0603\u0604\7\u00f6\2\2\u0604\u0605\7\u031c\2"+
		"\2\u0605\u0606\5\u00dep\2\u0606\u0608\7\u031d\2\2\u0607\u0609\5\u00e2"+
		"r\2\u0608\u0607\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u066d\3\2\2\2\u060a"+
		"\u060b\7\u0110\2\2\u060b\u060c\7\u031c\2\2\u060c\u060d\5\u00dep\2\u060d"+
		"\u060e\7\u031d\2\2\u060e\u066d\3\2\2\2\u060f\u0610\7\u0168\2\2\u0610\u0611"+
		"\7\u031c\2\2\u0611\u0612\5V,\2\u0612\u0613\7\u031d\2\2\u0613\u066d\3\2"+
		"\2\2\u0614\u0615\7\u0169\2\2\u0615\u0616\7\u031c\2\2\u0616\u0617\5\u00b6"+
		"\\\2\u0617\u0618\7\u031d\2\2\u0618\u066d\3\2\2\2\u0619\u061a\7\u01c3\2"+
		"\2\u061a\u061b\7\u031c\2\2\u061b\u061c\5\u00dep\2\u061c\u061e\7\u031d"+
		"\2\2\u061d\u061f\5\u00e2r\2\u061e\u061d\3\2\2\2\u061e\u061f\3\2\2\2\u061f"+
		"\u066d\3\2\2\2\u0620\u0621\7\u01c7\2\2\u0621\u0622\7\u031c\2\2\u0622\u0623"+
		"\5\u00dep\2\u0623\u0625\7\u031d\2\2\u0624\u0626\5\u00e2r\2\u0625\u0624"+
		"\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u066d\3\2\2\2\u0627\u0628\7\u025e\2"+
		"\2\u0628\u0629\7\u031c\2\2\u0629\u062a\5\u00dep\2\u062a\u062c\7\u031d"+
		"\2\2\u062b\u062d\5\u00e2r\2\u062c\u062b\3\2\2\2\u062c\u062d\3\2\2\2\u062d"+
		"\u066d\3\2\2\2\u062e\u062f\7\u0252\2\2\u062f\u0630\7\u031c\2\2\u0630\u0631"+
		"\5\u00dep\2\u0631\u0633\7\u031d\2\2\u0632\u0634\5\u00e2r\2\u0633\u0632"+
		"\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u066d\3\2\2\2\u0635\u0636\7\u0254\2"+
		"\2\u0636\u0637\7\u031c\2\2\u0637\u0638\5\u00dep\2\u0638\u063a\7\u031d"+
		"\2\2\u0639\u063b\5\u00e2r\2\u063a\u0639\3\2\2\2\u063a\u063b\3\2\2\2\u063b"+
		"\u066d\3\2\2\2\u063c\u063d\7\u0255\2\2\u063d\u063e\7\u031c\2\2\u063e\u063f"+
		"\5\u00dep\2\u063f\u0641\7\u031d\2\2\u0640\u0642\5\u00e2r\2\u0641\u0640"+
		"\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u066d\3\2\2\2\u0643\u0644\7\u0298\2"+
		"\2\u0644\u0645\7\u031c\2\2\u0645\u0646\5\u00dep\2\u0646\u0648\7\u031d"+
		"\2\2\u0647\u0649\5\u00e2r\2\u0648\u0647\3\2\2\2\u0648\u0649\3\2\2\2\u0649"+
		"\u066d\3\2\2\2\u064a\u064b\7\u029e\2\2\u064b\u064c\7\u031c\2\2\u064c\u064d"+
		"\5\u00dep\2\u064d\u064f\7\u031d\2\2\u064e\u0650\5\u00e2r\2\u064f\u064e"+
		"\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u066d\3\2\2\2\u0651\u0652\7\u0120\2"+
		"\2\u0652\u0655\7\u031c\2\2\u0653\u0656\7\u0321\2\2\u0654\u0656\5\u00de"+
		"p\2\u0655\u0653\3\2\2\2\u0655\u0654\3\2\2\2\u0656\u0657\3\2\2\2\u0657"+
		"\u0659\7\u031d\2\2\u0658\u065a\5\u00e2r\2\u0659\u0658\3\2\2\2\u0659\u065a"+
		"\3\2\2\2\u065a\u066d\3\2\2\2\u065b\u065c\7\u01d6\2\2\u065c\u065d\7\u031c"+
		"\2\2\u065d\u065e\5\u00dep\2\u065e\u0660\7\u031d\2\2\u065f\u0661\5\u00e2"+
		"r\2\u0660\u065f\3\2\2\2\u0660\u0661\3\2\2\2\u0661\u066d\3\2\2\2\u0662"+
		"\u0663\7\u0121\2\2\u0663\u0666\7\u031c\2\2\u0664\u0667\7\u0321\2\2\u0665"+
		"\u0667\5\u00dep\2\u0666\u0664\3\2\2\2\u0666\u0665\3\2\2\2\u0667\u0668"+
		"\3\2\2\2\u0668\u066a\7\u031d\2\2\u0669\u066b\5\u00e2r\2\u066a\u0669\3"+
		"\2\2\2\u066a\u066b\3\2\2\2\u066b\u066d\3\2\2\2\u066c\u0603\3\2\2\2\u066c"+
		"\u060a\3\2\2\2\u066c\u060f\3\2\2\2\u066c\u0614\3\2\2\2\u066c\u0619\3\2"+
		"\2\2\u066c\u0620\3\2\2\2\u066c\u0627\3\2\2\2\u066c\u062e\3\2\2\2\u066c"+
		"\u0635\3\2\2\2\u066c\u063c\3\2\2\2\u066c\u0643\3\2\2\2\u066c\u064a\3\2"+
		"\2\2\u066c\u0651\3\2\2\2\u066c\u065b\3\2\2\2\u066c\u0662\3\2\2\2\u066d"+
		"\u00dd\3\2\2\2\u066e\u0670\t\13\2\2\u066f\u066e\3\2\2\2\u066f\u0670\3"+
		"\2\2\2\u0670\u0671\3\2\2\2\u0671\u0672\5V,\2\u0672\u00df\3\2\2\2\u0673"+
		"\u0674\5V,\2\u0674\u0675\7\13\2\2\u0675\u0676\5\u010a\u0086\2\u0676\u00e1"+
		"\3\2\2\2\u0677\u0678\7\u0087\2\2\u0678\u067a\7\u031c\2\2\u0679\u067b\5"+
		"\u0090I\2\u067a\u0679\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067d\3\2\2\2"+
		"\u067c\u067e\5|?\2\u067d\u067c\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0680"+
		"\3\2\2\2\u067f\u0681\5\u00e4s\2\u0680\u067f\3\2\2\2\u0680\u0681\3\2\2"+
		"\2\u0681\u0682\3\2\2\2\u0682\u0683\7\u031d\2\2\u0683\u00e3\3\2\2\2\u0684"+
		"\u0685\t\36\2\2\u0685\u0686\5\u00e6t\2\u0686\u00e5\3\2\2\2\u0687\u068e"+
		"\5\u00eav\2\u0688\u0689\7\21\2\2\u0689\u068a\5\u00e8u\2\u068a\u068b\7"+
		"\b\2\2\u068b\u068c\5\u00e8u\2\u068c\u068e\3\2\2\2\u068d\u0687\3\2\2\2"+
		"\u068d\u0688\3\2\2\2\u068e\u00e7\3\2\2\2\u068f\u0692\5\u00eav\2\u0690"+
		"\u0692\5\u00ecw\2\u0691\u068f\3\2\2\2\u0691\u0690\3\2\2\2\u0692\u00e9"+
		"\3\2\2\2\u0693\u0694\7\u028c\2\2\u0694\u069a\7\u0200\2\2\u0695\u0696\7"+
		"\u0305\2\2\u0696\u069a\7\u0200\2\2\u0697\u0698\7,\2\2\u0698\u069a\7\u022a"+
		"\2\2\u0699\u0693\3\2\2\2\u0699\u0695\3\2\2\2\u0699\u0697\3\2\2\2\u069a"+
		"\u00eb\3\2\2\2\u069b\u069c\7\u028c\2\2\u069c\u06a0\7\u0157\2\2\u069d\u069e"+
		"\7\u0305\2\2\u069e\u06a0\7\u0157\2\2\u069f\u069b\3\2\2\2\u069f\u069d\3"+
		"\2\2\2\u06a0\u00ed\3\2\2\2\u06a1\u06a2\5\u0114\u008b\2\u06a2\u06a3\7\u0317"+
		"\2\2\u06a3\u06a4\5\u0114\u008b\2\u06a4\u06a5\7\u0317\2\2\u06a5\u06a6\5"+
		"\u0114\u008b\2\u06a6\u06a7\7\u0317\2\2\u06a7\u06b3\3\2\2\2\u06a8\u06a9"+
		"\5\u0114\u008b\2\u06a9\u06ab\7\u0317\2\2\u06aa\u06ac\5\u0114\u008b\2\u06ab"+
		"\u06aa\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06ae\7\u0317"+
		"\2\2\u06ae\u06b3\3\2\2\2\u06af\u06b0\5\u0114\u008b\2\u06b0\u06b1\7\u0317"+
		"\2\2\u06b1\u06b3\3\2\2\2\u06b2\u06a1\3\2\2\2\u06b2\u06a8\3\2\2\2\u06b2"+
		"\u06af\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4\u06b5\5\u0114"+
		"\u008b\2\u06b5\u00ef\3\2\2\2\u06b6\u06b7\5\u0114\u008b\2\u06b7\u06b8\7"+
		"\u0317\2\2\u06b8\u06ba\3\2\2\2\u06b9\u06b6\3\2\2\2\u06b9\u06ba\3\2\2\2"+
		"\u06ba\u06bb\3\2\2\2\u06bb\u06bc\5\u0114\u008b\2\u06bc\u00f1\3\2\2\2\u06bd"+
		"\u06be\5\u0114\u008b\2\u06be\u06bf\7\u0317\2\2\u06bf\u06c1\3\2\2\2\u06c0"+
		"\u06bd\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u06c3\5\u0114"+
		"\u008b\2\u06c3\u00f3\3\2\2\2\u06c4\u06c5\5\u0114\u008b\2\u06c5\u06c7\7"+
		"\u0317\2\2\u06c6\u06c8\5\u0114\u008b\2\u06c7\u06c6\3\2\2\2\u06c7\u06c8"+
		"\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9\u06ca\7\u0317\2\2\u06ca\u06cf\3\2\2"+
		"\2\u06cb\u06cc\5\u0114\u008b\2\u06cc\u06cd\7\u0317\2\2\u06cd\u06cf\3\2"+
		"\2\2\u06ce\u06c4\3\2\2\2\u06ce\u06cb\3\2\2\2\u06ce\u06cf\3\2\2\2\u06cf"+
		"\u06d0\3\2\2\2\u06d0\u06d1\5\u0114\u008b\2\u06d1\u00f5\3\2\2\2\u06d2\u06d5"+
		"\5\u00eex\2\u06d3\u06d5\7\u0304\2\2\u06d4\u06d2\3\2\2\2\u06d4\u06d3\3"+
		"\2\2\2\u06d5\u00f7\3\2\2\2\u06d6\u06d7\5\u00f0y\2\u06d7\u06d8\7\u0317"+
		"\2\2\u06d8\u06da\3\2\2\2\u06d9\u06d6\3\2\2\2\u06d9\u06da\3\2\2\2\u06da"+
		"\u06db\3\2\2\2\u06db\u06dc\5\u00fc\177\2\u06dc\u00f9\3\2\2\2\u06dd\u06e2"+
		"\5\u00fc\177\2\u06de\u06df\7\u031e\2\2\u06df\u06e1\5\u00fc\177\2\u06e0"+
		"\u06de\3\2\2\2\u06e1\u06e4\3\2\2\2\u06e2\u06e0\3\2\2\2\u06e2\u06e3\3\2"+
		"\2\2\u06e3\u00fb\3\2\2\2\u06e4\u06e2\3\2\2\2\u06e5\u06e6\5\u0114\u008b"+
		"\2\u06e6\u00fd\3\2\2\2\u06e7\u06ea\5\u0114\u008b\2\u06e8\u06ea\7\u0304"+
		"\2\2\u06e9\u06e7\3\2\2\2\u06e9\u06e8\3\2\2\2\u06ea\u00ff\3\2\2\2\u06eb"+
		"\u06ec\t\37\2\2\u06ec\u0101\3\2\2\2\u06ed\u06ee\t \2\2\u06ee\u0103\3\2"+
		"\2\2\u06ef\u06f1\7v\2\2\u06f0\u06ef\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1"+
		"\u06f2\3\2\2\2\u06f2\u06f3\7w\2\2\u06f3\u0105\3\2\2\2\u06f4\u06f5\t!\2"+
		"\2\u06f5\u0107\3\2\2\2\u06f6\u06fc\5\u00f4{\2\u06f7\u06fc\7\u009d\2\2"+
		"\u06f8\u06fc\7l\2\2\u06f9\u06fc\7\u00fa\2\2\u06fa\u06fc\7\u010f\2\2\u06fb"+
		"\u06f6\3\2\2\2\u06fb\u06f7\3\2\2\2\u06fb\u06f8\3\2\2\2\u06fb\u06f9\3\2"+
		"\2\2\u06fb\u06fa\3\2\2\2\u06fc\u0109\3\2\2\2\u06fd\u075a\7\u00f8\2\2\u06fe"+
		"\u06ff\7\u0308\2\2\u06ff\u0700\7\u031c\2\2\u0700\u0701\7\u0305\2\2\u0701"+
		"\u075a\7\u031d\2\2\u0702\u075a\7\u00fb\2\2\u0703\u075a\7\u010c\2\2\u0704"+
		"\u0705\7\u010c\2\2\u0705\u0706\7\u031c\2\2\u0706\u0707\7\u0305\2\2\u0707"+
		"\u075a\7\u031d\2\2\u0708\u075a\7\u0126\2\2\u0709\u075a\7\u0130\2\2\u070a"+
		"\u075a\7\u0131\2\2\u070b\u070c\7\u0132\2\2\u070c\u070d\7\u031c\2\2\u070d"+
		"\u070e\7\u0305\2\2\u070e\u075a\7\u031d\2\2\u070f\u0710\7\u0305\2\2\u0710"+
		"\u0711\7\u031c\2\2\u0711\u0712\7\u0305\2\2\u0712\u0713\7\u031e\2\2\u0713"+
		"\u0714\7\u0305\2\2\u0714\u075a\7\u031d\2\2\u0715\u0717\7>\2\2\u0716\u0718"+
		"\7\u008b\2\2\u0717\u0716\3\2\2\2\u0717\u0718\3\2\2\2\u0718\u075a\3\2\2"+
		"\2\u0719\u075a\7\u0309\2\2\u071a\u075a\7\u015f\2\2\u071b\u075a\7\u0160"+
		"\2\2\u071c\u075a\7\u016c\2\2\u071d\u075a\7\u0171\2\2\u071e\u075a\7\u0172"+
		"\2\2\u071f\u075a\7\u01cc\2\2\u0720\u0721\7\u01d5\2\2\u0721\u0722\7\u031c"+
		"\2\2\u0722\u0723\7\u0305\2\2\u0723\u075a\7\u031d\2\2\u0724\u075a\7\u01dd"+
		"\2\2\u0725\u0726\7\u01e1\2\2\u0726\u0727\7\u031c\2\2\u0727\u0728\7\u0305"+
		"\2\2\u0728\u0729\7\u031e\2\2\u0729\u072a\7\u0305\2\2\u072a\u075a\7\u031d"+
		"\2\2\u072b\u072c\7\u01e2\2\2\u072c\u072d\7\u031c\2\2\u072d\u075a\7\u0305"+
		"\2\2\u072e\u072f\7\u01c3\2\2\u072f\u075a\7\u031d\2\2\u0730\u075a\7\u030a"+
		"\2\2\u0731\u075a\7\u0246\2\2\u0732\u075a\7\u0247\2\2\u0733\u075a\7\u0248"+
		"\2\2\u0734\u075a\7\u024e\2\2\u0735\u075a\7\u0265\2\2\u0736\u0737\7\u0268"+
		"\2\2\u0737\u0738\7\u031c\2\2\u0738\u0739\7\u0305\2\2\u0739\u075a\7\u031d"+
		"\2\2\u073a\u075a\7\u026b\2\2\u073b\u073c\7\u026b\2\2\u073c\u073d\7\u00d4"+
		"\2\2\u073d\u073e\7\u0268\2\2\u073e\u075a\7\u00d6\2\2\u073f\u075a\7\u026e"+
		"\2\2\u0740\u075a\7\u028f\2\2\u0741\u0742\7\u0299\2\2\u0742\u0743\7\u031c"+
		"\2\2\u0743\u075a\7\u0305\2\2\u0744\u0745\7\u01c3\2\2\u0745\u075a\7\u031d"+
		"\2\2\u0746\u0747\7\u029a\2\2\u0747\u0748\7\u031c\2\2\u0748\u075a\7\u0305"+
		"\2\2\u0749\u074a\7\u01c3\2\2\u074a\u075a\7\u031d\2\2\u074b\u075a\7\u02a7"+
		"\2\2\u074c\u074e\5\u0114\u008b\2\u074d\u074f\7]\2\2\u074e\u074d\3\2\2"+
		"\2\u074e\u074f\3\2\2\2\u074f\u0757\3\2\2\2\u0750\u0751\7\u031c\2\2\u0751"+
		"\u0754\t\"\2\2\u0752\u0753\7\u031e\2\2\u0753\u0755\7\u0305\2\2\u0754\u0752"+
		"\3\2\2\2\u0754\u0755\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u0758\7\u031d\2"+
		"\2\u0757\u0750\3\2\2\2\u0757\u0758\3\2\2\2\u0758\u075a\3\2\2\2\u0759\u06fd"+
		"\3\2\2\2\u0759\u06fe\3\2\2\2\u0759\u0702\3\2\2\2\u0759\u0703\3\2\2\2\u0759"+
		"\u0704\3\2\2\2\u0759\u0708\3\2\2\2\u0759\u0709\3\2\2\2\u0759\u070a\3\2"+
		"\2\2\u0759\u070b\3\2\2\2\u0759\u070f\3\2\2\2\u0759\u0715\3\2\2\2\u0759"+
		"\u0719\3\2\2\2\u0759\u071a\3\2\2\2\u0759\u071b\3\2\2\2\u0759\u071c\3\2"+
		"\2\2\u0759\u071d\3\2\2\2\u0759\u071e\3\2\2\2\u0759\u071f\3\2\2\2\u0759"+
		"\u0720\3\2\2\2\u0759\u0724\3\2\2\2\u0759\u0725\3\2\2\2\u0759\u072b\3\2"+
		"\2\2\u0759\u072e\3\2\2\2\u0759\u0730\3\2\2\2\u0759\u0731\3\2\2\2\u0759"+
		"\u0732\3\2\2\2\u0759\u0733\3\2\2\2\u0759\u0734\3\2\2\2\u0759\u0735\3\2"+
		"\2\2\u0759\u0736\3\2\2\2\u0759\u073a\3\2\2\2\u0759\u073b\3\2\2\2\u0759"+
		"\u073f\3\2\2\2\u0759\u0740\3\2\2\2\u0759\u0741\3\2\2\2\u0759\u0744\3\2"+
		"\2\2\u0759\u0746\3\2\2\2\u0759\u0749\3\2\2\2\u0759\u074b\3\2\2\2\u0759"+
		"\u074c\3\2\2\2\u075a\u010b\3\2\2\2\u075b\u075e\7w\2\2\u075c\u075e\5\u010e"+
		"\u0088\2\u075d\u075b\3\2\2\2\u075d\u075c\3\2\2\2\u075e\u010d\3\2\2\2\u075f"+
		"\u076c\7\u0307\2\2\u0760\u076c\7\u0308\2\2\u0761\u076c\5\u0110\u0089\2"+
		"\u0762\u0764\5\u0112\u008a\2\u0763\u0762\3\2\2\2\u0763\u0764\3\2\2\2\u0764"+
		"\u0765\3\2\2\2\u0765\u076c\t#\2\2\u0766\u0768\5\u0112\u008a\2\u0767\u0766"+
		"\3\2\2\2\u0767\u0768\3\2\2\2\u0768\u0769\3\2\2\2\u0769\u076a\7\u031b\2"+
		"\2\u076a\u076c\t$\2\2\u076b\u075f\3\2\2\2\u076b\u0760\3\2\2\2\u076b\u0761"+
		"\3\2\2\2\u076b\u0763\3\2\2\2\u076b\u0767\3\2\2\2\u076c\u010f\3\2\2\2\u076d"+
		"\u076f\5\u0112\u008a\2\u076e\u076d\3\2\2\2\u076e\u076f\3\2\2\2\u076f\u0770"+
		"\3\2\2\2\u0770\u0771\7\u0305\2\2\u0771\u0111\3\2\2\2\u0772\u0773\t\5\2"+
		"\2\u0773\u0113\3\2\2\2\u0774\u0779\5\u0116\u008c\2\u0775\u0779\7\u0301"+
		"\2\2\u0776\u0779\7\u0303\2\2\u0777\u0779\7\u0302\2\2\u0778\u0774\3\2\2"+
		"\2\u0778\u0775\3\2\2\2\u0778\u0776\3\2\2\2\u0778\u0777\3\2\2\2\u0779\u0115"+
		"\3\2\2\2\u077a\u077b\t%\2\2\u077b\u0117\3\2\2\2\u077c\u078c\7\u030b\2"+
		"\2\u077d\u078c\7\u030c\2\2\u077e\u078c\7\u030d\2\2\u077f\u0780\7\u030d"+
		"\2\2\u0780\u078c\7\u030b\2\2\u0781\u0782\7\u030c\2\2\u0782\u078c\7\u030b"+
		"\2\2\u0783\u0784\7\u030d\2\2\u0784\u078c\7\u030c\2\2\u0785\u0786\7\u030e"+
		"\2\2\u0786\u078c\7\u030b\2\2\u0787\u0788\7\u030e\2\2\u0788\u078c\7\u030c"+
		"\2\2\u0789\u078a\7\u030e\2\2\u078a\u078c\7\u030d\2\2\u078b\u077c\3\2\2"+
		"\2\u078b\u077d\3\2\2\2\u078b\u077e\3\2\2\2\u078b\u077f\3\2\2\2\u078b\u0781"+
		"\3\2\2\2\u078b\u0783\3\2\2\2\u078b\u0785\3\2\2\2\u078b\u0787\3\2\2\2\u078b"+
		"\u0789\3\2\2\2\u078c\u0119\3\2\2\2\u078d\u078e\t&\2\2\u078e\u011b\3\2"+
		"\2\2\u00dd\u0129\u0130\u013a\u013e\u0142\u0149\u0156\u015a\u0164\u016e"+
		"\u0183\u0186\u018b\u0192\u019a\u019d\u01a0\u01a4\u01a7\u01aa\u01b5\u01bb"+
		"\u01c1\u01c3\u01c7\u01ca\u01cd\u01d2\u01d7\u01da\u01e2\u01e7\u01eb\u01f4"+
		"\u01f8\u01fd\u0208\u020d\u0214\u0217\u0223\u022b\u022d\u0233\u023a\u0240"+
		"\u0244\u024a\u0251\u0255\u025b\u0260\u0267\u026a\u026f\u0275\u0278\u0280"+
		"\u0284\u0287\u028c\u0292\u0297\u029e\u02a4\u02a7\u02ab\u02ae\u02b2\u02be"+
		"\u02c1\u02cf\u02d2\u02d9\u02db\u02f5\u0307\u0309\u031a\u0323\u032a\u0332"+
		"\u033b\u033f\u0349\u0350\u0358\u0360\u0364\u037f\u0388\u038e\u0394\u039a"+
		"\u03a2\u03aa\u03b2\u03b7\u03bc\u03c0\u03c9\u03cb\u03cf\u03d2\u03d7\u03df"+
		"\u03e2\u03e6\u03ef\u03f4\u03ff\u0404\u0408\u0417\u0423\u0425\u042d\u0435"+
		"\u0438\u043a\u0441\u0445\u044b\u0456\u046b\u0473\u0479\u0480\u0486\u048b"+
		"\u0493\u0496\u0498\u04a3\u04a9\u04ae\u04b3\u04b5\u04b7\u04c2\u04c6\u04c8"+
		"\u04cb\u04d1\u04e0\u04e3\u04e6\u04e8\u04f6\u04fa\u0507\u050c\u0511\u0521"+
		"\u0528\u0535\u053d\u0549\u054d\u0559\u055d\u0561\u0575\u0583\u0592\u059a"+
		"\u05a5\u05b0\u05bb\u05da\u05e9\u05f1\u0608\u061e\u0625\u062c\u0633\u063a"+
		"\u0641\u0648\u064f\u0655\u0659\u0660\u0666\u066a\u066c\u066f\u067a\u067d"+
		"\u0680\u068d\u0691\u0699\u069f\u06ab\u06b2\u06b9\u06c0\u06c7\u06ce\u06d4"+
		"\u06d9\u06e2\u06e9\u06f0\u06fb\u0717\u074e\u0754\u0757\u0759\u075d\u0763"+
		"\u0767\u076b\u076e\u0778\u078b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}