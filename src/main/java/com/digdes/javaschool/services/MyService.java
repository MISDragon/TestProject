package com.digdes.javaschool.services;

import com.digdes.javaschool.entity.Log;
import java.util.List;

public interface MyService {

	Log addLog(Log log);

	List<Log> getLogs();

	void deleteLog(Log log);
}
