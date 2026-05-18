package com.analyzer.probes

import java.security.MessageDigest
import java.sql.Connection
import java.sql.Statement

object SecurityProbes {
    // PROBE-SEC-001
    const val API_KEY: String = "AKIAIOSFODNN7EXAMPLE"

    // PROBE-SEC-002
    fun sqlFindUser(conn: Connection, name: String) {
        val stmt: Statement = conn.createStatement()
        stmt.executeQuery("SELECT * FROM users WHERE name = '$name'")
    }

    // PROBE-SEC-003
    fun ping(host: String) {
        Runtime.getRuntime().exec(arrayOf("sh", "-c", "ping -c 1 $host"))
    }

    // PROBE-SEC-006
    fun md5(input: String): ByteArray {
        val md = MessageDigest.getInstance("MD5")
        return md.digest(input.toByteArray())
    }
}
