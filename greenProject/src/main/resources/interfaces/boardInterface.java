package interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.repository.model.BoardRepositor;

@Mapper
public interface boardInterface {

	public List<BoardRepositor> findByBoardList();
	
}
