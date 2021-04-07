package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/*
 * 
 *  client로 부터 들어오는 요청을 가로채어서 '인코딩 작업'을 필터링으로 연결
 *  이후 필터 뒷부분에 나오는 모든 컴포넌트들은 여기서 작업한 필터링 작업의 효과를 얻게된다. 
 * 
 * 
 */


@WebFilter(
		value= {"/*"}
		
		
		
		)
public class EncodingFilter implements Filter {

    
    public EncodingFilter() {
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 양방향 한글처리
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		// 서버상의 다음 컴포넌트에게 계속 필터링한 작업이 연결되도록 하기 위한 작업.
		chain.doFilter(request, response);
	}


	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
