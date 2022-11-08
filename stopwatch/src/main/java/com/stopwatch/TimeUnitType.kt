package com.stopwatch

import com.stopwatch.Constants.Symbols.SYMBOL_HOURS
import com.stopwatch.Constants.Symbols.SYMBOL_MINUTES
import com.stopwatch.Constants.Symbols.SYMBOL_REM_MILLIS
import com.stopwatch.Constants.Symbols.SYMBOL_SECONDS

enum class TimeUnitType(val value: Char) {
  HOURS(SYMBOL_HOURS),
  MINUTES(SYMBOL_MINUTES),
  SECONDS(SYMBOL_SECONDS),
  R_MILLISECONDS(SYMBOL_REM_MILLIS);
}
