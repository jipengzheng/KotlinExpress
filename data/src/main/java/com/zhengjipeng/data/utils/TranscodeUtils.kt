package com.zhengjipeng.data.utils

import java.io.UnsupportedEncodingException
import java.security.MessageDigest


/**
 * Created by zhengjipeng on 2017/6/21.
 */
object TranscodeUtils {

    /**
     * base64编码
     * @param str 内容
     * *
     * @param charset 编码方式
     * *
     * @throws UnsupportedEncodingException
     */
    @Throws(UnsupportedEncodingException::class)
    fun base64(str: String, charset: String): String {
        val encoded = base64Encode(str.toByteArray(charset(charset)))
        return encoded
    }

    /**
     * Sign签名生成
     * @param content 内容
     * *
     * @param keyValue Appkey
     * *
     * @param charset 编码方式
     * *
     * @throws UnsupportedEncodingException ,Exception
     * *
     * @return DataSign签名
     */
    @Throws(UnsupportedEncodingException::class, Exception::class)
    fun encrypt(content: String, keyValue: String?, charset: String): String {
        if (keyValue != null) {
            return base64(MD5(content + keyValue, charset), charset)
        }
        return base64(MD5(content, charset), charset)
    }

    /**
     * MD5加密
     * @param str 内容
     * *
     * @param charset 编码方式
     * *
     * @throws Exception
     */
    @Throws(Exception::class)
    fun MD5(str: String, charset: String): String {
        val md = MessageDigest.getInstance("MD5")
        md.update(str.toByteArray(charset(charset)))
        val result = md.digest()
        val sb = StringBuffer(32)
        for (i in result.indices) {
            val `val` = result[i].toInt() and 0xff
            if (`val` <= 0xf) {
                sb.append("0")
            }
            sb.append(Integer.toHexString(`val`))
        }
        return sb.toString().toLowerCase()
    }

    val base64EncodeChars = arrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
            'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
            'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z', '0', '1', '2', '3',
            '4', '5', '6', '7', '8', '9', '+', '/')

    fun base64Encode(bytes: ByteArray): String {
        val sb = StringBuffer()
        val len = bytes.size
        var i = 0
        var b1: Int
        var b2: Int
        var b3: Int
        while (i < len) {
            b1 = bytes[i++].toInt() and 0xff
            if (i == len) {
                sb.append(base64EncodeChars[b1.ushr(2)])
                sb.append(base64EncodeChars[b1 and 0x3 shl 4])
                sb.append("==")
                break
            }
            b2 = bytes[i++].toInt() and 0xff
            if (i == len) {
                sb.append(base64EncodeChars[b1.ushr(2)])
                sb.append(base64EncodeChars[b1 and 0x03 shl 4 or (b2 and 0xf0).ushr(4)])
                sb.append(base64EncodeChars[b2 and 0x0f shl 2])
                sb.append("=")
                break
            }
            b3 = bytes[i++].toInt() and 0xff
            sb.append(base64EncodeChars[b1.ushr(2)])
            sb.append(base64EncodeChars[b1 and 0x03 shl 4 or (b2 and 0xf0).ushr(4)])
            sb.append(base64EncodeChars[b2 and 0x0f shl 2 or (b3 and 0xc0).ushr(6)])
            sb.append(base64EncodeChars[b3 and 0x3f])
        }
        return sb.toString()
    }

}