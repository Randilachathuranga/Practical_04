object CaesarCipher {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    def encrypt(text: String, shift: Int): String = {
        text.toUpperCase.map { char =>
            if (alphabet.contains(char)) {
                val newIndex = (alphabet.indexOf(char) + shift) % alphabet.length
                alphabet(newIndex)
            } else {
                char
            }
        }
    }

    def decrypt(text: String, shift: Int): String = {
        text.toUpperCase.map { char =>
            if (alphabet.contains(char)) {
                val newIndex = (alphabet.indexOf(char) - shift + alphabet.length) % alphabet.length
                alphabet(newIndex)
            } else {
                char
            }
        }
    }

    def cipher(text: String, shift: Int, function: (String, Int) => String): String = {
        function(text, shift)
    }

    def main(args: Array[String]): Unit = {
        val newtext = "Hello World!"
        val shift = 3

        val encrypted = cipher(newtext, shift, encrypt)
        println(s"Encrypted: $encrypted")

        val decrypted = cipher(encrypted, shift, decrypt)
        println(s"Decrypted: $decrypted")
    }
}