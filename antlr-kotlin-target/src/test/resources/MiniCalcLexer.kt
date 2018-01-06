// Generated from java-escape by ANTLR 4.7.1
import com.strumenta.kotlinmultiplatform.Arrays
import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.VocabularyImpl
import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.LexerATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.DFA

class MiniCalcLexer(val input: CharStream) : Lexer(input) {
	// TODO Verify the runtime version is correct

    override val ruleNames: Array<String>?
        get() = Rules.values().map { it.name }.toTypedArray()

    override val grammarFileName: String
        get() = "MiniCalcLexer.g4"

    override val atn: ATN
		get() = MiniCalcLexer.Companion.ATN

	companion object {
		val decisionToDFA : Array<DFA>
		val sharedContextCache = PredictionContextCache()

		private val LITERAL_NAMES = Arrays.asList<String?>(null, null, null, "'input'", 
		                                                   "'var'", "'print'", 
		                                                   null, null, null, null, 
		                                                   null, null, null, null, 
		                                                   null, null, null, null, 
		                                                   null, null, null, null, 
		                                                   "'\\\"'", "'\\\\'", 
		                                                   "'\\n'", "'\\#'", null, 
		                                                   "'#{'", null, "'}'")
		private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "NEWLINE", "WS", 
		                                                    "INPUT", "VAR", "PRINT", 
		                                                    "AS", "INT", "DECIMAL", 
		                                                    "STRING", "ID", "INTLIT", 
		                                                    "DECLIT", "PLUS", 
		                                                    "MINUS", "ASTERISK", 
		                                                    "DIVISION", "ASSIGN", 
		                                                    "LPAREN", "RPAREN", 
		                                                    "STRING_OPEN", "UNMATCHED", 
		                                                    "ESCAPE_STRING_DELIMITER", 
		                                                    "ESCAPE_SLASH", "ESCAPE_NEWLINE", 
		                                                    "ESCAPE_SHARP", "STRING_CLOSE", 
		                                                    "INTERPOLATION_OPEN", 
		                                                    "STRING_CONTENT", 
		                                                    "INTERPOLATION_CLOSE")

		val VOCABULARY = VocabularyImpl(LITERAL_NAMES.toTypedArray(), SYMBOLIC_NAMES.toTypedArray())

        val tokenNames: Array<String?> = Array<String?>(SYMBOLIC_NAMES.size) {
            var el = VOCABULARY.getLiteralName(it)
            if (el == null) {
                el = VOCABULARY.getSymbolicName(it)
            }

            if (el == null) {
                el = "<INVALID>"
            }
            el
        }

