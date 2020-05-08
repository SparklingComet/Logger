package com.lorenzocalza.logger;

import java.io.PrintStream;
import java.util.Date;

@SuppressWarnings("unused")
public class Logger {

	private LoggerMode mode;
	private boolean time;
	private boolean date;
	private PrintStream out;
	private String name;

	private boolean debug;

	private MessageFormat msgFormat = (name, datestr, timestr, message, custom) -> {
		return String.format("[%s] %s%s%s%s : %s",
				mode.name(),
				name != null ? "[" + name + "] " : "",
				date ? datestr : "",
				time && date ? ' ' : "",
				time ? timestr : "",
				message);
	};

	public Logger(LoggerMode mode) {
		this.mode = mode;
		this.time = this.date = false;
		this.out = System.out;
	}

	public Logger(LoggerMode mode, String name) {
		this.mode = mode;
		this.time = this.date = false;
		this.out = System.out;
		this.name = name;
	}

	public Logger(LoggerMode mode, boolean time) {
		this.mode = mode;
		this.time = time;
		this.date = false;
		this.out = System.out;
	}

	public Logger(LoggerMode mode, boolean time, String name) {
		this.mode = mode;
		this.time = time;
		this.date = false;
		this.out = System.out;
		this.name = name;
	}

	public Logger(LoggerMode mode, boolean time, boolean date) {
		this.mode = mode;
		this.time = time;
		this.date = date;
		this.out = System.out;
	}

	public Logger(LoggerMode mode, boolean time, boolean date, String name) {
		this.mode = mode;
		this.time = time;
		this.date = date;
		this.out = System.out;
		this.name = name;
	}

	public Logger(LoggerMode mode, boolean time, boolean date, PrintStream out) {
		this.mode = mode;
		this.time = time;
		this.date = date;
		this.out = out;
		this.out = System.out;
	}

	public Logger(LoggerMode mode, boolean time, boolean date, String name, PrintStream out) {
		this.mode = mode;
		this.time = time;
		this.date = date;
		this.out = out;
		this.out = System.out;
		this.name = name;
	}

	protected String header(LoggerMode mode, String msg) {
		String datetime = new Date().toString();
		String datestr = datetime.substring(0, 11) + datetime.substring(datetime.length() - 4);
		String timestr = datetime.substring(11, datetime.length() - 5);
		return msgFormat.message(mode.name(), datestr, timestr, msg,null);
	}

	public void log(String msg) {
		log(msg, mode, false);
	}

	public void log(String msg, LoggerMode mode) {
		log(msg, mode, false);
	}

	public void log(String msg, boolean debug) {
		log(msg, mode, false);
	}

	public void log(String msg, LoggerMode mode, boolean debug) {
		if (!debug && mode == LoggerMode.DEBUG);
		else out.println(header(mode, msg));
	}

	public LoggerMode getMode() {
		return mode;
	}

	public void setMode(LoggerMode mode) {
		this.mode = mode;
	}

	public boolean isDate() {
		return date;
	}

	public void setDate(boolean date) {
		this.date = date;
	}

	public boolean isTime() {
		return time;
	}

	public void setTime(boolean time) {
		this.time = time;
	}

	public PrintStream getOut() {
		return out;
	}

	public void setOut(PrintStream out) {
		this.out = out;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MessageFormat getMsgFormat() {
		return msgFormat;
	}

	public void setMsgFormat(MessageFormat msgFormat) {
		if (msgFormat == null) throw new IllegalArgumentException("MessageFormat cannot be null!");
		this.msgFormat = msgFormat;
	}
}