		private val serializedIntegersATN =
			arrayOf(3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 2, 
			31, 362, 8, 1, 8, 1, 8, 1, 4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 
			9, 5, 4, 6, 9, 6, 4, 7, 9, 7, 4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 
			11, 9, 11, 4, 12, 9, 12, 4, 13, 9, 13, 4, 14, 9, 14, 4, 15, 9, 15, 4, 
			16, 9, 16, 4, 17, 9, 17, 4, 18, 9, 18, 4, 19, 9, 19, 4, 20, 9, 20, 4, 
			21, 9, 21, 4, 22, 9, 22, 4, 23, 9, 23, 4, 24, 9, 24, 4, 25, 9, 25, 4, 
			26, 9, 26, 4, 27, 9, 27, 4, 28, 9, 28, 4, 29, 9, 29, 4, 30, 9, 30, 4, 
			31, 9, 31, 4, 32, 9, 32, 4, 33, 9, 33, 4, 34, 9, 34, 4, 35, 9, 35, 4, 
			36, 9, 36, 4, 37, 9, 37, 4, 38, 9, 38, 4, 39, 9, 39, 4, 40, 9, 40, 4, 
			41, 9, 41, 4, 42, 9, 42, 4, 43, 9, 43, 4, 44, 9, 44, 4, 45, 9, 45, 4, 
			46, 9, 46, 4, 47, 9, 47, 4, 48, 9, 48, 3, 2, 3, 2, 3, 2, 5, 2, 103, 10, 
			2, 3, 3, 6, 3, 106, 10, 3, 13, 3, 14, 3, 107, 3, 3, 3, 3, 3, 4, 3, 4, 
			3, 4, 3, 4, 3, 4, 3, 4, 3, 5, 3, 5, 3, 5, 3, 5, 3, 6, 3, 6, 3, 6, 3, 
			6, 3, 6, 3, 6, 3, 7, 3, 7, 3, 7, 3, 8, 3, 8, 3, 8, 3, 8, 3, 9, 3, 9, 
			3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 
			3, 10, 3, 10, 3, 11, 7, 11, 151, 10, 11, 12, 11, 14, 11, 154, 11, 11, 
			3, 11, 3, 11, 7, 11, 158, 10, 11, 12, 11, 14, 11, 161, 11, 11, 3, 12, 
			3, 12, 3, 12, 7, 12, 166, 10, 12, 12, 12, 14, 12, 169, 11, 12, 5, 12, 
			171, 10, 12, 3, 13, 3, 13, 3, 13, 7, 13, 176, 10, 13, 12, 13, 14, 13, 
			179, 11, 13, 3, 13, 3, 13, 6, 13, 183, 10, 13, 13, 13, 14, 13, 184, 5, 
			13, 187, 10, 13, 3, 14, 3, 14, 3, 15, 3, 15, 3, 16, 3, 16, 3, 17, 3, 
			17, 3, 18, 3, 18, 3, 19, 3, 19, 3, 20, 3, 20, 3, 21, 3, 21, 3, 21, 3, 
			21, 3, 22, 3, 22, 3, 23, 3, 23, 3, 23, 3, 24, 3, 24, 3, 24, 3, 25, 3, 
			25, 3, 25, 3, 26, 3, 26, 3, 26, 3, 27, 3, 27, 3, 27, 3, 27, 3, 28, 3, 
			28, 3, 28, 3, 28, 3, 28, 3, 29, 6, 29, 231, 10, 29, 13, 29, 14, 29, 232, 
			3, 30, 3, 30, 3, 30, 3, 30, 3, 31, 3, 31, 3, 31, 3, 31, 3, 32, 6, 32, 
			244, 10, 32, 13, 32, 14, 32, 245, 3, 32, 3, 32, 3, 32, 3, 33, 3, 33, 
			3, 33, 3, 33, 3, 33, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 35, 
			3, 35, 3, 35, 3, 35, 3, 35, 3, 35, 3, 35, 3, 35, 3, 35, 3, 35, 3, 36, 
			3, 36, 3, 36, 3, 36, 3, 36, 3, 36, 3, 36, 3, 36, 3, 36, 3, 37, 3, 37, 
			3, 37, 7, 37, 284, 10, 37, 12, 37, 14, 37, 287, 11, 37, 5, 37, 289, 10, 
			37, 3, 37, 3, 37, 3, 38, 3, 38, 3, 38, 7, 38, 296, 10, 38, 12, 38, 14, 
			38, 299, 11, 38, 5, 38, 301, 10, 38, 3, 38, 3, 38, 6, 38, 305, 10, 38, 
			13, 38, 14, 38, 306, 3, 38, 3, 38, 3, 39, 3, 39, 3, 39, 3, 39, 3, 40, 
			3, 40, 3, 40, 3, 40, 3, 41, 3, 41, 3, 41, 3, 41, 3, 42, 3, 42, 3, 42, 
			3, 42, 3, 43, 3, 43, 3, 43, 3, 43, 3, 44, 3, 44, 3, 44, 3, 44, 3, 45, 
			3, 45, 3, 45, 3, 45, 3, 46, 7, 46, 340, 10, 46, 12, 46, 14, 46, 343, 
			11, 46, 3, 46, 3, 46, 7, 46, 347, 10, 46, 12, 46, 14, 46, 350, 11, 46, 
			3, 46, 3, 46, 3, 47, 3, 47, 3, 47, 3, 47, 3, 47, 3, 48, 3, 48, 3, 48, 
			3, 48, 2, 2, 49, 5, 3, 7, 4, 9, 5, 11, 6, 13, 7, 15, 8, 17, 9, 19, 10, 
			21, 11, 23, 12, 25, 13, 27, 14, 29, 15, 31, 16, 33, 17, 35, 18, 37, 19, 
			39, 20, 41, 21, 43, 22, 45, 23, 47, 24, 49, 25, 51, 26, 53, 27, 55, 28, 
			57, 29, 59, 30, 61, 2, 63, 31, 65, 2, 67, 2, 69, 2, 71, 2, 73, 2, 75, 
			2, 77, 2, 79, 2, 81, 2, 83, 2, 85, 2, 87, 2, 89, 2, 91, 2, 93, 2, 95, 
			2, 97, 2, 5, 2, 3, 4, 10, 4, 2, 12, 12, 15, 15, 4, 2, 11, 11, 34, 34, 
			3, 2, 97, 97, 3, 2, 99, 124, 6, 2, 50, 59, 67, 92, 97, 97, 99, 124, 3, 
			2, 51, 59, 3, 2, 50, 59, 6, 2, 11, 12, 15, 15, 36, 37, 94, 94, 2, 377, 
			2, 5, 3, 2, 2, 2, 2, 7, 3, 2, 2, 2, 2, 9, 3, 2, 2, 2, 2, 11, 3, 2, 2, 
			2, 2, 13, 3, 2, 2, 2, 2, 15, 3, 2, 2, 2, 2, 17, 3, 2, 2, 2, 2, 19, 3, 
			2, 2, 2, 2, 21, 3, 2, 2, 2, 2, 23, 3, 2, 2, 2, 2, 25, 3, 2, 2, 2, 2, 
			27, 3, 2, 2, 2, 2, 29, 3, 2, 2, 2, 2, 31, 3, 2, 2, 2, 2, 33, 3, 2, 2, 
			2, 2, 35, 3, 2, 2, 2, 2, 37, 3, 2, 2, 2, 2, 39, 3, 2, 2, 2, 2, 41, 3, 
			2, 2, 2, 2, 43, 3, 2, 2, 2, 2, 45, 3, 2, 2, 2, 3, 47, 3, 2, 2, 2, 3, 
			49, 3, 2, 2, 2, 3, 51, 3, 2, 2, 2, 3, 53, 3, 2, 2, 2, 3, 55, 3, 2, 2, 
			2, 3, 57, 3, 2, 2, 2, 3, 59, 3, 2, 2, 2, 3, 61, 3, 2, 2, 2, 4, 63, 3, 
			2, 2, 2, 4, 65, 3, 2, 2, 2, 4, 67, 3, 2, 2, 2, 4, 69, 3, 2, 2, 2, 4, 
			71, 3, 2, 2, 2, 4, 73, 3, 2, 2, 2, 4, 75, 3, 2, 2, 2, 4, 77, 3, 2, 2, 
			2, 4, 79, 3, 2, 2, 2, 4, 81, 3, 2, 2, 2, 4, 83, 3, 2, 2, 2, 4, 85, 3, 
			2, 2, 2, 4, 87, 3, 2, 2, 2, 4, 89, 3, 2, 2, 2, 4, 91, 3, 2, 2, 2, 4, 
			93, 3, 2, 2, 2, 4, 95, 3, 2, 2, 2, 4, 97, 3, 2, 2, 2, 5, 102, 3, 2, 2, 
			2, 7, 105, 3, 2, 2, 2, 9, 111, 3, 2, 2, 2, 11, 117, 3, 2, 2, 2, 13, 121, 
			3, 2, 2, 2, 15, 127, 3, 2, 2, 2, 17, 130, 3, 2, 2, 2, 19, 134, 3, 2, 
			2, 2, 21, 142, 3, 2, 2, 2, 23, 152, 3, 2, 2, 2, 25, 170, 3, 2, 2, 2, 
			27, 186, 3, 2, 2, 2, 29, 188, 3, 2, 2, 2, 31, 190, 3, 2, 2, 2, 33, 192, 
			3, 2, 2, 2, 35, 194, 3, 2, 2, 2, 37, 196, 3, 2, 2, 2, 39, 198, 3, 2, 
			2, 2, 41, 200, 3, 2, 2, 2, 43, 202, 3, 2, 2, 2, 45, 206, 3, 2, 2, 2, 
			47, 208, 3, 2, 2, 2, 49, 211, 3, 2, 2, 2, 51, 214, 3, 2, 2, 2, 53, 217, 
			3, 2, 2, 2, 55, 220, 3, 2, 2, 2, 57, 224, 3, 2, 2, 2, 59, 230, 3, 2, 
			2, 2, 61, 234, 3, 2, 2, 2, 63, 238, 3, 2, 2, 2, 65, 243, 3, 2, 2, 2, 
			67, 250, 3, 2, 2, 2, 69, 255, 3, 2, 2, 2, 71, 261, 3, 2, 2, 2, 73, 271, 
			3, 2, 2, 2, 75, 288, 3, 2, 2, 2, 77, 300, 3, 2, 2, 2, 79, 310, 3, 2, 
			2, 2, 81, 314, 3, 2, 2, 2, 83, 318, 3, 2, 2, 2, 85, 322, 3, 2, 2, 2, 
			87, 326, 3, 2, 2, 2, 89, 330, 3, 2, 2, 2, 91, 334, 3, 2, 2, 2, 93, 341, 
			3, 2, 2, 2, 95, 353, 3, 2, 2, 2, 97, 358, 3, 2, 2, 2, 99, 100, 7, 15, 
			2, 2, 100, 103, 7, 12, 2, 2, 101, 103, 9, 2, 2, 2, 102, 99, 3, 2, 2, 
			2, 102, 101, 3, 2, 2, 2, 103, 6, 3, 2, 2, 2, 104, 106, 9, 3, 2, 2, 105, 
			104, 3, 2, 2, 2, 106, 107, 3, 2, 2, 2, 107, 105, 3, 2, 2, 2, 107, 108, 
			3, 2, 2, 2, 108, 109, 3, 2, 2, 2, 109, 110, 8, 3, 2, 2, 110, 8, 3, 2, 
			2, 2, 111, 112, 7, 107, 2, 2, 112, 113, 7, 112, 2, 2, 113, 114, 7, 114, 
			2, 2, 114, 115, 7, 119, 2, 2, 115, 116, 7, 118, 2, 2, 116, 10, 3, 2, 
			2, 2, 117, 118, 7, 120, 2, 2, 118, 119, 7, 99, 2, 2, 119, 120, 7, 116, 
			2, 2, 120, 12, 3, 2, 2, 2, 121, 122, 7, 114, 2, 2, 122, 123, 7, 116, 
			2, 2, 123, 124, 7, 107, 2, 2, 124, 125, 7, 112, 2, 2, 125, 126, 7, 118, 
			2, 2, 126, 14, 3, 2, 2, 2, 127, 128, 7, 99, 2, 2, 128, 129, 7, 117, 2, 
			2, 129, 16, 3, 2, 2, 2, 130, 131, 7, 75, 2, 2, 131, 132, 7, 112, 2, 2, 
			132, 133, 7, 118, 2, 2, 133, 18, 3, 2, 2, 2, 134, 135, 7, 70, 2, 2, 135, 
			136, 7, 103, 2, 2, 136, 137, 7, 101, 2, 2, 137, 138, 7, 107, 2, 2, 138, 
			139, 7, 111, 2, 2, 139, 140, 7, 99, 2, 2, 140, 141, 7, 110, 2, 2, 141, 
			20, 3, 2, 2, 2, 142, 143, 7, 85, 2, 2, 143, 144, 7, 118, 2, 2, 144, 145, 
			7, 116, 2, 2, 145, 146, 7, 107, 2, 2, 146, 147, 7, 112, 2, 2, 147, 148, 
			7, 105, 2, 2, 148, 22, 3, 2, 2, 2, 149, 151, 9, 4, 2, 2, 150, 149, 3, 
			2, 2, 2, 151, 154, 3, 2, 2, 2, 152, 150, 3, 2, 2, 2, 152, 153, 3, 2, 
			2, 2, 153, 155, 3, 2, 2, 2, 154, 152, 3, 2, 2, 2, 155, 159, 9, 5, 2, 
			2, 156, 158, 9, 6, 2, 2, 157, 156, 3, 2, 2, 2, 158, 161, 3, 2, 2, 2, 
			159, 157, 3, 2, 2, 2, 159, 160, 3, 2, 2, 2, 160, 24, 3, 2, 2, 2, 161, 
			159, 3, 2, 2, 2, 162, 171, 7, 50, 2, 2, 163, 167, 9, 7, 2, 2, 164, 166, 
			9, 8, 2, 2, 165, 164, 3, 2, 2, 2, 166, 169, 3, 2, 2, 2, 167, 165, 3, 
			2, 2, 2, 167, 168, 3, 2, 2, 2, 168, 171, 3, 2, 2, 2, 169, 167, 3, 2, 
			2, 2, 170, 162, 3, 2, 2, 2, 170, 163, 3, 2, 2, 2, 171, 26, 3, 2, 2, 2, 
			172, 187, 7, 50, 2, 2, 173, 177, 9, 7, 2, 2, 174, 176, 9, 8, 2, 2, 175, 
			174, 3, 2, 2, 2, 176, 179, 3, 2, 2, 2, 177, 175, 3, 2, 2, 2, 177, 178, 
			3, 2, 2, 2, 178, 180, 3, 2, 2, 2, 179, 177, 3, 2, 2, 2, 180, 182, 7, 
			48, 2, 2, 181, 183, 9, 8, 2, 2, 182, 181, 3, 2, 2, 2, 183, 184, 3, 2, 
			2, 2, 184, 182, 3, 2, 2, 2, 184, 185, 3, 2, 2, 2, 185, 187, 3, 2, 2, 
			2, 186, 172, 3, 2, 2, 2, 186, 173, 3, 2, 2, 2, 187, 28, 3, 2, 2, 2, 188, 
			189, 7, 45, 2, 2, 189, 30, 3, 2, 2, 2, 190, 191, 7, 47, 2, 2, 191, 32, 
			3, 2, 2, 2, 192, 193, 7, 44, 2, 2, 193, 34, 3, 2, 2, 2, 194, 195, 7, 
			49, 2, 2, 195, 36, 3, 2, 2, 2, 196, 197, 7, 63, 2, 2, 197, 38, 3, 2, 
			2, 2, 198, 199, 7, 42, 2, 2, 199, 40, 3, 2, 2, 2, 200, 201, 7, 43, 2, 
			2, 201, 42, 3, 2, 2, 2, 202, 203, 7, 36, 2, 2, 203, 204, 3, 2, 2, 2, 
			204, 205, 8, 21, 3, 2, 205, 44, 3, 2, 2, 2, 206, 207, 11, 2, 2, 2, 207, 
			46, 3, 2, 2, 2, 208, 209, 7, 94, 2, 2, 209, 210, 7, 36, 2, 2, 210, 48, 
			3, 2, 2, 2, 211, 212, 7, 94, 2, 2, 212, 213, 7, 94, 2, 2, 213, 50, 3, 
			2, 2, 2, 214, 215, 7, 94, 2, 2, 215, 216, 7, 112, 2, 2, 216, 52, 3, 2, 
			2, 2, 217, 218, 7, 94, 2, 2, 218, 219, 7, 37, 2, 2, 219, 54, 3, 2, 2, 
			2, 220, 221, 7, 36, 2, 2, 221, 222, 3, 2, 2, 2, 222, 223, 8, 27, 4, 2, 
			223, 56, 3, 2, 2, 2, 224, 225, 7, 37, 2, 2, 225, 226, 7, 125, 2, 2, 226, 
			227, 3, 2, 2, 2, 227, 228, 8, 28, 5, 2, 228, 58, 3, 2, 2, 2, 229, 231, 
			10, 9, 2, 2, 230, 229, 3, 2, 2, 2, 231, 232, 3, 2, 2, 2, 232, 230, 3, 
			2, 2, 2, 232, 233, 3, 2, 2, 2, 233, 60, 3, 2, 2, 2, 234, 235, 11, 2, 
			2, 2, 235, 236, 3, 2, 2, 2, 236, 237, 8, 30, 6, 2, 237, 62, 3, 2, 2, 
			2, 238, 239, 7, 127, 2, 2, 239, 240, 3, 2, 2, 2, 240, 241, 8, 31, 4, 
			2, 241, 64, 3, 2, 2, 2, 242, 244, 9, 3, 2, 2, 243, 242, 3, 2, 2, 2, 244, 
			245, 3, 2, 2, 2, 245, 243, 3, 2, 2, 2, 245, 246, 3, 2, 2, 2, 246, 247, 
			3, 2, 2, 2, 247, 248, 8, 32, 2, 2, 248, 249, 8, 32, 7, 2, 249, 66, 3, 
			2, 2, 2, 250, 251, 7, 99, 2, 2, 251, 252, 7, 117, 2, 2, 252, 253, 3, 
			2, 2, 2, 253, 254, 8, 33, 8, 2, 254, 68, 3, 2, 2, 2, 255, 256, 7, 75, 
			2, 2, 256, 257, 7, 112, 2, 2, 257, 258, 7, 118, 2, 2, 258, 259, 3, 2, 
			2, 2, 259, 260, 8, 34, 9, 2, 260, 70, 3, 2, 2, 2, 261, 262, 7, 70, 2, 
			2, 262, 263, 7, 103, 2, 2, 263, 264, 7, 101, 2, 2, 264, 265, 7, 107, 
			2, 2, 265, 266, 7, 111, 2, 2, 266, 267, 7, 99, 2, 2, 267, 268, 7, 110, 
			2, 2, 268, 269, 3, 2, 2, 2, 269, 270, 8, 35, 10, 2, 270, 72, 3, 2, 2, 
			2, 271, 272, 7, 85, 2, 2, 272, 273, 7, 118, 2, 2, 273, 274, 7, 116, 2, 
			2, 274, 275, 7, 107, 2, 2, 275, 276, 7, 112, 2, 2, 276, 277, 7, 105, 
			2, 2, 277, 278, 3, 2, 2, 2, 278, 279, 8, 36, 11, 2, 279, 74, 3, 2, 2, 
			2, 280, 289, 7, 50, 2, 2, 281, 285, 9, 7, 2, 2, 282, 284, 9, 8, 2, 2, 
			283, 282, 3, 2, 2, 2, 284, 287, 3, 2, 2, 2, 285, 283, 3, 2, 2, 2, 285, 
			286, 3, 2, 2, 2, 286, 289, 3, 2, 2, 2, 287, 285, 3, 2, 2, 2, 288, 280, 
			3, 2, 2, 2, 288, 281, 3, 2, 2, 2, 289, 290, 3, 2, 2, 2, 290, 291, 8, 
			37, 12, 2, 291, 76, 3, 2, 2, 2, 292, 301, 7, 50, 2, 2, 293, 297, 9, 7, 
			2, 2, 294, 296, 9, 8, 2, 2, 295, 294, 3, 2, 2, 2, 296, 299, 3, 2, 2, 
			2, 297, 295, 3, 2, 2, 2, 297, 298, 3, 2, 2, 2, 298, 301, 3, 2, 2, 2, 
			299, 297, 3, 2, 2, 2, 300, 292, 3, 2, 2, 2, 300, 293, 3, 2, 2, 2, 301, 
			302, 3, 2, 2, 2, 302, 304, 7, 48, 2, 2, 303, 305, 9, 8, 2, 2, 304, 303, 
			3, 2, 2, 2, 305, 306, 3, 2, 2, 2, 306, 304, 3, 2, 2, 2, 306, 307, 3, 
			2, 2, 2, 307, 308, 3, 2, 2, 2, 308, 309, 8, 38, 13, 2, 309, 78, 3, 2, 
			2, 2, 310, 311, 7, 45, 2, 2, 311, 312, 3, 2, 2, 2, 312, 313, 8, 39, 14, 
			2, 313, 80, 3, 2, 2, 2, 314, 315, 7, 47, 2, 2, 315, 316, 3, 2, 2, 2, 
			316, 317, 8, 40, 15, 2, 317, 82, 3, 2, 2, 2, 318, 319, 7, 44, 2, 2, 319, 
			320, 3, 2, 2, 2, 320, 321, 8, 41, 16, 2, 321, 84, 3, 2, 2, 2, 322, 323, 
			7, 49, 2, 2, 323, 324, 3, 2, 2, 2, 324, 325, 8, 42, 17, 2, 325, 86, 3, 
			2, 2, 2, 326, 327, 7, 63, 2, 2, 327, 328, 3, 2, 2, 2, 328, 329, 8, 43, 
			18, 2, 329, 88, 3, 2, 2, 2, 330, 331, 7, 42, 2, 2, 331, 332, 3, 2, 2, 
			2, 332, 333, 8, 44, 19, 2, 333, 90, 3, 2, 2, 2, 334, 335, 7, 43, 2, 2, 
			335, 336, 3, 2, 2, 2, 336, 337, 8, 45, 20, 2, 337, 92, 3, 2, 2, 2, 338, 
			340, 9, 4, 2, 2, 339, 338, 3, 2, 2, 2, 340, 343, 3, 2, 2, 2, 341, 339, 
			3, 2, 2, 2, 341, 342, 3, 2, 2, 2, 342, 344, 3, 2, 2, 2, 343, 341, 3, 
			2, 2, 2, 344, 348, 9, 5, 2, 2, 345, 347, 9, 6, 2, 2, 346, 345, 3, 2, 
			2, 2, 347, 350, 3, 2, 2, 2, 348, 346, 3, 2, 2, 2, 348, 349, 3, 2, 2, 
			2, 349, 351, 3, 2, 2, 2, 350, 348, 3, 2, 2, 2, 351, 352, 8, 46, 21, 2, 
			352, 94, 3, 2, 2, 2, 353, 354, 7, 36, 2, 2, 354, 355, 3, 2, 2, 2, 355, 
			356, 8, 47, 22, 2, 356, 357, 8, 47, 3, 2, 357, 96, 3, 2, 2, 2, 358, 359, 
			11, 2, 2, 2, 359, 360, 3, 2, 2, 2, 360, 361, 8, 48, 6, 2, 361, 98, 3, 
			2, 2, 2, 23, 2, 3, 4, 102, 107, 152, 159, 167, 170, 177, 184, 186, 232, 
			245, 285, 288, 297, 300, 306, 341, 348, 23, 2, 4, 2, 7, 3, 2, 6, 2, 2, 
			7, 4, 2, 9, 23, 2, 9, 4, 2, 9, 8, 2, 9, 9, 2, 9, 10, 2, 9, 11, 2, 9, 
			13, 2, 9, 14, 2, 9, 15, 2, 9, 16, 2, 9, 17, 2, 9, 18, 2, 9, 19, 2, 9, 
			20, 2, 9, 21, 2, 9, 12, 2, 9, 22, 2)
		val ATN = ATNDeserializer().deserializeIntegers(serializedIntegersATN)
		init {
			decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
				DFA(ATN.getDecisionState(it)!!, it)
			})


		}
	}

    enum class Tokens(val id: Int) {
	    NEWLINE(1),
	    WS(2),
	    INPUT(3),
	    VAR(4),
	    PRINT(5),
	    AS(6),
	    INT(7),
	    DECIMAL(8),
	    STRING(9),
	    ID(10),
	    INTLIT(11),
	    DECLIT(12),
	    PLUS(13),
	    MINUS(14),
	    ASTERISK(15),
	    DIVISION(16),
	    ASSIGN(17),
	    LPAREN(18),
	    RPAREN(19),
	    STRING_OPEN(20),
	    UNMATCHED(21),
	    ESCAPE_STRING_DELIMITER(22),
	    ESCAPE_SLASH(23),
	    ESCAPE_NEWLINE(24),
	    ESCAPE_SHARP(25),
	    STRING_CLOSE(26),
	    INTERPOLATION_OPEN(27),
	    STRING_CONTENT(28),
	    INTERPOLATION_CLOSE(29)
    }

	enum class Channels(val id: Int) {
		DEFAULT_TOKEN_CHANNEL(0),
		HIDDEN(1),
		WHITESPACE(2)
	}

	enum class Modes(val id: Int) {
		DEFAULT_MODE(0),
		MODE_IN_STRING(1),
		MODE_IN_INTERPOLATION(2)
	}

	enum class Rules {
	    NEWLINE,
	    WS,
	    INPUT,
	    VAR,
	    PRINT,
	    AS,
	    INT,
	    DECIMAL,
	    STRING,
	    ID,
	    INTLIT,
	    DECLIT,
	    PLUS,
	    MINUS,
	    ASTERISK,
	    DIVISION,
	    ASSIGN,
	    LPAREN,
	    RPAREN,
	    STRING_OPEN,
	    UNMATCHED,
	    ESCAPE_STRING_DELIMITER,
	    ESCAPE_SLASH,
	    ESCAPE_NEWLINE,
	    ESCAPE_SHARP,
	    STRING_CLOSE,
	    INTERPOLATION_OPEN,
	    STRING_CONTENT,
	    STR_UNMATCHED,
	    INTERPOLATION_CLOSE,
	    INTERP_WS,
	    INTERP_AS,
	    INTERP_INT,
	    INTERP_DECIMAL,
	    INTERP_STRING,
	    INTERP_INTLIT,
	    INTERP_DECLIT,
	    INTERP_PLUS,
	    INTERP_MINUS,
	    INTERP_ASTERISK,
	    INTERP_DIVISION,
	    INTERP_ASSIGN,
	    INTERP_LPAREN,
	    INTERP_RPAREN,
	    INTERP_ID,
	    INTERP_STRING_OPEN,
	    INTERP_UNMATCHED
	}


	init {
		this.interpreter = LexerATNSimulator(this, ATN, decisionToDFA as Array<DFA?>, sharedContextCache)
	}

}